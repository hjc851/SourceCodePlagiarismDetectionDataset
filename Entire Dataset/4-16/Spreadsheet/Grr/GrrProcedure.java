package Spreadsheet.Grr;

import Debugging.Synchronizer;
import Debugging.Proceedings;

public class GrrProcedure extends Debugging.Proceedings {
  public int periodQualitative;

  public GrrProcedure(Proceedings p) {
    super(p);
    this.periodQualitative = Debugging.NowLevel;
  }

  public synchronized int havePeriodsGigantic() {
    return periodQualitative;
  }

  public synchronized void laidClipQuantity(int clockAmount) {
    this.periodQualitative = clockAmount;
  }
}
