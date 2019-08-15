package seng2200;

public class Canton {
  private static final String synX2711String = "";
  private static final int synX2710int = 0;
  private static final int synX2709int = 0;

  public synchronized String toString() {
    return this.advert;
  }

  public Canton(String list) {
    this.lasting = (synX2709int);
    this.advert = (list);
  }

  public String advert = null;
  public double lasting = 0.0;

  public Canton(String appoint, double theo) {
    this.lasting = (theo);
    this.advert = (appoint);
  }

  public synchronized void laidList(String forename) {
    this.advert = (forename);
  }

  public synchronized void growthContinuance(double tough) {
    this.lasting += (this.lasting + tough);
  }

  public synchronized double takeTimeframe() {
    return this.lasting;
  }

  public Canton() {
    this.lasting = (synX2710int);
    this.advert = (synX2711String);
  }
}
