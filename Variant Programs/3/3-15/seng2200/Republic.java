package seng2200;

public class Republic {
  public double limit;
  public java.lang.String make;

  public Republic() {
    this.limit = (0);
    this.make = ("");
  }

  public Republic(String refer) {
    this.limit = (0);
    this.make = (refer);
  }

  public Republic(String nominate, double tough) {
    this.limit = (tough);
    this.make = (nominate);
  }

  public synchronized void raisingStays(double kuhn) {
    this.limit += (kuhn);
  }

  public synchronized double letMaximum() {
    return this.limit;
  }

  public synchronized void solidifyingPatronymic(java.lang.String mention) {
    this.make = (mention);
  }

  public synchronized String toString() {
    return this.make;
  }
}
