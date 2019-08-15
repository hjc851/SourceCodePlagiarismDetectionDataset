/*
 * ProductionStage.java
 * author: Jonathan Tabac II
 * 
 */ 
package seng2200;
import java.util.Random;
import java.util.List;
import java.util.LinkedList;

public abstract class ProductionStage
{
    // Add flags for setting the state of the production stage
    // implement prod stage as state machine pattern

    protected Item processItem;
    protected double mean;
    protected double range;
    protected Random r;

    protected List<State> events;
    protected State currentState;
    protected double prevTime;

    protected String prodName;

    // For StartStage use only
    protected int itemCount;

    protected List<ProductionStage> leftProd;
    protected List<ProductionStage> rightProd;

    protected Scheduler jobSched;

    abstract public double processItem(double currentTime);
    abstract public void finishItem(double currentTime);

    // Constructor
    ProductionStage()
    {
        this.mean = 0;
        this.range = 0;
        this.processItem = null;
        this.r = new Random();
        this.events = new LinkedList<State>();
        this.currentState = new StarveState();
        this.prevTime = 0;
        this.prodName = "";
        this.itemCount = 0;
        this.jobSched = null;
        this.leftProd = new LinkedList<ProductionStage>();
        this.rightProd = new LinkedList<ProductionStage>();
    }

    ProductionStage(String prodName, double mean, double range, Scheduler sched)
    {
        this.mean = mean;
        this.range = range;
        this.processItem = null;
        this.r = new Random();
        this.events = new LinkedList<State>();
        this.currentState = new StarveState();
        this.prevTime = 0;
        this.prodName = prodName;
        this.itemCount = 0;
        this.jobSched = sched;
        this.leftProd = new LinkedList<ProductionStage>();
        this.rightProd = new LinkedList<ProductionStage>();
    }

    protected double calculateProdDuration()
    {
        // calculates the production duration for the current item
        // P = M + (N * (d - 0.5))
        // M - mean
        // N - range
        // d - range
        return mean + (range * (r.nextDouble() - 0.5));
    }

    public int getTotalItemsCreated()
    {
        return this.itemCount;
    }

    public String getProdName()
    {
        return this.prodName;
    }

    public String getState()
    {
        return this.currentState.toString();
    }

    public double getTotalTimeOperation()
    {
        double total = 0;
        for (State s : this.events)
        {
            total += s.getDuration();
        }
        return total;
    }

    // Increase current state's duration
    public void incStateDur(double currentTime)
    {
        if (this.currentState instanceof StarveState)
        {
            this.events.add(new StarveState(currentTime - this.prevTime));
        }
        else if (this.currentState instanceof BlockState)
        {

            this.events.add(new BlockState(currentTime - this.prevTime));
        }
        else
        {

            this.events.add(new BusyState(currentTime - this.prevTime));
        }
        this.prevTime = currentTime;
    }

    public void setLeftProd(ProductionStage left)
    {
        this.leftProd.add(left);
    }

    public void setRightProd(ProductionStage right)
    {
        this.rightProd.add(right);
    }

    protected void notifyLeftProd(double currentTime)
    {
        for (ProductionStage s : this.leftProd)
        {
            s.processItem(currentTime);
        }
    }

    protected void notifyRightProd(double currentTime)
    {
        for (ProductionStage s : this.rightProd)
        {
            s.processItem(currentTime);
        }
    }

    public double getStageTotalBlocked()
    {
        double totalDuration = 0;
        double blockedDuration = 0;

        for (State s : this.events)
        {
            totalDuration += s.getDuration();
            if (s instanceof BlockState)
            {
                blockedDuration += s.getDuration();
            }
        }
        // return (totalDuration == 0)?0:(blockedDuration / totalDuration);
        return blockedDuration;
    }

    public double getStageAvgProduction()
    {
        double totalDuration = 0;
        double busyDuration = 0;

        for (State s : this.events)
        {
            totalDuration += s.getDuration();
            if (s instanceof BusyState)
            {
                busyDuration += s.getDuration();
            }
        }
        return (totalDuration == 0)?0:(busyDuration / totalDuration) * 100;
        // return busyDuration;
    }

    public double getStageTotalStarve()
    {
        double totalDuration = 0;
        double starveDuration = 0;

        for (State s : this.events)
        {
            totalDuration += s.getDuration();
            if (s instanceof StarveState)
            {
                starveDuration += s.getDuration();
            }
        }
        // return (totalDuration == 0)?0:(starveDuration / totalDuration);
        return starveDuration;
    }
}