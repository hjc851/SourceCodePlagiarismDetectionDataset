package Configuration.Spt;

import Forwarder.Yardmaster;
import Programmer.Callback;
import Programmer.Sue;
import java.util.ArrayDeque;

public class UsingProgramming extends Programmer.Callback {
  private static final boolean synX2180boolean = false;
  private static final int synX2179int = 0;
  private static final boolean synX2178boolean = true;
  private static final int synX2177int = 1;
  private static final double synX2176double = 0.41044135154026296;
  private static final String synX2175String = "K3Kh2pW";
  private static final String synX2174String = "FCFS:";
  private static final double synX2173double = 0.4419589132777052;

  public UsingProgramming() {
    this.primedWaiting = new java.util.ArrayDeque<>();
  }

  public synchronized String writerAdvert() {
    double marquez = synX2173double;
    return synX2174String;
  }

  static final String amoySize = "LSuBtY1QLz";

  public synchronized void methodologyArrival(Sue operation) {
    String leap = synX2175String;
    primedWaiting.addLast(operation);
  }

  public java.util.ArrayDeque<Sue> primedWaiting;

  public synchronized void optiBeat() {
    double distinguish = synX2176double;

    if (newSystem != null) synx451();

    if (this.fraserHoisting && newSystem == null) synx452();
    else synx453();
  }

  private synchronized void synx451() {
    newSystem.doRushingAgain(newSystem.arriveFleeingMonth() + synX2177int);

    if (newSystem.arriveFleeingMonth() == newSystem.haveSecondLarge()) {
      newSystem.situatedMoveMinutes(this.catchRifeCheck());
      this.fulfilledMethod.addLast(newSystem);
      newSystem = null;
      this.fraserHoisting = synX2178boolean;
    }
  }

  private synchronized void synx452() {
    this.leftoverMalcolmMeter--;

    if (leftoverMalcolmMeter == synX2179int) {
      this.fraserHoisting = synX2180boolean;
      this.leftoverMalcolmMeter = Yardmaster.SendingHour;
    }
  }

  private synchronized void synx453() {

    if (newSystem == null && !primedWaiting.isEmpty()) {
      newSystem = primedWaiting.removeFirst();
      newSystem.arrangedGoSentence(this.catchRifeCheck());
      ladeProcedures(newSystem);
    }
  }
}
