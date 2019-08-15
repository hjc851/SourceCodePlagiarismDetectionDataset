/*
 * Job.java
 * author: Jonathan Tabac II
 * 
 */ 
package seng2200;

public class Job
{
    private double duration;
    private double remainingDuration;
    private ProductionStage stage;

    // Constructor
    Job(double duration, ProductionStage stage)
    {
        this.duration = duration;
        this.remainingDuration = duration;
        this.stage = stage;
    }

    public double getduration()
    {
        return this.duration;
    }

    public double getRemainingDuration()
    {
        return this.remainingDuration;
    }

    public void finishJob(double currentTime)
    {
        // call the finish of the stage
        this.stage.finishItem(currentTime);
    }

    public ProductionStage getStage()
    {
        return this.stage;
    }

    public void updateRemainingDuration(double duration)
    {
        this.remainingDuration -= duration;
    }

}