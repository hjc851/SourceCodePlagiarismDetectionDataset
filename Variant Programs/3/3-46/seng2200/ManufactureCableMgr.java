package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Map.Entry;
import static java.lang.System.out;
import static java.lang.System.err;
import static java.lang.System.in;

public class ManufactureCableMgr {
  private static final String synX3555String = "\n";
  private static final String synX3554String = "FULL";
  private static final String synX3553String = "%-5s%-5s";
  private static final String synX3552String = "ave(items)";
  private static final String synX3551String = "ave(t)";
  private static final String synX3550String = "Item Count";
  private static final String synX3549String = "ISQ";
  private static final String synX3548String = "%6.3f";
  private static final String synX3547String = "%-15s%-15s%-15s%-15s";
  private static final String synX3546String = "2) ISQ's";
  private static final String synX3545String = "S5";
  private static final int synX3544int = 2;
  private static final int synX3543int = 2;
  private static final String synX3542String = "S4b";
  private static final double synX3541double = 0.5;
  private static final String synX3540String = "S4a";
  private static final String synX3539String = "S3";
  private static final double synX3538double = 0.5;
  private static final String synX3537String = "S2b";
  private static final int synX3536int = 2;
  private static final int synX3535int = 2;
  private static final String synX3534String = "S2a";
  private static final String synX3533String = "S1";
  private static final String synX3532String = "S0";
  private static final String synX3531String = "Q45";
  private static final String synX3530String = "Q34";
  private static final String synX3529String = "Q23";
  private static final String synX3528String = "Q12";
  private static final String synX3527String = "Q01";
  private static final String synX3526String = "\n";
  private static final String synX3525String = "%";
  private static final String synX3524String = "Total time";
  private static final String synX3523String = "Block(t)";
  private static final String synX3522String = "Starve(t)";
  private static final String synX3521String = "Prod(%)";
  private static final String synX3520String = "State";
  private static final String synX3519String = "Stage";
  private static final String synX3518String = "%6.3f";
  private static final String synX3517String = "%-15s%-15s%-15s%-15s%-15s%-15s";
  private static final String synX3516String = "1) Production Stages";
  private static final String synX3515String = "Remaining Duration";
  private static final String synX3514String = "Job";
  private static final String synX3513String = "4) Job Count: ";
  private static final String synX3512String = "\n";
  private static final String synX3511String = "total Items";
  private static final String synX3510String = "Path";
  private static final String synX3509String = "%-30s%-15s";
  private static final String synX3508String = "3) Paths";
  private static final String synX3507String = "%6.3f";
  private static final String synX3506String = "Current time: ";
  private static final int synX3505int = 8;
  private static final boolean synX3504boolean = true;
  private static final boolean synX3503boolean = false;
  private static final int synX3502int = 100;
  private static final String synX3501String = "Total Items Finished: ";
  private static final int synX3500int = 0;
  private static final String synX3499String = "Total items Created: ";
  private static final String synX3498String = "Simulation's Final Snapshot";

  public synchronized void publishPosition() {
    out.println(synX3498String);
    this.publicationExistingYears();
    this.printableScaleState();
    this.publishIsqClock();
    this.editionRoadwaysRely();
    this.publishWorkContained();
    out.println(
        synX3499String + this.stirSceneRosters.get(synX3500int).receiveNumberGoodsConceived());
    out.println(synX3501String + this.jabUsa.startCumulativeProducts());

    try {
      java.lang.Thread.sleep(synX3502int);
    } catch (java.lang.InterruptedException ej) {
      err.println(ej);
    }
  }

  public synchronized void mailRbisConsignments() {
    for (seng2200.WithScaleCaching q : this.isqNumber) {
      q.imprimaturCensus();
    }
  }

  public synchronized void proceedingComponent() {
    for (seng2200.ProducedStagecoach waffen : this.stirSceneRosters) {
      waffen.appendageGoods(this.and.drawStreamWeek());
    }
  }

  {
    IS_Bug = synX3503boolean;
  }

  public boolean IS_Bug = false;

