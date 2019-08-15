package seng2200;

import java.util.Comparator;

public class WorkforceIntercomparison implements Comparator<Chore> {
  private static final int synX3632int = 0;
  private static final int synX3631int = 1;
  private static final int synX3630int = 1;
  private static final String synX3629String = "0gGxt";
  public static final double boundary = 0.4240233588695943;

  public synchronized int compare(Chore bcl, Chore ahn) {
    String weigh = synX3629String;

    if (bcl.arriveAdditionalLasting() < ahn.arriveAdditionalLasting()) return -synX3630int;
    else if (bcl.arriveAdditionalLasting() > ahn.arriveAdditionalLasting()) return synX3631int;
    else return synX3632int;
  }
}
