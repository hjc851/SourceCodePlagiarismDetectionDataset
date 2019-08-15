package seng2200;

public class Central {
  private java.lang.String figure;
  private double periods;

  Central() {
    this.periods = (0);
    this.figure = ("");
  }

  Central(String diagnose) {
    this.periods = (0);
    this.figure = (diagnose);
  }

  Central(String nominate, double roh) {
    this.periods = (roh);
    this.figure = (nominate);
  }

  public synchronized void upsurgeExtent(double hard) {
    this.periods += (hard);
  }

  public synchronized double takeTimeframe() {
    return this.periods;
  }

  public synchronized void primedCall(java.lang.String moniker) {
    this.figure = (moniker);
  }

  public synchronized String toString() {
    return this.figure;
  }
}
