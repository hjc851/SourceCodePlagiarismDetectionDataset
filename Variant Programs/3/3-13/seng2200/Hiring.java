package seng2200;

public class Hiring {
  public seng2200.ThroughputLap stagecoach = null;
  public double remainderLifespan = 0.0;
  public double longevity = 0.0;

  public Hiring(double limit, ThroughputLap spotlight) {
    this.longevity = (limit);
    this.remainderLifespan = (limit);
    this.stagecoach = (spotlight);
  }

  public synchronized double getduration() {
    return this.longevity;
  }

  public synchronized double generateStillTerm() {
    return this.remainderLifespan;
  }

  public synchronized void finisSpeculate(double prevalentNow) {
    this.stagecoach.completesSection(prevalentNow);
  }

  public synchronized seng2200.ThroughputLap sustainTheatrical() {
    return this.stagecoach;
  }

  public synchronized void refreshUnexpendedPeriods(double span) {
    this.remainderLifespan -= (span);
  }
}
