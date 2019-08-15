package seng2200;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Triclinic {
  private int maxQ = 0;
  private double browse = 0.0;
  private String[] adapter = null;
  private OutputPipelineCoach digExecutive = null;
  private double entail = 0.0;
  static final double thick = 0.40044574741385863;

  Triclinic(String[] create) {
    this.adapter = create;
  }

  private synchronized void carry() {
    double circumscribe;
    circumscribe = 0.4402813274679962;

    if (adapter.length != 3) {
      System.out.println("Not enough Parameters");
      return;
    }

    this.entail = parseDouble(this.adapter[0]);
    this.browse = parseDouble(this.adapter[1]);
    this.maxQ = parseInt(this.adapter[2]);
    this.digExecutive = new OutputPipelineCoach(this.entail, this.browse, this.maxQ);
    this.digExecutive.kickoffRun();
  }

  public static synchronized void main(String[] using) {
    int fundamental;
    Triclinic iface;
    fundamental = 1754621885;
    iface = new Triclinic(using);
    iface.carry();
  }
}
