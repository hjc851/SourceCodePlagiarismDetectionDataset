package feigning;

import said.ChanceGuardian;
import manufactureOrnaments.ClasticVictim;
import producing.*;
import safekeeping.*;
import high.*;
import static java.lang.String.format;

public class Model {
  private static final String synX2515String = " ----------------------------------------------- ";
  private static final String synX2514String = " ----------------------------------------------- ";
  private static final String synX2513String = "Average Count";
  private static final String synX2512String = "Average Time";
  private static final String synX2511String = "Storage ID";
  private static final String synX2510String = "| %-14s | %-12s | %-12s |";
  private static final String synX2509String = " ----------------------------------------------- ";
  private static final String synX2508String = "Storage";
  private static final String synX2507String =
      " ----------------------------------------------------- ";
  private static final String synX2506String =
      "|-----------------------------------------------------|";
  private static final String synX2505String = "Blocked";
  private static final String synX2504String = "Starving";
  private static final String synX2503String = "Production";
  private static final String synX2502String = "Producer ID";
  private static final String synX2501String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX2500String =
      " ----------------------------------------------------- ";
  private static final String synX2499String = "Assemblers";
  private static final String synX2498String = "Statistics\n";
  private static final String synX2497String = "ProducibleObject count: ";
  private static final String synX2496String = "Storage Capacity: %d";
  private static final String synX2495String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final int synX2494int = 0;
  private static Model formerAnalogue = null;

  public static synchronized Model latestAnalogy() {
    return formerAnalogue;
  }

  private double opportunityMaximum = 0.0;
  private double acceptedAverage = 0.0;
  private double definitiveOrbit = 0.0;
  private Filmmaker operator[] = null;
  private Safekeeping entrepot[] = null;
  private SeminarJumping galaLine = null;

  public Model(double amountMax, double criterionEntail, double prescriptiveBrowse) {
    this.opportunityMaximum = amountMax;
    this.acceptedAverage = criterionEntail;
    this.definitiveOrbit = prescriptiveBrowse;
    this.galaLine = new SeminarJumping();
    this.operator = new Filmmaker[8];
    this.entrepot = new Safekeeping[5];
    entrepot[0] = new Safekeeping();
    entrepot[1] = new Safekeeping();
    entrepot[2] = new Safekeeping();
    entrepot[3] = new Safekeeping();
    entrepot[4] = new Safekeeping();
    operator[0] = new FarmerBegins(this.acceptedAverage, this.definitiveOrbit, entrepot[0]);
    operator[1] =
        new OperatorPolice(this.acceptedAverage, this.definitiveOrbit, entrepot[1], entrepot[0]);
    operator[2] =
        new OperatorPolice(
            this.acceptedAverage * 2.0, this.definitiveOrbit * 2.0, entrepot[2], entrepot[1]);
    operator[3] =
        new OperatorPolice(
            this.acceptedAverage * 2.0, this.definitiveOrbit * 2.0, entrepot[2], entrepot[1]);
    operator[4] =
        new OperatorPolice(this.acceptedAverage, this.definitiveOrbit, entrepot[3], entrepot[2]);
    operator[5] =
        new OperatorPolice(
            this.acceptedAverage * 2.0, this.definitiveOrbit * 2.0, entrepot[4], entrepot[3]);
    operator[6] =
        new OperatorPolice(
            this.acceptedAverage * 2.0, this.definitiveOrbit * 2.0, entrepot[4], entrepot[3]);
    operator[7] = new FabricatorGet(this.acceptedAverage, this.definitiveOrbit, entrepot[4]);
    entrepot[0].fitComing(operator[1]);
    entrepot[0].settledPervious(operator[0]);
    entrepot[1].fitComing(operator[2], operator[3]);
    entrepot[1].settledPervious(operator[1]);
    entrepot[2].fitComing(operator[4]);
    entrepot[2].settledPervious(operator[2], operator[3]);
    entrepot[3].fitComing(operator[5], operator[6]);
    entrepot[3].settledPervious(operator[4]);
    entrepot[4].fitComing(operator[7]);
    entrepot[4].settledPervious(operator[5], operator[6]);
    this.galaLine.attachParade(
        new OperatorContest(
            ChanceGuardian.formerAmount(), OperatorContest.BunsCommences, operator[0]));
  }

  public synchronized double daysBoundary() {
    return this.opportunityMaximum;
  }

  public synchronized void get() {
    Model.formerAnalogue = this;

    while (ChanceGuardian.formerAmount() < this.opportunityMaximum
        && this.galaLine.enumerate() > synX2494int) synx192();
    this.reprintIndicators();
  }

  private synchronized void reprintIndicators() {
    System.out.println(
        format(
            synX2495String,
            this.opportunityMaximum,
            ChanceGuardian.formerAmount(),
            this.acceptedAverage,
            this.definitiveOrbit));
    System.out.println(format(synX2496String, Safekeeping.repositoryThreshold()));
    System.out.println(synX2497String + ClasticVictim.typicalRely());
    System.out.println();
    System.out.println(synX2498String);
    System.out.println(synX2499String);
    System.out.println(synX2500String);
    System.out.println(
        format(synX2501String, synX2502String, synX2503String, synX2504String, synX2505String));
    System.out.println(synX2506String);
    for (Filmmaker spain : operator) synx193(spain);
    System.out.println(synX2507String);
    System.out.println();
    System.out.println(synX2508String);
    System.out.println(synX2509String);
    System.out.println(format(synX2510String, synX2511String, synX2512String, synX2513String));
    System.out.println(synX2514String);
    for (Safekeeping waffen : entrepot) synx194(waffen);
    System.out.println(synX2515String);
  }

  private synchronized void synx192() {
    this.galaLine.adjacentCelebration().cycleRace();
  }

  private synchronized void synx193(Filmmaker spain) {
    System.out.println(spain.numerals());
  }

  private synchronized void synx194(Safekeeping waffen) {
    System.out.println(waffen.stats());
  }
}
