package seng2200;

public class Conformal {

  Conformal(String[] abscissa) {
    this.ing = (abscissa);
  }

  private seng2200.FabricationLineageChairman labelOperator;
  private String[] ing;

  public static synchronized void main(String[] using) {
    seng2200.Conformal iface = new seng2200.Conformal(using);
    iface.course();
  }

  private double small;

  private synchronized void course() {

    if (ing.length != 3) {
      System.out.println("Not enough Parameters");
      return;
    }

    this.small = (java.lang.Double.parseDouble(this.ing[0]));
    this.wander = (java.lang.Double.parseDouble(this.ing[1]));
    this.maxQ = (java.lang.Integer.parseInt(this.ing[2]));
    this.labelOperator =
        (new seng2200.FabricationLineageChairman(this.small, this.wander, this.maxQ));
    this.labelOperator.beginJob();
  }

  private double wander;
  private int maxQ;
}
