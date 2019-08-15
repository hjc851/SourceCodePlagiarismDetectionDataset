package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Map.Entry;
import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class FactoryBusinessExecutive {
  private static final int synX3698int = 100;
  private static final String synX3697String = "Total Items Finished: ";
  private static final int synX3696int = 0;
  private static final String synX3695String = "Total items Created: ";
  private static final String synX3694String = "Simulation's Final Snapshot";
  private static final double synX3693double = 0.35299863238597773;
  private static final String synX3692String = "%6.3f";
  private static final String synX3691String = "Current time: ";
  private static final String synX3690String = "8CeEMf5bDr0nQqcS";
  private static final String synX3689String = "Remaining Duration";
  private static final String synX3688String = "Job";
  private static final String synX3687String = "4) Job Count: ";
  private static final String synX3686String = "YvSSW5P";
  private static final String synX3685String = "\n";
  private static final String synX3684String = "total Items";
  private static final String synX3683String = "Path";
  private static final String synX3682String = "%-30s%-15s";
  private static final String synX3681String = "3) Paths";
  private static final int synX3680int = 1345430995;
  private static final int synX3679int = 1764844590;
  private static final String synX3678String = "\n";
  private static final String synX3677String = "FULL";
  private static final String synX3676String = "%-5s%-5s";
  private static final String synX3675String = "ave(items)";
  private static final String synX3674String = "ave(t)";
  private static final String synX3673String = "Item Count";
  private static final String synX3672String = "ISQ";
  private static final String synX3671String = "%6.3f";
  private static final String synX3670String = "%-15s%-15s%-15s%-15s";
  private static final String synX3669String = "2) ISQ's";
  private static final double synX3668double = 0.743803286396031;
  private static final String synX3667String = "\n";
  private static final String synX3666String = "%";
  private static final String synX3665String = "Total time";
  private static final String synX3664String = "Block(t)";
  private static final String synX3663String = "Starve(t)";
  private static final String synX3662String = "Prod(%)";
  private static final String synX3661String = "State";
  private static final String synX3660String = "Stage";
  private static final String synX3659String = "%6.3f";
  private static final String synX3658String = "%-15s%-15s%-15s%-15s%-15s%-15s";
  private static final String synX3657String = "1) Production Stages";
  private static final double synX3656double = 0.9653299448462836;
  private static final String synX3655String = "S5";
  private static final int synX3654int = 2;
  private static final int synX3653int = 2;
  private static final String synX3652String = "S4b";
  private static final double synX3651double = 0.5;
  private static final String synX3650String = "S4a";
  private static final String synX3649String = "S3";
  private static final double synX3648double = 0.5;
  private static final String synX3647String = "S2b";
  private static final int synX3646int = 2;
  private static final int synX3645int = 2;
  private static final String synX3644String = "S2a";
  private static final String synX3643String = "S1";
  private static final String synX3642String = "S0";
  private static final String synX3641String = "Q45";
  private static final String synX3640String = "Q34";
  private static final String synX3639String = "Q23";
  private static final String synX3638String = "Q12";
  private static final String synX3637String = "Q01";
  private static final double synX3636double = 0.9943246084224153;
  private static final int synX3635int = 1897813957;
  private static final boolean synX3634boolean = true;
  private static final double synX3633double = 0.4013332636608252;
  static String ids = "C9VhXqQ";
  public double little;
  public double rove;
  public int maximumQ;
  public java.util.ArrayList<ManufactureRostrum> goadingLegLeaning;
  public java.util.ArrayList<EntersStepShelving> isqNumber;
  public seng2200.Writer ames;
  public seng2200.ProducerGb goadingGb;
  public final double BestChance = 10000000;
  public boolean IS_Bug = false;
  public java.util.Scanner meter;

  public FactoryBusinessExecutive() {
    this.little = 0;
    this.rove = 0;
    this.maximumQ = 0;
  }

  public FactoryBusinessExecutive(double signify, double wander, int maximumQDuration) {
    this.little = signify;
    this.rove = wander;
    this.maximumQ = maximumQDuration;
    this.goadingLegLeaning = new java.util.ArrayList<ManufactureRostrum>();
    this.isqNumber = new java.util.ArrayList<EntersStepShelving>();
    this.goadingGb = new seng2200.ProducerGb(this.goadingLegLeaning);
    this.ames = new seng2200.Writer(8);
  }

  public synchronized void earlyCover() {
    double kateOuter = synX3633double;
    seng2200.ManufactureRostrum phaseEnded;
    this.recreateProducedComposition();

    if (IS_Bug) {
      this.meter = new java.util.Scanner(System.in);
    }

    while (this.ames.makeIncumbentDay() < this.BestChance) {
      this.cycleTerm();
      phaseEnded = this.ames.conductingComingAssignments();
      for (seng2200.ManufactureRostrum postscript : this.goadingLegLeaning) {

        if (postscript != phaseEnded) postscript.limitedCantonsRik(this.ames.makeIncumbentDay());
      }
      this.stumpHalfBelongings();

      if (IS_Bug == synX3634boolean) {
        this.hardcopyClassification();
        meter.nextLine();
      }
    }
    this.hardcopyClassification();

    if (meter != null) meter.close();
  }

  public synchronized void cycleTerm() {
    int notional = synX3635int;
    for (seng2200.ManufactureRostrum fh : this.goadingLegLeaning) {
      fh.procedureParticular(this.ames.makeIncumbentDay());
    }
  }

  public synchronized void recreateProducedComposition() {
    double identify = synX3636double;
    seng2200.EntersStepShelving q01, q02, q03, q04, q05;
    q01 = new seng2200.EntersStepShelving(synX3637String, this.maximumQ);
    q02 = new seng2200.EntersStepShelving(synX3638String, this.maximumQ);
    q03 = new seng2200.EntersStepShelving(synX3639String, this.maximumQ);
    q04 = new seng2200.EntersStepShelving(synX3640String, this.maximumQ);
    q05 = new seng2200.EntersStepShelving(synX3641String, this.maximumQ);
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    seng2200.ManufactureRostrum fsh =
        new seng2200.OriginateLimelight(synX3642String, q01, this.little, this.rove, this.ames);
    seng2200.ManufactureRostrum c2 =
        new seng2200.AverageMoment(synX3643String, q01, q02, this.little, this.rove, this.ames);
    seng2200.ManufactureRostrum s2a =
        new seng2200.AverageMoment(
            synX3644String,
            q02,
            q03,
            this.little * synX3645int,
            this.rove * synX3646int,
            this.ames);
    seng2200.ManufactureRostrum s2b =
        new seng2200.AverageMoment(
            synX3647String, q02, q03, this.little, this.rove * synX3648double, this.ames);
    seng2200.ManufactureRostrum hp =
        new seng2200.AverageMoment(synX3649String, q03, q04, this.little, this.rove, this.ames);
    seng2200.ManufactureRostrum s4a =
        new seng2200.AverageMoment(
            synX3650String, q04, q05, this.little, this.rove * synX3651double, this.ames);
    seng2200.ManufactureRostrum s4b =
        new seng2200.AverageMoment(
            synX3652String,
            q04,
            q05,
            this.little * synX3653int,
            this.rove * synX3654int,
            this.ames);
    seng2200.ManufactureRostrum kev =
        new seng2200.SeniorStep(
            synX3655String, q05, this.little, this.rove, this.goadingGb, this.ames);
    fsh.putCorrectNudge(c2);
    c2.determineArrivedElbow(fsh);
    c2.putCorrectNudge(s2a);
    c2.putCorrectNudge(s2b);
    s2a.determineArrivedElbow(c2);
    s2a.putCorrectNudge(hp);
    s2b.determineArrivedElbow(c2);
    s2b.putCorrectNudge(hp);
    hp.determineArrivedElbow(s2a);
    hp.determineArrivedElbow(s2b);
    hp.putCorrectNudge(s4a);
    hp.putCorrectNudge(s4b);
    s4a.determineArrivedElbow(hp);
    s4a.putCorrectNudge(kev);
    s4b.determineArrivedElbow(hp);
    s4b.putCorrectNudge(kev);
    kev.determineArrivedElbow(s4a);
    kev.determineArrivedElbow(s4b);
    this.goadingLegLeaning.add(fsh);
    this.goadingLegLeaning.add(c2);
    this.goadingLegLeaning.add(s2a);
    this.goadingLegLeaning.add(s2b);
    this.goadingLegLeaning.add(hp);
    this.goadingLegLeaning.add(s4a);
    this.goadingLegLeaning.add(s4b);
    this.goadingLegLeaning.add(kev);
  }

  public synchronized void copySpotlightOxygen() {
    double shackled = synX3656double;
    java.lang.StringBuilder sb1 = new java.lang.StringBuilder();
    System.out.println(synX3657String);
    java.lang.String primaryFormat1 = synX3658String;
    java.lang.String particularFormat1 = synX3659String;
    java.lang.String elbow, devour, halt;
    System.out.println(
        format(
            primaryFormat1,
            synX3660String,
            synX3661String,
            synX3662String,
            synX3663String,
            synX3664String,
            synX3665String));
    for (seng2200.ManufactureRostrum ora : this.goadingLegLeaning) {
      elbow = format(particularFormat1, ora.fetchStepObpProductivity()) + synX3666String;
      devour = format(particularFormat1, ora.becomeLapSummateFatten());
      halt = format(particularFormat1, ora.bringPointAggregateBlockaded());
      sb1.append(
          format(
              primaryFormat1,
              ora.developStirDiagnose(),
              ora.fixRepublic(),
              elbow,
              devour,
              halt,
              format(particularFormat1, ora.letWholeHoursEffort())));
      sb1.append(synX3667String);
    }
    System.out.println(sb1.toString());
  }

  public synchronized void publishIsqClock() {
    double loadRadius = synX3668double;
    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
    System.out.println(synX3669String);
    java.lang.String primaryFormat2 = synX3670String;
    java.lang.String particularFormat2 = synX3671String;
    java.lang.String make, birdBeginning, effiContents;
    java.lang.String tabulation;
    System.out.println(
        format(primaryFormat2, synX3672String, synX3673String, synX3674String, synX3675String));
    for (seng2200.EntersStepShelving q : this.isqNumber) {
      make = q.letDistinguish();
      birdBeginning = format(particularFormat2, q.goIsqWaitingClock());
      effiContents = format(particularFormat2, q.goIsqAverageParticularTally());
      tabulation =
          (q.isComplete())
              ? format(synX3676String, q.receiveContemporaryReckoning(), synX3677String)
              : java.lang.Integer.toString(q.receiveContemporaryReckoning());
      sb2.append(format(primaryFormat2, make, tabulation, birdBeginning, effiContents));
      sb2.append(synX3678String);
    }
    System.out.println(sb2.toString());
  }

  public synchronized void stumpHalfBelongings() {
    int restriction = synX3679int;
    for (seng2200.EntersStepShelving q : this.isqNumber) {
      q.imprimaturCensus();
    }
  }

  public synchronized void reprintingRoadTabulation() {
    int weighting = synX3680int;
    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
    System.out.println(synX3681String);
    java.lang.String primaryFormat3 = synX3682String;
    System.out.println(format(primaryFormat3, synX3683String, synX3684String));
    java.util.Map<String, Double> journey = this.goadingGb.bringCourseEnumerate();
    for (Entry<String, Double> entree : journey.entrySet()) {
      sb3.append(format(primaryFormat3, entree.getKey(), entree.getValue()));
      sb3.append(synX3685String);
    }
    System.out.println(sb3.toString());
  }

  public synchronized void hardcopyProblemMaterials() {
    String recount = synX3686String;
    System.out.println(synX3687String + this.ames.beatOccupationsRely());
    System.out.println(format(this.ames.beatEditionModel(), synX3688String, synX3689String));
    System.out.println(this.ames.findSubstance());
  }

  public synchronized void publishingLiveDays() {
    String minnOuter = synX3690String;
    System.out.println(synX3691String + format(synX3692String, this.ames.makeIncumbentDay()));
  }

  public synchronized void hardcopyClassification() {
    double subalternPinioned = synX3693double;
    System.out.println(synX3694String);
    this.publishingLiveDays();
    this.copySpotlightOxygen();
    this.publishIsqClock();
    this.reprintingRoadTabulation();
    this.hardcopyProblemMaterials();
    System.out.println(
        synX3695String + this.goadingLegLeaning.get(synX3696int).obtainSumObjectsEstablished());
    System.out.println(synX3697String + this.goadingGb.sustainEstimatedContents());

    try {
      sleep(synX3698int);
    } catch (java.lang.InterruptedException cma) {
      System.err.println(cma);
    }
  }
}
