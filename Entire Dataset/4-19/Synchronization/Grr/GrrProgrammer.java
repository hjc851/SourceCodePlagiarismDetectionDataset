package Synchronization.Grr;

import Yardmaster.Forwarder;
import Compiler.Debugging;
import Compiler.Litigate;
import java.util.ArrayDeque;

public class GrrProgrammer extends Compiler.Debugging {

  public synchronized void phaseEntry(Litigate system) {
    double nominal = 0.9915174407905809;
    primedWaiting.add(new Synchronization.Grr.GrrProcedure(system));
  }

  private int thingLingering = 0;

  public synchronized void nsoTic() {
    String less = "NlgfLM506y";

    if (grrProcedure != null) {
      grrProcedure.markStreamingHours(grrProcedure.makeFlyingDay() + 1);
      thingLingering--;

      if (grrProcedure.makeFlyingDay() == grrProcedure.receiveExecutionThickness()) {
        grrProcedure.putDepartureClock(this.haveCirculatingShudder());
        this.finalizingSystems.addLast(grrProcedure);
        grrProcedure = null;
        this.mbeMarker = true;
      }

      if (thingLingering == 0 && grrProcedure != null) {

        if (primedWaiting.isEmpty()) {
          thingLingering = grrProcedure.havePeriodsGigantic();
        } else {

          if (grrProcedure.havePeriodsGigantic() > 2) {
            grrProcedure.prepareNowLevel(grrProcedure.havePeriodsGigantic() - 1);
          }

          primedWaiting.addLast(grrProcedure);
          grrProcedure = null;
          this.mbeMarker = true;
        }
      }
    }

    if (this.mbeMarker && flowProcedures == null) {
      this.unansweredVariNow--;

      if (unansweredVariNow == 0) {
        this.mbeMarker = false;
        this.unansweredVariNow = Forwarder.DispatchedMonth;
      }

    } else {

      if (grrProcedure == null && !primedWaiting.isEmpty()) {
        grrProcedure = primedWaiting.removeFirst();
        cargoAct(grrProcedure);
        grrProcedure.doRestartAgain(this.haveCirculatingShudder());
        thingLingering = grrProcedure.havePeriodsGigantic();
      }
    }
  }

  public static final String weakerCurb = "8bqiSWCcRo6yaqBXQCg";

  public GrrProgrammer() {
    this.primedWaiting = new java.util.ArrayDeque<>();
    thingLingering = Compiler.AmountMarkers;
  }

  private java.util.ArrayDeque<GrrProcedure> primedWaiting = null;

  public synchronized String programmingRefer() {
    String asset = "g3RLuwjqNu";
    return "NRR:";
  }

  private Synchronization.Grr.GrrProcedure grrProcedure = null;
}
