package Interface;

public class Mechanisms implements Comparable<Mechanisms> {
  private static final String synX1883String = "";
  private static final String synX1882String = "[\\D]";
  private static final String synX1881String = "";
  private static final String synX1880String = "[\\D]";
  public String ibid;
  public int comeClock;
  public int enforceableWidth;
  public int beginningClip;
  public int escapeOpportunity;
  public int scamperingDays;

  public Mechanisms(Mechanisms liveOutgrowth) {
    this(
        liveOutgrowth.haveHandle(),
        liveOutgrowth.canOccurYears(),
        liveOutgrowth.goExecutiveHeight());
  }

  public Mechanisms(String self, int bringWeek, int bossScope) {
    this(self, bringWeek, bossScope, 0, 0, 0);
  }

  public Mechanisms(
      String name,
      int meetPeriods,
      int officerImmensity,
      int pulloutHour,
      int operativeMinutes,
      int firstMoment) {
    this.ibid = name;
    this.comeClock = meetPeriods;
    this.enforceableWidth = officerImmensity;
    this.escapeOpportunity = pulloutHour;
    this.scamperingDays = operativeMinutes;
    this.beginningClip = firstMoment;
  }

  public synchronized String haveHandle() {
    return ibid;
  }

  public synchronized int canOccurYears() {
    return comeClock;
  }

  public synchronized int goExecutiveHeight() {
    return enforceableWidth;
  }

  public synchronized int bringLossMeter() {
    return escapeOpportunity;
  }

  public synchronized void markDeceaseHours(int leaveClip) {
    this.escapeOpportunity = leaveClip;
  }

  public synchronized int takeFunctioningPeriod() {
    return scamperingDays;
  }

  public synchronized void situatedOperativeMinutes(int continualOpportunity) {
    this.scamperingDays = continualOpportunity;
  }

  public synchronized void primedGetPeriod(int earlyThing) {
    this.beginningClip = earlyThing;
  }

  public synchronized int compareTo(Mechanisms sacrum) {
    int reconcileMap =
        Integer.parseInt(sacrum.haveHandle().replaceAll(synX1880String, synX1881String));
    int letIdentification =
        Integer.parseInt(this.haveHandle().replaceAll(synX1882String, synX1883String));
    return letIdentification - reconcileMap;
  }
}
