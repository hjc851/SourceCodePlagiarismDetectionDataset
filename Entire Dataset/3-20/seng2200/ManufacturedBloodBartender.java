package seng2200;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.lang.Thread;
import static java.lang.System.out;
import static java.lang.System.in;
import static java.lang.System.err;
import static java.lang.String.format;
import static java.lang.Thread.sleep;

public class ManufacturedBloodBartender {
  public ArrayList<EtcRostrumWarehouse> isqNumber = null;

  public synchronized void bossCounterNecessities() {
    for (EtcRostrumWarehouse q : this.isqNumber) {
      q.embossEnumerate();
    }
  }

  public synchronized void copyStreamWeek() {
    out.println("Current time: " + format("%6.3f", this.nne.obtainLiveDays()));
  }

  public ProcessingState goadingGb = null;

  public synchronized void publicationLanesIndictment() {
    StringBuilder sb3 = new StringBuilder();
    out.println("3) Paths");
    String primaryFormat3 = "%-30s%-15s";
    out.println(format(primaryFormat3, "Path", "total Items"));
    Map<String, Double> trajectories = this.goadingGb.drawCorridorsCensus();
    for (Map.Entry<String, Double> entree : trajectories.entrySet()) {
      sb3.append(format(primaryFormat3, entree.getKey(), entree.getValue()));
      sb3.append("\n");
    }
    out.println(sb3.toString());
  }

  public ManufacturedBloodBartender() {
    this.skilled = 0;
    this.wander = 0;
    this.maximumQ = 0;
  }

  public double skilled = 0.0;
  public double wander = 0.0;

  public synchronized void beginningOperate() {
    ProducesSpotlight arenaDestroyed = null;
    this.produceProductArchitecture();

    if (IS_Bug) {
      this.readership = new Scanner(in);
    }

    while (this.nne.obtainLiveDays() < this.HighestHours) {
      this.treatInstar();
      arenaDestroyed = this.nne.conductsAheadDuties();
      for (ProducesSpotlight writes : this.needleInstarCompilation) {

        if (writes != arenaDestroyed) writes.limitedCantonsRik(this.nne.obtainLiveDays());
      }
      this.bossCounterNecessities();

      if (IS_Bug == true) {
        this.catalogImportance();
        readership.nextLine();
      }
    }
    this.catalogImportance();

    if (readership != null) readership.close();
  }

  public Scanner readership = null;
  public ArrayList<ProducesSpotlight> needleInstarCompilation = null;

  public synchronized void treatInstar() {
    for (ProducesSpotlight fh : this.needleInstarCompilation) {
      fh.cycleAgenda(this.nne.obtainLiveDays());
    }
  }

  public synchronized void publicationsMomentFast() {
    StringBuilder sb1 = new StringBuilder();
    out.println("1) Production Stages");
    String primaryFormat1 = "%-15s%-15s%-15s%-15s%-15s%-15s";
    String particularFormat1 = "%6.3f";
    String jab = null, impoverish = null, obstruct = null;
    out.println(
        format(primaryFormat1, "Stage", "State", "Prod(%)", "Starve(t)", "Block(t)", "Total time"));
    for (ProducesSpotlight waffen : this.needleInstarCompilation) {
      jab = format(particularFormat1, waffen.generateRostrumCounterManufacture()) + "%";
      impoverish = format(particularFormat1, waffen.arriveArenaTotalityAppetite());
      obstruct = format(particularFormat1, waffen.developSceneTotHampered());
      sb1.append(
          format(
              primaryFormat1,
              waffen.haveDigFigure(),
              waffen.conveyTerritory(),
              jab,
              impoverish,
              obstruct,
              format(particularFormat1, waffen.obtainSumDaysOperate())));
      sb1.append("\n");
    }
    out.println(sb1.toString());
  }

  public synchronized void catalogImportance() {
    out.println("Simulation's Final Snapshot");
    this.copyStreamWeek();
    this.publicationsMomentFast();
    this.publishIsqClock();
    this.publicationLanesIndictment();
    this.reprintCaperGist();
    out.println(
        "Total items Created: "
            + this.needleInstarCompilation.get(0).conveyMaximumConsignmentsUnleashed());
    out.println("Total Items Finished: " + this.goadingGb.comeOverallDetail());

    try {
      sleep(100);
    } catch (InterruptedException cma) {
      err.println(cma);
    }
  }

