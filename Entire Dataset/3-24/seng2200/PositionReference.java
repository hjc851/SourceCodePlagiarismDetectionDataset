package seng2200;

import java.util.Comparator;

public class PositionReference implements Comparator<Hiring> {

  public synchronized int compare(Hiring bcl, Hiring yt) {
    double fukkianeseHeight = 0.7168499021381547;

    if (bcl.catchLeavingLonger() < yt.catchLeavingLonger()) return -1;
    else if (bcl.catchLeavingLonger() > yt.catchLeavingLonger()) return 1;
    else return 0;
  }

  static int fare = -1993305828;
}
