package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import java.util.Map.Entry;

public class FabricationLineageChairman {
  private static final String synX262String = "\n";
  private static final String synX261String = "S5";
  private static final int synX260int = 2;
  private static final int synX259int = 2;
  private static final String synX258String = "S4b";
  private static final double synX257double = 0.5;
  private static final String synX256String = "S4a";
  private static final String synX255String = "S3";
  private static final double synX254double = 0.5;
  private static final String synX253String = "S2b";
  private static final int synX252int = 2;
  private static final int synX251int = 2;
  private static final String synX250String = "S2a";
  private static final String synX249String = "S1";
  private static final String synX248String = "S0";
  private static final String synX247String = "Q45";
  private static final String synX246String = "Q34";
  private static final String synX245String = "Q23";
  private static final String synX244String = "Q12";
  private static final String synX243String = "Q01";
  private static final String synX242String = "total Items";
  private static final String synX241String = "Path";
  private static final String synX240String = "%-30s%-15s";
  private static final String synX239String = "3) Paths";
  private static final int synX238int = 0;
  private static final int synX237int = 0;
  private static final int synX236int = 0;
  private static final String synX235String = "\n";
  private static final String synX234String = "%";
  private static final String synX233String = "Total time";
  private static final String synX232String = "Block(t)";
  private static final String synX231String = "Starve(t)";
  private static final String synX230String = "Prod(%)";
  private static final String synX229String = "State";
  private static final String synX228String = "Stage";
  private static final String synX227String = "%6.3f";
  private static final String synX226String = "%-15s%-15s%-15s%-15s%-15s%-15s";
  private static final String synX225String = "1) Production Stages";
  private static final String synX224String = "Remaining Duration";
  private static final String synX223String = "Job";
  private static final String synX222String = "4) Job Count: ";
  private static final boolean synX221boolean = true;
  private static final int synX220int = 8;
  private static final String synX219String = "%6.3f";
  private static final String synX218String = "Current time: ";
  private static final int synX217int = 100;
  private static final String synX216String = "Total Items Finished: ";
  private static final int synX215int = 0;
  private static final String synX214String = "Total items Created: ";
  private static final String synX213String = "Simulation's Final Snapshot";
  private static final String synX212String = "\n";
  private static final String synX211String = "FULL";
  private static final String synX210String = "%-5s%-5s";
  private static final String synX209String = "ave(items)";
  private static final String synX208String = "ave(t)";
  private static final String synX207String = "Item Count";
  private static final String synX206String = "ISQ";
  private static final String synX205String = "%6.3f";
  private static final String synX204String = "%-15s%-15s%-15s%-15s";
  private static final String synX203String = "2) ISQ's";

  public synchronized void publishIsqClock() {
    java.lang.StringBuilder sb2;
    java.lang.String primaryFormat2;
    java.lang.String particularFormat2;
    java.lang.String identify, wabashMinutes, avenueAccessories;
    java.lang.String quantify;
    sb2 = new java.lang.StringBuilder();
    System.out.println(synX203String);
    primaryFormat2 = synX204String;
    particularFormat2 = synX205String;
    identify = null;
    wabashMinutes = null;
    avenueAccessories = null;
    quantify = null;
    System.out.println(
        java.lang.String.format(
            primaryFormat2, synX206String, synX207String, synX208String, synX209String));
    for (seng2200.AmongstMomentCache q : this.isqNumber) {
      identify = q.bringRefer();
      wabashMinutes = java.lang.String.format(particularFormat2, q.goIsqWaitingClock());
      avenueAccessories =
          java.lang.String.format(particularFormat2, q.goIsqAverageParticularTally());
      quantify =
          (q.isComplete())
              ? java.lang.String.format(synX210String, q.fetchPresentQuantify(), synX211String)
              : java.lang.Integer.toString(q.fetchPresentQuantify());
      sb2.append(
          java.lang.String.format(
              primaryFormat2, identify, quantify, wabashMinutes, avenueAccessories));
      sb2.append(synX212String);
    }
    System.out.println(sb2.toString());
  }

  public synchronized void printersDesignations() {
    System.out.println(synX213String);
    this.inkAfootHours();
    this.reprintArrangeAsap();
    this.publishIsqClock();
    this.copyCorridorsCensus();
    this.photographyStaffBibliography();
    System.out.println(
        synX214String + this.pushTheaterRoster.get(synX215int).becomeSummatePurchasesArisen());
    System.out.println(synX216String + this.orientedCoeff.haveEntireBelongings());

    try {
      java.lang.Thread.sleep(synX217int);
    } catch (java.lang.InterruptedException samad) {
      System.err.println(samad);
    }
  }

