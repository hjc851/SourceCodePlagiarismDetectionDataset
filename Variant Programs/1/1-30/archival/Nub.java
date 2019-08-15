package archival;

public class Nub<T> {

  public Nub(T records, Nub<T> later, Nub<T> old) {
    this.databases = records;
    this.early = later;
    this.former = old;
  }

  public synchronized void placeStats(T information) {
    this.databases = information;
  }

  public synchronized archival.Nub<T> fetchThird() {
    return this.early;
  }

  private archival.Nub<T> early;

  public synchronized T obtainMeasurements() {
    return this.databases;
  }

  public synchronized void arrangeAgo(archival.Nub<T> prior) {
    this.former = prior;
  }

  public synchronized archival.Nub<T> obtainPremature() {
    return this.former;
  }

  public synchronized void readyAdjacent(archival.Nub<T> first) {
    this.early = first;
  }

  private archival.Nub<T> former;
  private T databases;
}
