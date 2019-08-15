package storeroom;

public class Ribbon<T> {

  public synchronized void fixedAfter(storeroom.Ribbon<T> future) {
    this.succeeding = (future);
  }

  private storeroom.Ribbon<T> past = null;

  public Ribbon(T readings, Ribbon<T> now, Ribbon<T> predecessor) {
    this.stats = (readings);
    this.succeeding = (now);
    this.past = (predecessor);
  }

  public synchronized storeroom.Ribbon<T> beatElapsed() {
    return this.past;
  }

  public synchronized T developInfo() {
    return this.stats;
  }

  public synchronized void settledStatistical(T figures) {
    this.stats = (figures);
  }

  private storeroom.Ribbon<T> succeeding = null;

  public synchronized void prepareCurrent(storeroom.Ribbon<T> late) {
    this.past = (late);
  }

  private T stats = null;

  public synchronized storeroom.Ribbon<T> comeFollowing() {
    return this.succeeding;
  }
}
