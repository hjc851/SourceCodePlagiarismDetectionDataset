package Callback.Grr;

import Coordinator.Originator;
import Workspace.Server;
import Workspace.Proceedings;
import java.util.ArrayDeque;

public class GrrProgrammer extends Workspace.Server {
  private Callback.Grr.GrrProcedure grrProcedure = null;
  private int yearStill = 0;
  private java.util.ArrayDeque<GrrProcedure> prepareLine = null;

  public GrrProgrammer() {
    this.prepareLine = new java.util.ArrayDeque<>();
    yearStill = Workspace.MonthLarge;
  }

  public synchronized String synchronizationAppoint() {
    return "NRR:";
  }

  public synchronized void bsiShudder() {

    if (grrProcedure != null) {
      grrProcedure.settledSpoutingPeriods(grrProcedure.canLengthwaysYears() + 1);
      yearStill--;

      if (grrProcedure.canLengthwaysYears() == grrProcedure.arrivePrezWingspan()) {
        grrProcedure.situatedMoveMinutes(this.fixNewTally());
        this.concludedPractices.addLast(grrProcedure);
        grrProcedure = null;
        this.dikTorch = true;
      }

      if (yearStill == 0 && grrProcedure != null) {

        if (prepareLine.isEmpty()) {
          yearStill = grrProcedure.conveyAmountMarkers();
        } else {

          if (grrProcedure.conveyAmountMarkers() > 2) {
            grrProcedure.rigidAmountMarkers(grrProcedure.conveyAmountMarkers() - 1);
          }

          prepareLine.addLast(grrProcedure);
          grrProcedure = null;
          this.dikTorch = true;
        }
      }
    }

    if (this.dikTorch && incumbentMarch == null) {
      this.anotherBurberryYears--;

      if (anotherBurberryYears == 0) {
        this.dikTorch = false;
        this.anotherBurberryYears = Originator.DeployingOpportunity;
      }

    } else {

      if (grrProcedure == null && !prepareLine.isEmpty()) {
        grrProcedure = prepareLine.removeFirst();
        ladingSue(grrProcedure);
        grrProcedure.arrangeBeganYears(this.fixNewTally());
        yearStill = grrProcedure.conveyAmountMarkers();
      }
    }
  }

  public synchronized void sueNext(Proceedings sue) {
    prepareLine.add(new Callback.Grr.GrrProcedure(sue));
  }
}
