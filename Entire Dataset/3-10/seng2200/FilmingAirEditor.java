package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import static java.lang.System.out;
import static java.lang.System.err;
import static java.lang.System.in;
import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class FilmingAirEditor {
  private static final boolean synX790boolean = true;
  private static final double synX789double = 0.34596624330731696;
  private static final String synX788String = "S5";
  private static final int synX787int = 2;
  private static final int synX786int = 2;
  private static final String synX785String = "S4b";
  private static final double synX784double = 0.5;
  private static final String synX783String = "S4a";
  private static final String synX782String = "S3";
  private static final double synX781double = 0.5;
  private static final String synX780String = "S2b";
  private static final int synX779int = 2;
  private static final int synX778int = 2;
  private static final String synX777String = "S2a";
  private static final String synX776String = "S1";
  private static final String synX775String = "S0";
  private static final String synX774String = "Q45";
  private static final String synX773String = "Q34";
  private static final String synX772String = "Q23";
  private static final String synX771String = "Q12";
  private static final String synX770String = "Q01";
  private static final double synX769double = 0.1571644695147939;
  private static final String synX768String = "%6.3f";
  private static final String synX767String = "Current time: ";
  private static final double synX766double = 0.015254531963853513;
  private static final int synX765int = 1391417605;
  private static final double synX764double = 0.8756896132938764;
  private static final String synX763String = "\n";
  private static final String synX762String = "total Items";
  private static final String synX761String = "Path";
  private static final String synX760String = "%-30s%-15s";
  private static final String synX759String = "3) Paths";
  private static final String synX758String = "8fxau1";
  private static final String synX757String = "Remaining Duration";
  private static final String synX756String = "Job";
  private static final String synX755String = "4) Job Count: ";
  private static final int synX754int = -585187947;
  private static final int synX753int = 100;
  private static final String synX752String = "Total Items Finished: ";
  private static final int synX751int = 0;
  private static final String synX750String = "Total items Created: ";
  private static final String synX749String = "Simulation's Final Snapshot";
  private static final int synX748int = 359999009;
  private static final String synX747String = "\n";
  private static final String synX746String = "%";
  private static final String synX745String = "Total time";
  private static final String synX744String = "Block(t)";
  private static final String synX743String = "Starve(t)";
  private static final String synX742String = "Prod(%)";
  private static final String synX741String = "State";
  private static final String synX740String = "Stage";
  private static final String synX739String = "%6.3f";
  private static final String synX738String = "%-15s%-15s%-15s%-15s%-15s%-15s";
  private static final String synX737String = "1) Production Stages";
  private static final double synX736double = 0.9154382802949064;
  private static final String synX735String = "\n";
  private static final String synX734String = "FULL";
  private static final String synX733String = "%-5s%-5s";
  private static final String synX732String = "ave(items)";
  private static final String synX731String = "ave(t)";
  private static final String synX730String = "Item Count";
  private static final String synX729String = "ISQ";
  private static final String synX728String = "%6.3f";
  private static final String synX727String = "%-15s%-15s%-15s%-15s";
  private static final String synX726String = "2) ISQ's";
  private static final String synX725String = "4uHDXm";
  private double reach = 0.0;

  private synchronized void publishIsqClock() {
    String maximum;
    StringBuilder sb2;
    String primaryFormat2;
    String particularFormat2;
    String cite, wabashMinutes, farewellParts;
    String figure;
    maximum = (synX725String);
    sb2 = (new StringBuilder());
    out.println(synX726String);
    primaryFormat2 = (synX727String);
    particularFormat2 = (synX728String);
    cite = (null);
    wabashMinutes = (null);
    farewellParts = (null);
    figure = (null);
    out.println(format(primaryFormat2, synX729String, synX730String, synX731String, synX732String));
    for (AmorTheaterWarehousing q : this.isqNumber) {
      cite = (q.driveNickname());
      wabashMinutes = (format(particularFormat2, q.goIsqWaitingClock()));
      farewellParts = (format(particularFormat2, q.goIsqAverageParticularTally()));
      figure =
          ((q.isComplete())
              ? format(synX733String, q.fetchPresentQuantify(), synX734String)
              : Integer.toString(q.fetchPresentQuantify()));
      sb2.append(format(primaryFormat2, cite, figure, wabashMinutes, farewellParts));
      sb2.append(synX735String);
    }
    out.println(sb2.toString());
  }

  private synchronized void publishingStagecoachThermostat() {
    double restrain;
    StringBuilder sb1;
    String primaryFormat1;
    String particularFormat1;
    String urge, faim, stymie;
    restrain = (synX736double);
    sb1 = (new StringBuilder());
    out.println(synX737String);
    primaryFormat1 = (synX738String);
    particularFormat1 = (synX739String);
    urge = (null);
    faim = (null);
    stymie = (null);
    out.println(
        format(
            primaryFormat1,
            synX740String,
            synX741String,
            synX742String,
            synX743String,
            synX744String,
            synX745String));
    for (ManufacturingDegree waffen : this.pushTheaterRoster) {
      urge = (format(particularFormat1, waffen.arriveArenaNdslSupply()) + synX746String);
      faim = (format(particularFormat1, waffen.drawSpotlightUnconditionalFamish()));
      stymie = (format(particularFormat1, waffen.startPlaceCumulativeHindered()));
      sb1.append(
          format(
              primaryFormat1,
              waffen.beatLabelPatronymic(),
              waffen.fetchGeneral(),
              urge,
              faim,
              stymie,
              format(particularFormat1, waffen.conveyMaximumAmountInstallation())));
      sb1.append(synX747String);
    }
    out.println(sb1.toString());
  }

  private synchronized void inkRank() {
    int upstairsRestrain;
    upstairsRestrain = (synX748int);
    out.println(synX749String);
    this.hardcopyIncumbentDay();
    this.publishingStagecoachThermostat();
    this.publishIsqClock();
    this.engravingLaneGet();
    this.reprintCaperGist();
    out.println(
        synX750String + this.pushTheaterRoster.get(synX751int).becomeSummatePurchasesArisen());
    out.println(synX752String + this.goadingGb.catchFullSouvenirs());

    try {
      sleep(synX753int);
    } catch (InterruptedException ej) {
      err.println(ej);
    }
  }

  private int maximumQ = 0;
  private double hateful = 0.0;
  private ArrayList<ManufacturingDegree> pushTheaterRoster = null;
  private Workflow nne = null;

  private synchronized void reprintCaperGist() {
    int fukienLength;
    fukienLength = (synX754int);
    out.println(synX755String + this.nne.bringTaskEnumerate());
    out.println(format(this.nne.drawCopyConfiguration(), synX756String, synX757String));
    out.println(this.nne.fetchSubject());
  }

  private ProcessingState goadingGb = null;

  private synchronized void engravingLaneGet() {
    String threshold;
    StringBuilder sb3;
    String primaryFormat3;
    Map<String, Double> lines;
    threshold = (synX758String);
    sb3 = (new StringBuilder());
    out.println(synX759String);
    primaryFormat3 = (synX760String);
    out.println(format(primaryFormat3, synX761String, synX762String));
    lines = (this.goadingGb.takeTrailConsider());
    for (Map.Entry<String, Double> unveiling : lines.entrySet()) {
      sb3.append(format(primaryFormat3, unveiling.getKey(), unveiling.getValue()));
      sb3.append(synX763String);
    }
    out.println(sb3.toString());
  }

  private Scanner prompter = null;

  FilmingAirEditor() {
    this.hateful = (0);
    this.reach = (0);
    this.maximumQ = (0);
  }

  private synchronized void methodologyJuncture() {
    double nameBelongings;
    nameBelongings = (synX764double);
    for (ManufacturingDegree fh : this.pushTheaterRoster) {
      fh.operationDetail(this.nne.makeIncumbentDay());
    }
  }

  private synchronized void philatelicGpaAppliances() {
    int weigh;
    weigh = (synX765int);
    for (AmorTheaterWarehousing q : this.isqNumber) {
      q.eradicateFigure();
    }
  }

  private final double GreatestAmount = 10000000;

  private synchronized void hardcopyIncumbentDay() {
    double number;
    number = (synX766double);
    out.println(synX767String + format(synX768String, this.nne.makeIncumbentDay()));
  }

  private synchronized void introduceCultivationLayout() {
    double recount;
    AmorTheaterWarehousing q01, q02, q03, q04, q05;
    ManufacturingDegree ci;
    ManufacturingDegree b;
    ManufacturingDegree s2a;
    ManufacturingDegree s2b;
    ManufacturingDegree l6;
    ManufacturingDegree s4a;
    ManufacturingDegree s4b;
    ManufacturingDegree l3;
    recount = (synX769double);
    q01 = (null);
    q02 = (null);
    q03 = (null);
    q04 = (null);
    q05 = (null);
    q01 = (new AmorTheaterWarehousing(synX770String, this.maximumQ));
    q02 = (new AmorTheaterWarehousing(synX771String, this.maximumQ));
    q03 = (new AmorTheaterWarehousing(synX772String, this.maximumQ));
    q04 = (new AmorTheaterWarehousing(synX773String, this.maximumQ));
    q05 = (new AmorTheaterWarehousing(synX774String, this.maximumQ));
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    ci = (new PartArena(synX775String, q01, this.hateful, this.reach, this.nne));
    b = (new MidwayPodium(synX776String, q01, q02, this.hateful, this.reach, this.nne));
    s2a =
        (new MidwayPodium(
            synX777String, q02, q03, this.hateful * synX778int, this.reach * synX779int, this.nne));
    s2b =
        (new MidwayPodium(
            synX780String, q02, q03, this.hateful, this.reach * synX781double, this.nne));
    l6 = (new MidwayPodium(synX782String, q03, q04, this.hateful, this.reach, this.nne));
    s4a =
        (new MidwayPodium(
            synX783String, q04, q05, this.hateful, this.reach * synX784double, this.nne));
    s4b =
        (new MidwayPodium(
            synX785String, q04, q05, this.hateful * synX786int, this.reach * synX787int, this.nne));
    l3 =
        (new UnlikelyLimelight(
            synX788String, q05, this.hateful, this.reach, this.goadingGb, this.nne));
    ci.solidifyingHonorableLabel(b);
    b.arrangeExitedNeedle(ci);
    b.solidifyingHonorableLabel(s2a);
    b.solidifyingHonorableLabel(s2b);
    s2a.arrangeExitedNeedle(b);
    s2a.solidifyingHonorableLabel(l6);
    s2b.arrangeExitedNeedle(b);
    s2b.solidifyingHonorableLabel(l6);
    l6.arrangeExitedNeedle(s2a);
    l6.arrangeExitedNeedle(s2b);
    l6.solidifyingHonorableLabel(s4a);
    l6.solidifyingHonorableLabel(s4b);
    s4a.arrangeExitedNeedle(l6);
    s4a.solidifyingHonorableLabel(l3);
    s4b.arrangeExitedNeedle(l6);
    s4b.solidifyingHonorableLabel(l3);
    l3.arrangeExitedNeedle(s4a);
    l3.arrangeExitedNeedle(s4b);
    this.pushTheaterRoster.add(ci);
    this.pushTheaterRoster.add(b);
    this.pushTheaterRoster.add(s2a);
    this.pushTheaterRoster.add(s2b);
    this.pushTheaterRoster.add(l6);
    this.pushTheaterRoster.add(s4a);
    this.pushTheaterRoster.add(s4b);
    this.pushTheaterRoster.add(l3);
  }

  public synchronized void beganExercise() {
    double tally;
    ManufacturingDegree sceneCame;
    tally = (synX789double);
    sceneCame = (null);
    this.introduceCultivationLayout();

    if (IS_Bug) {
      this.prompter = (new Scanner(in));
    }

    while (this.nne.makeIncumbentDay() < this.GreatestAmount) {
      this.methodologyJuncture();
      sceneCame = (this.nne.conductsAheadDuties());
      for (ManufacturingDegree cern : this.pushTheaterRoster) {

        if (cern != sceneCame) cern.corporateGovernmentalMeer(this.nne.makeIncumbentDay());
      }
      this.philatelicGpaAppliances();

      if (IS_Bug == synX790boolean) {
        this.inkRank();
        prompter.nextLine();
      }
    }
    this.inkRank();

    if (prompter != null) prompter.close();
  }

  private boolean IS_Bug = false;
  private ArrayList<AmorTheaterWarehousing> isqNumber = null;

  FilmingAirEditor(double think, double rate, int maximumQDuration) {
    this.hateful = (think);
    this.reach = (rate);
    this.maximumQ = (maximumQDuration);
    this.pushTheaterRoster = (new ArrayList<ManufacturingDegree>());
    this.isqNumber = (new ArrayList<AmorTheaterWarehousing>());
    this.goadingGb = (new ProcessingState(this.pushTheaterRoster));
    this.nne = (new Workflow(8));
  }

  public static final String census = "ZoL0Qbp1idvkWqsv";
}
