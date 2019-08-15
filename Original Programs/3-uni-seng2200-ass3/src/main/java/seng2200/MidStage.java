/*
 * MidStage.java
 * author: Jonathan Tabac II
 * 
 */ 
package seng2200;

public class MidStage extends ProductionStage
{
    private InterStageStorage input;
    private InterStageStorage output;

    // MidStage
    MidStage(String prodName,
             InterStageStorage input,
             InterStageStorage output,
             double mean,
             double range,
             Scheduler sched)
    {
        super(prodName, mean, range, sched);
        this.input = input;
        this.output = output;
    }

    // Time-bound
    @Override
    public double processItem(double currentTime)
    {
        double duration = 0;

        if (this.currentState instanceof StarveState)
        {
            if (this.input.isEmpty())
            {
                // Continue Starving
                duration = -1;
            }
            else
            {
                // transition to BusyState
                this.processItem = this.input.deque(currentTime);
                this.processItem.setEntryTime(currentTime);

                duration = this.calculateProdDuration();

                this.currentState = new BusyState();
                
                // directly call the scheduler's addNewJob
                this.jobSched.addNewJob(duration, this);
            }
        }
        else if (this.currentState instanceof BlockState)
        {
            if (this.output.isFull())
            {
                // Continue blocking
                duration = -1;
            }
            else
            {
                // Unblock
                this.processItem.setExitTime(currentTime);
                this.processItem.stampTime(this.prodName);
                this.output.enque(this.processItem, currentTime);

                this.processItem = null;

                if (this.input.isEmpty())
                {
                    // transition to StarveState
                    duration = -1;
                    this.currentState = new StarveState();
                }
                else
                {
                    // transition to BusyState
                    this.processItem = this.input.deque(currentTime);
                    this.processItem.setEntryTime(currentTime);

                    duration = this.calculateProdDuration();
                    this.jobSched.addNewJob(duration, this);

                    this.currentState = new BusyState();

                }

            }
        }
        else
        {
            // Continue BusyState
            duration = -1;
        }
        return duration;
    }

    // Time-bound
    @Override
    public void finishItem(double currentTime)
    {
        // Increase currentState's duration
        this.incStateDur(currentTime);

        if (this.output.isFull())
        {
            this.currentState = new BlockState();
        }
        else
        {
            // Finish item
            this.processItem.setExitTime(currentTime);
            this.processItem.stampTime(this.prodName);
            this.output.enque(this.processItem, currentTime);

            // Notify after to unstarve
            this.notifyRightProd(currentTime);

            if (this.input.isEmpty())
            {
                // transition to StarveState
                this.processItem = null;
                this.currentState = new StarveState();
            }
            else
            {
                double duration = 0;

                // transition to BusyState
                this.processItem = this.input.deque(currentTime);
                this.processItem.setEntryTime(currentTime);

                duration = this.calculateProdDuration();

                this.jobSched.addNewJob(duration, this);

                this.currentState = new BusyState();

                // Notify before to unblock
                this.notifyLeftProd(currentTime);
            }
        }

    }

}