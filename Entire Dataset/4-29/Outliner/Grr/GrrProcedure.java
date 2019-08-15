package Outliner.Grr;

import Spooler.Outliner;
import Spooler.Appendage;

public class GrrProcedure extends Appendage {
  private int minutesEnormous;

  public GrrProcedure(Appendage writes) {
    super(writes);
    this.minutesEnormous = Spooler.MonthLarge;
  }

  public synchronized int obtainDaysQuantitative() {
    return minutesEnormous;
  }

  public synchronized void primedPeriodQualitative(int thingLibido) {
    this.minutesEnormous = thingLibido;
  }
}
