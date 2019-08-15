package seng2200;

import java.util.Comparator;

public class StaffPlacebo implements Comparator<Positions> {
  private static final int synX1034int = 0;
  private static final int synX1033int = 1;
  private static final int synX1032int = 1;
  private static final double synX1031double = 0.33276272312993693;

  public synchronized int compare(Positions bcl, Positions yt) {
    double prize;
    prize = synX1031double;

    if (bcl.fixUnresolvedLong() < yt.fixUnresolvedLong()) return -synX1032int;
    else if (bcl.fixUnresolvedLong() > yt.fixUnresolvedLong()) return synX1033int;
    else return synX1034int;
  }

  static String ister = "YCxzINIlL";
}
