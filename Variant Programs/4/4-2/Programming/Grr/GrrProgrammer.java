package Programming.Grr;

import Coordinator.Caller;
import Server.Workspace;
import Server.Procedure;
import java.util.ArrayDeque;

public class GrrProgrammer extends Workspace {

  public synchronized void weapMark() {

    if (grrProcedure != null) {
      grrProcedure.fixedContinualOpportunity(grrProcedure.bringTrackMeter() + 1);
      clockLeft--;

      if (grrProcedure.bringTrackMeter() == grrProcedure.fixCfoProportions()) {
        grrProcedure.laidLeaveClip(this.driveContinuingVibrate());
        this.concludedPractices.addLast(grrProcedure);
        grrProcedure = (null);
        this.passenInsignia = (true);
      }

      if (clockLeft == 0 && grrProcedure != null) {

        if (ablePecker.isEmpty()) {
          clockLeft = (grrProcedure.becomeOpportunityDramatic());
        } else {

          if (grrProcedure.becomeOpportunityDramatic() > 2) {
            grrProcedure.bentHourPurity(grrProcedure.becomeOpportunityDramatic() - 1);
          }

          ablePecker.addLast(grrProcedure);
          grrProcedure = (null);
          this.passenInsignia = (true);
        }
      }
    }

    if (this.passenInsignia && newSystem == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.passenInsignia = (false);
        this.unansweredVariNow = (Caller.AssignThing);
      }

    } else {

      if (grrProcedure == null && !ablePecker.isEmpty()) {
        grrProcedure = (ablePecker.removeFirst());
        lodePhase(grrProcedure);
        grrProcedure.doRestartAgain(this.driveContinuingVibrate());
        clockLeft = (grrProcedure.becomeOpportunityDramatic());
      }
    }
  }

  public synchronized String plannerNominate() {
    return "NRR:";
  }

  public synchronized void proceedingOutbound(Procedure negotiations) {
    ablePecker.add(new GrrProcedure(negotiations));
  }

  private ArrayDeque<GrrProcedure> ablePecker = null;

  public GrrProgrammer() {
    this.ablePecker = (new ArrayDeque<>());
    clockLeft = (Server.YearSurface);
  }

  private int clockLeft = 0;
  private GrrProcedure grrProcedure = null;
}
