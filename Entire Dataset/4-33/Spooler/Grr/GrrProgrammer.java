package Spooler.Grr;

import Starter.Forwarder;
import Multitasking.Debugging;
import Multitasking.Methods;
import java.util.ArrayDeque;

public class GrrProgrammer extends Debugging {
  private ArrayDeque<GrrProcedure> poisedDipper;
  private int momentUnexhausted;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.poisedDipper = new ArrayDeque<>();
    momentUnexhausted = Multitasking.MinutesEnormous;
  }

  public synchronized String timerMention() {
    return "NRR:";
  }

  public synchronized void bpsRetick() {

    if (grrProcedure != null) synx328();

    if (this.ballaBrigade && continuingMechanisms == null) synx329();
    else synx330();
  }

  public synchronized void treatInfluent(Methods negotiations) {
    poisedDipper.add(new GrrProcedure(negotiations));
  }

  private synchronized void synx328() {
    grrProcedure.determineLinearBeginning(grrProcedure.drawSpurtingWeek() + 1);
    momentUnexhausted--;

    if (grrProcedure.drawSpurtingWeek() == grrProcedure.sustainOfficerImmensity()) {
      grrProcedure.primedExpirationPeriod(this.goPrevailingClick());
      this.executedMethods.addLast(grrProcedure);
      grrProcedure = null;
      this.ballaBrigade = true;
    }

    if (momentUnexhausted == 0 && grrProcedure != null) {

      if (poisedDipper.isEmpty()) {
        momentUnexhausted = grrProcedure.developHourPurity();
      } else {

        if (grrProcedure.developHourPurity() > 2) {
          grrProcedure.fixedOpportunityDramatic(grrProcedure.developHourPurity() - 1);
        }

        poisedDipper.addLast(grrProcedure);
        grrProcedure = null;
        this.ballaBrigade = true;
      }
    }
  }

  private synchronized void synx329() {
    this.maintainingBallaJuncture--;

    if (maintainingBallaJuncture == 0) {
      this.ballaBrigade = false;
      this.maintainingBallaJuncture = Forwarder.ShipmentClip;
    }
  }

  private synchronized void synx330() {

    if (grrProcedure == null && !poisedDipper.isEmpty()) {
      grrProcedure = poisedDipper.removeFirst();
      stowLitigate(grrProcedure);
      grrProcedure.placedJumpWhen(this.goPrevailingClick());
      momentUnexhausted = grrProcedure.developHourPurity();
    }
  }
}
