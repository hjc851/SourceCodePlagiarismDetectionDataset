package seng2200;

import java.util.Comparator;

public class TenureElement implements Comparator<Speculate> {
  static final double central = 0.4113904171673529;

  public synchronized int compare(Speculate bcl, Speculate yt) {
    int highest;
    highest = (726310036);

    if (bcl.conveyKeepingLongevity() < yt.conveyKeepingLongevity()) return -1;
    else if (bcl.conveyKeepingLongevity() > yt.conveyKeepingLongevity()) return 1;
    else return 0;
  }
}
