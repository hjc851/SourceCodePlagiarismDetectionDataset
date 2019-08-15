package Server;

import static java.lang.Integer.parseInt;

public class Mechanisms implements Comparable<Mechanisms> {
  private int lengthwaysYears = 0;
  private int pulloutHour = 0;
  private int firstMoment = 0;
  private int secondLarge = 0;
  private int concludeMinutes = 0;
  private java.lang.String user = null;

  public Mechanisms(Mechanisms streamPhase) {
    this(streamPhase.obtainEst(), streamPhase.haveMeetPeriods(), streamPhase.fixCfoProportions());
  }

  public Mechanisms(String caller, int deliverPeriod, int implementationSmall) {
    this(caller, deliverPeriod, implementationSmall, 0, 0, 0);
  }

  public Mechanisms(
      String pictures,
      int getClip,
      int bigwigSmallness,
      int escapeOpportunity,
      int flowingSentence,
      int resumeHour) {
    this.user = pictures;
    this.concludeMinutes = getClip;
    this.secondLarge = bigwigSmallness;
    this.pulloutHour = escapeOpportunity;
    this.lengthwaysYears = flowingSentence;
    this.firstMoment = resumeHour;
  }

  public synchronized java.lang.String obtainEst() {
    return user;
  }

  public synchronized int haveMeetPeriods() {
    return concludeMinutes;
  }

  public synchronized int fixCfoProportions() {
    return secondLarge;
  }

  public synchronized int findGoSentence() {
    return pulloutHour;
  }

  public synchronized void arrangeEgressYears(int exodusAgain) {
    this.pulloutHour = exodusAgain;
  }

  public synchronized int makeFlyingDay() {
    return lengthwaysYears;
  }

  public synchronized void markStreamingHours(int fleeingMonth) {
    this.lengthwaysYears = fleeingMonth;
  }

  public synchronized void dictatedCommenceMeter(int getPeriod) {
    this.firstMoment = getPeriod;
  }

  public synchronized int compareTo(Mechanisms coccyx) {
    int collatePicture;
    int seeIdentifier;
    collatePicture = parseInt(coccyx.obtainEst().replaceAll("[\\D]", ""));
    seeIdentifier = parseInt(this.obtainEst().replaceAll("[\\D]", ""));
    return seeIdentifier - collatePicture;
  }
}
