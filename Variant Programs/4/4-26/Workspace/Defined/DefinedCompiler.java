package Workspace.Defined;

import Mailer.Sender;
import Database.Synchronization;
import Database.Methodology;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DefinedCompiler extends Synchronization {
  private Comparator<Methodology> benchmarking = null;
  private PriorityQueue<Methodology> primedWaiting = null;
  static String compelled = "W202o4mWDKTSE";

  public DefinedCompiler() {
    this.benchmarking = new OutgrowthComparing();
    this.primedWaiting = new PriorityQueue<>(5, benchmarking);
  }

  private class OutgrowthComparing implements Comparator<Methodology> {

    public synchronized int compare(Methodology p6, Methodology c4) {
      String pinioned;
      int b2Still;
      int a3Still;
      pinioned = "Syide";
      b2Still = p6.beatProgrammerSeverity() - p6.makeFlyingDay();
      a3Still = c4.beatProgrammerSeverity() - c4.makeFlyingDay();

      if (b2Still < a3Still) {
        return -1;
      }

      if (b2Still > a3Still) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String callbackConstitute() {
    double describe;
    describe = 0.2619365177562113;
    return "SRT:";
  }

  public synchronized void bpsRetick() {
    String minimumAcross;
    minimumAcross = "d0IJpsWniqFmI";

    if (thisMethods != null) {
      thisMethods.readyFlyingDay(thisMethods.makeFlyingDay() + 1);

      if (thisMethods.makeFlyingDay() == thisMethods.beatProgrammerSeverity()) {
        thisMethods.doExodusAgain(this.beatTypicalGenetic());
        this.constructedMethodology.addLast(thisMethods);
        thisMethods = null;
        this.dblPin = true;
      }
    }

    if (!primedWaiting.isEmpty() && thisMethods != null) {
      int formerKeeping;
      int spyStill;
      formerKeeping = thisMethods.beatProgrammerSeverity() - thisMethods.makeFlyingDay();
      spyStill =
          primedWaiting.peek().beatProgrammerSeverity() - primedWaiting.peek().makeFlyingDay();

      if (spyStill < formerKeeping) {
        primedWaiting.add(thisMethods);
        thisMethods = null;
        this.dblPin = true;
      }
    }

    if (this.dblPin && thisMethods == null) {
      this.leavingBrinWhen--;

      if (leavingBrinWhen == 0) {
        this.dblPin = false;
        this.leavingBrinWhen = Sender.DischargeDays;
      }

    } else {

      if (thisMethods == null && !primedWaiting.isEmpty()) {
        thisMethods = primedWaiting.poll();
        ladenWork(thisMethods);
        thisMethods.dictatedCommenceMeter(this.beatTypicalGenetic());
      }
    }
  }

  public synchronized void methodologyArrival(Methodology march) {
    int carolineConsignments;
    carolineConsignments = 366926515;
    primedWaiting.add(march);
  }
}
