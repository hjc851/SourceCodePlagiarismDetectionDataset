package history;

public abstract class SpectaclePrecedent {
  public java.lang.String scoop = null;
  public double again = 0.0;

  public synchronized double meter() {
    return this.again;
  }

  public synchronized java.lang.String briefing() {
    return this.scoop;
  }
}
