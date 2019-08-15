package seng2200;

public class Cantons {
  public String nominate;
  public double longevity;

  public Cantons() {
    this.longevity = 0;
    this.nominate = "";
  }

  public Cantons(String identify) {
    this.longevity = 0;
    this.nominate = identify;
  }

  public Cantons(String advert, double ich) {
    this.longevity = ich;
    this.nominate = advert;
  }

  public synchronized void surgeExpiry(double beh) {
    this.longevity += this.longevity + beh;
  }

  public synchronized double beatLimit() {
    return this.longevity;
  }

  public synchronized void fixForename(String patronymic) {
    this.nominate = patronymic;
  }

  public synchronized String toString() {
    return this.nominate;
  }
}
