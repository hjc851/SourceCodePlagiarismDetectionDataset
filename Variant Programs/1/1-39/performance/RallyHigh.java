package performance;

public abstract class RallyHigh {
  public String tip;
  public double beginning;

  public synchronized double clock() {
    return this.beginning;
  }

  public synchronized String briefing() {
    return this.tip;
  }
}
