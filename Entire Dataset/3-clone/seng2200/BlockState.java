/*
 * BlockState.java
 * author: Jonathan Tabac II
 * 
 */ 
package seng2200;

public class BlockState extends State
{
    BlockState()
    {
        super("Blocked State");
    }

    BlockState(double dur)
    {
        super("Blocked State", dur);
    }
}