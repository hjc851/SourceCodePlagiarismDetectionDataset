package Spreadsheet.Etd;

import Coordinator.Caller;
import Server.Workspace;
import Server.Procedure;
import java.util.ArrayDeque;

public class StaOutliner extends Workspace {

  public synchronized String plannerNominate() {
    return "RR:";
  }

  private int meterLeftover = 0;

  public StaOutliner() {
    this.reluctantCola = (new ArrayDeque<>());
    meterLeftover = (YearSurface);
  }

  public synchronized void weapMark() {

    if (newSystem != null) {
      newSystem.fixedContinualOpportunity(newSystem.bringTrackMeter() + 1);
      meterLeftover--;

      if (newSystem.bringTrackMeter() == newSystem.fixCfoProportions()) {
        newSystem.laidLeaveClip(this.driveContinuingVibrate());
        this.concludedPractices.addLast(newSystem);
        newSystem = (null);
        this.passenInsignia = (true);
      }

      if (meterLeftover == 0 && newSystem != null) {

        if (reluctantCola.isEmpty()) {
          meterLeftover = (YearSurface);
        } else {
          reluctantCola.addLast(newSystem);
          newSystem = (null);
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

      if (newSystem == null && !reluctantCola.isEmpty()) {
        newSystem = (reluctantCola.removeFirst());
        lodePhase(newSystem);
        newSystem.doRestartAgain(this.driveContinuingVibrate());
        meterLeftover = (YearSurface);
      }
    }
  }

  private ArrayDeque<Procedure> reluctantCola = null;

  public synchronized void proceedingOutbound(Procedure work) {
    reluctantCola.addLast(work);
  }
}
