package seng2200;

import static java.lang.System.out;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Chiral {
  private static final double synX3264double = 0.6816570211594547;
  private static final int synX3263int = 2;
  private static final int synX3262int = 1;
  private static final int synX3261int = 0;
  private static final String synX3260String = "Not enough Parameters";
  private static final int synX3259int = 3;
  private static final int synX3258int = 892485314;
  public static double number = 0.0238308465530499;
  public String[] handles = null;
  public seng2200.ProducersWrinkleManger spurManger = null;
  public double beggarly = 0.0;
  public double crop = 0.0;
  public int maxQ = 0;

  public Chiral(String[] string) {
    this.handles = (string);
  }

  public synchronized void carry() {
    int juniorConstrained = synX3258int;

    if (handles.length != synX3259int) {
      out.println(synX3260String);
      return;
    }

    this.beggarly = (parseDouble(this.handles[synX3261int]));
    this.crop = (parseDouble(this.handles[synX3262int]));
    this.maxQ = (parseInt(this.handles[synX3263int]));
    this.spurManger = (new seng2200.ProducersWrinkleManger(this.beggarly, this.crop, this.maxQ));
    this.spurManger.offsetCultivate();
  }

  public static synchronized void main(String[] create) {
    double desirability = synX3264double;
    seng2200.Chiral iface = new seng2200.Chiral(create);
    iface.carry();
  }
}
