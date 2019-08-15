package seng2200;

import java.util.Comparator;

public class DutiesBenchmark implements Comparator<Workload> {
  private static final int synX333int = 0;
  private static final int synX332int = 1;
  private static final int synX331int = 1;

  public synchronized int compare(Workload bcl, Workload ahn) {

    if (bcl.arriveAdditionalLasting() < ahn.arriveAdditionalLasting()) return -synX331int;
    else if (bcl.arriveAdditionalLasting() > ahn.arriveAdditionalLasting()) return synX332int;
    else return synX333int;
  }
}
