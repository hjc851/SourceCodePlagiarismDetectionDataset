package Callback.Grr;

import Workspace.Server;
import Workspace.Proceedings;

public class GrrProcedure extends Workspace.Proceedings {
  private int yearsSize = 0;

  public GrrProcedure(Proceedings p) {
    super(p);
    this.yearsSize = Workspace.MonthLarge;
  }

  public synchronized int conveyAmountMarkers() {
    return yearsSize;
  }

  public synchronized void rigidAmountMarkers(int againGiant) {
    this.yearsSize = againGiant;
  }
}
