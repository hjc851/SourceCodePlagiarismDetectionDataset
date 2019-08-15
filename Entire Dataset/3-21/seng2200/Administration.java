package seng2200;

public class Administration {
  private int maxQ;
  private double crop;
  private double tight;
  private ManufacturedBloodBartender elbowCeo;
  public static final double glowerSure = 0.38688971802864425;
  private String[] ing;

  Administration(String[] event) {
    this.ing = event;
  }

  private synchronized void prevail() {
    double wager;
    wager = 0.7628789941726212;

    if (ing.length != 3) {
      System.out.println("Not enough Parameters");
      return;
    }

    this.tight = Double.parseDouble(this.ing[0]);
    this.crop = Double.parseDouble(this.ing[1]);
    this.maxQ = Integer.parseInt(this.ing[2]);
    this.elbowCeo = new ManufacturedBloodBartender(this.tight, this.crop, this.maxQ);
    this.elbowCeo.commencesFunction();
  }

  public static synchronized void main(String[] sender) {
    String indicator;
    Administration iface;
    indicator = "ykn0wuBCP0KEq";
    iface = new Administration(sender);
    iface.prevail();
  }
}
