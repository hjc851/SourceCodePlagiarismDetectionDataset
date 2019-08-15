package Planner.Grr;

import Debugging.Server;
import Debugging.Operation;

public class GrrProcedure extends Debugging.Operation {
  private int yearSurface = 0;

  public GrrProcedure(Operation p) {
    super(p);
    this.yearSurface = (Debugging.MeterMeasure);
  }

  public synchronized int conveyAmountMarkers() {
    return yearSurface;
  }

  public synchronized void primedPeriodQualitative(int meterMeasure) {
    this.yearSurface = (meterMeasure);
  }
}
