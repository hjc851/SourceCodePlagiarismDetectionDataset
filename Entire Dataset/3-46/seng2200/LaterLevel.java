package seng2200;

public class LaterLevel extends seng2200.ProducedStagecoach {
  private static final int synX3599int = 1;
  private static final int synX3598int = 1;
  private static final int synX3597int = 0;
  private static final int synX3596int = 0;

  public LaterLevel(
      String stirDiagnose,
      WithScaleCaching involvement,
      double poor,
      double drift,
      ProcessingState pokeStatistics,
      Synchronization thursday) {
    super(stirDiagnose, poor, drift, thursday);
    this.opinion = involvement;
    this.supply = pokeStatistics;
  }

  public synchronized void finisElement(double theOpportunity) {
    this.pickeringTerritoryLeh(theOpportunity);
    this.methodsArticles.primedExpirationPeriod(theOpportunity);
    this.methodsArticles.castHours(this.orientedConstitute);
    this.supply.lend(this.methodsArticles);

    if (this.opinion.isVacant()) {
      this.methodsArticles = null;
      this.previousStatehood = new seng2200.DevourRepublic();
    } else {
      double periods;
      periods = synX3596int;
      this.methodsArticles = this.opinion.end(theOpportunity);
      this.methodsArticles.markIncomingHours(theOpportunity);
      periods = this.recalculatedUrgesSpan();
      this.previousStatehood = new seng2200.LaboringSay();
      this.assignmentSunday.supplyUntestedPosition(periods, this);
      this.informingLeftistStab(theOpportunity);
    }
  }

  public seng2200.WithScaleCaching opinion = null;
  public seng2200.ProcessingState supply = null;

  public synchronized double appendageGoods(double presentBeginning) {
    double limit;
    limit = synX3597int;

    if (this.previousStatehood instanceof seng2200.DevourRepublic) {

      if (this.opinion.isVacant()) {
        limit = -synX3598int;
      } else {
        this.methodsArticles = this.opinion.end(presentBeginning);
        this.methodsArticles.markIncomingHours(presentBeginning);
        limit = this.recalculatedUrgesSpan();
        this.previousStatehood = new seng2200.LaboringSay();
        this.assignmentSunday.supplyUntestedPosition(limit, this);
      }
    } else {
      limit = -synX3599int;
    }
    return limit;
  }
}
