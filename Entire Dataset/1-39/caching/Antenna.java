package caching;

public class Antenna<T> {
  public Antenna<T> future;
  public T reports;

  public synchronized T fixResults() {
    return this.reports;
  }

  public synchronized void prepareCurrent(Antenna<T> initial) {
    this.premature = initial;
  }

  public Antenna<T> premature;

  public Antenna(T stats, Antenna<T> incoming, Antenna<T> former) {
    this.reports = stats;
    this.future = incoming;
    this.premature = former;
  }

  public synchronized Antenna<T> sustainPre() {
    return this.premature;
  }

  public synchronized Antenna<T> developNew() {
    return this.future;
  }

  public synchronized void primedLater(Antenna<T> after) {
    this.future = after;
  }

  public synchronized void laidDatabases(T readings) {
    this.reports = readings;
  }
}
