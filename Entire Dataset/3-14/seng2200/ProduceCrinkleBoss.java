package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class ProduceCrinkleBoss {
  private static final String synX1275String = "\n";
  private static final int synX1274int = 100;
  private static final String synX1273String = "Total Items Finished: ";
  private static final int synX1272int = 0;
  private static final String synX1271String = "Total items Created: ";
  private static final String synX1270String = "Simulation's Final Snapshot";
  private static final String synX1269String = "%6.3f";
  private static final String synX1268String = "Current time: ";
  private static final String synX1267String = "Remaining Duration";
  private static final String synX1266String = "Job";
  private static final String synX1265String = "4) Job Count: ";
  private static final String synX1264String = "total Items";
  private static final String synX1263String = "Path";
  private static final String synX1262String = "%-30s%-15s";
  private static final String synX1261String = "3) Paths";
  private static final String synX1260String = "\n";
  private static final String synX1259String = "FULL";
  private static final String synX1258String = "%-5s%-5s";
  private static final String synX1257String = "ave(items)";
  private static final String synX1256String = "ave(t)";
  private static final String synX1255String = "Item Count";
  private static final String synX1254String = "ISQ";
  private static final String synX1253String = "%6.3f";
  private static final String synX1252String = "%-15s%-15s%-15s%-15s";
  private static final String synX1251String = "2) ISQ's";
  private static final String synX1250String = "\n";
  private static final String synX1249String = "%";
  private static final String synX1248String = "Total time";
  private static final String synX1247String = "Block(t)";
  private static final String synX1246String = "Starve(t)";
  private static final String synX1245String = "Prod(%)";
  private static final String synX1244String = "State";
  private static final String synX1243String = "Stage";
  private static final String synX1242String = "%6.3f";
  private static final String synX1241String = "%-15s%-15s%-15s%-15s%-15s%-15s";
  private static final String synX1240String = "1) Production Stages";
  private static final String synX1239String = "S5";
  private static final int synX1238int = 2;
  private static final int synX1237int = 2;
  private static final String synX1236String = "S4b";
  private static final double synX1235double = 0.5;
  private static final String synX1234String = "S4a";
  private static final String synX1233String = "S3";
  private static final double synX1232double = 0.5;
  private static final String synX1231String = "S2b";
  private static final int synX1230int = 2;
  private static final int synX1229int = 2;
  private static final String synX1228String = "S2a";
  private static final String synX1227String = "S1";
  private static final String synX1226String = "S0";
  private static final String synX1225String = "Q45";
  private static final String synX1224String = "Q34";
  private static final String synX1223String = "Q23";
  private static final String synX1222String = "Q12";
  private static final String synX1221String = "Q01";
  private static final boolean synX1220boolean = true;
  public Scanner drives;
  public boolean IS_Bug = false;
  public final double BundleWeek = 10000000;
  public ProducingStatistics stirChf;
  public Programmer ames;
  public ArrayList<WithinPresentStore> isqNumber;
  public ArrayList<ManufactureRostrum> urgingStagecoachBlacklist;
  public int maximumQ;
  public double scope;
  public double think;

  public ProduceCrinkleBoss() {
    this.think = 0;
    this.scope = 0;
    this.maximumQ = 0;
  }

  public ProduceCrinkleBoss(double poor, double browse, int maximumQDuration) {
    this.think = poor;
    this.scope = browse;
    this.maximumQ = maximumQDuration;
    this.urgingStagecoachBlacklist = new ArrayList<ManufactureRostrum>();
    this.isqNumber = new ArrayList<WithinPresentStore>();
    this.stirChf = new ProducingStatistics(this.urgingStagecoachBlacklist);
    this.ames = new Programmer(8);
  }

  public synchronized void beganExercise() {
    ManufactureRostrum stepDefeated;
    this.cultivateDevelopmentLandscape();

    if (IS_Bug) synx204();

    while (this.ames.sustainThisThing() < this.BundleWeek) {
      this.outgrowthPeriod();
      stepDefeated = this.ames.doFollowingEmployment();
      for (ManufactureRostrum cern : this.urgingStagecoachBlacklist) synx205(cern, stepDefeated);
      this.embossMoyToken();

      if (IS_Bug == synX1220boolean) synx206();
    }
    this.copyQualification();

    if (drives != null) drives.close();
  }

  public synchronized void outgrowthPeriod() {
    for (ManufactureRostrum ora : this.urgingStagecoachBlacklist) synx207(ora);
  }

  public synchronized void cultivateDevelopmentLandscape() {
    WithinPresentStore q01, q02, q03, q04, q05;
    ManufactureRostrum angle;
    ManufactureRostrum s10;
    ManufactureRostrum s2a;
    ManufactureRostrum s2b;
    ManufactureRostrum l6;
    ManufactureRostrum s4a;
    ManufactureRostrum s4b;
    ManufactureRostrum kev;
    q01 = new WithinPresentStore(synX1221String, this.maximumQ);
    q02 = new WithinPresentStore(synX1222String, this.maximumQ);
    q03 = new WithinPresentStore(synX1223String, this.maximumQ);
    q04 = new WithinPresentStore(synX1224String, this.maximumQ);
    q05 = new WithinPresentStore(synX1225String, this.maximumQ);
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    angle = new FirstLeg(synX1226String, q01, this.think, this.scope, this.ames);
    s10 = new MidyearPoint(synX1227String, q01, q02, this.think, this.scope, this.ames);
    s2a =
        new MidyearPoint(
            synX1228String,
            q02,
            q03,
            this.think * synX1229int,
            this.scope * synX1230int,
            this.ames);
    s2b =
        new MidyearPoint(
            synX1231String, q02, q03, this.think, this.scope * synX1232double, this.ames);
    l6 = new MidyearPoint(synX1233String, q03, q04, this.think, this.scope, this.ames);
    s4a =
        new MidyearPoint(
            synX1234String, q04, q05, this.think, this.scope * synX1235double, this.ames);
    s4b =
        new MidyearPoint(
            synX1236String,
            q04,
            q05,
            this.think * synX1237int,
            this.scope * synX1238int,
            this.ames);
    kev = new HighPerforming(synX1239String, q05, this.think, this.scope, this.stirChf, this.ames);
    angle.fixedStarboardOriented(s10);
    s10.doStayedFarm(angle);
    s10.fixedStarboardOriented(s2a);
    s10.fixedStarboardOriented(s2b);
    s2a.doStayedFarm(s10);
    s2a.fixedStarboardOriented(l6);
    s2b.doStayedFarm(s10);
    s2b.fixedStarboardOriented(l6);
    l6.doStayedFarm(s2a);
    l6.doStayedFarm(s2b);
    l6.fixedStarboardOriented(s4a);
    l6.fixedStarboardOriented(s4b);
    s4a.doStayedFarm(l6);
    s4a.fixedStarboardOriented(kev);
    s4b.doStayedFarm(l6);
    s4b.fixedStarboardOriented(kev);
    kev.doStayedFarm(s4a);
    kev.doStayedFarm(s4b);
    this.urgingStagecoachBlacklist.add(angle);
    this.urgingStagecoachBlacklist.add(s10);
    this.urgingStagecoachBlacklist.add(s2a);
    this.urgingStagecoachBlacklist.add(s2b);
    this.urgingStagecoachBlacklist.add(l6);
    this.urgingStagecoachBlacklist.add(s4a);
    this.urgingStagecoachBlacklist.add(s4b);
    this.urgingStagecoachBlacklist.add(kev);
  }

  public synchronized void editionPhasesWorsts() {
    StringBuilder sb1;
    String primaryFormat1;
    String particularFormat1;
    String goading, crave, stuff;
    sb1 = new StringBuilder();
    System.out.println(synX1240String);
    primaryFormat1 = synX1241String;
    particularFormat1 = synX1242String;
    System.out.println(
        format(
            primaryFormat1,
            synX1243String,
            synX1244String,
            synX1245String,
            synX1246String,
            synX1247String,
            synX1248String));
    for (ManufactureRostrum fh : this.urgingStagecoachBlacklist) {
      goading = format(particularFormat1, fh.arriveArenaNdslSupply()) + synX1249String;
      crave = format(particularFormat1, fh.developSceneTotEat());
      stuff = format(particularFormat1, fh.findPresentGrossImpeded());
      sb1.append(
          format(
              primaryFormat1,
              fh.letPushDistinguish(),
              fh.haveTell(),
              goading,
              crave,
              stuff,
              format(particularFormat1, fh.takeCompletePeriodOperating())));
      sb1.append(synX1250String);
    }
    System.out.println(sb1.toString());
  }

  public synchronized void publishIsqClock() {
    StringBuilder sb2;
    String primaryFormat2;
    String particularFormat2;
    String make, declareOpportunity, boulArtifacts;
    String indictment;
    sb2 = new StringBuilder();
    System.out.println(synX1251String);
    primaryFormat2 = synX1252String;
    particularFormat2 = synX1253String;
    System.out.println(
        format(primaryFormat2, synX1254String, synX1255String, synX1256String, synX1257String));
    for (WithinPresentStore q : this.isqNumber) {
      make = q.sustainForename();
      declareOpportunity = format(particularFormat2, q.goIsqWaitingClock());
      boulArtifacts = format(particularFormat2, q.goIsqAverageParticularTally());
      indictment =
          (q.isComplete())
              ? format(synX1258String, q.startPresentlyTell(), synX1259String)
              : Integer.toString(q.startPresentlyTell());
      sb2.append(format(primaryFormat2, make, indictment, declareOpportunity, boulArtifacts));
      sb2.append(synX1260String);
    }
    System.out.println(sb2.toString());
  }

  public synchronized void embossMoyToken() {
    for (WithinPresentStore q : this.isqNumber) synx208(q);
  }

  public synchronized void engravingLaneGet() {
    StringBuilder sb3;
    String primaryFormat3;
    Map<String, Double> roadways;
    sb3 = new StringBuilder();
    System.out.println(synX1261String);
    primaryFormat3 = synX1262String;
    System.out.println(format(primaryFormat3, synX1263String, synX1264String));
    roadways = this.stirChf.sustainLaneGet();
    for (Map.Entry<String, Double> launching : roadways.entrySet())
      synx209(sb3, primaryFormat3, launching);
    System.out.println(sb3.toString());
  }

  public synchronized void catalogTenurePage() {
    System.out.println(synX1265String + this.ames.receiveSubcontractReckoning());
    System.out.println(format(this.ames.drawCopyConfiguration(), synX1266String, synX1267String));
    System.out.println(this.ames.developBibliographies());
  }

  public synchronized void writtenLatestClip() {
    System.out.println(synX1268String + format(synX1269String, this.ames.sustainThisThing()));
  }

  public synchronized void copyQualification() {
    System.out.println(synX1270String);
    this.writtenLatestClip();
    this.editionPhasesWorsts();
    this.publishIsqClock();
    this.engravingLaneGet();
    this.catalogTenurePage();
    System.out.println(
        synX1271String
            + this.urgingStagecoachBlacklist.get(synX1272int).arriveTotalityArtefactsDesigned());
    System.out.println(synX1273String + this.stirChf.generateAbsoluteNecessities());

    try {
      sleep(synX1274int);
    } catch (InterruptedException ye) {
      System.err.println(ye);
    }
  }

  private synchronized void synx204() {
    this.drives = new Scanner(System.in);
  }

  private synchronized void synx205(ManufactureRostrum cern, ManufactureRostrum stepDefeated) {

    if (cern != stepDefeated) cern.ingSayRough(this.ames.sustainThisThing());
  }

  private synchronized void synx206() {
    this.copyQualification();
    drives.nextLine();
  }

  private synchronized void synx207(ManufactureRostrum ora) {
    ora.phaseArticle(this.ames.sustainThisThing());
  }

  private synchronized void synx208(WithinPresentStore q) {
    q.eradicateFigure();
  }

  private synchronized void synx209(
      StringBuilder sb3, String primaryFormat3, java.util.Map.Entry<String, Double> launching) {
    sb3.append(format(primaryFormat3, launching.getKey(), launching.getValue()));
    sb3.append(synX1275String);
  }
}
