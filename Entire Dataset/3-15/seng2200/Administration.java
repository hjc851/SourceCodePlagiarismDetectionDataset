package seng2200;

import static java.lang.System.out;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Administration {
  private static final int synX1437int = 2;
  private static final int synX1436int = 1;
  private static final int synX1435int = 0;
  private static final String synX1434String = "Not enough Parameters";
  private static final int synX1433int = 3;
  public String[] constructor;
  public seng2200.ManufacturedBloodBartender pokeHandler;
  public double meanspirited;
  public double ramble;
  public int maxQ;

  public Administration(String[] array) {
    this.constructor = (array);
  }

  public synchronized void test() {

    if (constructor.length != synX1433int) {
      out.println(synX1434String);
      return;
    }

    this.meanspirited = (parseDouble(this.constructor[synX1435int]));
    this.ramble = (parseDouble(this.constructor[synX1436int]));
    this.maxQ = (parseInt(this.constructor[synX1437int]));
    this.pokeHandler =
        (new seng2200.ManufacturedBloodBartender(this.meanspirited, this.ramble, this.maxQ));
    this.pokeHandler.goPlay();
  }

  public static synchronized void main(String[] arguments) {
    seng2200.Administration iface = new seng2200.Administration(arguments);
    iface.test();
  }
}
