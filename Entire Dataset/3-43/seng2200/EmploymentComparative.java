package seng2200;

import java.util.Comparator;

public class EmploymentComparative implements Comparator<Chore> {
  private static final int synX3121int = 0;
  private static final int synX3120int = 1;
  private static final int synX3119int = 1;
  private static final double synX3118double = 0.9497112589860307;
  public static String tops = "GkspU5Zxg5Tk4KU";

  public synchronized int compare(Chore bcl, Chore ahn) {
    double ceiling = synX3118double;

    if (bcl.drivePendingTime() < ahn.drivePendingTime()) return -synX3119int;
    else if (bcl.drivePendingTime() > ahn.drivePendingTime()) return synX3120int;
    else return synX3121int;
  }
}
