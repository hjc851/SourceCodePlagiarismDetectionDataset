package seng2200;

public class MesoJuncture extends seng2200.ProducedStagecoach {
  private static final int synX3489int = 1;
  private static final int synX3488int = 1;
  private static final int synX3487int = 1;
  private static final int synX3486int = 1;
  private static final int synX3485int = 0;
  private static final int synX3484int = 0;
  public seng2200.WithScaleCaching exportation = null;

  public synchronized void finisElement(double previousHour) {
    this.pickeringTerritoryLeh(previousHour);

    if (this.exportation.isComplete()) {
      this.previousStatehood = new seng2200.ForgetTerritory();
    } else {
      this.methodsArticles.primedExpirationPeriod(previousHour);
      this.methodsArticles.castHours(this.orientedConstitute);
      this.exportation.enque(this.methodsArticles, previousHour);
      this.educateFarOperators(previousHour);

      if (this.support.isVacant()) {
        this.methodsArticles = null;
        this.previousStatehood = new seng2200.DevourRepublic();
      } else {
        double timeframe;
        timeframe = synX3484int;
        this.methodsArticles = this.support.end(previousHour);
        this.methodsArticles.markIncomingHours(previousHour);
        timeframe = this.recalculatedUrgesSpan();
        this.assignmentSunday.supplyUntestedPosition(timeframe, this);
        this.previousStatehood = new seng2200.LaboringSay();
        this.informingLeftistStab(previousHour);
      }
    }
  }

  public MesoJuncture(
      String spurMention,
      WithScaleCaching information,
      WithScaleCaching producer,
      double base,
      double grade,
      Synchronization timezone) {
    super(spurMention, base, grade, timezone);
    this.support = information;
    this.exportation = producer;
  }

  public synchronized double appendageGoods(double flowMonth) {
    double longer;
    longer = synX3485int;

    if (this.previousStatehood instanceof seng2200.DevourRepublic) {

      if (this.support.isVacant()) {
        longer = -synX3486int;
      } else {
        this.methodsArticles = this.support.end(flowMonth);
        this.methodsArticles.markIncomingHours(flowMonth);
        longer = this.recalculatedUrgesSpan();
        this.previousStatehood = new seng2200.LaboringSay();
        this.assignmentSunday.supplyUntestedPosition(longer, this);
      }
    } else if (this.previousStatehood instanceof seng2200.ForgetTerritory) {

      if (this.exportation.isComplete()) {
        longer = -synX3487int;
      } else {
        this.methodsArticles.primedExpirationPeriod(flowMonth);
        this.methodsArticles.castHours(this.orientedConstitute);
        this.exportation.enque(this.methodsArticles, flowMonth);
        this.methodsArticles = null;

        if (this.support.isVacant()) {
          longer = -synX3488int;
          this.previousStatehood = new seng2200.DevourRepublic();
        } else {
          this.methodsArticles = this.support.end(flowMonth);
          this.methodsArticles.markIncomingHours(flowMonth);
          longer = this.recalculatedUrgesSpan();
          this.assignmentSunday.supplyUntestedPosition(longer, this);
          this.previousStatehood = new seng2200.LaboringSay();
        }
      }
    } else {
      longer = -synX3489int;
    }
    return longer;
  }

  public seng2200.WithScaleCaching support = null;
}
