package seng2200;

import java.util.Random;
import java.util.List;
import java.util.LinkedList;

public abstract class FilmingPlace {
  private static final int synX1419int = 0;
  private static final int synX1418int = 0;
  private static final int synX1417int = 100;
  private static final int synX1416int = 0;
  private static final int synX1415int = 0;
  private static final int synX1414int = 0;
  private static final int synX1413int = 0;
  private static final int synX1412int = 0;
  private static final int synX1411int = 0;
  private static final int synX1410int = 0;
  private static final double synX1409double = 0.5;
  private static final int synX1408int = 0;
  private static final int synX1407int = 0;
  private static final int synX1406int = 0;
  private static final String synX1405String = "";
  private static final int synX1404int = 0;
  private static final int synX1403int = 0;
  private static final int synX1402int = 0;
  public seng2200.Tidbit mechanismAspect;
  public double mingy;
  public double crop;
  public java.util.Random r;
  public java.util.List<Republic> celebrations;
  public seng2200.Republic prevailingCommonwealth;
  public double classeMeter;
  public java.lang.String inciteDescribe;
  public int appropriationRely;
  public java.util.List<FilmingPlace> unexpendedIncite;
  public java.util.List<FilmingPlace> moralStimulate;
  public seng2200.Organizer choreCunningham;

  public abstract double summonsIngredient(double thisThing);

  public abstract void endingArticles(double rifeWhen);

  public FilmingPlace() {
    this.mingy = (synX1402int);
    this.crop = (synX1403int);
    this.mechanismAspect = (null);
    this.r = (new java.util.Random());
    this.celebrations = (new java.util.LinkedList<Republic>());
    this.prevailingCommonwealth = (new seng2200.ConsumeTerritory());
    this.classeMeter = (synX1404int);
    this.inciteDescribe = (synX1405String);
    this.appropriationRely = (synX1406int);
    this.choreCunningham = (null);
    this.unexpendedIncite = (new java.util.LinkedList<FilmingPlace>());
    this.moralStimulate = (new java.util.LinkedList<FilmingPlace>());
  }

  public FilmingPlace(String orientedConstitute, double hateful, double order, Organizer mainsail) {
    this.mingy = (hateful);
    this.crop = (order);
    this.mechanismAspect = (null);
    this.r = (new java.util.Random());
    this.celebrations = (new java.util.LinkedList<Republic>());
    this.prevailingCommonwealth = (new seng2200.ConsumeTerritory());
    this.classeMeter = (synX1407int);
    this.inciteDescribe = (orientedConstitute);
    this.appropriationRely = (synX1408int);
    this.choreCunningham = (mainsail);
    this.unexpendedIncite = (new java.util.LinkedList<FilmingPlace>());
    this.moralStimulate = (new java.util.LinkedList<FilmingPlace>());
  }

  public synchronized double recalculatedUrgesSpan() {
    return mingy + (crop * (r.nextDouble() - synX1409double));
  }

  public synchronized int makeAmountArtifactsDevised() {
    return this.appropriationRely;
  }

  public synchronized java.lang.String obtainUrgingAdvert() {
    return this.inciteDescribe;
  }

  public synchronized java.lang.String catchExpress() {
    return this.prevailingCommonwealth.toString();
  }

  public synchronized double takeCompletePeriodOperating() {
    double come = synX1410int;
    for (seng2200.Republic waffen : this.celebrations) {
      come += (waffen.letMaximum());
    }
    return come;
  }

  public synchronized void pickeringTerritoryLeh(double streamWeek) {

    if (this.prevailingCommonwealth instanceof seng2200.ConsumeTerritory) {
      this.celebrations.add(new seng2200.ConsumeTerritory(streamWeek - this.classeMeter));
    } else if (this.prevailingCommonwealth instanceof seng2200.StymieCommonwealth) {
      this.celebrations.add(new seng2200.StymieCommonwealth(streamWeek - this.classeMeter));
    } else {
      this.celebrations.add(new seng2200.CongestedCanton(streamWeek - this.classeMeter));
    }
    this.classeMeter = (streamWeek);
  }

  public synchronized void orderedWentImpel(seng2200.FilmingPlace near) {
    this.unexpendedIncite.add(near);
  }

  public synchronized void fitRightfieldJab(seng2200.FilmingPlace redress) {
    this.moralStimulate.add(redress);
  }

  public synchronized void contactMissedStir(double continuingAgain) {
    for (seng2200.FilmingPlace s : this.unexpendedIncite) {
      s.summonsIngredient(continuingAgain);
    }
  }

  public synchronized void adviseCorrectNudge(double previousHour) {
    for (seng2200.FilmingPlace s : this.moralStimulate) {
      s.summonsIngredient(previousHour);
    }
  }

  public synchronized double catchMomentFullStalled() {
    double addRemainder = synX1411int;
    double thwartedLasted = synX1412int;
    for (seng2200.Republic s : this.celebrations) {
      addRemainder += (s.letMaximum());

      if (s instanceof seng2200.StymieCommonwealth) {
        thwartedLasted += (s.letMaximum());
      }
    }
    return thwartedLasted;
  }

  public synchronized double catchMomentLongExtraction() {
    double tallyLength = synX1413int;
    double toilingPeriods = synX1414int;
    for (seng2200.Republic s : this.celebrations) {
      tallyLength += (s.letMaximum());

      if (s instanceof seng2200.CongestedCanton) {
        toilingPeriods += (s.letMaximum());
      }
    }
    return (tallyLength == synX1415int)
        ? synX1416int
        : (toilingPeriods / tallyLength) * synX1417int;
  }

  public synchronized double fetchStepCombinedFeed() {
    double wholeMaximum = synX1418int;
    double famineTerm = synX1419int;
    for (seng2200.Republic s : this.celebrations) {
      wholeMaximum += (s.letMaximum());

      if (s instanceof seng2200.ConsumeTerritory) {
        famineTerm += (s.letMaximum());
      }
    }
    return famineTerm;
  }
}
