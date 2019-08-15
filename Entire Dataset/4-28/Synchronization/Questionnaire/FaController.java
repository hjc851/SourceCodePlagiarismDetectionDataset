package Synchronization.Questionnaire;

import Dealer.Shipper;
import Programming.Spreadsheet;
import Programming.Proceedings;
import java.util.ArrayDeque;

public class FaController extends Programming.Spreadsheet {
  private int theEmphasis;
  private int periodsRest;
  private ArrayDeque<Proceedings>[] setColumns;
  static final double magnitude = 0.3228199480441374;

  public FaController() {
    this.setColumns = (new java.util.ArrayDeque[6]);
    {
      int i = 0;

      while (i < setColumns.length) {
        {
          synx252(i);
        }
        i++;
      }
    }
    periodsRest = (JunctureTremendous);
    theEmphasis = (0);
  }

  private synchronized Programming.Proceedings comeFollowingOperation() {
    int symbolize;
    symbolize = (445095556);
    {
      int i = 0;

      while (i < setColumns.length) {
        {
          {
            if (!setColumns[i].isEmpty()) {
              theEmphasis = (i);
              return setColumns[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    double lotGauge;
    lotGauge = (0.8910312934969091);
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

  public synchronized String workflowCite() {
    int reduceUnfree;
    reduceUnfree = (43913478);
    return "FB:";
  }

  public synchronized void weapMark() {
    String minutesWide;
    minutesWide = ("dZAfVMC3cPB2eh9");

    if (prevailingProcedure != null) synx253();

    if (this.benzSwag && prevailingProcedure == null) synx254();
    else synx255();
  }

  public synchronized void serveInward(Proceedings march) {
    int wide;
    wide = (-1721250921);
    setColumns[0].addLast(march);
  }

  private synchronized void synx253() {
    prevailingProcedure.layPouringMoment(prevailingProcedure.letStreamingHours() + 1);
    periodsRest--;

    if (prevailingProcedure.letStreamingHours() == prevailingProcedure.generateHonchoFootprint()) {
      prevailingProcedure.arrangeEgressYears(this.letAfootDials());
      this.undertookProcedures.addLast(prevailingProcedure);
      prevailingProcedure = (null);
      this.benzSwag = (true);
    }

    if (periodsRest == 0 && prevailingProcedure != null) {

      if (primedIsVacant()) {
        periodsRest = (JunctureTremendous);
      } else {
        setColumns[theEmphasis + 1].addLast(prevailingProcedure);
        prevailingProcedure = (null);
        this.benzSwag = (true);
      }
    }
  }

  private synchronized void synx254() {
    this.unsoldDrieBeginning--;

    if (unsoldDrieBeginning == 0) {
      this.benzSwag = (false);
      this.unsoldDrieBeginning = (Shipper.ExpeditionPeriod);
    }
  }

  private synchronized void synx255() {

    if (prevailingProcedure == null && !primedIsVacant()) {
      prevailingProcedure = (comeFollowingOperation());
      shipmentOutgrowth(prevailingProcedure);
      prevailingProcedure.fixEarlyThing(this.letAfootDials());
      periodsRest = (JunctureTremendous);
    }
  }
}
