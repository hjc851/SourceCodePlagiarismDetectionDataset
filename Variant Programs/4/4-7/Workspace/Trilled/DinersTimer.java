package Workspace.Trilled;

import Retailer.Trainmaster;
import Programmer.Database;
import Programmer.Work;
import java.util.ArrayDeque;

public class DinersTimer extends Programmer.Database {

  public synchronized String initializationPseudonym() {
    return "RR:";
  }

  public DinersTimer() {
    this.happyStopper = (new java.util.ArrayDeque<>());
    sentenceUnexpended = (NowLevel);
  }

  public synchronized void treatInfluent(Work procedures) {
    happyStopper.addLast(procedures);
  }

  public java.util.ArrayDeque<Work> happyStopper;

  public synchronized void optiBeat() {

    if (typicalProceedings != null) {
      typicalProceedings.orderedFunctionalChance(typicalProceedings.fixFunctionalChance() + 1);
      sentenceUnexpended--;

      if (typicalProceedings.fixFunctionalChance() == typicalProceedings.takeExecutionsDiameter()) {
        typicalProceedings.layPassingMoment(this.findActualRetick());
        this.realizedWork.addLast(typicalProceedings);
        typicalProceedings = (null);
        this.variWaving = (true);
      }

      if (sentenceUnexpended == 0 && typicalProceedings != null) {

        if (happyStopper.isEmpty()) {
          sentenceUnexpended = (NowLevel);
        } else {
          happyStopper.addLast(typicalProceedings);
          typicalProceedings = (null);
          this.variWaving = (true);
        }
      }
    }

    if (this.variWaving && typicalProceedings == null) {
      this.anotherBurberryYears--;

      if (anotherBurberryYears == 0) {
        this.variWaving = (false);
        this.anotherBurberryYears = (Trainmaster.SlayMoment);
      }

    } else {

      if (typicalProceedings == null && !happyStopper.isEmpty()) {
        typicalProceedings = (happyStopper.removeFirst());
        cargoAct(typicalProceedings);
        typicalProceedings.putBeginClock(this.findActualRetick());
        sentenceUnexpended = (NowLevel);
      }
    }
  }

  public int sentenceUnexpended;
}
