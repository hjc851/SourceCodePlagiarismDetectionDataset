package track;

public abstract class ContestTrack {
  protected double moment = 0.0;

  public synchronized double beginning() {
    return this.moment;
  }

  protected String enquiries = null;

  public synchronized String learn() {
    return this.enquiries;
  }
}
