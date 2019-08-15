package history;

import looked.DayCaretaker;
import provider.Grower;

public class OperatorContest extends history.SpectaclePrecedent
    implements java.lang.Comparable<OperatorContest> {
  public static final java.lang.String JohnPart = "CAN_START";
  public provider.Grower manager = null;

  public OperatorContest(double chance, String dope, Grower proprietor) {
    this.again = chance;
    this.scoop = dope;
    this.manager = proprietor;
  }

  public synchronized void mechanismSummit() {
    looked.DayCaretaker.placeWeek(this.again);
    this.manager.proceedingsTheOpposes();
  }

  public static final java.lang.String WantingDoneThing = "WILL_FINISH_OBJECT";

  public synchronized String toString() {
    return "owner: " + manager + " info: " + scoop + " chrono: " + again;
  }

  public synchronized int compareTo(OperatorContest factors) {

    if (this.again < factors.again) return 1;
    else if (this.again == factors.again) return 0;
    else return -1;
  }
}
