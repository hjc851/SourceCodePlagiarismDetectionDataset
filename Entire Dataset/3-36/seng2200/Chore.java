package seng2200;

public class Chore {

  Chore(double continuance, CultivationScene juncture) {
    this.extent = (continuance);
    this.unexpendedPeriods = (continuance);
    this.rostrum = (juncture);
  }

  private seng2200.CultivationScene rostrum;

  public synchronized double getduration() {
    return this.extent;
  }

  public synchronized void endEmployment(double latestClip) {
    this.rostrum.terminusSomething(latestClip);
  }

  private double extent;

  public synchronized double haveRestPeriod() {
    return this.unexpendedPeriods;
  }

  public synchronized seng2200.CultivationScene makeDegree() {
    return this.rostrum;
  }

  private double unexpendedPeriods;

  public synchronized void informationAdditionalLasting(double lasted) {
    this.unexpendedPeriods -= (this.unexpendedPeriods - lasted);
  }
}
