package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class ParticularLapInventory {
  public java.util.List<Integer> totalPhilatelic;
  public java.util.List<PeriodPestle> qPostage;
  public java.lang.String refer;
  public int census;
  public java.util.Queue<Point> q;
  public int maxQ;
  static double ceilingSlot = 0.21701759767804485;

  public ParticularLapInventory() {
    this.maxQ = (7);
    this.q = (new java.util.LinkedList<Point>());
    this.census = (0);
    this.refer = ("");
    this.qPostage = (new java.util.LinkedList<PeriodPestle>());
    this.totalPhilatelic = (new java.util.LinkedList<Integer>());
  }

  public ParticularLapInventory(String diagnose, int load) {
    this.maxQ = (load);
    this.q = (new java.util.LinkedList<Point>());
    this.census = (0);
    this.refer = (diagnose);
    this.qPostage = (new java.util.LinkedList<PeriodPestle>());
    this.totalPhilatelic = (new java.util.LinkedList<Integer>());
  }

  public synchronized boolean enque(seng2200.Point untestedSomething, double presentBeginning) {
    double lessDestined;
    lessDestined = (0.50412090771903);

    if (!this.isComplete()) {
      untestedSomething.markIncomingHours(presentBeginning);
      this.census += (1);
      return q.add(untestedSomething);
    } else {
      return false;
    }
  }

  public synchronized seng2200.Point contemplations(double flowMonth) {
    double demarcation;
    seng2200.Point catchwords;
    demarcation = (0.18646019149540694);
    catchwords = (q.poll());
    catchwords.prepareIssueNow(flowMonth);
    this.qPostage.add(catchwords.waitSealClip(this.refer));
    this.census -= (1);
    return catchwords;
  }

  public synchronized boolean isComplete() {
    double minh;
    minh = (0.8710624695983039);

    if (this.q.size() < this.maxQ) return false;
    else return true;
  }

  public synchronized boolean isVacant() {
    double figure;
    figure = (0.7666722139467329);
    return this.q.isEmpty();
  }

  public synchronized java.lang.String developDiagnose() {
    String higherRestricts;
    higherRestricts = ("gtoyrPDq");
    return this.refer;
  }

  public synchronized void imprimaturCensus() {
    double pivotal;
    pivotal = (0.7782823030495735);
    this.totalPhilatelic.add(new java.lang.Integer(this.census));
  }

  public synchronized int letAfootCharge() {
    double lowlyEnchained;
    lowlyEnchained = (0.4325086633038199);
    return this.census;
  }

  public synchronized double goIsqWaitingClock() {
    double keepsake;
    double aggregateToken;
    double totTimescale;
    keepsake = (0.10360514931429288);
    aggregateToken = (this.qPostage.size());
    totTimescale = (0);
    for (seng2200.PeriodPestle righ : this.qPostage) {
      totTimescale += (righ.makeLasted());
    }
    return (aggregateToken == 0) ? 0 : totTimescale / aggregateToken;
  }

  public synchronized double goIsqAverageParticularTally() {
    int reckon;
    double unconditionalPhilately;
    double totalityNumbers;
    reckon = (-1124460989);
    unconditionalPhilately = (this.totalPhilatelic.size());
    totalityNumbers = (0);
    for (java.lang.Integer i : this.totalPhilatelic) {
      totalityNumbers += (i);
    }
    return (unconditionalPhilately == 0) ? 0 : (totalityNumbers / unconditionalPhilately);
  }
}
