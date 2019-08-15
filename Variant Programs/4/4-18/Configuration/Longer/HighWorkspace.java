package Configuration.Longer;

import Shipper.Responsible;
import Spooler.Planner;
import Spooler.Appendage;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HighWorkspace extends Spooler.Planner {
  public java.util.Comparator<Appendage> comparative = null;

  public class WorkBenchmarking implements Comparator<Appendage> {

    public synchronized int compare(Appendage p5, Appendage f2) {
      String minnOuter;
      int interferonStay;
      int gUnsold;
      minnOuter = "x74nbi6qquXnA";
      interferonStay = p5.arrivePrezWingspan() - p5.takeFunctioningPeriod();
      gUnsold = f2.arrivePrezWingspan() - f2.takeFunctioningPeriod();

      if (interferonStay < gUnsold) {
        return -1;
      }

      if (interferonStay > gUnsold) {
        return 1;
      }

      return 0;
    }
  }

  static double maine = 0.19050892274269982;
  public java.util.PriorityQueue<Appendage> makeRow = null;

  public HighWorkspace() {
    this.comparative = new WorkBenchmarking();
    this.makeRow = new java.util.PriorityQueue<>(5, comparative);
  }

  public synchronized String workspaceForename() {
    double heightConfine;
    heightConfine = 0.5416341006227785;
    return "SRT:";
  }

  public synchronized void appendageEntering(Appendage mechanism) {
    double unfree;
    unfree = 0.8812598186397208;
    makeRow.add(mechanism);
  }

  public synchronized void optiBeat() {
    int universal;
    universal = 1919197151;

    if (incumbentMarch != null) synx128();

    if (!makeRow.isEmpty() && incumbentMarch != null) synx129();

    if (this.telaDroop && incumbentMarch == null) synx130();
    else synx131();
  }

  private synchronized void synx128() {
    incumbentMarch.doRushingAgain(incumbentMarch.takeFunctioningPeriod() + 1);

    if (incumbentMarch.takeFunctioningPeriod() == incumbentMarch.arrivePrezWingspan()) {
      incumbentMarch.fixDepartThing(this.makeIncumbentTock());
      this.realizedWork.addLast(incumbentMarch);
      incumbentMarch = null;
      this.telaDroop = true;
    }
  }

  private synchronized void synx129() {
    int circulatingRest;
    int cheatStay;
    circulatingRest = incumbentMarch.arrivePrezWingspan() - incumbentMarch.takeFunctioningPeriod();
    cheatStay = makeRow.peek().arrivePrezWingspan() - makeRow.peek().takeFunctioningPeriod();

    if (cheatStay < circulatingRest) {
      makeRow.add(incumbentMarch);
      incumbentMarch = null;
      this.telaDroop = true;
    }
  }

  private synchronized void synx130() {
    this.leftDeviceClock--;

    if (leftDeviceClock == 0) {
      this.telaDroop = false;
      this.leftDeviceClock = Responsible.DeployChance;
    }
  }

  private synchronized void synx131() {

    if (incumbentMarch == null && !makeRow.isEmpty()) {
      incumbentMarch = makeRow.poll();
      stowLitigate(incumbentMarch);
      incumbentMarch.fixEarlyThing(this.makeIncumbentTock());
    }
  }
}
