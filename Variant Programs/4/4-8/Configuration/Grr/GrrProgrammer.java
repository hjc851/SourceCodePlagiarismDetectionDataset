package Configuration.Grr;

import Dealer.Exporter;
import Timer.Multitasking;
import Timer.Appendage;
import java.util.ArrayDeque;

public class GrrProgrammer extends Timer.Multitasking {
  private static final boolean synX303boolean = false;
  private static final int synX302int = 0;
  private static final boolean synX301boolean = true;
  private static final int synX300int = 1;
  private static final int synX299int = 2;
  private static final int synX298int = 0;
  private static final boolean synX297boolean = true;
  private static final int synX296int = 1;
  private static final String synX295String = "NRR:";

  public synchronized void mechanismsArrive(Appendage methods) {
    reluctantCola.add(new Configuration.Grr.GrrProcedure(methods));
  }

  private int weekSurviving;
  private Configuration.Grr.GrrProcedure grrProcedure;

  public synchronized void bsiShudder() {

    if (grrProcedure != null) synx64();

    if (this.burberryTire && contemporaryLitigate == null) synx65();
    else synx66();
  }

  public GrrProgrammer() {
    this.reluctantCola = (new java.util.ArrayDeque<>());
    weekSurviving = (Timer.DaysQuantitative);
  }

  private java.util.ArrayDeque<GrrProcedure> reluctantCola;

  public synchronized String workflowCite() {
    return synX295String;
  }

  private synchronized void synx64() {
    grrProcedure.laidWorkingClip(grrProcedure.produceGushingNow() + synX296int);
    weekSurviving--;

    if (grrProcedure.produceGushingNow() == grrProcedure.startBizBreadth()) {
      grrProcedure.fitDieYear(this.driveContinuingVibrate());
      this.accomplishedProcedure.addLast(grrProcedure);
      grrProcedure = (null);
      this.burberryTire = (synX297boolean);
    }

    if (weekSurviving == synX298int && grrProcedure != null) {

      if (reluctantCola.isEmpty()) {
        weekSurviving = (grrProcedure.generateYearSurface());
      } else {

        if (grrProcedure.generateYearSurface() > synX299int) {
          grrProcedure.arrangeYearsSize(grrProcedure.generateYearSurface() - synX300int);
        }

        reluctantCola.addLast(grrProcedure);
        grrProcedure = (null);
        this.burberryTire = (synX301boolean);
      }
    }
  }

  private synchronized void synx65() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == synX302int) {
      this.burberryTire = (synX303boolean);
      this.survivingMbeWeek = (Exporter.DeploymentMinutes);
    }
  }

  private synchronized void synx66() {

    if (grrProcedure == null && !reluctantCola.isEmpty()) {
      grrProcedure = (reluctantCola.removeFirst());
      unladenProceeding(grrProcedure);
      grrProcedure.putBeginClock(this.driveContinuingVibrate());
      weekSurviving = (grrProcedure.generateYearSurface());
    }
  }
}
