package Programming.Scheduling;

import Plenum.Distributors;
import Compiler.Debugging;
import Compiler.Method;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Compiler.Debugging {
  public java.util.ArrayDeque<Method> fixJumping;

  public SchedulingPlanner() {
    this.fixJumping = (new java.util.ArrayDeque<>());
  }

  public synchronized String configurationDiscover() {
    return "FCFS:";
  }

  public synchronized void bpsRetick() {

    if (existingCycle != null) synx235();

    if (this.thmFlagstone && existingCycle == null) synx236();
    else synx237();
  }

  public synchronized void negotiationsNew(Method work) {
    fixJumping.addLast(work);
  }

  private synchronized void synx235() {
    existingCycle.doRushingAgain(existingCycle.catchJettingWhen() + 1);

    if (existingCycle.catchJettingWhen() == existingCycle.drivePresidentCapacity()) {
      existingCycle.solidifyingLeavingJuncture(this.canExistingDial());
      this.constructedMethodology.addLast(existingCycle);
      existingCycle = (null);
      this.thmFlagstone = (true);
    }
  }

  private synchronized void synx236() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.thmFlagstone = (false);
      this.remainderRemoDays = (Distributors.ShipmentClip);
    }
  }

  private synchronized void synx237() {

    if (existingCycle == null && !fixJumping.isEmpty()) {
      existingCycle = (fixJumping.removeFirst());
      existingCycle.situatedCommencesMinutes(this.canExistingDial());
      ladingSue(existingCycle);
    }
  }
}
