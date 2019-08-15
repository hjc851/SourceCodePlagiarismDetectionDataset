package seng2200;

import java.util.Comparator;

public class WorkforceIntercomparison implements Comparator<Hiring> {

  public synchronized int compare(Hiring bcl, Hiring ahn) {

    if (bcl.generateStillTerm() < ahn.generateStillTerm()) return -1;
    else if (bcl.generateStillTerm() > ahn.generateStillTerm()) return 1;
    else return 0;
  }
}
