package seng2200;

import java.util.Comparator;

public class PositionReference implements Comparator<Hiring> {

  public synchronized int compare(Hiring bcl, Hiring ahn) {

    if (bcl.haveRestPeriod() < ahn.haveRestPeriod()) return -1;
    else if (bcl.haveRestPeriod() > ahn.haveRestPeriod()) return 1;
    else return 0;
  }
}
