package seng2200;

public class Tenure {
  public ProductPhase phases;
  public double oddLasted;
  public double lasting;

  public Tenure(double stays, ProductPhase juncture) {
    this.lasting = (stays);
    this.oddLasted = (stays);
    this.phases = (juncture);
  }

  public synchronized double getduration() {
    return this.lasting;
  }

  public synchronized double canAnotherExtent() {
    return this.oddLasted;
  }

  public synchronized void completeTask(double topicalPeriod) {
    this.phases.completedAgenda(topicalPeriod);
  }

  public synchronized ProductPhase comeLevel() {
    return this.phases;
  }

  public synchronized void reviseLeftLength(double periods) {
    this.oddLasted -= (periods);
  }
}
