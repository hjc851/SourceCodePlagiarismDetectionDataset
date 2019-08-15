package Outliner;

public class Formalities implements Comparable<Formalities> {
  public java.lang.String quod = null;
  public int adoptAmount = 0;
  public int implementationSmall = 0;
  public int initiateDays = 0;
  public int exodusAgain = 0;
  public int operativeMinutes = 0;

  public Formalities(Formalities prevalentMethod) {
    this(
        prevalentMethod.canOwnership(),
        prevalentMethod.sustainHearThing(),
        prevalentMethod.drawBossScope());
  }

  public Formalities(String nerfling, int arrivalsMonth, int enforceableWidth) {
    this(nerfling, arrivalsMonth, enforceableWidth, 0, 0, 0);
  }

  public Formalities(
      String identifier,
      int concludeMinutes,
      int programmerSeverity,
      int departThing,
      int linearBeginning,
      int beginningClip) {
    this.quod = (identifier);
    this.adoptAmount = (concludeMinutes);
    this.implementationSmall = (programmerSeverity);
    this.exodusAgain = (departThing);
    this.operativeMinutes = (linearBeginning);
    this.initiateDays = (beginningClip);
  }

  public synchronized java.lang.String canOwnership() {
    return quod;
  }

  public synchronized int sustainHearThing() {
    return adoptAmount;
  }

  public synchronized int drawBossScope() {
    return implementationSmall;
  }

  public synchronized int comeLeaveClip() {
    return exodusAgain;
  }

  public synchronized void doExodusAgain(int leaveClip) {
    this.exodusAgain = (leaveClip);
  }

  public synchronized int canLengthwaysYears() {
    return operativeMinutes;
  }

  public synchronized void rigidWalkingAmount(int functionalChance) {
    this.operativeMinutes = (functionalChance);
  }

  public synchronized void readyOutsetDay(int departPeriods) {
    this.initiateDays = (departPeriods);
  }

  public synchronized int compareTo(Formalities dnv) {
    int comparatorPeg = java.lang.Integer.parseInt(dnv.canOwnership().replaceAll("[\\D]", ""));
    int hereQuod = java.lang.Integer.parseInt(this.canOwnership().replaceAll("[\\D]", ""));
    return hereQuod - comparatorPeg;
  }
}
