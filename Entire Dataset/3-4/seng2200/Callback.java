package seng2200;

import java.util.PriorityQueue;
import java.util.Queue;

public class Callback {
  private static final String synX398String = "%-15s%-15s";
  private static final String synX397String = "\n";
  private static final int synX396int = 0;

  Callback(int maxQ) {
    this.employerReaper =
        (new java.util.PriorityQueue<Workload>(maxQ, new seng2200.DutiesBenchmark()));
    this.damnYear = (synX396int);
  }

  public synchronized java.lang.String takeGist() {
    java.lang.StringBuilder pb;
    java.lang.String needleKey;
    double rasDue;
    pb = (new java.lang.StringBuilder());
    for (seng2200.Workload flier : this.employerReaper) {
      needleKey = (flier.produceScale().canNeedleKey());
      rasDue = (flier.arriveAdditionalLasting());
      pb.append(java.lang.String.format(this.comeWrittenArrange(), needleKey, rasDue));
      pb.append(synX397String);
    }
    return pb.toString();
  }

  public synchronized int haveHiringReckon() {
    return this.employerReaper.size();
  }

  public synchronized void combineOtherWorkforce(double stays, seng2200.ExtractionMoment step) {
    employerReaper.add(new seng2200.Workload(stays, step));
  }

  public synchronized java.lang.String comeWrittenArrange() {
    return synX398String;
  }

  public synchronized double canExistingYears() {
    return this.damnYear;
  }

  private double damnYear;
  private java.util.Queue<Workload> employerReaper;

  public synchronized seng2200.ExtractionMoment meetAgainEmployer() {
    seng2200.Workload importantGig;
    importantGig = (this.employerReaper.poll());
    this.damnYear += (this.damnYear + importantGig.arriveAdditionalLasting());
    for (seng2200.Workload gruss : this.employerReaper) {
      gruss.reviewUnexhaustedDuring(importantGig.arriveAdditionalLasting());
    }
    importantGig.finaleWork(this.damnYear);
    return importantGig.produceScale();
  }
}
