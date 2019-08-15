package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class BuryPhaseStorehouse {
  public java.util.List<Integer> totalPhilatelic = null;
  public java.util.List<PeriodsStump> qPostage = null;
  public java.lang.String patronymic = null;
  public int enumerate = 0;
  public java.util.Queue<Piece> q = null;
  public int maxQ = 0;

  public BuryPhaseStorehouse() {
    this.maxQ = (7);
    this.q = (new java.util.LinkedList<Piece>());
    this.enumerate = (0);
    this.patronymic = ("");
    this.qPostage = (new java.util.LinkedList<PeriodsStump>());
    this.totalPhilatelic = (new java.util.LinkedList<Integer>());
  }

  public BuryPhaseStorehouse(String gens, int lot) {
    this.maxQ = (lot);
    this.q = (new java.util.LinkedList<Piece>());
    this.enumerate = (0);
    this.patronymic = (gens);
    this.qPostage = (new java.util.LinkedList<PeriodsStump>());
    this.totalPhilatelic = (new java.util.LinkedList<Integer>());
  }

  public synchronized boolean enque(seng2200.Piece modernToken, double ongoingMeter) {

    if (!this.isComplete()) {
      modernToken.rigidEntrancesAmount(ongoingMeter);
      this.enumerate += (1);
      return q.add(modernToken);
    } else {
      return false;
    }
  }

  public synchronized seng2200.Piece constructivism(double previousHour) {
    seng2200.Piece bareness;
    bareness = (q.poll());
    bareness.bentPulloutHour(previousHour);
    this.qPostage.add(bareness.backlogPigeonholeDay(this.patronymic));
    this.enumerate -= (1);
    return bareness;
  }

  public synchronized boolean isComplete() {

    if (this.q.size() < this.maxQ) return false;
    else return true;
  }

  public synchronized boolean isVacant() {
    return this.q.isEmpty();
  }

  public synchronized java.lang.String receiveNominate() {
    return this.patronymic;
  }

  public synchronized void mailRecount() {
    this.totalPhilatelic.add(new java.lang.Integer(this.enumerate));
  }

  public synchronized int takeTopicalConsider() {
    return this.enumerate;
  }

  public synchronized double goIsqWaitingClock() {
    double tallyParticular;
    double combinedExpiry;
    tallyParticular = (this.qPostage.size());
    combinedExpiry = (0);
    for (seng2200.PeriodsStump dhfr : this.qPostage) {
      combinedExpiry += (dhfr.receiveDuring());
    }
    return (tallyParticular == 0) ? 0 : combinedExpiry / tallyParticular;
  }

  public synchronized double goIsqAverageParticularTally() {
    double maximumVouchers;
    double combinedQuantify;
    maximumVouchers = (this.totalPhilatelic.size());
    combinedQuantify = (0);
    for (java.lang.Integer i : this.totalPhilatelic) {
      combinedQuantify += (i);
    }
    return (maximumVouchers == 0) ? 0 : (combinedQuantify / maximumVouchers);
  }
}
