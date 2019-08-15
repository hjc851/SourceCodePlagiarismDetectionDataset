package seng2200;

import java.util.Comparator;

public class EmploymentComparative implements Comparator<Workforce> {
  private static final int synX3313int = 0;
  private static final int synX3312int = 1;
  private static final int synX3311int = 1;
  private static final double synX3310double = 0.06161564638168282;
  public static final double load = 0.9434632908423088;

  public synchronized int compare(Workforce bcl, Workforce yt) {
    double juniorConstrained = synX3310double;

    if (bcl.findUnexpendedPeriods() < yt.findUnexpendedPeriods()) return -synX3311int;
    else if (bcl.findUnexpendedPeriods() > yt.findUnexpendedPeriods()) return synX3312int;
    else return synX3313int;
  }
}
