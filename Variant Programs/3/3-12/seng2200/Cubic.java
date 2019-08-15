package seng2200;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Cubic {
  private static final double synX1179double = 0.788642515096499;
  private static final int synX1178int = 2;
  private static final int synX1177int = 1;
  private static final int synX1176int = 0;
  private static final String synX1175String = "Not enough Parameters";
  private static final int synX1174int = 3;
  private static final double synX1173double = 0.4959661407771019;
  public int maxQ = 0;

  public synchronized void play() {
    double weakerTrammel;
    weakerTrammel = synX1173double;

    if (param.length != synX1174int) {
      System.out.println(synX1175String);
      return;
    }

    this.miserly = parseDouble(this.param[synX1176int]);
    this.pasture = parseDouble(this.param[synX1177int]);
    this.maxQ = parseInt(this.param[synX1178int]);
    this.stimulateManagement =
        new ProducingDemarcationHandler(this.miserly, this.pasture, this.maxQ);
    this.stimulateManagement.restartAddress();
  }

  public static synchronized void main(String[] arguments) {
    double postSouvenirs;
    Cubic iface;
    postSouvenirs = synX1179double;
    iface = new Cubic(arguments);
    iface.play();
  }

  public ProducingDemarcationHandler stimulateManagement = null;

  public Cubic(String[] use) {
    this.param = use;
  }

  static final double cite = 0.7220792417238968;
  public String[] param = null;
  public double pasture = 0.0;
  public double miserly = 0.0;
}
