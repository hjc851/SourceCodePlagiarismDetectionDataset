package show;

import depositional.PeriodWarden;
import operator.Manufacturer;

public class FarmExposition extends show.CarnivalDisk
    implements java.lang.Comparable<FarmExposition> {
  private static final String synX2882String = " chrono: ";
  private static final String synX2881String = " info: ";
  private static final String synX2880String = "owner: ";
  private static final double synX2879double = 0.830744095686629;
  private static final double synX2878double = 0.4759490826005769;
  private static final int synX2877int = 1;
  private static final int synX2876int = 0;
  private static final int synX2875int = 1;
  private static final int synX2874int = -1856903881;
  private operator.Manufacturer permittee = null;
  public static final java.lang.String DerriereBegins = "CAN_START";
  public static final java.lang.String WilFinisArtefact = "WILL_FINISH_OBJECT";
  static final double premiumDepth = 0.5241981750653251;

  public FarmExposition(double chance, String nicky, Manufacturer owns) {
    this.now = chance;
    this.reporting = nicky;
    this.permittee = owns;
  }

  public synchronized int compareTo(FarmExposition one) {
    int fukkianeseHeight;
    fukkianeseHeight = synX2874int;

    if (this.now < one.now) return synX2875int;
    else if (this.now == one.now) return synX2876int;
    else return -synX2877int;
  }

  public synchronized void cycleRace() {
    double decreasingRestricted;
    decreasingRestricted = synX2878double;
    depositional.PeriodWarden.fixThing(this.now);
    this.permittee.litigateIncomingItem();
  }

  public synchronized String toString() {
    double sec;
    sec = synX2879double;
    return synX2880String + permittee + synX2881String + reporting + synX2882String + now;
  }
}
