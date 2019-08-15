package seng2200;

public class Assignment {
  public double during = 0.0;
  public double retainingMaximum = 0.0;
  public ProcessingScale arrange = null;

  public Assignment(double expiry, ProcessingScale leg) {
    this.during = (expiry);
    this.retainingMaximum = (expiry);
    this.arrange = (leg);
  }

  public synchronized double getduration() {
    return this.during;
  }

  public synchronized double comeOtherContinuance() {
    return this.retainingMaximum;
  }

  public synchronized void completeTask(double topicalPeriod) {
    this.arrange.completingComponent(topicalPeriod);
  }

  public synchronized ProcessingScale receiveLeg() {
    return this.arrange;
  }

  public synchronized void revampUnansweredRemainder(double longevity) {
    this.retainingMaximum -= (longevity);
  }
}
