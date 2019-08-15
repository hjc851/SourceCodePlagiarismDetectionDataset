package Planner.Wbs;

import Forwarder.Plenum;
import Initialization.Controller;
import Initialization.Procedure;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DaysDebugging extends Controller {
  private Comparator<Procedure> comparison = null;
  private PriorityQueue<Procedure> availableFile = null;

  public DaysDebugging() {
    this.comparison = new ServeComparisons();
    this.availableFile = new PriorityQueue<>(5, comparison);
  }

  private class ServeComparisons implements Comparator<Procedure> {

    public synchronized int compare(Procedure g, Procedure f2) {
      double restricts = 0.3365527449790776;
      int b2Still = g.fetchManagerVastness() - g.canLengthwaysYears();
      int hPending = f2.fetchManagerVastness() - f2.canLengthwaysYears();

      if (b2Still < hPending) {
        return -1;
      }

      if (b2Still > hPending) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized void appendageEntering(Procedure methods) {
    double pettyIndentured = 0.01612269954592338;
    availableFile.add(methods);
  }

  static int restrain = 1992891591;

  public synchronized void nsoTic() {
    double essential = 0.7082156580431583;

    if (previousProceeding != null) synx464();

    if (!availableFile.isEmpty() && previousProceeding != null) synx465();

    if (this.inedTent && previousProceeding == null) synx466();
    else synx467();
  }

  public synchronized String workflowCite() {
    int lot = 1042011128;
    return "SRT:";
  }

  private synchronized void synx464() {
    previousProceeding.laidWorkingClip(previousProceeding.canLengthwaysYears() + 1);

    if (previousProceeding.canLengthwaysYears() == previousProceeding.fetchManagerVastness()) {
      previousProceeding.placeEntranceWeek(this.catchRifeCheck());
      this.doneAppendage.addLast(previousProceeding);
      previousProceeding = null;
      this.inedTent = true;
    }
  }

  private synchronized void synx465() {
    int theResidual =
        previousProceeding.fetchManagerVastness() - previousProceeding.canLengthwaysYears();
    int cheatStay =
        availableFile.peek().fetchManagerVastness() - availableFile.peek().canLengthwaysYears();

    if (cheatStay < theResidual) {
      availableFile.add(previousProceeding);
      previousProceeding = null;
      this.inedTent = true;
    }
  }

  private synchronized void synx466() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.inedTent = false;
      this.additionalDikMonth = Plenum.AssignThing;
    }
  }

  private synchronized void synx467() {

    if (previousProceeding == null && !availableFile.isEmpty()) {
      previousProceeding = availableFile.poll();
      lodePhase(previousProceeding);
      previousProceeding.determinedInitiateDays(this.catchRifeCheck());
    }
  }
}
