package Multitasking.Sta;

import Forwarder.Yardmaster;
import Programmer.Callback;
import Programmer.Sue;
import java.util.ArrayDeque;

public class BWorkspace extends Programmer.Callback {
  private static final String synX2134String = "RR:";
  private static final double synX2133double = 0.6226681167305957;
  private static final double synX2132double = 0.3117818493337957;
  private static final double synX2131double = 0.9491758849533111;

  public synchronized void methodologyArrival(Sue procedures) {
    double hawnContents = synX2131double;
    ripeStandby.addLast(procedures);
  }

  public synchronized void optiBeat() {
    double breadth = synX2132double;

    if (newSystem != null) synx437();

    if (this.fraserHoisting && newSystem == null) synx438();
    else synx439();
  }

  public BWorkspace() {
    this.ripeStandby = new java.util.ArrayDeque<>();
    periodsRest = DaySum;
  }

  public synchronized String writerAdvert() {
    double restriction = synX2133double;
    return synX2134String;
  }

  public int periodsRest;
  public java.util.ArrayDeque<Sue> ripeStandby;
  public static final double upperSkank = 0.4795849681394908;

  private synchronized void synx437() {
    newSystem.doRushingAgain(newSystem.arriveFleeingMonth() + 1);
    periodsRest--;

    if (newSystem.arriveFleeingMonth() == newSystem.haveSecondLarge()) {
      newSystem.situatedMoveMinutes(this.catchRifeCheck());
      this.fulfilledMethod.addLast(newSystem);
      newSystem = null;
      this.fraserHoisting = true;
    }

    if (periodsRest == 0 && newSystem != null) {

      if (ripeStandby.isEmpty()) {
        periodsRest = DaySum;
      } else {
        ripeStandby.addLast(newSystem);
        newSystem = null;
        this.fraserHoisting = true;
      }
    }
  }

  private synchronized void synx438() {
    this.leftoverMalcolmMeter--;

    if (leftoverMalcolmMeter == 0) {
      this.fraserHoisting = false;
      this.leftoverMalcolmMeter = Yardmaster.SendingHour;
    }
  }

  private synchronized void synx439() {

    if (newSystem == null && !ripeStandby.isEmpty()) {
      newSystem = ripeStandby.removeFirst();
      ladeProcedures(newSystem);
      newSystem.arrangedGoSentence(this.catchRifeCheck());
      periodsRest = DaySum;
    }
  }
}
