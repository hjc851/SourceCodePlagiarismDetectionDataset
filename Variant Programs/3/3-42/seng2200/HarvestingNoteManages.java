package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;

public class HarvestingNoteManages {
  public Scanner reading;
  public boolean IS_Bug;
  public final double MaximizeDays = 10000000;
  public FactoryJak farmQuickly;
  public Compiler and;
  public ArrayList<EnterPerformingGarage> isqNumber;
  public ArrayList<ThroughputLap> operatorsJunctureCatalog;
  public int maximumQ;
  public double swan;
  public double normal;

  public HarvestingNoteManages() {
    this.normal = (0);
    this.swan = (0);
    this.maximumQ = (0);
  }

  public HarvestingNoteManages(double awful, double rate, int maximumQDuration) {
    this.normal = (awful);
    this.swan = (rate);
    this.maximumQ = (maximumQDuration);
    this.operatorsJunctureCatalog = (new ArrayList<ThroughputLap>());
    this.isqNumber = (new ArrayList<EnterPerformingGarage>());
    this.farmQuickly = (new FactoryJak(this.operatorsJunctureCatalog));
    this.and = (new Compiler(8));
  }

  public synchronized void restartAddress() {
    ThroughputLap scaleThrough;
    this.inspireProductivityShape();

    if (IS_Bug) synx484();

    while (this.and.comeLatestClip() < this.MaximizeDays) {
      this.cycleTerm();
      scaleThrough = (this.and.performanceAdjacentProblem());
      for (ThroughputLap cern : this.operatorsJunctureCatalog) synx485(cern, scaleThrough);
      this.moldMeanObjects();

      if (IS_Bug == true) synx486();
    }
    this.publicationProfile();

    if (reading != null) reading.close();
  }

  public synchronized void cycleTerm() {
    for (ThroughputLap ora : this.operatorsJunctureCatalog) synx487(ora);
  }

  public synchronized void inspireProductivityShape() {
    EnterPerformingGarage q01, q02, q03, q04, q05;
    ThroughputLap l5;
    ThroughputLap l4;
    ThroughputLap s2a;
    ThroughputLap s2b;
    ThroughputLap mm;
    ThroughputLap s4a;
    ThroughputLap s4b;
    ThroughputLap kev;
    q01 = (new EnterPerformingGarage("Q01", this.maximumQ));
    q02 = (new EnterPerformingGarage("Q12", this.maximumQ));
    q03 = (new EnterPerformingGarage("Q23", this.maximumQ));
    q04 = (new EnterPerformingGarage("Q34", this.maximumQ));
    q05 = (new EnterPerformingGarage("Q45", this.maximumQ));
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    l5 = (new DepartPodium("S0", q01, this.normal, this.swan, this.and));
    l4 = (new MesoJuncture("S1", q01, q02, this.normal, this.swan, this.and));
    s2a = (new MesoJuncture("S2a", q02, q03, this.normal * 2, this.swan * 2, this.and));
    s2b = (new MesoJuncture("S2b", q02, q03, this.normal, this.swan * 0.5, this.and));
    mm = (new MesoJuncture("S3", q03, q04, this.normal, this.swan, this.and));
    s4a = (new MesoJuncture("S4a", q04, q05, this.normal, this.swan * 0.5, this.and));
    s4b = (new MesoJuncture("S4b", q04, q05, this.normal * 2, this.swan * 2, this.and));
    kev = (new ConcludingArena("S5", q05, this.normal, this.swan, this.farmQuickly, this.and));
    l5.adjustMoralStimulate(l4);
    l4.fixedBoltedOriented(l5);
    l4.adjustMoralStimulate(s2a);
    l4.adjustMoralStimulate(s2b);
    s2a.fixedBoltedOriented(l4);
    s2a.adjustMoralStimulate(mm);
    s2b.fixedBoltedOriented(l4);
    s2b.adjustMoralStimulate(mm);
    mm.fixedBoltedOriented(s2a);
    mm.fixedBoltedOriented(s2b);
    mm.adjustMoralStimulate(s4a);
    mm.adjustMoralStimulate(s4b);
    s4a.fixedBoltedOriented(mm);
    s4a.adjustMoralStimulate(kev);
    s4b.fixedBoltedOriented(mm);
    s4b.adjustMoralStimulate(kev);
    kev.fixedBoltedOriented(s4a);
    kev.fixedBoltedOriented(s4b);
    this.operatorsJunctureCatalog.add(l5);
    this.operatorsJunctureCatalog.add(l4);
    this.operatorsJunctureCatalog.add(s2a);
    this.operatorsJunctureCatalog.add(s2b);
    this.operatorsJunctureCatalog.add(mm);
    this.operatorsJunctureCatalog.add(s4a);
    this.operatorsJunctureCatalog.add(s4b);
    this.operatorsJunctureCatalog.add(kev);
  }

