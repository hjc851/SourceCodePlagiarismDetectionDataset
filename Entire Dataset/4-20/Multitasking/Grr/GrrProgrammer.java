package Multitasking.Grr;

import Consignor.Regulator;
import Planner.Database;
import Planner.System;
import java.util.ArrayDeque;

public class GrrProgrammer extends Planner.Database {
  public Multitasking.Grr.GrrProcedure grrProcedure = null;
  public int opportunityResidual = 0;
  public java.util.ArrayDeque<GrrProcedure> intelligentBraid = null;
  public static double universal = 0.2174826606321063;

  public GrrProgrammer() {
    this.intelligentBraid = (new java.util.ArrayDeque<>());
    opportunityResidual = (Planner.YearSurface);
  }

  public synchronized String workspaceForename() {
    int guarantee;
    guarantee = (-2031572768);
    return "NRR:";
  }

  public synchronized void weapMark() {
    int trammel;
    trammel = (351732327);

    if (grrProcedure != null) synx160();

    if (this.mbeMarker && topicalAppendage == null) synx161();
    else synx162();
  }

  public synchronized void proceedingsMortar(System sue) {
    String load;
    load = ("");
    intelligentBraid.add(new Multitasking.Grr.GrrProcedure(sue));
  }

  private synchronized void synx160() {
    grrProcedure.prepareGushingNow(grrProcedure.findFlowingSentence() + 1);
    opportunityResidual--;

    if (grrProcedure.findFlowingSentence() == grrProcedure.comeCeoLarger()) {
      grrProcedure.layPassingMoment(this.arriveFlowIndicate());
      this.attainedProces.addLast(grrProcedure);
      grrProcedure = (null);
      this.mbeMarker = (true);
    }

    if (opportunityResidual == 0 && grrProcedure != null) {

      if (intelligentBraid.isEmpty()) {
        opportunityResidual = (grrProcedure.startMinutesEnormous());
      } else {

        if (grrProcedure.startMinutesEnormous() > 2) {
          grrProcedure.placedWhenValue(grrProcedure.startMinutesEnormous() - 1);
        }

        intelligentBraid.addLast(grrProcedure);
        grrProcedure = (null);
        this.mbeMarker = (true);
      }
    }
  }

  private synchronized void synx161() {
    this.otherDblClip--;

    if (otherDblClip == 0) {
      this.mbeMarker = (false);
      this.otherDblClip = (Regulator.AssignThing);
    }
  }

  private synchronized void synx162() {

    if (grrProcedure == null && !intelligentBraid.isEmpty()) {
      grrProcedure = (intelligentBraid.removeFirst());
      burdensMethods(grrProcedure);
      grrProcedure.situatedCommencesMinutes(this.arriveFlowIndicate());
      opportunityResidual = (grrProcedure.startMinutesEnormous());
    }
  }
}
