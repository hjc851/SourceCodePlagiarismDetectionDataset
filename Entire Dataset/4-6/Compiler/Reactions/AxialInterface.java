package Compiler.Reactions;

import Plenum.Dealer;
import Workflow.Programming;
import Workflow.Treat;
import java.util.ArrayDeque;

public class AxialInterface extends Programming {
  private static final int synX198int = 0;
  private static final boolean synX197boolean = false;
  private static final int synX196int = 0;
  private static final boolean synX195boolean = true;
  private static final int synX194int = 1;
  private static final int synX193int = 0;
  private static final boolean synX192boolean = true;
  private static final int synX191int = 1;
  private static final String synX190String = "FB:";
  private static final boolean synX189boolean = true;
  private static final boolean synX188boolean = false;
  private static final int synX187int = 0;
  private static final int synX186int = 0;
  public ArrayDeque<Treat>[] fitTails = null;
  public int junctureMaintaining = 0;
  public int incumbentPrioritized = 0;

  public AxialInterface() {
    this.fitTails = (new ArrayDeque[6]);

    for (int i = 0; i < fitTails.length; i++) {
      fitTails[i] = (new ArrayDeque<>());
    }
    junctureMaintaining = (WhenValue);
    incumbentPrioritized = (0);
  }

  public synchronized Treat findSucceedingAct() {

    for (int i = synX186int; i < fitTails.length; i++) {

      if (!fitTails[i].isEmpty()) {
        incumbentPrioritized = (i);
        return fitTails[i].poll();
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {

    for (int i = synX187int; i < fitTails.length; i++) {

      if (!fitTails[i].isEmpty()) {
        return synX188boolean;
      }
    }
    return synX189boolean;
  }

  public synchronized String serverDiagnose() {
    return synX190String;
  }

  public synchronized void ourTicktack() {

    if (formerFormalities != null) {
      formerFormalities.determinedScamperingDays(
          formerFormalities.letStreamingHours() + synX191int);
      junctureMaintaining--;

      if (formerFormalities.letStreamingHours() == formerFormalities.fixCfoProportions()) {
        formerFormalities.laidLeaveClip(this.arriveFlowIndicate());
        this.achievedMechanisms.addLast(formerFormalities);
        formerFormalities = (null);
        this.drieRag = (synX192boolean);
      }

      if (junctureMaintaining == synX193int && formerFormalities != null) {

        if (primedIsVacant()) {
          junctureMaintaining = (WhenValue);
        } else {
          fitTails[incumbentPrioritized + synX194int].addLast(formerFormalities);
          formerFormalities = (null);
          this.drieRag = (synX195boolean);
        }
      }
    }

    if (this.drieRag && formerFormalities == null) {
      this.stayLtsHour--;

      if (stayLtsHour == synX196int) {
        this.drieRag = (synX197boolean);
        this.stayLtsHour = (Dealer.SendNow);
      }

    } else {

      if (formerFormalities == null && !primedIsVacant()) {
        formerFormalities = (findSucceedingAct());
        encumbranceSummons(formerFormalities);
        formerFormalities.readyOutsetDay(this.arriveFlowIndicate());
        junctureMaintaining = (WhenValue);
      }
    }
  }

  public synchronized void phaseEntry(Treat mechanisms) {
    fitTails[synX198int].addLast(mechanisms);
  }
}
