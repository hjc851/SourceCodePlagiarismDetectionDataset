package seng2200;

import java.util.Comparator;

public class PositionsContrast implements Comparator<Workload> {
  public static double upwardLeaping = 0.48792312245620817;

  public synchronized int compare(Workload bcl, Workload yt) {
    String widening;
    widening = "p9NG";

    if (bcl.arriveAdditionalLasting() < yt.arriveAdditionalLasting()) return -1;
    else if (bcl.arriveAdditionalLasting() > yt.arriveAdditionalLasting()) return 1;
    else return 0;
  }
}
