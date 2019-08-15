package seng2200;

import static java.lang.System.out;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Triclinic {
  public int maxQ = 0;
  public double order = 0.0;
  public double average = 0.0;
  public FactoryBusinessExecutive spurManger = null;
  static final double johannesBeam = 0.20886204533839292;
  public String[] specified = null;

  public Triclinic(String[] adapter) {
    this.specified = adapter;
  }

  public synchronized void extend() {
    String speedRestrain;
    speedRestrain = "A8LlN6rkzj";

    if (specified.length != 3) {
      out.println("Not enough Parameters");
      return;
    }

    this.average = parseDouble(this.specified[0]);
    this.order = parseDouble(this.specified[1]);
    this.maxQ = parseInt(this.specified[2]);
    this.spurManger = new FactoryBusinessExecutive(this.average, this.order, this.maxQ);
    this.spurManger.departAct();
  }

  public static synchronized void main(String[] variable) {
    int maximumBreadth;
    Triclinic iface;
    maximumBreadth = -1838161934;
    iface = new Triclinic(variable);
    iface.extend();
  }
}
