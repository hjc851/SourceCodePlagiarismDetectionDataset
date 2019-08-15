package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Map.Entry;
import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class SupplyCourseManagement {
  public java.util.Scanner prompter = null;
  public boolean IS_Bug = false;
  public final double GreatestAmount = 10000000;
  public seng2200.ThroughputCoeff goadStatistical = null;
  public seng2200.Planner rectalgia = null;
  public java.util.ArrayList<BuryPhaseStorehouse> isqNumber = null;
  public java.util.ArrayList<ThroughputLap> impelLimelightDocket = null;
  public int maximumQ = 0;
  public double swan = 0.0;
  public double equate = 0.0;

  public SupplyCourseManagement() {
    this.equate = (0);
    this.swan = (0);
    this.maximumQ = (0);
  }

  public SupplyCourseManagement(double normal, double pasture, int maximumQDuration) {
    this.equate = (normal);
    this.swan = (pasture);
    this.maximumQ = (maximumQDuration);
    this.impelLimelightDocket = (new java.util.ArrayList<ThroughputLap>());
    this.isqNumber = (new java.util.ArrayList<BuryPhaseStorehouse>());
    this.goadStatistical = (new seng2200.ThroughputCoeff(this.impelLimelightDocket));
    this.rectalgia = (new seng2200.Planner(8));
  }

  public synchronized void beginningOperate() {
    seng2200.ThroughputLap placeRanked;
    placeRanked = (null);
    this.deviseFabricationEntity();

    if (IS_Bug) {
      this.prompter = (new java.util.Scanner(System.in));
    }

    while (this.rectalgia.generateUnderwayYear() < this.GreatestAmount) {
      this.proceduresRound();
      placeRanked = (this.rectalgia.workNewGig());
      for (seng2200.ThroughputLap vig : this.impelLimelightDocket) {

        if (vig != placeRanked) vig.cniSateKuh(this.rectalgia.generateUnderwayYear());
      }
      this.markIntsUtensils();

      if (IS_Bug == true) {
        this.impressDesignation();
        prompter.nextLine();
      }
    }
    this.impressDesignation();

    if (prompter != null) prompter.close();
  }

  public synchronized void proceduresRound() {
    for (seng2200.ThroughputLap ora : this.impelLimelightDocket) {
      ora.formalitiesSection(this.rectalgia.generateUnderwayYear());
    }
  }

  public synchronized void deviseFabricationEntity() {
    seng2200.BuryPhaseStorehouse q01, q02, q03, q04, q05;
    seng2200.ThroughputLap l5;
    seng2200.ThroughputLap a1;
    seng2200.ThroughputLap s2a;
    seng2200.ThroughputLap s2b;
    seng2200.ThroughputLap sp;
    seng2200.ThroughputLap s4a;
    seng2200.ThroughputLap s4b;
    seng2200.ThroughputLap kev;
    q01 = (null);
    q02 = (null);
    q03 = (null);
    q04 = (null);
    q05 = (null);
    q01 = (new seng2200.BuryPhaseStorehouse("Q01", this.maximumQ));
    q02 = (new seng2200.BuryPhaseStorehouse("Q12", this.maximumQ));
    q03 = (new seng2200.BuryPhaseStorehouse("Q23", this.maximumQ));
    q04 = (new seng2200.BuryPhaseStorehouse("Q34", this.maximumQ));
    q05 = (new seng2200.BuryPhaseStorehouse("Q45", this.maximumQ));
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    l5 = (new seng2200.StartleSpotlight("S0", q01, this.equate, this.swan, this.rectalgia));
    a1 = (new seng2200.HalfwayPresent("S1", q01, q02, this.equate, this.swan, this.rectalgia));
    s2a =
        (new seng2200.HalfwayPresent(
            "S2a", q02, q03, this.equate * 2, this.swan * 2, this.rectalgia));
    s2b =
        (new seng2200.HalfwayPresent(
            "S2b", q02, q03, this.equate, this.swan * 0.5, this.rectalgia));
    sp = (new seng2200.HalfwayPresent("S3", q03, q04, this.equate, this.swan, this.rectalgia));
    s4a =
        (new seng2200.HalfwayPresent(
            "S4a", q04, q05, this.equate, this.swan * 0.5, this.rectalgia));
    s4b =
        (new seng2200.HalfwayPresent(
            "S4b", q04, q05, this.equate * 2, this.swan * 2, this.rectalgia));
    kev =
        (new seng2200.PastPhase(
            "S5", q05, this.equate, this.swan, this.goadStatistical, this.rectalgia));
    l5.settledReactionaryDig(a1);
    a1.fixHandedProductivity(l5);
    a1.settledReactionaryDig(s2a);
    a1.settledReactionaryDig(s2b);
    s2a.fixHandedProductivity(a1);
    s2a.settledReactionaryDig(sp);
    s2b.fixHandedProductivity(a1);
    s2b.settledReactionaryDig(sp);
    sp.fixHandedProductivity(s2a);
    sp.fixHandedProductivity(s2b);
    sp.settledReactionaryDig(s4a);
    sp.settledReactionaryDig(s4b);
    s4a.fixHandedProductivity(sp);
    s4a.settledReactionaryDig(kev);
    s4b.fixHandedProductivity(sp);
    s4b.settledReactionaryDig(kev);
    kev.fixHandedProductivity(s4a);
    kev.fixHandedProductivity(s4b);
    this.impelLimelightDocket.add(l5);
    this.impelLimelightDocket.add(a1);
    this.impelLimelightDocket.add(s2a);
    this.impelLimelightDocket.add(s2b);
    this.impelLimelightDocket.add(sp);
    this.impelLimelightDocket.add(s4a);
    this.impelLimelightDocket.add(s4b);
    this.impelLimelightDocket.add(kev);
  }

  public synchronized void braillePerformingQuickly() {
    java.lang.StringBuilder sb1;
    java.lang.String primaryFormat1;
    java.lang.String particularFormat1;
    java.lang.String stir, fatten, stuff;
    sb1 = (new java.lang.StringBuilder());
    System.out.println("1) Production Stages");
    primaryFormat1 = ("%-15s%-15s%-15s%-15s%-15s%-15s");
    particularFormat1 = ("%6.3f");
    stir = (null);
    fatten = (null);
    stuff = (null);
    System.out.println(
        format(primaryFormat1, "Stage", "State", "Prod(%)", "Starve(t)", "Block(t)", "Total time"));
    for (seng2200.ThroughputLap fh : this.impelLimelightDocket) {
      stir = (format(particularFormat1, fh.takeArrangeMediumProduce()) + "%");
      fatten = (format(particularFormat1, fh.produceScaleAddFaim()));
      stuff = (format(particularFormat1, fh.canInstarUnconditionedBanned()));
      sb1.append(
          format(
              primaryFormat1,
              fh.becomeOrientedConstitute(),
              fh.arriveNational(),
              stir,
              fatten,
              stuff,
              format(particularFormat1, fh.developTotHourProject())));
      sb1.append("\n");
    }
    System.out.println(sb1.toString());
  }

  public synchronized void publishIsqClock() {
    java.lang.StringBuilder sb2;
    java.lang.String primaryFormat2;
    java.lang.String particularFormat2;
    java.lang.String advert, approxYear, blvdParticular;
    java.lang.String calculation;
    sb2 = (new java.lang.StringBuilder());
    System.out.println("2) ISQ's");
    primaryFormat2 = ("%-15s%-15s%-15s%-15s");
    particularFormat2 = ("%6.3f");
    advert = (null);
    approxYear = (null);
    blvdParticular = (null);
    calculation = (null);
    System.out.println(format(primaryFormat2, "ISQ", "Item Count", "ave(t)", "ave(items)"));
    for (seng2200.BuryPhaseStorehouse q : this.isqNumber) {
      advert = (q.receiveNominate());
      approxYear = (format(particularFormat2, q.goIsqWaitingClock()));
      blvdParticular = (format(particularFormat2, q.goIsqAverageParticularTally()));
      calculation =
          ((q.isComplete())
              ? format("%-5s%-5s", q.takeTopicalConsider(), "FULL")
              : java.lang.Integer.toString(q.takeTopicalConsider()));
      sb2.append(format(primaryFormat2, advert, calculation, approxYear, blvdParticular));
      sb2.append("\n");
    }
    System.out.println(sb2.toString());
  }

  public synchronized void markIntsUtensils() {
    for (seng2200.BuryPhaseStorehouse q : this.isqNumber) {
      q.mailRecount();
    }
  }

  public synchronized void engravingLaneGet() {
    java.lang.StringBuilder sb3;
    java.lang.String primaryFormat3;
    java.util.Map<String, Double> pathways;
    sb3 = (new java.lang.StringBuilder());
    System.out.println("3) Paths");
    primaryFormat3 = ("%-30s%-15s");
    System.out.println(format(primaryFormat3, "Path", "total Items"));
    pathways = (this.goadStatistical.fixPassagewaysTotal());
    for (Entry<String, Double> entrances : pathways.entrySet()) {
      sb3.append(format(primaryFormat3, entrances.getKey(), entrances.getValue()));
      sb3.append("\n");
    }
    System.out.println(sb3.toString());
  }

  public synchronized void engravingTasksProvisions() {
    System.out.println("4) Job Count: " + this.rectalgia.comeEmploymentNumber());
    System.out.println(
        format(this.rectalgia.producePrintableParadigm(), "Job", "Remaining Duration"));
    System.out.println(this.rectalgia.obtainDetails());
  }

  public synchronized void publishPrevailingClock() {
    System.out.println("Current time: " + format("%6.3f", this.rectalgia.generateUnderwayYear()));
  }

  public synchronized void impressDesignation() {
    System.out.println("Simulation's Final Snapshot");
    this.publishPrevailingClock();
    this.braillePerformingQuickly();
    this.publishIsqClock();
    this.engravingLaneGet();
    this.engravingTasksProvisions();
    System.out.println(
        "Total items Created: "
            + this.impelLimelightDocket.get(0).conveyMaximumConsignmentsUnleashed());
    System.out.println("Total Items Finished: " + this.goadStatistical.makeAmountArtifacts());

    try {
      sleep(100);
    } catch (java.lang.InterruptedException samad) {
      System.err.println(samad);
    }
  }
}
