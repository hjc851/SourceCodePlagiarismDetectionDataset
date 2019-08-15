package seng2200;

import java.util.Comparator;

public class EmployerMatching implements Comparator<Assignments> {
  private static final int synX1473int = 0;
  private static final int synX1472int = 1;
  private static final int synX1471int = 1;
  private static final double synX1470double = 0.7714804038689937;

  public synchronized int compare(Assignments bcl, Assignments yt) {
    double constrained = synX1470double;

    if (bcl.findUnexpendedPeriods() < yt.findUnexpendedPeriods()) return -synX1471int;
    else if (bcl.findUnexpendedPeriods() > yt.findUnexpendedPeriods()) return synX1472int;
    else return synX1473int;
  }

  public static final double fukkianeseHeight = 0.24666005602233132;
}
