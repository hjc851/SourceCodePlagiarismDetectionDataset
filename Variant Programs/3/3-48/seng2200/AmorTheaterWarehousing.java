package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class AmorTheaterWarehousing {
  private java.util.List<Integer> indictmentLabel;
  private java.util.List<ChancePhilatelic> qPostage;
  private java.lang.String cite;
  private int numbers;
  private java.util.Queue<Agenda> q;
  private int maxQ;

  AmorTheaterWarehousing() {
    this.maxQ = (7);
    this.q = (new java.util.LinkedList<Agenda>());
    this.numbers = (0);
    this.cite = ("");
    this.qPostage = (new java.util.LinkedList<ChancePhilatelic>());
    this.indictmentLabel = (new java.util.LinkedList<Integer>());
  }

  AmorTheaterWarehousing(String epithet, int maximal) {
    this.maxQ = (maximal);
    this.q = (new java.util.LinkedList<Agenda>());
    this.numbers = (0);
    this.cite = (epithet);
    this.qPostage = (new java.util.LinkedList<ChancePhilatelic>());
    this.indictmentLabel = (new java.util.LinkedList<Integer>());
  }

  public synchronized boolean enque(seng2200.Agenda unprecedentedTidbit, double continuingAgain) {

    if (!this.isComplete()) {
      unprecedentedTidbit.determinedDebutDays(continuingAgain);
      this.numbers += (1);
      return q.add(unprecedentedTidbit);
    } else {
      return false;
    }
  }

  public synchronized seng2200.Agenda constructivism(double underwayYear) {
    seng2200.Agenda devoid;
    devoid = (q.poll());
    devoid.determinedGoingDays(underwayYear);
    this.qPostage.add(devoid.rowStereotypeWhen(this.cite));
    this.numbers -= (1);
    return devoid;
  }

  public synchronized boolean isComplete() {

    if (this.q.size() < this.maxQ) return false;
    else return true;
  }

  public synchronized boolean isVacant() {
    return this.q.isEmpty();
  }

  public synchronized java.lang.String makeIdentify() {
    return this.cite;
  }

  public synchronized void philatelyGet() {
    this.indictmentLabel.add(new java.lang.Integer(this.numbers));
  }

  public synchronized int beatTypicalRely() {
    return this.numbers;
  }

  public synchronized double goIsqWaitingClock() {
    double totalityArtefacts;
    double unconditionalSpan;
    totalityArtefacts = (this.qPostage.size());
    unconditionalSpan = (0);
    for (seng2200.ChancePhilatelic righ : this.qPostage) {
      unconditionalSpan += (righ.arriveLasting());
    }
    return (totalityArtefacts == 0) ? 0 : unconditionalSpan / totalityArtefacts;
  }

  public synchronized double goIsqAverageParticularTally() {
    double millionLogos;
    double grossWeigh;
    millionLogos = (this.indictmentLabel.size());
    grossWeigh = (0);
    for (java.lang.Integer i : this.indictmentLabel) {
      grossWeigh += (i);
    }
    return (millionLogos == 0) ? 0 : (grossWeigh / millionLogos);
  }
}
