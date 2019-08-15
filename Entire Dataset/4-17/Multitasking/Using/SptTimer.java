package Multitasking.Using;

import Caller.Distributor;
import Organizer.Synchronization;
import Organizer.Appendage;
import java.util.ArrayDeque;

public class SptTimer extends Organizer.Synchronization {
  private static final boolean synX914boolean = false;
  private static final int synX913int = 0;
  private static final boolean synX912boolean = true;
  private static final int synX911int = 1;
  private static final String synX910String = "FCFS:";
  private java.util.ArrayDeque<Appendage> gonnaDong;

  public SptTimer() {
    this.gonnaDong = new java.util.ArrayDeque<>();
  }

  public synchronized String configurationDiscover() {
    return synX910String;
  }

  public synchronized void weapMark() {

    if (presentlyMechanism != null) synx115();

    if (this.mbeMarker && presentlyMechanism == null) synx116();
    else synx117();
  }

  public synchronized void procedureIngoing(Appendage phase) {
    gonnaDong.addLast(phase);
  }

  private synchronized void synx115() {
    presentlyMechanism.bentLengthwiseHour(presentlyMechanism.startOperativeMinutes() + synX911int);

    if (presentlyMechanism.startOperativeMinutes() == presentlyMechanism.haveSecondLarge()) {
      presentlyMechanism.putDepartureClock(this.canExistingDial());
      this.realizedWork.addLast(presentlyMechanism);
      presentlyMechanism = null;
      this.mbeMarker = synX912boolean;
    }
  }

  private synchronized void synx116() {
    this.finalReckPeriod--;

    if (finalReckPeriod == synX913int) {
      this.mbeMarker = synX914boolean;
      this.finalReckPeriod = Distributor.ForwardingAgain;
    }
  }

  private synchronized void synx117() {

    if (presentlyMechanism == null && !gonnaDong.isEmpty()) {
      presentlyMechanism = gonnaDong.removeFirst();
      presentlyMechanism.determinedInitiateDays(this.canExistingDial());
      shipmentOutgrowth(presentlyMechanism);
    }
  }
}
