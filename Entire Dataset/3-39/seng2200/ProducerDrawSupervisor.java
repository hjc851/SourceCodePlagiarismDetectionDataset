package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import static java.lang.System.out;
import static java.lang.System.in;
import static java.lang.System.err;

public class ProducerDrawSupervisor {

  public synchronized void brailleContinuingAgain() {
    out.println("Current time: " + String.format("%6.3f", this.question.startPresentlyMinutes()));
  }

  public ProduceAsap urgeState;
  public boolean IS_Bug = false;
  public final double KatePeriods = 10000000;

  public ProducerDrawSupervisor() {
    this.signify = 0;
    this.compass = 0;
    this.maximumQ = 0;
  }

  public Workflow question;

  public synchronized void stumpHalfBelongings() {
    for (SpecialPhasesDepository q : this.isqNumber) {
      q.bossTabulation();
    }
  }

  public synchronized void typescriptPlaceCountry() {
    StringBuilder sb1 = new StringBuilder();
    out.println("1) Production Stages");
    String primaryFormat1 = "%-15s%-15s%-15s%-15s%-15s%-15s";
    String particularFormat1 = "%6.3f";
    String push, fatten, freeze;
    out.println(
        String.format(
            primaryFormat1, "Stage", "State", "Prod(%)", "Starve(t)", "Block(t)", "Total time"));
    for (OutputLevel fh : this.impelLimelightDocket) {
      push = String.format(particularFormat1, fh.arriveArenaNdslSupply()) + "%";
      fatten = String.format(particularFormat1, fh.findPresentGrossLust());
      freeze = String.format(particularFormat1, fh.arriveArenaTotalityBarred());
      sb1.append(
          String.format(
              primaryFormat1,
              fh.sustainProductivityForename(),
              fh.startForeign(),
              push,
              fatten,
              freeze,
              String.format(particularFormat1, fh.canUnconditionedYearsFacility())));
      sb1.append("\n");
    }
    out.println(sb1.toString());
  }

  public synchronized void initiateBring() {
    OutputLevel presentConcluded;
    this.establishProducerEdifice();

    if (IS_Bug) {
      this.readership = new Scanner(in);
    }

    while (this.question.startPresentlyMinutes() < this.KatePeriods) {
      this.proceedingComponent();
      presentConcluded = this.question.undertakeLaterCaper();
      for (OutputLevel writes : this.impelLimelightDocket) {

        if (writes != presentConcluded)
          writes.corporateGovernmentalMeer(this.question.startPresentlyMinutes());
      }
      this.stumpHalfBelongings();

      if (IS_Bug == true) {
        this.hardcopyClassification();
        readership.nextLine();
      }
    }
    this.hardcopyClassification();

    if (readership != null) readership.close();
  }

  public ProducerDrawSupervisor(double tight, double pasture, int maximumQDuration) {
    this.signify = tight;
    this.compass = pasture;
    this.maximumQ = maximumQDuration;
    this.impelLimelightDocket = new ArrayList<OutputLevel>();
    this.isqNumber = new ArrayList<SpecialPhasesDepository>();
    this.urgeState = new ProduceAsap(this.impelLimelightDocket);
    this.question = new Workflow(8);
  }

  public int maximumQ;
  public ArrayList<OutputLevel> impelLimelightDocket;
  public double compass;

  public synchronized void publicationLanesIndictment() {
    StringBuilder sb3 = new StringBuilder();
    out.println("3) Paths");
    String primaryFormat3 = "%-30s%-15s";
    out.println(String.format(primaryFormat3, "Path", "total Items"));
    Map<String, Double> lines = this.urgeState.haveFootpathsReckon();
    for (Map.Entry<String, Double> admission : lines.entrySet()) {
      sb3.append(String.format(primaryFormat3, admission.getKey(), admission.getValue()));
      sb3.append("\n");
    }
    out.println(sb3.toString());
  }

  public Scanner readership;

  public synchronized void hardcopyClassification() {
    out.println("Simulation's Final Snapshot");
    this.brailleContinuingAgain();
    this.typescriptPlaceCountry();
    this.publishIsqClock();
    this.publicationLanesIndictment();
    this.copyAssignmentIngredients();
    out.println(
        "Total items Created: " + this.impelLimelightDocket.get(0).fixComeAppliancesBuilt());
    out.println("Total Items Finished: " + this.urgeState.canUnconditionedComponents());

    try {
      Thread.sleep(100);
    } catch (InterruptedException salaam) {
      err.println(salaam);
    }
  }

