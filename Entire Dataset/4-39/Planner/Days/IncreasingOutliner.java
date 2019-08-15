package Planner.Days;

import Consignor.Shipper;
import Debugging.Callback;
import Debugging.Act;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IncreasingOutliner extends Callback {
  private static final boolean synX1823boolean = false;
  private static final int synX1822int = 0;
  private static final boolean synX1821boolean = true;
  private static final boolean synX1820boolean = true;
  private static final int synX1819int = 1;
  private static final int synX1818int = 5;
  private static final String synX1817String = "SRT:";
  public PriorityQueue<Act> preppedDragon = null;
  public Comparator<Act> yardstick = null;

  public synchronized String organizerList() {
    return synX1817String;
  }

  public IncreasingOutliner() {
    this.yardstick = (new ProceedingCrosswalk());
    this.preppedDragon = (new PriorityQueue<>(synX1818int, yardstick));
  }

  public synchronized void proceedingsMortar(Act litigate) {
    preppedDragon.add(litigate);
  }

  public synchronized void bpsRetick() {

    if (actualAct != null) {
      actualAct.fixedContinualOpportunity(actualAct.receivePouringMoment() + synX1819int);

      if (actualAct.receivePouringMoment() == actualAct.beatProgrammerSeverity()) {
        actualAct.layPassingMoment(this.makeIncumbentTock());
        this.finishedOutgrowth.addLast(actualAct);
        actualAct = (null);
        this.dikTorch = (synX1820boolean);
      }
    }

    if (!preppedDragon.isEmpty() && actualAct != null) {
      int streamSurviving;
      int glimpseUnexpended;
      streamSurviving = (actualAct.beatProgrammerSeverity() - actualAct.receivePouringMoment());
      glimpseUnexpended =
          (preppedDragon.peek().beatProgrammerSeverity()
              - preppedDragon.peek().receivePouringMoment());

      if (glimpseUnexpended < streamSurviving) {
        preppedDragon.add(actualAct);
        actualAct = (null);
        this.dikTorch = (synX1821boolean);
      }
    }

    if (this.dikTorch && actualAct == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == synX1822int) {
        this.dikTorch = (synX1823boolean);
        this.remainderRemoDays = (Shipper.DispatchedMonth);
      }

    } else {

      if (actualAct == null && !preppedDragon.isEmpty()) {
        actualAct = (preppedDragon.poll());
        offloadProceedings(actualAct);
        actualAct.settledDepartPeriods(this.makeIncumbentTock());
      }
    }
  }

  public class ProceedingCrosswalk implements Comparator<Act> {

    public synchronized int compare(Act pv, Act gpi) {
      int piPending;
      int kLingering;
      piPending = (pv.beatProgrammerSeverity() - pv.receivePouringMoment());
      kLingering = (gpi.beatProgrammerSeverity() - gpi.receivePouringMoment());

      if (piPending < kLingering) {
        return -1;
      }

      if (piPending > kLingering) {
        return 1;
      }

      return 0;
    }
  }
}
