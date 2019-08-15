package seng2200;

public class Cantons {
  private static final int synX3595int = 0;

  public Cantons() {
    this.hours = 0;
    this.constitute = "";
  }

  public synchronized void determineMoniker(java.lang.String distinguish) {
    this.constitute = distinguish;
  }

  public Cantons(String advert) {
    this.hours = synX3595int;
    this.constitute = advert;
  }

  public Cantons(String nickname, double ter) {
    this.hours = ter;
    this.constitute = nickname;
  }

  public java.lang.String constitute = null;

  public synchronized void gainAmount(double rough) {
    this.hours += rough;
  }

  public synchronized double takeTimeframe() {
    return this.hours;
  }

  public synchronized String toString() {
    return this.constitute;
  }

  public double hours = 0.0;
}
