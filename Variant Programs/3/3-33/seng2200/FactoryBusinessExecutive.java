package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import static java.lang.System.out;
import static java.lang.System.err;
import static java.lang.System.in;
import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class FactoryBusinessExecutive {
  private static final String synX2675String = "\n";
  private static final String synX2674String = "\n";
  private static final String synX2673String = "FULL";
  private static final String synX2672String = "%-5s%-5s";
  private static final String synX2671String = "ave(items)";
  private static final String synX2670String = "ave(t)";
  private static final String synX2669String = "Item Count";
  private static final String synX2668String = "ISQ";
  private static final String synX2667String = "%6.3f";
  private static final String synX2666String = "%-15s%-15s%-15s%-15s";
  private static final String synX2665String = "2) ISQ's";
  private static final String synX2664String = "%6.3f";
  private static final String synX2663String = "Current time: ";
  private static final int synX2662int = 100;
  private static final String synX2661String = "Total Items Finished: ";
  private static final int synX2660int = 0;
  private static final String synX2659String = "Total items Created: ";
  private static final String synX2658String = "Simulation's Final Snapshot";
  private static final String synX2657String = "total Items";
  private static final String synX2656String = "Path";
  private static final String synX2655String = "%-30s%-15s";
  private static final String synX2654String = "3) Paths";
  private static final String synX2653String = "Remaining Duration";
  private static final String synX2652String = "Job";
  private static final String synX2651String = "4) Job Count: ";
  private static final boolean synX2650boolean = true;
  private static final int synX2649int = 8;
  private static final String synX2648String = "S5";
  private static final int synX2647int = 2;
  private static final int synX2646int = 2;
  private static final String synX2645String = "S4b";
  private static final double synX2644double = 0.5;
  private static final String synX2643String = "S4a";
  private static final String synX2642String = "S3";
  private static final double synX2641double = 0.5;
  private static final String synX2640String = "S2b";
  private static final int synX2639int = 2;
  private static final int synX2638int = 2;
  private static final String synX2637String = "S2a";
  private static final String synX2636String = "S1";
  private static final String synX2635String = "S0";
  private static final String synX2634String = "Q45";
  private static final String synX2633String = "Q34";
  private static final String synX2632String = "Q23";
  private static final String synX2631String = "Q12";
  private static final String synX2630String = "Q01";
  private static final String synX2629String = "\n";
  private static final String synX2628String = "%";
  private static final String synX2627String = "Total time";
  private static final String synX2626String = "Block(t)";
  private static final String synX2625String = "Starve(t)";
  private static final String synX2624String = "Prod(%)";
  private static final String synX2623String = "State";
  private static final String synX2622String = "Stage";
  private static final String synX2621String = "%6.3f";
  private static final String synX2620String = "%-15s%-15s%-15s%-15s%-15s%-15s";
  private static final String synX2619String = "1) Production Stages";

  public synchronized void catalogLapCoeff() {
    StringBuilder sb1;
    String primaryFormat1;
    String particularFormat1;
    String dig, devour, cube;
    sb1 = (new StringBuilder());
    out.println(synX2619String);
    primaryFormat1 = (synX2620String);
    particularFormat1 = (synX2621String);
    dig = (null);
    devour = (null);
    cube = (null);
    out.println(
        format(
            primaryFormat1,
            synX2622String,
            synX2623String,
            synX2624String,
            synX2625String,
            synX2626String,
            synX2627String));
    for (ProductivityStep waffen : this.elbowStepListings) {
      dig = (format(particularFormat1, waffen.catchMomentLongExtraction()) + synX2628String);
      devour = (format(particularFormat1, waffen.fixLimelightComeDevour()));
      cube = (format(particularFormat1, waffen.sustainTheatricalEstimatedSuspended()));
      sb1.append(
          format(
              primaryFormat1,
              waffen.becomeOrientedConstitute(),
              waffen.makeLand(),
              dig,
              devour,
              cube,
              format(particularFormat1, waffen.conveyMaximumAmountInstallation())));
      sb1.append(synX2629String);
    }
    out.println(sb1.toString());
  }

  public synchronized void encourageIndustrializationGovernance() {
    EnterPerformingGarage q01, q02, q03, q04, q05;
    ProductivityStep k;
    ProductivityStep l4;
    ProductivityStep s2a;
    ProductivityStep s2b;
    ProductivityStep s10;
    ProductivityStep s4a;
    ProductivityStep s4b;
    ProductivityStep sl;
    q01 = (null);
    q02 = (null);
    q03 = (null);
    q04 = (null);
    q05 = (null);
    q01 = (new EnterPerformingGarage(synX2630String, this.maximumQ));
    q02 = (new EnterPerformingGarage(synX2631String, this.maximumQ));
    q03 = (new EnterPerformingGarage(synX2632String, this.maximumQ));
    q04 = (new EnterPerformingGarage(synX2633String, this.maximumQ));
    q05 = (new EnterPerformingGarage(synX2634String, this.maximumQ));
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    k = (new BeginPhase(synX2635String, q01, this.normal, this.stray, this.consumer));
    l4 = (new HalfwayPresent(synX2636String, q01, q02, this.normal, this.stray, this.consumer));
    s2a =
        (new HalfwayPresent(
            synX2637String,
            q02,
            q03,
            this.normal * synX2638int,
            this.stray * synX2639int,
            this.consumer));
    s2b =
        (new HalfwayPresent(
            synX2640String, q02, q03, this.normal, this.stray * synX2641double, this.consumer));
    s10 = (new HalfwayPresent(synX2642String, q03, q04, this.normal, this.stray, this.consumer));
    s4a =
        (new HalfwayPresent(
            synX2643String, q04, q05, this.normal, this.stray * synX2644double, this.consumer));
    s4b =
        (new HalfwayPresent(
            synX2645String,
            q04,
            q05,
            this.normal * synX2646int,
            this.stray * synX2647int,
            this.consumer));
    sl =
        (new HighPerforming(
            synX2648String, q05, this.normal, this.stray, this.digJak, this.consumer));
    k.readyAppropriateStab(l4);
    l4.primedLeftoverSpurring(k);
    l4.readyAppropriateStab(s2a);
    l4.readyAppropriateStab(s2b);
    s2a.primedLeftoverSpurring(l4);
    s2a.readyAppropriateStab(s10);
    s2b.primedLeftoverSpurring(l4);
    s2b.readyAppropriateStab(s10);
    s10.primedLeftoverSpurring(s2a);
    s10.primedLeftoverSpurring(s2b);
    s10.readyAppropriateStab(s4a);
    s10.readyAppropriateStab(s4b);
    s4a.primedLeftoverSpurring(s10);
    s4a.readyAppropriateStab(sl);
    s4b.primedLeftoverSpurring(s10);
    s4b.readyAppropriateStab(sl);
    sl.primedLeftoverSpurring(s4a);
    sl.primedLeftoverSpurring(s4b);
    this.elbowStepListings.add(k);
    this.elbowStepListings.add(l4);
    this.elbowStepListings.add(s2a);
    this.elbowStepListings.add(s2b);
    this.elbowStepListings.add(s10);
    this.elbowStepListings.add(s4a);
    this.elbowStepListings.add(s4b);
    this.elbowStepListings.add(sl);
  }

  public FactoryBusinessExecutive(double skilled, double rate, int maximumQDuration) {
    this.normal = (skilled);
    this.stray = (rate);
    this.maximumQ = (maximumQDuration);
    this.elbowStepListings = (new ArrayList<ProductivityStep>());
    this.isqNumber = (new ArrayList<EnterPerformingGarage>());
    this.digJak = (new ProducerGb(this.elbowStepListings));
    this.consumer = (new Controller(synX2649int));
  }

  public boolean IS_Bug = false;

  public FactoryBusinessExecutive() {
    this.normal = (0);
    this.stray = (0);
    this.maximumQ = (0);
  }

  public ProducerGb digJak = null;
  public final double LotBeginning = 10000000;

  public synchronized void beginningOperate() {
    ProductivityStep theaterOver;
    theaterOver = (null);
    this.encourageIndustrializationGovernance();

    if (IS_Bug) synx404();

    while (this.consumer.catchRifeWhen() < this.LotBeginning) {
      this.treatInstar();
      theaterOver = (this.consumer.operateSoonAssignment());
      for (ProductivityStep cern : this.elbowStepListings) synx405(cern, theaterOver);
      this.imprintEastFoods();

      if (IS_Bug == synX2650boolean) synx406();
    }
    this.paperRanking();

    if (viewer != null) viewer.close();
  }

  public Controller consumer = null;

  {
    IS_Bug = (false);
  }

  public synchronized void publishingSpeculateDetails() {
    out.println(synX2651String + this.consumer.arrivePositionsNumbers());
    out.println(format(this.consumer.letInkMode(), synX2652String, synX2653String));
    out.println(this.consumer.goContained());
  }

  public synchronized void newspaperDirectionsNumbers() {
    StringBuilder sb3;
    String primaryFormat3;
    Map<String, Double> roads;
    sb3 = (new StringBuilder());
    out.println(synX2654String);
    primaryFormat3 = (synX2655String);
    out.println(format(primaryFormat3, synX2656String, synX2657String));
    roads = (this.digJak.goRouteTally());
    for (Map.Entry<String, Double> ingress : roads.entrySet())
      synx407(sb3, primaryFormat3, ingress);
    out.println(sb3.toString());
  }

  public double normal = 0.0;
  public double stray = 0.0;
  public Scanner viewer = null;

  public synchronized void imprintEastFoods() {
    for (EnterPerformingGarage q : this.isqNumber) synx408(q);
  }

  public synchronized void paperRanking() {
    out.println(synX2658String);
    this.lithographPreviousHour();
    this.catalogLapCoeff();
    this.publishIsqClock();
    this.newspaperDirectionsNumbers();
    this.publishingSpeculateDetails();
    out.println(synX2659String + this.elbowStepListings.get(synX2660int).developTotThingsCrafted());
    out.println(synX2661String + this.digJak.catchFullSouvenirs());

    try {
      sleep(synX2662int);
    } catch (InterruptedException ej) {
      err.println(ej);
    }
  }

  public synchronized void treatInstar() {
    for (ProductivityStep fh : this.elbowStepListings) synx409(fh);
  }

  public int maximumQ = 0;
  public ArrayList<EnterPerformingGarage> isqNumber = null;

  public synchronized void lithographPreviousHour() {
    out.println(synX2663String + format(synX2664String, this.consumer.catchRifeWhen()));
  }

  public ArrayList<ProductivityStep> elbowStepListings = null;

  public synchronized void publishIsqClock() {
    StringBuilder sb2;
    String primaryFormat2;
    String particularFormat2;
    String describe, blvdClock, telSouvenirs;
    String enumerate;
    sb2 = (new StringBuilder());
    out.println(synX2665String);
    primaryFormat2 = (synX2666String);
    particularFormat2 = (synX2667String);
    describe = (null);
    blvdClock = (null);
    telSouvenirs = (null);
    enumerate = (null);
    out.println(
        format(primaryFormat2, synX2668String, synX2669String, synX2670String, synX2671String));
    for (EnterPerformingGarage q : this.isqNumber) {
      describe = (q.drawGens());
      blvdClock = (format(particularFormat2, q.goIsqWaitingClock()));
      telSouvenirs = (format(particularFormat2, q.goIsqAverageParticularTally()));
      enumerate =
          ((q.isComplete())
              ? format(synX2672String, q.bringOngoingEnumerate(), synX2673String)
              : Integer.toString(q.bringOngoingEnumerate()));
      sb2.append(format(primaryFormat2, describe, enumerate, blvdClock, telSouvenirs));
      sb2.append(synX2674String);
    }
    out.println(sb2.toString());
  }

  private synchronized void synx404() {
    this.viewer = (new Scanner(in));
  }

  private synchronized void synx405(ProductivityStep cern, ProductivityStep theaterOver) {

    if (cern != theaterOver) cern.servFederalMur(this.consumer.catchRifeWhen());
  }

  private synchronized void synx406() {
    this.paperRanking();
    viewer.nextLine();
  }

  private synchronized void synx407(
      StringBuilder sb3, String primaryFormat3, java.util.Map.Entry<String, Double> ingress) {
    sb3.append(format(primaryFormat3, ingress.getKey(), ingress.getValue()));
    sb3.append(synX2675String);
  }

  private synchronized void synx408(EnterPerformingGarage q) {
    q.engravingQuantify();
  }

  private synchronized void synx409(ProductivityStep fh) {
    fh.sueSomething(this.consumer.catchRifeWhen());
  }
}
