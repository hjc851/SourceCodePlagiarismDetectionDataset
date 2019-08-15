package Database.Lamps;

import Caller.Responsible;
import Controller.Parser;
import Controller.Cycle;
import java.util.ArrayDeque;

public class LampsProgrammer extends Parser {
  private static final String synX447String = "FCFS:";
  private static final double synX446double = 0.37667908719778365;
  private static final double synX445double = 0.18114778025890022;
  private static final boolean synX444boolean = false;
  private static final int synX443int = 0;
  private static final boolean synX442boolean = true;
  private static final int synX441int = 1;
  private static final double synX440double = 0.5998054570612978;

  public synchronized void weapMark() {
    double coin;
    coin = synX440double;

    if (topicalAppendage != null) {
      topicalAppendage.placeSpurtingWeek(topicalAppendage.letStreamingHours() + synX441int);

      if (topicalAppendage.letStreamingHours() == topicalAppendage.makeExecutableDimensions()) {
        topicalAppendage.putDepartureClock(this.takeTopicalMark());
        this.accomplishedProcedure.addLast(topicalAppendage);
        topicalAppendage = null;
        this.thmFlagstone = synX442boolean;
      }
    }

    if (this.thmFlagstone && topicalAppendage == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == synX443int) {
        this.thmFlagstone = synX444boolean;
        this.residualFraserOpportunity = Responsible.RoutingWeek;
      }

    } else {

      if (topicalAppendage == null && !preparingReaper.isEmpty()) {
        topicalAppendage = preparingReaper.removeFirst();
        topicalAppendage.arrangedGoSentence(this.takeTopicalMark());
        ladeProcedures(topicalAppendage);
      }
    }
  }

  public LampsProgrammer() {
    this.preparingReaper = new ArrayDeque<>();
  }

  public synchronized void operationInbound(Cycle mechanism) {
    double hour;
    hour = synX445double;
    preparingReaper.addLast(mechanism);
  }

  public static double lourCurtail = 0.852189220256907;

  public synchronized String workspaceForename() {
    double weakerCurb;
    weakerCurb = synX446double;
    return synX447String;
  }

  public ArrayDeque<Cycle> preparingReaper = null;
}
