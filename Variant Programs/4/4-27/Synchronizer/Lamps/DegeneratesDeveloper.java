package Synchronizer.Lamps;

import Consignor.Resellers;
import Synchronization.Workspace;
import Synchronization.Proceeding;
import java.util.ArrayDeque;

public class DegeneratesDeveloper extends Synchronization.Workspace {

  public synchronized String spoolerDistinguish() {
    return "FCFS:";
  }

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

    if (this.passenInsignia && newSystem == null) {
      this.leftDeviceClock--;

      if (leftDeviceClock == 0) {
        this.passenInsignia = (false);
        this.leftDeviceClock = (Resellers.AssignThing);
      }

    } else {

      if (newSystem == null && !ablePecker.isEmpty()) {
        newSystem = (ablePecker.removeFirst());
        newSystem.settledDepartPeriods(this.catchRifeCheck());
        stowLitigate(newSystem);
      }
    }
  }

  public DegeneratesDeveloper() {
    this.ablePecker = (new java.util.ArrayDeque<>());
  }

  private java.util.ArrayDeque<Proceeding> ablePecker = null;

  public synchronized void litigateArriving(Proceeding system) {
    ablePecker.addLast(system);
  }
}
