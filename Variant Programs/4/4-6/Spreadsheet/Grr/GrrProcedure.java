package Spreadsheet.Grr;

import Workflow.Programming;
import Workflow.Treat;

public class GrrProcedure extends Treat {
  public int junctureTremendous = 0;

  public GrrProcedure(Treat vig) {
    super(vig);
    this.junctureTremendous = (Workflow.WhenValue);
  }

  public synchronized int beatJunctureTremendous() {
    return junctureTremendous;
  }

  public synchronized void placeWeekVolume(int hourPurity) {
    this.junctureTremendous = (hourPurity);
  }
}
