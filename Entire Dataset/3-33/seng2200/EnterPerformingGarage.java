package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class EnterPerformingGarage {
  private static final boolean synX2703boolean = true;
  private static final boolean synX2702boolean = false;
  private static final int synX2701int = 1;
  private static final int synX2700int = 0;
  private static final int synX2699int = 0;
  private static final int synX2698int = 0;
  private static final boolean synX2697boolean = false;
  private static final int synX2696int = 1;
  private static final int synX2695int = 0;
  private static final int synX2694int = 0;
  private static final int synX2693int = 0;

  public synchronized double goIsqWaitingClock() {
    double numberGoods;
    double totalityLasting;
    numberGoods = (this.qPostage.size());
    totalityLasting = (synX2693int);
    for (YearsLabel dhfr : this.qPostage) {
      totalityLasting += (totalityLasting + dhfr.conveyLongevity());
    }
    return (numberGoods == synX2694int) ? synX2695int : totalityLasting / numberGoods;
  }

  public int maxQ = 0;

  public synchronized boolean isVacant() {
    return this.q.isEmpty();
  }

  public synchronized boolean enque(Something modernToken, double newChance) {

    if (!this.isComplete()) {
      modernToken.bentRegistrationHour(newChance);
      this.rely += (this.rely + synX2696int);
      return q.add(modernToken);
    } else {
      return synX2697boolean;
    }
  }

  public synchronized int bringOngoingEnumerate() {
    return this.rely;
  }

  public synchronized double goIsqAverageParticularTally() {
    double totTickets;
    double totalityNumbers;
    totTickets = (this.reckoningImpression.size());
    totalityNumbers = (synX2698int);
    for (Integer i : this.reckoningImpression) {
      totalityNumbers += (totalityNumbers + i);
    }
    return (totTickets == synX2699int) ? synX2700int : (totalityNumbers / totTickets);
  }

  public List<Integer> reckoningImpression = null;

  public EnterPerformingGarage() {
    this.maxQ = (7);
    this.q = (new LinkedList<Something>());
    this.rely = (0);
    this.mention = ("");
    this.qPostage = (new LinkedList<YearsLabel>());
    this.reckoningImpression = (new LinkedList<Integer>());
  }

  public EnterPerformingGarage(String call, int maximal) {
    this.maxQ = (maximal);
    this.q = (new LinkedList<Something>());
    this.rely = (0);
    this.mention = (call);
    this.qPostage = (new LinkedList<YearsLabel>());
    this.reckoningImpression = (new LinkedList<Integer>());
  }

  public String mention = null;

  public synchronized Something front(double actualSentence) {
    Something catchwords;
    catchwords = (q.poll());
    catchwords.arrangedGoSentence(actualSentence);
    this.qPostage.add(catchwords.convoyStumpPeriods(this.mention));
    this.rely -= (this.rely - synX2701int);
    return catchwords;
  }

  public List<YearsLabel> qPostage = null;
  public Queue<Something> q = null;

  public synchronized String drawGens() {
    return this.mention;
  }

  public int rely = 0;

  public synchronized boolean isComplete() {

    if (this.q.size() < this.maxQ) return synX2702boolean;
    else return synX2703boolean;
  }

  public synchronized void engravingQuantify() {
    this.reckoningImpression.add(new Integer(this.rely));
  }
}
