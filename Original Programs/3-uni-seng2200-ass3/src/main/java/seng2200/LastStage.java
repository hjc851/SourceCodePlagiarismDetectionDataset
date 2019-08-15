/*
 * LastStage.java
 * author: Jonathan Tabac II
 * 
 */ 
package seng2200;

public class LastStage extends ProductionStage
{
    private InterStageStorage input;
    private ProductionStat output;

    // LastStage
    LastStage(String prodName, InterStageStorage input, double mean, double range, ProductionStat prodStat, Scheduler sched)
    {
        super(prodName, mean, range, sched);
        this.input = input;
        this.output = prodStat;
    }

    // Pre-req: check if stage is currently busy processing an item
    // before calling this function
    @Override
    public double processItem(double currentTime)
    {
        // refer to the final output statistics
        double duration = 0;

        if (this.currentState instanceof StarveState)
        {
            if (this.input.isEmpty())
            {
                // Continue StarveState
                duration = -1;
            }
            else
            {
                // BusyState
                this.processItem = this.input.deque(currentTime);
                this.processItem.setEntryTime(currentTime);

                duration = this.calculateProdDuration();

                this.currentState = new BusyState();

                this.jobSched.addNewJob(duration, this);
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
        this.incStateDur(currentTime);

        // Finish
        this.processItem.setExitTime(currentTime);
        this.processItem.stampTime(this.prodName);

        // put the item in ProductionStatClass

        this.output.add(this.processItem);


        if (this.input.isEmpty())
        {
            this.processItem = null;
            this.currentState = new StarveState();
        }
        else
        {
            double duration = 0;

            // Add new job
            // notify leftProd
            this.processItem = this.input.deque(currentTime);
            this.processItem.setEntryTime(currentTime);

            duration = this.calculateProdDuration();

            this.currentState = new BusyState();

            this.jobSched.addNewJob(duration, this);

            this.notifyLeftProd(currentTime);
        }
    }

}