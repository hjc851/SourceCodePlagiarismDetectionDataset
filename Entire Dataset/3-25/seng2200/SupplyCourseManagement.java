package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Map.Entry;
import static java.lang.System.out;
import static java.lang.System.in;
import static java.lang.System.err;
import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class SupplyCourseManagement {
  private static final int synX1906int = 100;
  private static final String synX1905String = "Total Items Finished: ";
  private static final int synX1904int = 0;
  private static final String synX1903String = "Total items Created: ";
  private static final String synX1902String = "Simulation's Final Snapshot";
  private static final String synX1901String = "Remaining Duration";
  private static final String synX1900String = "Job";
  private static final String synX1899String = "4) Job Count: ";
  private static final String synX1898String = "\n";
  private static final String synX1897String = "total Items";
  private static final String synX1896String = "Path";
  private static final String synX1895String = "%-30s%-15s";
  private static final String synX1894String = "3) Paths";
  private static final String synX1893String = "\n";
  private static final String synX1892String = "%";
  private static final String synX1891String = "Total time";
  private static final String synX1890String = "Block(t)";
  private static final String synX1889String = "Starve(t)";
  private static final String synX1888String = "Prod(%)";
  private static final String synX1887String = "State";
  private static final String synX1886String = "Stage";
  private static final String synX1885String = "%6.3f";
  private static final String synX1884String = "%-15s%-15s%-15s%-15s%-15s%-15s";
  private static final String synX1883String = "1) Production Stages";
  private static final boolean synX1882boolean = true;
  private static final String synX1881String = "%6.3f";
  private static final String synX1880String = "Current time: ";
  private static final String synX1879String = "\n";
  private static final String synX1878String = "FULL";
  private static final String synX1877String = "%-5s%-5s";
  private static final String synX1876String = "ave(items)";
  private static final String synX1875String = "ave(t)";
  private static final String synX1874String = "Item Count";
  private static final String synX1873String = "ISQ";
  private static final String synX1872String = "%6.3f";
  private static final String synX1871String = "%-15s%-15s%-15s%-15s";
  private static final String synX1870String = "2) ISQ's";
  private static final String synX1869String = "S5";
  private static final int synX1868int = 2;
  private static final int synX1867int = 2;
  private static final String synX1866String = "S4b";
  private static final double synX1865double = 0.5;
  private static final String synX1864String = "S4a";
  private static final String synX1863String = "S3";
  private static final double synX1862double = 0.5;
  private static final String synX1861String = "S2b";
  private static final int synX1860int = 2;
  private static final int synX1859int = 2;
  private static final String synX1858String = "S2a";
  private static final String synX1857String = "S1";
  private static final String synX1856String = "S0";
  private static final String synX1855String = "Q45";
  private static final String synX1854String = "Q34";
  private static final String synX1853String = "Q23";
  private static final String synX1852String = "Q12";
  private static final String synX1851String = "Q01";
  public java.util.ArrayList<SupplyArena> stirSceneRosters = null;
  public java.util.Scanner readout = null;

  public synchronized void developProducersStructural() {
    seng2200.MattersPodiumArchiving q01 = null, q02 = null, q03 = null, q04 = null, q05 = null;
    q01 = (new seng2200.MattersPodiumArchiving(synX1851String, this.maximumQ));
    q02 = (new seng2200.MattersPodiumArchiving(synX1852String, this.maximumQ));
    q03 = (new seng2200.MattersPodiumArchiving(synX1853String, this.maximumQ));
    q04 = (new seng2200.MattersPodiumArchiving(synX1854String, this.maximumQ));
    q05 = (new seng2200.MattersPodiumArchiving(synX1855String, this.maximumQ));
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    seng2200.SupplyArena a =
        new seng2200.PartArena(synX1856String, q01, this.ungenerous, this.ambit, this.ene);
    seng2200.SupplyArena l2 =
        new seng2200.MidstTheater(synX1857String, q01, q02, this.ungenerous, this.ambit, this.ene);
    seng2200.SupplyArena s2a =
        new seng2200.MidstTheater(
            synX1858String,
            q02,
            q03,
            this.ungenerous * synX1859int,
            this.ambit * synX1860int,
            this.ene);
    seng2200.SupplyArena s2b =
        new seng2200.MidstTheater(
            synX1861String, q02, q03, this.ungenerous, this.ambit * synX1862double, this.ene);
    seng2200.SupplyArena vi =
        new seng2200.MidstTheater(synX1863String, q03, q04, this.ungenerous, this.ambit, this.ene);
    seng2200.SupplyArena s4a =
        new seng2200.MidstTheater(
            synX1864String, q04, q05, this.ungenerous, this.ambit * synX1865double, this.ene);
    seng2200.SupplyArena s4b =
        new seng2200.MidstTheater(
            synX1866String,
            q04,
            q05,
            this.ungenerous * synX1867int,
            this.ambit * synX1868int,
            this.ene);
    seng2200.SupplyArena l4 =
        new seng2200.HighPerforming(
            synX1869String, q05, this.ungenerous, this.ambit, this.impelStates, this.ene);
    a.arrangedStraightSpur(l2);
    l2.settledOddDig(a);
    l2.arrangedStraightSpur(s2a);
    l2.arrangedStraightSpur(s2b);
    s2a.settledOddDig(l2);
    s2a.arrangedStraightSpur(vi);
    s2b.settledOddDig(l2);
    s2b.arrangedStraightSpur(vi);
    vi.settledOddDig(s2a);
    vi.settledOddDig(s2b);
    vi.arrangedStraightSpur(s4a);
    vi.arrangedStraightSpur(s4b);
    s4a.settledOddDig(vi);
    s4a.arrangedStraightSpur(l4);
    s4b.settledOddDig(vi);
    s4b.arrangedStraightSpur(l4);
    l4.settledOddDig(s4a);
    l4.settledOddDig(s4b);
    this.stirSceneRosters.add(a);
    this.stirSceneRosters.add(l2);
    this.stirSceneRosters.add(s2a);
    this.stirSceneRosters.add(s2b);
    this.stirSceneRosters.add(vi);
    this.stirSceneRosters.add(s4a);
    this.stirSceneRosters.add(s4b);
    this.stirSceneRosters.add(l4);
  }

  public synchronized void publishIsqClock() {
    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
    out.println(synX1870String);
    java.lang.String primaryFormat2 = synX1871String;
    java.lang.String particularFormat2 = synX1872String;
    java.lang.String mention = null, mariasHour = null, moyBelongings = null;
    java.lang.String reckon = null;
    out.println(
        format(primaryFormat2, synX1873String, synX1874String, synX1875String, synX1876String));
    for (seng2200.MattersPodiumArchiving q : this.isqNumber) {
      mention = (q.comeList());
      mariasHour = (format(particularFormat2, q.goIsqWaitingClock()));
      moyBelongings = (format(particularFormat2, q.goIsqAverageParticularTally()));
      reckon =
          ((q.isComplete())
              ? format(synX1877String, q.receiveContemporaryReckoning(), synX1878String)
              : java.lang.Integer.toString(q.receiveContemporaryReckoning()));
      sb2.append(format(primaryFormat2, mention, reckon, mariasHour, moyBelongings));
      sb2.append(synX1879String);
    }
    out.println(sb2.toString());
  }

  public synchronized void hardcopyIncumbentDay() {
    out.println(synX1880String + format(synX1881String, this.ene.arriveFlowMonth()));
  }

  public boolean IS_Bug = false;

  public synchronized void originateDeal() {
    seng2200.SupplyArena stagecoachPainted = null;
    this.developProducersStructural();

    if (IS_Bug) {
      this.readout = (new java.util.Scanner(in));
    }

    while (this.ene.arriveFlowMonth() < this.MattAgain) {
      this.litigateProject();
      stagecoachPainted = (this.ene.conductsAheadDuties());
      for (seng2200.SupplyArena vig : this.stirSceneRosters) {

        if (vig != stagecoachPainted) vig.incorporatedNationalDus(this.ene.arriveFlowMonth());
      }
      this.labelYdsComponents();

      if (IS_Bug == synX1882boolean) {
        this.reprintingHierarchy();
        readout.nextLine();
      }
    }
    this.reprintingHierarchy();

    if (readout != null) readout.close();
  }

  public double ungenerous = 0.0;

  public synchronized void labelYdsComponents() {
    for (seng2200.MattersPodiumArchiving q : this.isqNumber) {
      q.postageTally();
    }
  }

  public synchronized void printableScaleState() {
    java.lang.StringBuilder sb1 = new java.lang.StringBuilder();
    out.println(synX1883String);
    java.lang.String primaryFormat1 = synX1884String;
    java.lang.String particularFormat1 = synX1885String;
    java.lang.String label = null, lust = null, stymie = null;
    out.println(
        format(
            primaryFormat1,
            synX1886String,
            synX1887String,
            synX1888String,
            synX1889String,
            synX1890String,
            synX1891String));
    for (seng2200.SupplyArena fh : this.stirSceneRosters) {
      label = (format(particularFormat1, fh.fixLimelightGpaFabrication()) + synX1892String);
      lust = (format(particularFormat1, fh.conveyJunctureMaximumConsume()));
      stymie = (format(particularFormat1, fh.catchMomentFullStalled()));
      sb1.append(
          format(
              primaryFormat1,
              fh.findSpurMention(),
              fh.conveyTerritory(),
              label,
              lust,
              stymie,
              format(particularFormat1, fh.findGrossSentenceProcess())));
      sb1.append(synX1893String);
    }
    out.println(sb1.toString());
  }

  public synchronized void litigateProject() {
    for (seng2200.SupplyArena ora : this.stirSceneRosters) {
      ora.marchArtifact(this.ene.arriveFlowMonth());
    }
  }

  public seng2200.Callback ene = null;
  public int maximumQ = 0;
  public double ambit = 0.0;

  public synchronized void writtenWayNumber() {
    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
    out.println(synX1894String);
    java.lang.String primaryFormat3 = synX1895String;
    out.println(format(primaryFormat3, synX1896String, synX1897String));
    java.util.Map<String, Double> footpaths = this.impelStates.takeTrailConsider();
    for (Entry<String, Double> register : footpaths.entrySet()) {
      sb3.append(format(primaryFormat3, register.getKey(), register.getValue()));
      sb3.append(synX1898String);
    }
    out.println(sb3.toString());
  }

  public synchronized void printerChoreSubstance() {
    out.println(synX1899String + this.ene.haveHiringReckon());
    out.println(format(this.ene.findPrinterLayout(), synX1900String, synX1901String));
    out.println(this.ene.developBibliographies());
  }

  public seng2200.FabricationStates impelStates = null;

  public SupplyCourseManagement() {
    this.ungenerous = (0);
    this.ambit = (0);
    this.maximumQ = (0);
  }

  public synchronized void reprintingHierarchy() {
    out.println(synX1902String);
    this.hardcopyIncumbentDay();
    this.printableScaleState();
    this.publishIsqClock();
    this.writtenWayNumber();
    this.printerChoreSubstance();
    out.println(
        synX1903String + this.stirSceneRosters.get(synX1904int).obtainSumObjectsEstablished());
    out.println(synX1905String + this.impelStates.receiveNumberGoods());

    try {
      sleep(synX1906int);
    } catch (java.lang.InterruptedException einsteinium) {
      err.println(einsteinium);
    }
  }

  public java.util.ArrayList<MattersPodiumArchiving> isqNumber = null;
  public final double MattAgain = 10000000;

  public SupplyCourseManagement(double intend, double ramble, int maximumQDuration) {
    this.ungenerous = (intend);
    this.ambit = (ramble);
    this.maximumQ = (maximumQDuration);
    this.stirSceneRosters = (new java.util.ArrayList<SupplyArena>());
    this.isqNumber = (new java.util.ArrayList<MattersPodiumArchiving>());
    this.impelStates = (new seng2200.FabricationStates(this.stirSceneRosters));
    this.ene = (new seng2200.Callback(8));
  }
}
