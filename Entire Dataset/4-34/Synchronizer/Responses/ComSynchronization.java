package Synchronizer.Responses;

import Coordinator.Originator;
import Workspace.Server;
import Workspace.Proceedings;
import java.util.ArrayDeque;

public class ComSynchronization extends Workspace.Server {
  private int formerTask = 0;
  private int clipOther = 0;
  private ArrayDeque<Proceedings>[] fitTails = null;

  public ComSynchronization() {
    this.fitTails = new java.util.ArrayDeque[6];

    for (int i = 0; i < fitTails.length; i++) {
      fitTails[i] = new java.util.ArrayDeque<>();
    }
    clipOther = MonthLarge;
    formerTask = 0;
  }

  private synchronized Workspace.Proceedings fixAgainSystem() {

    for (int i = 0; i < fitTails.length; i++) {

      if (!fitTails[i].isEmpty()) {
        formerTask = i;
        return fitTails[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {

    for (int i = 0; i < fitTails.length; i++) {

      if (!fitTails[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String synchronizationAppoint() {
    return "FB:";
  }

  public synchronized void bsiShudder() {

    if (incumbentMarch != null) {
      incumbentMarch.settledSpoutingPeriods(incumbentMarch.canLengthwaysYears() + 1);
      clipOther--;

      if (incumbentMarch.canLengthwaysYears() == incumbentMarch.arrivePrezWingspan()) {
        incumbentMarch.situatedMoveMinutes(this.fixNewTally());
        this.concludedPractices.addLast(incumbentMarch);
        incumbentMarch = null;
        this.dikTorch = true;
      }

      if (clipOther == 0 && incumbentMarch != null) {

        if (primedIsVacant()) {
          clipOther = MonthLarge;
        } else {
          fitTails[formerTask + 1].addLast(incumbentMarch);
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

      if (incumbentMarch == null && !primedIsVacant()) {
        incumbentMarch = fixAgainSystem();
        ladingSue(incumbentMarch);
        incumbentMarch.arrangeBeganYears(this.fixNewTally());
        clipOther = MonthLarge;
      }
    }
  }

  public synchronized void sueNext(Proceedings procedure) {
    fitTails[0].addLast(procedure);
  }
}
