package warehouse;

public class Junction<T> {
  public warehouse.Junction<T> following;

  public synchronized T produceSurvey() {
    return this.indicators;
  }

  public warehouse.Junction<T> original;

  public synchronized warehouse.Junction<T> bringClose() {
    return this.following;
  }

  public synchronized void doEarly(warehouse.Junction<T> coming) {
    this.following = (coming);
  }

  public Junction(T survey, Junction<T> then, Junction<T> past) {
    this.indicators = (survey);
    this.following = (then);
    this.original = (past);
  }

  public synchronized void adjustFirst(warehouse.Junction<T> ago) {
    this.original = (ago);
  }

  public synchronized warehouse.Junction<T> fetchInitial() {
    return this.original;
  }

  public synchronized void layAnalysis(T numbers) {
    this.indicators = (numbers);
  }

  public T indicators;
}
