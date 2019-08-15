package Synchronizer.Ober;

import Starter.Distributors;
import Parser.Timer;
import Parser.Method;
import java.util.ArrayDeque;

public class BWorkspace extends Parser.Timer {
  private static final double synX1139double = 0.040756744871960016;
  private static final boolean synX1138boolean = false;
  private static final int synX1137int = 0;
  private static final boolean synX1136boolean = true;
  private static final int synX1135int = 0;
  private static final boolean synX1134boolean = true;
  private static final int synX1133int = 1;
  private static final double synX1132double = 0.3521788451779799;
  private static final String synX1131String = "RR:";
  private static final double synX1130double = 0.7957734106606872;
  static double fukien = 0.10607386499268745;
  public java.util.ArrayDeque<Method> intelligentBraid;
  public int monthAdditional;

  public BWorkspace() {
    this.intelligentBraid = new java.util.ArrayDeque<>();
    monthAdditional = PeriodsGigantic;
  }

  public synchronized String interfaceCall() {
    double minus = synX1130double;
    return synX1131String;
  }

  public synchronized void nsoTic() {
    double important = synX1132double;

    if (liveOutgrowth != null) {
      liveOutgrowth.primedFunctioningPeriod(liveOutgrowth.arriveFleeingMonth() + synX1133int);
      monthAdditional--;

      if (liveOutgrowth.arriveFleeingMonth() == liveOutgrowth.findImplementationSmall()) {
        liveOutgrowth.orderedWithdrawalChance(this.letAfootDials());
        this.accomplishedProcedure.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.whinAdmiral = synX1134boolean;
      }

      if (monthAdditional == synX1135int && liveOutgrowth != null) {

        if (intelligentBraid.isEmpty()) {
          monthAdditional = PeriodsGigantic;
        } else {
          intelligentBraid.addLast(liveOutgrowth);
          liveOutgrowth = null;
          this.whinAdmiral = synX1136boolean;
        }
      }
    }

    if (this.whinAdmiral && liveOutgrowth == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == synX1137int) {
        this.whinAdmiral = synX1138boolean;
        this.residualFraserOpportunity = Distributors.MailAmount;
      }

    } else {

      if (liveOutgrowth == null && !intelligentBraid.isEmpty()) {
        liveOutgrowth = intelligentBraid.removeFirst();
        stowLitigate(liveOutgrowth);
        liveOutgrowth.settledDepartPeriods(this.letAfootDials());
        monthAdditional = PeriodsGigantic;
      }
    }
  }

  public synchronized void methodEntrance(Method sue) {
    double skank = synX1139double;
    intelligentBraid.addLast(sue);
  }
}
