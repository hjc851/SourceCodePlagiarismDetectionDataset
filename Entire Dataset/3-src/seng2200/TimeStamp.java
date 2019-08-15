/*
 * ItemTimeStamp.java
 * author: Jonathan Tabac II
 * 
 */ 

package seng2200;

public class TimeStamp
{
    // Production Stage name
    // time of entry
    // time of exit
    private String prodStageName;
    private double entry;
    private double exit;

    TimeStamp()
    {
        this.prodStageName = "NoName";
        this.entry = 0;
        this.exit = 0;
    }

    TimeStamp(String prodName, double entryTime, double exitTime)
    {
        this.prodStageName = prodName;
        this.entry = entryTime;
        this.exit = exitTime;
    }

    public void setProdStageName(String name)
    {
        this.prodStageName = name;
    }

    public String getProdStageName()
    {
        return this.prodStageName;
    }

    public void setEntryTime(double time)
    {
        this.entry = time;
    }

    public void setExitTime(double time)
    {
        this.exit = time;
    }

    public double getDuration()
    {
        return this.exit - this.entry;
    }
}