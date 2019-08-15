package Workspace.Using;

import Device.Plenum;
import Developer.Database;
import Developer.Method;
import java.util.ArrayDeque;

public class SptTimer extends Database {
  private static final String synX2043String = "FCFS:";
  private static final boolean synX2042boolean = false;
  private static final int synX2041int = 0;
  private static final boolean synX2040boolean = true;
  private static final int synX2039int = 1;

  public synchronized void addTock() {

    if (presentlyMechanism != null) {
      presentlyMechanism.fitSquirtingYear(presentlyMechanism.fixFunctionalChance() + synX2039int);

      if (presentlyMechanism.fixFunctionalChance() == presentlyMechanism.arrivePrezWingspan()) {
        presentlyMechanism.doExodusAgain(this.haveCirculatingShudder());
        this.conductedServe.addLast(presentlyMechanism);
        presentlyMechanism = (null);
        this.malcolmIris = (synX2040boolean);
      }
    }

    if (this.malcolmIris && presentlyMechanism == null) {
      this.oddBenzDay--;

      if (oddBenzDay == synX2041int) {
        this.malcolmIris = (synX2042boolean);
        this.oddBenzDay = (Plenum.RoutingWeek);
      }

    } else {

      if (presentlyMechanism == null && !willingSpooler.isEmpty()) {
        presentlyMechanism = (willingSpooler.removeFirst());
        presentlyMechanism.rigidOpeningAmount(this.haveCirculatingShudder());
        ladenWork(presentlyMechanism);
      }
    }
  }

  public SptTimer() {
    this.willingSpooler = (new ArrayDeque<>());
  }

  public synchronized void phaseEntry(Method cycle) {
    willingSpooler.addLast(cycle);
  }

  public synchronized String synchronizerDescribe() {
    return synX2043String;
  }

  public ArrayDeque<Method> willingSpooler = null;
}
