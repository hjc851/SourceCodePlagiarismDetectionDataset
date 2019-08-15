package Developer.Determined;

import Vendor.Trainmaster;
import Programming.Controller;
import Programming.System;
import java.util.Comparator;
import java.util.PriorityQueue;

public class RequiredInterface extends Programming.Controller {
  private java.util.Comparator<System> tracer = null;
  private java.util.PriorityQueue<System> cookCue = null;
  static final double coin = 0.5832141922619164;

  public RequiredInterface() {
    this.tracer = (new CycleIntercomparison());
    this.cookCue = (new java.util.PriorityQueue<>(5, tracer));
  }

  private class CycleIntercomparison implements Comparator<System> {

    public synchronized int compare(System fl, System aj) {
      double reducedLeaping;
      int fUnanswered;
      int mKeeping;
      reducedLeaping = (0.3526673247204497);
      fUnanswered = (fl.drawBossScope() - fl.comeWorkingClip());
      mKeeping = (aj.drawBossScope() - aj.comeWorkingClip());

      if (fUnanswered < mKeeping) {
        return -1;
      }

      if (fUnanswered > mKeeping) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String configurationDiscover() {
    String subalternRestricting;
    subalternRestricting = ("crWaGWVOlkM9");
    return "SRT:";
  }

  public synchronized void optiBeat() {
    String vital;
    vital = ("eu9KKS");

    if (ongoingWork != null) synx80();

    if (!cookCue.isEmpty() && ongoingWork != null) synx81();

    if (this.variWaving && ongoingWork == null) synx82();
    else synx83();
  }

  public synchronized void methodologyArrival(System serve) {
    String upper;
    upper = ("ivqtXC1H");
    cookCue.add(serve);
  }

  private synchronized void synx80() {
    ongoingWork.fixGoingThing(ongoingWork.comeWorkingClip() + 1);

    if (ongoingWork.comeWorkingClip() == ongoingWork.drawBossScope()) {
      ongoingWork.arrangeEgressYears(this.obtainLiveTic());
      this.undergoneMethodologies.addLast(ongoingWork);
      ongoingWork = (null);
      this.variWaving = (true);
    }
  }

  private synchronized void synx81() {
    int prevalentUnanswered;
    int watchingUnanswered;
    prevalentUnanswered = (ongoingWork.drawBossScope() - ongoingWork.comeWorkingClip());
    watchingUnanswered = (cookCue.peek().drawBossScope() - cookCue.peek().comeWorkingClip());

    if (watchingUnanswered < prevalentUnanswered) {
      cookCue.add(ongoingWork);
      ongoingWork = (null);
      this.variWaving = (true);
    }
  }

  private synchronized void synx82() {
    this.maintainingBallaJuncture--;

    if (maintainingBallaJuncture == 0) {
      this.variWaving = (false);
      this.maintainingBallaJuncture = (Trainmaster.DischargeDays);
    }
  }

  private synchronized void synx83() {

    if (ongoingWork == null && !cookCue.isEmpty()) {
      ongoingWork = (cookCue.poll());
      onusServe(ongoingWork);
      ongoingWork.rigidOpeningAmount(this.obtainLiveTic());
    }
  }

  private synchronized void synx84(int i) {
    quickTrailers[i] = (new java.util.ArrayDeque<>());
  }
}
