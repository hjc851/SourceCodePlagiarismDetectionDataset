package seng2200;

public class PeriodsStump {
  public String nudgePhaseEpithet = null;
  public double entrances = 0.0;
  public double escape = 0.0;

  public PeriodsStump() {
    this.nudgePhaseEpithet = ("NoName");
    this.entrances = (0);
    this.escape = (0);
  }

  public PeriodsStump(String orientedConstitute, double gateMinutes, double goingDays) {
    this.nudgePhaseEpithet = (orientedConstitute);
    this.entrances = (gateMinutes);
    this.escape = (goingDays);
  }

  public synchronized void fixedOrientedLapConstitute(String advert) {
    this.nudgePhaseEpithet = (advert);
  }

  public synchronized String fixImpelLimelightDiscover() {
    return this.nudgePhaseEpithet;
  }

  public synchronized void readySubmissionDay(double amount) {
    this.entrances = (amount);
  }

  public synchronized void solidifyingLeavingJuncture(double clock) {
    this.escape = (clock);
  }

  public synchronized double canExtent() {
    return this.escape - this.entrances;
  }
}
