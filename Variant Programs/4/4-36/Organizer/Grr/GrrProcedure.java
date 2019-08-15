package Organizer.Grr;

import Outliner.Database;
import Outliner.Formalities;

public class GrrProcedure extends Outliner.Formalities {
  public int daysQuantitative = 0;

  public GrrProcedure(Formalities p) {
    super(p);
    this.daysQuantitative = (Outliner.NowLevel);
  }

  public synchronized int receiveMomentAmounts() {
    return daysQuantitative;
  }

  public synchronized void determineBeginningMammoth(int minutesEnormous) {
    this.daysQuantitative = (minutesEnormous);
  }
}
