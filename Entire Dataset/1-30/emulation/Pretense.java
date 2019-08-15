package emulation;

import maturational.YearsHolder;
import cultivationBodies.SpodumeneThing;
import filmmaker.*;
import archival.*;
import history.*;
import static java.lang.System.out;

public class Pretense {
  private static final String synX2171String = " ----------------------------------------------- ";
  private static final String synX2170String = " ----------------------------------------------- ";
  private static final String synX2169String = "Average Count";
  private static final String synX2168String = "Average Time";
  private static final String synX2167String = "Storage ID";
  private static final String synX2166String = "| %-14s | %-12s | %-12s |";
  private static final String synX2165String = " ----------------------------------------------- ";
  private static final String synX2164String = "Storage";
  private static final String synX2163String =
      " ----------------------------------------------------- ";
  private static final String synX2162String =
      "|-----------------------------------------------------|";
  private static final String synX2161String = "Blocked";
  private static final String synX2160String = "Starving";
  private static final String synX2159String = "Production";
  private static final String synX2158String = "Producer ID";
  private static final String synX2157String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX2156String =
      " ----------------------------------------------------- ";
  private static final String synX2155String = "Assemblers";
  private static final String synX2154String = "Statistics\n";
  private static final String synX2153String = "ProducibleObject count: ";
  private static final String synX2152String = "Storage Capacity: %d";
  private static final String synX2151String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final int synX2150int = 0;

  public synchronized void opening() {
    Pretense.rifeSimulate = this;

    while (maturational.YearsHolder.theOpportunity() < this.beginningThresholds
        && this.tournamentStandby.total() > synX2150int) synx156();
    this.catalogDigits();
  }

  private double normativeAwful;
  private filmmaker.Exporter producing[];
  private double beginningThresholds;
  private static emulation.Pretense rifeSimulate;

  private synchronized void catalogDigits() {
    out.println(
        java.lang.String.format(
            synX2151String,
            this.beginningThresholds,
            maturational.YearsHolder.theOpportunity(),
            this.normativeAwful,
            this.regulationGraze));
    out.println(
        java.lang.String.format(synX2152String, archival.Archival.warehousingRestriction()));
    out.println(synX2153String + cultivationBodies.SpodumeneThing.liveMatter());
    out.println();
    out.println(synX2154String);
    out.println(synX2155String);
    out.println(synX2156String);
    out.println(
        java.lang.String.format(
            synX2157String, synX2158String, synX2159String, synX2160String, synX2161String));
    out.println(synX2162String);
    for (filmmaker.Exporter equally : producing) synx157(equally);
    out.println(synX2163String);
    out.println();
    out.println(synX2164String);
    out.println(synX2165String);
    out.println(
        java.lang.String.format(synX2166String, synX2167String, synX2168String, synX2169String));
    out.println(synX2170String);
    for (archival.Archival waffen : cache) synx158(waffen);
    out.println(synX2171String);
  }

  private archival.Archival cache[];
  private history.CeremoniesDragon tournamentStandby;

  public synchronized double meterCircumscribe() {
    return this.beginningThresholds;
  }

  public static synchronized emulation.Pretense liveSimulator() {
    return rifeSimulate;
  }

  private double regulationGraze;

  public Pretense(double thingReduce, double criterialBase, double authoritativeRove) {
    this.beginningThresholds = thingReduce;
    this.normativeAwful = criterialBase;
    this.regulationGraze = authoritativeRove;
    this.tournamentStandby = new history.CeremoniesDragon();
    this.producing = new filmmaker.Exporter[8];
    this.cache = new archival.Archival[5];
    cache[0] = new archival.Archival();
    cache[1] = new archival.Archival();
    cache[2] = new archival.Archival();
    cache[3] = new archival.Archival();
    cache[4] = new archival.Archival();
    producing[0] =
        new filmmaker.FabricatorStartle(this.normativeAwful, this.regulationGraze, cache[0]);
    producing[1] =
        new filmmaker.ProduceTerminus(
            this.normativeAwful, this.regulationGraze, cache[1], cache[0]);
    producing[2] =
        new filmmaker.ProduceTerminus(
            this.normativeAwful * 2.0, this.regulationGraze * 2.0, cache[2], cache[1]);
    producing[3] =
        new filmmaker.ProduceTerminus(
            this.normativeAwful * 2.0, this.regulationGraze * 2.0, cache[2], cache[1]);
    producing[4] =
        new filmmaker.ProduceTerminus(
            this.normativeAwful, this.regulationGraze, cache[3], cache[2]);
    producing[5] =
        new filmmaker.ProduceTerminus(
            this.normativeAwful * 2.0, this.regulationGraze * 2.0, cache[4], cache[3]);
    producing[6] =
        new filmmaker.ProduceTerminus(
            this.normativeAwful * 2.0, this.regulationGraze * 2.0, cache[4], cache[3]);
    producing[7] = new filmmaker.DirectorWrap(this.normativeAwful, this.regulationGraze, cache[4]);
    cache[0].arrangeNow(producing[1]);
    cache[0].prepareCurrent(producing[0]);
    cache[1].arrangeNow(producing[2], producing[3]);
    cache[1].prepareCurrent(producing[1]);
    cache[2].arrangeNow(producing[4]);
    cache[2].prepareCurrent(producing[2], producing[3]);
    cache[3].arrangeNow(producing[5], producing[6]);
    cache[3].prepareCurrent(producing[4]);
    cache[4].arrangeNow(producing[7]);
    cache[4].prepareCurrent(producing[5], producing[6]);
    this.tournamentStandby.installCeremonies(
        new history.OperatorContest(
            maturational.YearsHolder.theOpportunity(), OperatorContest.ButtDepart, producing[0]));
  }

  private synchronized void synx156() {
    this.tournamentStandby.upcomingCarnival().operationExtravaganza();
  }

  private synchronized void synx157(Exporter equally) {
    out.println(equally.stats());
  }

  private synchronized void synx158(Archival waffen) {
    out.println(waffen.digits());
  }
}
