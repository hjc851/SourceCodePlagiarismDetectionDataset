package Spreadsheet.Obtaining;

import Starter.Forwarder;
import Multitasking.Debugging;
import Multitasking.Methods;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DesiredSpreadsheet extends Debugging {
  private PriorityQueue<Methods> willingSpooler;
  private Comparator<Methods> footnote;

  public DesiredSpreadsheet() {
    this.footnote = new OperationComparative();
    this.willingSpooler = new PriorityQueue<>(5, footnote);
  }

  private class OperationComparative implements Comparator<Methods> {

    public synchronized int compare(Methods interferon, Methods g) {
      int pvMaintaining = interferon.sustainOfficerImmensity() - interferon.drawSpurtingWeek();
      int fResidual = g.sustainOfficerImmensity() - g.drawSpurtingWeek();

      if (pvMaintaining < fResidual) {
        return -1;
      }

      if (pvMaintaining > fResidual) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String timerMention() {
    return "SRT:";
  }

  public synchronized void bpsRetick() {

    if (continuingMechanisms != null) synx320();

    if (!willingSpooler.isEmpty() && continuingMechanisms != null) synx321();

    if (this.ballaBrigade && continuingMechanisms == null) synx322();
    else synx323();
  }

  public synchronized void treatInfluent(Methods sue) {
    willingSpooler.add(sue);
  }

  private synchronized void synx320() {
    continuingMechanisms.determineLinearBeginning(continuingMechanisms.drawSpurtingWeek() + 1);

    if (continuingMechanisms.drawSpurtingWeek() == continuingMechanisms.sustainOfficerImmensity()) {
      continuingMechanisms.primedExpirationPeriod(this.goPrevailingClick());
      this.executedMethods.addLast(continuingMechanisms);
      continuingMechanisms = null;
      this.ballaBrigade = true;
    }
  }

  private synchronized void synx321() {
    int previousStay =
        continuingMechanisms.sustainOfficerImmensity() - continuingMechanisms.drawSpurtingWeek();
    int readRetaining =
        willingSpooler.peek().sustainOfficerImmensity() - willingSpooler.peek().drawSpurtingWeek();

    if (readRetaining < previousStay) {
      willingSpooler.add(continuingMechanisms);
      continuingMechanisms = null;
      this.ballaBrigade = true;
    }
  }

  private synchronized void synx322() {
    this.maintainingBallaJuncture--;

    if (maintainingBallaJuncture == 0) {
      this.ballaBrigade = false;
      this.maintainingBallaJuncture = Forwarder.ShipmentClip;
    }
  }

  private synchronized void synx323() {

    if (continuingMechanisms == null && !willingSpooler.isEmpty()) {
      continuingMechanisms = willingSpooler.poll();
      stowLitigate(continuingMechanisms);
      continuingMechanisms.placedJumpWhen(this.goPrevailingClick());
    }
  }

  private synchronized void synx324(int i) {
    ableThrongs[i] = new ArrayDeque<>();
  }
}
