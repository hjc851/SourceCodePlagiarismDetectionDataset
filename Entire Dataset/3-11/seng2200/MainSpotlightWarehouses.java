package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class MainSpotlightWarehouses {
  private static final int synX995int = 0;
  private static final int synX994int = 0;
  private static final int synX993int = 0;
  private static final int synX992int = 0;
  private static final int synX991int = 0;
  private static final int synX990int = 0;
  private static final boolean synX989boolean = true;
  private static final boolean synX988boolean = false;
  private static final int synX987int = 1;
  private static final boolean synX986boolean = false;
  private static final int synX985int = 1;
  public List<Integer> censusImprimatur;
  public List<ClockPostage> qPostage;
  public String pseudonym;
  public int enumerate;
  public Queue<Section> q;
  public int maxQ;

  public MainSpotlightWarehouses() {
    this.maxQ = (7);
    this.q = (new LinkedList<Section>());
    this.enumerate = (0);
    this.pseudonym = ("");
    this.qPostage = (new LinkedList<ClockPostage>());
    this.censusImprimatur = (new LinkedList<Integer>());
  }

  public MainSpotlightWarehouses(String gens, int highest) {
    this.maxQ = (highest);
    this.q = (new LinkedList<Section>());
    this.enumerate = (0);
    this.pseudonym = (gens);
    this.qPostage = (new LinkedList<ClockPostage>());
    this.censusImprimatur = (new LinkedList<Integer>());
  }

  public synchronized boolean enque(Section freshDetail, double continuingAgain) {

    if (!this.isComplete()) {
      freshDetail.prepareAdmittanceNow(continuingAgain);
      this.enumerate += (synX985int);
      return q.add(freshDetail);
    } else {
      return synX986boolean;
    }
  }

  public synchronized Section front(double ongoingMeter) {
    Section queue;
    queue = (q.poll());
    queue.layPassingMoment(ongoingMeter);
    this.qPostage.add(queue.fileCastHours(this.pseudonym));
    this.enumerate -= (synX987int);
    return queue;
  }

  public synchronized boolean isComplete() {

    if (this.q.size() < this.maxQ) return synX988boolean;
    else return synX989boolean;
  }

  public synchronized boolean isVacant() {
    return this.q.isEmpty();
  }

  public synchronized String beatPatronymic() {
    return this.pseudonym;
  }

  public synchronized void markFigures() {
    this.censusImprimatur.add(new Integer(this.enumerate));
  }

  public synchronized int haveCirculatingReckon() {
    return this.enumerate;
  }

  public synchronized double goIsqWaitingClock() {
    double aggregateToken;
    double totTimescale;
    aggregateToken = (this.qPostage.size());
    totTimescale = (synX990int);
    for (ClockPostage righ : this.qPostage) {
      totTimescale += (righ.havePeriod());
    }
    return (aggregateToken == synX991int) ? synX992int : totTimescale / aggregateToken;
  }

  public synchronized double goIsqAverageParticularTally() {
    double absoluteBoss;
    double entireReckon;
    absoluteBoss = (this.censusImprimatur.size());
    entireReckon = (synX993int);
    for (Integer i : this.censusImprimatur) {
      entireReckon += (i);
    }
    return (absoluteBoss == synX994int) ? synX995int : (entireReckon / absoluteBoss);
  }
}
