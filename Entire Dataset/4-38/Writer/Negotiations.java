package Writer;

import static java.lang.Integer.parseInt;

public class Negotiations implements Comparable<Negotiations> {
  private static final String synX1682String = "";
  private static final String synX1681String = "[\\D]";
  private static final String synX1680String = "";
  private static final String synX1679String = "[\\D]";
  private int functioningPeriod = 0;
  private int pulloutHour = 0;
  private int initiateDays = 0;
  private int officerImmensity = 0;
  private int ariseAgain = 0;
  private java.lang.String identifier = null;

  public Negotiations(Negotiations liveOutgrowth) {
    this(
        liveOutgrowth.produceMap(),
        liveOutgrowth.goComeClock(),
        liveOutgrowth.developDirectorStature());
  }

  public Negotiations(String ownership, int happenChance, int timeoutLength) {
    this(ownership, happenChance, timeoutLength, 0, 0, 0);
  }

  public Negotiations(
      String identification,
      int takeBeginning,
      int bizBreadth,
      int perishMonth,
      int streamingHours,
      int earlyThing) {
    this.identifier = identification;
    this.ariseAgain = takeBeginning;
    this.officerImmensity = bizBreadth;
    this.pulloutHour = perishMonth;
    this.functioningPeriod = streamingHours;
    this.initiateDays = earlyThing;
  }

  public synchronized java.lang.String produceMap() {
    return identifier;
  }

  public synchronized int goComeClock() {
    return ariseAgain;
  }

  public synchronized int developDirectorStature() {
    return officerImmensity;
  }

  public synchronized int findGoSentence() {
    return pulloutHour;
  }

  public synchronized void determinedGoingDays(int lossMeter) {
    this.pulloutHour = lossMeter;
  }

  public synchronized int startOperativeMinutes() {
    return functioningPeriod;
  }

  public synchronized void determinedScamperingDays(int movingClock) {
    this.functioningPeriod = movingClock;
  }

  public synchronized void layFirstMoment(int getPeriod) {
    this.initiateDays = getPeriod;
  }

  public synchronized int compareTo(Negotiations trigonum) {
    int relativeName;
    int eachHandle;
    relativeName = parseInt(trigonum.produceMap().replaceAll(synX1679String, synX1680String));
    eachHandle = parseInt(this.produceMap().replaceAll(synX1681String, synX1682String));
    return eachHandle - relativeName;
  }
}
