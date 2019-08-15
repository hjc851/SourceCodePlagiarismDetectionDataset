package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Map.Entry;
import static java.lang.Thread.sleep;
import static java.lang.String.format;

public class DevelopmentTuneSteward {
  public java.util.ArrayList<EntombPointMemory> isqNumber = null;

  public DevelopmentTuneSteward() {
    this.nasty = 0;
    this.grade = 0;
    this.maximumQ = 0;
  }

  public synchronized void affixAveragesProducts() {
    for (seng2200.EntombPointMemory q : this.isqNumber) {
      q.affixTell();
    }
  }

  public synchronized void commenceGo() {
    seng2200.PlantTheater placeRanked = null;
    this.engenderFactoryFramework();

    if (IS_Bug) {
      this.readout = new java.util.Scanner(System.in);
    }

    while (this.ap.haveCirculatingPeriods() < this.PremiumPeriod) {
      this.actCycle();
      placeRanked = this.ap.conductsAheadDuties();
      for (seng2200.PlantTheater writes : this.orientedLapRegistry) {

        if (writes != placeRanked) writes.servFederalMur(this.ap.haveCirculatingPeriods());
      }
      this.affixAveragesProducts();

      if (IS_Bug == true) {
        this.publishingIdentity();
        readout.nextLine();
      }
    }
    this.publishingIdentity();

    if (readout != null) readout.close();
  }

  public double grade = 0.0;

  public synchronized void publishingIdentity() {
    System.out.println("Simulation's Final Snapshot");
    this.printablePrevalentNow();
    this.printableScaleState();
    this.publishIsqClock();
    this.reprintingRoadTabulation();
    this.copyAssignmentIngredients();
    System.out.println(
        "Total items Created: " + this.orientedLapRegistry.get(0).receiveNumberGoodsConceived());
    System.out.println("Total Items Finished: " + this.farmQuickly.produceAddFoods());

    try {
      sleep(100);
    } catch (java.lang.InterruptedException samad) {
      System.err.println(samad);
    }
  }

  public synchronized void actCycle() {
    for (seng2200.PlantTheater waffen : this.orientedLapRegistry) {
      waffen.methodologyParagraph(this.ap.haveCirculatingPeriods());
    }
  }

  public synchronized void printablePrevalentNow() {
    System.out.println("Current time: " + format("%6.3f", this.ap.haveCirculatingPeriods()));
  }

  public seng2200.Spooler ap = null;
  public java.util.Scanner readout = null;

  public synchronized void printableScaleState() {
    java.lang.StringBuilder sb1 = new java.lang.StringBuilder();
    System.out.println("1) Production Stages");
    java.lang.String primaryFormat1 = "%-15s%-15s%-15s%-15s%-15s%-15s";
    java.lang.String particularFormat1 = "%6.3f";
    java.lang.String stimulate = null, starvedly = null, freeze = null;
    System.out.println(
        format(primaryFormat1, "Stage", "State", "Prod(%)", "Starve(t)", "Block(t)", "Total time"));
    for (seng2200.PlantTheater ora : this.orientedLapRegistry) {
      stimulate = format(particularFormat1, ora.canInstarYdsDevelopment()) + "%";
      starvedly = format(particularFormat1, ora.fixLimelightComeDevour());
      freeze = format(particularFormat1, ora.fixLimelightComeJammed());
      sb1.append(
          format(
              primaryFormat1,
              ora.findSpurMention(),
              ora.beatCentral(),
              stimulate,
              starvedly,
              freeze,
              format(particularFormat1, ora.generateAbsoluteYearOperational())));
      sb1.append("\n");
    }
    System.out.println(sb1.toString());
  }

  public double nasty = 0.0;

  public synchronized void publishIsqClock() {
    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
    System.out.println("2) ISQ's");
    java.lang.String primaryFormat2 = "%-15s%-15s%-15s%-15s";
    java.lang.String particularFormat2 = "%6.3f";
    java.lang.String patronymic = null, hailAmount = null, helloFoods = null;
    java.lang.String consider = null;
    System.out.println(format(primaryFormat2, "ISQ", "Item Count", "ave(t)", "ave(items)"));
    for (seng2200.EntombPointMemory q : this.isqNumber) {
      patronymic = q.bringRefer();
      hailAmount = format(particularFormat2, q.goIsqWaitingClock());
      helloFoods = format(particularFormat2, q.goIsqAverageParticularTally());
      consider =
          (q.isComplete())
              ? format("%-5s%-5s", q.sustainThisGet(), "FULL")
              : java.lang.Integer.toString(q.sustainThisGet());
      sb2.append(format(primaryFormat2, patronymic, consider, hailAmount, helloFoods));
      sb2.append("\n");
    }
    System.out.println(sb2.toString());
  }

