package Programming.Obtained;

import Caller.Starter;
import Writer.Callback;
import Writer.Negotiations;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DaysDebugging extends Writer.Callback {
  private java.util.Comparator<Negotiations> comparaison = null;
  private java.util.PriorityQueue<Negotiations> ripeStandby = null;

  public DaysDebugging() {
    this.comparaison = new NegotiationsWitness();
    this.ripeStandby = new java.util.PriorityQueue<>(5, comparaison);
  }

  private class NegotiationsWitness implements Comparator<Negotiations> {

    public synchronized int compare(Negotiations p3, Negotiations g) {
      int fUnanswered;
      int c2Unresolved;
      fUnanswered = p3.developDirectorStature() - p3.startOperativeMinutes();
      c2Unresolved = g.developDirectorStature() - g.startOperativeMinutes();

      if (fUnanswered < c2Unresolved) {
        return -1;
      }

      if (fUnanswered > c2Unresolved) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String outlinerGens() {
    return "SRT:";
  }

  public synchronized void ourTicktack() {

    if (contemporaryLitigate != null) synx344();

    if (!ripeStandby.isEmpty() && contemporaryLitigate != null) synx345();

    if (this.dikTorch && contemporaryLitigate == null) synx346();
    else synx347();
  }

  public synchronized void outgrowthSucceeding(Negotiations march) {
    ripeStandby.add(march);
  }

  private synchronized void synx344() {
    contemporaryLitigate.determinedScamperingDays(contemporaryLitigate.startOperativeMinutes() + 1);

    if (contemporaryLitigate.startOperativeMinutes()
        == contemporaryLitigate.developDirectorStature()) {
      contemporaryLitigate.determinedGoingDays(this.producePrevalentScore());
      this.accomplishedProcedure.addLast(contemporaryLitigate);
      contemporaryLitigate = null;
      this.dikTorch = true;
    }
  }

  private synchronized void synx345() {
    int ongoingLeftover;
    int watchRest;
    ongoingLeftover =
        contemporaryLitigate.developDirectorStature()
            - contemporaryLitigate.startOperativeMinutes();
    watchRest =
        ripeStandby.peek().developDirectorStature() - ripeStandby.peek().startOperativeMinutes();

    if (watchRest < ongoingLeftover) {
      ripeStandby.add(contemporaryLitigate);
      contemporaryLitigate = null;
      this.dikTorch = true;
    }
  }

  private synchronized void synx346() {
    this.lingeringInedThing--;

    if (lingeringInedThing == 0) {
      this.dikTorch = false;
      this.lingeringInedThing = Starter.RoutingWeek;
    }
  }

  private synchronized void synx347() {

    if (contemporaryLitigate == null && !ripeStandby.isEmpty()) {
      contemporaryLitigate = ripeStandby.poll();
      encumbranceSummons(contemporaryLitigate);
      contemporaryLitigate.layFirstMoment(this.producePrevalentScore());
    }
  }

  private synchronized void synx348(int i) {
    poisedBottleneck[i] = new java.util.ArrayDeque<>();
  }
}
