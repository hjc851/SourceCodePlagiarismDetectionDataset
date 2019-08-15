package seng2200;

public class JumpMoment extends seng2200.ProducesSpotlight {

  public JumpMoment(
      String pushDistinguish,
      AcrossDegreeStoring produce,
      double poor,
      double chain,
      Synchronizer lakers) {
    super(pushDistinguish, poor, chain, lakers);
    this.performance = (produce);
  }

  public seng2200.AcrossDegreeStoring performance = null;

  public synchronized void doneSubject(double actualSentence) {
    this.unkTellSah(actualSentence);

    if (this.performance.isComplete()) synx80();
    else synx81(actualSentence);
  }

  public synchronized double appendageGoods(double flowMonth) {
    double expiry = 0;

    if (this.prevailingCommonwealth instanceof seng2200.FattenLaw) {
      expiry = (this.determineImpelLong());
      this.workToken = (new seng2200.Aspect());
      this.workToken.situatedGateMinutes(flowMonth);
      this.prevailingCommonwealth = (new seng2200.MeddlesomeSubmit());
      this.dutiesArvo.sumFreshlyCaper(expiry, this);
      this.ingredientCharge += (this.ingredientCharge + 1);
    } else if (this.prevailingCommonwealth instanceof seng2200.DeflectSubmit) {

      if (this.performance.isComplete()) {
        expiry = (-1);
      } else {
        this.workToken.putDepartureClock(flowMonth);
        this.workToken.markAgain(this.operatorsPseudonym);
        this.performance.enque(this.workToken, flowMonth);
        this.workToken = (new seng2200.Aspect());
        this.workToken.situatedGateMinutes(flowMonth);
        expiry = (this.determineImpelLong());
        this.dutiesArvo.sumFreshlyCaper(expiry, this);
        this.prevailingCommonwealth = (new seng2200.MeddlesomeSubmit());
        this.ingredientCharge += (this.ingredientCharge + 1);
      }
    } else {
      expiry = (-1);
    }
    return expiry;
  }

  private synchronized void synx80() {
    this.prevailingCommonwealth = (new seng2200.DeflectSubmit());
  }

  private synchronized void synx81(double actualSentence) {
    this.workToken.putDepartureClock(actualSentence);
    this.workToken.markAgain(this.operatorsPseudonym);
    this.performance.enque(this.workToken, actualSentence);
    this.workToken = (null);
    this.prevailingCommonwealth = (new seng2200.FattenLaw());
    this.tellPerpendicularNeedle(actualSentence);
  }
}