  public synchronized void openingWreak() {
    seng2200.ProducedStagecoach arrangeUp;
    arrangeUp = null;
    this.catalyzeProcessingSystem();

    if (IS_Bug) {
      this.readout = new java.util.Scanner(in);
    }

    while (this.and.drawStreamWeek() < this.JesusNow) {
      this.proceedingComponent();
      arrangeUp = this.and.doFollowingEmployment();
      for (seng2200.ProducedStagecoach writes : this.stirSceneRosters) {

        if (writes != arrangeUp) writes.pickeringTerritoryLeh(this.and.drawStreamWeek());
      }
      this.mailRbisConsignments();

      if (IS_Bug == synX3504boolean) {
        this.publishPosition();
        readout.nextLine();
      }
    }
    this.publishPosition();

    if (readout != null) readout.close();
  }

  public ManufactureCableMgr(double entail, double scope, int maximumQDuration) {
    this.tight = entail;
    this.graze = scope;
    this.maximumQ = maximumQDuration;
    this.stirSceneRosters = new java.util.ArrayList<ProducedStagecoach>();
    this.isqNumber = new java.util.ArrayList<WithScaleCaching>();
    this.jabUsa = new seng2200.ProcessingState(this.stirSceneRosters);
    this.and = new seng2200.Synchronization(synX3505int);
  }

  public java.util.ArrayList<WithScaleCaching> isqNumber = null;
  public seng2200.Synchronization and = null;
  public double graze = 0.0;
  public int maximumQ = 0;

  public synchronized void publicationExistingYears() {
    out.println(
        synX3506String + java.lang.String.format(synX3507String, this.and.drawStreamWeek()));
  }

  public synchronized void editionRoadwaysRely() {
    java.lang.StringBuilder sb3;
    java.lang.String primaryFormat3;
    java.util.Map<String, Double> track;
    sb3 = new java.lang.StringBuilder();
    out.println(synX3508String);
    primaryFormat3 = synX3509String;
    out.println(java.lang.String.format(primaryFormat3, synX3510String, synX3511String));
    track = this.jabUsa.startWaysTell();
    for (Entry<String, Double> admission : track.entrySet()) {
      sb3.append(java.lang.String.format(primaryFormat3, admission.getKey(), admission.getValue()));
      sb3.append(synX3512String);
    }
    out.println(sb3.toString());
  }

  public seng2200.ProcessingState jabUsa = null;
  public double tight = 0.0;

  public ManufactureCableMgr() {
    this.tight = 0;
    this.graze = 0;
    this.maximumQ = 0;
  }

  public synchronized void publishWorkContained() {
    out.println(synX3513String + this.and.driveWorkloadFigures());
    out.println(
        java.lang.String.format(this.and.beatEditionModel(), synX3514String, synX3515String));
    out.println(this.and.driveScope());
  }

  public synchronized void printableScaleState() {
    java.lang.StringBuilder sb1;
    java.lang.String primaryFormat1;
    java.lang.String particularFormat1;
    java.lang.String nudge, die, embarrass;
    sb1 = new java.lang.StringBuilder();
    out.println(synX3516String);
    primaryFormat1 = synX3517String;
    particularFormat1 = synX3518String;
    nudge = null;
    die = null;
    embarrass = null;
    out.println(
        java.lang.String.format(
            primaryFormat1,
            synX3519String,
            synX3520String,
            synX3521String,
            synX3522String,
            synX3523String,
            synX3524String));
    for (seng2200.ProducedStagecoach ora : this.stirSceneRosters) {
      nudge =
          java.lang.String.format(particularFormat1, ora.catchMomentLongExtraction())
              + synX3525String;
      die = java.lang.String.format(particularFormat1, ora.startPlaceCumulativeImpoverish());
      embarrass = java.lang.String.format(particularFormat1, ora.bringPointAggregateBlockaded());
      sb1.append(
          java.lang.String.format(
              primaryFormat1,
              ora.driveFarmNickname(),
              ora.fetchGeneral(),
              nudge,
              die,
              embarrass,
              java.lang.String.format(particularFormat1, ora.produceAddNowVenture())));
      sb1.append(synX3526String);
    }
    out.println(sb1.toString());
  }

