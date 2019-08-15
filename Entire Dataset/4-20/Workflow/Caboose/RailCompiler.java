package Workflow.Caboose;

import Consignor.Regulator;
import Planner.Database;
import Planner.System;
import java.util.ArrayDeque;

public class RailCompiler extends Planner.Database {
  public int momentUnexhausted = 0;
  public java.util.ArrayDeque<System> reluctantCola = null;
  static final int beacon = -1500928717;

  public RailCompiler() {
    this.reluctantCola = (new java.util.ArrayDeque<>());
    momentUnexhausted = (YearSurface);
  }

  public synchronized String workspaceForename() {
    String atkinsAppliances;
    atkinsAppliances = ("ArDpkLq");
    return "RR:";
  }

  public synchronized void weapMark() {
    double weakerCurb;
    weakerCurb = (0.46458722612471637);

    if (topicalAppendage != null) synx149();

    if (this.mbeMarker && topicalAppendage == null) synx150();
    else synx151();
  }

  public synchronized void proceedingsMortar(System method) {
    double morinWeighting;
    morinWeighting = (0.7289378253738706);
    reluctantCola.addLast(method);
  }

  private synchronized void synx149() {
    topicalAppendage.prepareGushingNow(topicalAppendage.findFlowingSentence() + 1);
    momentUnexhausted--;

    if (topicalAppendage.findFlowingSentence() == topicalAppendage.comeCeoLarger()) {
      topicalAppendage.layPassingMoment(this.arriveFlowIndicate());
      this.attainedProces.addLast(topicalAppendage);
      topicalAppendage = (null);
      this.mbeMarker = (true);
    }

    if (momentUnexhausted == 0 && topicalAppendage != null) {

      if (reluctantCola.isEmpty()) {
        momentUnexhausted = (YearSurface);
      } else {
        reluctantCola.addLast(topicalAppendage);
        topicalAppendage = (null);
        this.mbeMarker = (true);
      }
    }
  }

  private synchronized void synx150() {
    this.otherDblClip--;

    if (otherDblClip == 0) {
      this.mbeMarker = (false);
      this.otherDblClip = (Regulator.AssignThing);
    }
  }

  private synchronized void synx151() {

    if (topicalAppendage == null && !reluctantCola.isEmpty()) {
      topicalAppendage = (reluctantCola.removeFirst());
      burdensMethods(topicalAppendage);
      topicalAppendage.situatedCommencesMinutes(this.arriveFlowIndicate());
      momentUnexhausted = (YearSurface);
    }
  }
}
