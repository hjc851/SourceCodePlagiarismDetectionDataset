package Workspace.Comments;

import Yardmaster.Forwarder;
import Debugging.Synchronizer;
import Debugging.Proceedings;
import java.util.ArrayDeque;

public class DirectServer extends Debugging.Synchronizer {
  private static final int synX808int = 0;
  private static final boolean synX807boolean = false;
  private static final int synX806int = 0;
  private static final boolean synX805boolean = true;
  private static final int synX804int = 1;
  private static final int synX803int = 0;
  private static final boolean synX802boolean = true;
  private static final int synX801int = 1;
  private static final String synX800String = "FB:";
  private static final boolean synX799boolean = true;
  private static final boolean synX798boolean = false;
  private static final int synX797int = 0;
  private static final int synX796int = 0;
  public int thisPrioritization;
  public int clockLeft;
  public ArrayDeque<Proceedings>[] promptCode;

  public DirectServer() {
    this.promptCode = new java.util.ArrayDeque[6];

    for (int i = 0; i < promptCode.length; i++) {
      promptCode[i] = new java.util.ArrayDeque<>();
    }
    clockLeft = NowLevel;
    thisPrioritization = 0;
  }

  public synchronized Debugging.Proceedings arriveExpectedProcedures() {

    for (int i = synX796int; i < promptCode.length; i++) {

      if (!promptCode[i].isEmpty()) {
        thisPrioritization = i;
        return promptCode[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = synX797int; i < promptCode.length; i++) {

      if (!promptCode[i].isEmpty()) {
        return synX798boolean;
      }
    }
    return synX799boolean;
  }

  public synchronized String initializationPseudonym() {
    return synX800String;
  }

  public synchronized void nbsClick() {

    if (topicalAppendage != null) {
      topicalAppendage.markStreamingHours(topicalAppendage.sustainGoingThing() + synX801int);
      clockLeft--;

      if (topicalAppendage.sustainGoingThing() == topicalAppendage.findImplementationSmall()) {
        topicalAppendage.doExodusAgain(this.becomeTheSelect());
        this.submittedTechnologies.addLast(topicalAppendage);
        topicalAppendage = null;
        this.fellyAlert = synX802boolean;
      }

      if (clockLeft == synX803int && topicalAppendage != null) {

        if (primedIsVacant()) {
          clockLeft = NowLevel;
        } else {
          promptCode[thisPrioritization + synX804int].addLast(topicalAppendage);
          topicalAppendage = null;
          this.fellyAlert = synX805boolean;
        }
      }
    }

    if (this.fellyAlert && topicalAppendage == null) {
      this.restAllanPeriods--;

      if (restAllanPeriods == synX806int) {
        this.fellyAlert = synX807boolean;
        this.restAllanPeriods = Forwarder.DetachmentBeginning;
      }

    } else {

      if (topicalAppendage == null && !primedIsVacant()) {
        topicalAppendage = arriveExpectedProcedures();
        workloadCycle(topicalAppendage);
        topicalAppendage.arrangedGoSentence(this.becomeTheSelect());
        clockLeft = NowLevel;
      }
    }
  }

  public synchronized void treatInfluent(Proceedings cycle) {
    promptCode[synX808int].addLast(cycle);
  }
}
