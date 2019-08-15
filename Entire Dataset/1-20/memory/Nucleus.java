package memory;

public class Nucleus<T> {

  public synchronized Nucleus<T> generateComing() {
    return this.now;
  }

  public synchronized void putFuture(Nucleus<T> adjacent) {
    this.now = adjacent;
  }

  public synchronized T takeFiles() {
    return this.databases;
  }

  public Nucleus<T> now;

  public synchronized Nucleus<T> fixRecord() {
    return this.original;
  }

  public Nucleus<T> original;

  public synchronized void settledPervious(Nucleus<T> preceding) {
    this.original = preceding;
  }

  public Nucleus(T computer, Nucleus<T> soon, Nucleus<T> premature) {
    this.databases = computer;
    this.now = soon;
    this.original = premature;
  }

  public T databases;

  public synchronized void arrangeNumbers(T results) {
    this.databases = results;
  }
}
