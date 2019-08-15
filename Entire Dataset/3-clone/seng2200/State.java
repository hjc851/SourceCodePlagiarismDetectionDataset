/*
 * States.java
 * author: Jonathan Tabac II
 * 
 */ 
package seng2200;

public class State
{
    private double duration;
    private String name;

    State()
    {
        this.duration = 0;
        this.name = "";
    }

    State(String name)
    {
        this.duration = 0;
        this.name = name;
    }

    State(String name, double dur)
    {
        this.duration = dur;
        this.name = name;
    }

    public void incrementDuration(double dur)
    {
        this.duration += dur;
    }

    public double getDuration()
    {
        return this.duration;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return this.name;
    }

}