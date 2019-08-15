package Planner.Grr;

import Salesperson.Retailer;
import Debugging.Server;
import Debugging.Operation;
import java.util.ArrayDeque;

public class GrrProgrammer extends Debugging.Server {
  private java.util.ArrayDeque<GrrProcedure> waitingList = null;
  private int weekSurviving = 0;
  private Planner.Grr.GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.waitingList = (new java.util.ArrayDeque<>());
    weekSurviving = (Debugging.MeterMeasure);
  }

  public synchronized String organizerList() {
    return "NRR:";
  }

  public synchronized void bpsRetick() {

    if (grrProcedure != null) synx184();

    if (this.reckTricolor && afootSummons == null) synx185();
    else synx186();
  }

  public synchronized void proceduresIngress(Operation cycle) {
    waitingList.add(new Planner.Grr.GrrProcedure(cycle));
  }

  private synchronized void synx184() {
    grrProcedure.dictatedTrackMeter(grrProcedure.conveyWalkingAmount() + 1);
    weekSurviving--;

    if (grrProcedure.conveyWalkingAmount() == grrProcedure.generateHonchoFootprint()) {
      grrProcedure.fixedEscapeOpportunity(this.fetchPresentRicky());
      this.accomplishedProcedure.addLast(grrProcedure);
      grrProcedure = (null);
      this.reckTricolor = (true);
    }

    if (weekSurviving == 0 && grrProcedure != null) {

      if (waitingList.isEmpty()) {
        weekSurviving = (grrProcedure.conveyAmountMarkers());
      } else {

        if (grrProcedure.conveyAmountMarkers() > 2) {
          grrProcedure.primedPeriodQualitative(grrProcedure.conveyAmountMarkers() - 1);
        }

        waitingList.addLast(grrProcedure);
        grrProcedure = (null);
        this.reckTricolor = (true);
      }
    }
  }

  private synchronized void synx185() {
    this.stillPassenYear--;

    if (stillPassenYear == 0) {
      this.reckTricolor = (false);
      this.stillPassenYear = (Retailer.DetachmentBeginning);
    }
  }

  private synchronized void synx186() {

    if (grrProcedure == null && !waitingList.isEmpty()) {
      grrProcedure = (waitingList.removeFirst());
      lodePhase(grrProcedure);
      grrProcedure.laidBeginningClip(this.fetchPresentRicky());
      weekSurviving = (grrProcedure.conveyAmountMarkers());
    }
  }
}
