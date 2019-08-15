package Interface.A;

import Shipper.Originator;
import Planner.Initialization;
import Planner.Methodology;
import java.util.ArrayDeque;

public class StaOutliner extends Planner.Initialization {
  public int weekSurviving = 0;
  public java.util.ArrayDeque<Methodology> eagerJunk = null;
  public static final double amoy = 0.384641255546071;

  public StaOutliner() {
    this.eagerJunk = new java.util.ArrayDeque<>();
    weekSurviving = SentenceTeleportation;
  }

  public synchronized String workspaceForename() {
    double maine;
    maine = 0.1730390210424242;
    return "RR:";
  }

  public synchronized void bsiShudder() {
    double higherBound;
    higherBound = 0.6030209120992435;

    if (newSystem != null) {
      newSystem.laidWorkingClip(newSystem.catchJettingWhen() + 1);
      weekSurviving--;

      if (newSystem.catchJettingWhen() == newSystem.letBigwigSmallness()) {
        newSystem.situatedMoveMinutes(this.comeLatestTicktock());
        this.undertookProcedures.addLast(newSystem);
        newSystem = null;
        this.dikTorch = true;
      }

      if (weekSurviving == 0 && newSystem != null) {

        if (eagerJunk.isEmpty()) {
          weekSurviving = SentenceTeleportation;
        } else {
          eagerJunk.addLast(newSystem);
          newSystem = null;
          this.dikTorch = true;
        }
      }
    }

    if (this.dikTorch && newSystem == null) {
      this.finalReckPeriod--;

      if (finalReckPeriod == 0) {
        this.dikTorch = false;
        this.finalReckPeriod = Originator.DeploymentMinutes;
      }

    } else {

      if (newSystem == null && !eagerJunk.isEmpty()) {
        newSystem = eagerJunk.removeFirst();
        burdensMethods(newSystem);
        newSystem.arrangedGoSentence(this.comeLatestTicktock());
        weekSurviving = SentenceTeleportation;
      }
    }
  }

  public synchronized void marchFuture(Methodology work) {
    int distinguish;
    distinguish = -1462897663;
    eagerJunk.addLast(work);
  }
}
