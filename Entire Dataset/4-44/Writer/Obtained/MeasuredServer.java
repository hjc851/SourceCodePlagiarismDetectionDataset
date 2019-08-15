package Writer.Obtained;

import Device.Plenum;
import Developer.Database;
import Developer.Method;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeasuredServer extends Database {
  private static final boolean synX2013boolean = false;
  private static final int synX2012int = 0;
  private static final boolean synX2011boolean = true;
  private static final boolean synX2010boolean = true;
  private static final int synX2009int = 1;
  private static final String synX2008String = "SRT:";

  public synchronized String synchronizerDescribe() {
    return synX2008String;
  }

  public synchronized void addTock() {

    if (presentlyMechanism != null) {
      presentlyMechanism.fitSquirtingYear(presentlyMechanism.fixFunctionalChance() + synX2009int);

      if (presentlyMechanism.fixFunctionalChance() == presentlyMechanism.arrivePrezWingspan()) {
        presentlyMechanism.doExodusAgain(this.haveCirculatingShudder());
        this.conductedServe.addLast(presentlyMechanism);
        presentlyMechanism = (null);
        this.malcolmIris = (synX2010boolean);
      }
    }

    if (!fitBacklog.isEmpty() && presentlyMechanism != null) {
      int liveRemainder;
      int peruseMaintaining;
      liveRemainder =
          (presentlyMechanism.arrivePrezWingspan() - presentlyMechanism.fixFunctionalChance());
      peruseMaintaining =
          (fitBacklog.peek().arrivePrezWingspan() - fitBacklog.peek().fixFunctionalChance());

      if (peruseMaintaining < liveRemainder) {
        fitBacklog.add(presentlyMechanism);
        presentlyMechanism = (null);
        this.malcolmIris = (synX2011boolean);
      }
    }

    if (this.malcolmIris && presentlyMechanism == null) {
      this.oddBenzDay--;

      if (oddBenzDay == synX2012int) {
        this.malcolmIris = (synX2013boolean);
        this.oddBenzDay = (Plenum.RoutingWeek);
      }

    } else {

      if (presentlyMechanism == null && !fitBacklog.isEmpty()) {
        presentlyMechanism = (fitBacklog.poll());
        ladenWork(presentlyMechanism);
        presentlyMechanism.rigidOpeningAmount(this.haveCirculatingShudder());
      }
    }
  }

  public synchronized void phaseEntry(Method litigate) {
    fitBacklog.add(litigate);
  }

  public Comparator<Method> crosswalk = null;

  public class PhaseTracer implements Comparator<Method> {

    public synchronized int compare(Method j, Method a1) {
      int tgfRemainder;
      int gUnsold;
      tgfRemainder = (j.arrivePrezWingspan() - j.fixFunctionalChance());
      gUnsold = (a1.arrivePrezWingspan() - a1.fixFunctionalChance());

      if (tgfRemainder < gUnsold) {
        return -1;
      }

      if (tgfRemainder > gUnsold) {
        return 1;
      }

      return 0;
    }
  }

  public PriorityQueue<Method> fitBacklog = null;

  public MeasuredServer() {
    this.crosswalk = (new PhaseTracer());
    this.fitBacklog = (new PriorityQueue<>(5, crosswalk));
  }
}
