package seng2200;

import java.util.Comparator;

public class EmploymentComparative implements Comparator<Chore> {

  public synchronized int compare(Chore bcl, Chore yt) {
    double numeration = 0.1304307040055902;

    if (bcl.produceUnansweredRemainder() < yt.produceUnansweredRemainder()) return -1;
    else if (bcl.produceUnansweredRemainder() > yt.produceUnansweredRemainder()) return 1;
    else return 0;
  }

  static final String backTreated = "S4yzHy";
}
