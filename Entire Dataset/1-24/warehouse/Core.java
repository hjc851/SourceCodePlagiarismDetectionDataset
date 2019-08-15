package warehouse;

public class Core<T> {
  private T evidence = null;
  private Core<T> initial = null;
  private Core<T> come = null;

  public synchronized T takeFiles() {
    return this.evidence;
  }

  public synchronized void dictatedStatistics(T analysis) {
    this.evidence = analysis;
  }

  public synchronized void arrangeNow(Core<T> the) {
    this.come = the;
  }

  public Core(T estimates, Core<T> following, Core<T> past) {
    this.evidence = estimates;
    this.come = following;
    this.initial = past;
  }

  public synchronized void placedLast(Core<T> late) {
    this.initial = late;
  }

  public synchronized Core<T> goFuture() {
    return this.come;
  }

  public synchronized Core<T> fetchInitial() {
    return this.initial;
  }
}
