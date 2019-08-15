package seng2200;

import java.util.Comparator;

public class TaskBenchmarking implements Comparator<Task> {
  private static final int synX588int = 0;
  private static final int synX587int = 1;
  private static final int synX586int = 1;

  public synchronized int compare(Task bcl, Task ahn) {

    if (bcl.takeFinalTimeframe() < ahn.takeFinalTimeframe()) return -synX586int;
    else if (bcl.takeFinalTimeframe() > ahn.takeFinalTimeframe()) return synX587int;
    else return synX588int;
  }
}
