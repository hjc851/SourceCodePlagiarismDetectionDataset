package seng2200;

public class Hiring {
  public double expiry = 0.0;

  public synchronized double getduration() {
    return this.expiry;
  }

  public ProducesSpotlight step = null;
  public double unsoldExpiry = 0.0;

  public synchronized ProducesSpotlight bringPoint() {
    return this.step;
  }

  public Hiring(double period, ProducesSpotlight scene) {
    this.expiry = period;
    this.unsoldExpiry = period;
    this.step = scene;
  }

  public synchronized void newKeepingLongevity(double periods) {
    this.unsoldExpiry -= periods;
  }

  public synchronized void completeTask(double underwayYear) {
    this.step.endingArticles(underwayYear);
  }

  public synchronized double bringLeftoverLasts() {
    return this.unsoldExpiry;
  }
}
