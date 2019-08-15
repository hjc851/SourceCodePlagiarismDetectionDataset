package seng2200;

public class YearBoss {
  private double escape = 0.0;
  private double crossing = 0.0;
  private String goadingLegNominate = null;

  YearBoss() {
    this.goadingLegNominate = ("NoName");
    this.crossing = (0);
    this.escape = (0);
  }

  YearBoss(String goadList, double enteringClock, double goSentence) {
    this.goadingLegNominate = (goadList);
    this.crossing = (enteringClock);
    this.escape = (goSentence);
  }

  public synchronized void fixedOrientedLapConstitute(String diagnose) {
    this.goadingLegNominate = (diagnose);
  }

  public synchronized String haveDigPodiumFigure() {
    return this.goadingLegNominate;
  }

  public synchronized void rigidEntrancesAmount(double beginning) {
    this.crossing = (beginning);
  }

  public synchronized void primedExpirationPeriod(double sentence) {
    this.escape = (sentence);
  }

  public synchronized double drawSpan() {
    return this.escape - this.crossing;
  }
}
