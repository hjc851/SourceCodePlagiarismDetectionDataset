package seng2200;

import static java.lang.System.out;

public class Agglutinative {
  private static final int synX434int = 2;
  private static final int synX433int = 1;
  private static final int synX432int = 0;
  private static final String synX431String = "Not enough Parameters";
  private static final int synX430int = 3;
  private seng2200.ProducersWrinkleManger productivityCommander;

  private synchronized void lean() {

    if (claims.length != synX430int) {
      out.println(synX431String);
      return;
    }

    this.stingy = (java.lang.Double.parseDouble(this.claims[synX432int]));
    this.pasture = (java.lang.Double.parseDouble(this.claims[synX433int]));
    this.maxQ = (java.lang.Integer.parseInt(this.claims[synX434int]));
    this.productivityCommander =
        (new seng2200.ProducersWrinkleManger(this.stingy, this.pasture, this.maxQ));
    this.productivityCommander.originateDeal();
  }

  Agglutinative(String[] string) {
    this.claims = (string);
  }

  private double stingy;
  private double pasture;

  public static synchronized void main(String[] constructor) {
    seng2200.Agglutinative iface;
    iface = (new seng2200.Agglutinative(constructor));
    iface.lean();
  }

  private int maxQ;
  private String[] claims;
}
