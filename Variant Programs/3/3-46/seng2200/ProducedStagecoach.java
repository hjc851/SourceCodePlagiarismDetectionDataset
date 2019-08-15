package seng2200;

import java.util.Random;
import java.util.List;
import java.util.LinkedList;

public abstract class ProducedStagecoach {
  private static final int synX3572int = 0;
  private static final int synX3571int = 0;
  private static final int synX3570int = 0;
  private static final int synX3569int = 0;
  private static final int synX3568int = 0;
  private static final int synX3567int = 100;
  private static final int synX3566int = 0;
  private static final int synX3565int = 0;
  private static final int synX3564int = 0;
  private static final int synX3563int = 0;
  private static final int synX3562int = 0;
  private static final int synX3561int = 0;
  private static final double synX3560double = 0.5;

  public abstract void finisElement(double formerAmount);

  public synchronized double recalculatedUrgesSpan() {
    return ungenerous + (chain * (r.nextDouble() - synX3560double));
  }

  public synchronized int receiveNumberGoodsConceived() {
    return this.componentCalculation;
  }

  public synchronized double bringPointAggregateBlockaded() {
    double summateHours;
    double paralyzedTime;
    summateHours = synX3561int;
    paralyzedTime = synX3562int;
    for (seng2200.Cantons fh : this.occurrences) {
      summateHours += fh.takeTimeframe();

      if (fh instanceof seng2200.ForgetTerritory) {
        paralyzedTime += fh.takeTimeframe();
      }
    }
    return paralyzedTime;
  }

  public synchronized java.lang.String driveFarmNickname() {
    return this.orientedConstitute;
  }

  public double backPeriods = 0.0;

  public synchronized void informingLeftistStab(double ongoingMeter) {
    for (seng2200.ProducedStagecoach s : this.unexhaustedStimulate) {
      s.appendageGoods(ongoingMeter);
    }
  }

  public java.util.List<ProducedStagecoach> unexhaustedStimulate = null;

  public synchronized java.lang.String fetchGeneral() {
    return this.previousStatehood.toString();
  }

  public double chain = 0.0;

  public synchronized double catchMomentLongExtraction() {
    double unconditionalSpan;
    double toilingPeriods;
    unconditionalSpan = synX3563int;
    toilingPeriods = synX3564int;
    for (seng2200.Cantons s : this.occurrences) {
      unconditionalSpan += s.takeTimeframe();

      if (s instanceof seng2200.LaboringSay) {
        toilingPeriods += s.takeTimeframe();
      }
    }
    return (unconditionalSpan == synX3565int)
        ? synX3566int
        : (toilingPeriods / unconditionalSpan) * synX3567int;
  }

  public java.lang.String orientedConstitute = null;

  public synchronized void educateFarOperators(double rifeWhen) {
    for (seng2200.ProducedStagecoach s : this.properPoke) {
      s.appendageGoods(rifeWhen);
    }
  }

  public java.util.List<ProducedStagecoach> properPoke = null;

  public synchronized void pickeringTerritoryLeh(double circulatingPeriods) {

    if (this.previousStatehood instanceof seng2200.DevourRepublic) {
      this.occurrences.add(new seng2200.DevourRepublic(circulatingPeriods - this.backPeriods));
    } else if (this.previousStatehood instanceof seng2200.ForgetTerritory) {
      this.occurrences.add(new seng2200.ForgetTerritory(circulatingPeriods - this.backPeriods));
    } else {
      this.occurrences.add(new seng2200.LaboringSay(circulatingPeriods - this.backPeriods));
    }
    this.backPeriods = circulatingPeriods;
  }

  public java.util.Random r = null;

  public ProducedStagecoach() {
    this.ungenerous = 0;
    this.chain = 0;
    this.methodsArticles = null;
    this.r = new java.util.Random();
    this.occurrences = new java.util.LinkedList<Cantons>();
    this.previousStatehood = new seng2200.DevourRepublic();
    this.backPeriods = 0;
    this.orientedConstitute = "";
    this.componentCalculation = 0;
    this.assignmentSunday = null;
    this.unexhaustedStimulate = new java.util.LinkedList<ProducedStagecoach>();
    this.properPoke = new java.util.LinkedList<ProducedStagecoach>();
  }

  public seng2200.Cantons previousStatehood = null;
  public java.util.List<Cantons> occurrences = null;
  public int componentCalculation = 0;

  public synchronized void doStayedFarm(seng2200.ProducedStagecoach larboard) {
    this.unexhaustedStimulate.add(larboard);
  }

  public ProducedStagecoach(
      String urgeMake, double hateful, double pasture, Synchronization wednesdays) {
    this.ungenerous = hateful;
    this.chain = pasture;
    this.methodsArticles = null;
    this.r = new java.util.Random();
    this.occurrences = new java.util.LinkedList<Cantons>();
    this.previousStatehood = new seng2200.DevourRepublic();
    this.backPeriods = synX3568int;
    this.orientedConstitute = urgeMake;
    this.componentCalculation = synX3569int;
    this.assignmentSunday = wednesdays;
    this.unexhaustedStimulate = new java.util.LinkedList<ProducedStagecoach>();
    this.properPoke = new java.util.LinkedList<ProducedStagecoach>();
  }

  public abstract double appendageGoods(double typicalJuncture);

  public synchronized double startPlaceCumulativeImpoverish() {
    double millionTime;
    double feedExpiry;
    millionTime = synX3570int;
    feedExpiry = synX3571int;
    for (seng2200.Cantons s : this.occurrences) {
      millionTime += s.takeTimeframe();

      if (s instanceof seng2200.DevourRepublic) {
        feedExpiry += s.takeTimeframe();
      }
    }
    return feedExpiry;
  }

  public double ungenerous = 0.0;
  public seng2200.Synchronization assignmentSunday = null;

  public synchronized double produceAddNowVenture() {
    double amount;
    amount = synX3572int;
    for (seng2200.Cantons s : this.occurrences) {
      amount += s.takeTimeframe();
    }
    return amount;
  }

  public synchronized void fixedStarboardOriented(seng2200.ProducedStagecoach aright) {
    this.properPoke.add(aright);
  }

  public seng2200.Articles methodsArticles = null;
}
