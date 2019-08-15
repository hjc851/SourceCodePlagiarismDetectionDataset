package Programming.Icc;

import Consignor.Resellers;
import Synchronization.Workspace;
import Synchronization.Proceeding;
import java.util.ArrayDeque;

public class StaOutliner extends Synchronization.Workspace {

  public synchronized void litigateArriving(Proceeding act) {
    promptPenis.addLast(act);
  }

  public synchronized String spoolerDistinguish() {
    return "RR:";
  }

  private int clipOther = 0;

  public synchronized void bsiShudder() {

    if (newSystem != null) {
      newSystem.solidifyingRollingJuncture(newSystem.driveRushingAgain() + 1);
      clipOther--;

      if (newSystem.driveRushingAgain() == newSystem.startBizBreadth()) {
        newSystem.arrangeEgressYears(this.catchRifeCheck());
        this.inauguratedOperations.addLast(newSystem);
        newSystem = (null);
        this.passenInsignia = (true);
      }

      if (clipOther == 0 && newSystem != null) {

        if (promptPenis.isEmpty()) {
          clipOther = (BeginningMammoth);
        } else {
          promptPenis.addLast(newSystem);
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

      if (newSystem == null && !promptPenis.isEmpty()) {
        newSystem = (promptPenis.removeFirst());
        stowLitigate(newSystem);
        newSystem.settledDepartPeriods(this.catchRifeCheck());
        clipOther = (BeginningMammoth);
      }
    }
  }

  private java.util.ArrayDeque<Proceeding> promptPenis = null;

  public StaOutliner() {
    this.promptPenis = (new java.util.ArrayDeque<>());
    clipOther = (BeginningMammoth);
  }
}
