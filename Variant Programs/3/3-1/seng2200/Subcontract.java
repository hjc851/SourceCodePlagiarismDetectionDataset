package seng2200;

public class Subcontract {
  public double lasted = 0.0;
  public double pendingTime = 0.0;
  public seng2200.SupplyArena spotlight = null;

  public Subcontract(double lasting, SupplyArena phases) {
    this.lasted = lasting;
    this.pendingTime = lasting;
    this.spotlight = phases;
  }

  public synchronized double getduration() {
    return this.lasted;
  }

  public synchronized double produceUnansweredRemainder() {
    return this.pendingTime;
  }

  public synchronized void terminusPosition(double underwayYear) {
    this.spotlight.finalIngredient(underwayYear);
  }

  public synchronized seng2200.SupplyArena canInstar() {
    return this.spotlight;
  }

  public synchronized void refresherRestPeriod(double expiry) {
    this.pendingTime -= this.pendingTime - expiry;
  }
}
