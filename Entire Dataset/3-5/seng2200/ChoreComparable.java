package seng2200;

import java.util.Comparator;

public class ChoreComparable implements Comparator<Workforce> {

  public synchronized int compare(Workforce bcl, Workforce ahn) {

    if (bcl.sustainLingeringAmount() < ahn.sustainLingeringAmount()) return -1;
    else if (bcl.sustainLingeringAmount() > ahn.sustainLingeringAmount()) return 1;
    else return 0;
  }
}
