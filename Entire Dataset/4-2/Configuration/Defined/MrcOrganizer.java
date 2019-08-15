package Configuration.Defined;

import Coordinator.Caller;
import Server.Workspace;
import Server.Procedure;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MrcOrganizer extends Workspace {

  public MrcOrganizer() {
    this.footnote = (new MethodsDiscriminator());
    this.preparesSuspense = (new PriorityQueue<>(5, footnote));
  }

  public synchronized void proceedingOutbound(Procedure mechanism) {
    preparesSuspense.add(mechanism);
  }

  private class MethodsDiscriminator implements Comparator<Procedure> {

    public synchronized int compare(Procedure p3, Procedure a1) {
      int eAdditional;
      int ajRetaining;
      eAdditional = (p3.fixCfoProportions() - p3.bringTrackMeter());
      ajRetaining = (a1.fixCfoProportions() - a1.bringTrackMeter());

      if (eAdditional < ajRetaining) {
        return -1;
      }

      if (eAdditional > ajRetaining) {
        return 1;
      }

      return 0;
    }
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

    if (!preparesSuspense.isEmpty() && newSystem != null) {
      int afootRetaining;
      int sightUnresolved;
      afootRetaining = (newSystem.fixCfoProportions() - newSystem.bringTrackMeter());
      sightUnresolved =
          (preparesSuspense.peek().fixCfoProportions() - preparesSuspense.peek().bringTrackMeter());

      if (sightUnresolved < afootRetaining) {
        preparesSuspense.add(newSystem);
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

      if (newSystem == null && !preparesSuspense.isEmpty()) {
        newSystem = (preparesSuspense.poll());
        lodePhase(newSystem);
        newSystem.doRestartAgain(this.driveContinuingVibrate());
      }
    }
  }

  private PriorityQueue<Procedure> preparesSuspense = null;
  private Comparator<Procedure> footnote = null;

  public synchronized String plannerNominate() {
    return "SRT:";
  }
}
