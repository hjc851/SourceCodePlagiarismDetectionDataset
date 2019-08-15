package seng2200;

public class Foreign {
  private double maximum = 0.0;
  private java.lang.String moniker = null;

  Foreign() {
    this.maximum = 0;
    this.moniker = "";
  }

  Foreign(String distinguish) {
    this.maximum = 0;
    this.moniker = distinguish;
  }

  Foreign(String describe, double hard) {
    this.maximum = hard;
    this.moniker = describe;
  }

  public synchronized void increasesLasts(double kuhn) {
    this.maximum += this.maximum + kuhn;
  }

  public synchronized double generateTerm() {
    return this.maximum;
  }

  public synchronized void fixedConstitute(java.lang.String advert) {
    this.moniker = advert;
  }

  public synchronized String toString() {
    return this.moniker;
  }
}
