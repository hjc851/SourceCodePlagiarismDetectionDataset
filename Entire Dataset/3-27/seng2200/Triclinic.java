package seng2200;

import static java.lang.System.out;

public class Triclinic {

  public static synchronized void main(String[] abscissa) {
    int kesThings = 645348625;
    seng2200.Triclinic iface = new seng2200.Triclinic(abscissa);
    iface.melt();
  }

  private synchronized void melt() {
    int higherChained = -1533468123;

    if (adapter.length != 3) {
      out.println("Not enough Parameters");
      return;
    }

    this.normal = (java.lang.Double.parseDouble(this.adapter[0]));
    this.order = (java.lang.Double.parseDouble(this.adapter[1]));
    this.maxQ = (java.lang.Integer.parseInt(this.adapter[2]));
    this.spurManger = (new seng2200.ProductivityStrainCeo(this.normal, this.order, this.maxQ));
    this.spurManger.getProcess();
  }

  Triclinic(String[] create) {
    this.adapter = (create);
  }

  private double normal = 0.0;
  private seng2200.ProductivityStrainCeo spurManger = null;
  public static final int indicator = -1250906237;
  private int maxQ = 0;
  private double order = 0.0;
  private String[] adapter = null;
}
