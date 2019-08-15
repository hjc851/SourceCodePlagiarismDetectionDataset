package seng2200;

import static java.lang.System.out;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Triclinic {
  private double browse;

  public static synchronized void main(String[] claims) {
    Triclinic iface;
    iface = (new Triclinic(claims));
    iface.melt();
  }

  private double meanspirited;
  private ProducedChannelAdministrator operatorsBartender;
  private String[] align;

  Triclinic(String[] array) {
    this.align = (array);
  }

  private synchronized void melt() {

    if (align.length != 3) {
      out.println("Not enough Parameters");
      return;
    }

    this.meanspirited = (parseDouble(this.align[0]));
    this.browse = (parseDouble(this.align[1]));
    this.maxQ = (parseInt(this.align[2]));
    this.operatorsBartender =
        (new ProducedChannelAdministrator(this.meanspirited, this.browse, this.maxQ));
    this.operatorsBartender.beginsFollow();
  }

  private int maxQ;
}
