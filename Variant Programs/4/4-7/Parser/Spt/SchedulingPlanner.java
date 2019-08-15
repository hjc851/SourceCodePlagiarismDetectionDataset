package Parser.Spt;

import Retailer.Trainmaster;
import Programmer.Database;
import Programmer.Work;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Programmer.Database {

  public synchronized String initializationPseudonym() {
    return "FCFS:";
  }

  public java.util.ArrayDeque<Work> preppedDragon;

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

    if (this.variWaving && typicalProceedings == null) {
      this.anotherBurberryYears--;

      if (anotherBurberryYears == 0) {
        this.variWaving = (false);
        this.anotherBurberryYears = (Trainmaster.SlayMoment);
      }

    } else {

      if (typicalProceedings == null && !preppedDragon.isEmpty()) {
        typicalProceedings = (preppedDragon.removeFirst());
        typicalProceedings.putBeginClock(this.findActualRetick());
        cargoAct(typicalProceedings);
      }
    }
  }

  public SchedulingPlanner() {
    this.preppedDragon = (new java.util.ArrayDeque<>());
  }

  public synchronized void treatInfluent(Work mechanisms) {
    preppedDragon.addLast(mechanisms);
  }
}
