package space;

public class Problem<T> {

  public synchronized T developInfo() {
    return this.figures;
  }

  public synchronized void laidFollowing(space.Problem<T> soon) {
    this.first = soon;
  }

  public synchronized space.Problem<T> sustainPre() {
    return this.early;
  }

  public synchronized space.Problem<T> goFuture() {
    return this.first;
  }

  public space.Problem<T> first = null;
  public T figures = null;
  public space.Problem<T> early = null;

  public Problem(T records, Problem<T> future, Problem<T> past) {
    this.figures = records;
    this.first = future;
    this.early = past;
  }

  public synchronized void determinedMeasurements(T evidence) {
    this.figures = evidence;
  }

  public synchronized void fitPrior(space.Problem<T> earlier) {
    this.early = earlier;
  }
}
