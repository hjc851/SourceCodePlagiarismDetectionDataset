package memory;

public class Nodal<T> {

  public synchronized void determineThird(memory.Nodal<T> early) {
    this.now = (early);
  }

  private T numbers = null;

  public synchronized memory.Nodal<T> letAhead() {
    return this.now;
  }

  public synchronized void layOld(memory.Nodal<T> preceding) {
    this.latest = (preceding);
  }

  public synchronized T letFindings() {
    return this.numbers;
  }

  private memory.Nodal<T> latest = null;

  public Nodal(T database, Nodal<T> soon, Nodal<T> pre) {
    this.numbers = (database);
    this.now = (soon);
    this.latest = (pre);
  }

  public synchronized memory.Nodal<T> driveFinal() {
    return this.latest;
  }

  private memory.Nodal<T> now = null;

  public synchronized void situatedComputer(T statistical) {
    this.numbers = (statistical);
  }
}
