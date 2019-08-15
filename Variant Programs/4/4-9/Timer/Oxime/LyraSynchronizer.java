package Timer.Oxime;

import Caller.Responsible;
import Controller.Parser;
import Controller.Cycle;
import java.util.ArrayDeque;

public class LyraSynchronizer extends Parser {
  private static final boolean synX407boolean = false;
  private static final int synX406int = 0;
  private static final boolean synX405boolean = true;
  private static final int synX404int = 0;
  private static final boolean synX403boolean = true;
  private static final int synX402int = 1;
  private static final double synX401double = 0.8469827653988334;
  private static final double synX400double = 0.749729979567796;
  private static final String synX399String = "RR:";
  private static final double synX398double = 0.029258831403999208;
  public ArrayDeque<Cycle> promptPenis = null;
  public int daysRemainder = 0;
  static final String tell = "Mv7s3tXUJUUwBBpXih";

  public synchronized String workspaceForename() {
    double maximum;
    maximum = synX398double;
    return synX399String;
  }

  public synchronized void operationInbound(Cycle march) {
    double notional;
    notional = synX400double;
    promptPenis.addLast(march);
  }

  public LyraSynchronizer() {
    this.promptPenis = new ArrayDeque<>();
    daysRemainder = NowLevel;
  }

  public synchronized void weapMark() {
    double obligated;
    obligated = synX401double;

    if (topicalAppendage != null) {
      topicalAppendage.placeSpurtingWeek(topicalAppendage.letStreamingHours() + synX402int);
      daysRemainder--;

      if (topicalAppendage.letStreamingHours() == topicalAppendage.makeExecutableDimensions()) {
        topicalAppendage.putDepartureClock(this.takeTopicalMark());
        this.accomplishedProcedure.addLast(topicalAppendage);
        topicalAppendage = null;
        this.thmFlagstone = synX403boolean;
      }

      if (daysRemainder == synX404int && topicalAppendage != null) {

        if (promptPenis.isEmpty()) {
          daysRemainder = NowLevel;
        } else {
          promptPenis.addLast(topicalAppendage);
          topicalAppendage = null;
          this.thmFlagstone = synX405boolean;
        }
      }
    }

    if (this.thmFlagstone && topicalAppendage == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == synX406int) {
        this.thmFlagstone = synX407boolean;
        this.residualFraserOpportunity = Responsible.RoutingWeek;
      }

    } else {

      if (topicalAppendage == null && !promptPenis.isEmpty()) {
        topicalAppendage = promptPenis.removeFirst();
        ladeProcedures(topicalAppendage);
        topicalAppendage.arrangedGoSentence(this.takeTopicalMark());
        daysRemainder = NowLevel;
      }
    }
  }
}
