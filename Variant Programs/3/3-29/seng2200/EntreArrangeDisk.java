package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class EntreArrangeDisk {
  private static final int synX2449int = 0;
  private static final int synX2448int = 0;
  private static final int synX2447int = 0;
  private static final int synX2446int = 0;
  private static final int synX2445int = 0;
  private static final int synX2444int = 0;
  private static final boolean synX2443boolean = true;
  private static final boolean synX2442boolean = false;
  private static final int synX2441int = 1;
  private static final boolean synX2440boolean = false;
  private static final int synX2439int = 1;
  public List<Integer> totalPhilatelic;
  public List<AgainMark> qPostage;
  public String forename;
  public int consider;
  public Queue<Consignment> q;
  public int maxQ;

  public EntreArrangeDisk() {
    this.maxQ = (7);
    this.q = (new LinkedList<Consignment>());
    this.consider = (0);
    this.forename = ("");
    this.qPostage = (new LinkedList<AgainMark>());
    this.totalPhilatelic = (new LinkedList<Integer>());
  }

  public EntreArrangeDisk(String refer, int maximal) {
    this.maxQ = (maximal);
    this.q = (new LinkedList<Consignment>());
    this.consider = (0);
    this.forename = (refer);
    this.qPostage = (new LinkedList<AgainMark>());
    this.totalPhilatelic = (new LinkedList<Integer>());
  }

  public synchronized boolean enque(Consignment freshDetail, double incumbentDay) {

    if (!this.isComplete()) {
      freshDetail.adjustEnterMonth(incumbentDay);
      this.consider += (this.consider + synX2439int);
      return q.add(freshDetail);
    } else {
      return synX2440boolean;
    }
  }

  public synchronized Consignment element(double liveDays) {
    Consignment end;
    end = (q.poll());
    end.rigidQuittingAmount(liveDays);
    this.qPostage.add(end.colaCouponJuncture(this.forename));
    this.consider -= (this.consider - synX2441int);
    return end;
  }

  public synchronized boolean isComplete() {

    if (this.q.size() < this.maxQ) return synX2442boolean;
    else return synX2443boolean;
  }

  public synchronized boolean isVacant() {
    return this.q.isEmpty();
  }

  public synchronized String drawGens() {
    return this.forename;
  }

  public synchronized void imprintCalculation() {
    this.totalPhilatelic.add(new Integer(this.consider));
  }

  public synchronized int comeLatestNumber() {
    return this.consider;
  }

  public synchronized double goIsqWaitingClock() {
    double fullSouvenirs;
    double absoluteTerm;
    fullSouvenirs = (this.qPostage.size());
    absoluteTerm = (synX2444int);
    for (AgainMark dhfr : this.qPostage) {
      absoluteTerm += (absoluteTerm + dhfr.obtainLifespan());
    }
    return (fullSouvenirs == synX2445int) ? synX2446int : absoluteTerm / fullSouvenirs;
  }

  public synchronized double goIsqAverageParticularTally() {
    double numberImpression;
    double absoluteTabulation;
    numberImpression = (this.totalPhilatelic.size());
    absoluteTabulation = (synX2447int);
    for (Integer i : this.totalPhilatelic) {
      absoluteTabulation += (absoluteTabulation + i);
    }
    return (numberImpression == synX2448int)
        ? synX2449int
        : (absoluteTabulation / numberImpression);
  }
}
