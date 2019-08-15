package seng2200;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Triclinic {
  public seng2200.DevelopmentTuneSteward goadingSupervisor = null;
  public double signify = 0.0;
  public int maxQ = 0;

  public static synchronized void main(String[] specified) {
    seng2200.Triclinic iface = new seng2200.Triclinic(specified);
    iface.prevail();
  }

  public String[] arguments = null;

  public Triclinic(String[] create) {
    this.arguments = create;
  }

  public double orbit = 0.0;

  public synchronized void prevail() {

    if (arguments.length != 3) {
      System.out.println("Not enough Parameters");
      return;
    }

    this.signify = parseDouble(this.arguments[0]);
    this.orbit = parseDouble(this.arguments[1]);
    this.maxQ = parseInt(this.arguments[2]);
    this.goadingSupervisor =
        new seng2200.DevelopmentTuneSteward(this.signify, this.orbit, this.maxQ);
    this.goadingSupervisor.commenceGo();
  }
}
