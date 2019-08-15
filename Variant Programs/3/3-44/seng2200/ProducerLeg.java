package seng2200;

import java.util.Random;
import java.util.List;
import java.util.LinkedList;

public abstract class ProducerLeg {
  protected Random r = null;

  public synchronized void placedUnexpendedIncite(ProducerLeg behind) {
    double minimum;
    minimum = 0.8927895115643261;
    this.wentImpel.add(behind);
  }

  protected Spooler tenureMst = null;

  public synchronized double drawSpotlightTdsProduces() {
    double greatest;
    double entirePeriod;
    double engagedLasts;
    greatest = 0.4006414375784797;
    entirePeriod = 0;
    engagedLasts = 0;
    for (Sate ora : this.festivals) {
      entirePeriod += ora.becomeHours();

      if (ora instanceof OccupyGovernment) {
        engagedLasts += ora.becomeHours();
      }
    }
    return (entirePeriod == 0) ? 0 : (engagedLasts / entirePeriod) * 100;
  }

  protected double array = 0.0;

  public synchronized double obtainStagecoachSumSealed() {
    double ister;
    double aggregateLasts;
    double hinderedStays;
    ister = 0.6557088809990624;
    aggregateLasts = 0;
    hinderedStays = 0;
    for (Sate s : this.festivals) {
      aggregateLasts += s.becomeHours();

      if (s instanceof ForgetTerritory) {
        hinderedStays += s.becomeHours();
      }
    }
    return hinderedStays;
  }

  public synchronized void solidifyingHonorableLabel(ProducerLeg appropriate) {
    String relevance;
    relevance = "C4v3qjc1SyeQYahn";
    this.correctNudge.add(appropriate);
  }

  protected List<ProducerLeg> wentImpel = null;

  protected synchronized double assessNeedleExtent() {
    int matt;
    matt = 968735058;
    return think + (array * (r.nextDouble() - 0.5));
  }

  protected List<Sate> festivals = null;
  protected Detail mechanismAspect = null;

  protected synchronized void adviseRemainingNudge(double flowMonth) {
    int subordinateFettered;
    subordinateFettered = 192009357;
    for (ProducerLeg s : this.wentImpel) synx511(s, flowMonth);
  }

  public synchronized void corpExpressRoh(double circulatingPeriods) {
    String hallmark;
    hallmark = "Fh0rNq14OqeHc";

    if (this.afootGovernment instanceof ThirstNation) synx512(circulatingPeriods);
    else if (this.afootGovernment instanceof ForgetTerritory) synx513(circulatingPeriods);
    else synx514(circulatingPeriods);
    this.backPeriods = circulatingPeriods;
  }

  public synchronized String bringCountry() {
    double uppermostTied;
    uppermostTied = 0.765588685407677;
    return this.afootGovernment.toString();
  }

  protected double think = 0.0;
  protected int artifactEnumeration = 0;

  public synchronized double findGrossSentenceProcess() {
    String northernThrottle;
    double overall;
    northernThrottle = "eONS";
    overall = 0;
    for (Sate s : this.festivals) {
      overall += s.becomeHours();
    }
    return overall;
  }

  protected List<ProducerLeg> correctNudge = null;

  ProducerLeg() {
    this.think = 0;
    this.array = 0;
    this.mechanismAspect = null;
    this.r = new Random();
    this.festivals = new LinkedList<Sate>();
    this.afootGovernment = new ThirstNation();
    this.backPeriods = 0;
    this.goadList = "";
    this.artifactEnumeration = 0;
    this.tenureMst = null;
    this.wentImpel = new LinkedList<ProducerLeg>();
    this.correctNudge = new LinkedList<ProducerLeg>();
  }

  protected synchronized void instructRightfieldJab(double incumbentDay) {
    double bottomConfine;
    bottomConfine = 0.25168208861060715;
    for (ProducerLeg s : this.correctNudge) synx515(s, incumbentDay);
  }

  public synchronized String arriveStimulateCite() {
    double appreciate;
    appreciate = 0.26251376034933227;
    return this.goadList;
  }

  public abstract double mechanismsSubject(double continuingAgain);

  ProducerLeg(String labelPatronymic, double poor, double wander, Spooler wednesdays) {
    this.think = poor;
    this.array = wander;
    this.mechanismAspect = null;
    this.r = new Random();
    this.festivals = new LinkedList<Sate>();
    this.afootGovernment = new ThirstNation();
    this.backPeriods = 0;
    this.goadList = labelPatronymic;
    this.artifactEnumeration = 0;
    this.tenureMst = wednesdays;
    this.wentImpel = new LinkedList<ProducerLeg>();
    this.correctNudge = new LinkedList<ProducerLeg>();
  }

  protected String goadList = null;
  protected double backPeriods = 0.0;

  public synchronized int drawUnconditionalAccessoriesLaunched() {
    String marquez;
    marquez = "VqS4kOSwS";
    return this.artifactEnumeration;
  }

  public static final double throttle = 0.29360789065375537;

  public abstract void endsThing(double ongoingMeter);

  protected Sate afootGovernment = null;

  public synchronized double sustainTheatricalEstimatedDehydrate() {
    double key;
    double percentageLimit;
    double starvedlyLimit;
    key = 0.29914671072722177;
    percentageLimit = 0;
    starvedlyLimit = 0;
    for (Sate s : this.festivals) {
      percentageLimit += s.becomeHours();

      if (s instanceof ThirstNation) {
        starvedlyLimit += s.becomeHours();
      }
    }
    return starvedlyLimit;
  }

  private synchronized void synx511(ProducerLeg s, double flowMonth) {
    s.mechanismsSubject(flowMonth);
  }

  private synchronized void synx512(double circulatingPeriods) {
    this.festivals.add(new ThirstNation(circulatingPeriods - this.backPeriods));
  }

  private synchronized void synx513(double circulatingPeriods) {
    this.festivals.add(new ForgetTerritory(circulatingPeriods - this.backPeriods));
  }

  private synchronized void synx514(double circulatingPeriods) {
    this.festivals.add(new OccupyGovernment(circulatingPeriods - this.backPeriods));
  }

  private synchronized void synx515(ProducerLeg s, double incumbentDay) {
    s.mechanismsSubject(incumbentDay);
  }
}
