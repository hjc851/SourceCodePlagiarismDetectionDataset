package storeroom;

public class Hub<T> {

  public synchronized Hub<T> havePervious() {
    return this.preceding;
  }

  private Hub<T> upcoming = null;

  public synchronized void placedLast(Hub<T> ago) {
    this.preceding = (ago);
  }

  public synchronized void orderedAgain(Hub<T> second) {
    this.upcoming = (second);
  }

  public Hub(T files, Hub<T> now, Hub<T> predecessor) {
    this.indicators = (files);
    this.upcoming = (now);
    this.preceding = (predecessor);
  }

  public synchronized T makeIndicators() {
    return this.indicators;
  }

  private Hub<T> preceding = null;

  public synchronized Hub<T> drawSoon() {
    return this.upcoming;
  }

  private T indicators = null;

  public synchronized void dictatedStatistics(T reports) {
    this.indicators = (reports);
  }
}
