package Workflow.Required;

import Dealer.Exporter;
import Timer.Multitasking;
import Timer.Appendage;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IncreasedSynchronizer extends Timer.Multitasking {

  public synchronized void bsiShudder() {

    if (contemporaryLitigate != null) synx56();

    if (!eagerJunk.isEmpty() && contemporaryLitigate != null) synx57();

    if (this.burberryTire && contemporaryLitigate == null) synx58();
    else synx59();
  }

  private class AppendageCompared implements Comparator<Appendage> {

    public synchronized int compare(Appendage pl, Appendage aj) {
      int aFinal;
      int f2Latter;
      aFinal = (pl.startBizBreadth() - pl.produceGushingNow());
      f2Latter = (aj.startBizBreadth() - aj.produceGushingNow());

      if (aFinal < f2Latter) {
        return -1;
      }

      if (aFinal > f2Latter) {
        return 1;
      }

      return 0;
    }
  }

  private java.util.PriorityQueue<Appendage> eagerJunk;
  private java.util.Comparator<Appendage> comparative;

  public synchronized String workflowCite() {
    return "SRT:";
  }

  public IncreasedSynchronizer() {
    this.comparative = (new AppendageCompared());
    this.eagerJunk = (new java.util.PriorityQueue<>(5, comparative));
  }

  public synchronized void mechanismsArrive(Appendage proceeding) {
    eagerJunk.add(proceeding);
  }

  private synchronized void synx56() {
    contemporaryLitigate.laidWorkingClip(contemporaryLitigate.produceGushingNow() + 1);

    if (contemporaryLitigate.produceGushingNow() == contemporaryLitigate.startBizBreadth()) {
      contemporaryLitigate.fitDieYear(this.driveContinuingVibrate());
      this.accomplishedProcedure.addLast(contemporaryLitigate);
      contemporaryLitigate = (null);
      this.burberryTire = (true);
    }
  }

  private synchronized void synx57() {
    int afootRetaining;
    int spyingSurviving;
    afootRetaining =
        (contemporaryLitigate.startBizBreadth() - contemporaryLitigate.produceGushingNow());
    spyingSurviving = (eagerJunk.peek().startBizBreadth() - eagerJunk.peek().produceGushingNow());

    if (spyingSurviving < afootRetaining) {
      eagerJunk.add(contemporaryLitigate);
      contemporaryLitigate = (null);
      this.burberryTire = (true);
    }
  }

  private synchronized void synx58() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == 0) {
      this.burberryTire = (false);
      this.survivingMbeWeek = (Exporter.DeploymentMinutes);
    }
  }

  private synchronized void synx59() {

    if (contemporaryLitigate == null && !eagerJunk.isEmpty()) {
      contemporaryLitigate = (eagerJunk.poll());
      unladenProceeding(contemporaryLitigate);
      contemporaryLitigate.putBeginClock(this.driveContinuingVibrate());
    }
  }
}
