package Spooler.Lamps;

import Starter.Forwarder;
import Multitasking.Debugging;
import Multitasking.Methods;
import java.util.ArrayDeque;

public class UsingProgramming extends Debugging {
  private ArrayDeque<Methods> ripeStandby;

  public UsingProgramming() {
    this.ripeStandby = new ArrayDeque<>();
  }

  public synchronized String timerMention() {
    return "FCFS:";
  }

  public synchronized void bpsRetick() {

    if (continuingMechanisms != null) synx331();

    if (this.ballaBrigade && continuingMechanisms == null) synx332();
    else synx333();
  }

  public synchronized void treatInfluent(Methods march) {
    ripeStandby.addLast(march);
  }

  private synchronized void synx331() {
    continuingMechanisms.determineLinearBeginning(continuingMechanisms.drawSpurtingWeek() + 1);

    if (continuingMechanisms.drawSpurtingWeek() == continuingMechanisms.sustainOfficerImmensity()) {
      continuingMechanisms.primedExpirationPeriod(this.goPrevailingClick());
      this.executedMethods.addLast(continuingMechanisms);
      continuingMechanisms = null;
      this.ballaBrigade = true;
    }
  }

  private synchronized void synx332() {
    this.maintainingBallaJuncture--;

    if (maintainingBallaJuncture == 0) {
      this.ballaBrigade = false;
      this.maintainingBallaJuncture = Forwarder.ShipmentClip;
    }
  }

  private synchronized void synx333() {

    if (continuingMechanisms == null && !ripeStandby.isEmpty()) {
      continuingMechanisms = ripeStandby.removeFirst();
      continuingMechanisms.placedJumpWhen(this.goPrevailingClick());
      stowLitigate(continuingMechanisms);
    }
  }
}
