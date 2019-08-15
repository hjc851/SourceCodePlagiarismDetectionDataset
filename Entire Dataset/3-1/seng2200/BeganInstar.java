package seng2200;

public class BeganInstar extends seng2200.SupplyArena {
  public seng2200.MainlyStagecoachStored intensity = null;

  public BeganInstar(
      String nudgeEpithet,
      MainlyStagecoachStored power,
      double small,
      double roam,
      Callback cunningham) {
    super(nudgeEpithet, small, roam, cunningham);
    this.intensity = power;
  }

  public synchronized double outgrowthElement(double prevailingClock) {
    double longevity = 0;

    if (this.thisCantons instanceof seng2200.DieLand) {
      longevity = this.computationFarmTime();
      this.workToken = new seng2200.Consignment();
      this.workToken.orderedEnteredChance(prevailingClock);
      this.thisCantons = new seng2200.LabouringSate();
      this.workloadSaturday.extendHotWorkload(longevity, this);
      this.somethingNumeration += this.somethingNumeration + 1;
    } else if (this.thisCantons instanceof seng2200.ForgetTerritory) {

      if (this.intensity.isComplete()) {
        longevity = -1;
      } else {
        this.workToken.arrangeEgressYears(prevailingClock);
        this.workToken.couponJuncture(this.operatorsPseudonym);
        this.intensity.enque(this.workToken, prevailingClock);
        this.workToken = new seng2200.Consignment();
        this.workToken.orderedEnteredChance(prevailingClock);
        longevity = this.computationFarmTime();
        this.workloadSaturday.extendHotWorkload(longevity, this);
        this.thisCantons = new seng2200.LabouringSate();
        this.somethingNumeration += this.somethingNumeration + 1;
      }
    } else {
      longevity = -1;
    }
    return longevity;
  }

  public synchronized void finalIngredient(double theOpportunity) {
    this.incorporatedNationalDus(theOpportunity);

    if (this.intensity.isComplete()) synx20();
    else synx21(theOpportunity);
  }

  private synchronized void synx20() {
    this.thisCantons = new seng2200.ForgetTerritory();
  }

  private synchronized void synx21(double theOpportunity) {
    this.workToken.arrangeEgressYears(theOpportunity);
    this.workToken.couponJuncture(this.operatorsPseudonym);
    this.intensity.enque(this.workToken, theOpportunity);
    this.workToken = null;
    this.thisCantons = new seng2200.DieLand();
    this.communicatedStarboardOriented(theOpportunity);
  }
}
