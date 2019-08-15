package seng2200;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Scheduler.java
 * author: Jonathan Tabac II
 * 
 */ 

public class Scheduler
{
    private Queue<Job> jobQueue;
    private double curTime;

    // Constructor
    Scheduler(int maxQ)
    {
        this.jobQueue = new PriorityQueue<Job>(maxQ, new JobComparator());
        this.curTime = 0;
    }

    public void addNewJob(double duration, ProductionStage stage)
    {
        jobQueue.add(new Job(duration, stage));
    }

    public ProductionStage performNextJob()
    {
        Job topJob = this.jobQueue.poll();
        // Caution: Update time first, before finishing the job
        // because finishJob relies on Scheduler's curTime!
        this.curTime += topJob.getRemainingDuration();

        // WARNING: Update the current jobs in Queue First
        //          Before calling finishJob()
        //          To avoid updating remaining duration of new jobs
        //          Created by finishJob, when the prodStage performs
        //          Its left and right unblock/unstarve notification
        for (Job j : this.jobQueue)
        {
            // update the remainingDuration of the remainig
            // jobs to push them up in the queue
            j.updateRemainingDuration(topJob.getRemainingDuration());
        }

        // Finish the Job
        // WARNING: Performs left and Right notification
        //          Resulting in possibly new jobs added to queue
        topJob.finishJob(this.curTime);

        return topJob.getStage();
    }

    public double getCurrentTime()
    {
        return this.curTime;
    }

    public String getPrintFormat()
    {
        return "%-15s%-15s";
    }

    public String getContents()
    {
        StringBuilder sb = new StringBuilder();
        String prodName;
        double remDur;

        for (Job j : this.jobQueue)
        {
            prodName = j.getStage().getProdName();
            remDur = j.getRemainingDuration();
            sb.append(String.format(this.getPrintFormat(), prodName, remDur));
            sb.append("\n");
        }
        return sb.toString();
    }

    public int getJobCount()
    {
        return this.jobQueue.size();
    }
}