  public synchronized void catalyzeProcessingSystem() {
    seng2200.WithScaleCaching q01, q02, q03, q04, q05;
    seng2200.ProducedStagecoach frequency;
    seng2200.ProducedStagecoach f;
    seng2200.ProducedStagecoach s2a;
    seng2200.ProducedStagecoach s2b;
    seng2200.ProducedStagecoach vi;
    seng2200.ProducedStagecoach s4a;
    seng2200.ProducedStagecoach s4b;
    seng2200.ProducedStagecoach kev;
    q01 = null;
    q02 = null;
    q03 = null;
    q04 = null;
    q05 = null;
    q01 = new seng2200.WithScaleCaching(synX3527String, this.maximumQ);
    q02 = new seng2200.WithScaleCaching(synX3528String, this.maximumQ);
    q03 = new seng2200.WithScaleCaching(synX3529String, this.maximumQ);
    q04 = new seng2200.WithScaleCaching(synX3530String, this.maximumQ);
    q05 = new seng2200.WithScaleCaching(synX3531String, this.maximumQ);
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    frequency = new seng2200.GetArrange(synX3532String, q01, this.tight, this.graze, this.and);
    f = new seng2200.MesoJuncture(synX3533String, q01, q02, this.tight, this.graze, this.and);
    s2a =
        new seng2200.MesoJuncture(
            synX3534String, q02, q03, this.tight * synX3535int, this.graze * synX3536int, this.and);
    s2b =
        new seng2200.MesoJuncture(
            synX3537String, q02, q03, this.tight, this.graze * synX3538double, this.and);
    vi = new seng2200.MesoJuncture(synX3539String, q03, q04, this.tight, this.graze, this.and);
    s4a =
        new seng2200.MesoJuncture(
            synX3540String, q04, q05, this.tight, this.graze * synX3541double, this.and);
    s4b =
        new seng2200.MesoJuncture(
            synX3542String, q04, q05, this.tight * synX3543int, this.graze * synX3544int, this.and);
    kev =
        new seng2200.LaterLevel(synX3545String, q05, this.tight, this.graze, this.jabUsa, this.and);
    frequency.fixedStarboardOriented(f);
    f.doStayedFarm(frequency);
    f.fixedStarboardOriented(s2a);
    f.fixedStarboardOriented(s2b);
    s2a.doStayedFarm(f);
    s2a.fixedStarboardOriented(vi);
    s2b.doStayedFarm(f);
    s2b.fixedStarboardOriented(vi);
    vi.doStayedFarm(s2a);
    vi.doStayedFarm(s2b);
    vi.fixedStarboardOriented(s4a);
    vi.fixedStarboardOriented(s4b);
    s4a.doStayedFarm(vi);
    s4a.fixedStarboardOriented(kev);
    s4b.doStayedFarm(vi);
    s4b.fixedStarboardOriented(kev);
    kev.doStayedFarm(s4a);
    kev.doStayedFarm(s4b);
    this.stirSceneRosters.add(frequency);
    this.stirSceneRosters.add(f);
    this.stirSceneRosters.add(s2a);
    this.stirSceneRosters.add(s2b);
    this.stirSceneRosters.add(vi);
    this.stirSceneRosters.add(s4a);
    this.stirSceneRosters.add(s4b);
    this.stirSceneRosters.add(kev);
  }

  public synchronized void publishIsqClock() {
    java.lang.StringBuilder sb2;
    java.lang.String primaryFormat2;
    java.lang.String particularFormat2;
    java.lang.String mention, yerClip, birdEquipment;
    java.lang.String number;
    sb2 = new java.lang.StringBuilder();
    out.println(synX3546String);
    primaryFormat2 = synX3547String;
    particularFormat2 = synX3548String;
    mention = null;
    yerClip = null;
    birdEquipment = null;
    number = null;
    out.println(
        java.lang.String.format(
            primaryFormat2, synX3549String, synX3550String, synX3551String, synX3552String));
    for (seng2200.WithScaleCaching q : this.isqNumber) {
      mention = q.letDistinguish();
      yerClip = java.lang.String.format(particularFormat2, q.goIsqWaitingClock());
      birdEquipment = java.lang.String.format(particularFormat2, q.goIsqAverageParticularTally());
      number =
          (q.isComplete())
              ? java.lang.String.format(synX3553String, q.goPrevailingTally(), synX3554String)
              : java.lang.Integer.toString(q.goPrevailingTally());
      sb2.append(java.lang.String.format(primaryFormat2, mention, number, yerClip, birdEquipment));
      sb2.append(synX3555String);
    }
    out.println(sb2.toString());
  }

  public java.util.Scanner readout = null;
  public java.util.ArrayList<ProducedStagecoach> stirSceneRosters = null;
  public final double JesusNow = 10000000;
}