  public synchronized void braillePerformingQuickly() {
    StringBuilder sb1;
    String primaryFormat1;
    String particularFormat1;
    String stir, faim, stuff;
    sb1 = (new StringBuilder());
    System.out.println("1) Production Stages");
    primaryFormat1 = ("%-15s%-15s%-15s%-15s%-15s%-15s");
    particularFormat1 = ("%6.3f");
    System.out.println(
        String.format(
            primaryFormat1, "Stage", "State", "Prod(%)", "Starve(t)", "Block(t)", "Total time"));
    for (ThroughputLap fh : this.operatorsJunctureCatalog) {
      stir = (String.format(particularFormat1, fh.drawSpotlightTdsProduces()) + "%");
      faim = (String.format(particularFormat1, fh.comeLevelOverallThirst()));
      stuff = (String.format(particularFormat1, fh.produceScaleAddDisrupted()));
      sb1.append(
          String.format(
              primaryFormat1,
              fh.driveFarmNickname(),
              fh.canSovereign(),
              stir,
              faim,
              stuff,
              String.format(particularFormat1, fh.obtainSumDaysOperate())));
      sb1.append("\n");
    }
    System.out.println(sb1.toString());
  }

  public synchronized void publishIsqClock() {
    StringBuilder sb2;
    String primaryFormat2;
    String particularFormat2;
    String cite, boulDay, approxNecessities;
    String tabulation;
    sb2 = (new StringBuilder());
    System.out.println("2) ISQ's");
    primaryFormat2 = ("%-15s%-15s%-15s%-15s");
    particularFormat2 = ("%6.3f");
    System.out.println(String.format(primaryFormat2, "ISQ", "Item Count", "ave(t)", "ave(items)"));
    for (EnterPerformingGarage q : this.isqNumber) {
      cite = (q.becomeConstitute());
      boulDay = (String.format(particularFormat2, q.goIsqWaitingClock()));
      approxNecessities = (String.format(particularFormat2, q.goIsqAverageParticularTally()));
      tabulation =
          ((q.isComplete())
              ? String.format("%-5s%-5s", q.takeTopicalConsider(), "FULL")
              : Integer.toString(q.takeTopicalConsider()));
      sb2.append(String.format(primaryFormat2, cite, tabulation, boulDay, approxNecessities));
      sb2.append("\n");
    }
    System.out.println(sb2.toString());
  }

  public synchronized void moldMeanObjects() {
    for (EnterPerformingGarage q : this.isqNumber) synx488(q);
  }

  public synchronized void publicationLanesIndictment() {
    StringBuilder sb3;
    String primaryFormat3;
    Map<String, Double> directions;
    sb3 = (new StringBuilder());
    System.out.println("3) Paths");
    primaryFormat3 = ("%-30s%-15s");
    System.out.println(String.format(primaryFormat3, "Path", "total Items"));
    directions = (this.farmQuickly.takeTrailConsider());
    for (Map.Entry<String, Double> admittance : directions.entrySet())
      synx489(sb3, primaryFormat3, admittance);
    System.out.println(sb3.toString());
  }

  public synchronized void publishWorkContained() {
    System.out.println("4) Job Count: " + this.and.takeCaperConsider());
    System.out.println(
        String.format(this.and.producePrintableParadigm(), "Job", "Remaining Duration"));
    System.out.println(this.and.bringItems());
  }

  public synchronized void fontNewChance() {
    System.out.println("Current time: " + String.format("%6.3f", this.and.comeLatestClip()));
  }

  public synchronized void publicationProfile() {
    System.out.println("Simulation's Final Snapshot");
    this.fontNewChance();
    this.braillePerformingQuickly();
    this.publishIsqClock();
    this.publicationLanesIndictment();
    this.publishWorkContained();
    System.out.println(
        "Total items Created: "
            + this.operatorsJunctureCatalog.get(0).fetchCombinedEquipmentCaused());
    System.out.println("Total Items Finished: " + this.farmQuickly.drawUnconditionalAccessories());

    try {
      Thread.sleep(100);
    } catch (InterruptedException samad) {
      System.err.println(samad);
    }
  }

  {
    IS_Bug = (false);
  }

  private synchronized void synx484() {
    this.reading = (new Scanner(System.in));
  }

  private synchronized void synx485(ThroughputLap cern, ThroughputLap scaleThrough) {

    if (cern != scaleThrough) cern.incorporatedNationalDus(this.and.comeLatestClip());
  }

  private synchronized void synx486() {
    this.publicationProfile();
    reading.nextLine();
  }

  private synchronized void synx487(ThroughputLap ora) {
    ora.appendageGoods(this.and.comeLatestClip());
  }

  private synchronized void synx488(EnterPerformingGarage q) {
    q.moldMatter();
  }

  private synchronized void synx489(
      StringBuilder sb3, String primaryFormat3, java.util.Map.Entry<String, Double> admittance) {
    sb3.append(String.format(primaryFormat3, admittance.getKey(), admittance.getValue()));
    sb3.append("\n");
  }
}
