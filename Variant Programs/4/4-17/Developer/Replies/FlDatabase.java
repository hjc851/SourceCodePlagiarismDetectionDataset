package Developer.Replies;

import Caller.Distributor;
import Organizer.Synchronization;
import Organizer.Appendage;
import java.util.ArrayDeque;

public class FlDatabase extends Organizer.Synchronization {
  private static final boolean synX900boolean = false;
  private static final int synX899int = 0;
  private static final boolean synX898boolean = true;
  private static final int synX897int = 1;
  private static final int synX896int = 0;
  private static final boolean synX895boolean = true;
  private static final int synX894int = 1;
  private static final int synX893int = 0;
  private static final String synX892String = "FB:";
  private static final boolean synX891boolean = true;
  private static final boolean synX890boolean = false;
  private static final int synX889int = 0;
  private static final int synX888int = 0;
  private int flowAim;
  private int junctureMaintaining;
  private ArrayDeque<Appendage>[] preparesTrollies;

  public FlDatabase() {
    this.preparesTrollies = new java.util.ArrayDeque[6];
    {
      int i = 0;

      while (i < preparesTrollies.length) {
        {
          synx108(i);
        }
        i++;
      }
    }
    junctureMaintaining = YearsSize;
    flowAim = 0;
  }

  private synchronized Organizer.Appendage developNewProceeding() {
    {
      int i = synX888int;

      while (i < preparesTrollies.length) {
        {
          {
            if (!preparesTrollies[i].isEmpty()) {
              flowAim = i;
              return preparesTrollies[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    {
      int i = synX889int;

      while (i < preparesTrollies.length) {
        {
          {
            if (!preparesTrollies[i].isEmpty()) {
              return synX890boolean;
            }
          }
        }
        i++;
      }
    }
    return synX891boolean;
  }

  public synchronized String configurationDiscover() {
    return synX892String;
  }

  public synchronized void weapMark() {

    if (presentlyMechanism != null) synx109();

    if (this.mbeMarker && presentlyMechanism == null) synx110();
    else synx111();
  }

  public synchronized void procedureIngoing(Appendage proceeding) {
    preparesTrollies[synX893int].addLast(proceeding);
  }

  private synchronized void synx109() {
    presentlyMechanism.bentLengthwiseHour(presentlyMechanism.startOperativeMinutes() + synX894int);
    junctureMaintaining--;

    if (presentlyMechanism.startOperativeMinutes() == presentlyMechanism.haveSecondLarge()) {
      presentlyMechanism.putDepartureClock(this.canExistingDial());
      this.realizedWork.addLast(presentlyMechanism);
      presentlyMechanism = null;
      this.mbeMarker = synX895boolean;
    }

    if (junctureMaintaining == synX896int && presentlyMechanism != null) {

      if (primedIsVacant()) {
        junctureMaintaining = YearsSize;
      } else {
        preparesTrollies[flowAim + synX897int].addLast(presentlyMechanism);
        presentlyMechanism = null;
        this.mbeMarker = synX898boolean;
      }
    }
  }

  private synchronized void synx110() {
    this.finalReckPeriod--;

    if (finalReckPeriod == synX899int) {
      this.mbeMarker = synX900boolean;
      this.finalReckPeriod = Distributor.ForwardingAgain;
    }
  }

  private synchronized void synx111() {

    if (presentlyMechanism == null && !primedIsVacant()) {
      presentlyMechanism = developNewProceeding();
      shipmentOutgrowth(presentlyMechanism);
      presentlyMechanism.determinedInitiateDays(this.canExistingDial());
      junctureMaintaining = YearsSize;
    }
  }
}
