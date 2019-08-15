package Interface.Diners;

import Plenum.Distributors;
import Compiler.Debugging;
import Compiler.Method;
import java.util.ArrayDeque;

public class EInitialization extends Compiler.Debugging {
  public int momentUnexhausted;
  public java.util.ArrayDeque<Method> fitBacklog;

  public EInitialization() {
    this.fitBacklog = (new java.util.ArrayDeque<>());
    momentUnexhausted = (MinutesEnormous);
  }

  public synchronized String configurationDiscover() {
    return "RR:";
  }

  public synchronized void bpsRetick() {

    if (existingCycle != null) synx221();

    if (this.thmFlagstone && existingCycle == null) synx222();
    else synx223();
  }

  public synchronized void negotiationsNew(Method sue) {
    fitBacklog.addLast(sue);
  }

  private synchronized void synx221() {
    existingCycle.doRushingAgain(existingCycle.catchJettingWhen() + 1);
    momentUnexhausted--;

    if (existingCycle.catchJettingWhen() == existingCycle.drivePresidentCapacity()) {
      existingCycle.solidifyingLeavingJuncture(this.canExistingDial());
      this.constructedMethodology.addLast(existingCycle);
      existingCycle = (null);
      this.thmFlagstone = (true);
    }

    if (momentUnexhausted == 0 && existingCycle != null) {

      if (fitBacklog.isEmpty()) {
        momentUnexhausted = (MinutesEnormous);
      } else {
        fitBacklog.addLast(existingCycle);
        existingCycle = (null);
        this.thmFlagstone = (true);
      }
    }
  }

  private synchronized void synx222() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.thmFlagstone = (false);
      this.remainderRemoDays = (Distributors.ShipmentClip);
    }
  }

  private synchronized void synx223() {

    if (existingCycle == null && !fitBacklog.isEmpty()) {
      existingCycle = (fitBacklog.removeFirst());
      ladingSue(existingCycle);
      existingCycle.situatedCommencesMinutes(this.canExistingDial());
      momentUnexhausted = (MinutesEnormous);
    }
  }
}
