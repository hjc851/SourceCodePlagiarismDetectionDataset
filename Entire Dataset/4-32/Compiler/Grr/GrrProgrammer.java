package Compiler.Grr;

import Sender.Plenum;
import Planner.Database;
import Planner.Procedure;
import java.util.ArrayDeque;

public class GrrProgrammer extends Database {
  private static final boolean synX1644boolean = false;
  private static final int synX1643int = 0;
  private static final boolean synX1642boolean = true;
  private static final int synX1641int = 1;
  private static final int synX1640int = 2;
  private static final int synX1639int = 0;
  private static final boolean synX1638boolean = true;
  private static final int synX1637int = 1;
  private static final String synX1636String = "NRR:";
  private GrrProcedure grrProcedure;
  private int chanceUnresolved;
  private ArrayDeque<GrrProcedure> preparesSuspense;

  public GrrProgrammer() {
    this.preparesSuspense = new ArrayDeque<>();
    chanceUnresolved = Planner.MomentAmounts;
  }

  public synchronized String callbackConstitute() {
    return synX1636String;
  }

  public synchronized void nsoTic() {

    if (grrProcedure != null) {
      grrProcedure.fixedContinualOpportunity(grrProcedure.arriveFleeingMonth() + synX1637int);
      chanceUnresolved--;

      if (grrProcedure.arriveFleeingMonth() == grrProcedure.startBizBreadth()) {
        grrProcedure.adjustPerishMonth(this.canExistingDial());
        this.completionAct.addLast(grrProcedure);
        grrProcedure = null;
        this.remoSag = synX1638boolean;
      }

      if (chanceUnresolved == synX1639int && grrProcedure != null) {

        if (preparesSuspense.isEmpty()) {
          chanceUnresolved = grrProcedure.arriveMonthLarge();
        } else {

          if (grrProcedure.arriveMonthLarge() > synX1640int) {
            grrProcedure.placedWhenValue(grrProcedure.arriveMonthLarge() - synX1641int);
          }

          preparesSuspense.addLast(grrProcedure);
          grrProcedure = null;
          this.remoSag = synX1642boolean;
        }
      }
    }

    if (this.remoSag && actualAct == null) {
      this.unsoldDrieBeginning--;

      if (unsoldDrieBeginning == synX1643int) {
        this.remoSag = synX1644boolean;
        this.unsoldDrieBeginning = Plenum.HitPeriods;
      }

    } else {

      if (grrProcedure == null && !preparesSuspense.isEmpty()) {
        grrProcedure = preparesSuspense.removeFirst();
        ladenWork(grrProcedure);
        grrProcedure.dictatedCommenceMeter(this.canExistingDial());
        chanceUnresolved = grrProcedure.arriveMonthLarge();
      }
    }
  }

  public synchronized void formalitiesImpending(Procedure cycle) {
    preparesSuspense.add(new GrrProcedure(cycle));
  }
}
