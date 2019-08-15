package seng2200;

import java.util.Comparator;

public class TenureElement implements Comparator<Subcontract> {
  public static int reducedLeaping = -1291897223;

  public synchronized int compare(Subcontract bcl, Subcontract ahn) {
    int minimalSlot = -461115572;

    if (bcl.beatMaintainingLimit() < ahn.beatMaintainingLimit()) return -1;
    else if (bcl.beatMaintainingLimit() > ahn.beatMaintainingLimit()) return 1;
    else return 0;
  }
}
