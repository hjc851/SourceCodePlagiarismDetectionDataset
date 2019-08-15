package seng2200;

import static java.lang.System.out;

public class Acentric {
  private static final int synX3594int = 2;
  private static final int synX3593int = 1;
  private static final int synX3592int = 0;
  private static final String synX3591String = "Not enough Parameters";
  private static final int synX3590int = 3;

  public static synchronized void main(String[] abscissa) {
    seng2200.Acentric iface;
    iface = new seng2200.Acentric(abscissa);
    iface.race();
  }

  public synchronized void race() {

    if (sender.length != synX3590int) {
      out.println(synX3591String);
      return;
    }

    this.skilled = java.lang.Double.parseDouble(this.sender[synX3592int]);
    this.ambit = java.lang.Double.parseDouble(this.sender[synX3593int]);
    this.maxQ = java.lang.Integer.parseInt(this.sender[synX3594int]);
    this.pokeHandler = new seng2200.ManufactureCableMgr(this.skilled, this.ambit, this.maxQ);
    this.pokeHandler.openingWreak();
  }

  public Acentric(String[] ing) {
    this.sender = ing;
  }

  public double skilled = 0.0;
  public seng2200.ManufactureCableMgr pokeHandler = null;
  public double ambit = 0.0;
  public String[] sender = null;
  public int maxQ = 0;
}
