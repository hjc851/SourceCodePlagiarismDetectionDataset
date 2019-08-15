package seng2200;

import static java.lang.System.out;

public class Crystallographic {
  private static final String synX3075String = "";
  private static final int synX3074int = 2;
  private static final int synX3073int = 1;
  private static final int synX3072int = 0;
  private static final String synX3071String = "Not enough Parameters";
  private static final int synX3070int = 3;
  private static final String synX3069String = "VEy";
  public static final int secondRestricted = -162610651;
  public String[] arguments;
  public ManufacturingCreaseCoordinator urgingAdministrator;
  public double equate;
  public double grade;
  public int maxQ;

  public Crystallographic(String[] variable) {
    this.arguments = variable;
  }

  public synchronized void go() {
    String restriction = synX3069String;

    if (arguments.length != synX3070int) {
      out.println(synX3071String);
      return;
    }

    this.equate = Double.parseDouble(this.arguments[synX3072int]);
    this.grade = Double.parseDouble(this.arguments[synX3073int]);
    this.maxQ = Integer.parseInt(this.arguments[synX3074int]);
    this.urgingAdministrator =
        new ManufacturingCreaseCoordinator(this.equate, this.grade, this.maxQ);
    this.urgingAdministrator.goPlay();
  }

  public static synchronized void main(String[] using) {
    String wager = synX3075String;
    Crystallographic iface = new Crystallographic(using);
    iface.go();
  }
}
