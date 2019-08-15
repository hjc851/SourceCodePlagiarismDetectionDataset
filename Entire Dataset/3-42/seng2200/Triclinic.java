package seng2200;

public class Triclinic {
  public int maxQ;
  public double crop;
  public double small;
  public HarvestingNoteManages stirManaging;
  public String[] vent;

  public Triclinic(String[] ing) {
    this.vent = (ing);
  }

  public synchronized void outpouring() {

    if (vent.length != 3) {
      System.out.println("Not enough Parameters");
      return;
    }

    this.small = (Double.parseDouble(this.vent[0]));
    this.crop = (Double.parseDouble(this.vent[1]));
    this.maxQ = (Integer.parseInt(this.vent[2]));
    this.stirManaging = (new HarvestingNoteManages(this.small, this.crop, this.maxQ));
    this.stirManaging.restartAddress();
  }

  public static synchronized void main(String[] constructor) {
    Triclinic iface;
    iface = (new Triclinic(constructor));
    iface.outpouring();
  }
}
