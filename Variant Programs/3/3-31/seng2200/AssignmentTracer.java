package seng2200;

import java.util.Comparator;

public class AssignmentTracer implements Comparator<Unemployed> {
  private static final int synX2481int = 0;
  private static final int synX2480int = 1;
  private static final int synX2479int = 1;

  public synchronized int compare(Unemployed bcl, Unemployed yt) {

    if (bcl.arriveAdditionalLasting() < yt.arriveAdditionalLasting()) return -synX2479int;
    else if (bcl.arriveAdditionalLasting() > yt.arriveAdditionalLasting()) return synX2480int;
    else return synX2481int;
  }
}
