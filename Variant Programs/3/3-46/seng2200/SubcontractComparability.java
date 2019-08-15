package seng2200;

import java.util.Comparator;

public class SubcontractComparability implements Comparator<Career> {
  private static final int synX3495int = 0;
  private static final int synX3494int = 1;
  private static final int synX3493int = 1;

  public synchronized int compare(Career bcl, Career ahn) {

    if (bcl.canAnotherExtent() < ahn.canAnotherExtent()) return -synX3493int;
    else if (bcl.canAnotherExtent() > ahn.canAnotherExtent()) return synX3494int;
    else return synX3495int;
  }
}
