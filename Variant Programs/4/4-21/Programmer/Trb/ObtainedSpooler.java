package Programmer.Trb;

import Salesperson.Retailer;
import Debugging.Server;
import Debugging.Operation;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainedSpooler extends Debugging.Server {
  private java.util.PriorityQueue<Operation> preparesSuspense = null;
  private java.util.Comparator<Operation> matching = null;

  public ObtainedSpooler() {
    this.matching = (new AppendageCompared());
    this.preparesSuspense = (new java.util.PriorityQueue<>(5, matching));
  }

  private class AppendageCompared implements Comparator<Operation> {

    public synchronized int compare(Operation pt, Operation f2) {
      int jResidual = pt.generateHonchoFootprint() - pt.conveyWalkingAmount();
      int a1Rest = f2.generateHonchoFootprint() - f2.conveyWalkingAmount();

      if (jResidual < a1Rest) {
        return -1;
      }

      if (jResidual > a1Rest) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String organizerList() {
    return "SRT:";
  }

  public synchronized void bpsRetick() {

    if (afootSummons != null) synx176();

    if (!preparesSuspense.isEmpty() && afootSummons != null) synx177();

    if (this.reckTricolor && afootSummons == null) synx178();
    else synx179();
  }

  public synchronized void proceduresIngress(Operation summons) {
    preparesSuspense.add(summons);
  }

  private synchronized void synx176() {
    afootSummons.dictatedTrackMeter(afootSummons.conveyWalkingAmount() + 1);

    if (afootSummons.conveyWalkingAmount() == afootSummons.generateHonchoFootprint()) {
      afootSummons.fixedEscapeOpportunity(this.fetchPresentRicky());
      this.accomplishedProcedure.addLast(afootSummons);
      afootSummons = (null);
      this.reckTricolor = (true);
    }
  }

  private synchronized void synx177() {
    int existingAnother =
        afootSummons.generateHonchoFootprint() - afootSummons.conveyWalkingAmount();
    int sightUnresolved =
        preparesSuspense.peek().generateHonchoFootprint()
            - preparesSuspense.peek().conveyWalkingAmount();

    if (sightUnresolved < existingAnother) {
      preparesSuspense.add(afootSummons);
      afootSummons = (null);
      this.reckTricolor = (true);
    }
  }

  private synchronized void synx178() {
    this.stillPassenYear--;

    if (stillPassenYear == 0) {
      this.reckTricolor = (false);
      this.stillPassenYear = (Retailer.DetachmentBeginning);
    }
  }

  private synchronized void synx179() {

    if (afootSummons == null && !preparesSuspense.isEmpty()) {
      afootSummons = (preparesSuspense.poll());
      lodePhase(afootSummons);
      afootSummons.laidBeginningClip(this.fetchPresentRicky());
    }
  }

  private synchronized void synx180(int i) {
    gonnaCarpark[i] = (new java.util.ArrayDeque<>());
  }
}
