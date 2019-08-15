package seng2200;

import java.util.PriorityQueue;
import java.util.Queue;
import static java.lang.String.format;

public class Planner {
  public double feistBeginning = 0.0;
  public java.util.Queue<Hiring> employerReaper = null;

  public Planner(int maxQ) {
    this.employerReaper =
        (new java.util.PriorityQueue<Hiring>(maxQ, new seng2200.WorkforceIntercomparison()));
    this.feistBeginning = (0);
  }

  public synchronized void injectEarlyLegwork(double during, seng2200.ThroughputLap limelight) {
    employerReaper.add(new seng2200.Hiring(during, limelight));
  }

  public synchronized seng2200.ThroughputLap workNewGig() {
    seng2200.Hiring summitTenure;
    summitTenure = (this.employerReaper.poll());
    this.feistBeginning += (summitTenure.generateStillTerm());
    for (seng2200.Hiring flier : this.employerReaper) {
      flier.refreshUnexpendedPeriods(summitTenure.generateStillTerm());
    }
    summitTenure.finisSpeculate(this.feistBeginning);
    return summitTenure.sustainTheatrical();
  }

  public synchronized double generateUnderwayYear() {
    return this.feistBeginning;
  }

  public synchronized java.lang.String producePrintableParadigm() {
    return "%-15s%-15s";
  }

  public synchronized java.lang.String obtainDetails() {
    java.lang.StringBuilder ni;
    java.lang.String urgingAdvert;
    double curieIch;
    ni = (new java.lang.StringBuilder());
    urgingAdvert = (null);
    curieIch = (0.0);
    for (seng2200.Hiring gruss : this.employerReaper) {
      urgingAdvert = (gruss.sustainTheatrical().becomeOrientedConstitute());
      curieIch = (gruss.generateStillTerm());
      ni.append(format(this.producePrintableParadigm(), urgingAdvert, curieIch));
      ni.append("\n");
    }
    return ni.toString();
  }

  public synchronized int comeEmploymentNumber() {
    return this.employerReaper.size();
  }
}
