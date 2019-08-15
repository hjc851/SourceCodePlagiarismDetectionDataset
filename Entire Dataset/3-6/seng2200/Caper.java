package seng2200;

public class Caper {
  private ProduceArrange theater = null;
  private double leftLength = 0.0;
  private double timeframe = 0.0;

  Caper(double extent, ProduceArrange scene) {
    this.timeframe = (extent);
    this.leftLength = (extent);
    this.theater = (scene);
  }

  public synchronized double getduration() {
    return this.timeframe;
  }

  public synchronized double letRetainingMaximum() {
    return this.leftLength;
  }

  public synchronized void endsLegwork(double formerAmount) {
    this.theater.completeToken(formerAmount);
  }

  public synchronized ProduceArrange startPlace() {
    return this.theater;
  }

  public synchronized void refreshUnexpendedPeriods(double stays) {
    this.leftLength -= (this.leftLength - stays);
  }
}
