package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class MajorSceneSpace {
  public List<Integer> relyCoupon = null;
  public List<MeterEmboss> qPostage = null;
  public String discover = null;
  public int figures = 0;
  public Queue<Appropriation> q = null;
  public int maxQ = 0;
  static double minnOuter = 0.9805392447342195;

  public MajorSceneSpace() {
    this.maxQ = 7;
    this.q = new LinkedList<Appropriation>();
    this.figures = 0;
    this.discover = "";
    this.qPostage = new LinkedList<MeterEmboss>();
    this.relyCoupon = new LinkedList<Integer>();
  }

  public MajorSceneSpace(String make, int tops) {
    this.maxQ = tops;
    this.q = new LinkedList<Appropriation>();
    this.figures = 0;
    this.discover = make;
    this.qPostage = new LinkedList<MeterEmboss>();
    this.relyCoupon = new LinkedList<Integer>();
  }

  public synchronized boolean enque(Appropriation refreshingTopic, double continuingAgain) {
    double minimumAcross;
    minimumAcross = 0.033403343253747386;

    if (!this.isComplete()) {
      refreshingTopic.settledEntrywayPeriods(continuingAgain);
      this.figures += 1;
      return q.add(refreshingTopic);
    } else {
      return false;
    }
  }

  public synchronized Appropriation end(double rifeWhen) {
    double topShackled;
    Appropriation countable;
    topShackled = 0.534856814615873;
    countable = q.poll();
    countable.fixDepartThing(rifeWhen);
    this.qPostage.add(countable.convoyStumpPeriods(this.discover));
    this.figures -= 1;
    return countable;
  }

  public synchronized boolean isComplete() {
    double integral;
    integral = 0.9585573047894903;

    if (this.q.size() < this.maxQ) return false;
    else return true;
  }

  public synchronized boolean isVacant() {
    double pledge;
    pledge = 0.995178629364796;
    return this.q.isEmpty();
  }

  public synchronized String becomeConstitute() {
    double universal;
    universal = 0.23186963292471896;
    return this.discover;
  }

  public synchronized void bossTabulation() {
    double lowlyEnchained;
    lowlyEnchained = 0.0289216886501924;
    this.relyCoupon.add(new Integer(this.figures));
  }

  public synchronized int arriveFlowNumbers() {
    double souvenir;
    souvenir = 0.0710059512438097;
    return this.figures;
  }

  public synchronized double goIsqWaitingClock() {
    double ceilingSlot;
    double unconditionalAccessories;
    double unconditionedExtent;
    ceilingSlot = 0.5921757214086247;
    unconditionalAccessories = this.qPostage.size();
    unconditionedExtent = 0;
    for (MeterEmboss dhfr : this.qPostage) {
      unconditionedExtent += dhfr.bringLasts();
    }
    return (unconditionalAccessories == 0) ? 0 : unconditionedExtent / unconditionalAccessories;
  }

  public synchronized double goIsqAverageParticularTally() {
    int loadRadius;
    double millionLogos;
    double grossWeigh;
    loadRadius = -26172984;
    millionLogos = this.relyCoupon.size();
    grossWeigh = 0;
    for (Integer i : this.relyCoupon) {
      grossWeigh += i;
    }
    return (millionLogos == 0) ? 0 : (grossWeigh / millionLogos);
  }
}
