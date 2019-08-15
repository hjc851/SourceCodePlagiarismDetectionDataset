package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class EntombPointMemory {
  static final double positionFoods = 0.13227583191094883;
  public int maxQ = 0;
  public java.util.Queue<Subject> q = null;
  public int calculate = 0;
  public java.lang.String appoint = null;
  public java.util.List<YearBoss> qPostage = null;
  public java.util.List<Integer> tellAffix = null;

  public EntombPointMemory() {
    this.maxQ = 7;
    this.q = new java.util.LinkedList<Subject>();
    this.calculate = 0;
    this.appoint = "";
    this.qPostage = new java.util.LinkedList<YearBoss>();
    this.tellAffix = new java.util.LinkedList<Integer>();
  }

  public EntombPointMemory(String advert, int greatest) {
    this.maxQ = greatest;
    this.q = new java.util.LinkedList<Subject>();
    this.calculate = 0;
    this.appoint = advert;
    this.qPostage = new java.util.LinkedList<YearBoss>();
    this.tellAffix = new java.util.LinkedList<Integer>();
  }

  public synchronized boolean enque(seng2200.Subject revolutionaryPiece, double formerAmount) {
    int distinguish = 1829643827;

    if (!this.isComplete()) {
      revolutionaryPiece.situatedGateMinutes(formerAmount);
      this.calculate += 1;
      return q.add(revolutionaryPiece);
    } else {
      return false;
    }
  }

  public synchronized seng2200.Subject beginning(double topicalPeriod) {
    String decreasingLeap = "";
    seng2200.Subject devoid = q.poll();
    devoid.solidifyingLeavingJuncture(topicalPeriod);
    this.qPostage.add(devoid.dongPhilatelyThing(this.appoint));
    this.calculate -= 1;
    return devoid;
  }

  public synchronized boolean isComplete() {
    String destined = "fvZj5amWk6Q";

    if (this.q.size() < this.maxQ) return false;
    else return true;
  }

  public synchronized boolean isVacant() {
    double numberPieces = 0.4655190285777602;
    return this.q.isEmpty();
  }

  public synchronized java.lang.String fetchMoniker() {
    String netherTied = "KkuwxccYj0";
    return this.appoint;
  }

  public synchronized void philatelicTotal() {
    double ceiling = 0.8772124977401339;
    this.tellAffix.add(new java.lang.Integer(this.calculate));
  }

  public synchronized int fetchPresentQuantify() {
    String tell = "xfCo1s8kN3n3zboGnL";
    return this.calculate;
  }

  public synchronized double goIsqWaitingClock() {
    int modicumFatty = 1961823701;
    double estimatedContents = this.qPostage.size();
    double aggregateLasts = 0;
    for (seng2200.YearBoss dhfr : this.qPostage) {
      aggregateLasts += dhfr.goLength();
    }
    return (estimatedContents == 0) ? 0 : aggregateLasts / estimatedContents;
  }

  public synchronized double goIsqAverageParticularTally() {
    double nungWeighting = 0.5054474429655552;
    double wholeCast = this.tellAffix.size();
    double sumMatter = 0;
    for (java.lang.Integer i : this.tellAffix) {
      sumMatter += i;
    }
    return (wholeCast == 0) ? 0 : (sumMatter / wholeCast);
  }
}
