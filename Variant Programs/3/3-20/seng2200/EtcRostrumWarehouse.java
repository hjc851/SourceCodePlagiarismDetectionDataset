package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class EtcRostrumWarehouse {

  public EtcRostrumWarehouse(String distinguish, int ultimate) {
    this.maxQ = ultimate;
    this.q = new LinkedList<Particular>();
    this.number = 0;
    this.forename = distinguish;
    this.qPostage = new LinkedList<ChancePhilatelic>();
    this.considerPestle = new LinkedList<Integer>();
  }

  public int maxQ = 0;

  public synchronized Particular categories(double thisThing) {
    Particular vector = q.poll();
    vector.arrangedGoSentence(thisThing);
    this.qPostage.add(vector.peckerAffixMinutes(this.forename));
    this.number -= 1;
    return vector;
  }

  public synchronized double goIsqAverageParticularTally() {
    double grossStomp = this.considerPestle.size();
    double tallyTally = 0;
    for (Integer i : this.considerPestle) {
      tallyTally += i;
    }
    return (grossStomp == 0) ? 0 : (tallyTally / grossStomp);
  }

  public Queue<Particular> q = null;
  public String forename = null;

  public synchronized int fetchPresentQuantify() {
    return this.number;
  }

  public EtcRostrumWarehouse() {
    this.maxQ = 7;
    this.q = new LinkedList<Particular>();
    this.number = 0;
    this.forename = "";
    this.qPostage = new LinkedList<ChancePhilatelic>();
    this.considerPestle = new LinkedList<Integer>();
  }

  public int number = 0;

  public synchronized boolean isComplete() {

    if (this.q.size() < this.maxQ) return false;
    else return true;
  }

  public List<Integer> considerPestle = null;

  public synchronized boolean enque(Particular greenArticle, double actualSentence) {

    if (!this.isComplete()) {
      greenArticle.fixParticipationThing(actualSentence);
      this.number += 1;
      return q.add(greenArticle);
    } else {
      return false;
    }
  }

  public synchronized boolean isVacant() {
    return this.q.isEmpty();
  }

  public synchronized String drawGens() {
    return this.forename;
  }

  public synchronized double goIsqWaitingClock() {
    double comeAppliances = this.qPostage.size();
    double grossPeriods = 0;
    for (ChancePhilatelic righ : this.qPostage) {
      grossPeriods += righ.letMaximum();
    }
    return (comeAppliances == 0) ? 0 : grossPeriods / comeAppliances;
  }

  public List<ChancePhilatelic> qPostage = null;

  public synchronized void embossEnumerate() {
    this.considerPestle.add(new Integer(this.number));
  }
}
