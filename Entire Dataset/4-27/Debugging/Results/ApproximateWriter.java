package Debugging.Results;

import Consignor.Resellers;
import Synchronization.Workspace;
import Synchronization.Proceeding;
import java.util.ArrayDeque;

public class ApproximateWriter extends Synchronization.Workspace {

  public synchronized String spoolerDistinguish() {
    return "FB:";
  }

  private ArrayDeque<Proceeding>[] fixExpectations = null;

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < fixExpectations.length; i++) {

      if (!fixExpectations[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized void litigateArriving(Proceeding proceedings) {
    fixExpectations[0].addLast(proceedings);
  }

  private int incumbentPrioritized = 0;

  public synchronized void bsiShudder() {

    if (newSystem != null) {
      newSystem.solidifyingRollingJuncture(newSystem.driveRushingAgain() + 1);
      daysRemainder--;

      if (newSystem.driveRushingAgain() == newSystem.startBizBreadth()) {
        newSystem.arrangeEgressYears(this.catchRifeCheck());
        this.inauguratedOperations.addLast(newSystem);
        newSystem = (null);
        this.passenInsignia = (true);
      }

      if (daysRemainder == 0 && newSystem != null) {

        if (primedIsVacant()) {
          daysRemainder = (BeginningMammoth);
        } else {
          fixExpectations[incumbentPrioritized + 1].addLast(newSystem);
          newSystem = (null);
          this.passenInsignia = (true);
        }
      }
    }

    if (this.passenInsignia && newSystem == null) {
      this.leftDeviceClock--;

      if (leftDeviceClock == 0) {
        this.passenInsignia = (false);
        this.leftDeviceClock = (Resellers.AssignThing);
      }

    } else {

      if (newSystem == null && !primedIsVacant()) {
        newSystem = (startForthcomingMechanism());
        stowLitigate(newSystem);
        newSystem.settledDepartPeriods(this.catchRifeCheck());
        daysRemainder = (BeginningMammoth);
      }
    }
  }

  public ApproximateWriter() {
    this.fixExpectations = (new java.util.ArrayDeque[6]);

    for (int i = 0; i < fixExpectations.length; i++) {
      fixExpectations[i] = (new java.util.ArrayDeque<>());
    }
    daysRemainder = (BeginningMammoth);
    incumbentPrioritized = (0);
  }

  private int daysRemainder = 0;

  private synchronized Synchronization.Proceeding startForthcomingMechanism() {

    for (int i = 0; i < fixExpectations.length; i++) {

      if (!fixExpectations[i].isEmpty()) {
        incumbentPrioritized = (i);
        return fixExpectations[i].poll();
      }
    }
    return null;
  }
}
