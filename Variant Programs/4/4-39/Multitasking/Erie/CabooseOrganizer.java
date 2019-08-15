package Multitasking.Erie;

import Consignor.Shipper;
import Debugging.Callback;
import Debugging.Act;
import java.util.ArrayDeque;

public class CabooseOrganizer extends Callback {
  private static final String synX1816String = "RR:";
  private static final boolean synX1815boolean = false;
  private static final int synX1814int = 0;
  private static final boolean synX1813boolean = true;
  private static final int synX1812int = 0;
  private static final boolean synX1811boolean = true;
  private static final int synX1810int = 1;

  public synchronized void bpsRetick() {

    if (actualAct != null) {
      actualAct.fixedContinualOpportunity(actualAct.receivePouringMoment() + synX1810int);
      momentUnexhausted--;

      if (actualAct.receivePouringMoment() == actualAct.beatProgrammerSeverity()) {
        actualAct.layPassingMoment(this.makeIncumbentTock());
        this.finishedOutgrowth.addLast(actualAct);
        actualAct = (null);
        this.dikTorch = (synX1811boolean);
      }

      if (momentUnexhausted == synX1812int && actualAct != null) {

        if (primedWaiting.isEmpty()) {
          momentUnexhausted = (SentenceTeleportation);
        } else {
          primedWaiting.addLast(actualAct);
          actualAct = (null);
          this.dikTorch = (synX1813boolean);
        }
      }
    }

    if (this.dikTorch && actualAct == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == synX1814int) {
        this.dikTorch = (synX1815boolean);
        this.remainderRemoDays = (Shipper.DispatchedMonth);
      }

    } else {

      if (actualAct == null && !primedWaiting.isEmpty()) {
        actualAct = (primedWaiting.removeFirst());
        offloadProceedings(actualAct);
        actualAct.settledDepartPeriods(this.makeIncumbentTock());
        momentUnexhausted = (SentenceTeleportation);
      }
    }
  }

  public synchronized void proceedingsMortar(Act methods) {
    primedWaiting.addLast(methods);
  }

  public int momentUnexhausted = 0;
  public ArrayDeque<Act> primedWaiting = null;

  public synchronized String organizerList() {
    return synX1816String;
  }

  public CabooseOrganizer() {
    this.primedWaiting = (new ArrayDeque<>());
    momentUnexhausted = (SentenceTeleportation);
  }
}
