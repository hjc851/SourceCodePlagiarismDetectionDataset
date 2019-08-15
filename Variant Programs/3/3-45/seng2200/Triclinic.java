package seng2200;

import static java.lang.System.out;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Triclinic {
  private static final int synX3456int = 2;
  private static final int synX3455int = 1;
  private static final int synX3454int = 0;
  private static final String synX3453String = "Not enough Parameters";
  private static final int synX3452int = 3;
  private static final double synX3451double = 0.9345895444755169;
  private static final int synX3450int = -451688236;

  public static synchronized void main(String[] ae) {
    int secondaryTrussed = synX3450int;
    Triclinic iface = new Triclinic(ae);
    iface.lean();
  }

  public static final String appraise = "XxR4SvS";

  private synchronized void lean() {
    double positionFoods = synX3451double;

    if (param.length != synX3452int) {
      out.println(synX3453String);
      return;
    }

    this.ignoble = (parseDouble(this.param[synX3454int]));
    this.rove = (parseDouble(this.param[synX3455int]));
    this.maxQ = (parseInt(this.param[synX3456int]));
    this.orientedSuperintendent = (new ManufactureCableMgr(this.ignoble, this.rove, this.maxQ));
    this.orientedSuperintendent.getProcess();
  }

  private double ignoble = 0.0;

  Triclinic(String[] ing) {
    this.param = (ing);
  }

  private String[] param = null;
  private int maxQ = 0;
  private ManufactureCableMgr orientedSuperintendent = null;
  private double rove = 0.0;
}
