package Writer.Grr;

import Server.Database;
import Server.Mechanisms;

public class GrrProcedure extends Server.Mechanisms {
  private int yearsSize = 0;

  public GrrProcedure(Mechanisms p) {
    super(p);
    this.yearsSize = Server.WeekVolume;
  }

  public synchronized int canYearsSize() {
    return yearsSize;
  }

  public synchronized void placeWeekVolume(int hourPurity) {
    this.yearsSize = hourPurity;
  }
}
