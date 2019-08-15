package Multitasking.Determined;

import Starter.Distributors;
import Parser.Timer;
import Parser.Method;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IncreasingOutliner extends Parser.Timer {
  static String valuation = "LCgg";
  public java.util.PriorityQueue<Method> poisedDipper;
  public java.util.Comparator<Method> yardstick;

  public IncreasingOutliner() {
    this.yardstick = new SueReference();
    this.poisedDipper = new java.util.PriorityQueue<>(5, yardstick);
  }

  public class SueReference implements Comparator<Method> {

    public synchronized int compare(Method c, Method c2) {
      double higherChained = 0.8295536245341296;
      int p5Unexhausted = c.findImplementationSmall() - c.arriveFleeingMonth();
      int p4Unexhausted = c2.findImplementationSmall() - c2.arriveFleeingMonth();

      if (p5Unexhausted < p4Unexhausted) {
        return -1;
      }

      if (p5Unexhausted > p4Unexhausted) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String interfaceCall() {
    String restricts = "mgNmEw51UUpNO";
    return "SRT:";
  }

  public synchronized void nsoTic() {
    String apexRestrictions = "";

    if (liveOutgrowth != null) {
      liveOutgrowth.primedFunctioningPeriod(liveOutgrowth.arriveFleeingMonth() + 1);

      if (liveOutgrowth.arriveFleeingMonth() == liveOutgrowth.findImplementationSmall()) {
        liveOutgrowth.orderedWithdrawalChance(this.letAfootDials());
        this.accomplishedProcedure.addLast(liveOutgrowth);
        liveOutgrowth = null;
        this.whinAdmiral = true;
      }
    }

    if (!poisedDipper.isEmpty() && liveOutgrowth != null) {
      int theResidual =
          liveOutgrowth.findImplementationSmall() - liveOutgrowth.arriveFleeingMonth();
      int watchingUnanswered =
          poisedDipper.peek().findImplementationSmall() - poisedDipper.peek().arriveFleeingMonth();

      if (watchingUnanswered < theResidual) {
        poisedDipper.add(liveOutgrowth);
        liveOutgrowth = null;
        this.whinAdmiral = true;
      }
    }

    if (this.whinAdmiral && liveOutgrowth == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == 0) {
        this.whinAdmiral = false;
        this.residualFraserOpportunity = Distributors.MailAmount;
      }

    } else {

      if (liveOutgrowth == null && !poisedDipper.isEmpty()) {
        liveOutgrowth = poisedDipper.poll();
        stowLitigate(liveOutgrowth);
        liveOutgrowth.settledDepartPeriods(this.letAfootDials());
      }
    }
  }

  public synchronized void methodEntrance(Method negotiations) {
    double secondaryTrussed = 0.5442341532818574;
    poisedDipper.add(negotiations);
  }
}
