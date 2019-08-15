package Database.Caboose;

import Caller.Distributor;
import Organizer.Synchronization;
import Organizer.Appendage;
import java.util.ArrayDeque;

public class OmskSpooler extends Organizer.Synchronization {
  private static final boolean synX887boolean = false;
  private static final int synX886int = 0;
  private static final boolean synX885boolean = true;
  private static final int synX884int = 0;
  private static final boolean synX883boolean = true;
  private static final int synX882int = 1;
  private static final String synX881String = "RR:";
  private int daysRemainder;
  private java.util.ArrayDeque<Appendage> eagerJunk;

  public OmskSpooler() {
    this.eagerJunk = new java.util.ArrayDeque<>();
    daysRemainder = YearsSize;
  }

  public synchronized String configurationDiscover() {
    return synX881String;
  }

  public synchronized void weapMark() {

    if (presentlyMechanism != null) synx101();

    if (this.mbeMarker && presentlyMechanism == null) synx102();
    else synx103();
  }

  public synchronized void procedureIngoing(Appendage appendage) {
    eagerJunk.addLast(appendage);
  }

  private synchronized void synx101() {
    presentlyMechanism.bentLengthwiseHour(presentlyMechanism.startOperativeMinutes() + synX882int);
    daysRemainder--;

    if (presentlyMechanism.startOperativeMinutes() == presentlyMechanism.haveSecondLarge()) {
      presentlyMechanism.putDepartureClock(this.canExistingDial());
      this.realizedWork.addLast(presentlyMechanism);
      presentlyMechanism = null;
      this.mbeMarker = synX883boolean;
    }

    if (daysRemainder == synX884int && presentlyMechanism != null) {

      if (eagerJunk.isEmpty()) {
        daysRemainder = YearsSize;
      } else {
        eagerJunk.addLast(presentlyMechanism);
        presentlyMechanism = null;
        this.mbeMarker = synX885boolean;
      }
    }
  }

  private synchronized void synx102() {
    this.finalReckPeriod--;

    if (finalReckPeriod == synX886int) {
      this.mbeMarker = synX887boolean;
      this.finalReckPeriod = Distributor.ForwardingAgain;
    }
  }

  private synchronized void synx103() {

    if (presentlyMechanism == null && !eagerJunk.isEmpty()) {
      presentlyMechanism = eagerJunk.removeFirst();
      shipmentOutgrowth(presentlyMechanism);
      presentlyMechanism.determinedInitiateDays(this.canExistingDial());
      daysRemainder = YearsSize;
    }
  }
}
