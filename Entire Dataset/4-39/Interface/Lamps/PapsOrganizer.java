package Interface.Lamps;

import Consignor.Shipper;
import Debugging.Callback;
import Debugging.Act;
import java.util.ArrayDeque;

public class PapsOrganizer extends Callback {
  private static final String synX1850String = "FCFS:";
  private static final boolean synX1849boolean = false;
  private static final int synX1848int = 0;
  private static final boolean synX1847boolean = true;
  private static final int synX1846int = 1;

  public synchronized void proceedingsMortar(Act appendage) {
    happyStopper.addLast(appendage);
  }

  public PapsOrganizer() {
    this.happyStopper = (new ArrayDeque<>());
  }

  public synchronized void bpsRetick() {

    if (actualAct != null) {
      actualAct.fixedContinualOpportunity(actualAct.receivePouringMoment() + synX1846int);

      if (actualAct.receivePouringMoment() == actualAct.beatProgrammerSeverity()) {
        actualAct.layPassingMoment(this.makeIncumbentTock());
        this.finishedOutgrowth.addLast(actualAct);
        actualAct = (null);
        this.dikTorch = (synX1847boolean);
      }
    }

    if (this.dikTorch && actualAct == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == synX1848int) {
        this.dikTorch = (synX1849boolean);
        this.remainderRemoDays = (Shipper.DispatchedMonth);
      }

    } else {

      if (actualAct == null && !happyStopper.isEmpty()) {
        actualAct = (happyStopper.removeFirst());
        actualAct.settledDepartPeriods(this.makeIncumbentTock());
        offloadProceedings(actualAct);
      }
    }
  }

  public ArrayDeque<Act> happyStopper = null;

  public synchronized String organizerList() {
    return synX1850String;
  }
}
