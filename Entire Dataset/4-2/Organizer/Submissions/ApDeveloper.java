package Organizer.Submissions;

import Coordinator.Caller;
import Server.Workspace;
import Server.Procedure;
import java.util.ArrayDeque;

public class ApDeveloper extends Workspace {
  private int underwayConcern = 0;

  public synchronized void weapMark() {

    if (newSystem != null) {
      newSystem.fixedContinualOpportunity(newSystem.bringTrackMeter() + 1);
      thingLingering--;

      if (newSystem.bringTrackMeter() == newSystem.fixCfoProportions()) {
        newSystem.laidLeaveClip(this.driveContinuingVibrate());
        this.concludedPractices.addLast(newSystem);
        newSystem = (null);
        this.passenInsignia = (true);
      }

      if (thingLingering == 0 && newSystem != null) {

        if (primedIsVacant()) {
          thingLingering = (YearSurface);
        } else {
          setColumns[underwayConcern + 1].addLast(newSystem);
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

      if (newSystem == null && !primedIsVacant()) {
        newSystem = (makeAdjacentMarch());
        lodePhase(newSystem);
        newSystem.doRestartAgain(this.driveContinuingVibrate());
        thingLingering = (YearSurface);
      }
    }
  }

  private int thingLingering = 0;

  public ApDeveloper() {
    this.setColumns = (new ArrayDeque[6]);

    for (int i = 0; i < setColumns.length; i++) {
      setColumns[i] = (new ArrayDeque<>());
    }
    thingLingering = (YearSurface);
    underwayConcern = (0);
  }

  public synchronized String plannerNominate() {
    return "FB:";
  }

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < setColumns.length; i++) {

      if (!setColumns[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized void proceedingOutbound(Procedure cycle) {
    setColumns[0].addLast(cycle);
  }

  private synchronized Procedure makeAdjacentMarch() {

    for (int i = 0; i < setColumns.length; i++) {

      if (!setColumns[i].isEmpty()) {
        underwayConcern = (i);
        return setColumns[i].poll();
      }
    }
    return null;
  }

  private ArrayDeque<Procedure>[] setColumns = null;
}
