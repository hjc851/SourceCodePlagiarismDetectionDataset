package seng2200;

import static java.lang.System.out;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Conformal {
  private String[] string = null;
  private seng2200.ProduceCrinkleBoss needleSteward = null;
  private double average = 0.0;
  private double drift = 0.0;
  private int maxQ = 0;

  Conformal(String[] specified) {
    this.string = specified;
  }

  private synchronized void lead() {

    if (string.length != 3) {
      out.println("Not enough Parameters");
      return;
    }

    this.average = parseDouble(this.string[0]);
    this.drift = parseDouble(this.string[1]);
    this.maxQ = parseInt(this.string[2]);
    this.needleSteward = new seng2200.ProduceCrinkleBoss(this.average, this.drift, this.maxQ);
    this.needleSteward.departAct();
  }

  public static synchronized void main(String[] event) {
    seng2200.Conformal iface = new seng2200.Conformal(event);
    iface.lead();
  }
}
