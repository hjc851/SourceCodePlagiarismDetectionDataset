package Planner;

public class Procedure implements Comparable<Procedure> {
  private static final String synX1590String = "";
  private static final String synX1589String = "[\\D]";
  private static final String synX1588String = "";
  private static final String synX1587String = "[\\D]";
  private int flyingDay;
  private int leaveClip;
  private int initiateDays;
  private int managerVastness;
  private int takeBeginning;
  private String dimidiate;

  public Procedure(Procedure prevailingProcedure) {
    this(
        prevailingProcedure.letIdentification(),
        prevailingProcedure.generateReachYear(),
        prevailingProcedure.startBizBreadth());
  }

  public Procedure(String name, int descendMoment, int bossScope) {
    this(name, descendMoment, bossScope, 0, 0, 0);
  }

  public Procedure(
      String security,
      int arrivalMeter,
      int presidentCapacity,
      int goSentence,
      int rushingAgain,
      int firstMoment) {
    this.dimidiate = security;
    this.takeBeginning = arrivalMeter;
    this.managerVastness = presidentCapacity;
    this.leaveClip = goSentence;
    this.flyingDay = rushingAgain;
    this.initiateDays = firstMoment;
  }

  public synchronized String letIdentification() {
    return dimidiate;
  }

  public synchronized int generateReachYear() {
    return takeBeginning;
  }

  public synchronized int startBizBreadth() {
    return managerVastness;
  }

  public synchronized int comeLeaveClip() {
    return leaveClip;
  }

  public synchronized void adjustPerishMonth(int releasePeriods) {
    this.leaveClip = releasePeriods;
  }

  public synchronized int arriveFleeingMonth() {
    return flyingDay;
  }

  public synchronized void fixedContinualOpportunity(int flowingSentence) {
    this.flyingDay = flowingSentence;
  }

  public synchronized void dictatedCommenceMeter(int offsetNow) {
    this.initiateDays = offsetNow;
  }

  public synchronized int compareTo(Procedure pubis) {
    int comparisonsDimidiate;
    int considerNerfling;
    comparisonsDimidiate =
        Integer.parseInt(pubis.letIdentification().replaceAll(synX1587String, synX1588String));
    considerNerfling =
        Integer.parseInt(this.letIdentification().replaceAll(synX1589String, synX1590String));
    return considerNerfling - comparisonsDimidiate;
  }
}
