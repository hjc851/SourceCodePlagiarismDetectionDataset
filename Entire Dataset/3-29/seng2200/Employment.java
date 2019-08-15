package seng2200;

public class Employment {
  public ProcessingScale degree;
  public double remainderLifespan;
  public double stays;

  public Employment(double term, ProcessingScale leg) {
    this.stays = (term);
    this.remainderLifespan = (term);
    this.degree = (leg);
  }

  public synchronized double getduration() {
    return this.stays;
  }

  public synchronized double receiveUnexhaustedDuring() {
    return this.remainderLifespan;
  }

  public synchronized void endingTasks(double newChance) {
    this.degree.completingComponent(newChance);
  }

  public synchronized ProcessingScale findPresent() {
    return this.degree;
  }

  public synchronized void revisionOddLasted(double span) {
    this.remainderLifespan -= (this.remainderLifespan - span);
  }
}
