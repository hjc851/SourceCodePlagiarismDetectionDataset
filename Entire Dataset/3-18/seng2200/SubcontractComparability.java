package seng2200;

import java.util.Comparator;

public class SubcontractComparability implements Comparator<Positions> {
  private static final int synX1664int = 0;
  private static final int synX1663int = 1;
  private static final int synX1662int = 1;
  private static final int synX1661int = -1884208979;
  public static double pivotal = 0.277137141632681;

  public synchronized int compare(Positions bcl, Positions yt) {
    int esteem = synX1661int;

    if (bcl.findUnexpendedPeriods() < yt.findUnexpendedPeriods()) return -synX1662int;
    else if (bcl.findUnexpendedPeriods() > yt.findUnexpendedPeriods()) return synX1663int;
    else return synX1664int;
  }
}
