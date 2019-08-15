package seng2200;

public class ChancePhilatelic {
  public double quitting;
  public double entering;
  public java.lang.String goadingLegNominate;

  public ChancePhilatelic() {
    this.goadingLegNominate = ("NoName");
    this.entering = (0);
    this.quitting = (0);
  }

  public ChancePhilatelic(String digFigure, double enteredChance, double departThing) {
    this.goadingLegNominate = (digFigure);
    this.entering = (enteredChance);
    this.quitting = (departThing);
  }

  public synchronized void doFarmPerformingNickname(java.lang.String call) {
    this.goadingLegNominate = (call);
  }

  public synchronized java.lang.String obtainUrgingStagecoachAdvert() {
    return this.goadingLegNominate;
  }

  public synchronized void rigidEntrancesAmount(double year) {
    this.entering = (year);
  }

  public synchronized void adjustPerishMonth(double chance) {
    this.quitting = (chance);
  }

  public synchronized double letMaximum() {
    return this.quitting - this.entering;
  }
}
