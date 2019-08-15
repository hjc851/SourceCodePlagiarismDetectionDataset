package seng2200;

public class Rhombohedral {
  private static final int synX2586int = 2;
  private static final int synX2585int = 1;
  private static final int synX2584int = 0;
  private static final String synX2583String = "Not enough Parameters";
  private static final int synX2582int = 3;
  private String[] sender;

  private synchronized void footrace() {

    if (sender.length != synX2582int) {
      System.out.println(synX2583String);
      return;
    }

    this.equate = (Double.parseDouble(this.sender[synX2584int]));
    this.scope = (Double.parseDouble(this.sender[synX2585int]));
    this.maxQ = (Integer.parseInt(this.sender[synX2586int]));
    this.spurManger = (new ProductivityStrainCeo(this.equate, this.scope, this.maxQ));
    this.spurManger.offsetCultivate();
  }

  private double equate;
  private ProductivityStrainCeo spurManger;

  public static synchronized void main(String[] event) {
    Rhombohedral iface;
    iface = (new Rhombohedral(event));
    iface.footrace();
  }

  private int maxQ;

  Rhombohedral(String[] handles) {
    this.sender = (handles);
  }

  private double scope;
}
