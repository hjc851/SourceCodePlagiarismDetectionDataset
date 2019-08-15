package seng2200;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Orthorhombic {
  private static final String synX3774String = "gqyJKZhB";
  private static final int synX3773int = 2;
  private static final int synX3772int = 1;
  private static final int synX3771int = 0;
  private static final String synX3770String = "Not enough Parameters";
  private static final int synX3769int = 3;
  private static final int synX3768int = 1998177973;
  public static final double lessRestrict = 0.5023963337021002;
  public String[] number;
  public seng2200.FactoryBusinessExecutive labelOperator;
  public double spiteful;
  public double rank;
  public int maxQ;

  public Orthorhombic(String[] ae) {
    this.number = ae;
  }

  public synchronized void go() {
    int discover = synX3768int;

    if (number.length != synX3769int) {
      System.out.println(synX3770String);
      return;
    }

    this.spiteful = parseDouble(this.number[synX3771int]);
    this.rank = parseDouble(this.number[synX3772int]);
    this.maxQ = parseInt(this.number[synX3773int]);
    this.labelOperator = new seng2200.FactoryBusinessExecutive(this.spiteful, this.rank, this.maxQ);
    this.labelOperator.earlyCover();
  }

  public static synchronized void main(String[] abscissa) {
    String matt = synX3774String;
    seng2200.Orthorhombic iface = new seng2200.Orthorhombic(abscissa);
    iface.go();
  }
}
