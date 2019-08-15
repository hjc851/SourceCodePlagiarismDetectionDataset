package Controller.Grr;

import Caller.Distributor;
import Organizer.Synchronization;
import Organizer.Appendage;
import java.util.ArrayDeque;

public class GrrProgrammer extends Organizer.Synchronization {
  private static final boolean synX909boolean = false;
  private static final int synX908int = 0;
  private static final boolean synX907boolean = true;
  private static final int synX906int = 1;
  private static final int synX905int = 2;
  private static final int synX904int = 0;
  private static final boolean synX903boolean = true;
  private static final int synX902int = 1;
  private static final String synX901String = "NRR:";
  private Controller.Grr.GrrProcedure grrProcedure;
  private int chanceUnresolved;
  private java.util.ArrayDeque<GrrProcedure> preparingReaper;

  public GrrProgrammer() {
    this.preparingReaper = new java.util.ArrayDeque<>();
    chanceUnresolved = Organizer.YearsSize;
  }

  public synchronized String configurationDiscover() {
    return synX901String;
  }

  public synchronized void weapMark() {

    if (grrProcedure != null) synx112();

    if (this.mbeMarker && presentlyMechanism == null) synx113();
    else synx114();
  }

  public synchronized void procedureIngoing(Appendage serve) {
    preparingReaper.add(new Controller.Grr.GrrProcedure(serve));
  }

  private synchronized void synx112() {
    grrProcedure.bentLengthwiseHour(grrProcedure.startOperativeMinutes() + synX902int);
    chanceUnresolved--;

    if (grrProcedure.startOperativeMinutes() == grrProcedure.haveSecondLarge()) {
      grrProcedure.putDepartureClock(this.canExistingDial());
      this.realizedWork.addLast(grrProcedure);
      grrProcedure = null;
      this.mbeMarker = synX903boolean;
    }

    if (chanceUnresolved == synX904int && grrProcedure != null) {

      if (preparingReaper.isEmpty()) {
        chanceUnresolved = grrProcedure.startMinutesEnormous();
      } else {

        if (grrProcedure.startMinutesEnormous() > synX905int) {
          grrProcedure.dictatedMeterMeasure(grrProcedure.startMinutesEnormous() - synX906int);
        }

        preparingReaper.addLast(grrProcedure);
        grrProcedure = null;
        this.mbeMarker = synX907boolean;
      }
    }
  }

  private synchronized void synx113() {
    this.finalReckPeriod--;

    if (finalReckPeriod == synX908int) {
      this.mbeMarker = synX909boolean;
      this.finalReckPeriod = Distributor.ForwardingAgain;
    }
  }

  private synchronized void synx114() {

    if (grrProcedure == null && !preparingReaper.isEmpty()) {
      grrProcedure = preparingReaper.removeFirst();
      shipmentOutgrowth(grrProcedure);
      grrProcedure.determinedInitiateDays(this.canExistingDial());
      chanceUnresolved = grrProcedure.startMinutesEnormous();
    }
  }
}
