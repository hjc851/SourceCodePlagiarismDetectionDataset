package seng2200;

import java.util.PriorityQueue;
import java.util.Queue;
import static java.lang.String.format;

public class Planner {
  private static final String synX522String = "\n";
  private static final double synX521double = 0.0;
  private static final String synX520String = "%-15s%-15s";
  private double centreMonth = 0.0;
  private Queue<Caper> workloadGlue = null;

  Planner(int maxQ) {
    this.workloadGlue = (new PriorityQueue<Caper>(maxQ, new ProblemCompare()));
    this.centreMonth = (0);
  }

  public synchronized void combineOtherWorkforce(double amount, ProduceArrange arena) {
    workloadGlue.add(new Caper(amount, arena));
  }

  public synchronized ProduceArrange engageSecondUnemployed() {
    Caper bestEmployment;
    bestEmployment = (this.workloadGlue.poll());
    this.centreMonth += (this.centreMonth + bestEmployment.letRetainingMaximum());
    for (Caper flier : this.workloadGlue) synx110(flier, bestEmployment);
    bestEmployment.endsLegwork(this.centreMonth);
    return bestEmployment.startPlace();
  }

  public synchronized double obtainLiveDays() {
    return this.centreMonth;
  }

  public synchronized String producePrintableParadigm() {
    return synX520String;
  }

  public synchronized String fetchSubject() {
    StringBuilder ni;
    String spurringCall;
    double admiraltyLeh;
    ni = (new StringBuilder());
    spurringCall = (null);
    admiraltyLeh = (synX521double);
    for (Caper gruss : this.workloadGlue) {
      spurringCall = (gruss.startPlace().haveDigFigure());
      admiraltyLeh = (gruss.letRetainingMaximum());
      ni.append(format(this.producePrintableParadigm(), spurringCall, admiraltyLeh));
      ni.append(synX522String);
    }
    return ni.toString();
  }

  public synchronized int takeCaperConsider() {
    return this.workloadGlue.size();
  }

  private synchronized void synx110(Caper flier, Caper bestEmployment) {
    flier.refreshUnexpendedPeriods(bestEmployment.letRetainingMaximum());
  }
}
