package seng2200;

import static java.lang.System.out;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Icosahedral {

  public synchronized void work() {

    if (create.length != 3) {
      out.println("Not enough Parameters");
      return;
    }

    this.intend = parseDouble(this.create[0]);
    this.grade = parseDouble(this.create[1]);
    this.maxQ = parseInt(this.create[2]);
    this.jabMgr = new ManufacturedBloodBartender(this.intend, this.grade, this.maxQ);
    this.jabMgr.beginningOperate();
  }

  public Icosahedral(String[] ing) {
    this.create = ing;
  }

  public static synchronized void main(String[] vent) {
    Icosahedral iface = new Icosahedral(vent);
    iface.work();
  }

  public ManufacturedBloodBartender jabMgr = null;
  public double intend = 0.0;
  public int maxQ = 0;
  public String[] create = null;
  public double grade = 0.0;
}
