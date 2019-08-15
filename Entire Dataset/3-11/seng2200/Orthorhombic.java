package seng2200;

import static java.lang.System.out;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Orthorhombic {
  private static final int synX1000int = 2;
  private static final int synX999int = 1;
  private static final int synX998int = 0;
  private static final String synX997String = "Not enough Parameters";
  private static final int synX996int = 3;
  public int maxQ;
  public double order;
  public double equate;
  public DevelopmentTuneSteward orientedSuperintendent;
  public String[] event;

  public Orthorhombic(String[] variable) {
    this.event = (variable);
  }

  public synchronized void bleed() {

    if (event.length != synX996int) {
      out.println(synX997String);
      return;
    }

    this.equate = (parseDouble(this.event[synX998int]));
    this.order = (parseDouble(this.event[synX999int]));
    this.maxQ = (parseInt(this.event[synX1000int]));
    this.orientedSuperintendent = (new DevelopmentTuneSteward(this.equate, this.order, this.maxQ));
    this.orientedSuperintendent.startleHandle();
  }

  public static synchronized void main(String[] adapter) {
    Orthorhombic iface;
    iface = (new Orthorhombic(adapter));
    iface.bleed();
  }
}
