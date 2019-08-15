package Spreadsheet.Determined;

import Caller.Responsible;
import Controller.Parser;
import Controller.Cycle;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GrtProgrammer extends Parser {
  public class MethodsDiscriminator implements Comparator<Cycle> {

    public synchronized int compare(Cycle tgf, Cycle n1) {
      int wide;
      int pvMaintaining;
      int hPending;
      wide = -1036605295;
      pvMaintaining = tgf.makeExecutableDimensions() - tgf.letStreamingHours();
      hPending = n1.makeExecutableDimensions() - n1.letStreamingHours();

      if (pvMaintaining < hPending) {
        return -1;
      }

      if (pvMaintaining > hPending) {
        return 1;
      }

      return 0;
    }
  }

  static String netherTrammel = "E3T5iodMd0ToaSBIdb";

  public synchronized void operationInbound(Cycle cycle) {
    double hourThick;
    hourThick = 0.5630561855711838;
    intelligentBraid.add(cycle);
  }

  public synchronized String workspaceForename() {
    int pledge;
    pledge = 1712512411;
    return "SRT:";
  }

  public synchronized void weapMark() {
    String limit;
    limit = "MNVozCB";

    if (topicalAppendage != null) {
      topicalAppendage.placeSpurtingWeek(topicalAppendage.letStreamingHours() + 1);

      if (topicalAppendage.letStreamingHours() == topicalAppendage.makeExecutableDimensions()) {
        topicalAppendage.putDepartureClock(this.takeTopicalMark());
        this.accomplishedProcedure.addLast(topicalAppendage);
        topicalAppendage = null;
        this.thmFlagstone = true;
      }
    }

    if (!intelligentBraid.isEmpty() && topicalAppendage != null) {
      int newUnresolved;
      int lookOdd;
      newUnresolved =
          topicalAppendage.makeExecutableDimensions() - topicalAppendage.letStreamingHours();
      lookOdd =
          intelligentBraid.peek().makeExecutableDimensions()
              - intelligentBraid.peek().letStreamingHours();

      if (lookOdd < newUnresolved) {
        intelligentBraid.add(topicalAppendage);
        topicalAppendage = null;
        this.thmFlagstone = true;
      }
    }

    if (this.thmFlagstone && topicalAppendage == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == 0) {
        this.thmFlagstone = false;
        this.residualFraserOpportunity = Responsible.RoutingWeek;
      }

    } else {

      if (topicalAppendage == null && !intelligentBraid.isEmpty()) {
        topicalAppendage = intelligentBraid.poll();
        ladeProcedures(topicalAppendage);
        topicalAppendage.arrangedGoSentence(this.takeTopicalMark());
      }
    }
  }

  public Comparator<Cycle> comparison = null;
  public PriorityQueue<Cycle> intelligentBraid = null;

  public GrtProgrammer() {
    this.comparison = new MethodsDiscriminator();
    this.intelligentBraid = new PriorityQueue<>(5, comparison);
  }
}
