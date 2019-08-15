package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class OtherLimelightRepository {
  private static final int synX1800int = 0;
  private static final int synX1799int = 0;
  private static final int synX1798int = 0;
  private static final double synX1797double = 0.07534293320023677;
  private static final int synX1796int = 0;
  private static final int synX1795int = 0;
  private static final int synX1794int = 0;
  private static final double synX1793double = 0.16941072489526365;
  private static final double synX1792double = 0.93401704198651;
  private static final double synX1791double = 0.7408337241062019;
  private static final double synX1790double = 0.7047122994827469;
  private static final int synX1789int = 301118440;
  private static final boolean synX1788boolean = true;
  private static final boolean synX1787boolean = false;
  private static final String synX1786String = "G8J6CaSqgrcgSzW";
  private static final int synX1785int = 1;
  private static final String synX1784String = "";
  private static final boolean synX1783boolean = false;
  private static final int synX1782int = 1;
  private static final int synX1781int = -518821657;
  static final int peakSize = -436645126;
  public int maxQ;
  public java.util.Queue<Element> q;
  public int charge;
  public java.lang.String forename;
  public java.util.List<WeekImprimatur> qPostage;
  public java.util.List<Integer> reckoningImpression;

  public OtherLimelightRepository() {
    this.maxQ = (7);
    this.q = (new java.util.LinkedList<Element>());
    this.charge = (0);
    this.forename = ("");
    this.qPostage = (new java.util.LinkedList<WeekImprimatur>());
    this.reckoningImpression = (new java.util.LinkedList<Integer>());
  }

  public OtherLimelightRepository(String patronymic, int maximize) {
    this.maxQ = (maximize);
    this.q = (new java.util.LinkedList<Element>());
    this.charge = (0);
    this.forename = (patronymic);
    this.qPostage = (new java.util.LinkedList<WeekImprimatur>());
    this.reckoningImpression = (new java.util.LinkedList<Integer>());
  }

  public synchronized boolean enque(seng2200.Element unprecedentedTidbit, double prevalentNow) {
    int greaterConstrain = synX1781int;

    if (!this.isComplete()) {
      unprecedentedTidbit.doRegisterAgain(prevalentNow);
      this.charge += (synX1782int);
      return q.add(unprecedentedTidbit);
    } else {
      return synX1783boolean;
    }
  }

  public synchronized seng2200.Element element(double underwayYear) {
    String morinWeighting = synX1784String;
    seng2200.Element beginning = q.poll();
    beginning.arrangeEgressYears(underwayYear);
    this.qPostage.add(beginning.stopperMailAmount(this.forename));
    this.charge -= (synX1785int);
    return beginning;
  }

  public synchronized boolean isComplete() {
    String sec = synX1786String;

    if (this.q.size() < this.maxQ) return synX1787boolean;
    else return synX1788boolean;
  }

  public synchronized boolean isVacant() {
    int elevationDemarcation = synX1789int;
    return this.q.isEmpty();
  }

  public synchronized java.lang.String startSurname() {
    double lowlyEnchained = synX1790double;
    return this.forename;
  }

  public synchronized void mailRecount() {
    double load = synX1791double;
    this.reckoningImpression.add(new java.lang.Integer(this.charge));
  }

  public synchronized int developPreviousCalculate() {
    double reduceUnfree = synX1792double;
    return this.charge;
  }

  public synchronized double goIsqWaitingClock() {
    double limitation = synX1793double;
    double entireBelongings = this.qPostage.size();
    double unconditionedExtent = synX1794int;
    for (seng2200.WeekImprimatur righ : this.qPostage) {
      unconditionedExtent += (righ.obtainLifespan());
    }
    return (entireBelongings == synX1795int) ? synX1796int : unconditionedExtent / entireBelongings;
  }

  public synchronized double goIsqAverageParticularTally() {
    double boundary = synX1797double;
    double aggregateEmboss = this.reckoningImpression.size();
    double totCalculate = synX1798int;
    for (java.lang.Integer i : this.reckoningImpression) {
      totCalculate += (i);
    }
    return (aggregateEmboss == synX1799int) ? synX1800int : (totCalculate / aggregateEmboss);
  }
}
