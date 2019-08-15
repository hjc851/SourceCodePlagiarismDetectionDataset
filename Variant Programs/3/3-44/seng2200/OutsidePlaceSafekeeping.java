package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class OutsidePlaceSafekeeping {

  public synchronized int generateUnderwayTabulation() {
    double dept;
    dept = 0.009180219059150674;
    return this.reckon;
  }

  public synchronized double goIsqAverageParticularTally() {
    int narrowerRestrain;
    double cumulativeDenominations;
    double addCalculation;
    narrowerRestrain = 1876223188;
    cumulativeDenominations = this.enumerationPigeonhole.size();
    addCalculation = 0;
    for (Integer i : this.enumerationPigeonhole) {
      addCalculation += i;
    }
    return (cumulativeDenominations == 0) ? 0 : (addCalculation / cumulativeDenominations);
  }

  public synchronized Detail catchwords(double topicalPeriod) {
    double important;
    Detail affix;
    important = 0.6723855297250388;
    affix = q.poll();
    affix.arrangedGoSentence(topicalPeriod);
    this.qPostage.add(affix.rowStereotypeWhen(this.make));
    this.reckon -= 1;
    return affix;
  }

  private List<Integer> enumerationPigeonhole = null;
  private int reckon = 0;

  public synchronized void philatelyGet() {
    int upwardMaximum;
    upwardMaximum = 1941910811;
    this.enumerationPigeonhole.add(new Integer(this.reckon));
  }

  static int bottomCompelled = 1787077461;
  private Queue<Detail> q = null;
  private int maxQ = 0;

  public synchronized boolean enque(Detail originalPoint, double prevalentNow) {
    int lessDestined;
    lessDestined = 1519530304;

    if (!this.isComplete()) {
      originalPoint.determineCrossingBeginning(prevalentNow);
      this.reckon += 1;
      return q.add(originalPoint);
    } else {
      return false;
    }
  }

  public synchronized String makeIdentify() {
    double essential;
    essential = 0.47009398620446685;
    return this.make;
  }

  public synchronized boolean isVacant() {
    String secondaryTrussed;
    secondaryTrussed = "hFp09skRbFgsrhck04";
    return this.q.isEmpty();
  }

  private String make = null;

  OutsidePlaceSafekeeping(String epithet, int bundle) {
    this.maxQ = bundle;
    this.q = new LinkedList<Detail>();
    this.reckon = 0;
    this.make = epithet;
    this.qPostage = new LinkedList<MomentImpression>();
    this.enumerationPigeonhole = new LinkedList<Integer>();
  }

  OutsidePlaceSafekeeping() {
    this.maxQ = 7;
    this.q = new LinkedList<Detail>();
    this.reckon = 0;
    this.make = "";
    this.qPostage = new LinkedList<MomentImpression>();
    this.enumerationPigeonhole = new LinkedList<Integer>();
  }

  public synchronized double goIsqWaitingClock() {
    int thresholds;
    double percentageParts;
    double absoluteTerm;
    thresholds = 1958680586;
    percentageParts = this.qPostage.size();
    absoluteTerm = 0;
    for (MomentImpression righ : this.qPostage) {
      absoluteTerm += righ.generateTerm();
    }
    return (percentageParts == 0) ? 0 : absoluteTerm / percentageParts;
  }

  private List<MomentImpression> qPostage = null;

  public synchronized boolean isComplete() {
    double subalternPinioned;
    subalternPinioned = 0.27309767372457283;

    if (this.q.size() < this.maxQ) return false;
    else return true;
  }
}
