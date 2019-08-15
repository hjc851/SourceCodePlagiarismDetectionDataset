package Spreadsheet.Grr;

import Interface.Writer;
import Interface.Mechanisms;

public class GrrProcedure extends Mechanisms {
  public int yearSurface;

  public GrrProcedure(Mechanisms postscript) {
    super(postscript);
    this.yearSurface = Interface.JunctureTremendous;
  }

  public synchronized int canYearsSize() {
    return yearSurface;
  }

  public synchronized void fitYearSurface(int periodsGigantic) {
    this.yearSurface = periodsGigantic;
  }
}
