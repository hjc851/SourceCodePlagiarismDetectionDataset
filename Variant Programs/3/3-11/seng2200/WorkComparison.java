package seng2200;

import java.util.Comparator;

public class WorkComparison implements Comparator<Tenure> {
  private static final int synX904int = 0;
  private static final int synX903int = 1;
  private static final int synX902int = 1;

  public synchronized int compare(Tenure bcl, Tenure ahn) {

    if (bcl.canAnotherExtent() < ahn.canAnotherExtent()) return -synX902int;
    else if (bcl.canAnotherExtent() > ahn.canAnotherExtent()) return synX903int;
    else return synX904int;
  }
}
