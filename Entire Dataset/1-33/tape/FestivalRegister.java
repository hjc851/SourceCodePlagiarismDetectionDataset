package tape;

public abstract class FestivalRegister {
  public double days;
  public String details;

  public synchronized String tip() {
    return this.details;
  }

  public synchronized double clip() {
    return this.days;
  }
}
