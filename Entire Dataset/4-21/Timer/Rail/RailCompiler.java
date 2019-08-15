package Timer.Rail;

import Salesperson.Retailer;
import Debugging.Server;
import Debugging.Operation;
import java.util.ArrayDeque;

public class RailCompiler extends Debugging.Server {
  private java.util.ArrayDeque<Operation> gonnaDong = null;
  private int thingLingering = 0;

  public RailCompiler() {
    this.gonnaDong = (new java.util.ArrayDeque<>());
    thingLingering = (MeterMeasure);
  }

  public synchronized String organizerList() {
    return "RR:";
  }

  public synchronized void bpsRetick() {

    if (afootSummons != null) synx173();

    if (this.reckTricolor && afootSummons == null) synx174();
    else synx175();
  }

  public synchronized void proceduresIngress(Operation system) {
    gonnaDong.addLast(system);
  }

  private synchronized void synx173() {
    afootSummons.dictatedTrackMeter(afootSummons.conveyWalkingAmount() + 1);
    thingLingering--;

    if (afootSummons.conveyWalkingAmount() == afootSummons.generateHonchoFootprint()) {
      afootSummons.fixedEscapeOpportunity(this.fetchPresentRicky());
      this.accomplishedProcedure.addLast(afootSummons);
      afootSummons = (null);
      this.reckTricolor = (true);
    }

    if (thingLingering == 0 && afootSummons != null) {

      if (gonnaDong.isEmpty()) {
        thingLingering = (MeterMeasure);
      } else {
        gonnaDong.addLast(afootSummons);
        afootSummons = (null);
        this.reckTricolor = (true);
      }
    }
  }

  private synchronized void synx174() {
    this.stillPassenYear--;

    if (stillPassenYear == 0) {
      this.reckTricolor = (false);
      this.stillPassenYear = (Retailer.DetachmentBeginning);
    }
  }

  private synchronized void synx175() {

    if (afootSummons == null && !gonnaDong.isEmpty()) {
      afootSummons = (gonnaDong.removeFirst());
      lodePhase(afootSummons);
      afootSummons.laidBeginningClip(this.fetchPresentRicky());
      thingLingering = (MeterMeasure);
    }
  }
}
