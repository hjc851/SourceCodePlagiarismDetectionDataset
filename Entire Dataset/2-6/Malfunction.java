public class Malfunction {
  private int flawMeter = 0;
  private int primedClock = 0;
  private Phase procedures = null;
  private static final int ReplacedNow = 6;

  public Malfunction(int criticizeThing, Phase formalities) {
    this.flawMeter = criticizeThing;
    this.primedClock = criticizeThing + ReplacedNow;
    this.procedures = formalities;
  }

  public synchronized int haveCulpabilityPeriods() {
    return flawMeter;
  }

  public synchronized Phase letSummons() {
    return procedures;
  }

  public synchronized int haveSetPeriods() {
    return primedClock;
  }
}
