package seng2200;

import java.util.Comparator;

public class OccupationsChlorambucil implements Comparator<Problem> {

  public synchronized int compare(Problem bcl, Problem ahn) {

    if (bcl.comeOtherContinuance() < ahn.comeOtherContinuance()) return -1;
    else if (bcl.comeOtherContinuance() > ahn.comeOtherContinuance()) return 1;
    else return 0;
  }
}
