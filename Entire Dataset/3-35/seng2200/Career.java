package seng2200;

public class Career {
  public seng2200.IndustrializationPhases phase;
  public double keepingLongevity;
  public double remainder;

  public Career(double hours, IndustrializationPhases point) {
    this.remainder = (hours);
    this.keepingLongevity = (hours);
    this.phase = (point);
  }

  public synchronized double getduration() {
    return this.remainder;
  }

  public synchronized double fixUnresolvedLong() {
    return this.keepingLongevity;
  }

  public synchronized void completesStaff(double prevailingClock) {
    this.phase.wrapTopic(prevailingClock);
  }

  public synchronized seng2200.IndustrializationPhases developScene() {
    return this.phase;
  }

  public synchronized void versionLingeringAmount(double continuance) {
    this.keepingLongevity -= (this.keepingLongevity - continuance);
  }
}
