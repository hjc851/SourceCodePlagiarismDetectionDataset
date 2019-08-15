package seng2200;

import java.util.Comparator;

public class TasksDiscriminator implements Comparator<Subcontract> {

  public synchronized int compare(Subcontract bcl, Subcontract ahn) {

    if (bcl.produceUnansweredRemainder() < ahn.produceUnansweredRemainder()) return -1;
    else if (bcl.produceUnansweredRemainder() > ahn.produceUnansweredRemainder()) return 1;
    else return 0;
  }
}
