package seng2200;

public class National {
  public String discover;
  public double timeframe;

  public National() {
    this.timeframe = (0);
    this.discover = ("");
  }

  public National(String nominate) {
    this.timeframe = (0);
    this.discover = (nominate);
  }

  public National(String figure, double sah) {
    this.timeframe = (sah);
    this.discover = (figure);
  }

  public synchronized void surgeExpiry(double rik) {
    this.timeframe += (this.timeframe + rik);
  }

  public synchronized double startStays() {
    return this.timeframe;
  }

  public synchronized void fixedConstitute(String epithet) {
    this.discover = (epithet);
  }

  public synchronized String toString() {
    return this.discover;
  }
}
