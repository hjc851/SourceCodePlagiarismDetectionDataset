package Organizer.Sta;

import Sender.Plenum;
import Planner.Database;
import Planner.Procedure;
import java.util.ArrayDeque;

public class XingCallback extends Database {
  private static final boolean synX1622boolean = false;
  private static final int synX1621int = 0;
  private static final boolean synX1620boolean = true;
  private static final int synX1619int = 0;
  private static final boolean synX1618boolean = true;
  private static final int synX1617int = 1;
  private static final String synX1616String = "RR:";
  private int yearsAnother;
  private ArrayDeque<Procedure> waitingList;

  public XingCallback() {
    this.waitingList = new ArrayDeque<>();
    yearsAnother = MomentAmounts;
  }

  public synchronized String callbackConstitute() {
    return synX1616String;
  }

  public synchronized void nsoTic() {

    if (actualAct != null) {
      actualAct.fixedContinualOpportunity(actualAct.arriveFleeingMonth() + synX1617int);
      yearsAnother--;

      if (actualAct.arriveFleeingMonth() == actualAct.startBizBreadth()) {
        actualAct.adjustPerishMonth(this.canExistingDial());
        this.completionAct.addLast(actualAct);
        actualAct = null;
        this.remoSag = synX1618boolean;
      }

      if (yearsAnother == synX1619int && actualAct != null) {

        if (waitingList.isEmpty()) {
          yearsAnother = MomentAmounts;
        } else {
          waitingList.addLast(actualAct);
          actualAct = null;
          this.remoSag = synX1620boolean;
        }
      }
    }

    if (this.remoSag && actualAct == null) {
      this.unsoldDrieBeginning--;

      if (unsoldDrieBeginning == synX1621int) {
        this.remoSag = synX1622boolean;
        this.unsoldDrieBeginning = Plenum.HitPeriods;
      }

    } else {

      if (actualAct == null && !waitingList.isEmpty()) {
        actualAct = waitingList.removeFirst();
        ladenWork(actualAct);
        actualAct.dictatedCommenceMeter(this.canExistingDial());
        yearsAnother = MomentAmounts;
      }
    }
  }

  public synchronized void formalitiesImpending(Procedure proceedings) {
    waitingList.addLast(proceedings);
  }
}
