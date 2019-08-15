/*
 * ProductionStat.java
 * author: Jonathan Tabac II
 * 
 */ 

package seng2200;
import java.util.List;
import java.util.Map;
import java.util.Hashtable;
import java.util.LinkedList;

public class ProductionStat
{
    private List<Item> finishedItems;

    ProductionStat(List<ProductionStage> prodStages)
    {
        this.finishedItems = new LinkedList<>();
    }

    public void add(Item e)
    {
        this.finishedItems.add(e);
    }

    public int getTotalItems()
    {
        return finishedItems.size();
    }

    public Map<String, Double> getPathsCount()
    {
        Map<String, Double> pathsCount = new Hashtable<String, Double>();
        String path;
        Double count;
        for (Item i : this.finishedItems)
        {
            path = i.getPath();
            count = pathsCount.get(path);
            if (pathsCount.containsKey(path))
            {
                // add the path as key to dictionary
                // assign the value 1
                pathsCount.put(path, new Double(count + 1));
            }
            else
            {
                // assign an incremented value
                count = new Double(1);
                pathsCount.put(path, count);
            }
        }
        return pathsCount;
    }

}