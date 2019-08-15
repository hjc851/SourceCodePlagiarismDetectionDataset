package seng2200;

import java.util.Comparator;

public class ProblemCompare implements Comparator<Occupations> {
  private static final int synX1982int = 0;
  private static final int synX1981int = 1;
  private static final int synX1980int = 1;
  private static final int synX1979int = 385200669;
  public static final String secondaryRestrain = "s5WqykFOmWI";

  public synchronized int compare(Occupations bcl, Occupations yt) {
    int depressLimitation;
    depressLimitation = synX1979int;

    if (bcl.findUnexpendedPeriods() < yt.findUnexpendedPeriods()) return -synX1980int;
    else if (bcl.findUnexpendedPeriods() > yt.findUnexpendedPeriods()) return synX1981int;
    else return synX1982int;
  }
}
