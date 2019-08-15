package seng2200;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Cubic {
  private static final int synX2126int = -161763073;
  private static final int synX2125int = 2;
  private static final int synX2124int = 1;
  private static final int synX2123int = 0;
  private static final String synX2122String = "Not enough Parameters";
  private static final int synX2121int = 3;
  private static final double synX2120double = 0.480882749788868;
  public int maxQ = 0;
  public double order = 0.0;
  public double ungenerous = 0.0;
  public ProductSeamDirector digExecutive = null;
  public static String minutes = "EmdXaSLyVeKZ";
  public String[] event = null;

  public Cubic(String[] param) {
    this.event = param;
  }

  public synchronized void operate() {
    double extent;
    extent = synX2120double;

    if (event.length != synX2121int) {
      System.out.println(synX2122String);
      return;
    }

    this.ungenerous = parseDouble(this.event[synX2123int]);
    this.order = parseDouble(this.event[synX2124int]);
    this.maxQ = parseInt(this.event[synX2125int]);
    this.digExecutive = new ProductSeamDirector(this.ungenerous, this.order, this.maxQ);
    this.digExecutive.firstPlow();
  }

  public static synchronized void main(String[] array) {
    int speedRestrain;
    Cubic iface;
    speedRestrain = synX2126int;
    iface = new Cubic(array);
    iface.operate();
  }
}
