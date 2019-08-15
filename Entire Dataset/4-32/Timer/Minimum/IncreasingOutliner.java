package Timer.Minimum;

import Sender.Plenum;
import Planner.Database;
import Planner.Procedure;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IncreasingOutliner extends Database {
  private Comparator<Procedure> comparability;
  private PriorityQueue<Procedure> poisedDipper;

  public IncreasingOutliner() {
    this.comparability = new SystemMatching();
    this.poisedDipper = new PriorityQueue<>(5, comparability);
  }

  private class SystemMatching implements Comparator<Procedure> {

    public synchronized int compare(Procedure a, Procedure bl) {
      int p6Odd;
      int c4Another;
      p6Odd = a.startBizBreadth() - a.arriveFleeingMonth();
      c4Another = bl.startBizBreadth() - bl.arriveFleeingMonth();

      if (p6Odd < c4Another) {
        return -1;
      }

      if (p6Odd > c4Another) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String callbackConstitute() {
    return "SRT:";
  }

  public synchronized void nsoTic() {

    if (actualAct != null) {
      actualAct.fixedContinualOpportunity(actualAct.arriveFleeingMonth() + 1);

      if (actualAct.arriveFleeingMonth() == actualAct.startBizBreadth()) {
        actualAct.adjustPerishMonth(this.canExistingDial());
        this.completionAct.addLast(actualAct);
        actualAct = null;
        this.remoSag = true;
      }
    }

    if (!poisedDipper.isEmpty() && actualAct != null) {
      int formerKeeping;
      int spyStill;
      formerKeeping = actualAct.startBizBreadth() - actualAct.arriveFleeingMonth();
      spyStill = poisedDipper.peek().startBizBreadth() - poisedDipper.peek().arriveFleeingMonth();

      if (spyStill < formerKeeping) {
        poisedDipper.add(actualAct);
        actualAct = null;
        this.remoSag = true;
      }
    }

    if (this.remoSag && actualAct == null) {
      this.unsoldDrieBeginning--;

      if (unsoldDrieBeginning == 0) {
        this.remoSag = false;
        this.unsoldDrieBeginning = Plenum.HitPeriods;
      }

    } else {

      if (actualAct == null && !poisedDipper.isEmpty()) {
        actualAct = poisedDipper.poll();
        ladenWork(actualAct);
        actualAct.dictatedCommenceMeter(this.canExistingDial());
      }
    }
  }

  public synchronized void formalitiesImpending(Procedure method) {
    poisedDipper.add(method);
  }
}
