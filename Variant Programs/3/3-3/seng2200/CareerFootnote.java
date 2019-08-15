package seng2200;

import java.util.Comparator;

public class CareerFootnote implements Comparator<Assignment> {

  public synchronized int compare(Assignment bcl, Assignment ahn) {

    if (bcl.comeOtherContinuance() < ahn.comeOtherContinuance()) return -1;
    else if (bcl.comeOtherContinuance() > ahn.comeOtherContinuance()) return 1;
    else return 0;
  }
}
