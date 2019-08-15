package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class FraInstarArchival {
  private static final boolean synX429boolean = true;
  private static final boolean synX428boolean = false;
  private static final int synX427int = 1;
  private static final boolean synX426boolean = false;
  private static final int synX425int = 1;
  private static final int synX424int = 0;
  private static final int synX423int = 0;
  private static final int synX422int = 0;
  private static final int synX421int = 0;
  private static final int synX420int = 0;
  private static final int synX419int = 0;

  public synchronized double goIsqWaitingClock() {
    double overallDetail;
    double fullLonger;
    overallDetail = (this.qPostage.size());
    fullLonger = (synX419int);
    for (seng2200.NowImprint righ : this.qPostage) {
      fullLonger += (fullLonger + righ.receiveDuring());
    }
    return (overallDetail == synX420int) ? synX421int : fullLonger / overallDetail;
  }

  public synchronized int becomeTheFigure() {
    return this.tabulation;
  }

  public synchronized double goIsqAverageParticularTally() {
    double aggregateEmboss;
    double summateFigure;
    aggregateEmboss = (this.tellAffix.size());
    summateFigure = (synX422int);
    for (java.lang.Integer i : this.tellAffix) {
      summateFigure += (summateFigure + i);
    }
    return (aggregateEmboss == synX423int) ? synX424int : (summateFigure / aggregateEmboss);
  }

  public synchronized void castCharge() {
    this.tellAffix.add(new java.lang.Integer(this.tabulation));
  }

  private java.util.List<NowImprint> qPostage;
  private int maxQ;

  FraInstarArchival() {
    this.maxQ = (7);
    this.q = (new java.util.LinkedList<Artifact>());
    this.tabulation = (0);
    this.mention = ("");
    this.qPostage = (new java.util.LinkedList<NowImprint>());
    this.tellAffix = (new java.util.LinkedList<Integer>());
  }

  private java.lang.String mention;
  private java.util.List<Integer> tellAffix;

  FraInstarArchival(String identify, int matt) {
    this.maxQ = (matt);
    this.q = (new java.util.LinkedList<Artifact>());
    this.tabulation = (0);
    this.mention = (identify);
    this.qPostage = (new java.util.LinkedList<NowImprint>());
    this.tellAffix = (new java.util.LinkedList<Integer>());
  }

  public synchronized boolean enque(seng2200.Artifact untriedConsignment, double presentBeginning) {

    if (!this.isComplete()) {
      untriedConsignment.primedLaunchingPeriod(presentBeginning);
      this.tabulation += (this.tabulation + synX425int);
      return q.add(untriedConsignment);
    } else {
      return synX426boolean;
    }
  }

  public synchronized seng2200.Artifact array(double underwayYear) {
    seng2200.Artifact queue;
    queue = (q.poll());
    queue.situatedMoveMinutes(underwayYear);
    this.qPostage.add(queue.backlogPigeonholeDay(this.mention));
    this.tabulation -= (this.tabulation - synX427int);
    return queue;
  }

  private int tabulation;

  public synchronized boolean isComplete() {

    if (this.q.size() < this.maxQ) return synX428boolean;
    else return synX429boolean;
  }

  public synchronized java.lang.String driveNickname() {
    return this.mention;
  }

  private java.util.Queue<Artifact> q;

  public synchronized boolean isVacant() {
    return this.q.isEmpty();
  }
}
