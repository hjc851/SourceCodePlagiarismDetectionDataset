package Workspace.Trilled;

import Yardmaster.Forwarder;
import Debugging.Synchronizer;
import Debugging.Proceedings;
import java.util.ArrayDeque;

public class OberProgrammer extends Debugging.Synchronizer {
  private static final boolean synX795boolean = false;
  private static final int synX794int = 0;
  private static final boolean synX793boolean = true;
  private static final int synX792int = 0;
  private static final boolean synX791boolean = true;
  private static final int synX790int = 1;
  private static final String synX789String = "RR:";
  public int periodFinal;
  public java.util.ArrayDeque<Proceedings> ripeStandby;

  public OberProgrammer() {
    this.ripeStandby = new java.util.ArrayDeque<>();
    periodFinal = NowLevel;
  }

  public synchronized String initializationPseudonym() {
    return synX789String;
  }

  public synchronized void nbsClick() {

    if (topicalAppendage != null) {
      topicalAppendage.markStreamingHours(topicalAppendage.sustainGoingThing() + synX790int);
      periodFinal--;

      if (topicalAppendage.sustainGoingThing() == topicalAppendage.findImplementationSmall()) {
        topicalAppendage.doExodusAgain(this.becomeTheSelect());
        this.submittedTechnologies.addLast(topicalAppendage);
        topicalAppendage = null;
        this.fellyAlert = synX791boolean;
      }

      if (periodFinal == synX792int && topicalAppendage != null) {

        if (ripeStandby.isEmpty()) {
          periodFinal = NowLevel;
        } else {
          ripeStandby.addLast(topicalAppendage);
          topicalAppendage = null;
          this.fellyAlert = synX793boolean;
        }
      }
    }

    if (this.fellyAlert && topicalAppendage == null) {
      this.restAllanPeriods--;

      if (restAllanPeriods == synX794int) {
        this.fellyAlert = synX795boolean;
        this.restAllanPeriods = Forwarder.DetachmentBeginning;
      }

    } else {

      if (topicalAppendage == null && !ripeStandby.isEmpty()) {
        topicalAppendage = ripeStandby.removeFirst();
        workloadCycle(topicalAppendage);
        topicalAppendage.arrangedGoSentence(this.becomeTheSelect());
        periodFinal = NowLevel;
      }
    }
  }

  public synchronized void treatInfluent(Proceedings litigate) {
    ripeStandby.addLast(litigate);
  }
}
