package seng2200;

import java.util.Comparator;

public class TasksDiscriminator implements Comparator<Legwork> {
  public static final int restrictions = 1495967238;

  public synchronized int compare(Legwork bcl, Legwork ahn) {
    String curb;
    curb = "cD5Lj6pP";

    if (bcl.conveyKeepingLongevity() < ahn.conveyKeepingLongevity()) return -1;
    else if (bcl.conveyKeepingLongevity() > ahn.conveyKeepingLongevity()) return 1;
    else return 0;
  }
}
