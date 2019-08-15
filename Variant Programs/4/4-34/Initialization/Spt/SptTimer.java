package Initialization.Spt;

import Coordinator.Originator;
import Workspace.Server;
import Workspace.Proceedings;
import java.util.ArrayDeque;

public class SptTimer extends Workspace.Server {
  private java.util.ArrayDeque<Proceedings> preppedDragon = null;

  public SptTimer() {
    this.preppedDragon = new java.util.ArrayDeque<>();
  }

  public synchronized String synchronizationAppoint() {
    return "FCFS:";
  }

  public synchronized void bsiShudder() {

    if (incumbentMarch != null) {
      incumbentMarch.settledSpoutingPeriods(incumbentMarch.canLengthwaysYears() + 1);

      if (incumbentMarch.canLengthwaysYears() == incumbentMarch.arrivePrezWingspan()) {
        incumbentMarch.situatedMoveMinutes(this.fixNewTally());
        this.concludedPractices.addLast(incumbentMarch);
        incumbentMarch = null;
        this.dikTorch = true;
      }
    }

    if (this.dikTorch && incumbentMarch == null) {
      this.anotherBurberryYears--;

      if (anotherBurberryYears == 0) {
        this.dikTorch = false;
        this.anotherBurberryYears = Originator.DeployingOpportunity;
      }

    } else {

      if (incumbentMarch == null && !preppedDragon.isEmpty()) {
        incumbentMarch = preppedDragon.removeFirst();
        incumbentMarch.arrangeBeganYears(this.fixNewTally());
        ladingSue(incumbentMarch);
      }
    }
  }

  public synchronized void sueNext(Proceedings treat) {
    preppedDragon.addLast(treat);
  }
}
