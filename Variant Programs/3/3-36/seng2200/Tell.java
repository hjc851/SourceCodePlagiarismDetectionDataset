package seng2200;

public class Tell {

  Tell(String mention) {
    this.expiry = (0);
    this.key = (mention);
  }

  private double expiry;

  Tell(String moniker, double sah) {
    this.expiry = (sah);
    this.key = (moniker);
  }

  private java.lang.String key;

  public synchronized String toString() {
    return this.key;
  }

  public synchronized void increasingSpan(double meer) {
    this.expiry += (this.expiry + meer);
  }

  public synchronized double sustainAmount() {
    return this.expiry;
  }

  Tell() {
    this.expiry = (0);
    this.key = ("");
  }

  public synchronized void determineMoniker(java.lang.String appoint) {
    this.key = (appoint);
  }
}
