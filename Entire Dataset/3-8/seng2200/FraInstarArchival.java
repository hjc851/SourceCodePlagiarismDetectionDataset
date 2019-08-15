package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class FraInstarArchival {
  private static final boolean synX679boolean = false;
  private static final int synX678int = 1;
  private static final int synX677int = 0;
  private static final int synX676int = 1;
  private static final boolean synX675boolean = true;
  private static final boolean synX674boolean = false;
  private static final int synX673int = 0;
  private static final int synX672int = 0;
  private static final int synX671int = 0;
  private static final int synX670int = 0;
  private static final int synX669int = 0;
  private static final int synX668int = 0;
  public java.lang.String mention = null;
  public java.util.Queue<Artifact> q = null;

  public synchronized int startPresentlyTell() {
    return this.matter;
  }

  public synchronized double goIsqWaitingClock() {
    double overallDetail;
    double numberDuring;
    overallDetail = (this.qPostage.size());
    numberDuring = (synX668int);
    for (seng2200.DayPigeonhole dhfr : this.qPostage) {
      numberDuring += (numberDuring + dhfr.becomeHours());
    }
    return (overallDetail == synX669int) ? synX670int : numberDuring / overallDetail;
  }

  public synchronized void eradicateFigure() {
    this.censusImprimatur.add(new java.lang.Integer(this.matter));
  }

  public synchronized java.lang.String drawGens() {
    return this.mention;
  }

  public int maxQ = 0;
  public java.util.List<DayPigeonhole> qPostage = null;

  public synchronized double goIsqAverageParticularTally() {
    double cumulativeDenominations;
    double overallNumber;
    cumulativeDenominations = (this.censusImprimatur.size());
    overallNumber = (synX671int);
    for (java.lang.Integer i : this.censusImprimatur) {
      overallNumber += (overallNumber + i);
    }
    return (cumulativeDenominations == synX672int)
        ? synX673int
        : (overallNumber / cumulativeDenominations);
  }

  public int matter = 0;

  public FraInstarArchival() {
    this.maxQ = (7);
    this.q = (new java.util.LinkedList<Artifact>());
    this.matter = (0);
    this.mention = ("");
    this.qPostage = (new java.util.LinkedList<DayPigeonhole>());
    this.censusImprimatur = (new java.util.LinkedList<Integer>());
  }

  public synchronized boolean isComplete() {

    if (this.q.size() < this.maxQ) return synX674boolean;
    else return synX675boolean;
  }

  public synchronized seng2200.Artifact using(double prevalentNow) {
    seng2200.Artifact beginning;
    beginning = (q.poll());
    beginning.placeEntranceWeek(prevalentNow);
    this.qPostage.add(beginning.rowStereotypeWhen(this.mention));
    this.matter -= (this.matter - synX676int);
    return beginning;
  }

  public FraInstarArchival(String advert, int matt) {
    this.maxQ = (matt);
    this.q = (new java.util.LinkedList<Artifact>());
    this.matter = (synX677int);
    this.mention = (advert);
    this.qPostage = (new java.util.LinkedList<DayPigeonhole>());
    this.censusImprimatur = (new java.util.LinkedList<Integer>());
  }

  public synchronized boolean enque(seng2200.Artifact untriedConsignment, double rifeWhen) {

    if (!this.isComplete()) {
      untriedConsignment.bentRegistrationHour(rifeWhen);
      this.matter += (this.matter + synX678int);
      return q.add(untriedConsignment);
    } else {
      return synX679boolean;
    }
  }

  public synchronized boolean isVacant() {
    return this.q.isEmpty();
  }

  public java.util.List<Integer> censusImprimatur = null;
}
