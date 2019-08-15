/*
 * Item.java
 * author: Jonathan Tabac II
 * 
 */ 
package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Item
{
    
    private List<TimeStamp> timeStampList;
    private double entryTime;
    private double exitTime;

    Item()
    {
        this.entryTime = 0;
        this.exitTime = 0;
        this.timeStampList = new LinkedList<TimeStamp>();
    }

    public void setEntryTime(double time)
    {
        this.entryTime = time;
    }

    public void setExitTime(double time)
    {
        this.exitTime = time;
    }

    public void stampTime(String prodName)
    {
        this.timeStampList.add(new TimeStamp(prodName, this.entryTime, this.exitTime));
        this.entryTime = 0;
        this.exitTime = 0;
    }

    public TimeStamp queueStampTime(String qName)
    {
        TimeStamp t = new TimeStamp(qName, this.entryTime, this.exitTime);
        this.entryTime = 0;
        this.exitTime = 0;
        return t;
    }

    public String getPath()
    {
        StringBuilder sb = new StringBuilder();
        for (int count = 0; count < this.timeStampList.size(); count++)
        {
            sb.append(this.timeStampList.get(count).getProdStageName());
            if (count < this.timeStampList.size() - 1)
                sb.append("->");
        }
        return sb.toString();
    }

}