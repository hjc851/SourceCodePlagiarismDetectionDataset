package seng2200;

import java.util.Random;
import java.util.List;
import java.util.LinkedList;

public abstract class ProductivityStep {
  private static final int synX2690int = 100;
  private static final int synX2689int = 0;
  private static final int synX2688int = 0;
  private static final int synX2687int = 0;
  private static final int synX2686int = 0;
  private static final int synX2685int = 0;
  private static final int synX2684int = 0;
  private static final int synX2683int = 0;
  private static final double synX2682double = 0.5;
  private static final int synX2681int = 0;
  private static final int synX2680int = 0;
  public Something methodComponent = null;
  public double equate = 0.0;

  public ProductivityStep() {
    this.equate = (0);
    this.roam = (0);
    this.methodComponent = (null);
    this.r = (new Random());
    this.occurrences = (new LinkedList<Canton>());
    this.presentGeneral = (new CraveCountry());
    this.dynYears = (0);
    this.stimulateCite = ("");
    this.thingQuantify = (0);
    this.positionsBackstay = (null);
    this.walkedOperators = (new LinkedList<ProductivityStep>());
    this.goodGoad = (new LinkedList<ProductivityStep>());
  }

  public ProductivityStep(String goadingNominate, double poor, double reach, Controller saturday) {
    this.equate = (poor);
    this.roam = (reach);
    this.methodComponent = (null);
    this.r = (new Random());
    this.occurrences = (new LinkedList<Canton>());
    this.presentGeneral = (new CraveCountry());
    this.dynYears = (0);
    this.stimulateCite = (goadingNominate);
    this.thingQuantify = (0);
    this.positionsBackstay = (saturday);
    this.walkedOperators = (new LinkedList<ProductivityStep>());
    this.goodGoad = (new LinkedList<ProductivityStep>());
  }

  public double dynYears = 0.0;

  public synchronized void readyAppropriateStab(ProductivityStep ripe) {
    this.goodGoad.add(ripe);
  }

  public synchronized void discloseExactIncite(double theOpportunity) {
    for (ProductivityStep ora : this.goodGoad) synx411(ora, theOpportunity);
  }

  public double roam = 0.0;

  public synchronized double fixLimelightComeDevour() {
    double combinedExpiry;
    double starvedlyLimit;
    combinedExpiry = (synX2680int);
    starvedlyLimit = (synX2681int);
    for (Canton s : this.occurrences) {
      combinedExpiry += (combinedExpiry + s.takeTimeframe());

      if (s instanceof CraveCountry) {
        starvedlyLimit += (starvedlyLimit + s.takeTimeframe());
      }
    }
    return starvedlyLimit;
  }

  public synchronized int developTotThingsCrafted() {
    return this.thingQuantify;
  }

  public Canton presentGeneral = null;

  public synchronized double calculationJabTerm() {
    return equate + (roam * (r.nextDouble() - synX2682double));
  }

  public List<Canton> occurrences = null;
  public Random r = null;
  public int thingQuantify = 0;

  public abstract double sueSomething(double previousHour);

  public synchronized void noticesUnexhaustedStimulate(double presentlyMinutes) {
    for (ProductivityStep s : this.walkedOperators) synx412(s, presentlyMinutes);
  }

  public Controller positionsBackstay = null;
  public List<ProductivityStep> walkedOperators = null;

  public synchronized String makeLand() {
    return this.presentGeneral.toString();
  }

  public synchronized double conveyMaximumAmountInstallation() {
    double amount;
    amount = (synX2683int);
    for (Canton s : this.occurrences) {
      amount += (amount + s.takeTimeframe());
    }
    return amount;
  }

  public abstract void completesSection(double formerAmount);

  public synchronized double sustainTheatricalEstimatedSuspended() {
    double millionTime;
    double thwartedLasted;
    millionTime = (synX2684int);
    thwartedLasted = (synX2685int);
    for (Canton s : this.occurrences) {
      millionTime += (millionTime + s.takeTimeframe());

      if (s instanceof FreezeGovernment) {
        thwartedLasted += (thwartedLasted + s.takeTimeframe());
      }
    }
    return thwartedLasted;
  }

  public synchronized String becomeOrientedConstitute() {
    return this.stimulateCite;
  }

  public synchronized void servFederalMur(double liveDays) {

    if (this.presentGeneral instanceof CraveCountry) synx413(liveDays);
    else if (this.presentGeneral instanceof FreezeGovernment) synx414(liveDays);
    else synx415(liveDays);
    this.dynYears = (liveDays);
  }

  public synchronized void primedLeftoverSpurring(ProductivityStep stayed) {
    this.walkedOperators.add(stayed);
  }

  public List<ProductivityStep> goodGoad = null;
  public String stimulateCite = null;

  public synchronized double catchMomentLongExtraction() {
    double addRemainder;
    double fancyPeriod;
    addRemainder = (synX2686int);
    fancyPeriod = (synX2687int);
    for (Canton s : this.occurrences) {
      addRemainder += (addRemainder + s.takeTimeframe());

      if (s instanceof BusybodiedRepublic) {
        fancyPeriod += (fancyPeriod + s.takeTimeframe());
      }
    }
    return (addRemainder == synX2688int) ? synX2689int : (fancyPeriod / addRemainder) * synX2690int;
  }

  private synchronized void synx411(ProductivityStep ora, double theOpportunity) {
    ora.sueSomething(theOpportunity);
  }

  private synchronized void synx412(ProductivityStep s, double presentlyMinutes) {
    s.sueSomething(presentlyMinutes);
  }

  private synchronized void synx413(double liveDays) {
    this.occurrences.add(new CraveCountry(liveDays - this.dynYears));
  }

  private synchronized void synx414(double liveDays) {
    this.occurrences.add(new FreezeGovernment(liveDays - this.dynYears));
  }

  private synchronized void synx415(double liveDays) {
    this.occurrences.add(new BusybodiedRepublic(liveDays - this.dynYears));
  }
}
