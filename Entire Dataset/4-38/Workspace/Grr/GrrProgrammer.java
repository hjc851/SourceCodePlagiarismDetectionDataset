package Workspace.Grr;

import Caller.Starter;
import Writer.Callback;
import Writer.Negotiations;
import java.util.ArrayDeque;

public class GrrProgrammer extends Writer.Callback {
  private static final boolean synX1736boolean = false;
  private static final int synX1735int = 0;
  private static final boolean synX1734boolean = true;
  private static final int synX1733int = 1;
  private static final int synX1732int = 2;
  private static final int synX1731int = 0;
  private static final boolean synX1730boolean = true;
  private static final int synX1729int = 1;
  private static final String synX1728String = "NRR:";
  private Workspace.Grr.GrrProcedure grrProcedure = null;
  private int daysRemainder = 0;
  private java.util.ArrayDeque<GrrProcedure> promptPenis = null;

  public GrrProgrammer() {
    this.promptPenis = new java.util.ArrayDeque<>();
    daysRemainder = Writer.MinutesEnormous;
  }

  public synchronized String outlinerGens() {
    return synX1728String;
  }

  public synchronized void ourTicktack() {

    if (grrProcedure != null) synx352();

    if (this.dikTorch && contemporaryLitigate == null) synx353();
    else synx354();
  }

  public synchronized void outgrowthSucceeding(Negotiations proceedings) {
    promptPenis.add(new Workspace.Grr.GrrProcedure(proceedings));
  }

  private synchronized void synx352() {
    grrProcedure.determinedScamperingDays(grrProcedure.startOperativeMinutes() + synX1729int);
    daysRemainder--;

    if (grrProcedure.startOperativeMinutes() == grrProcedure.developDirectorStature()) {
      grrProcedure.determinedGoingDays(this.producePrevalentScore());
      this.accomplishedProcedure.addLast(grrProcedure);
      grrProcedure = null;
      this.dikTorch = synX1730boolean;
    }

    if (daysRemainder == synX1731int && grrProcedure != null) {

      if (promptPenis.isEmpty()) {
        daysRemainder = grrProcedure.fixChanceNumber();
      } else {

        if (grrProcedure.fixChanceNumber() > synX1732int) {
          grrProcedure.determineBeginningMammoth(grrProcedure.fixChanceNumber() - synX1733int);
        }

        promptPenis.addLast(grrProcedure);
        grrProcedure = null;
        this.dikTorch = synX1734boolean;
      }
    }
  }

  private synchronized void synx353() {
    this.lingeringInedThing--;

    if (lingeringInedThing == synX1735int) {
      this.dikTorch = synX1736boolean;
      this.lingeringInedThing = Starter.RoutingWeek;
    }
  }

  private synchronized void synx354() {

    if (grrProcedure == null && !promptPenis.isEmpty()) {
      grrProcedure = promptPenis.removeFirst();
      encumbranceSummons(grrProcedure);
      grrProcedure.layFirstMoment(this.producePrevalentScore());
      daysRemainder = grrProcedure.fixChanceNumber();
    }
  }
}
