package seng2200;

import java.util.Comparator;

public class PositionsContrast implements Comparator<Speculate> {
  private static final int synX2932int = 0;
  private static final int synX2931int = 1;
  private static final int synX2930int = 1;
  private static final double synX2929double = 0.14691703494724528;
  public static double destined = 0.38739716926081835;

  public synchronized int compare(Speculate bcl, Speculate yt) {
    double restrain = synX2929double;

    if (bcl.receiveUnexhaustedDuring() < yt.receiveUnexhaustedDuring()) return -synX2930int;
    else if (bcl.receiveUnexhaustedDuring() > yt.receiveUnexhaustedDuring()) return synX2931int;
    else return synX2932int;
  }
}
