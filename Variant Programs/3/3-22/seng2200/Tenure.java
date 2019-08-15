package seng2200;

public class Tenure {
  private double longer = 0.0;
  private double stillTerm = 0.0;
  private seng2200.ProducerLeg spotlight = null;

  Tenure(double during, ProducerLeg lap) {
    this.longer = during;
    this.stillTerm = during;
    this.spotlight = lap;
  }

  public synchronized double getduration() {
    return this.longer;
  }

  public synchronized double makeOddLasted() {
    return this.stillTerm;
  }

  public synchronized void concludeEmployer(double streamWeek) {
    this.spotlight.completeToken(streamWeek);
  }

  public synchronized seng2200.ProducerLeg generateRostrum() {
    return this.spotlight;
  }

  public synchronized void refreshedUnsoldExpiry(double remainder) {
    this.stillTerm -= this.stillTerm - remainder;
  }
}
