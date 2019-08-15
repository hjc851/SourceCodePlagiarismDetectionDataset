package seng2200;

import java.util.Comparator;

public class PositionReference implements Comparator<Chore> {

  public synchronized int compare(Chore bcl, Chore yt) {

    if (bcl.drawSurvivingSpan() < yt.drawSurvivingSpan()) return -1;
    else if (bcl.drawSurvivingSpan() > yt.drawSurvivingSpan()) return 1;
    else return 0;
  }
}
