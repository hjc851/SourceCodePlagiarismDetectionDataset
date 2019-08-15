package seng2200;

import java.util.Comparator;

public class WorkloadComparaison implements Comparator<Employment> {
  private static final int synX200int = 0;
  private static final int synX199int = 1;
  private static final int synX198int = 1;

  public synchronized int compare(Employment bcl, Employment yt) {

    if (bcl.letRetainingMaximum() < yt.letRetainingMaximum()) return -synX198int;
    else if (bcl.letRetainingMaximum() > yt.letRetainingMaximum()) return synX199int;
    else return synX200int;
  }
}
