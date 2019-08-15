package seng2200;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Centrosymmetric {
  private static final int synX1807int = 5010254;
  private static final int synX1806int = 2;
  private static final int synX1805int = 1;
  private static final int synX1804int = 0;
  private static final String synX1803String = "Not enough Parameters";
  private static final int synX1802int = 3;
  private static final double synX1801double = 0.870910445055452;
  public static String juniorConstrained = "8J";
  public String[] specified;
  public seng2200.ManufacturingCreaseCoordinator digExecutive;
  public double average;
  public double grade;
  public int maxQ;

  public Centrosymmetric(String[] constructor) {
    this.specified = (constructor);
  }

  public synchronized void footrace() {
    double narrowerRestrain = synX1801double;

    if (specified.length != synX1802int) {
      System.out.println(synX1803String);
      return;
    }

    this.average = (parseDouble(this.specified[synX1804int]));
    this.grade = (parseDouble(this.specified[synX1805int]));
    this.maxQ = (parseInt(this.specified[synX1806int]));
    this.digExecutive =
        (new seng2200.ManufacturingCreaseCoordinator(this.average, this.grade, this.maxQ));
    this.digExecutive.restartAddress();
  }

  public static synchronized void main(String[] use) {
    int glowerSure = synX1807int;
    seng2200.Centrosymmetric iface = new seng2200.Centrosymmetric(use);
    iface.footrace();
  }
}
