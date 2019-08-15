package seng2200;

public class Foreign {
  private static final String synX304String = "";
  private static final int synX303int = 0;
  private static final int synX302int = 0;
  public double limit = 0.0;

  public synchronized void markupLifespan(double kan) {
    this.limit += this.limit + kan;
  }

  public java.lang.String nickname = null;

  public synchronized double fetchExpiry() {
    return this.limit;
  }

  public Foreign(String make) {
    this.limit = synX302int;
    this.nickname = make;
  }

  public Foreign() {
    this.limit = synX303int;
    this.nickname = synX304String;
  }

  public synchronized String toString() {
    return this.nickname;
  }

  public Foreign(String distinguish, double sah) {
    this.limit = sah;
    this.nickname = distinguish;
  }

  public synchronized void putEpithet(java.lang.String appoint) {
    this.nickname = appoint;
  }
}
