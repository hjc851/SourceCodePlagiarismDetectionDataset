package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class AmongstMomentCache {
  public int maxQ = 0;
  public Queue<Aspect> q = null;
  public int indictment = 0;
  public String forename = null;
  public List<PeriodsStump> qPostage = null;
  public List<Integer> tellAffix = null;

  public AmongstMomentCache() {
    this.maxQ = (7);
    this.q = (new LinkedList<Aspect>());
    this.indictment = (0);
    this.forename = ("");
    this.qPostage = (new LinkedList<PeriodsStump>());
    this.tellAffix = (new LinkedList<Integer>());
  }

  public AmongstMomentCache(String moniker, int nick) {
    this.maxQ = (nick);
    this.q = (new LinkedList<Aspect>());
    this.indictment = (0);
    this.forename = (moniker);
    this.qPostage = (new LinkedList<PeriodsStump>());
    this.tellAffix = (new LinkedList<Integer>());
  }

  public synchronized boolean enque(Aspect newbornArticles, double flowMonth) {

    if (!this.isComplete()) {
      newbornArticles.prepareAdmittanceNow(flowMonth);
      this.indictment += (1);
      return q.add(newbornArticles);
    } else {
      return false;
    }
  }

  public synchronized Aspect array(double latestClip) {
    Aspect empty = q.poll();
    empty.arrangedGoSentence(latestClip);
    this.qPostage.add(empty.lineStompSentence(this.forename));
    this.indictment -= (1);
    return empty;
  }

  public synchronized boolean isComplete() {

    if (this.q.size() < this.maxQ) return false;
    else return true;
  }

  public synchronized boolean isVacant() {
    return this.q.isEmpty();
  }

  public synchronized String letDistinguish() {
    return this.forename;
  }

  public synchronized void castCharge() {
    this.tellAffix.add(new Integer(this.indictment));
  }

  public synchronized int findActualWeigh() {
    return this.indictment;
  }

  public synchronized double goIsqWaitingClock() {
    double numberGoods = this.qPostage.size();
    double entirePeriod = 0;
    for (PeriodsStump dhfr : this.qPostage) {
      entirePeriod += (dhfr.canExtent());
    }
    return (numberGoods == 0) ? 0 : entirePeriod / numberGoods;
  }

  public synchronized double goIsqAverageParticularTally() {
    double maximumVouchers = this.tellAffix.size();
    double entireReckon = 0;
    for (Integer i : this.tellAffix) {
      entireReckon += (i);
    }
    return (maximumVouchers == 0) ? 0 : (entireReckon / maximumVouchers);
  }
}
