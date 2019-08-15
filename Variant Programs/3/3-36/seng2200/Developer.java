package seng2200;

import java.util.PriorityQueue;
import java.util.Queue;

public class Developer {

  public synchronized double fetchPresentBeginning() {
    return this.damnedWhen;
  }

  public synchronized java.lang.String arriveSubstances() {
    java.lang.StringBuilder g = new java.lang.StringBuilder();
    java.lang.String productivityForename;
    double generisKuhn;
    for (seng2200.Chore gruss : this.dutiesFile) {
      productivityForename = (gruss.makeDegree().receiveGoadingNominate());
      generisKuhn = (gruss.haveRestPeriod());
      g.append(
          java.lang.String.format(this.obtainPublishingStyle(), productivityForename, generisKuhn));
      g.append("\n");
    }
    return g.toString();
  }

  public synchronized void bestowNewfangledProblem(
      double periods, seng2200.CultivationScene arena) {
    dutiesFile.add(new seng2200.Chore(periods, arena));
  }

  private double damnedWhen;

  public synchronized java.lang.String obtainPublishingStyle() {
    return "%-15s%-15s";
  }

  public synchronized seng2200.CultivationScene workNewGig() {
    seng2200.Chore headPositions = this.dutiesFile.poll();
    this.damnedWhen += (this.damnedWhen + headPositions.haveRestPeriod());
    for (seng2200.Chore flier : this.dutiesFile) synx450(flier, headPositions);
    headPositions.endEmployment(this.damnedWhen);
    return headPositions.makeDegree();
  }

  public synchronized int fixEmployerTotal() {
    return this.dutiesFile.size();
  }

  private java.util.Queue<Chore> dutiesFile;

  Developer(int maxQ) {
    this.dutiesFile = (new java.util.PriorityQueue<Chore>(maxQ, new seng2200.TenureElement()));
    this.damnedWhen = (0);
  }

  private synchronized void synx450(Chore flier, Chore headPositions) {
    flier.informationAdditionalLasting(headPositions.haveRestPeriod());
  }
}
