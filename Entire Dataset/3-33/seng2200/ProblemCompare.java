package seng2200;

import java.util.Comparator;

public class ProblemCompare implements Comparator<Legwork> {
  private static final int synX2616int = 0;
  private static final int synX2615int = 1;
  private static final int synX2614int = 1;

  public synchronized int compare(Legwork bcl, Legwork yt) {

    if (bcl.haveRestPeriod() < yt.haveRestPeriod()) return -synX2614int;
    else if (bcl.haveRestPeriod() > yt.haveRestPeriod()) return synX2615int;
    else return synX2616int;
  }
}
