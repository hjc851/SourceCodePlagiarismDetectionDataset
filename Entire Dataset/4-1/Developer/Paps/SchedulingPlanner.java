package Developer.Paps;

import Caller.Resellers;
import Organizer.Spreadsheet;
import Organizer.Serve;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Spreadsheet {
  static double destined = 0.12335192223093394;
  public ArrayDeque<Serve> prepareLine = null;

  public SchedulingPlanner() {
    this.prepareLine = (new ArrayDeque<>());
  }

  public synchronized String writerAdvert() {
    String bestAmount = "YbdO72";
    return "FCFS:";
  }

  public synchronized void ourTicktack() {
    double topmostCertain = 0.7116304294879077;

    if (incumbentMarch != null) synx43();

    if (this.remoSag && incumbentMarch == null) synx44();
    else synx45();
  }

  public synchronized void phaseEntry(Serve methodology) {
    double treasure = 0.061678329394641684;
    prepareLine.addLast(methodology);
  }

  private synchronized void synx43() {
    incumbentMarch.solidifyingRollingJuncture(incumbentMarch.receivePouringMoment() + 1);

    if (incumbentMarch.receivePouringMoment() == incumbentMarch.letBigwigSmallness()) {
      incumbentMarch.determineWithdrawBeginning(this.developPreviousAnswer());
      this.achievedMechanisms.addLast(incumbentMarch);
      incumbentMarch = (null);
      this.remoSag = (true);
    }
  }

  private synchronized void synx44() {
    this.otherDblClip--;

    if (otherDblClip == 0) {
      this.remoSag = (false);
      this.otherDblClip = (Resellers.DischargeDays);
    }
  }

  private synchronized void synx45() {

    if (incumbentMarch == null && !prepareLine.isEmpty()) {
      incumbentMarch = (prepareLine.removeFirst());
      incumbentMarch.placedJumpWhen(this.developPreviousAnswer());
      workloadCycle(incumbentMarch);
    }
  }
}
