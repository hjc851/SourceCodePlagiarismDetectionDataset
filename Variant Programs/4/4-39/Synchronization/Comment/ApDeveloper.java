package Synchronization.Comment;

import Consignor.Shipper;
import Debugging.Callback;
import Debugging.Act;
import java.util.ArrayDeque;

public class ApDeveloper extends Callback {
  private static final int synX1836int = 0;
  private static final boolean synX1835boolean = true;
  private static final boolean synX1834boolean = false;
  private static final int synX1833int = 0;
  private static final boolean synX1832boolean = false;
  private static final int synX1831int = 0;
  private static final boolean synX1830boolean = true;
  private static final int synX1829int = 1;
  private static final int synX1828int = 0;
  private static final boolean synX1827boolean = true;
  private static final int synX1826int = 1;
  private static final int synX1825int = 0;
  private static final String synX1824String = "FB:";
  public ArrayDeque<Act>[] promptCode = null;

  public ApDeveloper() {
    this.promptCode = (new ArrayDeque[6]);
    {
      int i = 0;

      while (i < promptCode.length) {
        {
          {
            promptCode[i] = (new ArrayDeque<>());
          }
        }
        i++;
      }
    }
    thingLingering = (SentenceTeleportation);
    contemporaryPrecedency = (0);
  }

  public synchronized String organizerList() {
    return synX1824String;
  }

  public synchronized void proceedingsMortar(Act negotiations) {
    promptCode[synX1825int].addLast(negotiations);
  }

  public synchronized void bpsRetick() {

    if (actualAct != null) {
      actualAct.fixedContinualOpportunity(actualAct.receivePouringMoment() + synX1826int);
      thingLingering--;

      if (actualAct.receivePouringMoment() == actualAct.beatProgrammerSeverity()) {
        actualAct.layPassingMoment(this.makeIncumbentTock());
        this.finishedOutgrowth.addLast(actualAct);
        actualAct = (null);
        this.dikTorch = (synX1827boolean);
      }

      if (thingLingering == synX1828int && actualAct != null) {

        if (primedIsVacant()) {
          thingLingering = (SentenceTeleportation);
        } else {
          promptCode[contemporaryPrecedency + synX1829int].addLast(actualAct);
          actualAct = (null);
          this.dikTorch = (synX1830boolean);
        }
      }
    }

    if (this.dikTorch && actualAct == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == synX1831int) {
        this.dikTorch = (synX1832boolean);
        this.remainderRemoDays = (Shipper.DispatchedMonth);
      }

    } else {

      if (actualAct == null && !primedIsVacant()) {
        actualAct = (haveFirstServe());
        offloadProceedings(actualAct);
        actualAct.settledDepartPeriods(this.makeIncumbentTock());
        thingLingering = (SentenceTeleportation);
      }
    }
  }

  public synchronized boolean primedIsVacant() {
    {
      int i = synX1833int;

      while (i < promptCode.length) {
        {
          {
            if (!promptCode[i].isEmpty()) {
              return synX1834boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1835boolean;
  }

  public int thingLingering = 0;

  public synchronized Act haveFirstServe() {
    {
      int i = synX1836int;

      while (i < promptCode.length) {
        {
          {
            if (!promptCode[i].isEmpty()) {
              contemporaryPrecedency = (i);
              return promptCode[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public int contemporaryPrecedency = 0;
}
