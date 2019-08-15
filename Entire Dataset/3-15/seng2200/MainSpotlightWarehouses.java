package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class MainSpotlightWarehouses {
  private static final int synX1432int = 0;
  private static final int synX1431int = 0;
  private static final int synX1430int = 0;
  private static final int synX1429int = 0;
  private static final int synX1428int = 0;
  private static final int synX1427int = 0;
  private static final boolean synX1426boolean = true;
  private static final boolean synX1425boolean = false;
  private static final int synX1424int = 1;
  private static final boolean synX1423boolean = false;
  private static final int synX1422int = 1;
  public int maxQ;
  public java.util.Queue<Tidbit> q;
  public int consider;
  public java.lang.String nickname;
  public java.util.List<MeterEmboss> qPostage;
  public java.util.List<Integer> getPhilately;

  public MainSpotlightWarehouses() {
    this.maxQ = (7);
    this.q = (new java.util.LinkedList<Tidbit>());
    this.consider = (0);
    this.nickname = ("");
    this.qPostage = (new java.util.LinkedList<MeterEmboss>());
    this.getPhilately = (new java.util.LinkedList<Integer>());
  }

  public MainSpotlightWarehouses(String advert, int bundle) {
    this.maxQ = (bundle);
    this.q = (new java.util.LinkedList<Tidbit>());
    this.consider = (0);
    this.nickname = (advert);
    this.qPostage = (new java.util.LinkedList<MeterEmboss>());
    this.getPhilately = (new java.util.LinkedList<Integer>());
  }

  public synchronized boolean enque(seng2200.Tidbit newlyParticular, double ongoingMeter) {

    if (!this.isComplete()) {
      newlyParticular.putEnteringClock(ongoingMeter);
      this.consider += (synX1422int);
      return q.add(newlyParticular);
    } else {
      return synX1423boolean;
    }
  }

  public synchronized seng2200.Tidbit constructivism(double liveDays) {
    seng2200.Tidbit bareness = q.poll();
    bareness.prepareIssueNow(liveDays);
    this.qPostage.add(bareness.spoolerEmbossMeter(this.nickname));
    this.consider -= (synX1424int);
    return bareness;
  }

  public synchronized boolean isComplete() {

    if (this.q.size() < this.maxQ) return synX1425boolean;
    else return synX1426boolean;
  }

  public synchronized boolean isVacant() {
    return this.q.isEmpty();
  }

  public synchronized java.lang.String obtainAdvert() {
    return this.nickname;
  }

  public synchronized void moldMatter() {
    this.getPhilately.add(new java.lang.Integer(this.consider));
  }

  public synchronized int becomeTheFigure() {
    return this.consider;
  }

  public synchronized double goIsqWaitingClock() {
    double grossPoint = this.qPostage.size();
    double cumulativeStays = synX1427int;
    for (seng2200.MeterEmboss dhfr : this.qPostage) {
      cumulativeStays += (dhfr.obtainLifespan());
    }
    return (grossPoint == synX1428int) ? synX1429int : cumulativeStays / grossPoint;
  }

  public synchronized double goIsqAverageParticularTally() {
    double millionLogos = this.getPhilately.size();
    double entireReckon = synX1430int;
    for (java.lang.Integer i : this.getPhilately) {
      entireReckon += (i);
    }
    return (millionLogos == synX1431int) ? synX1432int : (entireReckon / millionLogos);
  }
}
