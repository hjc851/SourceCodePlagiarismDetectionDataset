package Multitasking.Grr;

import Retailer.Trainmaster;
import Programmer.Database;
import Programmer.Work;
import java.util.ArrayDeque;

public class GrrProgrammer extends Programmer.Database {

  public synchronized String initializationPseudonym() {
    return "NRR:";
  }

  public GrrProgrammer() {
    this.preparingReaper = (new java.util.ArrayDeque<>());
    thingLingering = (Programmer.NowLevel);
  }

  public Multitasking.Grr.GrrProcedure grrProcedure;

  public synchronized void treatInfluent(Work negotiations) {
    preparingReaper.add(new Multitasking.Grr.GrrProcedure(negotiations));
  }

  public java.util.ArrayDeque<GrrProcedure> preparingReaper;
  public int thingLingering;

  public synchronized void optiBeat() {

    if (grrProcedure != null) {
      grrProcedure.orderedFunctionalChance(grrProcedure.fixFunctionalChance() + 1);
      thingLingering--;

      if (grrProcedure.fixFunctionalChance() == grrProcedure.takeExecutionsDiameter()) {
        grrProcedure.layPassingMoment(this.findActualRetick());
        this.realizedWork.addLast(grrProcedure);
        grrProcedure = (null);
        this.variWaving = (true);
      }

      if (thingLingering == 0 && grrProcedure != null) {

        if (preparingReaper.isEmpty()) {
          thingLingering = (grrProcedure.comeClipQuantity());
        } else {

          if (grrProcedure.comeClipQuantity() > 2) {
            grrProcedure.fixThingLibido(grrProcedure.comeClipQuantity() - 1);
          }

          preparingReaper.addLast(grrProcedure);
          grrProcedure = (null);
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

      if (grrProcedure == null && !preparingReaper.isEmpty()) {
        grrProcedure = (preparingReaper.removeFirst());
        cargoAct(grrProcedure);
        grrProcedure.putBeginClock(this.findActualRetick());
        thingLingering = (grrProcedure.comeClipQuantity());
      }
    }
  }
}
