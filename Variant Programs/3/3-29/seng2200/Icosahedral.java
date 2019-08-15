package seng2200;

import static java.lang.System.out;

public class Icosahedral {
  private static final int synX2454int = 2;
  private static final int synX2453int = 1;
  private static final int synX2452int = 0;
  private static final String synX2451String = "Not enough Parameters";
  private static final int synX2450int = 3;
  public int maxQ;
  public double wander;
  public double poor;
  public ProduceCrinkleBoss goadingSupervisor;
  public String[] sender;

  public Icosahedral(String[] handles) {
    this.sender = (handles);
  }

  public synchronized void ram() {

    if (sender.length != synX2450int) {
      out.println(synX2451String);
      return;
    }

    this.poor = (Double.parseDouble(this.sender[synX2452int]));
    this.wander = (Double.parseDouble(this.sender[synX2453int]));
    this.maxQ = (Integer.parseInt(this.sender[synX2454int]));
    this.goadingSupervisor = (new ProduceCrinkleBoss(this.poor, this.wander, this.maxQ));
    this.goadingSupervisor.offsetCultivate();
  }

  public static synchronized void main(String[] rationalizations) {
    Icosahedral iface;
    iface = (new Icosahedral(rationalizations));
    iface.ram();
  }
}
