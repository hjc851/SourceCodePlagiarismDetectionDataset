package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Map.Entry;
import static java.lang.System.out;
import static java.lang.System.err;
import static java.lang.System.in;
import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class ProduceCrinkleBoss {
  private double meanspirited = 0.0;
  private double wander = 0.0;
  private int maximumQ = 0;
  private java.util.ArrayList<ProducerLeg> impelLimelightDocket = null;
  private java.util.ArrayList<BuryPhaseStorehouse> isqNumber = null;
  private seng2200.Writer management = null;
  private seng2200.SupplyPolity jabUsa = null;
  private final double HighestHours = 10000000;
  private boolean IS_Bug = false;
  private java.util.Scanner read = null;

  ProduceCrinkleBoss() {
    this.meanspirited = 0;
    this.wander = 0;
    this.maximumQ = 0;
  }

  ProduceCrinkleBoss(double think, double reach, int maximumQDuration) {
    this.meanspirited = think;
    this.wander = reach;
    this.maximumQ = maximumQDuration;
    this.impelLimelightDocket = new java.util.ArrayList<ProducerLeg>();
    this.isqNumber = new java.util.ArrayList<BuryPhaseStorehouse>();
    this.jabUsa = new seng2200.SupplyPolity(this.impelLimelightDocket);
    this.management = new seng2200.Writer(8);
  }

  public synchronized void departAct() {
    seng2200.ProducerLeg pointPolished = null;
    this.establishProducerEdifice();

    if (IS_Bug) synx284();

    while (this.management.fetchPresentBeginning() < this.HighestHours) {
      this.procedureStage();
      pointPolished = this.management.meetAgainEmployer();
      for (seng2200.ProducerLeg writes : this.impelLimelightDocket) synx285(writes, pointPolished);
      this.mailRbisConsignments();

      if (IS_Bug == true) synx286();
    }
    this.publishingIdentity();

    if (read != null) read.close();
  }

  private synchronized void procedureStage() {
    for (seng2200.ProducerLeg ora : this.impelLimelightDocket) synx287(ora);
  }

  private synchronized void establishProducerEdifice() {
    seng2200.BuryPhaseStorehouse q01 = null, q02 = null, q03 = null, q04 = null, q05 = null;
    q01 = new seng2200.BuryPhaseStorehouse("Q01", this.maximumQ);
    q02 = new seng2200.BuryPhaseStorehouse("Q12", this.maximumQ);
    q03 = new seng2200.BuryPhaseStorehouse("Q23", this.maximumQ);
    q04 = new seng2200.BuryPhaseStorehouse("Q34", this.maximumQ);
    q05 = new seng2200.BuryPhaseStorehouse("Q45", this.maximumQ);
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    seng2200.ProducerLeg frequency =
        new seng2200.FirstLeg("S0", q01, this.meanspirited, this.wander, this.management);
    seng2200.ProducerLeg intervertebral =
        new seng2200.InterimLap("S1", q01, q02, this.meanspirited, this.wander, this.management);
    seng2200.ProducerLeg s2a =
        new seng2200.InterimLap(
            "S2a", q02, q03, this.meanspirited * 2, this.wander * 2, this.management);
    seng2200.ProducerLeg s2b =
        new seng2200.InterimLap(
            "S2b", q02, q03, this.meanspirited, this.wander * 0.5, this.management);
    seng2200.ProducerLeg l3 =
        new seng2200.InterimLap("S3", q03, q04, this.meanspirited, this.wander, this.management);
    seng2200.ProducerLeg s4a =
        new seng2200.InterimLap(
            "S4a", q04, q05, this.meanspirited, this.wander * 0.5, this.management);
    seng2200.ProducerLeg s4b =
        new seng2200.InterimLap(
            "S4b", q04, q05, this.meanspirited * 2, this.wander * 2, this.management);
    seng2200.ProducerLeg s10 =
        new seng2200.EndStagecoach(
            "S5", q05, this.meanspirited, this.wander, this.jabUsa, this.management);
    frequency.primedCorrectlySpurring(intervertebral);
    intervertebral.placeDepartedUrges(frequency);
    intervertebral.primedCorrectlySpurring(s2a);
    intervertebral.primedCorrectlySpurring(s2b);
    s2a.placeDepartedUrges(intervertebral);
    s2a.primedCorrectlySpurring(l3);
    s2b.placeDepartedUrges(intervertebral);
    s2b.primedCorrectlySpurring(l3);
    l3.placeDepartedUrges(s2a);
    l3.placeDepartedUrges(s2b);
    l3.primedCorrectlySpurring(s4a);
    l3.primedCorrectlySpurring(s4b);
    s4a.placeDepartedUrges(l3);
    s4a.primedCorrectlySpurring(s10);
    s4b.placeDepartedUrges(l3);
    s4b.primedCorrectlySpurring(s10);
    s10.placeDepartedUrges(s4a);
    s10.placeDepartedUrges(s4b);
    this.impelLimelightDocket.add(frequency);
    this.impelLimelightDocket.add(intervertebral);
    this.impelLimelightDocket.add(s2a);
    this.impelLimelightDocket.add(s2b);
    this.impelLimelightDocket.add(l3);
    this.impelLimelightDocket.add(s4a);
    this.impelLimelightDocket.add(s4b);
    this.impelLimelightDocket.add(s10);
  }

  private synchronized void impressPointStatistics() {
    java.lang.StringBuilder sb1 = new java.lang.StringBuilder();
    out.println("1) Production Stages");
    java.lang.String primaryFormat1 = "%-15s%-15s%-15s%-15s%-15s%-15s";
    java.lang.String particularFormat1 = "%6.3f";
    java.lang.String urges = null, thirst = null, interference = null;
    out.println(
        format(primaryFormat1, "Stage", "State", "Prod(%)", "Starve(t)", "Block(t)", "Total time"));
    for (seng2200.ProducerLeg fh : this.impelLimelightDocket) {
      urges = format(particularFormat1, fh.drawSpotlightTdsProduces()) + "%";
      thirst = format(particularFormat1, fh.developSceneTotEat());
      interference = format(particularFormat1, fh.generateRostrumAbsolutePrevented());
      sb1.append(
          format(
              primaryFormat1,
              fh.startFarmersSurname(),
              fh.comeNation(),
              urges,
              thirst,
              interference,
              format(particularFormat1, fh.startCumulativeMinutesUndertaking())));
      sb1.append("\n");
    }
    out.println(sb1.toString());
  }

  private synchronized void publishIsqClock() {
    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
    out.println("2) ISQ's");
    java.lang.String primaryFormat2 = "%-15s%-15s%-15s%-15s";
    java.lang.String particularFormat2 = "%6.3f";
    java.lang.String pseudonym = null, afiHours = null, telSouvenirs = null;
    java.lang.String reckon = null;
    out.println(format(primaryFormat2, "ISQ", "Item Count", "ave(t)", "ave(items)"));
    for (seng2200.BuryPhaseStorehouse q : this.isqNumber) {
      pseudonym = q.comeList();
      afiHours = format(particularFormat2, q.goIsqWaitingClock());
      telSouvenirs = format(particularFormat2, q.goIsqAverageParticularTally());
      reckon =
          (q.isComplete())
              ? format("%-5s%-5s", q.bringOngoingEnumerate(), "FULL")
              : java.lang.Integer.toString(q.bringOngoingEnumerate());
      sb2.append(format(primaryFormat2, pseudonym, reckon, afiHours, telSouvenirs));
      sb2.append("\n");
    }
    out.println(sb2.toString());
  }

  private synchronized void mailRbisConsignments() {
    for (seng2200.BuryPhaseStorehouse q : this.isqNumber) synx288(q);
  }

  private synchronized void printerTrackWeigh() {
    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
    out.println("3) Paths");
    java.lang.String primaryFormat3 = "%-30s%-15s";
    out.println(format(primaryFormat3, "Path", "total Items"));
    java.util.Map<String, Double> careers = this.jabUsa.startWaysTell();
    for (Entry<String, Double> entryway : careers.entrySet())
      synx289(sb3, primaryFormat3, entryway);
    out.println(sb3.toString());
  }

  private synchronized void printableUnemployedElements() {
    out.println("4) Job Count: " + this.management.findChoreWeigh());
    out.println(format(this.management.driveBrailleForm(), "Job", "Remaining Duration"));
    out.println(this.management.comeMaterial());
  }

  private synchronized void publishPrevailingClock() {
    out.println("Current time: " + format("%6.3f", this.management.fetchPresentBeginning()));
  }

  private synchronized void publishingIdentity() {
    out.println("Simulation's Final Snapshot");
    this.publishPrevailingClock();
    this.impressPointStatistics();
    this.publishIsqClock();
    this.printerTrackWeigh();
    this.printableUnemployedElements();
    out.println("Total items Created: " + this.impelLimelightDocket.get(0).findGrossPointSpawned());
    out.println("Total Items Finished: " + this.jabUsa.beatPercentageParts());

    try {
      sleep(100);
    } catch (java.lang.InterruptedException cma) {
      err.println(cma);
    }
  }

  private synchronized void synx284() {
    this.read = new java.util.Scanner(in);
  }

  private synchronized void synx285(ProducerLeg writes, ProducerLeg pointPolished) {

    if (writes != pointPolished) writes.unkTellSah(this.management.fetchPresentBeginning());
  }

  private synchronized void synx286() {
    this.publishingIdentity();
    read.nextLine();
  }

  private synchronized void synx287(ProducerLeg ora) {
    ora.phaseArticle(this.management.fetchPresentBeginning());
  }

  private synchronized void synx288(BuryPhaseStorehouse q) {
    q.pestleConsider();
  }

  private synchronized void synx289(
      StringBuilder sb3, String primaryFormat3, java.util.Map.Entry<String, Double> entryway) {
    sb3.append(format(primaryFormat3, entryway.getKey(), entryway.getValue()));
    sb3.append("\n");
  }
}
