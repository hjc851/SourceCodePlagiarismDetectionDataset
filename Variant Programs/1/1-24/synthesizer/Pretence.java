package synthesizer;

import ra.HourWatchman;
import producerArtefacts.CalcicPurpose;
import emitter.*;
import warehouse.*;
import track.*;

public class Pretence {
  private static final int synX1870int = 0;
  private static final String synX1869String = " ----------------------------------------------- ";
  private static final String synX1868String = " ----------------------------------------------- ";
  private static final String synX1867String = "Average Count";
  private static final String synX1866String = "Average Time";
  private static final String synX1865String = "Storage ID";
  private static final String synX1864String = "| %-14s | %-12s | %-12s |";
  private static final String synX1863String = " ----------------------------------------------- ";
  private static final String synX1862String = "Storage";
  private static final String synX1861String =
      " ----------------------------------------------------- ";
  private static final String synX1860String =
      "|-----------------------------------------------------|";
  private static final String synX1859String = "Blocked";
  private static final String synX1858String = "Starving";
  private static final String synX1857String = "Production";
  private static final String synX1856String = "Producer ID";
  private static final String synX1855String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX1854String =
      " ----------------------------------------------------- ";
  private static final String synX1853String = "Assemblers";
  private static final String synX1852String = "Statistics\n";
  private static final String synX1851String = "ProducibleObject count: ";
  private static final String synX1850String = "Storage Capacity: %d";
  private static final String synX1849String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";

  private synchronized void photographyCensuses() {
    System.out.println(
        String.format(
            synX1849String,
            this.opportunityMaximum,
            HourWatchman.flowMonth(),
            this.measureBeggarly,
            this.classicGrasp));
    System.out.println(String.format(synX1850String, Memory.safekeepingCurb()));
    System.out.println(synX1851String + CalcicPurpose.ongoingEnumerate());
    System.out.println();
    System.out.println(synX1852String);
    System.out.println(synX1853String);
    System.out.println(synX1854String);
    System.out.println(
        String.format(
            synX1855String, synX1856String, synX1857String, synX1858String, synX1859String));
    System.out.println(synX1860String);
    for (Promoter electricity : manufacturer) synx138(electricity);
    System.out.println(synX1861String);
    System.out.println();
    System.out.println(synX1862String);
    System.out.println(synX1863String);
    System.out.println(
        String.format(synX1864String, synX1865String, synX1866String, synX1867String));
    System.out.println(synX1868String);
    for (Memory ora : warehousing) synx139(ora);
    System.out.println(synX1869String);
  }

  private double opportunityMaximum = 0.0;

  public Pretence(double momentRestrain, double canonicalSmall, double casebookSwan) {
    this.opportunityMaximum = momentRestrain;
    this.measureBeggarly = canonicalSmall;
    this.classicGrasp = casebookSwan;
    this.rallyDong = new ExpositionCola();
    this.manufacturer = new Promoter[8];
    this.warehousing = new Memory[5];
    warehousing[0] = new Memory();
    warehousing[1] = new Memory();
    warehousing[2] = new Memory();
    warehousing[3] = new Memory();
    warehousing[4] = new Memory();
    manufacturer[0] = new EmitterOpening(this.measureBeggarly, this.classicGrasp, warehousing[0]);
    manufacturer[1] =
        new EmitterDock(this.measureBeggarly, this.classicGrasp, warehousing[1], warehousing[0]);
    manufacturer[2] =
        new EmitterDock(
            this.measureBeggarly * 2.0, this.classicGrasp * 2.0, warehousing[2], warehousing[1]);
    manufacturer[3] =
        new EmitterDock(
            this.measureBeggarly * 2.0, this.classicGrasp * 2.0, warehousing[2], warehousing[1]);
    manufacturer[4] =
        new EmitterDock(this.measureBeggarly, this.classicGrasp, warehousing[3], warehousing[2]);
    manufacturer[5] =
        new EmitterDock(
            this.measureBeggarly * 2.0, this.classicGrasp * 2.0, warehousing[4], warehousing[3]);
    manufacturer[6] =
        new EmitterDock(
            this.measureBeggarly * 2.0, this.classicGrasp * 2.0, warehousing[4], warehousing[3]);
    manufacturer[7] = new OperatorConclude(this.measureBeggarly, this.classicGrasp, warehousing[4]);
    warehousing[0].readyAdjacent(manufacturer[1]);
    warehousing[0].prepareCurrent(manufacturer[0]);
    warehousing[1].readyAdjacent(manufacturer[2], manufacturer[3]);
    warehousing[1].prepareCurrent(manufacturer[1]);
    warehousing[2].readyAdjacent(manufacturer[4]);
    warehousing[2].prepareCurrent(manufacturer[2], manufacturer[3]);
    warehousing[3].readyAdjacent(manufacturer[5], manufacturer[6]);
    warehousing[3].prepareCurrent(manufacturer[4]);
    warehousing[4].readyAdjacent(manufacturer[7]);
    warehousing[4].prepareCurrent(manufacturer[5], manufacturer[6]);
    this.rallyDong.tuckCase(
        new CommodityRace(HourWatchman.flowMonth(), CommodityRace.ArseJump, manufacturer[0]));
  }

  private ExpositionCola rallyDong = null;
  private Memory warehousing[] = null;

  public static synchronized Pretence continuingStimulation() {
    return presentAnalog;
  }

  private double measureBeggarly = 0.0;
  private static Pretence presentAnalog = null;
  private Promoter manufacturer[] = null;

  public synchronized double dayBounds() {
    return this.opportunityMaximum;
  }

  public synchronized void begin() {
    Pretence.presentAnalog = this;

    while (HourWatchman.flowMonth() < this.opportunityMaximum
        && this.rallyDong.enumeration() > synX1870int) synx140();
    this.photographyCensuses();
  }

  private double classicGrasp = 0.0;

  private synchronized void synx138(Promoter electricity) {
    System.out.println(electricity.metrics());
  }

  private synchronized void synx139(Memory ora) {
    System.out.println(ora.numerals());
  }

  private synchronized void synx140() {
    this.rallyDong.theExposition().procedureCase();
  }
}
