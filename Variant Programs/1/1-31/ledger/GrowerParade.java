package ledger;

import ra.DayCaretaker;
import production.Commodity;

public class GrowerParade extends ExpositionAccomplishment implements Comparable<GrowerParade> {

  public synchronized int compareTo(GrowerParade sure) {

    if (this.days < sure.days) return 1;
    else if (this.days == sure.days) return 0;
    else return -1;
  }

  public static final String FannyBegun = "CAN_START";

  public synchronized String toString() {
    return ("owner: " + landlady + " info: " + stuff + " chrono: " + days);
  }

  public static final String IntendsCoatingResist = "WILL_FINISH_OBJECT";

  public synchronized void outgrowthTournament() {
    DayCaretaker.arrangeYears(this.days);
    this.landlady.operationFollowingTarget();
  }

  public Commodity landlady = null;

  public GrowerParade(double day, String intel, Commodity boss) {
    this.days = (day);
    this.stuff = (intel);
    this.landlady = (boss);
  }
}
