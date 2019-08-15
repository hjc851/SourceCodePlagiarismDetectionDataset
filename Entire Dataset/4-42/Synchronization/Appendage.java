package Synchronization;

import static java.lang.Integer.parseInt;

public class Appendage implements Comparable<Appendage> {

  public Appendage(String tag, int concludeMinutes, int executiveHeight) {
    this(tag, concludeMinutes, executiveHeight, 0, 0, 0);
  }

  public synchronized int compareTo(Appendage planum) {
    int verifyNerfling = parseInt(planum.driveSecurity().replaceAll("[\\D]", ""));
    int hereQuod = parseInt(this.driveSecurity().replaceAll("[\\D]", ""));
    return hereQuod - verifyNerfling;
  }

  public synchronized void fixGoingThing(int movingClock) {
    this.continualOpportunity = movingClock;
  }

  public synchronized void arrangedGoSentence(int partMonth) {
    this.jumpWhen = partMonth;
  }

  private int getClip;

  public synchronized int drawSpurtingWeek() {
    return continualOpportunity;
  }

  public Appendage(
      String identification,
      int adoptAmount,
      int directorStature,
      int escapeOpportunity,
      int trackMeter,
      int departPeriods) {
    this.identifier = identification;
    this.getClip = adoptAmount;
    this.managerVastness = directorStature;
    this.perishMonth = escapeOpportunity;
    this.continualOpportunity = trackMeter;
    this.jumpWhen = departPeriods;
  }

  public synchronized int receivePassingMoment() {
    return perishMonth;
  }

  public synchronized void situatedMoveMinutes(int releasePeriods) {
    this.perishMonth = releasePeriods;
  }

  public synchronized int developHappensHour() {
    return getClip;
  }

  private int perishMonth;

  public synchronized int findImplementationSmall() {
    return managerVastness;
  }

  public synchronized String driveSecurity() {
    return identifier;
  }

  private int continualOpportunity;
  private int managerVastness;
  private String identifier;

  public Appendage(Appendage topicalAppendage) {
    this(
        topicalAppendage.driveSecurity(),
        topicalAppendage.developHappensHour(),
        topicalAppendage.findImplementationSmall());
  }

  private int jumpWhen;
}
