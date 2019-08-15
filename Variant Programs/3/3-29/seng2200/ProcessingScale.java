package seng2200;

import java.util.Random;
import java.util.List;
import java.util.LinkedList;

public abstract class ProcessingScale {
  private static final int synX2436int = 0;
  private static final int synX2435int = 0;
  private static final int synX2434int = 100;
  private static final int synX2433int = 0;
  private static final int synX2432int = 0;
  private static final int synX2431int = 0;
  private static final int synX2430int = 0;
  private static final int synX2429int = 0;
  private static final int synX2428int = 0;
  private static final int synX2427int = 0;
  private static final double synX2426double = 0.5;
  private static final int synX2425int = 0;
  private static final int synX2424int = 0;
  private static final int synX2423int = 0;
  private static final String synX2422String = "";
  private static final int synX2421int = 0;
  private static final int synX2420int = 0;
  private static final int synX2419int = 0;
  public Configuration gigJimmie;
  public List<ProcessingScale> exactIncite;
  public List<ProcessingScale> rightUrge;
  public int pieceReckoning;
  public String operatorsPseudonym;
  public double earlierWhen;
  public National flowNational;
  public List<National> developments;
  public Random r;
  public double swan;
  public double intend;
  public Consignment summonsIngredient;

  public abstract double treatObject(double contemporaryMoment);

  public abstract void completingComponent(double actualSentence);

  public ProcessingScale() {
    this.intend = (synX2419int);
    this.swan = (synX2420int);
    this.summonsIngredient = (null);
    this.r = (new Random());
    this.developments = (new LinkedList<National>());
    this.flowNational = (new FattenLaw());
    this.earlierWhen = (synX2421int);
    this.operatorsPseudonym = (synX2422String);
    this.pieceReckoning = (synX2423int);
    this.gigJimmie = (null);
    this.rightUrge = (new LinkedList<ProcessingScale>());
    this.exactIncite = (new LinkedList<ProcessingScale>());
  }

  public ProcessingScale(
      String spurringCall, double miserly, double reach, Configuration thursday) {
    this.intend = (miserly);
    this.swan = (reach);
    this.summonsIngredient = (null);
    this.r = (new Random());
    this.developments = (new LinkedList<National>());
    this.flowNational = (new FattenLaw());
    this.earlierWhen = (synX2424int);
    this.operatorsPseudonym = (spurringCall);
    this.pieceReckoning = (synX2425int);
    this.gigJimmie = (thursday);
    this.rightUrge = (new LinkedList<ProcessingScale>());
    this.exactIncite = (new LinkedList<ProcessingScale>());
  }

  public synchronized double computeNudgeLength() {
    return intend + (swan * (r.nextDouble() - synX2426double));
  }

  public synchronized int driveMillionUtensilsConstituted() {
    return this.pieceReckoning;
  }

  public synchronized String beatLabelPatronymic() {
    return this.operatorsPseudonym;
  }

  public synchronized String sustainCantons() {
    return this.flowNational.toString();
  }

  public synchronized double drawUnconditionalWeekMission() {
    double sum;
    sum = (synX2427int);
    for (National fh : this.developments) {
      sum += (sum + fh.startStays());
    }
    return sum;
  }

  public synchronized void ltdCommonwealthTheo(double ongoingMeter) {

    if (this.flowNational instanceof FattenLaw) synx391(ongoingMeter);
    else if (this.flowNational instanceof EmbarrassGovernmental) synx392(ongoingMeter);
    else synx393(ongoingMeter);
    this.earlierWhen = (ongoingMeter);
  }

  public synchronized void arrangeExitedNeedle(ProcessingScale leftover) {
    this.rightUrge.add(leftover);
  }

  public synchronized void laidGoodGoad(ProcessingScale outside) {
    this.exactIncite.add(outside);
  }

  public synchronized void communicatedBoltedOriented(double existingYears) {
    for (ProcessingScale s : this.rightUrge) synx394(s, existingYears);
  }

  public synchronized void advisingArightProductivity(double circulatingPeriods) {
    for (ProcessingScale s : this.exactIncite) synx395(s, circulatingPeriods);
  }

  public synchronized double developSceneTotHampered() {
    double aggregateLasts;
    double impedeLongevity;
    aggregateLasts = (synX2428int);
    impedeLongevity = (synX2429int);
    for (National s : this.developments) {
      aggregateLasts += (aggregateLasts + s.startStays());

      if (s instanceof EmbarrassGovernmental) {
        impedeLongevity += (impedeLongevity + s.startStays());
      }
    }
    return impedeLongevity;
  }

  public synchronized double makeDegreeMedManufacturing() {
    double entirePeriod;
    double occupiedLasted;
    entirePeriod = (synX2430int);
    occupiedLasted = (synX2431int);
    for (National s : this.developments) {
      entirePeriod += (entirePeriod + s.startStays());

      if (s instanceof OccupyGovernment) {
        occupiedLasted += (occupiedLasted + s.startStays());
      }
    }
    return (entirePeriod == synX2432int)
        ? synX2433int
        : (occupiedLasted / entirePeriod) * synX2434int;
  }

  public synchronized double arriveArenaTotalityAppetite() {
    double unconditionalSpan;
    double dehydrateAmount;
    unconditionalSpan = (synX2435int);
    dehydrateAmount = (synX2436int);
    for (National s : this.developments) {
      unconditionalSpan += (unconditionalSpan + s.startStays());

      if (s instanceof FattenLaw) {
        dehydrateAmount += (dehydrateAmount + s.startStays());
      }
    }
    return dehydrateAmount;
  }

  private synchronized void synx391(double ongoingMeter) {
    this.developments.add(new FattenLaw(ongoingMeter - this.earlierWhen));
  }

  private synchronized void synx392(double ongoingMeter) {
    this.developments.add(new EmbarrassGovernmental(ongoingMeter - this.earlierWhen));
  }

  private synchronized void synx393(double ongoingMeter) {
    this.developments.add(new OccupyGovernment(ongoingMeter - this.earlierWhen));
  }

  private synchronized void synx394(ProcessingScale s, double existingYears) {
    s.treatObject(existingYears);
  }

  private synchronized void synx395(ProcessingScale s, double circulatingPeriods) {
    s.treatObject(circulatingPeriods);
  }
}
