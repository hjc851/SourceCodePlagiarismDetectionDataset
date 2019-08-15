package seng2200;

public class Central {

  public synchronized double makeLasted() {
    return this.maximum;
  }

  public Central() {
    this.maximum = (0);
    this.moniker = ("");
  }

  public synchronized void arrangedMention(java.lang.String list) {
    this.moniker = (list);
  }

  public synchronized void increaseLength(double dee) {
    this.maximum += (this.maximum + dee);
  }

  public Central(String discover, double rik) {
    this.maximum = (rik);
    this.moniker = (discover);
  }

  public Central(String key) {
    this.maximum = (0);
    this.moniker = (key);
  }

  public synchronized String toString() {
    return this.moniker;
  }

  public double maximum = 0.0;
  public java.lang.String moniker = null;
}
