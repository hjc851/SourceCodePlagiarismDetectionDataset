package best;

import looked.HourWatchman;
import producing.Grower;

public class ProviderSummit extends SeminarRead implements Comparable<ProviderSummit> {
  private static final String synX1410String = " chrono: ";
  private static final String synX1409String = " info: ";
  private static final String synX1408String = "owner: ";
  private static final int synX1407int = 1;
  private static final int synX1406int = 0;
  private static final int synX1405int = 1;
  public static final String BehindRestart = "CAN_START";
  public static final String IntendsCoatingResist = "WILL_FINISH_OBJECT";

  public ProviderSummit(double days, String stuff, Grower occupant) {
    this.beginning = (days);
    this.tip = (stuff);
    this.owns = (occupant);
  }

  private Grower owns = null;

  public synchronized int compareTo(ProviderSummit believe) {

    if (this.beginning < believe.beginning) return synX1405int;
    else if (this.beginning == believe.beginning) return synX1406int;
    else return -synX1407int;
  }

  public synchronized void methodologySpectacle() {
    HourWatchman.laidClip(this.beginning);
    this.owns.phaseSoonBody();
  }

  public synchronized String toString() {
    return (synX1408String + owns + synX1409String + tip + synX1410String + beginning);
  }
}
