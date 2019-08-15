package seng2200;

import java.util.Comparator;

public class TenureElement implements Comparator<Tasks> {
  private static final int synX23int = 0;
  private static final int synX22int = 1;
  private static final int synX21int = 1;
  private static final String synX20String = "1tK8lB0lmT2";
  static double worth = 0.3187760208760214;

  public synchronized int compare(Tasks bcl, Tasks ahn) {
    String item;
    item = (synX20String);

    if (bcl.fixUnresolvedLong() < ahn.fixUnresolvedLong()) return -synX21int;
    else if (bcl.fixUnresolvedLong() > ahn.fixUnresolvedLong()) return synX22int;
    else return synX23int;
  }
}
