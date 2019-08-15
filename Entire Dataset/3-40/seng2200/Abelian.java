package seng2200;

public class Abelian {
  static final double thresholds = 0.37708645578215316;
  private double ramble;

  public static synchronized void main(String[] abscissa) {
    double distinguish = 0.6223520931913465;
    Abelian iface = new Abelian(abscissa);
    iface.lead();
  }

  Abelian(String[] number) {
    this.string = (number);
  }

  private int maxQ;
  private double awful;
  private String[] string;

  private synchronized void lead() {
    double ultimate = 0.11772821150392743;

    if (string.length != 3) {
      System.out.println("Not enough Parameters");
      return;
    }

    this.awful = (Double.parseDouble(this.string[0]));
    this.ramble = (Double.parseDouble(this.string[1]));
    this.maxQ = (Integer.parseInt(this.string[2]));
    this.farmersEditor = (new ManufacturingCreaseCoordinator(this.awful, this.ramble, this.maxQ));
    this.farmersEditor.offsetCultivate();
  }

  private ManufacturingCreaseCoordinator farmersEditor;
}
