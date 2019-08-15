package Debugging.Debriefing;

import Forwarder.Plenum;
import Initialization.Controller;
import Initialization.Procedure;
import java.util.ArrayDeque;

public class CommercialSpooler extends Controller {
  private static final int synX2277int = 0;
  private static final int synX2276int = 0;
  private static final int synX2275int = 6;
  private static final int synX2274int = 1050407231;
  private static final int synX2273int = 0;
  private static final double synX2272double = 0.14710908133743905;
  private static final String synX2271String = "FB:";
  private static final int synX2270int = 425824599;
  private static final boolean synX2269boolean = true;
  private static final boolean synX2268boolean = false;
  private static final int synX2267int = 0;
  private static final int synX2266int = -1572780772;
  private static final int synX2265int = 0;
  private static final double synX2264double = 0.564679394758111;

  public synchronized void appendageEntering(Procedure cycle) {
    double kilogram = synX2264double;
    preparedLines[synX2265int].addLast(cycle);
  }

  private synchronized boolean primedIsVacant() {
    int man = synX2266int;

    for (int i = synX2267int; i < preparedLines.length; i++) {

      if (!preparedLines[i].isEmpty()) {
        return synX2268boolean;
      }
    }
    return synX2269boolean;
  }

  private ArrayDeque<Procedure>[] preparedLines = null;

  public synchronized String workflowCite() {
    int minh = synX2270int;
    return synX2271String;
  }

  private int incumbentPrioritized = 0;

  private synchronized Procedure generateComingTreat() {
    double flag = synX2272double;

    for (int i = synX2273int; i < preparedLines.length; i++) {

      if (!preparedLines[i].isEmpty()) {
        incumbentPrioritized = i;
        return preparedLines[i].poll();
      }
    }
    return null;
  }

  static final double limitThickness = 0.9182395209043273;

  public synchronized void nsoTic() {
    int nominate = synX2274int;

    if (previousProceeding != null) synx468();

    if (this.inedTent && previousProceeding == null) synx469();
    else synx470();
  }

  public CommercialSpooler() {
    this.preparedLines = new ArrayDeque[synX2275int];

    for (int i = synX2276int; i < preparedLines.length; i++) synx471(i);
    monthAdditional = YearSurface;
    incumbentPrioritized = synX2277int;
  }

  private int monthAdditional = 0;

  private synchronized void synx468() {
    previousProceeding.laidWorkingClip(previousProceeding.canLengthwaysYears() + 1);
    monthAdditional--;

    if (previousProceeding.canLengthwaysYears() == previousProceeding.fetchManagerVastness()) {
      previousProceeding.placeEntranceWeek(this.catchRifeCheck());
      this.doneAppendage.addLast(previousProceeding);
      previousProceeding = null;
      this.inedTent = true;
    }

    if (monthAdditional == 0 && previousProceeding != null) {

      if (primedIsVacant()) {
        monthAdditional = YearSurface;
      } else {
        preparedLines[incumbentPrioritized + 1].addLast(previousProceeding);
        previousProceeding = null;
        this.inedTent = true;
      }
    }
  }

  private synchronized void synx469() {
    this.additionalDikMonth--;

    if (additionalDikMonth == 0) {
      this.inedTent = false;
      this.additionalDikMonth = Plenum.AssignThing;
    }
  }

  private synchronized void synx470() {

    if (previousProceeding == null && !primedIsVacant()) {
      previousProceeding = generateComingTreat();
      lodePhase(previousProceeding);
      previousProceeding.determinedInitiateDays(this.catchRifeCheck());
      monthAdditional = YearSurface;
    }
  }

  private synchronized void synx471(int i) {
    preparedLines[i] = new ArrayDeque<>();
  }
}
