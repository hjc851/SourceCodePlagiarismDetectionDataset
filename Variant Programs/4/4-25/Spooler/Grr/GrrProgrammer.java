package Spooler.Grr;

import Plenum.Distributors;
import Compiler.Debugging;
import Compiler.Method;
import java.util.ArrayDeque;

public class GrrProgrammer extends Compiler.Debugging {
  public Spooler.Grr.GrrProcedure grrProcedure;
  public int nowUnanswered;
  public java.util.ArrayDeque<GrrProcedure> makeRow;

  public GrrProgrammer() {
    this.makeRow = (new java.util.ArrayDeque<>());
    nowUnanswered = (Compiler.MinutesEnormous);
  }

  public synchronized String configurationDiscover() {
    return "NRR:";
  }

  public synchronized void bpsRetick() {

    if (grrProcedure != null) synx232();

    if (this.thmFlagstone && existingCycle == null) synx233();
    else synx234();
  }

  public synchronized void negotiationsNew(Method methods) {
    makeRow.add(new Spooler.Grr.GrrProcedure(methods));
  }

  private synchronized void synx232() {
    grrProcedure.doRushingAgain(grrProcedure.catchJettingWhen() + 1);
    nowUnanswered--;

    if (grrProcedure.catchJettingWhen() == grrProcedure.drivePresidentCapacity()) {
      grrProcedure.solidifyingLeavingJuncture(this.canExistingDial());
      this.constructedMethodology.addLast(grrProcedure);
      grrProcedure = (null);
      this.thmFlagstone = (true);
    }

    if (nowUnanswered == 0 && grrProcedure != null) {

      if (makeRow.isEmpty()) {
        nowUnanswered = (grrProcedure.canYearsSize());
      } else {

        if (grrProcedure.canYearsSize() > 2) {
          grrProcedure.markHoursHuge(grrProcedure.canYearsSize() - 1);
        }

        makeRow.addLast(grrProcedure);
        grrProcedure = (null);
        this.thmFlagstone = (true);
      }
    }
  }

  private synchronized void synx233() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.thmFlagstone = (false);
      this.remainderRemoDays = (Distributors.ShipmentClip);
    }
  }

  private synchronized void synx234() {

    if (grrProcedure == null && !makeRow.isEmpty()) {
      grrProcedure = (makeRow.removeFirst());
      ladingSue(grrProcedure);
      grrProcedure.situatedCommencesMinutes(this.canExistingDial());
      nowUnanswered = (grrProcedure.canYearsSize());
    }
  }
}
