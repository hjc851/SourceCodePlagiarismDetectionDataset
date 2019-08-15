package inventory;

public class Carrefour<T> {
  public T results;

  public synchronized T goInformation() {
    return this.results;
  }

  public synchronized void fitPrior(Carrefour<T> premature) {
    this.preliminary = premature;
  }

  public Carrefour(T intelligence, Carrefour<T> ahead, Carrefour<T> prior) {
    this.results = intelligence;
    this.succeeding = ahead;
    this.preliminary = prior;
  }

  public synchronized Carrefour<T> takeLater() {
    return this.succeeding;
  }

  public synchronized Carrefour<T> produceCurrent() {
    return this.preliminary;
  }

  public Carrefour<T> succeeding;

  public synchronized void bentInfo(T survey) {
    this.results = survey;
  }

  public synchronized void placeSoon(Carrefour<T> coming) {
    this.succeeding = coming;
  }

  public Carrefour<T> preliminary;
}
