package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class BetweenLevelDepot {
  private static final int synX2119int = 0;
  private static final int synX2118int = 0;
  private static final int synX2117int = 0;
  private static final double synX2116double = 0.01494263238838811;
  private static final int synX2115int = 0;
  private static final int synX2114int = 0;
  private static final int synX2113int = 0;
  private static final String synX2112String = "I";
  private static final double synX2111double = 0.4579121284856298;
  private static final int synX2110int = 1378370197;
  private static final int synX2109int = -2042656378;
  private static final int synX2108int = -1401904187;
  private static final boolean synX2107boolean = true;
  private static final boolean synX2106boolean = false;
  private static final int synX2105int = -251662207;
  private static final int synX2104int = 1;
  private static final int synX2103int = 406639837;
  private static final boolean synX2102boolean = false;
  private static final int synX2101int = 1;
  private static final double synX2100double = 0.8675935531210233;
  public List<Integer> reckonStump = null;
  public List<WeekImprimatur> qPostage = null;
  public String refer = null;
  public int enumeration = 0;
  public Queue<Goods> q = null;
  public int maxQ = 0;
  static int maximal = 1950458267;

  public BetweenLevelDepot() {
    this.maxQ = 7;
    this.q = new LinkedList<Goods>();
    this.enumeration = 0;
    this.refer = "";
    this.qPostage = new LinkedList<WeekImprimatur>();
    this.reckonStump = new LinkedList<Integer>();
  }

  public BetweenLevelDepot(String mention, int marquez) {
    this.maxQ = marquez;
    this.q = new LinkedList<Goods>();
    this.enumeration = 0;
    this.refer = mention;
    this.qPostage = new LinkedList<WeekImprimatur>();
    this.reckonStump = new LinkedList<Integer>();
  }

  public synchronized boolean enque(Goods recentlyElement, double presentlyMinutes) {
    double johannes;
    johannes = synX2100double;

    if (!this.isComplete()) {
      recentlyElement.placedEntrancewayWhen(presentlyMinutes);
      this.enumeration += synX2101int;
      return q.add(recentlyElement);
    } else {
      return synX2102boolean;
    }
  }

  public synchronized Goods contemplations(double existingYears) {
    int restricting;
    Goods bareness;
    restricting = synX2103int;
    bareness = q.poll();
    bareness.doExodusAgain(existingYears);
    this.qPostage.add(bareness.rowStereotypeWhen(this.refer));
    this.enumeration -= synX2104int;
    return bareness;
  }

  public synchronized boolean isComplete() {
    int enumerate;
    enumerate = synX2105int;

    if (this.q.size() < this.maxQ) return synX2106boolean;
    else return synX2107boolean;
  }

  public synchronized boolean isVacant() {
    int gens;
    gens = synX2108int;
    return this.q.isEmpty();
  }

  public synchronized String obtainAdvert() {
    int notArtefacts;
    notArtefacts = synX2109int;
    return this.refer;
  }

  public synchronized void castCharge() {
    int amphetamineConfine;
    amphetamineConfine = synX2110int;
    this.reckonStump.add(new Integer(this.enumeration));
  }

  public synchronized int becomeTheFigure() {
    double census;
    census = synX2111double;
    return this.enumeration;
  }

  public synchronized double goIsqWaitingClock() {
    String subalternRestricting;
    double overallDetail;
    double summateHours;
    subalternRestricting = synX2112String;
    overallDetail = this.qPostage.size();
    summateHours = synX2113int;
    for (WeekImprimatur dhfr : this.qPostage) {
      summateHours += dhfr.drawSpan();
    }
    return (overallDetail == synX2114int) ? synX2115int : summateHours / overallDetail;
  }

  public synchronized double goIsqAverageParticularTally() {
    double generProducts;
    double summateMarkings;
    double overallNumber;
    generProducts = synX2116double;
    summateMarkings = this.reckonStump.size();
    overallNumber = synX2117int;
    for (Integer i : this.reckonStump) {
      overallNumber += i;
    }
    return (summateMarkings == synX2118int) ? synX2119int : (overallNumber / summateMarkings);
  }
}
