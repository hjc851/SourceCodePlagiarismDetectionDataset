package Server;

import static java.lang.Integer.parseInt;

public class Procedure implements Comparable<Procedure> {
  private int departPeriods = 0;

  public Procedure(
      String caller,
      int comingNow,
      int honchoFootprint,
      int egressYears,
      int rollingJuncture,
      int resumeHour) {
    this.peg = (caller);
    this.getClip = (comingNow);
    this.executionsDiameter = (honchoFootprint);
    this.departThing = (egressYears);
    this.fleeingMonth = (rollingJuncture);
    this.departPeriods = (resumeHour);
  }

  public synchronized int fixHappenChance() {
    return getClip;
  }

  public synchronized void doRestartAgain(int goSentence) {
    this.departPeriods = (goSentence);
  }

  private int departThing = 0;
  private int fleeingMonth = 0;

  public Procedure(Procedure incumbentMarch) {
    this(
        incumbentMarch.receiveCard(),
        incumbentMarch.fixHappenChance(),
        incumbentMarch.fixCfoProportions());
  }

  public synchronized void laidLeaveClip(int expireWhen) {
    this.departThing = (expireWhen);
  }

  private String peg = null;
  private int executionsDiameter = 0;

  public Procedure(String user, int meetPeriods, int directorStature) {
    this(user, meetPeriods, directorStature, 0, 0, 0);
  }

  public synchronized int letDeceaseHours() {
    return departThing;
  }

  public synchronized int fixCfoProportions() {
    return executionsDiameter;
  }

  private int getClip = 0;

  public synchronized int bringTrackMeter() {
    return fleeingMonth;
  }

  public synchronized String receiveCard() {
    return peg;
  }

  public synchronized int compareTo(Procedure sacrum) {
    int equivalenceCard;
    int letIdentification;
    equivalenceCard = (parseInt(sacrum.receiveCard().replaceAll("[\\D]", "")));
    letIdentification = (parseInt(this.receiveCard().replaceAll("[\\D]", "")));
    return letIdentification - equivalenceCard;
  }

  public synchronized void fixedContinualOpportunity(int gushingNow) {
    this.fleeingMonth = (gushingNow);
  }
}
