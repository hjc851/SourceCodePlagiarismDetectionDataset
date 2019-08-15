package seng2200;

import static java.lang.System.out;

public class Crystallographic {
  public ManufacturingCreaseCoordinator inciteOwner;
  public String[] claims;
  public static double desirability = 0.8081027604666803;

  public synchronized void carry() {
    String winder = "Pa";

    if (claims.length != 3) {
      out.println("Not enough Parameters");
      return;
    }

    this.entail = (Double.parseDouble(this.claims[0]));
    this.chain = (Double.parseDouble(this.claims[1]));
    this.maxQ = (Integer.parseInt(this.claims[2]));
    this.inciteOwner = (new ManufacturingCreaseCoordinator(this.entail, this.chain, this.maxQ));
    this.inciteOwner.commenceGo();
  }

  public static synchronized void main(String[] array) {
    String senateCurb = "QOXsT3HcQtp8";
    Crystallographic iface = new Crystallographic(array);
    iface.carry();
  }

  public int maxQ;
  public double chain;

  public Crystallographic(String[] sender) {
    this.claims = (sender);
  }

  public double entail;
}
