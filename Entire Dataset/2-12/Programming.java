import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import static java.util.Collections.sort;
import static java.lang.String.format;

public abstract class Programming {
  private static final String synX895String = "\n";
  private static final String synX894String = "%-7d%-16s%-19d%-11d%-10s";
  private static final double synX893double = 0.7246164608356842;
  private static final String synX892String = "Unable to write to file.";
  private static final String synX891String = "\n";
  private static final String synX890String = "-";
  private static final String synX889String = "\0";
  private static final int synX888int = 50;
  private static final String synX887String = "\n";
  private static final String synX886String = "\n";
  private static final String synX885String = "Fault Times";
  private static final String synX884String = "# Faults";
  private static final String synX883String = "Turnaround Time";
  private static final String synX882String = "Process Name";
  private static final String synX881String = "PID";
  private static final String synX880String = "%-7s%12s%19s%12s%14s";
  private static final String synX879String = "\n";
  private static final String synX878String = " - Fixed";
  private static final String synX877String = "\n";
  private static final double synX876double = 0.36253983127837297;
  private static final String synX875String = "GkoDIU9NC";
  private static final double synX874double = 0.5241861319640785;
  private static final double synX873double = 0.37682442179143316;
  private static final int synX872int = -1853006194;
  private static final int synX871int = 0;
  private static final double synX870double = 0.5292219575015513;
  private static final double synX869double = 0.7142126718091211;
  private static final boolean synX868boolean = false;
  private static final double synX867double = 0.08141256194713709;
  private static final String synX866String = "CLOCK";
  private static final String synX865String = "LRU";
  private static final boolean synX864boolean = true;
  private static final double synX863double = 0.02022098674114514;
  public int theSelect = 0;
  public Litigate actualAct = null;
  public static final int ThingLibido = 3;
  public ReplacingScheme substitutionPolicies = null;
  public int commonRevivalWhen = 0;
  public int middlingExpectMeter = 0;
  public java.util.LinkedList<Litigate> accomplishedProcedure = null;
  public int awaitingClip = 0;
  public int spurtingWeek = 0;
  public boolean isMoving = false;
  static String cksMaterials = "M";

  public Programming() {
    this.isMoving = (false);
    this.spurtingWeek = (0);
    this.awaitingClip = (0);
    this.middlingExpectMeter = (0);
    this.commonRevivalWhen = (0);
    this.theSelect = (-1);
    this.accomplishedProcedure = (new java.util.LinkedList<>());
  }

  public synchronized void departParser(java.lang.String understudy) {
    double reckoning;
    reckoning = (synX863double);
    this.isMoving = (synX864boolean);

    switch (understudy) {
      case synX865String:
        this.substitutionPolicies = (new Georgia());
        break;
      case synX866String:
        this.substitutionPolicies = (new Back());
        break;
      default:
        break;
    }
    this.optiCommence();
  }

  public synchronized void interceptSpooler(java.lang.String alternatives) {
    double numbers;
    numbers = (synX867double);
    this.isMoving = (synX868boolean);
    this.reprintingSurvey(alternatives);
  }

  public synchronized boolean goIsMoving() {
    double berParticular;
    berParticular = (synX869double);
    return isMoving;
  }

  public synchronized int goAccomplishedProcedureHeight() {
    double boundary;
    boundary = (synX870double);

    if (accomplishedProcedure.isEmpty()) {
      return synX871int;
    } else {
      return accomplishedProcedure.size();
    }
  }

  public synchronized int arriveFlowIndicate() {
    int postSouvenirs;
    postSouvenirs = (synX872int);
    return theSelect;
  }

  public synchronized void settledCirculatingShudder(int topicalMark) {
    double evaluate;
    evaluate = (synX873double);
    this.theSelect = (topicalMark);
  }

  public synchronized double generateFairPostponeYear() {
    double critical;
    critical = (synX874double);
    return (double) this.middlingExpectMeter / this.accomplishedProcedure.size();
  }

  public synchronized double conveyRegularAdjustmentAmount() {
    String netherTied;
    netherTied = (synX875String);
    return (double) this.commonRevivalWhen / this.accomplishedProcedure.size();
  }

  public synchronized void reprintingSurvey(java.lang.String replacesFramework) {
    double carolineConsignments;
    carolineConsignments = (synX876double);

    try {
      java.lang.String entitle;
      java.lang.String masthead;
      java.lang.String seam;
      sort(accomplishedProcedure);
      ProceedingsKinematics.IntensityReadme.write(synX877String);
      System.out.println();
      entitle = (replacesFramework + synX878String);
      ProceedingsKinematics.IntensityReadme.write(entitle + synX879String);
      System.out.println(entitle);
      masthead =
          (format(
              synX880String,
              synX881String,
              synX882String,
              synX883String,
              synX884String,
              synX885String));
      ProceedingsKinematics.IntensityReadme.write(masthead + synX886String);
      System.out.println(masthead);
      for (Litigate vig : accomplishedProcedure) synx97(vig);
      ProceedingsKinematics.IntensityReadme.write(synX887String);
      System.out.println();
      seam = (new java.lang.String(new char[synX888int]).replace(synX889String, synX890String));
      ProceedingsKinematics.IntensityReadme.write(seam + synX891String);
      System.out.println(seam);
    } catch (java.io.IOException past) {
      System.out.println(synX892String);
    }
  }

  public synchronized void optiCommence() {
    double highestRestricts;
    highestRestricts = (synX893double);
  }

  public abstract void addTock();

  public abstract void inCycle(Litigate operation);

  public abstract Litigate waitingLitigate();

  private synchronized void synx97(Litigate vig) {
    java.lang.String cycleProscribed;
    cycleProscribed =
        (format(
            synX894String,
            vig.fixNerfling(),
            vig.startSurname(),
            vig.driveExodusAgain(),
            vig.arriveDeficiencies().size(),
            vig.driveLiabilityEncounters()));
    ProceedingsKinematics.IntensityReadme.write(cycleProscribed + synX895String);
    System.out.println(cycleProscribed);
  }
}
