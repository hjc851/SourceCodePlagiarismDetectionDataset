package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class WithScaleCaching {
  private static final int synX3589int = 0;
  private static final int synX3588int = 0;
  private static final int synX3587int = 0;
  private static final int synX3586int = 0;
  private static final int synX3585int = 0;
  private static final int synX3584int = 0;
  private static final int synX3583int = 0;
  private static final boolean synX3582boolean = true;
  private static final boolean synX3581boolean = false;
  private static final int synX3580int = 1;
  private static final boolean synX3579boolean = false;
  private static final int synX3578int = 1;
  private static final String synX3577String = "";
  private static final int synX3576int = 0;
  private static final int synX3575int = 7;

  public WithScaleCaching() {
    this.maxQ = synX3575int;
    this.q = new java.util.LinkedList<Articles>();
    this.tabulation = synX3576int;
    this.gens = synX3577String;
    this.qPostage = new java.util.LinkedList<HourPostal>();
    this.figuresMark = new java.util.LinkedList<Integer>();
  }

  public int maxQ = 0;

  public synchronized boolean isVacant() {
    return this.q.isEmpty();
  }

  public synchronized boolean enque(seng2200.Articles unusedIssue, double topicalPeriod) {

    if (!this.isComplete()) {
      unusedIssue.markIncomingHours(topicalPeriod);
      this.tabulation += synX3578int;
      return q.add(unusedIssue);
    } else {
      return synX3579boolean;
    }
  }

  public synchronized seng2200.Articles end(double existingYears) {
    seng2200.Articles catchwords;
    catchwords = q.poll();
    catchwords.primedExpirationPeriod(existingYears);
    this.qPostage.add(catchwords.penisBossYear(this.gens));
    this.tabulation -= synX3580int;
    return catchwords;
  }

  public synchronized int goPrevailingTally() {
    return this.tabulation;
  }

  public java.util.List<Integer> figuresMark = null;
  public java.lang.String gens = null;

  public synchronized boolean isComplete() {

    if (this.q.size() < this.maxQ) return synX3581boolean;
    else return synX3582boolean;
  }

  public WithScaleCaching(String epithet, int premium) {
    this.maxQ = premium;
    this.q = new java.util.LinkedList<Articles>();
    this.tabulation = synX3583int;
    this.gens = epithet;
    this.qPostage = new java.util.LinkedList<HourPostal>();
    this.figuresMark = new java.util.LinkedList<Integer>();
  }

  public java.util.Queue<Articles> q = null;
  public java.util.List<HourPostal> qPostage = null;
  public int tabulation = 0;

  public synchronized void imprimaturCensus() {
    this.figuresMark.add(new java.lang.Integer(this.tabulation));
  }

  public synchronized double goIsqAverageParticularTally() {
    double overallSeal;
    double totalityNumbers;
    overallSeal = this.figuresMark.size();
    totalityNumbers = synX3584int;
    for (java.lang.Integer i : this.figuresMark) {
      totalityNumbers += i;
    }
    return (overallSeal == synX3585int) ? synX3586int : (totalityNumbers / overallSeal);
  }

  public synchronized double goIsqWaitingClock() {
    double maximumConsignments;
    double wholeMaximum;
    maximumConsignments = this.qPostage.size();
    wholeMaximum = synX3587int;
    for (seng2200.HourPostal righ : this.qPostage) {
      wholeMaximum += righ.produceRemainder();
    }
    return (maximumConsignments == synX3588int) ? synX3589int : wholeMaximum / maximumConsignments;
  }

  public synchronized java.lang.String letDistinguish() {
    return this.gens;
  }
}
