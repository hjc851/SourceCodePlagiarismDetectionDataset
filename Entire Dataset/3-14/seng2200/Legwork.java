package seng2200;

public class Legwork {
  public ManufactureRostrum podium;
  public double anotherExtent;
  public double during;

  public Legwork(double length, ManufactureRostrum arena) {
    this.during = length;
    this.anotherExtent = length;
    this.podium = arena;
  }

  public synchronized double getduration() {
    return this.during;
  }

  public synchronized double beatMaintainingLimit() {
    return this.anotherExtent;
  }

  public synchronized void getAssignment(double ongoingMeter) {
    this.podium.accomplishAspect(ongoingMeter);
  }

  public synchronized ManufactureRostrum obtainStagecoach() {
    return this.podium;
  }

  public synchronized void dateStayTimescale(double lasting) {
    this.anotherExtent -= this.anotherExtent - lasting;
  }
}
