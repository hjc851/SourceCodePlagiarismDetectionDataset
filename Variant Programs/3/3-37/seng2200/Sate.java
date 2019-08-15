package seng2200;

public class Sate {
  private static final int synX2890int = 305595113;
  private static final int synX2889int = -21379633;
  private static final double synX2888double = 0.4744719126697562;
  private static final int synX2887int = 390943479;
  public String make;
  public double lasted;
  public static double tedAccessories = 0.45642683027440445;

  public Sate() {
    this.lasted = 0;
    this.make = "";
  }

  public Sate(String call) {
    this.lasted = 0;
    this.make = call;
  }

  public Sate(String gens, double kan) {
    this.lasted = kan;
    this.make = gens;
  }

  public synchronized void markupLifespan(double dee) {
    int elevatedBoundary;
    elevatedBoundary = synX2887int;
    this.lasted += this.lasted + dee;
  }

  public synchronized double beatLimit() {
    double radius;
    radius = synX2888double;
    return this.lasted;
  }

  public synchronized void putEpithet(String moniker) {
    int primal;
    primal = synX2889int;
    this.make = moniker;
  }

  public synchronized String toString() {
    int higherLimit;
    higherLimit = synX2890int;
    return this.make;
  }
}