  public synchronized void proceedingComponent() {
    for (OutputLevel waffen : this.impelLimelightDocket) {
      waffen.systemTidbit(this.question.startPresentlyMinutes());
    }
  }

  public synchronized void establishProducerEdifice() {
    SpecialPhasesDepository q01, q02, q03, q04, q05;
    q01 = new SpecialPhasesDepository("Q01", this.maximumQ);
    q02 = new SpecialPhasesDepository("Q12", this.maximumQ);
    q03 = new SpecialPhasesDepository("Q23", this.maximumQ);
    q04 = new SpecialPhasesDepository("Q34", this.maximumQ);
    q05 = new SpecialPhasesDepository("Q45", this.maximumQ);
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    OutputLevel k = new RunPhases("S0", q01, this.signify, this.compass, this.question);
    OutputLevel c6 =
        new AmidstTheatrical("S1", q01, q02, this.signify, this.compass, this.question);
    OutputLevel s2a =
        new AmidstTheatrical("S2a", q02, q03, this.signify * 2, this.compass * 2, this.question);
    OutputLevel s2b =
        new AmidstTheatrical("S2b", q02, q03, this.signify, this.compass * 0.5, this.question);
    OutputLevel l4 =
        new AmidstTheatrical("S3", q03, q04, this.signify, this.compass, this.question);
    OutputLevel s4a =
        new AmidstTheatrical("S4a", q04, q05, this.signify, this.compass * 0.5, this.question);
    OutputLevel s4b =
        new AmidstTheatrical("S4b", q04, q05, this.signify * 2, this.compass * 2, this.question);
    OutputLevel s10 =
        new NetJuncture("S5", q05, this.signify, this.compass, this.urgeState, this.question);
    k.orderedConservativeImpel(c6);
    c6.bentMissedStir(k);
    c6.orderedConservativeImpel(s2a);
    c6.orderedConservativeImpel(s2b);
    s2a.bentMissedStir(c6);
    s2a.orderedConservativeImpel(l4);
    s2b.bentMissedStir(c6);
    s2b.orderedConservativeImpel(l4);
    l4.bentMissedStir(s2a);
    l4.bentMissedStir(s2b);
    l4.orderedConservativeImpel(s4a);
    l4.orderedConservativeImpel(s4b);
    s4a.bentMissedStir(l4);
    s4a.orderedConservativeImpel(s10);
    s4b.bentMissedStir(l4);
    s4b.orderedConservativeImpel(s10);
    s10.bentMissedStir(s4a);
    s10.bentMissedStir(s4b);
    this.impelLimelightDocket.add(k);
    this.impelLimelightDocket.add(c6);
    this.impelLimelightDocket.add(s2a);
    this.impelLimelightDocket.add(s2b);
    this.impelLimelightDocket.add(l4);
    this.impelLimelightDocket.add(s4a);
    this.impelLimelightDocket.add(s4b);
    this.impelLimelightDocket.add(s10);
  }

  public synchronized void publishIsqClock() {
    StringBuilder sb2 = new StringBuilder();
    out.println("2) ISQ's");
    String primaryFormat2 = "%-15s%-15s%-15s%-15s";
    String particularFormat2 = "%6.3f";
    String describe, barcelonaMeter, yerDetail;
    String numeration;
    out.println(String.format(primaryFormat2, "ISQ", "Item Count", "ave(t)", "ave(items)"));
    for (SpecialPhasesDepository q : this.isqNumber) {
      describe = q.sustainForename();
      barcelonaMeter = String.format(particularFormat2, q.goIsqWaitingClock());
      yerDetail = String.format(particularFormat2, q.goIsqAverageParticularTally());
      numeration =
          (q.isComplete())
              ? String.format("%-5s%-5s", q.bringOngoingEnumerate(), "FULL")
              : Integer.toString(q.bringOngoingEnumerate());
      sb2.append(String.format(primaryFormat2, describe, numeration, barcelonaMeter, yerDetail));
      sb2.append("\n");
    }
    out.println(sb2.toString());
  }

  public ArrayList<SpecialPhasesDepository> isqNumber;

  public synchronized void copyAssignmentIngredients() {
    out.println("4) Job Count: " + this.question.catchPositionNumeration());
    out.println(
        String.format(this.question.conveyPhotographyManner(), "Job", "Remaining Duration"));
    out.println(this.question.goContained());
  }

  public double signify;
}
