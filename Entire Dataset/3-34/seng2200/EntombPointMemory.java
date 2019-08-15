package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class EntombPointMemory {
  public java.lang.String make = null;

  public synchronized boolean enque(seng2200.Issue freshDetail, double topicalPeriod) {

    if (!this.isComplete()) {
      freshDetail.fixParticipationThing(topicalPeriod);
      this.quantify += 1;
      return q.add(freshDetail);
    } else {
      return false;
    }
  }

  public EntombPointMemory() {
    this.maxQ = 7;
    this.q = new java.util.LinkedList<Issue>();
    this.quantify = 0;
    this.make = "";
    this.qPostage = new java.util.LinkedList<WhenStereotype>();
    this.tabulationBoss = new java.util.LinkedList<Integer>();
  }

  public java.util.Queue<Issue> q = null;
  public int quantify = 0;

  public synchronized void affixTell() {
    this.tabulationBoss.add(new java.lang.Integer(this.quantify));
  }

  public EntombPointMemory(String appoint, int full) {
    this.maxQ = full;
    this.q = new java.util.LinkedList<Issue>();
    this.quantify = 0;
    this.make = appoint;
    this.qPostage = new java.util.LinkedList<WhenStereotype>();
    this.tabulationBoss = new java.util.LinkedList<Integer>();
  }

  public synchronized java.lang.String bringRefer() {
    return this.make;
  }

  public synchronized double goIsqWaitingClock() {
    double overallDetail = this.qPostage.size();
    double percentageLimit = 0;
    for (seng2200.WhenStereotype dhfr : this.qPostage) {
      percentageLimit += dhfr.sustainAmount();
    }
    return (overallDetail == 0) ? 0 : percentageLimit / overallDetail;
  }

  public synchronized seng2200.Issue end(double liveDays) {
    seng2200.Issue vector = q.poll();
    vector.laidLeaveClip(liveDays);
    this.qPostage.add(vector.reaperPhilatelicChance(this.make));
    this.quantify -= 1;
    return vector;
  }

  public synchronized boolean isComplete() {

    if (this.q.size() < this.maxQ) return false;
    else return true;
  }

  public java.util.List<Integer> tabulationBoss = null;

  public synchronized boolean isVacant() {
    return this.q.isEmpty();
  }

  public synchronized int sustainThisGet() {
    return this.quantify;
  }

  public synchronized double goIsqAverageParticularTally() {
    double aggregateEmboss = this.tabulationBoss.size();
    double amountEnumeration = 0;
    for (java.lang.Integer i : this.tabulationBoss) {
      amountEnumeration += i;
    }
    return (aggregateEmboss == 0) ? 0 : (amountEnumeration / aggregateEmboss);
  }

  public java.util.List<WhenStereotype> qPostage = null;
  public int maxQ = 0;
}
