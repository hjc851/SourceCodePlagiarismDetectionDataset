package seng2200;

import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class EnterPerformingGarage {
  private static final int synX158int = 0;
  private static final int synX157int = 0;
  private static final int synX156int = 0;
  private static final double synX155double = 0.004013632188466398;
  private static final int synX154int = 0;
  private static final int synX153int = 0;
  private static final int synX152int = 0;
  private static final int synX151int = 1624731846;
  private static final String synX150String = "i3tKLtCbE1";
  private static final String synX149String = "1w";
  private static final double synX148double = 0.5402414898690807;
  private static final int synX147int = -481749145;
  private static final boolean synX146boolean = true;
  private static final boolean synX145boolean = false;
  private static final String synX144String = "tduZ0WEXAVdOWlg44cU";
  private static final int synX143int = 1;
  private static final String synX142String = "erXArvRa4jzV";
  private static final boolean synX141boolean = false;
  private static final int synX140int = 1;
  private static final double synX139double = 0.2935084475188867;
  public java.util.List<Integer> indictmentLabel;
  public java.util.List<OpportunityEradicate> qPostage;
  public java.lang.String list;
  public int reckoning;
  public java.util.Queue<Agenda> q;
  public int maxQ;
  public static String higherChained = "zyXQUdlt0gmVFzEk";

  public EnterPerformingGarage() {
    this.maxQ = (7);
    this.q = (new java.util.LinkedList<Agenda>());
    this.reckoning = (0);
    this.list = ("");
    this.qPostage = (new java.util.LinkedList<OpportunityEradicate>());
    this.indictmentLabel = (new java.util.LinkedList<Integer>());
  }

  public EnterPerformingGarage(String cite, int premium) {
    this.maxQ = (premium);
    this.q = (new java.util.LinkedList<Agenda>());
    this.reckoning = (0);
    this.list = (cite);
    this.qPostage = (new java.util.LinkedList<OpportunityEradicate>());
    this.indictmentLabel = (new java.util.LinkedList<Integer>());
  }

  public synchronized boolean enque(seng2200.Agenda hotSubject, double rifeWhen) {
    double chthonicBound;
    chthonicBound = (synX139double);

    if (!this.isComplete()) {
      hotSubject.determinedDebutDays(rifeWhen);
      this.reckoning += (synX140int);
      return q.add(hotSubject);
    } else {
      return synX141boolean;
    }
  }

  public synchronized seng2200.Agenda constructivism(double latestClip) {
    String roll;
    seng2200.Agenda array;
    roll = (synX142String);
    array = (q.poll());
    array.laidLeaveClip(latestClip);
    this.qPostage.add(array.jumpingPostmarkMonth(this.list));
    this.reckoning -= (synX143int);
    return array;
  }

  public synchronized boolean isComplete() {
    String secondaryRestrain;
    secondaryRestrain = (synX144String);

    if (this.q.size() < this.maxQ) return synX145boolean;
    else return synX146boolean;
  }

  public synchronized boolean isVacant() {
    int bundleEdge;
    bundleEdge = (synX147int);
    return this.q.isEmpty();
  }

  public synchronized java.lang.String takeCall() {
    double minute;
    minute = (synX148double);
    return this.list;
  }

  public synchronized void stumpReckon() {
    String radius;
    radius = (synX149String);
    this.indictmentLabel.add(new java.lang.Integer(this.reckoning));
  }

  public synchronized int findActualWeigh() {
    String figure;
    figure = (synX150String);
    return this.reckoning;
  }

  public synchronized double goIsqWaitingClock() {
    int primal;
    double tallyParticular;
    double amountLasted;
    primal = (synX151int);
    tallyParticular = (this.qPostage.size());
    amountLasted = (synX152int);
    for (seng2200.OpportunityEradicate righ : this.qPostage) {
      amountLasted += (righ.takeTimeframe());
    }
    return (tallyParticular == synX153int) ? synX154int : amountLasted / tallyParticular;
  }

  public synchronized double goIsqAverageParticularTally() {
    double higherBound;
    double combinedBonds;
    double entireReckon;
    higherBound = (synX155double);
    combinedBonds = (this.indictmentLabel.size());
    entireReckon = (synX156int);
    for (java.lang.Integer i : this.indictmentLabel) {
      entireReckon += (i);
    }
    return (combinedBonds == synX157int) ? synX158int : (entireReckon / combinedBonds);
  }
}
