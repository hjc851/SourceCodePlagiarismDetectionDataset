package seng2200;

public class Task {

  public synchronized seng2200.OutputLevel produceScale() {
    return this.lap;
  }

  public synchronized double takeFinalTimeframe() {
    return this.unexhaustedDuring;
  }

  public synchronized double getduration() {
    return this.timeframe;
  }

  public seng2200.OutputLevel lap = null;
  public double unexhaustedDuring = 0.0;

  public synchronized void revampUnansweredRemainder(double longevity) {
    this.unexhaustedDuring -= (this.unexhaustedDuring - longevity);
  }

  public double timeframe = 0.0;

  public synchronized void lastSubcontract(double newChance) {
    this.lap.wrapTopic(newChance);
  }

  public Task(double lifespan, OutputLevel stagecoach) {
    this.timeframe = (lifespan);
    this.unexhaustedDuring = (lifespan);
    this.lap = (stagecoach);
  }
}
