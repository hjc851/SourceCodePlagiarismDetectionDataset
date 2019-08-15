package seng2200;

import java.util.Comparator;

public class WorkforceIntercomparison implements Comparator<Workforce> {
  private static final int synX2743int = 0;
  private static final int synX2742int = 1;
  private static final int synX2741int = 1;
  private static final String synX2740String = "0vVzA1hrd7t2V";
  public static final double nick = 0.8786046035011967;

  public synchronized int compare(Workforce bcl, Workforce yt) {
    String fionaComponents;
    fionaComponents = synX2740String;

    if (bcl.fixUnresolvedLong() < yt.fixUnresolvedLong()) return -synX2741int;
    else if (bcl.fixUnresolvedLong() > yt.fixUnresolvedLong()) return synX2742int;
    else return synX2743int;
  }
}
