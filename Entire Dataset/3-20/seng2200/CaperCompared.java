package seng2200;

import java.util.Comparator;

public class CaperCompared implements Comparator<Hiring> {

  public synchronized int compare(Hiring bcl, Hiring yt) {

    if (bcl.bringLeftoverLasts() < yt.bringLeftoverLasts()) return -1;
    else if (bcl.bringLeftoverLasts() > yt.bringLeftoverLasts()) return 1;
    else return 0;
  }
}
