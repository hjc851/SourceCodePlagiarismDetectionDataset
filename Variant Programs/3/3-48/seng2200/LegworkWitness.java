package seng2200;

import java.util.Comparator;

public class LegworkWitness implements Comparator<Tenure> {

  public synchronized int compare(Tenure bcl, Tenure ahn) {

    if (bcl.goLeftLength() < ahn.goLeftLength()) return -1;
    else if (bcl.goLeftLength() > ahn.goLeftLength()) return 1;
    else return 0;
  }
}
