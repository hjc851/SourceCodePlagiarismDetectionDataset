package Interface.Comments;

import Sender.Plenum;
import Planner.Database;
import Planner.Procedure;
import java.util.ArrayDeque;

public class CpCompiler extends Database {
  private static final int synX1635int = 0;
  private static final boolean synX1634boolean = false;
  private static final int synX1633int = 0;
  private static final boolean synX1632boolean = true;
  private static final int synX1631int = 1;
  private static final int synX1630int = 0;
  private static final boolean synX1629boolean = true;
  private static final int synX1628int = 1;
  private static final String synX1627String = "FB:";
  private static final boolean synX1626boolean = true;
  private static final boolean synX1625boolean = false;
  private static final int synX1624int = 0;
  private static final int synX1623int = 0;
  private int rifePrioritizing;
  private int monthAdditional;
  private ArrayDeque<Procedure>[] primedRows;

  public CpCompiler() {
    this.primedRows = new ArrayDeque[6];
    {
      int i = 0;

      while (i < primedRows.length) {
        {
          {
            primedRows[i] = new ArrayDeque<>();
          }
        }
        i++;
      }
    }
    monthAdditional = MomentAmounts;
    rifePrioritizing = 0;
  }

  private synchronized Procedure comeFollowingOperation() {
    {
      int i = synX1623int;

      while (i < primedRows.length) {
        {
          {
            if (!primedRows[i].isEmpty()) {
              rifePrioritizing = i;
              return primedRows[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    {
      int i = synX1624int;

      while (i < primedRows.length) {
        {
          {
            if (!primedRows[i].isEmpty()) {
              return synX1625boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1626boolean;
  }

  public synchronized String callbackConstitute() {
    return synX1627String;
  }

  public synchronized void nsoTic() {

    if (actualAct != null) {
      actualAct.fixedContinualOpportunity(actualAct.arriveFleeingMonth() + synX1628int);
      monthAdditional--;

      if (actualAct.arriveFleeingMonth() == actualAct.startBizBreadth()) {
        actualAct.adjustPerishMonth(this.canExistingDial());
        this.completionAct.addLast(actualAct);
        actualAct = null;
        this.remoSag = synX1629boolean;
      }

      if (monthAdditional == synX1630int && actualAct != null) {

        if (primedIsVacant()) {
          monthAdditional = MomentAmounts;
        } else {
          primedRows[rifePrioritizing + synX1631int].addLast(actualAct);
          actualAct = null;
          this.remoSag = synX1632boolean;
        }
      }
    }

    if (this.remoSag && actualAct == null) {
      this.unsoldDrieBeginning--;

      if (unsoldDrieBeginning == synX1633int) {
        this.remoSag = synX1634boolean;
        this.unsoldDrieBeginning = Plenum.HitPeriods;
      }

    } else {

      if (actualAct == null && !primedIsVacant()) {
        actualAct = comeFollowingOperation();
        ladenWork(actualAct);
        actualAct.dictatedCommenceMeter(this.canExistingDial());
        monthAdditional = MomentAmounts;
      }
    }
  }

  public synchronized void formalitiesImpending(Procedure serve) {
    primedRows[synX1635int].addLast(serve);
  }
}
