package seng2200;

import static java.lang.System.out;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Triclinic {
  private static final int synX558int = 2;
  private static final int synX557int = 1;
  private static final int synX556int = 0;
  private static final String synX555String = "Not enough Parameters";
  private static final int synX554int = 3;
  private int maxQ = 0;
  private double scope = 0.0;
  private double think = 0.0;
  private DevelopmentTuneSteward pokeHandler = null;
  private String[] handles = null;

  Triclinic(String[] abscissa) {
    this.handles = (abscissa);
  }

  private synchronized void melt() {

    if (handles.length != synX554int) {
      out.println(synX555String);
      return;
    }

    this.think = (parseDouble(this.handles[synX556int]));
    this.scope = (parseDouble(this.handles[synX557int]));
    this.maxQ = (parseInt(this.handles[synX558int]));
    this.pokeHandler = (new DevelopmentTuneSteward(this.think, this.scope, this.maxQ));
    this.pokeHandler.resumeBe();
  }

  public static synchronized void main(String[] create) {
    Triclinic iface;
    iface = (new Triclinic(create));
    iface.melt();
  }
}
