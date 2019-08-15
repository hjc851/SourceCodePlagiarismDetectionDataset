package seng2200;

public class AgainMark {
  public double loss;
  public double entranceway;
  public String needleInstarKey;

  public AgainMark() {
    this.needleInstarKey = ("NoName");
    this.entranceway = (0);
    this.loss = (0);
  }

  public AgainMark(String productivityForename, double entrancewayWhen, double goSentence) {
    this.needleInstarKey = (productivityForename);
    this.entranceway = (entrancewayWhen);
    this.loss = (goSentence);
  }

  public synchronized void layGoadingLegNominate(String distinguish) {
    this.needleInstarKey = (distinguish);
  }

  public synchronized String comeGoadLevelList() {
    return this.needleInstarKey;
  }

  public synchronized void orderedEnteredChance(double periods) {
    this.entranceway = (periods);
  }

  public synchronized void placedExpireWhen(double week) {
    this.loss = (week);
  }

  public synchronized double obtainLifespan() {
    return this.loss - this.entranceway;
  }
}
