/*
 * JobComparator.java
 * author: Jonathan Tabac II
 * 
 */ 
package seng2200;

import java.util.Comparator;

public class JobComparator implements Comparator<Job>
{
    @Override
    public int compare(Job x, Job y)
    {
        if (x.getRemainingDuration() < y.getRemainingDuration())
            return -1;
        else if (x.getRemainingDuration() > y.getRemainingDuration())
            return 1;
        else
            return 0;
    }
}