package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Map.Entry;
import static java.lang.System.out;
import static java.lang.System.err;
import static java.lang.System.in;

public class ProducersWrinkleManger {
  public double signify = 0.0;
  public double rove = 0.0;
  public int maximumQ = 0;
  public java.util.ArrayList<SupplyArena> elbowStepListings = null;
  public java.util.ArrayList<MainlyStagecoachStored> isqNumber = null;
  public seng2200.Callback priority = null;
  public seng2200.ProducedThermostat nudgeStatistic = null;
  public final double FullWhen = 10000000;
  public boolean IS_Bug = false;
  public java.util.Scanner bookworm = null;

  public ProducersWrinkleManger() {
    this.signify = 0;
    this.rove = 0;
    this.maximumQ = 0;
  }

  public ProducersWrinkleManger(double stingy, double stray, int maximumQDuration) {
    this.signify = stingy;
    this.rove = stray;
    this.maximumQ = maximumQDuration;
    this.elbowStepListings = new java.util.ArrayList<SupplyArena>();
    this.isqNumber = new java.util.ArrayList<MainlyStagecoachStored>();
    this.nudgeStatistic = new seng2200.ProducedThermostat(this.elbowStepListings);
    this.priority = new seng2200.Callback(8);
  }

  public synchronized void initiateBring() {
    seng2200.SupplyArena pointPolished = null;
    this.catalyzeProcessingSystem();

    if (IS_Bug) synx24();

    while (this.priority.findActualSentence() < this.FullWhen) {
      this.appendageGradual();
      pointPolished = this.priority.doFollowingEmployment();
      for (seng2200.SupplyArena postscript : this.elbowStepListings)
        synx25(postscript, pointPolished);
      this.castMediaMaterials();

      if (IS_Bug == true) synx26();
    }
    this.publicationsRecognition();

    if (bookworm != null) bookworm.close();
  }

  public synchronized void appendageGradual() {
    for (seng2200.SupplyArena fh : this.elbowStepListings) synx27(fh);
  }

  public synchronized void catalyzeProcessingSystem() {
    seng2200.MainlyStagecoachStored q01 = null, q02 = null, q03 = null, q04 = null, q05 = null;
    q01 = new seng2200.MainlyStagecoachStored("Q01", this.maximumQ);
    q02 = new seng2200.MainlyStagecoachStored("Q12", this.maximumQ);
    q03 = new seng2200.MainlyStagecoachStored("Q23", this.maximumQ);
    q04 = new seng2200.MainlyStagecoachStored("Q34", this.maximumQ);
    q05 = new seng2200.MainlyStagecoachStored("Q45", this.maximumQ);
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    seng2200.SupplyArena l6 =
        new seng2200.BeganInstar("S0", q01, this.signify, this.rove, this.priority);
    seng2200.SupplyArena fsh =
        new seng2200.IntermediateLeg("S1", q01, q02, this.signify, this.rove, this.priority);
    seng2200.SupplyArena s2a =
        new seng2200.IntermediateLeg(
            "S2a", q02, q03, this.signify * 2, this.rove * 2, this.priority);
    seng2200.SupplyArena s2b =
        new seng2200.IntermediateLeg("S2b", q02, q03, this.signify, this.rove * 0.5, this.priority);
    seng2200.SupplyArena s10 =
        new seng2200.IntermediateLeg("S3", q03, q04, this.signify, this.rove, this.priority);
    seng2200.SupplyArena s4a =
        new seng2200.IntermediateLeg("S4a", q04, q05, this.signify, this.rove * 0.5, this.priority);
    seng2200.SupplyArena s4b =
        new seng2200.IntermediateLeg(
            "S4b", q04, q05, this.signify * 2, this.rove * 2, this.priority);
    seng2200.SupplyArena lll =
        new seng2200.LaterLevel(
            "S5", q05, this.signify, this.rove, this.nudgeStatistic, this.priority);
    l6.fixedStarboardOriented(fsh);
    fsh.markPortPush(l6);
    fsh.fixedStarboardOriented(s2a);
    fsh.fixedStarboardOriented(s2b);
    s2a.markPortPush(fsh);
    s2a.fixedStarboardOriented(s10);
    s2b.markPortPush(fsh);
    s2b.fixedStarboardOriented(s10);
    s10.markPortPush(s2a);
    s10.markPortPush(s2b);
    s10.fixedStarboardOriented(s4a);
    s10.fixedStarboardOriented(s4b);
    s4a.markPortPush(s10);
    s4a.fixedStarboardOriented(lll);
    s4b.markPortPush(s10);
    s4b.fixedStarboardOriented(lll);
    lll.markPortPush(s4a);
    lll.markPortPush(s4b);
    this.elbowStepListings.add(l6);
    this.elbowStepListings.add(fsh);
    this.elbowStepListings.add(s2a);
    this.elbowStepListings.add(s2b);
    this.elbowStepListings.add(s10);
    this.elbowStepListings.add(s4a);
    this.elbowStepListings.add(s4b);
    this.elbowStepListings.add(lll);
  }

