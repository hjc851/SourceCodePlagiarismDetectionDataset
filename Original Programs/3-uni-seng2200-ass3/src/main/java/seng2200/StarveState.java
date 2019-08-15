/*
 * StarveState.java
 * author: Jonathan Tabac II
 * 
 */ 
package seng2200;

public class StarveState extends State
{
    StarveState()
    {
        super("Starve State");
    }

    StarveState(double dur)
    {
        super("Starve State", dur);
    }
}