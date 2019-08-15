package Compiler.Grr;

import Planner.Database;
import Planner.Procedure;

public class GrrProcedure extends Procedure {
  private int opportunityDramatic;

  public GrrProcedure(Procedure cern) {
    super(cern);
    this.opportunityDramatic = Planner.MomentAmounts;
  }

  public synchronized int arriveMonthLarge() {
    return opportunityDramatic;
  }

  public synchronized void placedWhenValue(int yearSurface) {
    this.opportunityDramatic = yearSurface;
  }
}
