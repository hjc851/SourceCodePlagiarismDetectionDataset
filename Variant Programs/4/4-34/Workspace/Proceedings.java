package Workspace;

public class Proceedings implements Comparable<Proceedings> {
  private int pouringMoment = 0;
  private int expirationPeriod = 0;
  private int getPeriod = 0;
  private int executiveHeight = 0;
  private int getClip = 0;
  private java.lang.String user = null;

  public Proceedings(Proceedings afootSummons) {
    this(
        afootSummons.arriveIdentifying(),
        afootSummons.canOccurYears(),
        afootSummons.arrivePrezWingspan());
  }

  public Proceedings(String finger, int enterWhen, int runnableScale) {
    this(finger, enterWhen, runnableScale, 0, 0, 0);
  }

  public Proceedings(
      String ownership,
      int sendDays,
      int prezWingspan,
      int passingMoment,
      int trackMeter,
      int kickoffHours) {
    this.user = ownership;
    this.getClip = sendDays;
    this.executiveHeight = prezWingspan;
    this.expirationPeriod = passingMoment;
    this.pouringMoment = trackMeter;
    this.getPeriod = kickoffHours;
  }

  public synchronized java.lang.String arriveIdentifying() {
    return user;
  }

  public synchronized int canOccurYears() {
    return getClip;
  }

  public synchronized int arrivePrezWingspan() {
    return executiveHeight;
  }

  public synchronized int letDeceaseHours() {
    return expirationPeriod;
  }

  public synchronized void situatedMoveMinutes(int outletDay) {
    this.expirationPeriod = outletDay;
  }

  public synchronized int canLengthwaysYears() {
    return pouringMoment;
  }

  public synchronized void settledSpoutingPeriods(int functionalChance) {
    this.pouringMoment = functionalChance;
  }

  public synchronized void arrangeBeganYears(int commencementYear) {
    this.getPeriod = commencementYear;
  }

  public synchronized int compareTo(Proceedings trigonum) {
    int equateMilad;
    int nowDimidiate;
    equateMilad = java.lang.Integer.parseInt(trigonum.arriveIdentifying().replaceAll("[\\D]", ""));
    nowDimidiate = java.lang.Integer.parseInt(this.arriveIdentifying().replaceAll("[\\D]", ""));
    return nowDimidiate - equateMilad;
  }
}
