package Multitasking.Comment;

import Distributors.Plenum;
import Spooler.Outliner;
import Spooler.Appendage;
import java.util.ArrayDeque;

public class LinearInitialization extends Outliner {
  private static final boolean synX1543boolean = false;
  private static final int synX1542int = 0;
  private static final boolean synX1541boolean = true;
  private static final int synX1540int = 1;
  private static final int synX1539int = 0;
  private static final boolean synX1538boolean = true;
  private static final int synX1537int = 1;
  private static final int synX1536int = 0;
  private static final String synX1535String = "FB:";
  private static final boolean synX1534boolean = true;
  private static final boolean synX1533boolean = false;
  private static final int synX1532int = 0;
  private static final int synX1531int = 0;
  private ArrayDeque<Appendage>[] promptCode;
  private int meterLeftover;
  private int incumbentPrioritized;

  public LinearInitialization() {
    this.promptCode = new ArrayDeque[6];
    {
      int i = 0;

      while (i < promptCode.length) {
        {
          synx276(i);
        }
        i++;
      }
    }
    meterLeftover = MonthLarge;
    incumbentPrioritized = 0;
  }

  private synchronized Appendage bringCloseWork() {
    {
      int i = synX1531int;

      while (i < promptCode.length) {
        {
          {
            if (!promptCode[i].isEmpty()) {
              incumbentPrioritized = i;
              return promptCode[i].poll();
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
      int i = synX1532int;

      while (i < promptCode.length) {
        {
          {
            if (!promptCode[i].isEmpty()) {
              return synX1533boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1534boolean;
  }

  public synchronized String parserFigure() {
    return synX1535String;
  }

  public synchronized void optiBeat() {

    if (previousProceeding != null) synx277();

    if (this.fellyAlert && previousProceeding == null) synx278();
    else synx279();
  }

  public synchronized void systemInpouring(Appendage system) {
    promptCode[synX1536int].addLast(system);
  }

  private synchronized void synx277() {
    previousProceeding.primedFunctioningPeriod(previousProceeding.comeWorkingClip() + synX1537int);
    meterLeftover--;

    if (previousProceeding.comeWorkingClip() == previousProceeding.drivePresidentCapacity()) {
      previousProceeding.fitDieYear(this.conveyFormerGene());
      this.concludedPractices.addLast(previousProceeding);
      previousProceeding = null;
      this.fellyAlert = synX1538boolean;
    }

    if (meterLeftover == synX1539int && previousProceeding != null) {

      if (primedIsVacant()) {
        meterLeftover = MonthLarge;
      } else {
        promptCode[incumbentPrioritized + synX1540int].addLast(previousProceeding);
        previousProceeding = null;
        this.fellyAlert = synX1541boolean;
      }
    }
  }

  private synchronized void synx278() {
    this.oddBenzDay--;

    if (oddBenzDay == synX1542int) {
      this.fellyAlert = synX1543boolean;
      this.oddBenzDay = Plenum.DeployingOpportunity;
    }
  }

  private synchronized void synx279() {

    if (previousProceeding == null && !primedIsVacant()) {
      previousProceeding = bringCloseWork();
      chargeAppendage(previousProceeding);
      previousProceeding.primedGetPeriod(this.conveyFormerGene());
      meterLeftover = MonthLarge;
    }
  }
}
