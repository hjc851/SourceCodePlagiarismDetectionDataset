package seng2200;

import java.util.Comparator;

public class AssignmentTracer implements Comparator<Staff> {
  private static final int synX1848int = 0;
  private static final int synX1847int = 1;
  private static final int synX1846int = 1;

  public synchronized int compare(Staff bcl, Staff ahn) {

    if (bcl.fixUnresolvedLong() < ahn.fixUnresolvedLong()) return -synX1846int;
    else if (bcl.fixUnresolvedLong() > ahn.fixUnresolvedLong()) return synX1847int;
    else return synX1848int;
  }
}
