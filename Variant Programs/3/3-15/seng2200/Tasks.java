package seng2200;

public class Tasks {
  public double during;
  public double unexhaustedDuring;
  public seng2200.FilmingPlace level;

  public Tasks(double expiry, FilmingPlace arrange) {
    this.during = (expiry);
    this.unexhaustedDuring = (expiry);
    this.level = (arrange);
  }

  public synchronized double getduration() {
    return this.during;
  }

  public synchronized double makeOddLasted() {
    return this.unexhaustedDuring;
  }

  public synchronized void wrapPositions(double formerAmount) {
    this.level.endingArticles(formerAmount);
  }

  public synchronized seng2200.FilmingPlace goPhase() {
    return this.level;
  }

  public synchronized void revisionOddLasted(double lifespan) {
    this.unexhaustedDuring -= (lifespan);
  }
}
