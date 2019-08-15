/*
 * ProductionLineManager.java
 * author: Jonathan Tabac II
 * 
 */ 
package seng2200;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;

public class ProductionLineManager
{
    private double mean;
    private double range;
    private int maxQ;

    private ArrayList<ProductionStage> prodStageList;
    private ArrayList<InterStageStorage> isqList;

    private Scheduler des_pq;

    private ProductionStat prodStat;

    private final double MAX_TIME = 10000000;

    private boolean IS_DEBUG = false;

    private Scanner reader;

    // Constructor
    ProductionLineManager()
    {
        this.mean = 0;
        this.range = 0;
        this.maxQ = 0;
    }

    ProductionLineManager(double mean, double range, int maxQLength)
    {
        this.mean = mean;
        this.range = range;
        this.maxQ = maxQLength;
        this.prodStageList = new ArrayList<ProductionStage>();
        this.isqList = new ArrayList<InterStageStorage>();

        this.prodStat = new ProductionStat(this.prodStageList);

        // Job priority queue should only have length
        // same as the number of Production stages
        // TODO: Hard coded job queue length!
        this.des_pq = new Scheduler(8);

    }

    public void startWork()
    {

        ProductionStage stageFinished;
        // create the structure of the production line
        this.createProductionStructure();

        // **** Debug *****
        if (IS_DEBUG)
        {
            this.reader = new Scanner(System.in);
            // Not Cross platform
            // System.out.println("\033\143");
        }
        // **** Debug *****

        // Main simulation loop
        while (this.des_pq.getCurrentTime() < this.MAX_TIME)
        {
            // Process Phase/Unblock Phase/Starve Phase
            this.processPhase();

            // Finish Phase
            stageFinished = this.des_pq.performNextJob();

            // Update stage state durations
            for (ProductionStage p : this.prodStageList)
            {
                if (p != stageFinished)
                    p.incStateDur(this.des_pq.getCurrentTime());
            }

            this.stampAvgItems();

            // **** Debug *****
            // *** Enable to see the simulation
            if (IS_DEBUG == true)
            {

                this.printStatus();

                // *** Enable to step through each loop
                reader.nextLine();

                // Not Cross platform
                // System.out.println("\033\143");

            }
            // **** Debug *****
        }

        this.printStatus();

        if (reader != null)
            reader.close();
    }

    private void processPhase()
    {

        for (ProductionStage s : this.prodStageList)
        {
            s.processItem(this.des_pq.getCurrentTime());
        }
    }

    private void createProductionStructure()
    {
        // Stes up all production stages and connections

        // ISQ's
        InterStageStorage q01, q02, q03, q04, q05;
        q01 = new InterStageStorage("Q01", this.maxQ);
        q02 = new InterStageStorage("Q12", this.maxQ);
        q03 = new InterStageStorage("Q23", this.maxQ);
        q04 = new InterStageStorage("Q34", this.maxQ);
        q05 = new InterStageStorage("Q45", this.maxQ);

        this.isqList.add(q01);
        this.isqList.add(q02);
        this.isqList.add(q03);
        this.isqList.add(q04);
        this.isqList.add(q05);

        // For now, create the structure statically
        ProductionStage s0 = new StartStage("S0", q01, this.mean, this.range, this.des_pq);
        ProductionStage s1 = new MidStage("S1", q01, q02, this.mean, this.range, this.des_pq);
        ProductionStage s2a = new MidStage("S2a", q02, q03, this.mean * 2, this.range * 2, this.des_pq);
        ProductionStage s2b = new MidStage("S2b", q02, q03, this.mean , this.range * 0.5, this.des_pq);
        ProductionStage s3 = new MidStage("S3", q03, q04, this.mean, this.range, this.des_pq);
        ProductionStage s4a = new MidStage("S4a", q04, q05, this.mean, this.range * 0.5, this.des_pq);
        ProductionStage s4b = new MidStage("S4b", q04, q05, this.mean * 2, this.range * 2, this.des_pq);
        ProductionStage s5 = new LastStage("S5", q05, this.mean, this.range, this.prodStat, this.des_pq);

        // Set the MidStages' left and right Prod for unblocking/unstarving
        s0.setRightProd(s1);

        s1.setLeftProd(s0);
        s1.setRightProd(s2a);
        s1.setRightProd(s2b);

        s2a.setLeftProd(s1);
        s2a.setRightProd(s3);

        s2b.setLeftProd(s1);
        s2b.setRightProd(s3);

        s3.setLeftProd(s2a);
        s3.setLeftProd(s2b);

        s3.setRightProd(s4a);
        s3.setRightProd(s4b);

        s4a.setLeftProd(s3);
        s4a.setRightProd(s5);

        s4b.setLeftProd(s3);
        s4b.setRightProd(s5);

        s5.setLeftProd(s4a);
        s5.setLeftProd(s4b);

        // Add the ProdStages to the list
        this.prodStageList.add(s0);
        this.prodStageList.add(s1);
        this.prodStageList.add(s2a);
        this.prodStageList.add(s2b);
        this.prodStageList.add(s3);
        this.prodStageList.add(s4a);
        this.prodStageList.add(s4b);
        this.prodStageList.add(s5);

    }

