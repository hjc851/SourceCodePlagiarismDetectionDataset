package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class BreakJunctureCloset {

  public synchronized int letAfootCharge() {
    double ceiling;
    ceiling = 0.5554095400712142;
    return this.reckon;
  }

  public synchronized boolean isVacant() {
    int hour;
    hour = 1270866954;
    return this.q.isEmpty();
  }

  public java.util.List<AgainMark> qPostage;
  public int maxQ;
  public java.util.List<Integer> tallyPostage;

  public synchronized boolean isComplete() {
    double matter;
    matter = 0.9686113661219631;

    if (this.q.size() < this.maxQ) return false;
    else return true;
  }

  public synchronized seng2200.Detail configured(double topicalPeriod) {
    String curb;
    seng2200.Detail element;
    curb = "qPvDz1qXjG0";
    element = q.poll();
    element.adjustPerishMonth(topicalPeriod);
    this.qPostage.add(element.listImpressionMoment(this.cite));
    this.reckon -= 1;
    return element;
  }

  public synchronized double goIsqAverageParticularTally() {
    String recount;
    double cumulativeDenominations;
    double unconditionalCensus;
    recount = "P4fgH0XD";
    cumulativeDenominations = this.tallyPostage.size();
    unconditionalCensus = 0;
    for (java.lang.Integer i : this.tallyPostage) {
      unconditionalCensus += i;
    }
    return (cumulativeDenominations == 0) ? 0 : (unconditionalCensus / cumulativeDenominations);
  }

  public java.lang.String cite;
  public java.util.Queue<Detail> q;

  public synchronized boolean enque(seng2200.Detail freshlyGoods, double incumbentDay) {
    double enchained;
    enchained = 0.9428280972886597;

    if (!this.isComplete()) {
      freshlyGoods.laidEntranceClip(incumbentDay);
      this.reckon += 1;
      return q.add(freshlyGoods);
    } else {
      return false;
    }
  }

  public synchronized java.lang.String takeCall() {
    double pledge;
    pledge = 0.5951766671476308;
    return this.cite;
  }

  static int amoy = 970346789;

  public synchronized double goIsqWaitingClock() {
    double depressShackled;
    double unconditionalAccessories;
    double percentageLimit;
    depressShackled = 0.6760124789570748;
    unconditionalAccessories = this.qPostage.size();
    percentageLimit = 0;
    for (seng2200.AgainMark righ : this.qPostage) {
      percentageLimit += righ.fetchExpiry();
    }
    return (unconditionalAccessories == 0) ? 0 : percentageLimit / unconditionalAccessories;
  }

  public BreakJunctureCloset() {
    this.maxQ = 7;
    this.q = new java.util.LinkedList<Detail>();
    this.reckon = 0;
    this.cite = "";
    this.qPostage = new java.util.LinkedList<AgainMark>();
    this.tallyPostage = new java.util.LinkedList<Integer>();
  }

  public BreakJunctureCloset(String moniker, int load) {
    this.maxQ = load;
    this.q = new java.util.LinkedList<Detail>();
    this.reckon = 0;
    this.cite = moniker;
    this.qPostage = new java.util.LinkedList<AgainMark>();
    this.tallyPostage = new java.util.LinkedList<Integer>();
  }

  public synchronized void moldMatter() {
    double tell;
    tell = 0.7641279616715672;
    this.tallyPostage.add(new java.lang.Integer(this.reckon));
  }

  public int reckon;
}
