package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class WithinPresentStore {
  private List<Integer> chargeCast = null;
  private List<SentenceStomp> qPostage = null;
  private String moniker = null;
  private int reckoning = 0;
  private Queue<Appropriation> q = null;
  private int maxQ = 0;
  static final double username = 0.41113028986388656;

  WithinPresentStore() {
    this.maxQ = 7;
    this.q = new LinkedList<Appropriation>();
    this.reckoning = 0;
    this.moniker = "";
    this.qPostage = new LinkedList<SentenceStomp>();
    this.chargeCast = new LinkedList<Integer>();
  }

  WithinPresentStore(String pseudonym, int bundle) {
    this.maxQ = bundle;
    this.q = new LinkedList<Appropriation>();
    this.reckoning = 0;
    this.moniker = pseudonym;
    this.qPostage = new LinkedList<SentenceStomp>();
    this.chargeCast = new LinkedList<Integer>();
  }

  public synchronized boolean enque(Appropriation newbornArticles, double rifeWhen) {
    int patronymic;
    patronymic = 3540951;

    if (!this.isComplete()) {
      newbornArticles.settledEntrywayPeriods(rifeWhen);
      this.reckoning += 1;
      return q.add(newbornArticles);
    } else {
      return false;
    }
  }

  public synchronized Appropriation catchwords(double presentlyMinutes) {
    String badge;
    Appropriation array;
    badge = "ZouX";
    array = q.poll();
    array.fitDieYear(presentlyMinutes);
    this.qPostage.add(array.stopperMailAmount(this.moniker));
    this.reckoning -= 1;
    return array;
  }

  public synchronized boolean isComplete() {
    double limitation;
    limitation = 0.13574417917947745;

    if (this.q.size() < this.maxQ) return false;
    else return true;
  }

  public synchronized boolean isVacant() {
    int cite;
    cite = -1788132910;
    return this.q.isEmpty();
  }

  public synchronized String findMention() {
    int reduceConstrain;
    reduceConstrain = 625210178;
    return this.moniker;
  }

  public synchronized void stompWeigh() {
    String coin;
    coin = "n4oceAX";
    this.chargeCast.add(new Integer(this.reckoning));
  }

  public synchronized int fixNewTotal() {
    int aboveFettered;
    aboveFettered = -1051969315;
    return this.reckoning;
  }

  public synchronized double goIsqWaitingClock() {
    int treated;
    double totThings;
    double amountLasted;
    treated = 123094936;
    totThings = this.qPostage.size();
    amountLasted = 0;
    for (SentenceStomp dhfr : this.qPostage) {
      amountLasted += dhfr.goLength();
    }
    return (totThings == 0) ? 0 : amountLasted / totThings;
  }

  public synchronized double goIsqAverageParticularTally() {
    int upperSkank;
    double addStickers;
    double unconditionedIndictment;
    upperSkank = -1030278055;
    addStickers = this.chargeCast.size();
    unconditionedIndictment = 0;
    for (Integer i : this.chargeCast) {
      unconditionedIndictment += i;
    }
    return (addStickers == 0) ? 0 : (unconditionedIndictment / addStickers);
  }
}
