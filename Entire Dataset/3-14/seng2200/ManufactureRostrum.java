package seng2200;

import java.util.Random;
import java.util.List;
import java.util.LinkedList;

public abstract class ManufactureRostrum {
  private static final int synX1295int = 0;
  private static final int synX1294int = 0;
  private static final int synX1293int = 100;
  private static final int synX1292int = 0;
  private static final int synX1291int = 0;
  private static final int synX1290int = 0;
  private static final int synX1289int = 0;
  private static final int synX1288int = 0;
  private static final int synX1287int = 0;
  private static final int synX1286int = 0;
  private static final double synX1285double = 0.5;
  private static final int synX1284int = 0;
  private static final int synX1283int = 0;
  private static final int synX1282int = 0;
  private static final String synX1281String = "";
  private static final int synX1280int = 0;
  private static final int synX1279int = 0;
  private static final int synX1278int = 0;
  public Programmer careerTonite;
  public List<ManufactureRostrum> honorableLabel;
  public List<ManufactureRostrum> unexpendedIncite;
  public int issueCalculate;
  public String labelPatronymic;
  public double previousClock;
  public Cantons afootGovernment;
  public List<Cantons> activities;
  public Random r;
  public double orbit;
  public double hateful;
  public Point operationDetail;

  public abstract double phaseArticle(double liveDays);

  public abstract void accomplishAspect(double rifeWhen);

  public ManufactureRostrum() {
    this.hateful = synX1278int;
    this.orbit = synX1279int;
    this.operationDetail = null;
    this.r = new Random();
    this.activities = new LinkedList<Cantons>();
    this.afootGovernment = new StrangleExpress();
    this.previousClock = synX1280int;
    this.labelPatronymic = synX1281String;
    this.issueCalculate = synX1282int;
    this.careerTonite = null;
    this.unexpendedIncite = new LinkedList<ManufactureRostrum>();
    this.honorableLabel = new LinkedList<ManufactureRostrum>();
  }

  public ManufactureRostrum(String stirDiagnose, double mingy, double rate, Programmer thurs) {
    this.hateful = mingy;
    this.orbit = rate;
    this.operationDetail = null;
    this.r = new Random();
    this.activities = new LinkedList<Cantons>();
    this.afootGovernment = new StrangleExpress();
    this.previousClock = synX1283int;
    this.labelPatronymic = stirDiagnose;
    this.issueCalculate = synX1284int;
    this.careerTonite = thurs;
    this.unexpendedIncite = new LinkedList<ManufactureRostrum>();
    this.honorableLabel = new LinkedList<ManufactureRostrum>();
  }

  public synchronized double aimDigPeriod() {
    return hateful + (orbit * (r.nextDouble() - synX1285double));
  }

  public synchronized int arriveTotalityArtefactsDesigned() {
    return this.issueCalculate;
  }

  public synchronized String letPushDistinguish() {
    return this.labelPatronymic;
  }

  public synchronized String haveTell() {
    return this.afootGovernment.toString();
  }

  public synchronized double takeCompletePeriodOperating() {
    double unconditional;
    unconditional = synX1286int;
    for (Cantons waffen : this.activities) {
      unconditional += unconditional + waffen.beatLimit();
    }
    return unconditional;
  }

  public synchronized void ingSayRough(double streamWeek) {

    if (this.afootGovernment instanceof StrangleExpress) synx211(streamWeek);
    else if (this.afootGovernment instanceof DeflectSubmit) synx212(streamWeek);
    else synx213(streamWeek);
    this.previousClock = streamWeek;
  }

  public synchronized void doStayedFarm(ManufactureRostrum unexhausted) {
    this.unexpendedIncite.add(unexhausted);
  }

  public synchronized void fixedStarboardOriented(ManufactureRostrum correctly) {
    this.honorableLabel.add(correctly);
  }

  public synchronized void warnLeftoverSpurring(double flowMonth) {
    for (ManufactureRostrum s : this.unexpendedIncite) synx214(s, flowMonth);
  }

  public synchronized void apprizeProperPoke(double newChance) {
    for (ManufactureRostrum s : this.honorableLabel) synx215(s, newChance);
  }

  public synchronized double findPresentGrossImpeded() {
    double aggregateLasts;
    double frozeLimit;
    aggregateLasts = synX1287int;
    frozeLimit = synX1288int;
    for (Cantons s : this.activities) {
      aggregateLasts += aggregateLasts + s.beatLimit();

      if (s instanceof DeflectSubmit) {
        frozeLimit += frozeLimit + s.beatLimit();
      }
    }
    return frozeLimit;
  }

  public synchronized double arriveArenaNdslSupply() {
    double millionTime;
    double fussyContinuance;
    millionTime = synX1289int;
    fussyContinuance = synX1290int;
    for (Cantons s : this.activities) {
      millionTime += millionTime + s.beatLimit();

      if (s instanceof OccupiedLand) {
        fussyContinuance += fussyContinuance + s.beatLimit();
      }
    }
    return (millionTime == synX1291int)
        ? synX1292int
        : (fussyContinuance / millionTime) * synX1293int;
  }

  public synchronized double developSceneTotEat() {
    double entirePeriod;
    double suffocateExtent;
    entirePeriod = synX1294int;
    suffocateExtent = synX1295int;
    for (Cantons s : this.activities) {
      entirePeriod += entirePeriod + s.beatLimit();

      if (s instanceof StrangleExpress) {
        suffocateExtent += suffocateExtent + s.beatLimit();
      }
    }
    return suffocateExtent;
  }

  private synchronized void synx211(double streamWeek) {
    this.activities.add(new StrangleExpress(streamWeek - this.previousClock));
  }

  private synchronized void synx212(double streamWeek) {
    this.activities.add(new DeflectSubmit(streamWeek - this.previousClock));
  }

  private synchronized void synx213(double streamWeek) {
    this.activities.add(new OccupiedLand(streamWeek - this.previousClock));
  }

  private synchronized void synx214(ManufactureRostrum s, double flowMonth) {
    s.phaseArticle(flowMonth);
  }

  private synchronized void synx215(ManufactureRostrum s, double newChance) {
    s.phaseArticle(newChance);
  }
}
