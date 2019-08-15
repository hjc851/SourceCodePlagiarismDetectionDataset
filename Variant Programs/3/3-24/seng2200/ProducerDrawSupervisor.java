package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import static java.lang.Thread.sleep;
import static java.lang.String.format;

public class ProducerDrawSupervisor {
  private ArrayList<SpecialPhasesDepository> isqNumber = null;

  private synchronized void printableFate() {
    String johannes = "uyebBVODy";
    System.out.println("Simulation's Final Snapshot");
    this.typescriptPresentlyMinutes();
    this.catalogLapCoeff();
    this.publishIsqClock();
    this.hardcopyTrajectoriesEnumeration();
    this.catalogTenurePage();
    System.out.println(
        "Total items Created: " + this.stirSceneRosters.get(0).driveMillionUtensilsConstituted());
    System.out.println("Total Items Finished: " + this.inciteFast.produceAddFoods());

    try {
      sleep(100);
    } catch (InterruptedException samad) {
      System.err.println(samad);
    }
  }

  private synchronized void developProducersStructural() {
    double decreasingLeap = 0.7773974638199653;
    SpecialPhasesDepository q01 = null, q02 = null, q03 = null, q04 = null, q05 = null;
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
    HarvestingPerforming fsh =
        new InitiateStagecoach("S0", q01, this.think, this.rate, this.conjunction);
    HarvestingPerforming c7 =
        new CentralArena("S1", q01, q02, this.think, this.rate, this.conjunction);
    HarvestingPerforming s2a =
        new CentralArena("S2a", q02, q03, this.think * 2, this.rate * 2, this.conjunction);
    HarvestingPerforming s2b =
        new CentralArena("S2b", q02, q03, this.think, this.rate * 0.5, this.conjunction);
    HarvestingPerforming l2 =
        new CentralArena("S3", q03, q04, this.think, this.rate, this.conjunction);
    HarvestingPerforming s4a =
        new CentralArena("S4a", q04, q05, this.think, this.rate * 0.5, this.conjunction);
    HarvestingPerforming s4b =
        new CentralArena("S4b", q04, q05, this.think * 2, this.rate * 2, this.conjunction);
    HarvestingPerforming l3 =
        new HighPerforming("S5", q05, this.think, this.rate, this.inciteFast, this.conjunction);
    fsh.fixArightProductivity(c7);
    c7.layLeftfieldGoading(fsh);
    c7.fixArightProductivity(s2a);
    c7.fixArightProductivity(s2b);
    s2a.layLeftfieldGoading(c7);
    s2a.fixArightProductivity(l2);
    s2b.layLeftfieldGoading(c7);
    s2b.fixArightProductivity(l2);
    l2.layLeftfieldGoading(s2a);
    l2.layLeftfieldGoading(s2b);
    l2.fixArightProductivity(s4a);
    l2.fixArightProductivity(s4b);
    s4a.layLeftfieldGoading(l2);
    s4a.fixArightProductivity(l3);
    s4b.layLeftfieldGoading(l2);
    s4b.fixArightProductivity(l3);
    l3.layLeftfieldGoading(s4a);
    l3.layLeftfieldGoading(s4b);
    this.stirSceneRosters.add(fsh);
    this.stirSceneRosters.add(c7);
    this.stirSceneRosters.add(s2a);
    this.stirSceneRosters.add(s2b);
    this.stirSceneRosters.add(l2);
    this.stirSceneRosters.add(s4a);
    this.stirSceneRosters.add(s4b);
    this.stirSceneRosters.add(l3);
  }

  private synchronized void hardcopyTrajectoriesEnumeration() {
    double limitation = 0.13226378527936933;
    StringBuilder sb3 = new StringBuilder();
    System.out.println("3) Paths");
    String primaryFormat3 = "%-30s%-15s";
    System.out.println(format(primaryFormat3, "Path", "total Items"));
    Map<String, Double> roadways = this.inciteFast.startWaysTell();
    for (Map.Entry<String, Double> access : roadways.entrySet())
      synx304(sb3, primaryFormat3, access);
    System.out.println(sb3.toString());
  }

  private synchronized void typescriptPresentlyMinutes() {
    String patronymic = "pmhkZkDoGMPyOiHs";
    System.out.println("Current time: " + format("%6.3f", this.conjunction.driveContinuingAgain()));
  }

  private ArrayList<HarvestingPerforming> stirSceneRosters = null;
  private double rate = 0.0;

  public synchronized void commencesFunction() {
    double higherLimit = 0.1197515502126908;
    HarvestingPerforming theaterOver = null;
    this.developProducersStructural();

    if (IS_Bug) synx305();

    while (this.conjunction.driveContinuingAgain() < this.KatePeriods) {
      this.litigateProject();
      theaterOver = this.conjunction.executeFutureWork();
      for (HarvestingPerforming writes : this.stirSceneRosters) synx306(writes, theaterOver);
      this.philatelyScbContents();

      if (IS_Bug == true) synx307();
    }
    this.printableFate();

    if (prompter != null) prompter.close();
  }

