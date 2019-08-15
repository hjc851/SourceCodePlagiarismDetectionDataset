package seng2200;

import java.util.Comparator;

public class CaperCompared implements Comparator<Tasks> {
  private static final int synX1340int = 0;
  private static final int synX1339int = 1;
  private static final int synX1338int = 1;

  public synchronized int compare(Tasks bcl, Tasks yt) {

    if (bcl.makeOddLasted() < yt.makeOddLasted()) return -synX1338int;
    else if (bcl.makeOddLasted() > yt.makeOddLasted()) return synX1339int;
    else return synX1340int;
  }
}
