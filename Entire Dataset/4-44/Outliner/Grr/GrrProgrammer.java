package Outliner.Grr;

import Device.Plenum;
import Developer.Database;
import Developer.Method;
import java.util.ArrayDeque;

public class GrrProgrammer extends Database {
  private static final boolean synX2038boolean = false;
  private static final int synX2037int = 0;
  private static final boolean synX2036boolean = true;
  private static final int synX2035int = 1;
  private static final int synX2034int = 2;
  private static final int synX2033int = 0;
  private static final boolean synX2032boolean = true;
  private static final int synX2031int = 1;
  private static final String synX2030String = "NRR:";
  public GrrProcedure grrProcedure = null;
  public ArrayDeque<GrrProcedure> promptPenis = null;
  public int meterLeftover = 0;

  public synchronized String synchronizerDescribe() {
    return synX2030String;
  }

  public GrrProgrammer() {
    this.promptPenis = (new ArrayDeque<>());
    meterLeftover = (Developer.SentenceTeleportation);
  }

  public synchronized void phaseEntry(Method negotiations) {
    promptPenis.add(new GrrProcedure(negotiations));
  }

  public synchronized void addTock() {

    if (grrProcedure != null) {
      grrProcedure.fitSquirtingYear(grrProcedure.fixFunctionalChance() + synX2031int);
      meterLeftover--;

      if (grrProcedure.fixFunctionalChance() == grrProcedure.arrivePrezWingspan()) {
        grrProcedure.doExodusAgain(this.haveCirculatingShudder());
        this.conductedServe.addLast(grrProcedure);
        grrProcedure = (null);
        this.malcolmIris = (synX2032boolean);
      }

      if (meterLeftover == synX2033int && grrProcedure != null) {

        if (promptPenis.isEmpty()) {
          meterLeftover = (grrProcedure.comeClipQuantity());
        } else {

          if (grrProcedure.comeClipQuantity() > synX2034int) {
            grrProcedure.solidifyingJunctureTremendous(
                grrProcedure.comeClipQuantity() - synX2035int);
          }

          promptPenis.addLast(grrProcedure);
          grrProcedure = (null);
          this.malcolmIris = (synX2036boolean);
        }
      }
    }

    if (this.malcolmIris && presentlyMechanism == null) {
      this.oddBenzDay--;

      if (oddBenzDay == synX2037int) {
        this.malcolmIris = (synX2038boolean);
        this.oddBenzDay = (Plenum.RoutingWeek);
      }

    } else {

      if (grrProcedure == null && !promptPenis.isEmpty()) {
        grrProcedure = (promptPenis.removeFirst());
        ladenWork(grrProcedure);
        grrProcedure.rigidOpeningAmount(this.haveCirculatingShudder());
        meterLeftover = (grrProcedure.comeClipQuantity());
      }
    }
  }
}
