package seng2200;

public class MidyearPoint extends ManufactureRostrum {
  private static final int synX1212int = 0;
  private static final int synX1211int = 1;
  private static final int synX1210int = 1;
  private static final int synX1209int = 1;
  private static final int synX1208int = 1;
  private static final int synX1207int = 0;
  public WithinPresentStore produces;
  public WithinPresentStore advice;

  public MidyearPoint(
      String productivityForename,
      WithinPresentStore stimulus,
      WithinPresentStore amperage,
      double intend,
      double stray,
      Programmer mainsail) {
    super(productivityForename, intend, stray, mainsail);
    this.advice = stimulus;
    this.produces = amperage;
  }

  public synchronized double phaseArticle(double prevalentNow) {
    double term;
    term = synX1207int;

    if (this.afootGovernment instanceof StrangleExpress) {

      if (this.advice.isVacant()) {
        term = -synX1208int;
      } else {
        this.operationDetail = this.advice.bareness(prevalentNow);
        this.operationDetail.putEnteringClock(prevalentNow);
        term = this.aimDigPeriod();
        this.afootGovernment = new OccupiedLand();
        this.careerTonite.combineOtherWorkforce(term, this);
      }
    } else if (this.afootGovernment instanceof DeflectSubmit) {

      if (this.produces.isComplete()) {
        term = -synX1209int;
      } else {
        this.operationDetail.determinedGoingDays(prevalentNow);
        this.operationDetail.pestlePeriod(this.labelPatronymic);
        this.produces.enque(this.operationDetail, prevalentNow);
        this.operationDetail = null;

        if (this.advice.isVacant()) {
          term = -synX1210int;
          this.afootGovernment = new StrangleExpress();
        } else {
          this.operationDetail = this.advice.bareness(prevalentNow);
          this.operationDetail.putEnteringClock(prevalentNow);
          term = this.aimDigPeriod();
          this.careerTonite.combineOtherWorkforce(term, this);
          this.afootGovernment = new OccupiedLand();
        }
      }
    } else {
      term = -synX1211int;
    }
    return term;
  }

  public synchronized void accomplishAspect(double theOpportunity) {
    this.ingSayRough(theOpportunity);

    if (this.produces.isComplete()) synx202();
    else synx203(theOpportunity);
  }

  private synchronized void synx202() {
    this.afootGovernment = new DeflectSubmit();
  }

  private synchronized void synx203(double theOpportunity) {
    this.operationDetail.determinedGoingDays(theOpportunity);
    this.operationDetail.pestlePeriod(this.labelPatronymic);
    this.produces.enque(this.operationDetail, theOpportunity);
    this.apprizeProperPoke(theOpportunity);

    if (this.advice.isVacant()) {
      this.operationDetail = null;
      this.afootGovernment = new StrangleExpress();
    } else {
      double hours;
      hours = synX1212int;
      this.operationDetail = this.advice.bareness(theOpportunity);
      this.operationDetail.putEnteringClock(theOpportunity);
      hours = this.aimDigPeriod();
      this.careerTonite.combineOtherWorkforce(hours, this);
      this.afootGovernment = new OccupiedLand();
      this.warnLeftoverSpurring(theOpportunity);
    }
  }
}