  public synchronized void engenderFactoryFramework() {
    seng2200.EntombPointMemory q01 = null, q02 = null, q03 = null, q04 = null, q05 = null;
    q01 = new seng2200.EntombPointMemory("Q01", this.maximumQ);
    q02 = new seng2200.EntombPointMemory("Q12", this.maximumQ);
    q03 = new seng2200.EntombPointMemory("Q23", this.maximumQ);
    q04 = new seng2200.EntombPointMemory("Q34", this.maximumQ);
    q05 = new seng2200.EntombPointMemory("Q45", this.maximumQ);
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    seng2200.PlantTheater frequency =
        new seng2200.BeginsLap("S0", q01, this.nasty, this.grade, this.ap);
    seng2200.PlantTheater l3 =
        new seng2200.IntermediateLeg("S1", q01, q02, this.nasty, this.grade, this.ap);
    seng2200.PlantTheater s2a =
        new seng2200.IntermediateLeg("S2a", q02, q03, this.nasty * 2, this.grade * 2, this.ap);
    seng2200.PlantTheater s2b =
        new seng2200.IntermediateLeg("S2b", q02, q03, this.nasty, this.grade * 0.5, this.ap);
    seng2200.PlantTheater mm =
        new seng2200.IntermediateLeg("S3", q03, q04, this.nasty, this.grade, this.ap);
    seng2200.PlantTheater s4a =
        new seng2200.IntermediateLeg("S4a", q04, q05, this.nasty, this.grade * 0.5, this.ap);
    seng2200.PlantTheater s4b =
        new seng2200.IntermediateLeg("S4b", q04, q05, this.nasty * 2, this.grade * 2, this.ap);
    seng2200.PlantTheater kda =
        new seng2200.SeniorStep("S5", q05, this.nasty, this.grade, this.farmQuickly, this.ap);
    frequency.placedExactIncite(l3);
    l3.primedLeftoverSpurring(frequency);
    l3.placedExactIncite(s2a);
    l3.placedExactIncite(s2b);
    s2a.primedLeftoverSpurring(l3);
    s2a.placedExactIncite(mm);
    s2b.primedLeftoverSpurring(l3);
    s2b.placedExactIncite(mm);
    mm.primedLeftoverSpurring(s2a);
    mm.primedLeftoverSpurring(s2b);
    mm.placedExactIncite(s4a);
    mm.placedExactIncite(s4b);
    s4a.primedLeftoverSpurring(mm);
    s4a.placedExactIncite(kda);
    s4b.primedLeftoverSpurring(mm);
    s4b.placedExactIncite(kda);
    kda.primedLeftoverSpurring(s4a);
    kda.primedLeftoverSpurring(s4b);
    this.orientedLapRegistry.add(frequency);
    this.orientedLapRegistry.add(l3);
    this.orientedLapRegistry.add(s2a);
    this.orientedLapRegistry.add(s2b);
    this.orientedLapRegistry.add(mm);
    this.orientedLapRegistry.add(s4a);
    this.orientedLapRegistry.add(s4b);
    this.orientedLapRegistry.add(kda);
  }

  public synchronized void reprintingRoadTabulation() {
    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
    System.out.println("3) Paths");
    java.lang.String primaryFormat3 = "%-30s%-15s";
    System.out.println(format(primaryFormat3, "Path", "total Items"));
    java.util.Map<String, Double> corridors = this.farmQuickly.haveFootpathsReckon();
    for (Entry<String, Double> incoming : corridors.entrySet()) {
      sb3.append(format(primaryFormat3, incoming.getKey(), incoming.getValue()));
      sb3.append("\n");
    }
    System.out.println(sb3.toString());
  }

  public java.util.ArrayList<PlantTheater> orientedLapRegistry = null;
  public final double PremiumPeriod = 10000000;
  public boolean IS_Bug = false;
  public seng2200.ProducersQuick farmQuickly = null;
  public int maximumQ = 0;

  public DevelopmentTuneSteward(double small, double scope, int maximumQDuration) {
    this.nasty = small;
    this.grade = scope;
    this.maximumQ = maximumQDuration;
    this.orientedLapRegistry = new java.util.ArrayList<PlantTheater>();
    this.isqNumber = new java.util.ArrayList<EntombPointMemory>();
    this.farmQuickly = new seng2200.ProducersQuick(this.orientedLapRegistry);
    this.ap = new seng2200.Spooler(8);
  }

  public synchronized void copyAssignmentIngredients() {
    System.out.println("4) Job Count: " + this.ap.letDutiesCharge());
    System.out.println(format(this.ap.obtainPublishingStyle(), "Job", "Remaining Duration"));
    System.out.println(this.ap.goContained());
  }
}
