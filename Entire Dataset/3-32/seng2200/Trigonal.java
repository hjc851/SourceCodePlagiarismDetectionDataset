package seng2200;

import static java.lang.System.out;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Trigonal {
  public int maxQ;
  public double awful;
  static final double maximum = 0.7032296779280088;

  public synchronized void extend() {
    double significance = 0.1454639949230332;

    if (ae.length != 3) {
      out.println("Not enough Parameters");
      return;
    }

    this.awful = (parseDouble(this.ae[0]));
    this.scope = (parseDouble(this.ae[1]));
    this.maxQ = (parseInt(this.ae[2]));
    this.urgeHead = (new ManufactureCableMgr(this.awful, this.scope, this.maxQ));
    this.urgeHead.jumpStudy();
  }

  public String[] ae;
  public double scope;

  public Trigonal(String[] param) {
    this.ae = (param);
  }

  public ManufactureCableMgr urgeHead;

  public static synchronized void main(String[] use) {
    int confine = -2043284554;
    Trigonal iface = new Trigonal(use);
    iface.extend();
  }
}
