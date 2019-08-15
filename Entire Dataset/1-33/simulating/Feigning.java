package simulating;

import indiscernible.PeriodWarden;
import productivityDevices.StorableSubject;
import promoter.*;
import inventory.*;
import tape.*;
import static java.lang.String.format;

public class Feigning {
  public Cache archival[];
  public double periodsBound;

  public Feigning(double hoursRestriction, double regularUngenerous, double criterialRank) {
    this.periodsBound = hoursRestriction;
    this.basicThink = regularUngenerous;
    this.definitiveOrbit = criterialRank;
    this.forumFile = new ContestReaper();
    this.operator = new Director[8];
    this.archival = new Cache[5];
    archival[0] = new Cache();
    archival[1] = new Cache();
    archival[2] = new Cache();
    archival[3] = new Cache();
    archival[4] = new Cache();
    operator[0] = new VintnerResume(this.basicThink, this.definitiveOrbit, archival[0]);
    operator[1] =
        new OperatorPolice(this.basicThink, this.definitiveOrbit, archival[1], archival[0]);
    operator[2] =
        new OperatorPolice(
            this.basicThink * 2.0, this.definitiveOrbit * 2.0, archival[2], archival[1]);
    operator[3] =
        new OperatorPolice(
            this.basicThink * 2.0, this.definitiveOrbit * 2.0, archival[2], archival[1]);
    operator[4] =
        new OperatorPolice(this.basicThink, this.definitiveOrbit, archival[3], archival[2]);
    operator[5] =
        new OperatorPolice(
            this.basicThink * 2.0, this.definitiveOrbit * 2.0, archival[4], archival[3]);
    operator[6] =
        new OperatorPolice(
            this.basicThink * 2.0, this.definitiveOrbit * 2.0, archival[4], archival[3]);
    operator[7] = new ManufacturersEnding(this.basicThink, this.definitiveOrbit, archival[4]);
    archival[0].bentNew(operator[1]);
    archival[0].doFinal(operator[0]);
    archival[1].bentNew(operator[2], operator[3]);
    archival[1].doFinal(operator[1]);
    archival[2].bentNew(operator[4]);
    archival[2].doFinal(operator[2], operator[3]);
    archival[3].bentNew(operator[5], operator[6]);
    archival[3].doFinal(operator[4]);
    archival[4].bentNew(operator[7]);
    archival[4].doFinal(operator[5], operator[6]);
    this.forumFile.installCeremonies(
        new CommodityRace(PeriodWarden.presentBeginning(), CommodityRace.BumGet, operator[0]));
  }

  public synchronized void commence() {
    Feigning.presentlySynthesizer = this;

    while (PeriodWarden.presentBeginning() < this.periodsBound && this.forumFile.recount() > 0) {
      this.forumFile.nowRace().workFestival();
    }
    this.publishingStat();
  }

  public double basicThink;
  public ContestReaper forumFile;

  public synchronized void publishingStat() {
    System.out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.periodsBound,
            PeriodWarden.presentBeginning(),
            this.basicThink,
            this.definitiveOrbit));
    System.out.println(format("Storage Capacity: %d", Cache.depotLimitation()));
    System.out.println("ProducibleObject count: " + StorableSubject.actualWeigh());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Director electricity : operator) {
      System.out.println(electricity.statistical());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Cache ora : archival) {
      System.out.println(ora.statisticians());
    }
    System.out.println(" ----------------------------------------------- ");
  }

  public double definitiveOrbit;
  public Director operator[];

  public static synchronized Feigning prevailingModel() {
    return presentlySynthesizer;
  }

  public static Feigning presentlySynthesizer;

  public synchronized double meterCircumscribe() {
    return this.periodsBound;
  }
}
