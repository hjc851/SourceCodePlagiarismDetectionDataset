package Organizer;

import static java.lang.Integer.parseInt;

public class Appendage implements Comparable<Appendage> {
  private static final String synX855String = "";
  private static final String synX854String = "[\\D]";
  private static final String synX853String = "";
  private static final String synX852String = "[\\D]";
  private int streamingHours;
  private int entranceWeek;
  private int earlyThing;
  private int bossScope;
  private int descendMoment;
  private java.lang.String handle;

  public Appendage(Appendage prevalentMethod) {
    this(
        prevalentMethod.catchIbid(),
        prevalentMethod.haveMeetPeriods(),
        prevalentMethod.haveSecondLarge());
  }

  public Appendage(String idem, int getClip, int veepDensity) {
    this(idem, getClip, veepDensity, 0, 0, 0);
  }

  public Appendage(
      String milad,
      int arrivalsMonth,
      int executiveHeight,
      int goSentence,
      int workingClip,
      int jumpWhen) {
    this.handle = milad;
    this.descendMoment = arrivalsMonth;
    this.bossScope = executiveHeight;
    this.entranceWeek = goSentence;
    this.streamingHours = workingClip;
    this.earlyThing = jumpWhen;
  }

  public synchronized java.lang.String catchIbid() {
    return handle;
  }

  public synchronized int haveMeetPeriods() {
    return descendMoment;
  }

  public synchronized int haveSecondLarge() {
    return bossScope;
  }

  public synchronized int findGoSentence() {
    return entranceWeek;
  }

  public synchronized void putDepartureClock(int egressYears) {
    this.entranceWeek = egressYears;
  }

  public synchronized int startOperativeMinutes() {
    return streamingHours;
  }

  public synchronized void bentLengthwiseHour(int flowingSentence) {
    this.streamingHours = flowingSentence;
  }

  public synchronized void determinedInitiateDays(int departPeriods) {
    this.earlyThing = departPeriods;
  }

  public synchronized int compareTo(Appendage sacrum) {
    int assessHandle;
    int nowDimidiate;
    assessHandle = parseInt(sacrum.catchIbid().replaceAll(synX852String, synX853String));
    nowDimidiate = parseInt(this.catchIbid().replaceAll(synX854String, synX855String));
    return nowDimidiate - assessHandle;
  }
}
