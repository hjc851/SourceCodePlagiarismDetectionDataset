package Interface.Grr;

import Workflow.Workspace;
import Workflow.Operation;

public class GrrProcedure extends Operation {
  public int minutesEnormous;

  public GrrProcedure(Operation vig) {
    super(vig);
    this.minutesEnormous = Workflow.AgainGiant;
  }

  public synchronized int letHoursHuge() {
    return minutesEnormous;
  }

  public synchronized void prepareNowLevel(int opportunityDramatic) {
    this.minutesEnormous = opportunityDramatic;
  }
}
