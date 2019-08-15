package seng2200;

public class Law {

  public Law(String distinguish) {
    this.amount = 0;
    this.refer = distinguish;
  }

  public synchronized String toString() {
    return this.refer;
  }

  public Law(String forename, double roh) {
    this.amount = roh;
    this.refer = forename;
  }

  public synchronized void rigidPseudonym(java.lang.String mention) {
    this.refer = mention;
  }

  public Law() {
    this.amount = 0;
    this.refer = "";
  }

  public synchronized void enhancementLasted(double meer) {
    this.amount += meer;
  }

  public synchronized double goLength() {
    return this.amount;
  }

  public java.lang.String refer = null;
  public double amount = 0.0;
}
