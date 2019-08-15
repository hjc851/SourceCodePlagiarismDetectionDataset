package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Map.Entry;

public class FabricationLineageChairman {

  private synchronized void printerPresentQuick() {
    java.lang.StringBuilder sb1 = new java.lang.StringBuilder();
    System.out.println("1) Production Stages");
    java.lang.String primaryFormat1 = "%-15s%-15s%-15s%-15s%-15s%-15s";
    java.lang.String particularFormat1 = "%6.3f";
    java.lang.String jab, impoverish, interference;
    System.out.println(
        java.lang.String.format(
            primaryFormat1, "Stage", "State", "Prod(%)", "Starve(t)", "Block(t)", "Total time"));
    for (seng2200.CultivationScene waffen : this.operatorsJunctureCatalog) {
      jab = (java.lang.String.format(particularFormat1, waffen.findPresentMedianProducers()) + "%");
      impoverish =
          (java.lang.String.format(particularFormat1, waffen.startPlaceCumulativeImpoverish()));
      interference = (java.lang.String.format(particularFormat1, waffen.letTheaterWholeHalted()));
      sb1.append(
          java.lang.String.format(
              primaryFormat1,
              waffen.receiveGoadingNominate(),
              waffen.generateFederal(),
              jab,
              impoverish,
              interference,
              java.lang.String.format(particularFormat1, waffen.developTotHourProject())));
      sb1.append("\n");
    }
    System.out.println(sb1.toString());
  }

  private java.util.ArrayList<BuryPhaseStorehouse> isqNumber;

  private synchronized void buildManufacturingBuilding() {
    seng2200.BuryPhaseStorehouse q01, q02, q03, q04, q05;
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
    seng2200.CultivationScene fsh =
        new seng2200.JumpMoment("S0", q01, this.hateful, this.scope, this.salon);
    seng2200.CultivationScene c7 =
        new seng2200.DimPhases("S1", q01, q02, this.hateful, this.scope, this.salon);
    seng2200.CultivationScene s2a =
        new seng2200.DimPhases("S2a", q02, q03, this.hateful * 2, this.scope * 2, this.salon);
    seng2200.CultivationScene s2b =
        new seng2200.DimPhases("S2b", q02, q03, this.hateful, this.scope * 0.5, this.salon);
    seng2200.CultivationScene vii =
        new seng2200.DimPhases("S3", q03, q04, this.hateful, this.scope, this.salon);
    seng2200.CultivationScene s4a =
        new seng2200.DimPhases("S4a", q04, q05, this.hateful, this.scope * 0.5, this.salon);
    seng2200.CultivationScene s4b =
        new seng2200.DimPhases("S4b", q04, q05, this.hateful * 2, this.scope * 2, this.salon);
    seng2200.CultivationScene s10 =
        new seng2200.LatestMoment(
            "S5", q05, this.hateful, this.scope, this.pokeStatistics, this.salon);
    fsh.layDecentGoading(c7);
    c7.prepareRightUrge(fsh);
    c7.layDecentGoading(s2a);
    c7.layDecentGoading(s2b);
    s2a.prepareRightUrge(c7);
    s2a.layDecentGoading(vii);
    s2b.prepareRightUrge(c7);
    s2b.layDecentGoading(vii);
    vii.prepareRightUrge(s2a);
    vii.prepareRightUrge(s2b);
    vii.layDecentGoading(s4a);
    vii.layDecentGoading(s4b);
    s4a.prepareRightUrge(vii);
    s4a.layDecentGoading(s10);
    s4b.prepareRightUrge(vii);
    s4b.layDecentGoading(s10);
    s10.prepareRightUrge(s4a);
    s10.prepareRightUrge(s4b);
    this.operatorsJunctureCatalog.add(fsh);
    this.operatorsJunctureCatalog.add(c7);
    this.operatorsJunctureCatalog.add(s2a);
    this.operatorsJunctureCatalog.add(s2b);
    this.operatorsJunctureCatalog.add(vii);
    this.operatorsJunctureCatalog.add(s4a);
    this.operatorsJunctureCatalog.add(s4b);
    this.operatorsJunctureCatalog.add(s10);
  }

  private seng2200.ManufactureUsa pokeStatistics;
  private double scope;

  private synchronized void mediaLevel() {
    System.out.println("Simulation's Final Snapshot");
    this.catalogTheOpportunity();
    this.printerPresentQuick();
    this.publishIsqClock();
    this.impressCourseEnumerate();
    this.engravingTasksProvisions();
    System.out.println(
        "Total items Created: "
            + this.operatorsJunctureCatalog.get(0).driveMillionUtensilsConstituted());
    System.out.println("Total Items Finished: " + this.pokeStatistics.receiveNumberGoods());

    try {
      java.lang.Thread.sleep(100);
    } catch (java.lang.InterruptedException einsteinium) {
      System.err.println(einsteinium);
    }
  }

