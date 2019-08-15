package seng2200;

import static java.lang.System.out;

public class Cubic {
  private static final int synX684int = 2;
  private static final int synX683int = 1;
  private static final int synX682int = 0;
  private static final String synX681String = "Not enough Parameters";
  private static final int synX680int = 3;
  public seng2200.DeliveryDescentCommander inciteOwner = null;
  public String[] variable = null;
  public double stingy = 0.0;

  public static synchronized void main(String[] use) {
    seng2200.Cubic iface;
    iface = (new seng2200.Cubic(use));
    iface.lead();
  }

  public int maxQ = 0;

  public synchronized void lead() {

    if (variable.length != synX680int) {
      out.println(synX681String);
      return;
    }

    this.stingy = (java.lang.Double.parseDouble(this.variable[synX682int]));
    this.grade = (java.lang.Double.parseDouble(this.variable[synX683int]));
    this.maxQ = (java.lang.Integer.parseInt(this.variable[synX684int]));
    this.inciteOwner = (new seng2200.DeliveryDescentCommander(this.stingy, this.grade, this.maxQ));
    this.inciteOwner.kickoffRun();
  }

  public double grade = 0.0;

  public Cubic(String[] handles) {
    this.variable = (handles);
  }
}
