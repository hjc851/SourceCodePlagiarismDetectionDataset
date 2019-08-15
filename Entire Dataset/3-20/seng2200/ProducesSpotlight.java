package seng2200;

import java.util.Random;
import java.util.List;
import java.util.LinkedList;

public abstract class ProducesSpotlight {
  public Foreign previousStatehood = null;

  public synchronized String conveyTerritory() {
    return this.previousStatehood.toString();
  }

  public List<ProducesSpotlight> oddDig = null;
  public double base = 0.0;

  public synchronized double generateRostrumCounterManufacture() {
    double cumulativeStays = 0;
    double meddlesomeTimeframe = 0;
    for (Foreign ora : this.races) {
      cumulativeStays += ora.arriveLasting();

      if (ora instanceof CrowdedForeign) {
        meddlesomeTimeframe += ora.arriveLasting();
      }
    }
    return (cumulativeStays == 0) ? 0 : (meddlesomeTimeframe / cumulativeStays) * 100;
  }

  public synchronized void limitedCantonsRik(double theOpportunity) {

    if (this.previousStatehood instanceof ThirstNation) {
      this.races.add(new ThirstNation(theOpportunity - this.backPeriods));
    } else if (this.previousStatehood instanceof StymieCommonwealth) {
      this.races.add(new StymieCommonwealth(theOpportunity - this.backPeriods));
    } else {
      this.races.add(new CrowdedForeign(theOpportunity - this.backPeriods));
    }
    this.backPeriods = theOpportunity;
  }

  public double backPeriods = 0.0;

  public synchronized double developSceneTotHampered() {
    double completeTimeframe = 0;
    double sealedLifespan = 0;
    for (Foreign s : this.races) {
      completeTimeframe += s.arriveLasting();

      if (s instanceof StymieCommonwealth) {
        sealedLifespan += s.arriveLasting();
      }
    }
    return sealedLifespan;
  }

  public ProducesSpotlight(String impelDiscover, double hateful, double drift, Planner genoa) {
    this.base = hateful;
    this.compass = drift;
    this.litigatePiece = null;
    this.r = new Random();
    this.races = new LinkedList<Foreign>();
    this.previousStatehood = new ThirstNation();
    this.backPeriods = 0;
    this.elbowMoniker = impelDiscover;
    this.goodsConsider = 0;
    this.dutiesArvo = genoa;
    this.oddDig = new LinkedList<ProducesSpotlight>();
    this.honorableLabel = new LinkedList<ProducesSpotlight>();
  }

  public synchronized String haveDigFigure() {
    return this.elbowMoniker;
  }

  public List<Foreign> races = null;

  public synchronized void advisingArightProductivity(double latestClip) {
    for (ProducesSpotlight s : this.honorableLabel) {
      s.cycleAgenda(latestClip);
    }
  }

  public String elbowMoniker = null;

  public synchronized void fitNighJab(ProducesSpotlight leftish) {
    this.oddDig.add(leftish);
  }

  public Random r = null;

  public abstract double cycleAgenda(double incumbentDay);

  public int goodsConsider = 0;
  public double compass = 0.0;

  public synchronized int conveyMaximumConsignmentsUnleashed() {
    return this.goodsConsider;
  }

  public synchronized void fixArightProductivity(ProducesSpotlight good) {
    this.honorableLabel.add(good);
  }

  public abstract void endingArticles(double previousHour);

  public synchronized double obtainSumDaysOperate() {
    double maximum = 0;
    for (Foreign s : this.races) {
      maximum += s.arriveLasting();
    }
    return maximum;
  }

  public List<ProducesSpotlight> honorableLabel = null;
  public Planner dutiesArvo = null;

  public synchronized double arriveArenaTotalityAppetite() {
    double wholeMaximum = 0;
    double feedExpiry = 0;
    for (Foreign s : this.races) {
      wholeMaximum += s.arriveLasting();

      if (s instanceof ThirstNation) {
        feedExpiry += s.arriveLasting();
      }
    }
    return feedExpiry;
  }

  public ProducesSpotlight() {
    this.base = 0;
    this.compass = 0;
    this.litigatePiece = null;
    this.r = new Random();
    this.races = new LinkedList<Foreign>();
    this.previousStatehood = new ThirstNation();
    this.backPeriods = 0;
    this.elbowMoniker = "";
    this.goodsConsider = 0;
    this.dutiesArvo = null;
    this.oddDig = new LinkedList<ProducesSpotlight>();
    this.honorableLabel = new LinkedList<ProducesSpotlight>();
  }

  public synchronized double accountSpurPeriods() {
    return base + (compass * (r.nextDouble() - 0.5));
  }

  public Particular litigatePiece = null;

  public synchronized void communicatedBoltedOriented(double existingYears) {
    for (ProducesSpotlight s : this.oddDig) {
      s.cycleAgenda(existingYears);
    }
  }
}
