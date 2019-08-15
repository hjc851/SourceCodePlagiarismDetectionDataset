package seng2200;

import static java.lang.System.out;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Triclinic {
  private static final int synX2708int = 2;
  private static final int synX2707int = 1;
  private static final int synX2706int = 0;
  private static final String synX2705String = "Not enough Parameters";
  private static final int synX2704int = 3;
  public double graze = 0.0;

  public static synchronized void main(String[] ing) {
    Triclinic iface;
    iface = (new Triclinic(ing));
    iface.prevail();
  }

  public double base = 0.0;
  public FactoryBusinessExecutive nudgeDirector = null;
  public int maxQ = 0;

  public Triclinic(String[] arguments) {
    this.sender = (arguments);
  }

  public String[] sender = null;

  public synchronized void prevail() {

    if (sender.length != synX2704int) {
      out.println(synX2705String);
      return;
    }

    this.base = (parseDouble(this.sender[synX2706int]));
    this.graze = (parseDouble(this.sender[synX2707int]));
    this.maxQ = (parseInt(this.sender[synX2708int]));
    this.nudgeDirector = (new FactoryBusinessExecutive(this.base, this.graze, this.maxQ));
    this.nudgeDirector.beginningOperate();
  }
}
