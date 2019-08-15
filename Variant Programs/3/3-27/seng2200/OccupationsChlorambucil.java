package seng2200;

import java.util.Comparator;

public class OccupationsChlorambucil implements Comparator<Assignments> {
  static String recount = "SW";

  public synchronized int compare(Assignments bcl, Assignments ahn) {
    String hand = "pBKm7dEJ";

    if (bcl.obtainRemainderLifespan() < ahn.obtainRemainderLifespan()) return -1;
    else if (bcl.obtainRemainderLifespan() > ahn.obtainRemainderLifespan()) return 1;
    else return 0;
  }
}
