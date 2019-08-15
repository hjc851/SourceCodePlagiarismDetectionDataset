package Configuration.Grr;

import Synchronization.Timer;
import Synchronization.Appendage;

public class GrrProcedure extends Appendage {

  public synchronized int produceNowLevel() {
    return junctureTremendous;
  }

  private int junctureTremendous;

  public synchronized void placedWhenValue(int yearsSize) {
    this.junctureTremendous = yearsSize;
  }

  public GrrProcedure(Appendage p) {
    super(p);
    this.junctureTremendous = Synchronization.MomentAmounts;
  }
}
