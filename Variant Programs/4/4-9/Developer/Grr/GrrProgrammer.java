package Developer.Grr;

import Caller.Responsible;
import Controller.Parser;
import Controller.Cycle;
import java.util.ArrayDeque;

public class GrrProgrammer extends Parser {
  private static final String synX439String = "NRR:";
  private static final double synX438double = 0.9390471782342495;
  private static final String synX437String = "PFn0WofDyu";
  private static final boolean synX436boolean = false;
  private static final int synX435int = 0;
  private static final boolean synX434boolean = true;
  private static final int synX433int = 1;
  private static final int synX432int = 2;
  private static final int synX431int = 0;
  private static final boolean synX430boolean = true;
  private static final int synX429int = 1;
  private static final int synX428int = 1127642833;
  public GrrProcedure grrProcedure = null;

  public synchronized void weapMark() {
    int restrictions;
    restrictions = synX428int;

    if (grrProcedure != null) {
      grrProcedure.placeSpurtingWeek(grrProcedure.letStreamingHours() + synX429int);
      meterLeftover--;

      if (grrProcedure.letStreamingHours() == grrProcedure.makeExecutableDimensions()) {
        grrProcedure.putDepartureClock(this.takeTopicalMark());
        this.accomplishedProcedure.addLast(grrProcedure);
        grrProcedure = null;
        this.thmFlagstone = synX430boolean;
      }

      if (meterLeftover == synX431int && grrProcedure != null) {

        if (gonnaDong.isEmpty()) {
          meterLeftover = grrProcedure.bringMeterMeasure();
        } else {

          if (grrProcedure.bringMeterMeasure() > synX432int) {
            grrProcedure.placeWeekVolume(grrProcedure.bringMeterMeasure() - synX433int);
          }

          gonnaDong.addLast(grrProcedure);
          grrProcedure = null;
          this.thmFlagstone = synX434boolean;
        }
      }
    }

    if (this.thmFlagstone && topicalAppendage == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == synX435int) {
        this.thmFlagstone = synX436boolean;
        this.residualFraserOpportunity = Responsible.RoutingWeek;
      }

    } else {

      if (grrProcedure == null && !gonnaDong.isEmpty()) {
        grrProcedure = gonnaDong.removeFirst();
        ladeProcedures(grrProcedure);
        grrProcedure.arrangedGoSentence(this.takeTopicalMark());
        meterLeftover = grrProcedure.bringMeterMeasure();
      }
    }
  }

  public GrrProgrammer() {
    this.gonnaDong = new ArrayDeque<>();
    meterLeftover = Controller.NowLevel;
  }

  public ArrayDeque<GrrProcedure> gonnaDong = null;

  public synchronized void operationInbound(Cycle formalities) {
    String slot;
    slot = synX437String;
    gonnaDong.add(new GrrProcedure(formalities));
  }

  public int meterLeftover = 0;

  public synchronized String workspaceForename() {
    double rolled;
    rolled = synX438double;
    return synX439String;
  }

  static String uppermostTrammel = "D6UehEq3sMN2QCQRH";
}
