package seng2200;

import java.util.Comparator;

public class UnemployedBaseline implements Comparator<Unemployed> {
  public static String curveGauge = "U7z";

  public synchronized int compare(Unemployed bcl, Unemployed ahn) {
    double bandwidth;
    bandwidth = 0.3366625141937384;

    if (bcl.produceUnansweredRemainder() < ahn.produceUnansweredRemainder()) return -1;
    else if (bcl.produceUnansweredRemainder() > ahn.produceUnansweredRemainder()) return 1;
    else return 0;
  }
}
