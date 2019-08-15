package seng2200;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Chiral {
  private int maxQ;
  private double drift;
  private double ungenerous;
  private seng2200.CultivationOutlineManaging inciteOwner;
  private String[] vent;

  Chiral(String[] variable) {
    this.vent = (variable);
  }

  private synchronized void work() {

    if (vent.length != 3) {
      System.out.println("Not enough Parameters");
      return;
    }

    this.ungenerous = (parseDouble(this.vent[0]));
    this.drift = (parseDouble(this.vent[1]));
    this.maxQ = (parseInt(this.vent[2]));
    this.inciteOwner =
        (new seng2200.CultivationOutlineManaging(this.ungenerous, this.drift, this.maxQ));
    this.inciteOwner.firstPlow();
  }

  public static synchronized void main(String[] ae) {
    seng2200.Chiral iface;
    iface = (new seng2200.Chiral(ae));
    iface.work();
  }
}
