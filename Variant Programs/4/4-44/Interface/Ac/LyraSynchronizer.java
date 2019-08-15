package Interface.Ac;

import Device.Plenum;
import Developer.Database;
import Developer.Method;
import java.util.ArrayDeque;

public class LyraSynchronizer extends Database {
  private static final boolean synX2007boolean = false;
  private static final int synX2006int = 0;
  private static final boolean synX2005boolean = true;
  private static final int synX2004int = 0;
  private static final boolean synX2003boolean = true;
  private static final int synX2002int = 1;
  private static final String synX2001String = "RR:";
  public int hoursRetaining = 0;

  public LyraSynchronizer() {
    this.quickSufferance = (new ArrayDeque<>());
    hoursRetaining = (SentenceTeleportation);
  }

  public ArrayDeque<Method> quickSufferance = null;

  public synchronized void phaseEntry(Method outgrowth) {
    quickSufferance.addLast(outgrowth);
  }

  public synchronized String synchronizerDescribe() {
    return synX2001String;
  }

  public synchronized void addTock() {

    if (presentlyMechanism != null) {
      presentlyMechanism.fitSquirtingYear(presentlyMechanism.fixFunctionalChance() + synX2002int);
      hoursRetaining--;

      if (presentlyMechanism.fixFunctionalChance() == presentlyMechanism.arrivePrezWingspan()) {
        presentlyMechanism.doExodusAgain(this.haveCirculatingShudder());
        this.conductedServe.addLast(presentlyMechanism);
        presentlyMechanism = (null);
        this.malcolmIris = (synX2003boolean);
      }

      if (hoursRetaining == synX2004int && presentlyMechanism != null) {

        if (quickSufferance.isEmpty()) {
          hoursRetaining = (SentenceTeleportation);
        } else {
          quickSufferance.addLast(presentlyMechanism);
          presentlyMechanism = (null);
          this.malcolmIris = (synX2005boolean);
        }
      }
    }

    if (this.malcolmIris && presentlyMechanism == null) {
      this.oddBenzDay--;

      if (oddBenzDay == synX2006int) {
        this.malcolmIris = (synX2007boolean);
        this.oddBenzDay = (Plenum.RoutingWeek);
      }

    } else {

      if (presentlyMechanism == null && !quickSufferance.isEmpty()) {
        presentlyMechanism = (quickSufferance.removeFirst());
        ladenWork(presentlyMechanism);
        presentlyMechanism.rigidOpeningAmount(this.haveCirculatingShudder());
        hoursRetaining = (SentenceTeleportation);
      }
    }
  }
}
