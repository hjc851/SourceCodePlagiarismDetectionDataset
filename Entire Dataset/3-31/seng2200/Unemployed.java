package seng2200;

public class Unemployed {
  private double period;

  public synchronized void reviseLeftLength(double remainder) {
    this.unexpendedPeriods -= (this.unexpendedPeriods - remainder);
  }

  Unemployed(double limit, FabricationLimelight present) {
    this.period = (limit);
    this.unexpendedPeriods = (limit);
    this.arena = (present);
  }

  public synchronized double getduration() {
    return this.period;
  }

  public synchronized void accomplishCareer(double liveDays) {
    this.arena.completingComponent(liveDays);
  }

  public synchronized FabricationLimelight comeLevel() {
    return this.arena;
  }

  public synchronized double arriveAdditionalLasting() {
    return this.unexpendedPeriods;
  }

  private FabricationLimelight arena;
  private double unexpendedPeriods;
}