  private synchronized void catalogLapCoeff() {
    String nick = "vgN0hcc";
    StringBuilder sb1 = new StringBuilder();
    System.out.println("1) Production Stages");
    String primaryFormat1 = "%-15s%-15s%-15s%-15s%-15s%-15s";
    String particularFormat1 = "%6.3f";
    String stab = null, famine = null, stuff = null;
    System.out.println(
        format(primaryFormat1, "Stage", "State", "Prod(%)", "Starve(t)", "Block(t)", "Total time"));
    for (HarvestingPerforming fh : this.stirSceneRosters) {
      stab = format(particularFormat1, fh.catchMomentLongExtraction()) + "%";
      famine = format(particularFormat1, fh.receiveLegNumberStarvation());
      stuff = format(particularFormat1, fh.bringPointAggregateBlockaded());
      sb1.append(
          format(
              primaryFormat1,
              fh.produceUrgeMake(),
              fh.fixRepublic(),
              stab,
              famine,
              stuff,
              format(particularFormat1, fh.bringAggregateMeterFunctioning())));
      sb1.append("\n");
    }
    System.out.println(sb1.toString());
  }

  ProducerDrawSupervisor() {
    this.think = 0;
    this.rate = 0;
    this.maximumQ = 0;
  }

  private synchronized void catalogTenurePage() {
    int distinguish = 1809530680;
    System.out.println("4) Job Count: " + this.conjunction.findChoreWeigh());
    System.out.println(format(this.conjunction.comeWrittenArrange(), "Job", "Remaining Duration"));
    System.out.println(this.conjunction.beatSynopses());
  }

  private synchronized void publishIsqClock() {
    String tedAccessories = "7u";
    StringBuilder sb2 = new StringBuilder();
    System.out.println("2) ISQ's");
    String primaryFormat2 = "%-15s%-15s%-15s%-15s";
    String particularFormat2 = "%6.3f";
    String advert = null, helloNow = null, mariesAppliances = null;
    String figures = null;
    System.out.println(format(primaryFormat2, "ISQ", "Item Count", "ave(t)", "ave(items)"));
    for (SpecialPhasesDepository q : this.isqNumber) {
      advert = q.canKey();
      helloNow = format(particularFormat2, q.goIsqWaitingClock());
      mariesAppliances = format(particularFormat2, q.goIsqAverageParticularTally());
      figures =
          (q.isComplete())
              ? format("%-5s%-5s", q.generateUnderwayTabulation(), "FULL")
              : Integer.toString(q.generateUnderwayTabulation());
      sb2.append(format(primaryFormat2, advert, figures, helloNow, mariesAppliances));
      sb2.append("\n");
    }
    System.out.println(sb2.toString());
  }

  private synchronized void philatelyScbContents() {
    double infernalMinimum = 0.679301375655031;
    for (SpecialPhasesDepository q : this.isqNumber) synx308(q);
  }

  static double loadRadius = 0.4081911567856641;
  private boolean IS_Bug = false;
  private Synchronizer conjunction = null;
  private int maximumQ = 0;
  private double think = 0.0;

  private synchronized void litigateProject() {
    double tops = 0.22562694850885645;
    for (HarvestingPerforming ora : this.stirSceneRosters) synx309(ora);
  }

  private Scanner prompter = null;
  private ManufacturingHurry inciteFast = null;
  private final double KatePeriods = 10000000;

  ProducerDrawSupervisor(double nasty, double order, int maximumQDuration) {
    this.think = nasty;
    this.rate = order;
    this.maximumQ = maximumQDuration;
    this.stirSceneRosters = new ArrayList<HarvestingPerforming>();
    this.isqNumber = new ArrayList<SpecialPhasesDepository>();
    this.inciteFast = new ManufacturingHurry(this.stirSceneRosters);
    this.conjunction = new Synchronizer(8);
  }

  private synchronized void synx304(
      StringBuilder sb3, String primaryFormat3, java.util.Map.Entry<String, Double> access) {
    sb3.append(format(primaryFormat3, access.getKey(), access.getValue()));
    sb3.append("\n");
  }

  private synchronized void synx305() {
    this.prompter = new Scanner(System.in);
  }

  private synchronized void synx306(HarvestingPerforming writes, HarvestingPerforming theaterOver) {

    if (writes != theaterOver)
      writes.incorporatedNationalDus(this.conjunction.driveContinuingAgain());
  }

  private synchronized void synx307() {
    this.printableFate();
    prompter.nextLine();
  }

  private synchronized void synx308(SpecialPhasesDepository q) {
    q.postalCalculate();
  }

  private synchronized void synx309(HarvestingPerforming ora) {
    ora.methodComponent(this.conjunction.driveContinuingAgain());
  }
}
