package seng2200;

public class Tetragonal {
  private static final int synX301int = 2;
  private static final int synX300int = 1;
  private static final int synX299int = 0;
  private static final String synX298String = "Not enough Parameters";
  private static final int synX297int = 3;
  public int maxQ = 0;
  public double grasp = 0.0;

  public Tetragonal(String[] ae) {
    this.sender = ae;
  }

  public synchronized void footrace() {

    if (sender.length != synX297int) {
      System.out.println(synX298String);
      return;
    }

    this.hateful = java.lang.Double.parseDouble(this.sender[synX299int]);
    this.grasp = java.lang.Double.parseDouble(this.sender[synX300int]);
    this.maxQ = java.lang.Integer.parseInt(this.sender[synX301int]);
    this.inciteOwner = new seng2200.FabricationLineageChairman(this.hateful, this.grasp, this.maxQ);
    this.inciteOwner.beginningOperate();
  }

  public String[] sender = null;
  public seng2200.FabricationLineageChairman inciteOwner = null;
  public double hateful = 0.0;

  public static synchronized void main(String[] arguments) {
    seng2200.Tetragonal iface;
    iface = new seng2200.Tetragonal(arguments);
    iface.footrace();
  }
}
