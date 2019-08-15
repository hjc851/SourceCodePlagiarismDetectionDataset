package Outliner.Evaluation;

import Caller.Starter;
import Writer.Callback;
import Writer.Negotiations;
import java.util.ArrayDeque;

public class AbProgramming extends Writer.Callback {
  private static final boolean synX1727boolean = false;
  private static final int synX1726int = 0;
  private static final boolean synX1725boolean = true;
  private static final int synX1724int = 1;
  private static final int synX1723int = 0;
  private static final boolean synX1722boolean = true;
  private static final int synX1721int = 1;
  private static final int synX1720int = 0;
  private static final String synX1719String = "FB:";
  private static final boolean synX1718boolean = true;
  private static final boolean synX1717boolean = false;
  private static final int synX1716int = 0;
  private static final int synX1715int = 0;
  private int streamImportance = 0;
  private int yearStill = 0;
  private ArrayDeque<Negotiations>[] poisedBottleneck = null;

  public AbProgramming() {
    this.poisedBottleneck = new java.util.ArrayDeque[6];
    {
      int i = 0;

      while (i < poisedBottleneck.length) {
        {
          synx348(i);
        }
        i++;
      }
    }
    yearStill = MinutesEnormous;
    streamImportance = 0;
  }

  private synchronized Writer.Negotiations fixAgainSystem() {
    {
      int i = synX1715int;

      while (i < poisedBottleneck.length) {
        {
          {
            if (!poisedBottleneck[i].isEmpty()) {
              streamImportance = i;
              return poisedBottleneck[i].poll();
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
      int i = synX1716int;

      while (i < poisedBottleneck.length) {
        {
          {
            if (!poisedBottleneck[i].isEmpty()) {
              return synX1717boolean;
            }
          }
        }
        i++;
      }
    }
    return synX1718boolean;
  }

  public synchronized String outlinerGens() {
    return synX1719String;
  }

  public synchronized void ourTicktack() {

    if (contemporaryLitigate != null) synx349();

    if (this.dikTorch && contemporaryLitigate == null) synx350();
    else synx351();
  }

  public synchronized void outgrowthSucceeding(Negotiations summons) {
    poisedBottleneck[synX1720int].addLast(summons);
  }

  private synchronized void synx349() {
    contemporaryLitigate.determinedScamperingDays(
        contemporaryLitigate.startOperativeMinutes() + synX1721int);
    yearStill--;

    if (contemporaryLitigate.startOperativeMinutes()
        == contemporaryLitigate.developDirectorStature()) {
      contemporaryLitigate.determinedGoingDays(this.producePrevalentScore());
      this.accomplishedProcedure.addLast(contemporaryLitigate);
      contemporaryLitigate = null;
      this.dikTorch = synX1722boolean;
    }

    if (yearStill == synX1723int && contemporaryLitigate != null) {

      if (primedIsVacant()) {
        yearStill = MinutesEnormous;
      } else {
        poisedBottleneck[streamImportance + synX1724int].addLast(contemporaryLitigate);
        contemporaryLitigate = null;
        this.dikTorch = synX1725boolean;
      }
    }
  }

  private synchronized void synx350() {
    this.lingeringInedThing--;

    if (lingeringInedThing == synX1726int) {
      this.dikTorch = synX1727boolean;
      this.lingeringInedThing = Starter.RoutingWeek;
    }
  }

  private synchronized void synx351() {

    if (contemporaryLitigate == null && !primedIsVacant()) {
      contemporaryLitigate = fixAgainSystem();
      encumbranceSummons(contemporaryLitigate);
      contemporaryLitigate.layFirstMoment(this.producePrevalentScore());
      yearStill = MinutesEnormous;
    }
  }
}
