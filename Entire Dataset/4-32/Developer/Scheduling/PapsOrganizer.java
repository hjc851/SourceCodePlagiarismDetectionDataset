package Developer.Scheduling;

import Sender.Plenum;
import Planner.Database;
import Planner.Procedure;
import java.util.ArrayDeque;

public class PapsOrganizer extends Database {
  private static final boolean synX1649boolean = false;
  private static final int synX1648int = 0;
  private static final boolean synX1647boolean = true;
  private static final int synX1646int = 1;
  private static final String synX1645String = "FCFS:";
  private ArrayDeque<Procedure> fixJumping;

  public PapsOrganizer() {
    this.fixJumping = new ArrayDeque<>();
  }

  public synchronized String callbackConstitute() {
    return synX1645String;
  }

  public synchronized void nsoTic() {

    if (actualAct != null) {
      actualAct.fixedContinualOpportunity(actualAct.arriveFleeingMonth() + synX1646int);

      if (actualAct.arriveFleeingMonth() == actualAct.startBizBreadth()) {
        actualAct.adjustPerishMonth(this.canExistingDial());
        this.completionAct.addLast(actualAct);
        actualAct = null;
        this.remoSag = synX1647boolean;
      }
    }

    if (this.remoSag && actualAct == null) {
      this.unsoldDrieBeginning--;

      if (unsoldDrieBeginning == synX1648int) {
        this.remoSag = synX1649boolean;
        this.unsoldDrieBeginning = Plenum.HitPeriods;
      }

    } else {

      if (actualAct == null && !fixJumping.isEmpty()) {
        actualAct = fixJumping.removeFirst();
        actualAct.dictatedCommenceMeter(this.canExistingDial());
        ladenWork(actualAct);
      }
    }
  }

  public synchronized void formalitiesImpending(Procedure outgrowth) {
    fixJumping.addLast(outgrowth);
  }
}
