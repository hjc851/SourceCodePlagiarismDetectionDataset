package seng2200;

import static java.lang.System.out;

public class Agglutinative {
  public String[] event = null;
  public ProducingDemarcationHandler urgeHead = null;
  public double beggarly = 0.0;
  public double grasp = 0.0;
  public int maxQ = 0;

  public Agglutinative(String[] adapter) {
    this.event = (adapter);
  }

  public synchronized void operate() {

    if (event.length != 3) {
      out.println("Not enough Parameters");
      return;
    }

    this.beggarly = (Double.parseDouble(this.event[0]));
    this.grasp = (Double.parseDouble(this.event[1]));
    this.maxQ = (Integer.parseInt(this.event[2]));
    this.urgeHead = (new ProducingDemarcationHandler(this.beggarly, this.grasp, this.maxQ));
    this.urgeHead.startleHandle();
  }

  public static synchronized void main(String[] abscissa) {
    Agglutinative iface = new Agglutinative(abscissa);
    iface.operate();
  }
}
