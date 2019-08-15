package Developer.Long;

import Exporter.Limiter;
import Workspace.Debugging;
import Workspace.Formalities;
import java.util.Comparator;
import java.util.PriorityQueue;

public class AerobicMultitasking extends Debugging {
  private static final boolean synX1285boolean = false;
  private static final int synX1284int = 0;
  private static final boolean synX1283boolean = true;
  private static final boolean synX1282boolean = true;
  private static final int synX1281int = 1;
  private static final double synX1280double = 0.23868964165685003;
  private static final int synX1279int = 5;
  private static final int synX1278int = -1689209620;
  static final String johannesBeam = "UtI7lm4soocggLzy75";
  private PriorityQueue<Formalities> primedWaiting = null;

  public synchronized void marchFuture(Formalities march) {
    int ids;
    ids = synX1278int;
    primedWaiting.add(march);
  }

  public AerobicMultitasking() {
    this.baseline = new WorkBenchmarking();
    this.primedWaiting = new PriorityQueue<>(synX1279int, baseline);
  }

  public synchronized void bpsRetick() {
    double integral;
    integral = synX1280double;

    if (liveOutgrowth != null) {
      liveOutgrowth.layPouringMoment(liveOutgrowth.conveyWalkingAmount() + synX1281int);

      if (liveOutgrowth.conveyWalkingAmount() == liveOutgrowth.arrivePrezWingspan()) {
        liveOutgrowth.fixedEscapeOpportunity(this.receiveContemporaryTicktack());
        this.carriedMechanism.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.allanBanner = synX1282boolean;
      }
    }

    if (!primedWaiting.isEmpty() && liveOutgrowth != null) {
      int ongoingLeftover;
      int eyeballAdditional;
      ongoingLeftover = liveOutgrowth.arrivePrezWingspan() - liveOutgrowth.conveyWalkingAmount();
      eyeballAdditional =
          primedWaiting.peek().arrivePrezWingspan() - primedWaiting.peek().conveyWalkingAmount();

      if (eyeballAdditional < ongoingLeftover) {
        primedWaiting.add(liveOutgrowth);
        liveOutgrowth = null;
        this.allanBanner = synX1283boolean;
      }
    }

    if (this.allanBanner && liveOutgrowth == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == synX1284int) {
        this.allanBanner = synX1285boolean;
        this.leavingBrinWhen = Limiter.RemoveDay;
      }

    } else {

      if (liveOutgrowth == null && !primedWaiting.isEmpty()) {
        liveOutgrowth = primedWaiting.poll();
        consignmentTreat(liveOutgrowth);
        liveOutgrowth.adjustPartMonth(this.receiveContemporaryTicktack());
      }
    }
  }

  private class WorkBenchmarking implements Comparator<Formalities> {

    public synchronized int compare(Formalities g, Formalities ap) {
      double cardinal;
      int pvMaintaining;
      int hPending;
      cardinal = 0.14720999810346747;
      pvMaintaining = g.arrivePrezWingspan() - g.conveyWalkingAmount();
      hPending = ap.arrivePrezWingspan() - ap.conveyWalkingAmount();

      if (pvMaintaining < hPending) {
        return -1;
      }

      if (pvMaintaining > hPending) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String parserFigure() {
    double essential;
    essential = 0.06301123945927889;
    return "SRT:";
  }

  private Comparator<Formalities> baseline = null;
}
