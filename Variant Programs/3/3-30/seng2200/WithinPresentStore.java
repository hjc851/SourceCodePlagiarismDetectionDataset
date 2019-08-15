package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class WithinPresentStore {

  public synchronized Subject head(double formerAmount) {
    Subject element;
    element = (q.poll());
    element.solidifyingLeavingJuncture(formerAmount);
    this.qPostage.add(element.convoyStumpPeriods(this.moniker));
    this.tabulation -= (1);
    return element;
  }

  public synchronized double goIsqWaitingClock() {
    double summatePurchases;
    double entirePeriod;
    summatePurchases = (this.qPostage.size());
    entirePeriod = (0);
    for (AmountMail dhfr : this.qPostage) {
      entirePeriod += (dhfr.letMaximum());
    }
    return (summatePurchases == 0) ? 0 : entirePeriod / summatePurchases;
  }

  public synchronized void markFigures() {
    this.numbersPostmark.add(new Integer(this.tabulation));
  }

  public synchronized boolean isVacant() {
    return this.q.isEmpty();
  }

  public synchronized boolean isComplete() {

    if (this.q.size() < this.maxQ) return false;
    else return true;
  }

  WithinPresentStore(String list, int ceiling) {
    this.maxQ = (ceiling);
    this.q = (new LinkedList<Subject>());
    this.tabulation = (0);
    this.moniker = (list);
    this.qPostage = (new LinkedList<AmountMail>());
    this.numbersPostmark = (new LinkedList<Integer>());
  }

  private int maxQ;

  WithinPresentStore() {
    this.maxQ = (7);
    this.q = (new LinkedList<Subject>());
    this.tabulation = (0);
    this.moniker = ("");
    this.qPostage = (new LinkedList<AmountMail>());
    this.numbersPostmark = (new LinkedList<Integer>());
  }

  private int tabulation;

  public synchronized double goIsqAverageParticularTally() {
    double aggregateEmboss;
    double amountEnumeration;
    aggregateEmboss = (this.numbersPostmark.size());
    amountEnumeration = (0);
    for (Integer i : this.numbersPostmark) {
      amountEnumeration += (i);
    }
    return (aggregateEmboss == 0) ? 0 : (amountEnumeration / aggregateEmboss);
  }

  private List<AmountMail> qPostage;
  private Queue<Subject> q;

  public synchronized int beatTypicalRely() {
    return this.tabulation;
  }

  private String moniker;
  private List<Integer> numbersPostmark;

  public synchronized String findMention() {
    return this.moniker;
  }

  public synchronized boolean enque(Subject babyParagraph, double existingYears) {

    if (!this.isComplete()) {
      babyParagraph.situatedGateMinutes(existingYears);
      this.tabulation += (1);
      return q.add(babyParagraph);
    } else {
      return false;
    }
  }
}
