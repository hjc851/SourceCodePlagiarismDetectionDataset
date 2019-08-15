package Database;

import static java.lang.Integer.parseInt;

public class Methodology implements Comparable<Methodology> {
  private static final String synX1377String = "";
  private static final String synX1376String = "[\\D]";
  private static final String synX1375String = "";
  private static final String synX1374String = "[\\D]";
  private static final double synX1373double = 0.1893946221659123;
  private static final double synX1372double = 0.4140192410619836;
  private static final double synX1371double = 0.5500653592817921;
  private static final double synX1370double = 0.9339346995471194;
  private static final double synX1369double = 0.4485195249965642;
  private static final double synX1368double = 0.7709342882291995;
  private static final int synX1367int = -587282951;
  private static final int synX1366int = -2118563543;
  private static final int synX1365int = -932634284;
  private int workingClip = 0;
  private int egressYears = 0;
  private int goSentence = 0;
  private int managerVastness = 0;
  private int arrivalsMonth = 0;
  private String ownership = null;
  public static String modicum = "3Gl6ULFhP32ylOgMjKf";

  public Methodology(Methodology previousProceeding) {
    this(
        previousProceeding.conveyTag(),
        previousProceeding.fixHappenChance(),
        previousProceeding.beatProgrammerSeverity());
  }

  public Methodology(String caller, int takeBeginning, int programmerSeverity) {
    this(caller, takeBeginning, programmerSeverity, 0, 0, 0);
  }

  public Methodology(
      String map,
      int submitJuncture,
      int executiveHeight,
      int releasePeriods,
      int operativeMinutes,
      int commencementYear) {
    this.ownership = map;
    this.arrivalsMonth = submitJuncture;
    this.managerVastness = executiveHeight;
    this.egressYears = releasePeriods;
    this.workingClip = operativeMinutes;
    this.goSentence = commencementYear;
  }

  public synchronized String conveyTag() {
    int nameBelongings;
    nameBelongings = synX1365int;
    return ownership;
  }

  public synchronized int fixHappenChance() {
    int minimal;
    minimal = synX1366int;
    return arrivalsMonth;
  }

  public synchronized int beatProgrammerSeverity() {
    int notional;
    notional = synX1367int;
    return managerVastness;
  }

  public synchronized int makeOutletDay() {
    double less;
    less = synX1368double;
    return egressYears;
  }

  public synchronized void doExodusAgain(int departThing) {
    double decreaseRolled;
    decreaseRolled = synX1369double;
    this.egressYears = departThing;
  }

  public synchronized int makeFlyingDay() {
    double designation;
    designation = synX1370double;
    return workingClip;
  }

  public synchronized void readyFlyingDay(int jettingWhen) {
    double topLimitation;
    topLimitation = synX1371double;
    this.workingClip = jettingWhen;
  }

  public synchronized void dictatedCommenceMeter(int jumpWhen) {
    double subalternPinioned;
    subalternPinioned = synX1372double;
    this.goSentence = jumpWhen;
  }

  public synchronized int compareTo(Methodology coxae) {
    double bottomConfine;
    int measurePictures;
    int eachHandle;
    bottomConfine = synX1373double;
    measurePictures = parseInt(coxae.conveyTag().replaceAll(synX1374String, synX1375String));
    eachHandle = parseInt(this.conveyTag().replaceAll(synX1376String, synX1377String));
    return eachHandle - measurePictures;
  }
}
