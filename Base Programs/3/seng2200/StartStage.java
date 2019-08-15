/*
 * StartStage.java
 * author: Jonathan Tabac II
 * 
 */ 
package seng2200;

public class StartStage extends ProductionStage
{
    private InterStageStorage output;

    // Constructor
    StartStage(String prodName, InterStageStorage output, double mean, double range, Scheduler sched)
    {
        super(prodName, mean, range, sched);
        this.output = output;
    }

    // Pre-req: check if stage is currently busy processing an item
    // before calling this function
    @Override
    public double processItem(double currentTime)
    {
        double duration = 0;

        if (this.currentState instanceof StarveState)
        {

            // transition to BusyState
            duration = this.calculateProdDuration();

            this.processItem = new Item();
            this.processItem.setEntryTime(currentTime);

            this.currentState = new BusyState();

            // directly call scheduler to add a job
            this.jobSched.addNewJob(duration, this);

            this.itemCount += 1;
        }
        else if (this.currentState instanceof BlockState)
        {
            if (this.output.isFull())
            {
                // Continue BlockState
                duration = -1;
            }
            else
            {
                // Transition to BusyState
                this.processItem.setExitTime(currentTime);
                this.processItem.stampTime(this.prodName);

                this.output.enque(this.processItem, currentTime);

                this.processItem = new Item();
                this.processItem.setEntryTime(currentTime);

                duration = this.calculateProdDuration();
                // directly call scheduler to add a job
                this.jobSched.addNewJob(duration, this);

                this.currentState = new BusyState();
                this.itemCount += 1;
            }
        }
        else
        {
            // Continue BusyState
            duration = -1;
        }
        return duration;
    }

    @Override
    public void finishItem(double currentTime)
    {
        // Increase currentState's duration
        this.incStateDur(currentTime);

        if (this.output.isFull())
        {
            // transition to BlockState
            this.currentState = new BlockState();
        }
        else
        {
            // Finish item
            this.processItem.setExitTime(currentTime);
            this.processItem.stampTime(this.prodName);
            this.output.enque(this.processItem, currentTime);

            this.processItem = null;
            this.currentState = new StarveState();

            // Notify rightProd to Unstarve
            this.notifyRightProd(currentTime);
        }
    }

}