  private int maximumQ;
  private final double MattAgain = 10000000;

  private synchronized void engravingTasksProvisions() {
    System.out.println("4) Job Count: " + this.salon.fixEmployerTotal());
    System.out.println(
        java.lang.String.format(this.salon.obtainPublishingStyle(), "Job", "Remaining Duration"));
    System.out.println(this.salon.arriveSubstances());
  }

  private synchronized void couponBestsParts() {
    for (seng2200.BuryPhaseStorehouse q : this.isqNumber) synx444(q);
  }

  private boolean IS_Bug = false;
  private seng2200.Developer salon;

  FabricationLineageChairman() {
    this.hateful = (0);
    this.scope = (0);
    this.maximumQ = (0);
  }

  private synchronized void impressCourseEnumerate() {
    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
    System.out.println("3) Paths");
    java.lang.String primaryFormat3 = "%-30s%-15s";
    System.out.println(java.lang.String.format(primaryFormat3, "Path", "total Items"));
    java.util.Map<String, Double> passageways = this.pokeStatistics.obtainRoutesMatter();
    for (Entry<String, Double> registration : passageways.entrySet())
      synx445(sb3, primaryFormat3, registration);
    System.out.println(sb3.toString());
  }

  private synchronized void catalogTheOpportunity() {
    System.out.println(
        "Current time: " + java.lang.String.format("%6.3f", this.salon.fetchPresentBeginning()));
  }

  private synchronized void publishIsqClock() {
    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
    System.out.println("2) ISQ's");
    java.lang.String primaryFormat2 = "%-15s%-15s%-15s%-15s";
    java.lang.String particularFormat2 = "%6.3f";
    java.lang.String list, birdBeginning, chickenComponents;
    java.lang.String rely;
    System.out.println(
        java.lang.String.format(primaryFormat2, "ISQ", "Item Count", "ave(t)", "ave(items)"));
    for (seng2200.BuryPhaseStorehouse q : this.isqNumber) {
      list = (q.beatPatronymic());
      birdBeginning = (java.lang.String.format(particularFormat2, q.goIsqWaitingClock()));
      chickenComponents =
          (java.lang.String.format(particularFormat2, q.goIsqAverageParticularTally()));
      rely =
          ((q.isComplete())
              ? java.lang.String.format("%-5s%-5s", q.comeLatestNumber(), "FULL")
              : java.lang.Integer.toString(q.comeLatestNumber()));
      sb2.append(
          java.lang.String.format(primaryFormat2, list, rely, birdBeginning, chickenComponents));
      sb2.append("\n");
    }
    System.out.println(sb2.toString());
  }

  private double hateful;

  public synchronized void beginJob() {
    seng2200.CultivationScene theaterOver;
    this.buildManufacturingBuilding();

    if (IS_Bug) synx446();

    while (this.salon.fetchPresentBeginning() < this.MattAgain) {
      this.sueMilestone();
      theaterOver = (this.salon.workNewGig());
      for (seng2200.CultivationScene vig : this.operatorsJunctureCatalog) synx447(vig, theaterOver);
      this.couponBestsParts();

      if (IS_Bug == true) synx448();
    }
    this.mediaLevel();

    if (readout != null) readout.close();
  }

  private java.util.Scanner readout;
  private java.util.ArrayList<CultivationScene> operatorsJunctureCatalog;

  private synchronized void sueMilestone() {
    for (seng2200.CultivationScene fh : this.operatorsJunctureCatalog) synx449(fh);
  }

  FabricationLineageChairman(double entail, double rank, int maximumQDuration) {
    this.hateful = (entail);
    this.scope = (rank);
    this.maximumQ = (maximumQDuration);
    this.operatorsJunctureCatalog = (new java.util.ArrayList<CultivationScene>());
    this.isqNumber = (new java.util.ArrayList<BuryPhaseStorehouse>());
    this.pokeStatistics = (new seng2200.ManufactureUsa(this.operatorsJunctureCatalog));
    this.salon = (new seng2200.Developer(8));
  }

  private synchronized void synx444(BuryPhaseStorehouse q) {
    q.stompWeigh();
  }

  private synchronized void synx445(
      StringBuilder sb3, String primaryFormat3, java.util.Map.Entry<String, Double> registration) {
    sb3.append(
        java.lang.String.format(primaryFormat3, registration.getKey(), registration.getValue()));
    sb3.append("\n");
  }

  private synchronized void synx446() {
    this.readout = (new java.util.Scanner(System.in));
  }

  private synchronized void synx447(CultivationScene vig, CultivationScene theaterOver) {

    if (vig != theaterOver) vig.ingSayRough(this.salon.fetchPresentBeginning());
  }

  private synchronized void synx448() {
    this.mediaLevel();
    readout.nextLine();
  }

  private synchronized void synx449(CultivationScene fh) {
    fh.cycleAgenda(this.salon.fetchPresentBeginning());
  }
}
