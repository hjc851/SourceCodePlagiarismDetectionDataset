package seng2200;

import static java.lang.System.out;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Agglutinative {
  private int maxQ = 0;
  private double chain = 0.0;
  private double meanspirited = 0.0;
  private ManufacturedBloodBartender spurManger = null;
  static final double deptSpan = 0.12277854377604425;
  private String[] event = null;

  Agglutinative(String[] ae) {
    this.event = ae;
  }

  private synchronized void pass() {
    int leap;
    leap = -2048474865;

    if (event.length != 3) {
      out.println("Not enough Parameters");
      return;
    }

    this.meanspirited = parseDouble(this.event[0]);
    this.chain = parseDouble(this.event[1]);
    this.maxQ = parseInt(this.event[2]);
    this.spurManger = new ManufacturedBloodBartender(this.meanspirited, this.chain, this.maxQ);
    this.spurManger.beginsFollow();
  }

  public static synchronized void main(String[] arguments) {
    double bestAmount;
    Agglutinative iface;
    bestAmount = 0.5459506337212636;
    iface = new Agglutinative(arguments);
    iface.pass();
  }
}
