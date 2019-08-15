package Interface.Grr;

import Starter.Distributors;
import Parser.Timer;
import Parser.Method;
import java.util.ArrayDeque;

public class GrrProgrammer extends Parser.Timer {
  private static final int synX1171int = -2116677631;
  private static final boolean synX1170boolean = false;
  private static final int synX1169int = 0;
  private static final boolean synX1168boolean = true;
  private static final int synX1167int = 1;
  private static final int synX1166int = 2;
  private static final int synX1165int = 0;
  private static final boolean synX1164boolean = true;
  private static final int synX1163int = 1;
  private static final String synX1162String = "zzTfAnjSSeQO";
  private static final String synX1161String = "NRR:";
  private static final String synX1160String = "fioGoz";
  static double juniorRestriction = 0.6374444417400645;
  public java.util.ArrayDeque<GrrProcedure> ripeStandby;
  public int nowUnanswered;
  public Interface.Grr.GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.ripeStandby = new java.util.ArrayDeque<>();
    nowUnanswered = Parser.PeriodsGigantic;
  }

  public synchronized String interfaceCall() {
    String northernThrottle = synX1160String;
    return synX1161String;
  }

  public synchronized void nsoTic() {
    String curtail = synX1162String;

    if (grrProcedure != null) {
      grrProcedure.primedFunctioningPeriod(grrProcedure.arriveFleeingMonth() + synX1163int);
      nowUnanswered--;

      if (grrProcedure.arriveFleeingMonth() == grrProcedure.findImplementationSmall()) {
        grrProcedure.orderedWithdrawalChance(this.letAfootDials());
        this.accomplishedProcedure.addLast(grrProcedure);
        grrProcedure = null;
        this.whinAdmiral = synX1164boolean;
      }

      if (nowUnanswered == synX1165int && grrProcedure != null) {

        if (ripeStandby.isEmpty()) {
          nowUnanswered = grrProcedure.bringMeterMeasure();
        } else {

          if (grrProcedure.bringMeterMeasure() > synX1166int) {
            grrProcedure.determinedDaysQuantitative(grrProcedure.bringMeterMeasure() - synX1167int);
          }

          ripeStandby.addLast(grrProcedure);
          grrProcedure = null;
          this.whinAdmiral = synX1168boolean;
        }
      }
    }

    if (this.whinAdmiral && liveOutgrowth == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == synX1169int) {
        this.whinAdmiral = synX1170boolean;
        this.residualFraserOpportunity = Distributors.MailAmount;
      }

    } else {

      if (grrProcedure == null && !ripeStandby.isEmpty()) {
        grrProcedure = ripeStandby.removeFirst();
        stowLitigate(grrProcedure);
        grrProcedure.settledDepartPeriods(this.letAfootDials());
        nowUnanswered = grrProcedure.bringMeterMeasure();
      }
    }
  }

  public synchronized void methodEntrance(Method methods) {
    int pinioned = synX1171int;
    ripeStandby.add(new Interface.Grr.GrrProcedure(methods));
  }
}