    private void printStageStat()
    {
        StringBuilder sb1 = new StringBuilder();

        System.out.println("1) Production Stages");
        String mainFormat1 = "%-15s%-15s%-15s%-15s%-15s%-15s";
        String itemFormat1 = "%6.3f";
        String prod, starve, block;

        System.out.println(String.format(mainFormat1,
                                         "Stage",
                                         "State",
                                         "Prod(%)",
                                         "Starve(t)",
                                         "Block(t)",
                                         "Total time"));

        for (ProductionStage s : this.prodStageList)
        {
            prod = String.format(itemFormat1,s.getStageAvgProduction()) + "%";
            starve = String.format(itemFormat1, s.getStageTotalStarve());
            block = String.format(itemFormat1, s.getStageTotalBlocked());

            sb1.append(String.format(mainFormat1,
                                     s.getProdName(),
                                     s.getState(),
                                     prod,
                                     starve,
                                     block,
                                     String.format(itemFormat1,
                                     s.getTotalTimeOperation())));
            sb1.append("\n");
        }
        System.out.println(sb1.toString());

    }

    private void printIsqTime()
    {
        StringBuilder sb2 = new StringBuilder();

        System.out.println("2) ISQ's");
        String mainFormat2 = "%-15s%-15s%-15s%-15s";
        String itemFormat2 = "%6.3f";

        String name, aveTime, aveItems;
        String count;

        System.out.println(String.format(mainFormat2, "ISQ","Item Count" ,"ave(t)", "ave(items)"));

        for (InterStageStorage q : this.isqList)
        {
            name = q.getName();
            aveTime = String.format(itemFormat2, q.getIsqQueueTime());
            aveItems = String.format(itemFormat2, q.getIsqAvgItemCount());
            count = (q.isFull())?String.format("%-5s%-5s", q.getCurrentCount(), "FULL"):Integer.toString(q.getCurrentCount());
            sb2.append(String.format(mainFormat2, name, count, aveTime, aveItems));
            sb2.append("\n");
        }
        System.out.println(sb2.toString());
    }

    private void stampAvgItems()
    {
        for (InterStageStorage q : this.isqList)
        {
            q.stampCount();
        }
    }

    private void printPathsCount()
    {
        StringBuilder sb3 = new StringBuilder();
        System.out.println("3) Paths");
        String mainFormat3 = "%-30s%-15s";

        System.out.println(String.format(mainFormat3, "Path", "total Items"));

        Map<String, Double> paths = this.prodStat.getPathsCount();
        for (Map.Entry<String, Double> entry : paths.entrySet())
        {
           sb3.append(String.format(mainFormat3, entry.getKey(), entry.getValue()));
           sb3.append("\n");
        }
        System.out.println(sb3.toString());

    }

    private void printJobContents()
    {
        System.out.println("4) Job Count: " + this.des_pq.getJobCount());
        System.out.println(String.format(this.des_pq.getPrintFormat(), "Job", "Remaining Duration"));
        System.out.println(this.des_pq.getContents());
    }

    private void printCurrentTime()
    {
        System.out.println("Current time: " + String.format("%6.3f", this.des_pq.getCurrentTime()));
    }

    private void printStatus()
    {
        System.out.println("Simulation's Final Snapshot");
        this.printCurrentTime();
        this.printStageStat();
        this.printIsqTime();
        this.printPathsCount();
        this.printJobContents();

        System.out.println("Total items Created: " +  this.prodStageList.get(0).getTotalItemsCreated());
        System.out.println("Total Items Finished: " + this.prodStat.getTotalItems());

        // **** DEBUG ****
        // **** Enable to see FUN **** //
        try
        {
            Thread.sleep(100);
        }
        catch (InterruptedException e)
        {
            System.err.println(e);
        }
        // **** Enable to see FUN **** //
        // **** DEBUG ****
    }

}