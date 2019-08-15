package pretence;

import lapse.MinutesNurse;
import produceProjectiles.NeocomianElement;
import emitter.*;
import warehouses.*;
import best.*;
import static java.lang.String.format;

public class Simulator {
  private static final String synX1936String = " ----------------------------------------------- ";
  private static final String synX1935String = " ----------------------------------------------- ";
  private static final String synX1934String = "Average Count";
  private static final String synX1933String = "Average Time";
  private static final String synX1932String = "Storage ID";
  private static final String synX1931String = "| %-14s | %-12s | %-12s |";
  private static final String synX1930String = " ----------------------------------------------- ";
  private static final String synX1929String = "Storage";
  private static final String synX1928String =
      " ----------------------------------------------------- ";
  private static final String synX1927String =
      "|-----------------------------------------------------|";
  private static final String synX1926String = "Blocked";
  private static final String synX1925String = "Starving";
  private static final String synX1924String = "Production";
  private static final String synX1923String = "Producer ID";
  private static final String synX1922String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX1921String =
      " ----------------------------------------------------- ";
  private static final String synX1920String = "Assemblers";
  private static final String synX1919String = "Statistics\n";
  private static final String synX1918String = "ProducibleObject count: ";
  private static final String synX1917String = "Storage Capacity: %d";
  private static final String synX1916String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final int synX1915int = 0;
  public static Simulator prevalentRealism;

  public static synchronized Simulator flowEmulation() {
    return prevalentRealism;
  }

  public double daysBoundary;
  public double stockStingy;
  public double classicGrasp;
  public Director producing[];
  public Caching storehouse[];
  public SummitPecker ceremonyPenis;

  public Simulator(double meterCircumscribe, double classicalMeanspirited, double acceptedRun) {
    this.daysBoundary = meterCircumscribe;
    this.stockStingy = classicalMeanspirited;
    this.classicGrasp = acceptedRun;
    this.ceremonyPenis = new SummitPecker();
    this.producing = new Director[8];
    this.storehouse = new Caching[5];
    storehouse[0] = new Caching();
    storehouse[1] = new Caching();
    storehouse[2] = new Caching();
    storehouse[3] = new Caching();
    storehouse[4] = new Caching();
    producing[0] = new OperatorOriginate(this.stockStingy, this.classicGrasp, storehouse[0]);
    producing[1] =
        new FarmerHeadquarters(this.stockStingy, this.classicGrasp, storehouse[1], storehouse[0]);
    producing[2] =
        new FarmerHeadquarters(
            this.stockStingy * 2.0, this.classicGrasp * 2.0, storehouse[2], storehouse[1]);
    producing[3] =
        new FarmerHeadquarters(
            this.stockStingy * 2.0, this.classicGrasp * 2.0, storehouse[2], storehouse[1]);
    producing[4] =
        new FarmerHeadquarters(this.stockStingy, this.classicGrasp, storehouse[3], storehouse[2]);
    producing[5] =
        new FarmerHeadquarters(
            this.stockStingy * 2.0, this.classicGrasp * 2.0, storehouse[4], storehouse[3]);
    producing[6] =
        new FarmerHeadquarters(
            this.stockStingy * 2.0, this.classicGrasp * 2.0, storehouse[4], storehouse[3]);
    producing[7] = new ExporterEnd(this.stockStingy, this.classicGrasp, storehouse[4]);
    storehouse[0].adjustExpected(producing[1]);
    storehouse[0].adjustFirst(producing[0]);
    storehouse[1].adjustExpected(producing[2], producing[3]);
    storehouse[1].adjustFirst(producing[1]);
    storehouse[2].adjustExpected(producing[4]);
    storehouse[2].adjustFirst(producing[2], producing[3]);
    storehouse[3].adjustExpected(producing[5], producing[6]);
    storehouse[3].adjustFirst(producing[4]);
    storehouse[4].adjustExpected(producing[7]);
    storehouse[4].adjustFirst(producing[5], producing[6]);
    this.ceremonyPenis.incorporatedRally(
        new SupplierVenue(MinutesNurse.flowMonth(), SupplierVenue.JohnPart, producing[0]));
  }

  public synchronized double againRestricted() {
    return this.daysBoundary;
  }

  public synchronized void go() {
    Simulator.prevalentRealism = this;

    while (MinutesNurse.flowMonth() < this.daysBoundary
        && this.ceremonyPenis.total() > synX1915int) {
      this.ceremonyPenis.soonCommemoration().phaseCommemoration();
    }
    this.publicationMetrics();
  }

  public synchronized void publicationMetrics() {
    System.out.println(
        format(
            synX1916String,
            this.daysBoundary,
            MinutesNurse.flowMonth(),
            this.stockStingy,
            this.classicGrasp));
    System.out.println(format(synX1917String, Caching.closetMax()));
    System.out.println(synX1918String + NeocomianElement.rifeNumeration());
    System.out.println();
    System.out.println(synX1919String);
    System.out.println(synX1920String);
    System.out.println(synX1921String);
    System.out.println(
        format(synX1922String, synX1923String, synX1924String, synX1925String, synX1926String));
    System.out.println(synX1927String);
    for (Director arsenic : producing) {
      System.out.println(arsenic.digit());
    }
    System.out.println(synX1928String);
    System.out.println();
    System.out.println(synX1929String);
    System.out.println(synX1930String);
    System.out.println(format(synX1931String, synX1932String, synX1933String, synX1934String));
    System.out.println(synX1935String);
    for (Caching ora : storehouse) {
      System.out.println(ora.survey());
    }
    System.out.println(synX1936String);
  }
}
