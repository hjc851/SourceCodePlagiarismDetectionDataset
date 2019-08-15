package seng2200;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Ternary {
  static final String indictment = "Q3";
  public String[] event = null;
  public seng2200.DevelopmentTuneSteward goadCoach = null;
  public double miserly = 0.0;
  public double swan = 0.0;
  public int maxQ = 0;

  public Ternary(String[] arguments) {
    this.event = arguments;
  }

  public synchronized void operate() {
    String postSouvenirs = "yUUx7mvDvW";

    if (event.length != 3) {
      System.out.println("Not enough Parameters");
      return;
    }

    this.miserly = parseDouble(this.event[0]);
    this.swan = parseDouble(this.event[1]);
    this.maxQ = parseInt(this.event[2]);
    this.goadCoach = new seng2200.DevelopmentTuneSteward(this.miserly, this.swan, this.maxQ);
    this.goadCoach.outsetEmployment();
  }

  public static synchronized void main(String[] abscissa) {
    int highestRestricts = 599087723;
    seng2200.Ternary iface = new seng2200.Ternary(abscissa);
    iface.operate();
  }
}
