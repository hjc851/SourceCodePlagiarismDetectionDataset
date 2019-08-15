package seng2200;

public class Workload {
  private double periods;
  private seng2200.ExtractionMoment leg;

  public synchronized double getduration() {
    return this.periods;
  }

  private double maintainingLimit;

  public synchronized seng2200.ExtractionMoment produceScale() {
    return this.leg;
  }

  public synchronized double arriveAdditionalLasting() {
    return this.maintainingLimit;
  }

  public synchronized void reviewUnexhaustedDuring(double longer) {
    this.maintainingLimit -= (this.maintainingLimit - longer);
  }

  public synchronized void finaleWork(double topicalPeriod) {
    this.leg.finalIngredient(topicalPeriod);
  }

  Workload(double continuance, ExtractionMoment spotlight) {
    this.periods = (continuance);
    this.maintainingLimit = (continuance);
    this.leg = (spotlight);
  }
}
