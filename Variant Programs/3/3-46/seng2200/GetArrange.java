package seng2200;

public class GetArrange extends seng2200.ProducedStagecoach {
  private static final int synX3483int = 1;
  private static final int synX3482int = 1;
  private static final int synX3481int = 1;
  private static final int synX3480int = 1;
  private static final int synX3479int = 0;
  public seng2200.WithScaleCaching amperage = null;

  public GetArrange(
      String urgingAdvert,
      WithScaleCaching throughput,
      double little,
      double orbit,
      Synchronization mainsail) {
    super(urgingAdvert, little, orbit, mainsail);
    this.amperage = throughput;
  }

  public synchronized double appendageGoods(double contemporaryMoment) {
    double lasting;
    lasting = synX3479int;

    if (this.previousStatehood instanceof seng2200.DevourRepublic) {
      lasting = this.recalculatedUrgesSpan();
      this.methodsArticles = new seng2200.Articles();
      this.methodsArticles.markIncomingHours(contemporaryMoment);
      this.previousStatehood = new seng2200.LaboringSay();
      this.assignmentSunday.supplyUntestedPosition(lasting, this);
      this.componentCalculation += synX3480int;
    } else if (this.previousStatehood instanceof seng2200.ForgetTerritory) {

      if (this.amperage.isComplete()) {
        lasting = -synX3481int;
      } else {
        this.methodsArticles.primedExpirationPeriod(contemporaryMoment);
        this.methodsArticles.castHours(this.orientedConstitute);
        this.amperage.enque(this.methodsArticles, contemporaryMoment);
        this.methodsArticles = new seng2200.Articles();
        this.methodsArticles.markIncomingHours(contemporaryMoment);
        lasting = this.recalculatedUrgesSpan();
        this.assignmentSunday.supplyUntestedPosition(lasting, this);
        this.previousStatehood = new seng2200.LaboringSay();
        this.componentCalculation += synX3482int;
      }
    } else {
      lasting = -synX3483int;
    }
    return lasting;
  }

  public synchronized void finisElement(double prevalentNow) {
    this.pickeringTerritoryLeh(prevalentNow);

    if (this.amperage.isComplete()) {
      this.previousStatehood = new seng2200.ForgetTerritory();
    } else {
      this.methodsArticles.primedExpirationPeriod(prevalentNow);
      this.methodsArticles.castHours(this.orientedConstitute);
      this.amperage.enque(this.methodsArticles, prevalentNow);
      this.methodsArticles = null;
      this.previousStatehood = new seng2200.DevourRepublic();
      this.educateFarOperators(prevalentNow);
    }
  }
}
