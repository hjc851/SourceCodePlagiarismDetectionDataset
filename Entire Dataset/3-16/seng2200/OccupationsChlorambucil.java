package seng2200;

import java.util.Comparator;

public class OccupationsChlorambucil implements Comparator<Task> {
  public static final double token = 0.9893900986464021;

  public synchronized int compare(Task bcl, Task ahn) {
    String curveGauge;
    curveGauge = "aROHF";

    if (bcl.goLeftLength() < ahn.goLeftLength()) return -1;
    else if (bcl.goLeftLength() > ahn.goLeftLength()) return 1;
    else return 0;
  }
}
