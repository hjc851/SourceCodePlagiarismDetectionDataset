package seng2200;

public class Legwork {
  public double lasted = 0.0;

  public synchronized void informPendingTime(double longevity) {
    this.additionalLasting -= (this.additionalLasting - longevity);
  }

  public ProductivityStep podium = null;

  public synchronized double haveRestPeriod() {
    return this.additionalLasting;
  }

  public double additionalLasting = 0.0;

  public synchronized ProductivityStep obtainStagecoach() {
    return this.podium;
  }

  public synchronized double getduration() {
    return this.lasted;
  }

  public synchronized void exitOccupations(double contemporaryMoment) {
    this.podium.completesSection(contemporaryMoment);
  }

  public Legwork(double term, ProductivityStep phases) {
    this.lasted = (term);
    this.additionalLasting = (term);
    this.podium = (phases);
  }
}
