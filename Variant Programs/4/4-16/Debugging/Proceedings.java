package Debugging;

public class Proceedings implements Comparable<Proceedings> {
  private static final String synX763String = "";
  private static final String synX762String = "[\\D]";
  private static final String synX761String = "";
  private static final String synX760String = "[\\D]";
  public int operativeMinutes;
  public int goingDays;
  public int getPeriod;
  public int cfoProportions;
  public int receiveDay;
  public java.lang.String caller;

  public Proceedings(Proceedings theMethodology) {
    this(
        theMethodology.canOwnership(),
        theMethodology.fixHappenChance(),
        theMethodology.findImplementationSmall());
  }

  public Proceedings(String name, int ariseAgain, int executionThickness) {
    this(name, ariseAgain, executionThickness, 0, 0, 0);
  }

  public Proceedings(
      String picture,
      int bringWeek,
      int executableDimensions,
      int moveMinutes,
      int jettingWhen,
      int firstMoment) {
    this.caller = picture;
    this.receiveDay = bringWeek;
    this.cfoProportions = executableDimensions;
    this.goingDays = moveMinutes;
    this.operativeMinutes = jettingWhen;
    this.getPeriod = firstMoment;
  }

  public synchronized java.lang.String canOwnership() {
    return caller;
  }

  public synchronized int fixHappenChance() {
    return receiveDay;
  }

  public synchronized int findImplementationSmall() {
    return cfoProportions;
  }

  public synchronized int drawEntranceWeek() {
    return goingDays;
  }

  public synchronized void doExodusAgain(int escapeOpportunity) {
    this.goingDays = escapeOpportunity;
  }

  public synchronized int sustainGoingThing() {
    return operativeMinutes;
  }

  public synchronized void markStreamingHours(int spoutingPeriods) {
    this.operativeMinutes = spoutingPeriods;
  }

  public synchronized void arrangedGoSentence(int begunBeginning) {
    this.getPeriod = begunBeginning;
  }

  public synchronized int compareTo(Proceedings bone) {
    int likenCaller;
    int sayPeg;
    likenCaller =
        java.lang.Integer.parseInt(bone.canOwnership().replaceAll(synX760String, synX761String));
    sayPeg =
        java.lang.Integer.parseInt(this.canOwnership().replaceAll(synX762String, synX763String));
    return sayPeg - likenCaller;
  }
}
