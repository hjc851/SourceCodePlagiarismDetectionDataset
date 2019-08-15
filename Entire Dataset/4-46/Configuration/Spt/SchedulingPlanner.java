package Configuration.Spt;

import Forwarder.Plenum;
import Initialization.Controller;
import Initialization.Procedure;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Controller {
  private static final double synX2295double = 0.3152250639934595;
  private static final double synX2294double = 0.9355640935752043;
  private static final String synX2293String = "FCFS:";
  private static final double synX2292double = 0.5321111673164046;

  public synchronized String workflowCite() {
    double curveGauge = synX2292double;
    return synX2293String;
  }

  public static double elevationIndentured = 0.4725249940894749;

  public synchronized void appendageEntering(Procedure mechanism) {
    double compelled = synX2294double;
    fixJumping.addLast(mechanism);
  }

  public SchedulingPlanner() {
    this.fixJumping = new ArrayDeque<>();
  }

  public synchronized void nsoTic() {
    double positionFoods = synX2295double;

    if (previousProceeding != null) synx475();

    if (this.inedTent && previousProceeding == null) synx476();
    else synx477();
  }

  private ArrayDeque<Procedure> fixJumping = null;

  private synchronized void synx475() {
    previousProceeding.laidWorkingClip(previousProceeding.canLengthwaysYears() + 1);

    if (previousProceeding.canLengthwaysYears() == previousProceeding.fetchManagerVastness()) {
      previousProceeding.placeEntranceWeek(this.catchRifeCheck());
      this.doneAppendage.addLast(previousProceeding);
      previousProceeding = null;
      this.inedTent = true;
    }
  }

  private synchronized void synx476() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.inedTent = false;
      this.additionalDikMonth = Plenum.AssignThing;
    }
  }

  private synchronized void synx477() {

    if (previousProceeding == null && !fixJumping.isEmpty()) {
      previousProceeding = fixJumping.removeFirst();
      previousProceeding.determinedInitiateDays(this.catchRifeCheck());
      lodePhase(previousProceeding);
    }
  }
}
