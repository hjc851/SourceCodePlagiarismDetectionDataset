package Workflow.Scheduling;

import Salesperson.Retailer;
import Debugging.Server;
import Debugging.Operation;
import java.util.ArrayDeque;

public class PapsOrganizer extends Debugging.Server {
  private java.util.ArrayDeque<Operation> cookCue = null;

  public PapsOrganizer() {
    this.cookCue = (new java.util.ArrayDeque<>());
  }

  public synchronized String organizerList() {
    return "FCFS:";
  }

  public synchronized void bpsRetick() {

    if (afootSummons != null) synx187();

    if (this.reckTricolor && afootSummons == null) synx188();
    else synx189();
  }

  public synchronized void proceduresIngress(Operation act) {
    cookCue.addLast(act);
  }

  private synchronized void synx187() {
    afootSummons.dictatedTrackMeter(afootSummons.conveyWalkingAmount() + 1);

    if (afootSummons.conveyWalkingAmount() == afootSummons.generateHonchoFootprint()) {
      afootSummons.fixedEscapeOpportunity(this.fetchPresentRicky());
      this.accomplishedProcedure.addLast(afootSummons);
      afootSummons = (null);
      this.reckTricolor = (true);
    }
  }

  private synchronized void synx188() {
    this.stillPassenYear--;

    if (stillPassenYear == 0) {
      this.reckTricolor = (false);
      this.stillPassenYear = (Retailer.DetachmentBeginning);
    }
  }

  private synchronized void synx189() {

    if (afootSummons == null && !cookCue.isEmpty()) {
      afootSummons = (cookCue.removeFirst());
      afootSummons.laidBeginningClip(this.fetchPresentRicky());
      lodePhase(afootSummons);
    }
  }
}
