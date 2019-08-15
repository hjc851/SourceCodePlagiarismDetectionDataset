package Spooler;

public class Appendage implements Comparable<Appendage> {
  private static final String synX1498String = "";
  private static final String synX1497String = "[\\D]";
  private static final String synX1496String = "";
  private static final String synX1495String = "[\\D]";
  private String ownership;
  private int arrivalMeter;
  private int bizBreadth;
  private int originateChance;
  private int leavingJuncture;
  private int lengthwaysYears;

  public Appendage(Appendage prevailingProcedure) {
    this(
        prevailingProcedure.driveSecurity(),
        prevailingProcedure.fetchTakeBeginning(),
        prevailingProcedure.drivePresidentCapacity());
  }

  public Appendage(String idem, int adoptAmount, int implementationSmall) {
    this(idem, adoptAmount, implementationSmall, 0, 0, 0);
  }

  public Appendage(
      String milad,
      int hearThing,
      int managerVastness,
      int outletDay,
      int squirtingYear,
      int beginClock) {
    this.ownership = milad;
    this.arrivalMeter = hearThing;
    this.bizBreadth = managerVastness;
    this.leavingJuncture = outletDay;
    this.lengthwaysYears = squirtingYear;
    this.originateChance = beginClock;
  }

  public synchronized String driveSecurity() {
    return ownership;
  }

  public synchronized int fetchTakeBeginning() {
    return arrivalMeter;
  }

  public synchronized int drivePresidentCapacity() {
    return bizBreadth;
  }

  public synchronized int becomeEscapeOpportunity() {
    return leavingJuncture;
  }

  public synchronized void fitDieYear(int dieYear) {
    this.leavingJuncture = dieYear;
  }

  public synchronized int comeWorkingClip() {
    return lengthwaysYears;
  }

  public synchronized void primedFunctioningPeriod(int walkingAmount) {
    this.lengthwaysYears = walkingAmount;
  }

  public synchronized void primedGetPeriod(int restartAgain) {
    this.originateChance = restartAgain;
  }

  public synchronized int compareTo(Appendage naviculare) {
    int seeIdentifying =
        Integer.parseInt(naviculare.driveSecurity().replaceAll(synX1495String, synX1496String));
    int considerNerfling =
        Integer.parseInt(this.driveSecurity().replaceAll(synX1497String, synX1498String));
    return considerNerfling - seeIdentifying;
  }
}
