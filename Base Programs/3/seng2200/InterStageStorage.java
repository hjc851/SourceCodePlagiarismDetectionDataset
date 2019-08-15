/*
 * InterStageStorage.java
 * author: Jonathan Tabac II
 * 
 */ 
package seng2200;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;


public class InterStageStorage
{
    private int maxQ;
    private Queue<Item> q;
    private int count;
    private String name;
    private List<TimeStamp> qStamp;
    private List<Integer> countStamp;

    InterStageStorage()
    {
        this.maxQ = 7;                      // default to length 7
        this.q = new LinkedList<Item>(); // queue line 
        this.count = 0;
        this.name = "";
        this.qStamp = new LinkedList<TimeStamp>();
        this.countStamp = new LinkedList<Integer>();
    }

    InterStageStorage(String name, int max)
    {
        this.maxQ = max;
        this.q = new LinkedList<Item>();
        this.count = 0;
        this.name = name;
        this.qStamp = new LinkedList<TimeStamp>();
        this.countStamp = new LinkedList<Integer>();
    }

    public boolean enque(Item newItem, double currentTime)
    {
        if (!this.isFull())
        {
            // enque the item
            newItem.setEntryTime(currentTime);
            this.count += 1;
            return q.add(newItem);
        }
        else
        {
            return false;
        }
    }

    // Returns nullable
    public Item deque(double currentTime)
    {
        Item deque = q.poll();
        deque.setExitTime(currentTime);
        this.qStamp.add(deque.queueStampTime(this.name));
        this.count -= 1;
        return deque;
    }

    public boolean isFull()
    {
        if (this.q.size() < this.maxQ)
            return false;
        else
            return true;
    }

    public boolean isEmpty()
    {
        return this.q.isEmpty();
    }

    public String getName()
    {
        return this.name;
    }

    public void stampCount()
    {
        this.countStamp.add(new Integer(this.count));
    }

    public int getCurrentCount()
    {
        return this.count;
    }

    public double getIsqQueueTime()
    {
        double totalItems = this.qStamp.size();
        double totalDuration = 0;
        for (TimeStamp t : this.qStamp)
        {
            totalDuration += t.getDuration();
        }
        return (totalItems==0)?0:totalDuration/totalItems;
    }

    public double getIsqAvgItemCount()
    {
        double totalStamps = this.countStamp.size();
        double totalCount = 0;
        for (Integer i : this.countStamp)
        {
            totalCount += i;
        }
        return (totalStamps==0)?0:(totalCount/totalStamps);
    }
}