  public synchronized void copySpotlightOxygen() {
    java.lang.StringBuilder sb1 = new java.lang.StringBuilder();
    out.println("1) Production Stages");
    java.lang.String primaryFormat1 = "%-15s%-15s%-15s%-15s%-15s%-15s";
    java.lang.String particularFormat1 = "%6.3f";
    java.lang.String push = null, deplete = null, hinder = null;
    out.println(
        java.lang.String.format(
            primaryFormat1, "Stage", "State", "Prod(%)", "Starve(t)", "Block(t)", "Total time"));
    for (seng2200.SupplyArena waffen : this.elbowStepListings) {
      push = java.lang.String.format(particularFormat1, waffen.produceScaleEastProcessing()) + "%";
      deplete =
          java.lang.String.format(particularFormat1, waffen.sustainTheatricalEstimatedDehydrate());
      hinder = java.lang.String.format(particularFormat1, waffen.bringPointAggregateBlockaded());
      sb1.append(
          java.lang.String.format(
              primaryFormat1,
              waffen.makeStabIdentify(),
              waffen.obtainSay(),
              push,
              deplete,
              hinder,
              java.lang.String.format(
                  particularFormat1, waffen.fetchCombinedBeginningDeployment())));
      sb1.append("\n");
    }
    out.println(sb1.toString());
  }

  public synchronized void publishIsqClock() {
    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
    out.println("2) ISQ's");
    java.lang.String primaryFormat2 = "%-15s%-15s%-15s%-15s";
    java.lang.String particularFormat2 = "%6.3f";
    java.lang.String advert = null, wabashMinutes = null, blvdParticular = null;
    java.lang.String consider = null;
    out.println(
        java.lang.String.format(primaryFormat2, "ISQ", "Item Count", "ave(t)", "ave(items)"));
    for (seng2200.MainlyStagecoachStored q : this.isqNumber) {
      advert = q.receiveNominate();
      wabashMinutes = java.lang.String.format(particularFormat2, q.goIsqWaitingClock());
      blvdParticular = java.lang.String.format(particularFormat2, q.goIsqAverageParticularTally());
      consider =
          (q.isComplete())
              ? java.lang.String.format("%-5s%-5s", q.fetchPresentQuantify(), "FULL")
              : java.lang.Integer.toString(q.fetchPresentQuantify());
      sb2.append(
          java.lang.String.format(primaryFormat2, advert, consider, wabashMinutes, blvdParticular));
      sb2.append("\n");
    }
    out.println(sb2.toString());
  }

  public synchronized void castMediaMaterials() {
    for (seng2200.MainlyStagecoachStored q : this.isqNumber) synx28(q);
  }

  public synchronized void publicationLanesIndictment() {
    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
    out.println("3) Paths");
    java.lang.String primaryFormat3 = "%-30s%-15s";
    out.println(java.lang.String.format(primaryFormat3, "Path", "total Items"));
    java.util.Map<String, Double> lanes = this.nudgeStatistic.comeWayNumber();
    for (Entry<String, Double> ingress : lanes.entrySet()) synx29(sb3, primaryFormat3, ingress);
    out.println(sb3.toString());
  }

  public synchronized void reprintingAssignmentsAspects() {
    out.println("4) Job Count: " + this.priority.driveWorkloadFigures());
    out.println(
        java.lang.String.format(
            this.priority.producePrintableParadigm(), "Job", "Remaining Duration"));
    out.println(this.priority.conveyBibliography());
  }

  public synchronized void brailleContinuingAgain() {
    out.println(
        "Current time: " + java.lang.String.format("%6.3f", this.priority.findActualSentence()));
  }

  public synchronized void publicationsRecognition() {
    out.println("Simulation's Final Snapshot");
    this.brailleContinuingAgain();
    this.copySpotlightOxygen();
    this.publishIsqClock();
    this.publicationLanesIndictment();
    this.reprintingAssignmentsAspects();
    out.println(
        "Total items Created: " + this.elbowStepListings.get(0).haveEntireBelongingsFostered());
    out.println("Total Items Finished: " + this.nudgeStatistic.developTotThings());

    try {
      java.lang.Thread.sleep(100);
    } catch (java.lang.InterruptedException ye) {
      err.println(ye);
    }
  }

  private synchronized void synx24() {
    this.bookworm = new java.util.Scanner(in);
  }

  private synchronized void synx25(SupplyArena postscript, SupplyArena pointPolished) {

    if (postscript != pointPolished)
      postscript.incorporatedNationalDus(this.priority.findActualSentence());
  }

  private synchronized void synx26() {
    this.publicationsRecognition();
    bookworm.nextLine();
  }

  private synchronized void synx27(SupplyArena fh) {
    fh.outgrowthElement(this.priority.findActualSentence());
  }

  private synchronized void synx28(MainlyStagecoachStored q) {
    q.affixTell();
  }

  private synchronized void synx29(
      StringBuilder sb3, String primaryFormat3, java.util.Map.Entry<String, Double> ingress) {
    sb3.append(java.lang.String.format(primaryFormat3, ingress.getKey(), ingress.getValue()));
    sb3.append("\n");
  }
}
