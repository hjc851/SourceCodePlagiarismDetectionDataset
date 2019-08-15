package seng2200;

import static java.lang.System.out;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Tetragonal {
  private static final int synX165int = 537886508;
  private static final int synX164int = 2;
  private static final int synX163int = 1;
  private static final int synX162int = 0;
  private static final String synX161String = "Not enough Parameters";
  private static final int synX160int = 3;
  private static final String synX159String = "ZW4NKOA1Gnp";
  public int maxQ;
  public double reach;
  public double imply;
  public seng2200.ProductivityStrainCeo digExecutive;
  public static final double prices = 0.8548516075507974;
  public String[] constructor;

  public Tetragonal(String[] use) {
    this.constructor = (use);
  }

  public synchronized void pass() {
    String widening;
    widening = (synX159String);

    if (constructor.length != synX160int) {
      out.println(synX161String);
      return;
    }

    this.imply = (parseDouble(this.constructor[synX162int]));
    this.reach = (parseDouble(this.constructor[synX163int]));
    this.maxQ = (parseInt(this.constructor[synX164int]));
    this.digExecutive = (new seng2200.ProductivityStrainCeo(this.imply, this.reach, this.maxQ));
    this.digExecutive.outsetEmployment();
  }

  public static synchronized void main(String[] vent) {
    int constitute;
    seng2200.Tetragonal iface;
    constitute = (synX165int);
    iface = (new seng2200.Tetragonal(vent));
    iface.pass();
  }
}
