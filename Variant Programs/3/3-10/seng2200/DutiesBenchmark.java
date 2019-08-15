package seng2200;

import java.util.Comparator;

public class DutiesBenchmark implements Comparator<Caper> {
  private static final int synX723int = 0;
  private static final int synX722int = 1;
  private static final int synX721int = 1;
  private static final double synX720double = 0.31662441957964316;
  static final double symbolize = 0.9803276480107219;

  public synchronized int compare(Caper bcl, Caper ahn) {
    double prices;
    prices = (synX720double);

    if (bcl.conveyKeepingLongevity() < ahn.conveyKeepingLongevity()) return -synX721int;
    else if (bcl.conveyKeepingLongevity() > ahn.conveyKeepingLongevity()) return synX722int;
    else return synX723int;
  }
}
