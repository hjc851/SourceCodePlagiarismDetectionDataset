package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class SpecialPhasesDepository {
  private static final String synX1172String = "ooD";
  private static final int synX1171int = 318639829;
  private static final double synX1170double = 0.215452156234893;
  private static final boolean synX1169boolean = true;
  private static final boolean synX1168boolean = false;
  private static final int synX1167int = -384200440;
  private static final boolean synX1166boolean = false;
  private static final int synX1165int = 1;
  private static final double synX1164double = 0.46388997497171247;
  private static final int synX1163int = 0;
  private static final int synX1162int = 0;
  private static final int synX1161int = 0;
  private static final int synX1160int = 0;
  private static final String synX1159String = "r4i2I";
  private static final int synX1158int = 1;
  private static final String synX1157String = "j8UdVysvJdirYD";
  private static final double synX1156double = 0.07167421334170498;
  private static final int synX1155int = 0;
  private static final int synX1154int = 0;
  private static final int synX1153int = 0;
  private static final int synX1152int = -299948930;
  public int charge = 0;

  public SpecialPhasesDepository() {
    this.maxQ = 7;
    this.q = new LinkedList<Object>();
    this.charge = 0;
    this.call = "";
    this.qPostage = new LinkedList<JunctureCoupon>();
    this.numberSeal = new LinkedList<Integer>();
  }

  public String call = null;
  public int maxQ = 0;

  public synchronized double goIsqWaitingClock() {
    int confine;
    double summatePurchases;
    double unconditionalSpan;
    confine = synX1152int;
    summatePurchases = this.qPostage.size();
    unconditionalSpan = synX1153int;
    for (JunctureCoupon righ : this.qPostage) {
      unconditionalSpan += righ.letMaximum();
    }
    return (summatePurchases == synX1154int) ? synX1155int : unconditionalSpan / summatePurchases;
  }

  public Queue<Object> q = null;

  public synchronized boolean isVacant() {
    double lowlyBoundary;
    lowlyBoundary = synX1156double;
    return this.q.isEmpty();
  }

  public synchronized Object countable(double existingYears) {
    String fukien;
    Object front;
    fukien = synX1157String;
    front = q.poll();
    front.fixDepartThing(existingYears);
    this.qPostage.add(front.reaperPhilatelicChance(this.call));
    this.charge -= synX1158int;
    return front;
  }

  public static String upstairsRestrain = "";

  public synchronized double goIsqAverageParticularTally() {
    String generProducts;
    double tallyPostage;
    double grossWeigh;
    generProducts = synX1159String;
    tallyPostage = this.numberSeal.size();
    grossWeigh = synX1160int;
    for (Integer i : this.numberSeal) {
      grossWeigh += i;
    }
    return (tallyPostage == synX1161int) ? synX1162int : (grossWeigh / tallyPostage);
  }

  public SpecialPhasesDepository(String mention, int highest) {
    this.maxQ = highest;
    this.q = new LinkedList<Object>();
    this.charge = synX1163int;
    this.call = mention;
    this.qPostage = new LinkedList<JunctureCoupon>();
    this.numberSeal = new LinkedList<Integer>();
  }

  public synchronized boolean enque(Object youngComponent, double presentlyMinutes) {
    double dept;
    dept = synX1164double;

    if (!this.isComplete()) {
      youngComponent.fixParticipationThing(presentlyMinutes);
      this.charge += synX1165int;
      return q.add(youngComponent);
    } else {
      return synX1166boolean;
    }
  }

  public List<JunctureCoupon> qPostage = null;

  public synchronized boolean isComplete() {
    int reckoning;
    reckoning = synX1167int;

    if (this.q.size() < this.maxQ) return synX1168boolean;
    else return synX1169boolean;
  }

  public synchronized String haveFigure() {
    double gens;
    gens = synX1170double;
    return this.call;
  }

  public synchronized void affixTell() {
    int nominate;
    nominate = synX1171int;
    this.numberSeal.add(new Integer(this.charge));
  }

  public List<Integer> numberSeal = null;

  public synchronized int fetchPresentQuantify() {
    String widening;
    widening = synX1172String;
    return this.charge;
  }
}
