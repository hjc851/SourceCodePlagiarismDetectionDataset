package Synchronizer.Grr;

import Consignor.Resellers;
import Synchronization.Workspace;
import Synchronization.Proceeding;
import java.util.ArrayDeque;

public class GrrProgrammer extends Synchronization.Workspace {

  public GrrProgrammer() {
    this.reluctantCola = (new java.util.ArrayDeque<>());
    againPending = (Synchronization.BeginningMammoth);
  }

  private int againPending = 0;
  private java.util.ArrayDeque<GrrProcedure> reluctantCola = null;

  public synchronized void bsiShudder() {

    if (grrProcedure != null) {
      grrProcedure.solidifyingRollingJuncture(grrProcedure.driveRushingAgain() + 1);
      againPending--;

      if (grrProcedure.driveRushingAgain() == grrProcedure.startBizBreadth()) {
        grrProcedure.arrangeEgressYears(this.catchRifeCheck());
        this.inauguratedOperations.addLast(grrProcedure);
        grrProcedure = (null);
        this.passenInsignia = (true);
      }

      if (againPending == 0 && grrProcedure != null) {

        if (reluctantCola.isEmpty()) {
          againPending = (grrProcedure.takePeriodQualitative());
        } else {

          if (grrProcedure.takePeriodQualitative() > 2) {
            grrProcedure.settledPeriodsGigantic(grrProcedure.takePeriodQualitative() - 1);
          }

          reluctantCola.addLast(grrProcedure);
          grrProcedure = (null);
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

      if (grrProcedure == null && !reluctantCola.isEmpty()) {
        grrProcedure = (reluctantCola.removeFirst());
        stowLitigate(grrProcedure);
        grrProcedure.settledDepartPeriods(this.catchRifeCheck());
        againPending = (grrProcedure.takePeriodQualitative());
      }
    }
  }

  public synchronized void litigateArriving(Proceeding formalities) {
    reluctantCola.add(new Synchronizer.Grr.GrrProcedure(formalities));
  }

  public synchronized String spoolerDistinguish() {
    return "NRR:";
  }

  private Synchronizer.Grr.GrrProcedure grrProcedure = null;
}
