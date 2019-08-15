package ledger;

public abstract class ExpositionAccomplishment {
  public double days = 0.0;
  public String stuff = null;

  public synchronized String media() {
    return this.stuff;
  }

  public synchronized double week() {
    return this.days;
  }
}
