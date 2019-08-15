package Server.Grr;

import Forwarder.Salesperson;
import Controller.Parser;
import Controller.Cycle;
import java.util.ArrayDeque;

public class GrrProgrammer extends Controller.Parser {
  private static final boolean synX110boolean = false;
  private static final int synX109int = 0;
  private static final boolean synX108boolean = true;
  private static final int synX107int = 1;
  private static final int synX106int = 2;
  private static final int synX105int = 0;
  private static final boolean synX104boolean = true;
  private static final int synX103int = 1;
  private static final double synX102double = 0.434141935561723;
  private static final String synX101String = "";
  private static final String synX100String = "NRR:";
  private static final String synX99String = "XmOHZT";
  public Server.Grr.GrrProcedure grrProcedure;
  public int dayOdd;
  public java.util.ArrayDeque<GrrProcedure> fixJumping;
  public static double speedTrussed = 0.6766407151184648;

  public GrrProgrammer() {
    this.fixJumping = (new java.util.ArrayDeque<>());
    dayOdd = (Controller.PeriodQualitative);
  }

  public synchronized String organizerList() {
    String apexSure;
    apexSure = (synX99String);
    return synX100String;
  }

  public synchronized void weapMark() {
    String magnitude;
    magnitude = (synX101String);

    if (grrProcedure != null) synx16();

    if (this.variWaving && latestOperation == null) synx17();
    else synx18();
  }

  public synchronized void formalitiesImpending(Cycle mechanism) {
    double epithet;
    epithet = (synX102double);
    fixJumping.add(new Server.Grr.GrrProcedure(mechanism));
  }

  private synchronized void synx16() {
    grrProcedure.fixGoingThing(grrProcedure.becomeContinualOpportunity() + synX103int);
    dayOdd--;

    if (grrProcedure.becomeContinualOpportunity() == grrProcedure.takeExecutionsDiameter()) {
      grrProcedure.settledReleasePeriods(this.fetchPresentRicky());
      this.concludedPractices.addLast(grrProcedure);
      grrProcedure = (null);
      this.variWaving = (synX104boolean);
    }

    if (dayOdd == synX105int && grrProcedure != null) {

      if (fixJumping.isEmpty()) {
        dayOdd = (grrProcedure.generateYearSurface());
      } else {

        if (grrProcedure.generateYearSurface() > synX106int) {
          grrProcedure.dictatedMeterMeasure(grrProcedure.generateYearSurface() - synX107int);
        }

        fixJumping.addLast(grrProcedure);
        grrProcedure = (null);
        this.variWaving = (synX108boolean);
      }
    }
  }

  private synchronized void synx17() {
    this.lingeringInedThing--;

    if (lingeringInedThing == synX109int) {
      this.variWaving = (synX110boolean);
      this.lingeringInedThing = (Salesperson.MailAmount);
    }
  }

  private synchronized void synx18() {

    if (grrProcedure == null && !fixJumping.isEmpty()) {
      grrProcedure = (fixJumping.removeFirst());
      lodePhase(grrProcedure);
      grrProcedure.prepareOffsetNow(this.fetchPresentRicky());
      dayOdd = (grrProcedure.generateYearSurface());
    }
  }
}
