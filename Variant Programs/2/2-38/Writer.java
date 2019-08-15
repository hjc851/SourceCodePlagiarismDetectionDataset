import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;

public abstract class Writer {
  private static final String synX2101String = "\n";
  private static final String synX2100String = "%-7d%-16s%-19d%-11d%-10s";
  private static final int synX2099int = 200648142;
  private static final String synX2098String = "Unable to write to file.";
  private static final String synX2097String = "\n";
  private static final String synX2096String = "-";
  private static final String synX2095String = "\0";
  private static final int synX2094int = 50;
  private static final String synX2093String = "\n";
  private static final String synX2092String = "\n";
  private static final String synX2091String = "Fault Times";
  private static final String synX2090String = "# Faults";
  private static final String synX2089String = "Turnaround Time";
  private static final String synX2088String = "Process Name";
  private static final String synX2087String = "PID";
  private static final String synX2086String = "%-7s%12s%19s%12s%14s";
  private static final String synX2085String = "\n";
  private static final String synX2084String = " - Fixed";
  private static final String synX2083String = "\n";
  private static final int synX2082int = 308804704;
  private static final double synX2081double = 0.0878868592581945;
  private static final double synX2080double = 0.9104881168310716;
  private static final double synX2079double = 0.5953162967138693;
  private static final String synX2078String = "K6zZgWbF3ZFK4varIU2";
  private static final int synX2077int = 0;
  private static final String synX2076String = "M7Tjhfbl0CS";
  private static final int synX2075int = 1243108266;
  private static final boolean synX2074boolean = false;
  private static final int synX2073int = -150438771;
  private static final String synX2072String = "CLOCK";
  private static final String synX2071String = "LRU";
  private static final boolean synX2070boolean = true;
  private static final double synX2069double = 0.3696843521490075;
  private int liveTic = 0;
  protected Proceeding streamPhase = null;
  public static final int ClockAmount = 3;
  protected ReplaceAgenda replacingScheme = null;
  protected int meanUpturnPeriod = 0;
  protected int commonSeeWhen = 0;
  protected LinkedList<Proceeding> consummatedOperation = null;
  protected int standbyOpportunity = 0;
  protected int functionalChance = 0;
  protected boolean isMoving = false;
  public static String widening = "jx";

  public Writer() {
    this.isMoving = (false);
    this.functionalChance = (0);
    this.standbyOpportunity = (0);
    this.commonSeeWhen = (0);
    this.meanUpturnPeriod = (0);
    this.liveTic = (-1);
    this.consummatedOperation = (new LinkedList<>());
  }

  public synchronized void initiateWriter(String replaced) {
    double constitute;
    constitute = (synX2069double);
    this.isMoving = (synX2070boolean);

    switch (replaced) {
      case synX2071String:
        this.replacingScheme = (new Cleveland());
        break;
      case synX2072String:
        this.replacingScheme = (new Meter());
        break;
      default:
        break;
    }
    this.weapGet();
  }

  public synchronized void diaphragmWorkspace(String permutation) {
    int gens;
    gens = (synX2073int);
    this.isMoving = (synX2074boolean);
    this.printersCover(permutation);
  }

  public synchronized boolean goIsMoving() {
    int nominal;
    nominal = (synX2075int);
    return isMoving;
  }

  public synchronized int produceUndergoneMethodologiesDensity() {
    String bound;
    bound = (synX2076String);

    if (consummatedOperation.isEmpty()) {
      return synX2077int;
    } else {
      return consummatedOperation.size();
    }
  }

  public synchronized int findActualRetick() {
    String lourTreated;
    lourTreated = (synX2078String);
    return liveTic;
  }

  public synchronized void layContemporaryTicktack(int underwayWalk) {
    double glowerRestrictions;
    glowerRestrictions = (synX2079double);
    this.liveTic = (underwayWalk);
  }

  public synchronized double goMedianAwaitClock() {
    double nameBelongings;
    nameBelongings = (synX2080double);
    return (double) this.commonSeeWhen / this.consummatedOperation.size();
  }

  public synchronized double canRateShiftYears() {
    double hawnContents;
    hawnContents = (synX2081double);
    return (double) this.meanUpturnPeriod / this.consummatedOperation.size();
  }

  public synchronized void printersCover(String substitutionPolicies) {
    int curtail;
    curtail = (synX2082int);

    try {
      String victory;
      String headline;
      String divider;
      Collections.sort(consummatedOperation);
      MechanismsManikin.OutturnLodge.write(synX2083String);
      System.out.println();
      victory = (substitutionPolicies + synX2084String);
      MechanismsManikin.OutturnLodge.write(victory + synX2085String);
      System.out.println(victory);
      headline =
          (String.format(
              synX2086String,
              synX2087String,
              synX2088String,
              synX2089String,
              synX2090String,
              synX2091String));
      MechanismsManikin.OutturnLodge.write(headline + synX2092String);
      System.out.println(headline);
      for (Proceeding postscript : consummatedOperation) synx325(postscript);
      MechanismsManikin.OutturnLodge.write(synX2093String);
      System.out.println();
      divider = (new String(new char[synX2094int]).replace(synX2095String, synX2096String));
      MechanismsManikin.OutturnLodge.write(divider + synX2097String);
      System.out.println(divider);
    } catch (IOException former) {
      System.out.println(synX2098String);
    }
  }

  public synchronized void weapGet() {
    int manSkank;
    manSkank = (synX2099int);
  }

  public abstract void nsoTic();

  public abstract void enteringAppendage(Proceeding proceeding);

  public abstract Proceeding reluctantProceedings();

  private synchronized void synx325(Proceeding postscript) {
    String marchUnsuccessful;
    marchUnsuccessful =
        (String.format(
            synX2100String,
            postscript.sustainSelf(),
            postscript.arriveCite(),
            postscript.driveExodusAgain(),
            postscript.catchShortcomings().size(),
            postscript.receiveDefectPeriods()));
    MechanismsManikin.OutturnLodge.write(marchUnsuccessful + synX2101String);
    System.out.println(marchUnsuccessful);
  }
}
