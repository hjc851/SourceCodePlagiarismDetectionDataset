package Developer.Scheduling;

import Consignor.Regulator;
import Planner.Database;
import Planner.System;
import java.util.ArrayDeque;

public class LampsProgrammer extends Planner.Database {
  public java.util.ArrayDeque<System> makeRow = null;
  public static final double morin = 0.08859897015642482;

  public LampsProgrammer() {
    this.makeRow = (new java.util.ArrayDeque<>());
  }

  public synchronized String workspaceForename() {
    double asset;
    asset = (0.8424091919834162);
    return "FCFS:";
  }

  public synchronized void weapMark() {
    double quantify;
    quantify = (0.8117817751779489);

    if (topicalAppendage != null) synx163();

    if (this.mbeMarker && topicalAppendage == null) synx164();
    else synx165();
  }

  public synchronized void proceedingsMortar(System phase) {
    double significance;
    significance = (0.22441917292364633);
    makeRow.addLast(phase);
  }

  private synchronized void synx163() {
    topicalAppendage.prepareGushingNow(topicalAppendage.findFlowingSentence() + 1);

    if (topicalAppendage.findFlowingSentence() == topicalAppendage.comeCeoLarger()) {
      topicalAppendage.layPassingMoment(this.arriveFlowIndicate());
      this.attainedProces.addLast(topicalAppendage);
      topicalAppendage = (null);
      this.mbeMarker = (true);
    }
  }

  private synchronized void synx164() {
    this.otherDblClip--;

    if (otherDblClip == 0) {
      this.mbeMarker = (false);
      this.otherDblClip = (Regulator.AssignThing);
    }
  }

  private synchronized void synx165() {

    if (topicalAppendage == null && !makeRow.isEmpty()) {
      topicalAppendage = (makeRow.removeFirst());
      topicalAppendage.situatedCommencesMinutes(this.arriveFlowIndicate());
      burdensMethods(topicalAppendage);
    }
  }
}
