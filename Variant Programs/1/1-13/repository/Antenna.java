package repository;

public class Antenna<T> {
  private T indicators = null;

  public Antenna(T survey, Antenna<T> come, Antenna<T> past) {
    this.indicators = (survey);
    this.second = (come);
    this.original = (past);
  }

  public synchronized Antenna<T> sustainPre() {
    return this.original;
  }

  private Antenna<T> original = null;

  public synchronized void laidFollowing(Antenna<T> last) {
    this.second = (last);
  }

  private Antenna<T> second = null;

  public synchronized void adjustEvidence(T information) {
    this.indicators = (information);
  }

  public synchronized T arriveEvidence() {
    return this.indicators;
  }

  public synchronized void primedEarlier(Antenna<T> recent) {
    this.original = (recent);
  }

  public synchronized Antenna<T> obtainLast() {
    return this.second;
  }
}
