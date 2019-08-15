package Interface.Grt;

import Caller.Distributor;
import Organizer.Synchronization;
import Organizer.Appendage;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TrsDeveloper extends Organizer.Synchronization {
  private java.util.Comparator<Appendage> compared;
  private java.util.PriorityQueue<Appendage> fixJumping;

  public TrsDeveloper() {
    this.compared = new FormalitiesPlacebo();
    this.fixJumping = new java.util.PriorityQueue<>(5, compared);
  }

  private class FormalitiesPlacebo implements Comparator<Appendage> {

    public synchronized int compare(Appendage b, Appendage e) {
      int p6Odd;
      int eStay;
      p6Odd = b.haveSecondLarge() - b.startOperativeMinutes();
      eStay = e.haveSecondLarge() - e.startOperativeMinutes();

      if (p6Odd < eStay) {
        return -1;
      }

      if (p6Odd > eStay) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String configurationDiscover() {
    return "SRT:";
  }

  public synchronized void weapMark() {

    if (presentlyMechanism != null) synx104();

    if (!fixJumping.isEmpty() && presentlyMechanism != null) synx105();

    if (this.mbeMarker && presentlyMechanism == null) synx106();
    else synx107();
  }

  public synchronized void procedureIngoing(Appendage operation) {
    fixJumping.add(operation);
  }

  private synchronized void synx104() {
    presentlyMechanism.bentLengthwiseHour(presentlyMechanism.startOperativeMinutes() + 1);

    if (presentlyMechanism.startOperativeMinutes() == presentlyMechanism.haveSecondLarge()) {
      presentlyMechanism.putDepartureClock(this.canExistingDial());
      this.realizedWork.addLast(presentlyMechanism);
      presentlyMechanism = null;
      this.mbeMarker = true;
    }
  }

  private synchronized void synx105() {
    int presentUnsold;
    int peepOther;
    presentUnsold =
        presentlyMechanism.haveSecondLarge() - presentlyMechanism.startOperativeMinutes();
    peepOther = fixJumping.peek().haveSecondLarge() - fixJumping.peek().startOperativeMinutes();

    if (peepOther < presentUnsold) {
      fixJumping.add(presentlyMechanism);
      presentlyMechanism = null;
      this.mbeMarker = true;
    }
  }

  private synchronized void synx106() {
    this.finalReckPeriod--;

    if (finalReckPeriod == 0) {
      this.mbeMarker = false;
      this.finalReckPeriod = Distributor.ForwardingAgain;
    }
  }

  private synchronized void synx107() {

    if (presentlyMechanism == null && !fixJumping.isEmpty()) {
      presentlyMechanism = fixJumping.poll();
      shipmentOutgrowth(presentlyMechanism);
      presentlyMechanism.determinedInitiateDays(this.canExistingDial());
    }
  }

  private synchronized void synx108(int i) {
    preparesTrollies[i] = new java.util.ArrayDeque<>();
  }
}
