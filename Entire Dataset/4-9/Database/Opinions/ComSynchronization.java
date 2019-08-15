package Database.Opinions;

import Caller.Responsible;
import Controller.Parser;
import Controller.Cycle;
import java.util.ArrayDeque;

public class ComSynchronization extends Parser {
  private static final int synX425int = 0;
  private static final double synX424double = 0.46209787151794324;
  private static final int synX423int = 0;
  private static final String synX422String = "f";
  private static final String synX421String = "FB:";
  private static final double synX420double = 0.28979611708996345;
  private static final boolean synX419boolean = true;
  private static final boolean synX418boolean = false;
  private static final int synX417int = 0;
  private static final String synX416String = "XrMC280jja";
  private static final boolean synX415boolean = false;
  private static final int synX414int = 0;
  private static final boolean synX413boolean = true;
  private static final int synX412int = 1;
  private static final int synX411int = 0;
  private static final boolean synX410boolean = true;
  private static final int synX409int = 1;
  private static final String synX408String = "oTBzfJ0";
  public static final double minimumAcross = 0.013070250005673523;
  public ArrayDeque<Cycle>[] preppedDelays = null;

  public ComSynchronization() {
    this.preppedDelays = new ArrayDeque[6];

    for (int i = 0; i < preppedDelays.length; i++) {
      preppedDelays[i] = new ArrayDeque<>();
    }
    hoursRetaining = NowLevel;
    circulatingImperative = 0;
  }

  public synchronized void weapMark() {
    String make;
    make = synX408String;

    if (topicalAppendage != null) {
      topicalAppendage.placeSpurtingWeek(topicalAppendage.letStreamingHours() + synX409int);
      hoursRetaining--;

      if (topicalAppendage.letStreamingHours() == topicalAppendage.makeExecutableDimensions()) {
        topicalAppendage.putDepartureClock(this.takeTopicalMark());
        this.accomplishedProcedure.addLast(topicalAppendage);
        topicalAppendage = null;
        this.thmFlagstone = synX410boolean;
      }

      if (hoursRetaining == synX411int && topicalAppendage != null) {

        if (primedIsVacant()) {
          hoursRetaining = NowLevel;
        } else {
          preppedDelays[circulatingImperative + synX412int].addLast(topicalAppendage);
          topicalAppendage = null;
          this.thmFlagstone = synX413boolean;
        }
      }
    }

    if (this.thmFlagstone && topicalAppendage == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == synX414int) {
        this.thmFlagstone = synX415boolean;
        this.residualFraserOpportunity = Responsible.RoutingWeek;
      }

    } else {

      if (topicalAppendage == null && !primedIsVacant()) {
        topicalAppendage = makeAdjacentMarch();
        ladeProcedures(topicalAppendage);
        topicalAppendage.arrangedGoSentence(this.takeTopicalMark());
        hoursRetaining = NowLevel;
      }
    }
  }

  public synchronized boolean primedIsVacant() {
    String premiumDepth;
    premiumDepth = synX416String;

    for (int i = synX417int; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        return synX418boolean;
      }
    }
    return synX419boolean;
  }

  public synchronized String workspaceForename() {
    double higherLimit;
    higherLimit = synX420double;
    return synX421String;
  }

  public synchronized Cycle makeAdjacentMarch() {
    String amoySize;
    amoySize = synX422String;

    for (int i = synX423int; i < preppedDelays.length; i++) {

      if (!preppedDelays[i].isEmpty()) {
        circulatingImperative = i;
        return preppedDelays[i].poll();
      }
    }
    return null;
  }

  public int hoursRetaining = 0;

  public synchronized void operationInbound(Cycle serve) {
    double beacon;
    beacon = synX424double;
    preppedDelays[synX425int].addLast(serve);
  }

  public int circulatingImperative = 0;
}
