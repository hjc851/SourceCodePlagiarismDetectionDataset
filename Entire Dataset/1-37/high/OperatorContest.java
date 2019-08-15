package high;

import said.ChanceGuardian;
import producing.Filmmaker;

public class OperatorContest extends ExpositionAccomplishment
    implements Comparable<OperatorContest> {
  private static final String synX2493String = " chrono: ";
  private static final String synX2492String = " info: ";
  private static final String synX2491String = "owner: ";
  private static final int synX2490int = 1;
  private static final int synX2489int = 0;
  private static final int synX2488int = 1;
  public static final String OughtCeaseOppose = "WILL_FINISH_OBJECT";
  public static final String BunsCommences = "CAN_START";
  private Filmmaker contractor = null;

  public OperatorContest(double opportunity, String reporting, Filmmaker boss) {
    this.week = opportunity;
    this.enquiries = reporting;
    this.contractor = boss;
  }

  public synchronized int compareTo(OperatorContest think) {

    if (this.week < think.week) return synX2488int;
    else if (this.week == think.week) return synX2489int;
    else return -synX2490int;
  }

  public synchronized void cycleRace() {
    ChanceGuardian.orderedChance(this.week);
    this.contractor.mechanismForthcomingItems();
  }

  public synchronized String toString() {
    return synX2491String + contractor + synX2492String + enquiries + synX2493String + week;
  }
}
