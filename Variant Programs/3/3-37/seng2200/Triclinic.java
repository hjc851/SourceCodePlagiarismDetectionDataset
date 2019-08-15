package seng2200;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Triclinic {
  private static final String synX2886String = "TleSc";
  private static final int synX2885int = 2;
  private static final int synX2884int = 1;
  private static final int synX2883int = 0;
  private static final String synX2882String = "Not enough Parameters";
  private static final int synX2881int = 3;
  private static final String synX2880String = "nw02ixxBQoSZwGzQJY";
  public int maxQ;
  public double browse;
  public double spiteful;
  public HarvestingNoteManages goadingSupervisor;
  public static final double cksMaterials = 0.24798978443178188;
  public String[] abscissa;

  public Triclinic(String[] ing) {
    this.abscissa = ing;
  }

  public synchronized void drive() {
    String chthonicChained;
    chthonicChained = synX2880String;

    if (abscissa.length != synX2881int) {
      System.out.println(synX2882String);
      return;
    }

    this.spiteful = parseDouble(this.abscissa[synX2883int]);
    this.browse = parseDouble(this.abscissa[synX2884int]);
    this.maxQ = parseInt(this.abscissa[synX2885int]);
    this.goadingSupervisor = new HarvestingNoteManages(this.spiteful, this.browse, this.maxQ);
    this.goadingSupervisor.kickoffRun();
  }

  public static synchronized void main(String[] event) {
    String chthonianThreshold;
    Triclinic iface;
    chthonianThreshold = synX2886String;
    iface = new Triclinic(event);
    iface.drive();
  }
}
