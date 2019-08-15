package Parser.Ap;

import Forwarder.Plenum;
import Initialization.Controller;
import Initialization.Procedure;
import java.util.ArrayDeque;

public class DinersTimer extends Controller {
  private static final String synX2263String = "RR:";
  private static final double synX2262double = 0.29301038547034486;
  private static final double synX2261double = 0.0849127689175807;
  private static final double synX2260double = 0.4559188224265901;

  public synchronized void appendageEntering(Procedure negotiations) {
    double tedAccessories = synX2260double;
    ripeStandby.addLast(negotiations);
  }

  public synchronized void nsoTic() {
    double little = synX2261double;

    if (previousProceeding != null) synx461();

    if (this.inedTent && previousProceeding == null) synx462();
    else synx463();
  }

  static final double upstreamBorder = 0.37453656159163795;

  public synchronized String workflowCite() {
    double loadRadius = synX2262double;
    return synX2263String;
  }

  private int junctureMaintaining = 0;
  private ArrayDeque<Procedure> ripeStandby = null;

  public DinersTimer() {
    this.ripeStandby = new ArrayDeque<>();
    junctureMaintaining = YearSurface;
  }

  private synchronized void synx461() {
    previousProceeding.laidWorkingClip(previousProceeding.canLengthwaysYears() + 1);
    junctureMaintaining--;

    if (previousProceeding.canLengthwaysYears() == previousProceeding.fetchManagerVastness()) {
      previousProceeding.placeEntranceWeek(this.catchRifeCheck());
      this.doneAppendage.addLast(previousProceeding);
      previousProceeding = null;
      this.inedTent = true;
    }

    if (junctureMaintaining == 0 && previousProceeding != null) {

      if (ripeStandby.isEmpty()) {
        junctureMaintaining = YearSurface;
      } else {
        ripeStandby.addLast(previousProceeding);
        previousProceeding = null;
        this.inedTent = true;
      }
    }
  }

  private synchronized void synx462() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.inedTent = false;
      this.additionalDikMonth = Plenum.AssignThing;
    }
  }

  private synchronized void synx463() {

    if (previousProceeding == null && !ripeStandby.isEmpty()) {
      previousProceeding = ripeStandby.removeFirst();
      lodePhase(previousProceeding);
      previousProceeding.determinedInitiateDays(this.catchRifeCheck());
      junctureMaintaining = YearSurface;
    }
  }
}
