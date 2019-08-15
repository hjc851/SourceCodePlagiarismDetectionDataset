/*
 * BusyState.java
 * author: Jonathan Tabac II
 * 
 */ 
package seng2200;

public class BusyState extends State
{
    BusyState()
    {
        super("Busy State");
    }

    BusyState(double dur)
    {
        super("Busy State", dur);
    }
}