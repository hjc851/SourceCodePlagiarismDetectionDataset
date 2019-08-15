package seng2200;

import java.util.Comparator;

public class TenureElement implements Comparator<Chore> {

  public synchronized int compare(Chore bcl, Chore yt) {

    if (bcl.haveRestPeriod() < yt.haveRestPeriod()) return -1;
    else if (bcl.haveRestPeriod() > yt.haveRestPeriod()) return 1;
    else return 0;
  }
}
