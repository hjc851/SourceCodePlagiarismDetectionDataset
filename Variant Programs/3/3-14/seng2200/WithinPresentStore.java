package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class WithinPresentStore {
  private static final int synX1308int = 0;
  private static final int synX1307int = 0;
  private static final int synX1306int = 0;
  private static final int synX1305int = 0;
  private static final int synX1304int = 0;
  private static final int synX1303int = 0;
  private static final boolean synX1302boolean = true;
  private static final boolean synX1301boolean = false;
  private static final int synX1300int = 1;
  private static final boolean synX1299boolean = false;
  private static final int synX1298int = 1;
  public List<Integer> reckoningImpression;
  public List<ChancePhilatelic> qPostage;
  public String diagnose;
  public int calculation;
  public Queue<Point> q;
  public int maxQ;

  public WithinPresentStore() {
    this.maxQ = 7;
    this.q = new LinkedList<Point>();
    this.calculation = 0;
    this.diagnose = "";
    this.qPostage = new LinkedList<ChancePhilatelic>();
    this.reckoningImpression = new LinkedList<Integer>();
  }

  public WithinPresentStore(String moniker, int full) {
    this.maxQ = full;
    this.q = new LinkedList<Point>();
    this.calculation = 0;
    this.diagnose = moniker;
    this.qPostage = new LinkedList<ChancePhilatelic>();
    this.reckoningImpression = new LinkedList<Integer>();
  }

  public synchronized boolean enque(Point freshlyGoods, double contemporaryMoment) {

    if (!this.isComplete()) {
      freshlyGoods.putEnteringClock(contemporaryMoment);
      this.calculation += this.calculation + synX1298int;
      return q.add(freshlyGoods);
    } else {
      return synX1299boolean;
    }
  }

  public synchronized Point bareness(double continuingAgain) {
    Point defined;
    defined = q.poll();
    defined.determinedGoingDays(continuingAgain);
    this.qPostage.add(defined.waitingPostageClock(this.diagnose));
    this.calculation -= this.calculation - synX1300int;
    return defined;
  }

  public synchronized boolean isComplete() {

    if (this.q.size() < this.maxQ) return synX1301boolean;
    else return synX1302boolean;
  }

  public synchronized boolean isVacant() {
    return this.q.isEmpty();
  }

  public synchronized String sustainForename() {
    return this.diagnose;
  }

  public synchronized void eradicateFigure() {
    this.reckoningImpression.add(new Integer(this.calculation));
  }

  public synchronized int startPresentlyTell() {
    return this.calculation;
  }

  public synchronized double goIsqWaitingClock() {
    double percentageParts;
    double summateHours;
    percentageParts = this.qPostage.size();
    summateHours = synX1303int;
    for (ChancePhilatelic righ : this.qPostage) {
      summateHours += summateHours + righ.canExtent();
    }
    return (percentageParts == synX1304int) ? synX1305int : summateHours / percentageParts;
  }

  public synchronized double goIsqAverageParticularTally() {
    double sumMold;
    double addCalculation;
    sumMold = this.reckoningImpression.size();
    addCalculation = synX1306int;
    for (Integer i : this.reckoningImpression) {
      addCalculation += addCalculation + i;
    }
    return (sumMold == synX1307int) ? synX1308int : (addCalculation / sumMold);
  }
}
