package Synchronization.Aerobic;

import Yardmaster.Forwarder;
import Debugging.Synchronizer;
import Debugging.Proceedings;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DaysDebugging extends Debugging.Synchronizer {
  public java.util.Comparator<Proceedings> contrast;
  public java.util.PriorityQueue<Proceedings> makeRow;

  public DaysDebugging() {
    this.contrast = new MechanismsComparaison();
    this.makeRow = new java.util.PriorityQueue<>(5, contrast);
  }

  public class MechanismsComparaison implements Comparator<Proceedings> {

    public synchronized int compare(Proceedings e, Proceedings a2) {
      int p3Leftover;
      int p5Odd;
      p3Leftover = e.findImplementationSmall() - e.sustainGoingThing();
      p5Odd = a2.findImplementationSmall() - a2.sustainGoingThing();

      if (p3Leftover < p5Odd) {
        return -1;
      }

      if (p3Leftover > p5Odd) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String initializationPseudonym() {
    return "SRT:";
  }

  public synchronized void nbsClick() {

    if (topicalAppendage != null) {
      topicalAppendage.markStreamingHours(topicalAppendage.sustainGoingThing() + 1);

      if (topicalAppendage.sustainGoingThing() == topicalAppendage.findImplementationSmall()) {
        topicalAppendage.doExodusAgain(this.becomeTheSelect());
        this.submittedTechnologies.addLast(topicalAppendage);
        topicalAppendage = null;
        this.fellyAlert = true;
      }
    }

    if (!makeRow.isEmpty() && topicalAppendage != null) {
      int contemporaryUnexhausted;
      int glintLeftover;
      contemporaryUnexhausted =
          topicalAppendage.findImplementationSmall() - topicalAppendage.sustainGoingThing();
      glintLeftover = makeRow.peek().findImplementationSmall() - makeRow.peek().sustainGoingThing();

      if (glintLeftover < contemporaryUnexhausted) {
        makeRow.add(topicalAppendage);
        topicalAppendage = null;
        this.fellyAlert = true;
      }
    }

    if (this.fellyAlert && topicalAppendage == null) {
      this.restAllanPeriods--;

      if (restAllanPeriods == 0) {
        this.fellyAlert = false;
        this.restAllanPeriods = Forwarder.DetachmentBeginning;
      }

    } else {

      if (topicalAppendage == null && !makeRow.isEmpty()) {
        topicalAppendage = makeRow.poll();
        workloadCycle(topicalAppendage);
        topicalAppendage.arrangedGoSentence(this.becomeTheSelect());
      }
    }
  }

  public synchronized void treatInfluent(Proceedings methodology) {
    makeRow.add(methodology);
  }
}
