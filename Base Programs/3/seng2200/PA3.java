/*
 * PA3.java
 * author: Jonathan Tabac II
 * 
 */ 
package seng2200;

public class PA3
{
    private String[] args;
    private ProductionLineManager prodManager;
    private double mean;
    private double range;
    private int maxQ;

    // Constructor
    PA3(String[] args)
    {
        this.args = args;
    }

    private void run()
    {
        // Main Program Code goes here

        // Check parameters
        if (args.length != 3)
        {
            // Display Error, end program
            System.out.println("Not enough Parameters");
            return;
        }

        // Check if parameters are correct
        // no negative parameters, all ints
        this.mean = Double.parseDouble(this.args[0]);
        this.range = Double.parseDouble(this.args[1]);
        this.maxQ = Integer.parseInt(this.args[2]);

        // initialize prodManager
        this.prodManager = new ProductionLineManager(this.mean, this.range, this.maxQ);
        // run prodManager
        this.prodManager.startWork();
    }

    public static void main(String[] args)
    {
        PA3 iface = new PA3(args);
        iface.run();
    }

}