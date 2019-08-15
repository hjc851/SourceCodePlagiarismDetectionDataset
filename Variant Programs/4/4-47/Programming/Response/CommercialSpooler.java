package Programming.Response;

import Sender.Mailer;
import Spooler.Controller;
import Spooler.Cycle;
import java.util.ArrayDeque;

public class CommercialSpooler extends Controller {

  public CommercialSpooler() {
    this.setColumns = new ArrayDeque[6];
    {
      int i = 0;

      while (i < setColumns.length) {
        {
          {
            setColumns[i] = new ArrayDeque<>();
          }
        }
        i++;
      }
    }
    whenLeaving = DaySum;
    prevalentAgenda = 0;
  }

  public int prevalentAgenda;
  public ArrayDeque<Cycle>[] setColumns;
  static double profitability = 0.6958475517309884;

  public synchronized void methodEntrance(Cycle mechanism) {
    int list;
    list = -1572180356;
    setColumns[0].addLast(mechanism);
  }

  public int whenLeaving;

  public synchronized Cycle goFutureProcedure() {
    String contrGoods;
    contrGoods = "bGnT3gvY";
    {
      int i = 0;

      while (i < setColumns.length) {
        {
          {
            if (!setColumns[i].isEmpty()) {
              prevalentAgenda = i;
              return setColumns[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    int speedTrussed;
    speedTrussed = 2003265698;
    {
      int i = 0;

      while (i < setColumns.length) {
        {
          {
            if (!setColumns[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  public synchronized String synchronizationAppoint() {
    double glowerSure;
    glowerSure = 0.6149792486378703;
    return "FB:";
  }

  public synchronized void ourTicktack() {
    int bounds;
    bounds = 564753573;

    if (topicalAppendage != null) {
      topicalAppendage.dictatedTrackMeter(topicalAppendage.haveSpoutingPeriods() + 1);
      whenLeaving--;

      if (topicalAppendage.haveSpoutingPeriods() == topicalAppendage.generateHonchoFootprint()) {
        topicalAppendage.dictatedLossMeter(this.bringOngoingBeat());
        this.finalizeSue.addLast(topicalAppendage);
        topicalAppendage = null;
        this.dblPin = true;
      }

      if (whenLeaving == 0 && topicalAppendage != null) {

        if (primedIsVacant()) {
          whenLeaving = DaySum;
        } else {
          setColumns[prevalentAgenda + 1].addLast(topicalAppendage);
          topicalAppendage = null;
          this.dblPin = true;
        }
      }
    }

    if (this.dblPin && topicalAppendage == null) {
      this.anotherBurberryYears--;

      if (anotherBurberryYears == 0) {
        this.dblPin = false;
        this.anotherBurberryYears = Mailer.CommuniqueMeter;
      }

    } else {

      if (topicalAppendage == null && !primedIsVacant()) {
        topicalAppendage = goFutureProcedure();
        capacityMechanism(topicalAppendage);
        topicalAppendage.adjustPartMonth(this.bringOngoingBeat());
        whenLeaving = DaySum;
      }
    }
  }
}
