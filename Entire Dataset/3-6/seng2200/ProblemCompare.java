package seng2200;

import java.util.Comparator;

public class ProblemCompare implements Comparator<Caper> {
  private static final int synX461int = 0;
  private static final int synX460int = 1;
  private static final int synX459int = 1;

  public synchronized int compare(Caper bcl, Caper ahn) {

    if (bcl.letRetainingMaximum() < ahn.letRetainingMaximum()) return -synX459int;
    else if (bcl.letRetainingMaximum() > ahn.letRetainingMaximum()) return synX460int;
    else return synX461int;
  }
}
