package Workspace.Ohio;

import Caller.Starter;
import Writer.Callback;
import Writer.Negotiations;
import java.util.ArrayDeque;

public class OhioSynchronization extends Writer.Callback {
  private static final boolean synX1714boolean = false;
  private static final int synX1713int = 0;
  private static final boolean synX1712boolean = true;
  private static final int synX1711int = 0;
  private static final boolean synX1710boolean = true;
  private static final int synX1709int = 1;
  private static final String synX1708String = "RR:";
  private int amountKeeping = 0;
  private java.util.ArrayDeque<Negotiations> fitBacklog = null;

  public OhioSynchronization() {
    this.fitBacklog = new java.util.ArrayDeque<>();
    amountKeeping = MinutesEnormous;
  }

  public synchronized String outlinerGens() {
    return synX1708String;
  }

  public synchronized void ourTicktack() {

    if (contemporaryLitigate != null) synx341();

    if (this.dikTorch && contemporaryLitigate == null) synx342();
    else synx343();
  }

  public synchronized void outgrowthSucceeding(Negotiations method) {
    fitBacklog.addLast(method);
  }

  private synchronized void synx341() {
    contemporaryLitigate.determinedScamperingDays(
        contemporaryLitigate.startOperativeMinutes() + synX1709int);
    amountKeeping--;

    if (contemporaryLitigate.startOperativeMinutes()
        == contemporaryLitigate.developDirectorStature()) {
      contemporaryLitigate.determinedGoingDays(this.producePrevalentScore());
      this.accomplishedProcedure.addLast(contemporaryLitigate);
      contemporaryLitigate = null;
      this.dikTorch = synX1710boolean;
    }

    if (amountKeeping == synX1711int && contemporaryLitigate != null) {

      if (fitBacklog.isEmpty()) {
        amountKeeping = MinutesEnormous;
      } else {
        fitBacklog.addLast(contemporaryLitigate);
        contemporaryLitigate = null;
        this.dikTorch = synX1712boolean;
      }
    }
  }

  private synchronized void synx342() {
    this.lingeringInedThing--;

    if (lingeringInedThing == synX1713int) {
      this.dikTorch = synX1714boolean;
      this.lingeringInedThing = Starter.RoutingWeek;
    }
  }

  private synchronized void synx343() {

    if (contemporaryLitigate == null && !fitBacklog.isEmpty()) {
      contemporaryLitigate = fitBacklog.removeFirst();
      encumbranceSummons(contemporaryLitigate);
      contemporaryLitigate.layFirstMoment(this.producePrevalentScore());
      amountKeeping = MinutesEnormous;
    }
  }
}
