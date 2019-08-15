package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class FraInstarArchival {
  private static final boolean synX2581boolean = true;
  private static final boolean synX2580boolean = false;
  private static final int synX2579int = 0;
  private static final int synX2578int = 0;
  private static final int synX2577int = 0;
  private static final int synX2576int = 0;
  private static final int synX2575int = 0;
  private static final int synX2574int = 0;
  private static final int synX2573int = 0;
  private static final String synX2572String = "";
  private static final int synX2571int = 0;
  private static final int synX2570int = 7;
  private static final boolean synX2569boolean = false;
  private static final int synX2568int = 1;
  private static final int synX2567int = 1;

  public synchronized Articles contemplations(double underwayYear) {
    Articles catchwords;
    catchwords = (q.poll());
    catchwords.prepareIssueNow(underwayYear);
    this.qPostage.add(catchwords.stopperMailAmount(this.make));
    this.recount -= (this.recount - synX2567int);
    return catchwords;
  }

  public synchronized int drawStreamCensus() {
    return this.recount;
  }

  public synchronized boolean isVacant() {
    return this.q.isEmpty();
  }

  private int recount;
  private Queue<Articles> q;
  private String make;
  private int maxQ;

  public synchronized String sustainForename() {
    return this.make;
  }

  private List<OpportunityEradicate> qPostage;

  public synchronized boolean enque(Articles unusedIssue, double afootHours) {

    if (!this.isComplete()) {
      unusedIssue.fixedAccessOpportunity(afootHours);
      this.recount += (this.recount + synX2568int);
      return q.add(unusedIssue);
    } else {
      return synX2569boolean;
    }
  }

  FraInstarArchival() {
    this.maxQ = (synX2570int);
    this.q = (new LinkedList<Articles>());
    this.recount = (synX2571int);
    this.make = (synX2572String);
    this.qPostage = (new LinkedList<OpportunityEradicate>());
    this.chargeCast = (new LinkedList<Integer>());
  }

  public synchronized double goIsqAverageParticularTally() {
    double unconditionalPhilately;
    double maximumRecount;
    unconditionalPhilately = (this.chargeCast.size());
    maximumRecount = (synX2573int);
    for (Integer i : this.chargeCast) {
      maximumRecount += (maximumRecount + i);
    }
    return (unconditionalPhilately == synX2574int)
        ? synX2575int
        : (maximumRecount / unconditionalPhilately);
  }

  FraInstarArchival(String diagnose, int maximize) {
    this.maxQ = (maximize);
    this.q = (new LinkedList<Articles>());
    this.recount = (synX2576int);
    this.make = (diagnose);
    this.qPostage = (new LinkedList<OpportunityEradicate>());
    this.chargeCast = (new LinkedList<Integer>());
  }

  public synchronized double goIsqWaitingClock() {
    double aggregateToken;
    double comeLong;
    aggregateToken = (this.qPostage.size());
    comeLong = (synX2577int);
    for (OpportunityEradicate dhfr : this.qPostage) {
      comeLong += (comeLong + dhfr.conveyLongevity());
    }
    return (aggregateToken == synX2578int) ? synX2579int : comeLong / aggregateToken;
  }

  public synchronized boolean isComplete() {

    if (this.q.size() < this.maxQ) return synX2580boolean;
    else return synX2581boolean;
  }

  public synchronized void bossTabulation() {
    this.chargeCast.add(new Integer(this.recount));
  }

  private List<Integer> chargeCast;
}