  public synchronized void inkAfootHours() {
    System.out.println(
        synX218String + java.lang.String.format(synX219String, this.and.bringOngoingMeter()));
  }

  public FabricationLineageChairman(double imply, double array, int maximumQDuration) {
    this.awful = imply;
    this.graze = array;
    this.maximumQ = maximumQDuration;
    this.pushTheaterRoster = new java.util.ArrayList<FabricationLimelight>();
    this.isqNumber = new java.util.ArrayList<AmongstMomentCache>();
    this.orientedCoeff = new seng2200.FabricationStates(this.pushTheaterRoster);
    this.and = new seng2200.Developer(synX220int);
  }

  public java.util.ArrayList<FabricationLimelight> pushTheaterRoster = null;

  {
    IS_Bug = false;
  }

  public synchronized void beginningOperate() {
    seng2200.FabricationLimelight junctureGraduated;
    junctureGraduated = null;
    this.introduceCultivationLayout();

    if (IS_Bug) synx44();

    while (this.and.bringOngoingMeter() < this.MaximalMeter) {
      this.sueMilestone();
      junctureGraduated = this.and.administerExpectedPositions();
      for (seng2200.FabricationLimelight cern : this.pushTheaterRoster)
        synx45(cern, junctureGraduated);
      this.sealAveDetail();

      if (IS_Bug == synX221boolean) synx46();
    }
    this.printersDesignations();

    if (believer != null) believer.close();
  }

  public synchronized void photographyStaffBibliography() {
    System.out.println(synX222String + this.and.drawAssignmentCensus());
    System.out.println(
        java.lang.String.format(this.and.developLithographWording(), synX223String, synX224String));
    System.out.println(this.and.fixMerits());
  }

  public double awful = 0.0;

  public synchronized void reprintArrangeAsap() {
    java.lang.StringBuilder sb1;
    java.lang.String primaryFormat1;
    java.lang.String particularFormat1;
    java.lang.String jab, appetite, barricade;
    sb1 = new java.lang.StringBuilder();
    System.out.println(synX225String);
    primaryFormat1 = synX226String;
    particularFormat1 = synX227String;
    jab = null;
    appetite = null;
    barricade = null;
    System.out.println(
        java.lang.String.format(
            primaryFormat1,
            synX228String,
            synX229String,
            synX230String,
            synX231String,
            synX232String,
            synX233String));
    for (seng2200.FabricationLimelight waffen : this.pushTheaterRoster) {
      jab =
          java.lang.String.format(particularFormat1, waffen.produceScaleEastProcessing())
              + synX234String;
      appetite =
          java.lang.String.format(particularFormat1, waffen.sustainTheatricalEstimatedDehydrate());
      barricade = java.lang.String.format(particularFormat1, waffen.developSceneTotHampered());
      sb1.append(
          java.lang.String.format(
              primaryFormat1,
              waffen.comeGoadList(),
              waffen.arriveNational(),
              jab,
              appetite,
              barricade,
              java.lang.String.format(particularFormat1, waffen.comeOverallClipSurgery())));
      sb1.append(synX235String);
    }
    System.out.println(sb1.toString());
  }

  public FabricationLineageChairman() {
    this.awful = synX236int;
    this.graze = synX237int;
    this.maximumQ = synX238int;
  }

  public java.util.Scanner believer = null;
  public final double MaximalMeter = 10000000;
  public seng2200.Developer and = null;

  public synchronized void sealAveDetail() {
    for (seng2200.AmongstMomentCache q : this.isqNumber) synx47(q);
  }

  public synchronized void copyCorridorsCensus() {
    java.lang.StringBuilder sb3;
    java.lang.String primaryFormat3;
    java.util.Map<String, Double> trajectories;
    sb3 = new java.lang.StringBuilder();
    System.out.println(synX239String);
    primaryFormat3 = synX240String;
    System.out.println(java.lang.String.format(primaryFormat3, synX241String, synX242String));
    trajectories = this.orientedCoeff.makeTrajectoriesEnumeration();
    for (Entry<String, Double> admission : trajectories.entrySet())
      synx48(sb3, primaryFormat3, admission);
    System.out.println(sb3.toString());
  }

  public double graze = 0.0;
  public seng2200.FabricationStates orientedCoeff = null;
  public java.util.ArrayList<AmongstMomentCache> isqNumber = null;
  public boolean IS_Bug = false;
  public int maximumQ = 0;

