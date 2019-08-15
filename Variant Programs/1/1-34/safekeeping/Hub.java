package safekeeping;

public class Hub<T> {

  public synchronized void orderedAgain(Hub<T> ahead) {
    this.the = ahead;
  }

  public synchronized Hub<T> fixRecord() {
    return this.former;
  }

  public synchronized T letFindings() {
    return this.records;
  }

  public synchronized void markFindings(T numbers) {
    this.records = numbers;
  }

  public Hub(T study, Hub<T> close, Hub<T> initial) {
    this.records = study;
    this.the = close;
    this.former = initial;
  }

  public Hub<T> former = null;
  public Hub<T> the = null;

  public synchronized Hub<T> fetchThird() {
    return this.the;
  }

  public T records = null;

  public synchronized void prepareCurrent(Hub<T> old) {
    this.former = old;
  }
}
