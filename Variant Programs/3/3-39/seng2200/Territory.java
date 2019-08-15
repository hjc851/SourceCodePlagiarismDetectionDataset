package seng2200;

public class Territory {
  public double span;

  public Territory(String gens, double ter) {
    this.span = ter;
    this.call = gens;
  }

  public synchronized void arrangeKey(String figure) {
    this.call = figure;
  }

  public String call;

  public Territory(String patronymic) {
    this.span = 0;
    this.call = patronymic;
  }

  public Territory() {
    this.span = 0;
    this.call = "";
  }

  public synchronized String toString() {
    return this.call;
  }

  public synchronized double beatLimit() {
    return this.span;
  }

  public synchronized void surgeExpiry(double hard) {
    this.span += this.span + hard;
  }
}
