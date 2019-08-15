package Spreadsheet.Grr;

import Consignor.Shipper;
import Debugging.Callback;
import Debugging.Act;
import java.util.ArrayDeque;

public class GrrProgrammer extends Callback {
  private static final String synX1845String = "NRR:";
  private static final boolean synX1844boolean = false;
  private static final int synX1843int = 0;
  private static final boolean synX1842boolean = true;
  private static final int synX1841int = 1;
  private static final int synX1840int = 2;
  private static final int synX1839int = 0;
  private static final boolean synX1838boolean = true;
  private static final int synX1837int = 1;
  public ArrayDeque<GrrProcedure> makeRow = null;

  public synchronized void bpsRetick() {

    if (grrProcedure != null) {
      grrProcedure.fixedContinualOpportunity(grrProcedure.receivePouringMoment() + synX1837int);
      dayOdd--;

      if (grrProcedure.receivePouringMoment() == grrProcedure.beatProgrammerSeverity()) {
        grrProcedure.layPassingMoment(this.makeIncumbentTock());
        this.finishedOutgrowth.addLast(grrProcedure);
        grrProcedure = (null);
        this.dikTorch = (synX1838boolean);
      }

      if (dayOdd == synX1839int && grrProcedure != null) {

        if (makeRow.isEmpty()) {
          dayOdd = (grrProcedure.drawWeekVolume());
        } else {

          if (grrProcedure.drawWeekVolume() > synX1840int) {
            grrProcedure.orderedChanceNumber(grrProcedure.drawWeekVolume() - synX1841int);
          }

          makeRow.addLast(grrProcedure);
          grrProcedure = (null);
          this.dikTorch = (synX1842boolean);
        }
      }
    }

    if (this.dikTorch && actualAct == null) {
      this.remainderRemoDays--;

      if (remainderRemoDays == synX1843int) {
        this.dikTorch = (synX1844boolean);
        this.remainderRemoDays = (Shipper.DispatchedMonth);
      }

    } else {

      if (grrProcedure == null && !makeRow.isEmpty()) {
        grrProcedure = (makeRow.removeFirst());
        offloadProceedings(grrProcedure);
        grrProcedure.settledDepartPeriods(this.makeIncumbentTock());
        dayOdd = (grrProcedure.drawWeekVolume());
      }
    }
  }

  public GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.makeRow = (new ArrayDeque<>());
    dayOdd = (Debugging.SentenceTeleportation);
  }

  public int dayOdd = 0;

  public synchronized void proceedingsMortar(Act outgrowth) {
    makeRow.add(new GrrProcedure(outgrowth));
  }

  public synchronized String organizerList() {
    return synX1845String;
  }
}
