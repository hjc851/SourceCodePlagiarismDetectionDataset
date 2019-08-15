package seng2200;

public class LaterLevel extends seng2200.SupplyArena {
  public seng2200.MainlyStagecoachStored opinion = null;
  public seng2200.ProducedThermostat export = null;

  public LaterLevel(
      String inciteDescribe,
      MainlyStagecoachStored advice,
      double skilled,
      double order,
      ProducedThermostat elbowImmediately,
      Callback saturday) {
    super(inciteDescribe, skilled, order, saturday);
    this.opinion = advice;
    this.export = elbowImmediately;
  }

  public synchronized double outgrowthElement(double formerAmount) {
    double timeframe = 0;

    if (this.thisCantons instanceof seng2200.DieLand) {

      if (this.opinion.isVacant()) {
        timeframe = -1;
      } else {
        this.workToken = this.opinion.empty(formerAmount);
        this.workToken.orderedEnteredChance(formerAmount);
        timeframe = this.computationFarmTime();
        this.thisCantons = new seng2200.LabouringSate();
        this.workloadSaturday.extendHotWorkload(timeframe, this);
      }
    } else {
      timeframe = -1;
    }
    return timeframe;
  }

  public synchronized void finalIngredient(double typicalJuncture) {
    this.incorporatedNationalDus(typicalJuncture);
    this.workToken.arrangeEgressYears(typicalJuncture);
    this.workToken.couponJuncture(this.operatorsPseudonym);
    this.export.extend(this.workToken);

    if (this.opinion.isVacant()) synx37();
    else synx38(typicalJuncture);
  }

  private synchronized void synx37() {
    this.workToken = null;
    this.thisCantons = new seng2200.DieLand();
  }

  private synchronized void synx38(double typicalJuncture) {
    double stays = 0;
    this.workToken = this.opinion.empty(typicalJuncture);
    this.workToken.orderedEnteredChance(typicalJuncture);
    stays = this.computationFarmTime();
    this.thisCantons = new seng2200.LabouringSate();
    this.workloadSaturday.extendHotWorkload(stays, this);
    this.warnLeftoverSpurring(typicalJuncture);
  }
}
