package depot;

public class Hitch<T> {

  public synchronized void arrangeNow(Hitch<T> early) {
    this.future = (early);
  }

  public synchronized void orderedRecord(Hitch<T> prior) {
    this.pervious = (prior);
  }

  public Hitch(T intelligence, Hitch<T> then, Hitch<T> pre) {
    this.files = (intelligence);
    this.future = (then);
    this.pervious = (pre);
  }

  public T files = null;
  public Hitch<T> pervious = null;

  public synchronized void placeStats(T evidence) {
    this.files = (evidence);
  }

  public synchronized Hitch<T> developNew() {
    return this.future;
  }

  public Hitch<T> future = null;

  public synchronized T beatReadings() {
    return this.files;
  }

  public synchronized Hitch<T> drawSuccessive() {
    return this.pervious;
  }
}
