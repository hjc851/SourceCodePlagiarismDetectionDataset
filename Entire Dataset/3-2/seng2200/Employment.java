package seng2200;

public class Employment {

  public Employment(double hours, FabricationLimelight degree) {
    this.span = hours;
    this.unresolvedLong = hours;
    this.lap = degree;
  }

  public double span = 0.0;

  public synchronized void reviseLeftLength(double extent) {
    this.unresolvedLong -= this.unresolvedLong - extent;
  }

  public double unresolvedLong = 0.0;

  public synchronized seng2200.FabricationLimelight fixLimelight() {
    return this.lap;
  }

  public synchronized void finaleWork(double streamWeek) {
    this.lap.conclusionArtifact(streamWeek);
  }

  public synchronized double getduration() {
    return this.span;
  }

  public synchronized double letRetainingMaximum() {
    return this.unresolvedLong;
  }

  public seng2200.FabricationLimelight lap = null;
}
