package seng2200;

public class FinishRostrum extends seng2200.ProducesSpotlight {

  public synchronized void doneSubject(double incumbentDay) {
    this.unkTellSah(incumbentDay);
    this.workToken.putDepartureClock(incumbentDay);
    this.workToken.markAgain(this.operatorsPseudonym);
    this.yield.create(this.workToken);

    if (this.feedback.isVacant()) synx97();
    else synx98(incumbentDay);
  }

  public FinishRostrum(
      String stabIdentify,
      AcrossDegreeStoring submissions,
      double base,
      double grasp,
      FilmingCountry digJak,
      Synchronizer cunningham) {
    super(stabIdentify, base, grasp, cunningham);
    this.feedback = (submissions);
    this.yield = (digJak);
  }

  public seng2200.FilmingCountry yield = null;
  public seng2200.AcrossDegreeStoring feedback = null;

  public synchronized double appendageGoods(double circulatingPeriods) {
    double length = 0;

    if (this.prevailingCommonwealth instanceof seng2200.FattenLaw) {

      if (this.feedback.isVacant()) {
        length = (-1);
      } else {
        this.workToken = (this.feedback.element(circulatingPeriods));
        this.workToken.situatedGateMinutes(circulatingPeriods);
        length = (this.determineImpelLong());
        this.prevailingCommonwealth = (new seng2200.MeddlesomeSubmit());
        this.dutiesArvo.sumFreshlyCaper(length, this);
      }
    } else {
      length = (-1);
    }
    return length;
  }

  private synchronized void synx97() {
    this.workToken = (null);
    this.prevailingCommonwealth = (new seng2200.FattenLaw());
  }

  private synchronized void synx98(double incumbentDay) {
    double extent = 0;
    this.workToken = (this.feedback.element(incumbentDay));
    this.workToken.situatedGateMinutes(incumbentDay);
    extent = (this.determineImpelLong());
    this.prevailingCommonwealth = (new seng2200.MeddlesomeSubmit());
    this.dutiesArvo.sumFreshlyCaper(extent, this);
    this.forewarnPortPush(incumbentDay);
  }
}