  public synchronized void introduceCultivationLayout() {
    seng2200.AmongstMomentCache q01, q02, q03, q04, q05;
    seng2200.FabricationLimelight g;
    seng2200.FabricationLimelight l1;
    seng2200.FabricationLimelight s2a;
    seng2200.FabricationLimelight s2b;
    seng2200.FabricationLimelight s7;
    seng2200.FabricationLimelight s4a;
    seng2200.FabricationLimelight s4b;
    seng2200.FabricationLimelight mev;
    q01 = null;
    q02 = null;
    q03 = null;
    q04 = null;
    q05 = null;
    q01 = new seng2200.AmongstMomentCache(synX243String, this.maximumQ);
    q02 = new seng2200.AmongstMomentCache(synX244String, this.maximumQ);
    q03 = new seng2200.AmongstMomentCache(synX245String, this.maximumQ);
    q04 = new seng2200.AmongstMomentCache(synX246String, this.maximumQ);
    q05 = new seng2200.AmongstMomentCache(synX247String, this.maximumQ);
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    g = new seng2200.CommencesPlace(synX248String, q01, this.awful, this.graze, this.and);
    l1 = new seng2200.InterimLap(synX249String, q01, q02, this.awful, this.graze, this.and);
    s2a =
        new seng2200.InterimLap(
            synX250String, q02, q03, this.awful * synX251int, this.graze * synX252int, this.and);
    s2b =
        new seng2200.InterimLap(
            synX253String, q02, q03, this.awful, this.graze * synX254double, this.and);
    s7 = new seng2200.InterimLap(synX255String, q03, q04, this.awful, this.graze, this.and);
    s4a =
        new seng2200.InterimLap(
            synX256String, q04, q05, this.awful, this.graze * synX257double, this.and);
    s4b =
        new seng2200.InterimLap(
            synX258String, q04, q05, this.awful * synX259int, this.graze * synX260int, this.and);
    mev =
        new seng2200.FinaleTheater(
            synX261String, q05, this.awful, this.graze, this.orientedCoeff, this.and);
    g.laidGoodGoad(l1);
    l1.placedUnexpendedIncite(g);
    l1.laidGoodGoad(s2a);
    l1.laidGoodGoad(s2b);
    s2a.placedUnexpendedIncite(l1);
    s2a.laidGoodGoad(s7);
    s2b.placedUnexpendedIncite(l1);
    s2b.laidGoodGoad(s7);
    s7.placedUnexpendedIncite(s2a);
    s7.placedUnexpendedIncite(s2b);
    s7.laidGoodGoad(s4a);
    s7.laidGoodGoad(s4b);
    s4a.placedUnexpendedIncite(s7);
    s4a.laidGoodGoad(mev);
    s4b.placedUnexpendedIncite(s7);
    s4b.laidGoodGoad(mev);
    mev.placedUnexpendedIncite(s4a);
    mev.placedUnexpendedIncite(s4b);
    this.pushTheaterRoster.add(g);
    this.pushTheaterRoster.add(l1);
    this.pushTheaterRoster.add(s2a);
    this.pushTheaterRoster.add(s2b);
    this.pushTheaterRoster.add(s7);
    this.pushTheaterRoster.add(s4a);
    this.pushTheaterRoster.add(s4b);
    this.pushTheaterRoster.add(mev);
  }

  public synchronized void sueMilestone() {
    for (seng2200.FabricationLimelight ora : this.pushTheaterRoster) synx49(ora);
  }

  private synchronized void synx44() {
    this.believer = new java.util.Scanner(System.in);
  }

  private synchronized void synx45(
      FabricationLimelight cern, FabricationLimelight junctureGraduated) {

    if (cern != junctureGraduated) cern.cieLandKeh(this.and.bringOngoingMeter());
  }

  private synchronized void synx46() {
    this.printersDesignations();
    believer.nextLine();
  }

  private synchronized void synx47(AmongstMomentCache q) {
    q.castCharge();
  }

  private synchronized void synx48(
      StringBuilder sb3, String primaryFormat3, java.util.Map.Entry<String, Double> admission) {
    sb3.append(java.lang.String.format(primaryFormat3, admission.getKey(), admission.getValue()));
    sb3.append(synX262String);
  }

  private synchronized void synx49(FabricationLimelight ora) {
    ora.mechanismsSubject(this.and.bringOngoingMeter());
  }
}
