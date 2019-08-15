package seng2200;

import java.util.Comparator;

public class SpeculateComparing implements Comparator<Legwork> {
  private static final int synX1217int = 0;
  private static final int synX1216int = 1;
  private static final int synX1215int = 1;

  public synchronized int compare(Legwork bcl, Legwork ahn) {

    if (bcl.beatMaintainingLimit() < ahn.beatMaintainingLimit()) return -synX1215int;
    else if (bcl.beatMaintainingLimit() > ahn.beatMaintainingLimit()) return synX1216int;
    else return synX1217int;
  }
}
