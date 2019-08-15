package seng2200;

public class Cantons {
  public String figure;
  public double span;

  public Cantons() {
    this.span = (0);
    this.figure = ("");
  }

  public Cantons(String nominate) {
    this.span = (0);
    this.figure = (nominate);
  }

  public Cantons(String advert, double theo) {
    this.span = (theo);
    this.figure = (advert);
  }

  public synchronized void enhanceTime(double kan) {
    this.span += (kan);
  }

  public synchronized double generateTerm() {
    return this.span;
  }

  public synchronized void fixedConstitute(String epithet) {
    this.figure = (epithet);
  }

  public synchronized String toString() {
    return this.figure;
  }
}
