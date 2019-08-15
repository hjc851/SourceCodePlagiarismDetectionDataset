package read;

import jazzy.WhenGuard;
import producing.Manufacturer;

public class CommodityRace extends GalaTape implements Comparable<CommodityRace> {

  public CommodityRace(double opportunity, String media, Manufacturer property) {
    this.month = opportunity;
    this.update = media;
    this.manager = property;
  }

  public synchronized String toString() {
    return "owner: " + manager + " info: " + update + " chrono: " + month;
  }

  public Manufacturer manager;

  public synchronized void appendageSymposium() {
    WhenGuard.arrangedSentence(this.month);
    this.manager.serveFirstSubject();
  }

  public static final String BequeathCloseArtifact = "WILL_FINISH_OBJECT";
  public static final String JohnPart = "CAN_START";

  public synchronized int compareTo(CommodityRace certain) {

    if (this.month < certain.month) return 1;
    else if (this.month == certain.month) return 0;
    else return -1;
  }
}
