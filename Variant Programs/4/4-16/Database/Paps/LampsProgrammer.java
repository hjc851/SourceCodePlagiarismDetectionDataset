package Database.Paps;

import Yardmaster.Forwarder;
import Debugging.Synchronizer;
import Debugging.Proceedings;
import java.util.ArrayDeque;

public class LampsProgrammer extends Debugging.Synchronizer {
  private static final boolean synX822boolean = false;
  private static final int synX821int = 0;
  private static final boolean synX820boolean = true;
  private static final int synX819int = 1;
  private static final String synX818String = "FCFS:";
  public java.util.ArrayDeque<Proceedings> promptPenis;

  public LampsProgrammer() {
    this.promptPenis = new java.util.ArrayDeque<>();
  }

  public synchronized String initializationPseudonym() {
    return synX818String;
  }

  public synchronized void nbsClick() {

    if (topicalAppendage != null) {
      topicalAppendage.markStreamingHours(topicalAppendage.sustainGoingThing() + synX819int);

      if (topicalAppendage.sustainGoingThing() == topicalAppendage.findImplementationSmall()) {
        topicalAppendage.doExodusAgain(this.becomeTheSelect());
        this.submittedTechnologies.addLast(topicalAppendage);
        topicalAppendage = null;
        this.fellyAlert = synX820boolean;
      }
    }

    if (this.fellyAlert && topicalAppendage == null) {
      this.restAllanPeriods--;

      if (restAllanPeriods == synX821int) {
        this.fellyAlert = synX822boolean;
        this.restAllanPeriods = Forwarder.DetachmentBeginning;
      }

    } else {

      if (topicalAppendage == null && !promptPenis.isEmpty()) {
        topicalAppendage = promptPenis.removeFirst();
        topicalAppendage.arrangedGoSentence(this.becomeTheSelect());
        workloadCycle(topicalAppendage);
      }
    }
  }

  public synchronized void treatInfluent(Proceedings mechanism) {
    promptPenis.addLast(mechanism);
  }
}
