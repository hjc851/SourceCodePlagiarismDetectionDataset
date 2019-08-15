package Organizer.Using;

import Caller.Starter;
import Writer.Callback;
import Writer.Negotiations;
import java.util.ArrayDeque;

public class PapsOrganizer extends Writer.Callback {
  private static final boolean synX1741boolean = false;
  private static final int synX1740int = 0;
  private static final boolean synX1739boolean = true;
  private static final int synX1738int = 1;
  private static final String synX1737String = "FCFS:";
  private java.util.ArrayDeque<Negotiations> gonnaDong = null;

  public PapsOrganizer() {
    this.gonnaDong = new java.util.ArrayDeque<>();
  }

  public synchronized String outlinerGens() {
    return synX1737String;
  }

  public synchronized void ourTicktack() {

    if (contemporaryLitigate != null) synx355();

    if (this.dikTorch && contemporaryLitigate == null) synx356();
    else synx357();
  }

  public synchronized void outgrowthSucceeding(Negotiations proceeding) {
    gonnaDong.addLast(proceeding);
  }

  private synchronized void synx355() {
    contemporaryLitigate.determinedScamperingDays(
        contemporaryLitigate.startOperativeMinutes() + synX1738int);

    if (contemporaryLitigate.startOperativeMinutes()
        == contemporaryLitigate.developDirectorStature()) {
      contemporaryLitigate.determinedGoingDays(this.producePrevalentScore());
      this.accomplishedProcedure.addLast(contemporaryLitigate);
      contemporaryLitigate = null;
      this.dikTorch = synX1739boolean;
    }
  }

  private synchronized void synx356() {
    this.lingeringInedThing--;

    if (lingeringInedThing == synX1740int) {
      this.dikTorch = synX1741boolean;
      this.lingeringInedThing = Starter.RoutingWeek;
    }
  }

  private synchronized void synx357() {

    if (contemporaryLitigate == null && !gonnaDong.isEmpty()) {
      contemporaryLitigate = gonnaDong.removeFirst();
      contemporaryLitigate.layFirstMoment(this.producePrevalentScore());
      encumbranceSummons(contemporaryLitigate);
    }
  }
}
