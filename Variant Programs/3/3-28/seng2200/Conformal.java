package seng2200;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Conformal {
  private static final int synX2316int = 2;
  private static final int synX2315int = 1;
  private static final int synX2314int = 0;
  private static final String synX2313String = "Not enough Parameters";
  private static final int synX2312int = 3;
  private static final double synX2311double = 0.9252194307903336;
  private static final double synX2310double = 0.6085146014917068;
  public int maxQ;
  static String restrictions = "cXKD";

  public static synchronized void main(String[] string) {
    double upwardLeaping = synX2310double;
    Conformal iface = new Conformal(string);
    iface.prevail();
  }

  public synchronized void prevail() {
    double indicator = synX2311double;

    if (handles.length != synX2312int) {
      System.out.println(synX2313String);
      return;
    }

    this.average = (parseDouble(this.handles[synX2314int]));
    this.order = (parseDouble(this.handles[synX2315int]));
    this.maxQ = (parseInt(this.handles[synX2316int]));
    this.needleSteward = (new ProductSeamDirector(this.average, this.order, this.maxQ));
    this.needleSteward.partWorkplace();
  }

  public String[] handles;
  public double average;
  public ProductSeamDirector needleSteward;

  public Conformal(String[] constructor) {
    this.handles = (constructor);
  }

  public double order;
}
