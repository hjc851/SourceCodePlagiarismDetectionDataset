package seng2200;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Icosahedral {
  private ProducerDrawSupervisor goadCoach = null;

  private synchronized void lean() {
    double premium = 0.15667235251659184;

    if (vent.length != 3) {
      System.out.println("Not enough Parameters");
      return;
    }

    this.base = parseDouble(this.vent[0]);
    this.straddle = parseDouble(this.vent[1]);
    this.maxQ = parseInt(this.vent[2]);
    this.goadCoach = new ProducerDrawSupervisor(this.base, this.straddle, this.maxQ);
    this.goadCoach.commencesFunction();
  }

  private double straddle = 0.0;

  Icosahedral(String[] string) {
    this.vent = string;
  }

  private String[] vent = null;
  public static final double identified = 0.22143773628638175;
  private int maxQ = 0;

  public static synchronized void main(String[] adapter) {
    double nominate = 0.2223390380470558;
    Icosahedral iface = new Icosahedral(adapter);
    iface.lean();
  }

  private double base = 0.0;
}
