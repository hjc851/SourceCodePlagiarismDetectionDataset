package seng2200;

public class Hiring {
  public ThroughputLap phases;
  public double remainderLifespan;
  public double extent;

  public Hiring(double length, ThroughputLap spotlight) {
    this.extent = (length);
    this.remainderLifespan = (length);
    this.phases = (spotlight);
  }

  public synchronized double getduration() {
    return this.extent;
  }

  public synchronized double haveRestPeriod() {
    return this.remainderLifespan;
  }

  public synchronized void completeTask(double newChance) {
    this.phases.terminateConsignment(newChance);
  }

  public synchronized ThroughputLap goPhase() {
    return this.phases;
  }

  public synchronized void informationAdditionalLasting(double span) {
    this.remainderLifespan -= (this.remainderLifespan - span);
  }
}
