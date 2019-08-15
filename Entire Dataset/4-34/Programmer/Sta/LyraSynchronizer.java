package Programmer.Sta;

import Coordinator.Originator;
import Workspace.Server;
import Workspace.Proceedings;
import java.util.ArrayDeque;

public class LyraSynchronizer extends Workspace.Server {
  private int meterLeftover = 0;
  private java.util.ArrayDeque<Proceedings> waitingList = null;

  public LyraSynchronizer() {
    this.waitingList = new java.util.ArrayDeque<>();
    meterLeftover = MonthLarge;
  }

  public synchronized String synchronizationAppoint() {
    return "RR:";
  }

  public synchronized void bsiShudder() {

    if (incumbentMarch != null) {
      incumbentMarch.settledSpoutingPeriods(incumbentMarch.canLengthwaysYears() + 1);
      meterLeftover--;

      if (incumbentMarch.canLengthwaysYears() == incumbentMarch.arrivePrezWingspan()) {
        incumbentMarch.situatedMoveMinutes(this.fixNewTally());
        this.concludedPractices.addLast(incumbentMarch);
        incumbentMarch = null;
        this.dikTorch = true;
      }

      if (meterLeftover == 0 && incumbentMarch != null) {

        if (waitingList.isEmpty()) {
          meterLeftover = MonthLarge;
        } else {
          waitingList.addLast(incumbentMarch);
          incumbentMarch = null;
          this.dikTorch = true;
        }
      }
    }

    if (this.dikTorch && incumbentMarch == null) {
      this.anotherBurberryYears--;

      if (anotherBurberryYears == 0) {
        this.dikTorch = false;
        this.anotherBurberryYears = Originator.DeployingOpportunity;
      }

    } else {

      if (incumbentMarch == null && !waitingList.isEmpty()) {
        incumbentMarch = waitingList.removeFirst();
        ladingSue(incumbentMarch);
        incumbentMarch.arrangeBeganYears(this.fixNewTally());
        meterLeftover = MonthLarge;
      }
    }
  }

  public synchronized void sueNext(Proceedings litigate) {
    waitingList.addLast(litigate);
  }
}
