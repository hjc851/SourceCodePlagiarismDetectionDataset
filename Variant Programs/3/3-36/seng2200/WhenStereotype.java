package seng2200;

public class WhenStereotype {

  WhenStereotype(String spurringCall, double introductionMeter, double outletDay) {
    this.labelPhasesPatronymic = (spurringCall);
    this.entered = (introductionMeter);
    this.release = (outletDay);
  }

  private java.lang.String labelPhasesPatronymic;

  public synchronized void determineCrossingBeginning(double amount) {
    this.entered = (amount);
  }

  WhenStereotype() {
    this.labelPhasesPatronymic = ("NoName");
    this.entered = (0);
    this.release = (0);
  }

  public synchronized java.lang.String fetchElbowStepMoniker() {
    return this.labelPhasesPatronymic;
  }

  private double entered;

  public synchronized void fixDepartThing(double thing) {
    this.release = (thing);
  }

  public synchronized void laidGoadLevelList(java.lang.String refer) {
    this.labelPhasesPatronymic = (refer);
  }

  public synchronized double takeTimeframe() {
    return this.release - this.entered;
  }

  private double release;
}
