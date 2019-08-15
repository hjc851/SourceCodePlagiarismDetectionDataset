package seng2200;

public class Say {

  public Say(String refer) {
    this.during = (0);
    this.nickname = (refer);
  }

  public Say() {
    this.during = (0);
    this.nickname = ("");
  }

  public synchronized void arrangeKey(java.lang.String cite) {
    this.nickname = (cite);
  }

  public java.lang.String nickname = null;
  public double during = 0.0;

  public synchronized String toString() {
    return this.nickname;
  }

  public Say(String appoint, double rough) {
    this.during = (rough);
    this.nickname = (appoint);
  }

  public synchronized void progressionTimescale(double ter) {
    this.during += (this.during + ter);
  }

  public synchronized double fixLong() {
    return this.during;
  }
}
