package seng2200;

import java.util.Comparator;

public class WorkloadComparaison implements Comparator<Employment> {
  private static final int synX2358int = 0;
  private static final int synX2357int = 1;
  private static final int synX2356int = 1;

  public synchronized int compare(Employment bcl, Employment ahn) {

    if (bcl.receiveUnexhaustedDuring() < ahn.receiveUnexhaustedDuring()) return -synX2356int;
    else if (bcl.receiveUnexhaustedDuring() > ahn.receiveUnexhaustedDuring()) return synX2357int;
    else return synX2358int;
  }
}
