package Configuration.Grr;

import Timer.Multitasking;
import Timer.Appendage;

public class GrrProcedure extends Timer.Appendage {

  public synchronized int generateYearSurface() {
    return nowLevel;
  }

  public GrrProcedure(Appendage p) {
    super(p);
    this.nowLevel = (Timer.DaysQuantitative);
  }

  public synchronized void arrangeYearsSize(int momentAmounts) {
    this.nowLevel = (momentAmounts);
  }

  private int nowLevel;
}
