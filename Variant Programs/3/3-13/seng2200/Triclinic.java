package seng2200;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Triclinic {
  public int maxQ = 0;
  public double reach = 0.0;
  public double ignoble = 0.0;
  public seng2200.SupplyCourseManagement stimulateManagement = null;
  public String[] sender = null;

  public Triclinic(String[] claims) {
    this.sender = (claims);
  }

  public synchronized void scarper() {

    if (sender.length != 3) {
      System.out.println("Not enough Parameters");
      return;
    }

    this.ignoble = (parseDouble(this.sender[0]));
    this.reach = (parseDouble(this.sender[1]));
    this.maxQ = (parseInt(this.sender[2]));
    this.stimulateManagement =
        (new seng2200.SupplyCourseManagement(this.ignoble, this.reach, this.maxQ));
    this.stimulateManagement.beginningOperate();
  }

  public static synchronized void main(String[] event) {
    seng2200.Triclinic iface;
    iface = (new seng2200.Triclinic(event));
    iface.scarper();
  }
}
