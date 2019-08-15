package seng2200;

public class AmountMail {

  AmountMail() {
    this.urgeScaleMake = ("NoName");
    this.participation = (0);
    this.go = (0);
  }

  private double go;
  private String urgeScaleMake;

  public synchronized void dictatedPokePointRefer(String gens) {
    this.urgeScaleMake = (gens);
  }

  AmountMail(String urgingAdvert, double launchingPeriod, double moveMinutes) {
    this.urgeScaleMake = (urgingAdvert);
    this.participation = (launchingPeriod);
    this.go = (moveMinutes);
  }

  private double participation;

  public synchronized double letMaximum() {
    return this.go - this.participation;
  }

  public synchronized void layPassingMoment(double opportunity) {
    this.go = (opportunity);
  }

  public synchronized void prepareAdmittanceNow(double thing) {
    this.participation = (thing);
  }

  public synchronized String letPushTheaterDistinguish() {
    return this.urgeScaleMake;
  }
}
