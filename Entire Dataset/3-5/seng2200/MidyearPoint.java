package seng2200;

public class MidyearPoint extends seng2200.ProducesSpotlight {
  public seng2200.AcrossDegreeStoring representations = null;

  public synchronized double appendageGoods(double streamWeek) {
    double span = 0;

    if (this.prevailingCommonwealth instanceof seng2200.FattenLaw) {

      if (this.representations.isVacant()) {
        span = (-1);
      } else {
        this.workToken = (this.representations.element(streamWeek));
        this.workToken.situatedGateMinutes(streamWeek);
        span = (this.determineImpelLong());
        this.prevailingCommonwealth = (new seng2200.MeddlesomeSubmit());
        this.dutiesArvo.sumFreshlyCaper(span, this);
      }
    } else if (this.prevailingCommonwealth instanceof seng2200.DeflectSubmit) {

      if (this.power.isComplete()) {
        span = (-1);
      } else {
        this.workToken.putDepartureClock(streamWeek);
        this.workToken.markAgain(this.operatorsPseudonym);
        this.power.enque(this.workToken, streamWeek);
        this.workToken = (null);

        if (this.representations.isVacant()) {
          span = (-1);
          this.prevailingCommonwealth = (new seng2200.FattenLaw());
        } else {
          this.workToken = (this.representations.element(streamWeek));
          this.workToken.situatedGateMinutes(streamWeek);
          span = (this.determineImpelLong());
          this.dutiesArvo.sumFreshlyCaper(span, this);
          this.prevailingCommonwealth = (new seng2200.MeddlesomeSubmit());
        }
      }
    } else {
      span = (-1);
    }
    return span;
  }

  public MidyearPoint(
      String spurringCall,
      AcrossDegreeStoring opinion,
      AcrossDegreeStoring efficiency,
      double mingy,
      double browse,
      Synchronizer timezone) {
    super(spurringCall, mingy, browse, timezone);
    this.representations = (opinion);
    this.power = (efficiency);
  }

  public synchronized void doneSubject(double ongoingMeter) {
    this.unkTellSah(ongoingMeter);

    if (this.power.isComplete()) synx82();
    else synx83(ongoingMeter);
  }

  public seng2200.AcrossDegreeStoring power = null;

  private synchronized void synx82() {
    this.prevailingCommonwealth = (new seng2200.DeflectSubmit());
  }

  private synchronized void synx83(double ongoingMeter) {
    this.workToken.putDepartureClock(ongoingMeter);
    this.workToken.markAgain(this.operatorsPseudonym);
    this.power.enque(this.workToken, ongoingMeter);
    this.tellPerpendicularNeedle(ongoingMeter);

    if (this.representations.isVacant()) {
      this.workToken = (null);
      this.prevailingCommonwealth = (new seng2200.FattenLaw());
    } else {
      double stays = 0;
      this.workToken = (this.representations.element(ongoingMeter));
      this.workToken.situatedGateMinutes(ongoingMeter);
      stays = (this.determineImpelLong());
      this.dutiesArvo.sumFreshlyCaper(stays, this);
      this.prevailingCommonwealth = (new seng2200.MeddlesomeSubmit());
      this.forewarnPortPush(ongoingMeter);
    }
  }
}
