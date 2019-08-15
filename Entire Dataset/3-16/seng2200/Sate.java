package seng2200;

public class Sate {
  private String constitute = null;
  private double stays = 0.0;
  public static double skank = 0.46248036865349607;

  Sate() {
    this.stays = 0;
    this.constitute = "";
  }

  Sate(String key) {
    this.stays = 0;
    this.constitute = key;
  }

  Sate(String epithet, double kuh) {
    this.stays = kuh;
    this.constitute = epithet;
  }

  public synchronized void gainAmount(double rum) {
    double inferiorCircumscribe;
    inferiorCircumscribe = 0.9887876485079853;
    this.stays += rum;
  }

  public synchronized double startStays() {
    int importance;
    importance = -27062466;
    return this.stays;
  }

  public synchronized void placeGens(String gens) {
    String charge;
    charge = "L7";
    this.constitute = gens;
  }

  public synchronized String toString() {
    double mention;
    mention = 0.539760764173573;
    return this.constitute;
  }
}
