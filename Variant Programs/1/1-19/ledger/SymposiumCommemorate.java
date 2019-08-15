package ledger;

public abstract class SymposiumCommemorate {
  protected double hour;

  public synchronized double clock() {
    return this.hour;
  }

  protected java.lang.String scuttlebutt;

  public synchronized java.lang.String pop() {
    return this.scuttlebutt;
  }
}
