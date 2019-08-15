package seng2200;

public class IntermediateLeg extends seng2200.SupplyArena {
  public seng2200.MainlyStagecoachStored opinions = null;
  public seng2200.MainlyStagecoachStored turnout = null;

  public IntermediateLeg(
      String orientedConstitute,
      MainlyStagecoachStored contributions,
      MainlyStagecoachStored yield,
      double tight,
      double chain,
      Callback tonite) {
    super(orientedConstitute, tight, chain, tonite);
    this.opinions = contributions;
    this.turnout = yield;
  }

  public synchronized double outgrowthElement(double actualSentence) {
    double extent = 0;

    if (this.thisCantons instanceof seng2200.DieLand) {

      if (this.opinions.isVacant()) {
        extent = -1;
      } else {
        this.workToken = this.opinions.empty(actualSentence);
        this.workToken.orderedEnteredChance(actualSentence);
        extent = this.computationFarmTime();
        this.thisCantons = new seng2200.LabouringSate();
        this.workloadSaturday.extendHotWorkload(extent, this);
      }
    } else if (this.thisCantons instanceof seng2200.ForgetTerritory) {

      if (this.turnout.isComplete()) {
        extent = -1;
      } else {
        this.workToken.arrangeEgressYears(actualSentence);
        this.workToken.couponJuncture(this.operatorsPseudonym);
        this.turnout.enque(this.workToken, actualSentence);
        this.workToken = null;

        if (this.opinions.isVacant()) {
          extent = -1;
          this.thisCantons = new seng2200.DieLand();
        } else {
          this.workToken = this.opinions.empty(actualSentence);
          this.workToken.orderedEnteredChance(actualSentence);
          extent = this.computationFarmTime();
          this.workloadSaturday.extendHotWorkload(extent, this);
          this.thisCantons = new seng2200.LabouringSate();
        }
      }
    } else {
      extent = -1;
    }
    return extent;
  }

  public synchronized void finalIngredient(double ongoingMeter) {
    this.incorporatedNationalDus(ongoingMeter);

    if (this.turnout.isComplete()) synx22();
    else synx23(ongoingMeter);
  }

  private synchronized void synx22() {
    this.thisCantons = new seng2200.ForgetTerritory();
  }

  private synchronized void synx23(double ongoingMeter) {
    this.workToken.arrangeEgressYears(ongoingMeter);
    this.workToken.couponJuncture(this.operatorsPseudonym);
    this.turnout.enque(this.workToken, ongoingMeter);
    this.communicatedStarboardOriented(ongoingMeter);

    if (this.opinions.isVacant()) {
      this.workToken = null;
      this.thisCantons = new seng2200.DieLand();
    } else {
      double span = 0;
      this.workToken = this.opinions.empty(ongoingMeter);
      this.workToken.orderedEnteredChance(ongoingMeter);
      span = this.computationFarmTime();
      this.workloadSaturday.extendHotWorkload(span, this);
      this.thisCantons = new seng2200.LabouringSate();
      this.warnLeftoverSpurring(ongoingMeter);
    }
  }
}
