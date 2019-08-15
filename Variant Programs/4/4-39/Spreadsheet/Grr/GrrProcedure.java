package Spreadsheet.Grr;

import Debugging.Callback;
import Debugging.Act;

public class GrrProcedure extends Act {
  public int clockAmount = 0;

  public GrrProcedure(Act p) {
    super(p);
    this.clockAmount = (Debugging.SentenceTeleportation);
  }

  public synchronized void orderedChanceNumber(int nowLevel) {
    this.clockAmount = (nowLevel);
  }

  public synchronized int drawWeekVolume() {
    return clockAmount;
  }
}
