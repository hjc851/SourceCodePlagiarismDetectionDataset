package seng2200;

import java.util.Comparator;

public class WorkloadComparaison implements Comparator<Career> {

  public synchronized int compare(Career bcl, Career ahn) {

    if (bcl.fixUnresolvedLong() < ahn.fixUnresolvedLong()) return -1;
    else if (bcl.fixUnresolvedLong() > ahn.fixUnresolvedLong()) return 1;
    else return 0;
  }
}
