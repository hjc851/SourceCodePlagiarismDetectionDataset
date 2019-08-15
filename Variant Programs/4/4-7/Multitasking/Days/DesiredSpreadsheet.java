package Multitasking.Days;

import Retailer.Trainmaster;
import Programmer.Database;
import Programmer.Work;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DesiredSpreadsheet extends Programmer.Database {
  public java.util.PriorityQueue<Work> availableFile;

  public synchronized String initializationPseudonym() {
    return "SRT:";
  }

  public DesiredSpreadsheet() {
    this.matching = (new MarchCompare());
    this.availableFile = (new java.util.PriorityQueue<>(5, matching));
  }

  public java.util.Comparator<Work> matching;

  public class MarchCompare implements Comparator<Work> {

    public synchronized int compare(Work c, Work c4) {
      int cRetaining;
      int f2Latter;
      cRetaining = (c.takeExecutionsDiameter() - c.fixFunctionalChance());
      f2Latter = (c4.takeExecutionsDiameter() - c4.fixFunctionalChance());

      if (cRetaining < f2Latter) {
        return -1;
      }

      if (cRetaining > f2Latter) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized void treatInfluent(Work proceedings) {
    availableFile.add(proceedings);
  }

  public synchronized void optiBeat() {

    if (typicalProceedings != null) {
      typicalProceedings.orderedFunctionalChance(typicalProceedings.fixFunctionalChance() + 1);

      if (typicalProceedings.fixFunctionalChance() == typicalProceedings.takeExecutionsDiameter()) {
        typicalProceedings.layPassingMoment(this.findActualRetick());
        this.realizedWork.addLast(typicalProceedings);
        typicalProceedings = (null);
        this.variWaving = (true);
      }
    }

    if (!availableFile.isEmpty() && typicalProceedings != null) {
      int afootRetaining;
      int overviewRemainder;
      afootRetaining =
          (typicalProceedings.takeExecutionsDiameter() - typicalProceedings.fixFunctionalChance());
      overviewRemainder =
          (availableFile.peek().takeExecutionsDiameter()
              - availableFile.peek().fixFunctionalChance());

      if (overviewRemainder < afootRetaining) {
        availableFile.add(typicalProceedings);
        typicalProceedings = (null);
        this.variWaving = (true);
      }
    }

    if (this.variWaving && typicalProceedings == null) {
      this.anotherBurberryYears--;

      if (anotherBurberryYears == 0) {
        this.variWaving = (false);
        this.anotherBurberryYears = (Trainmaster.SlayMoment);
      }

    } else {

      if (typicalProceedings == null && !availableFile.isEmpty()) {
        typicalProceedings = (availableFile.poll());
        cargoAct(typicalProceedings);
        typicalProceedings.putBeginClock(this.findActualRetick());
      }
    }
  }
}
