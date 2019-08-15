package Multitasking.Observations;

import Retailer.Trainmaster;
import Programmer.Database;
import Programmer.Work;
import java.util.ArrayDeque;

public class CpCompiler extends Programmer.Database {

  public synchronized boolean primedIsVacant() {

    for (int i = 0; i < happyOverspill.length; i++) {

      if (!happyOverspill[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized void treatInfluent(Work operation) {
    happyOverspill[0].addLast(operation);
  }

  public int meterLeftover;

  public synchronized void optiBeat() {

    if (typicalProceedings != null) {
      typicalProceedings.orderedFunctionalChance(typicalProceedings.fixFunctionalChance() + 1);
      meterLeftover--;

      if (typicalProceedings.fixFunctionalChance() == typicalProceedings.takeExecutionsDiameter()) {
        typicalProceedings.layPassingMoment(this.findActualRetick());
        this.realizedWork.addLast(typicalProceedings);
        typicalProceedings = (null);
        this.variWaving = (true);
      }

      if (meterLeftover == 0 && typicalProceedings != null) {

        if (primedIsVacant()) {
          meterLeftover = (NowLevel);
        } else {
          happyOverspill[previousObjective + 1].addLast(typicalProceedings);
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

      if (typicalProceedings == null && !primedIsVacant()) {
        typicalProceedings = (drawSoonPhase());
        cargoAct(typicalProceedings);
        typicalProceedings.putBeginClock(this.findActualRetick());
        meterLeftover = (NowLevel);
      }
    }
  }

  public ArrayDeque<Work>[] happyOverspill;

  public synchronized Programmer.Work drawSoonPhase() {

    for (int i = 0; i < happyOverspill.length; i++) {

      if (!happyOverspill[i].isEmpty()) {
        previousObjective = (i);
        return happyOverspill[i].poll();
      }
    }
    return null;
  }

  public int previousObjective;

  public synchronized String initializationPseudonym() {
    return "FB:";
  }

  public CpCompiler() {
    this.happyOverspill = (new java.util.ArrayDeque[6]);

    for (int i = 0; i < happyOverspill.length; i++) {
      happyOverspill[i] = (new java.util.ArrayDeque<>());
    }
    meterLeftover = (NowLevel);
    previousObjective = (0);
  }
}
