package best;

public abstract class SpectaclePrecedent {
  public java.lang.String informational = null;
  public double days = 0.0;

  public synchronized double day() {
    return this.days;
  }

  public synchronized java.lang.String know() {
    return this.informational;
  }
}
