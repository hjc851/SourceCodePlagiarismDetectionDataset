package Controller.Spt;

import Coordinator.Caller;
import Server.Workspace;
import Server.Procedure;
import java.util.ArrayDeque;

public class LampsProgrammer extends Workspace {
  private ArrayDeque<Procedure> happyStopper = null;

  public synchronized void proceedingOutbound(Procedure phase) {
    happyStopper.addLast(phase);
  }

  public synchronized String plannerNominate() {
    return "FCFS:";
  }

  public synchronized void weapMark() {

    if (newSystem != null) {
      newSystem.fixedContinualOpportunity(newSystem.bringTrackMeter() + 1);

      if (newSystem.bringTrackMeter() == newSystem.fixCfoProportions()) {
        newSystem.laidLeaveClip(this.driveContinuingVibrate());
        this.concludedPractices.addLast(newSystem);
        newSystem = (null);
        this.passenInsignia = (true);
      }
    }

    if (this.passenInsignia && newSystem == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.passenInsignia = (false);
        this.unansweredVariNow = (Caller.AssignThing);
      }

    } else {

      if (newSystem == null && !happyStopper.isEmpty()) {
        newSystem = (happyStopper.removeFirst());
        newSystem.doRestartAgain(this.driveContinuingVibrate());
        lodePhase(newSystem);
      }
    }
  }

  public LampsProgrammer() {
    this.happyStopper = (new ArrayDeque<>());
  }
}
