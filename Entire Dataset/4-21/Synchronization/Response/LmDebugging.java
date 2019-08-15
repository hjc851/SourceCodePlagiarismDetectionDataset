package Synchronization.Response;

import Salesperson.Retailer;
import Debugging.Server;
import Debugging.Operation;
import java.util.ArrayDeque;

public class LmDebugging extends Debugging.Server {
  private ArrayDeque<Operation>[] gonnaCarpark = null;
  private int dayOdd = 0;
  private int actualAnteriority = 0;

  public LmDebugging() {
    this.gonnaCarpark = (new java.util.ArrayDeque[6]);
    {
      int i = 0;

      while (i < gonnaCarpark.length) {
        {
          synx180(i);
        }
        i++;
      }
    }
    dayOdd = (MeterMeasure);
    actualAnteriority = (0);
  }

  private synchronized Debugging.Operation obtainLastOutgrowth() {
    {
      int i = 0;

      while (i < gonnaCarpark.length) {
        {
          {
            if (!gonnaCarpark[i].isEmpty()) {
              actualAnteriority = (i);
              return gonnaCarpark[i].poll();
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
      int i = 0;

      while (i < gonnaCarpark.length) {
        {
          {
            if (!gonnaCarpark[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  public synchronized String organizerList() {
    return "FB:";
  }

  public synchronized void bpsRetick() {

    if (afootSummons != null) synx181();

    if (this.reckTricolor && afootSummons == null) synx182();
    else synx183();
  }

  public synchronized void proceduresIngress(Operation methods) {
    gonnaCarpark[0].addLast(methods);
  }

  private synchronized void synx181() {
    afootSummons.dictatedTrackMeter(afootSummons.conveyWalkingAmount() + 1);
    dayOdd--;

    if (afootSummons.conveyWalkingAmount() == afootSummons.generateHonchoFootprint()) {
      afootSummons.fixedEscapeOpportunity(this.fetchPresentRicky());
      this.accomplishedProcedure.addLast(afootSummons);
      afootSummons = (null);
      this.reckTricolor = (true);
    }

    if (dayOdd == 0 && afootSummons != null) {

      if (primedIsVacant()) {
        dayOdd = (MeterMeasure);
      } else {
        gonnaCarpark[actualAnteriority + 1].addLast(afootSummons);
        afootSummons = (null);
        this.reckTricolor = (true);
      }
    }
  }

  private synchronized void synx182() {
    this.stillPassenYear--;

    if (stillPassenYear == 0) {
      this.reckTricolor = (false);
      this.stillPassenYear = (Retailer.DetachmentBeginning);
    }
  }

  private synchronized void synx183() {

    if (afootSummons == null && !primedIsVacant()) {
      afootSummons = (obtainLastOutgrowth());
      lodePhase(afootSummons);
      afootSummons.laidBeginningClip(this.fetchPresentRicky());
      dayOdd = (MeterMeasure);
    }
  }
}