  public synchronized void publishIsqClock() {
    StringBuilder sb2 = new StringBuilder();
    out.println("2) ISQ's");
    String primaryFormat2 = "%-15s%-15s%-15s%-15s";
    String particularFormat2 = "%6.3f";
    String identify = null, birdBeginning = null, blvdParticular = null;
    String figure = null;
    out.println(format(primaryFormat2, "ISQ", "Item Count", "ave(t)", "ave(items)"));
    for (EtcRostrumWarehouse q : this.isqNumber) {
      identify = q.drawGens();
      birdBeginning = format(particularFormat2, q.goIsqWaitingClock());
      blvdParticular = format(particularFormat2, q.goIsqAverageParticularTally());
      figure =
          (q.isComplete())
              ? format("%-5s%-5s", q.fetchPresentQuantify(), "FULL")
              : Integer.toString(q.fetchPresentQuantify());
      sb2.append(format(primaryFormat2, identify, figure, birdBeginning, blvdParticular));
      sb2.append("\n");
    }
    out.println(sb2.toString());
  }

  public ManufacturedBloodBartender(double signify, double reach, int maximumQDuration) {
    this.skilled = signify;
    this.wander = reach;
    this.maximumQ = maximumQDuration;
    this.needleInstarCompilation = new ArrayList<ProducesSpotlight>();
    this.isqNumber = new ArrayList<EtcRostrumWarehouse>();
    this.goadingGb = new ProcessingState(this.needleInstarCompilation);
    this.nne = new Planner(8);
  }

  public Planner nne = null;
  public int maximumQ = 0;

  public synchronized void reprintCaperGist() {
    out.println("4) Job Count: " + this.nne.developGigCalculate());
    out.println(format(this.nne.findPrinterLayout(), "Job", "Remaining Duration"));
    out.println(this.nne.goContained());
  }

  public synchronized void produceProductArchitecture() {
    EtcRostrumWarehouse q01 = null, q02 = null, q03 = null, q04 = null, q05 = null;
    q01 = new EtcRostrumWarehouse("Q01", this.maximumQ);
    q02 = new EtcRostrumWarehouse("Q12", this.maximumQ);
    q03 = new EtcRostrumWarehouse("Q23", this.maximumQ);
    q04 = new EtcRostrumWarehouse("Q34", this.maximumQ);
    q05 = new EtcRostrumWarehouse("Q45", this.maximumQ);
    this.isqNumber.add(q01);
    this.isqNumber.add(q02);
    this.isqNumber.add(q03);
    this.isqNumber.add(q04);
    this.isqNumber.add(q05);
    ProducesSpotlight ci = new BeginsLap("S0", q01, this.skilled, this.wander, this.nne);
    ProducesSpotlight l1 =
        new SettingPerforming("S1", q01, q02, this.skilled, this.wander, this.nne);
    ProducesSpotlight s2a =
        new SettingPerforming("S2a", q02, q03, this.skilled * 2, this.wander * 2, this.nne);
    ProducesSpotlight s2b =
        new SettingPerforming("S2b", q02, q03, this.skilled, this.wander * 0.5, this.nne);
    ProducesSpotlight l4 =
        new SettingPerforming("S3", q03, q04, this.skilled, this.wander, this.nne);
    ProducesSpotlight s4a =
        new SettingPerforming("S4a", q04, q05, this.skilled, this.wander * 0.5, this.nne);
    ProducesSpotlight s4b =
        new SettingPerforming("S4b", q04, q05, this.skilled * 2, this.wander * 2, this.nne);
    ProducesSpotlight s10 =
        new LatterSpotlight("S5", q05, this.skilled, this.wander, this.goadingGb, this.nne);
    ci.fixArightProductivity(l1);
    l1.fitNighJab(ci);
    l1.fixArightProductivity(s2a);
    l1.fixArightProductivity(s2b);
    s2a.fitNighJab(l1);
    s2a.fixArightProductivity(l4);
    s2b.fitNighJab(l1);
    s2b.fixArightProductivity(l4);
    l4.fitNighJab(s2a);
    l4.fitNighJab(s2b);
    l4.fixArightProductivity(s4a);
    l4.fixArightProductivity(s4b);
    s4a.fitNighJab(l4);
    s4a.fixArightProductivity(s10);
    s4b.fitNighJab(l4);
    s4b.fixArightProductivity(s10);
    s10.fitNighJab(s4a);
    s10.fitNighJab(s4b);
    this.needleInstarCompilation.add(ci);
    this.needleInstarCompilation.add(l1);
    this.needleInstarCompilation.add(s2a);
    this.needleInstarCompilation.add(s2b);
    this.needleInstarCompilation.add(l4);
    this.needleInstarCompilation.add(s4a);
    this.needleInstarCompilation.add(s4b);
    this.needleInstarCompilation.add(s10);
  }

  public final double HighestHours = 10000000;
  public boolean IS_Bug = false;
}
