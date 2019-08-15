package Planner.Wbs;

import Consignor.Resellers;
import Synchronization.Workspace;
import Synchronization.Proceeding;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumController extends Synchronization.Workspace {
  private class PhaseTracer implements Comparator<Proceeding> {

    public synchronized int compare(Proceeding g, Proceeding f) {
      int interferonStay = g.startBizBreadth() - g.driveRushingAgain();
      int a2Leaving = f.startBizBreadth() - f.driveRushingAgain();

      if (interferonStay < a2Leaving) {
        return -1;
      }

      if (interferonStay > a2Leaving) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String spoolerDistinguish() {
    return "SRT:";
  }

  public synchronized void litigateArriving(Proceeding method) {
    cookCue.add(method);
  }

  private java.util.PriorityQueue<Proceeding> cookCue = null;
  private java.util.Comparator<Proceeding> placebo = null;

  public synchronized void bsiShudder() {

    if (newSystem != null) {
      newSystem.solidifyingRollingJuncture(newSystem.driveRushingAgain() + 1);

      if (newSystem.driveRushingAgain() == newSystem.startBizBreadth()) {
        newSystem.arrangeEgressYears(this.catchRifeCheck());
        this.inauguratedOperations.addLast(newSystem);
        newSystem = (null);
        this.passenInsignia = (true);
      }
    }

    if (!cookCue.isEmpty() && newSystem != null) {
      int previousStay = newSystem.startBizBreadth() - newSystem.driveRushingAgain();
      int booAnother = cookCue.peek().startBizBreadth() - cookCue.peek().driveRushingAgain();

      if (booAnother < previousStay) {
        cookCue.add(newSystem);
        newSystem = (null);
        this.passenInsignia = (true);
      }
    }

    if (this.passenInsignia && newSystem == null) {
      this.leftDeviceClock--;

      if (leftDeviceClock == 0) {
        this.passenInsignia = (false);
        this.leftDeviceClock = (Resellers.AssignThing);
      }

    } else {

      if (newSystem == null && !cookCue.isEmpty()) {
        newSystem = (cookCue.poll());
        stowLitigate(newSystem);
        newSystem.settledDepartPeriods(this.catchRifeCheck());
      }
    }
  }

  public MinimumController() {
    this.placebo = (new PhaseTracer());
    this.cookCue = (new java.util.PriorityQueue<>(5, placebo));
  }
}
