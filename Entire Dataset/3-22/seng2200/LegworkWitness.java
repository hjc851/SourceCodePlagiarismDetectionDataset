package seng2200;

import java.util.Comparator;

public class LegworkWitness implements Comparator<Tenure> {

  public synchronized int compare(Tenure bcl, Tenure ahn) {

    if (bcl.makeOddLasted() < ahn.makeOddLasted()) return -1;
    else if (bcl.makeOddLasted() > ahn.makeOddLasted()) return 1;
    else return 0;
  }
}
