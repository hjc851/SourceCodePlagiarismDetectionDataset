package seng2200;

public class PeriodsStump {
  public double issue = 0.0;
  public double incoming = 0.0;
  public java.lang.String nudgePhaseEpithet = null;

  public PeriodsStump() {
    this.nudgePhaseEpithet = ("NoName");
    this.incoming = (0);
    this.issue = (0);
  }

  public PeriodsStump(String spurMention, double accessionJuncture, double departThing) {
    this.nudgePhaseEpithet = (spurMention);
    this.incoming = (accessionJuncture);
    this.issue = (departThing);
  }

  public synchronized void markPushTheaterDistinguish(java.lang.String figure) {
    this.nudgePhaseEpithet = (figure);
  }

  public synchronized java.lang.String obtainUrgingStagecoachAdvert() {
    return this.nudgePhaseEpithet;
  }

  public synchronized void solidifyingAccessionJuncture(double period) {
    this.incoming = (period);
  }

  public synchronized void arrangeEgressYears(double clip) {
    this.issue = (clip);
  }

  public synchronized double receiveDuring() {
    return this.issue - this.incoming;
  }
}
