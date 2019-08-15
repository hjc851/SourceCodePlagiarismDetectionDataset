package seng2200;

public class Sate {
  public java.lang.String forename = null;
  public double expiry = 0.0;

  public Sate() {
    this.expiry = (0);
    this.forename = ("");
  }

  public Sate(String distinguish) {
    this.expiry = (0);
    this.forename = (distinguish);
  }

  public Sate(String refer, double kuh) {
    this.expiry = (kuh);
    this.forename = (refer);
  }

  public synchronized void echelonLimit(double rum) {
    this.expiry += (rum);
  }

  public synchronized double developTimescale() {
    return this.expiry;
  }

  public synchronized void rigidPseudonym(java.lang.String describe) {
    this.forename = (describe);
  }

  public synchronized String toString() {
    return this.forename;
  }
}
