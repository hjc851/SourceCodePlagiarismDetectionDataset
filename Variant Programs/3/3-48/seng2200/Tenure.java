package seng2200;

public class Tenure {
  private seng2200.ProcessingScale present;
  private double survivingSpan;
  private double span;

  Tenure(double lasted, ProcessingScale rostrum) {
    this.span = (lasted);
    this.survivingSpan = (lasted);
    this.present = (rostrum);
  }

  public synchronized double getduration() {
    return this.span;
  }

  public synchronized double goLeftLength() {
    return this.survivingSpan;
  }

  public synchronized void completeTask(double contemporaryMoment) {
    this.present.concludeTidbit(contemporaryMoment);
  }

  public synchronized seng2200.ProcessingScale catchMoment() {
    return this.present;
  }

  public synchronized void modifyLatterStays(double timescale) {
    this.survivingSpan -= (timescale);
  }
}
