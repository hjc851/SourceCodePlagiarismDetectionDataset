package seng2200;

public class SeniorStep extends seng2200.PlantTheater {
  public seng2200.EntombPointMemory support = null;

  public SeniorStep(
      String farmNickname,
      EntombPointMemory feedback,
      double intend,
      double grasp,
      ProducersQuick inciteFast,
      Spooler kts) {
    super(farmNickname, intend, grasp, kts);
    this.support = feedback;
    this.supply = inciteFast;
  }

  public seng2200.ProducersQuick supply = null;

  public synchronized double methodologyParagraph(double continuingAgain) {
    double span = 0;

    if (this.thisCantons instanceof seng2200.StarvationProvince) {

      if (this.support.isVacant()) {
        span = -1;
      } else {
        this.appendageGoods = this.support.end(continuingAgain);
        this.appendageGoods.fixParticipationThing(continuingAgain);
        span = this.computeNudgeLength();
        this.thisCantons = new seng2200.ActiveCommonwealth();
        this.caperFridays.expandUnprecedentedEmployer(span, this);
      }
    } else {
      span = -1;
    }
    return span;
  }

  public synchronized void finisElement(double incumbentDay) {
    this.servFederalMur(incumbentDay);
    this.appendageGoods.laidLeaveClip(incumbentDay);
    this.appendageGoods.affixMinutes(this.jabAppoint);
    this.supply.inject(this.appendageGoods);

    if (this.support.isVacant()) {
      this.appendageGoods = null;
      this.thisCantons = new seng2200.StarvationProvince();
    } else {
      double timeframe = 0;
      this.appendageGoods = this.support.end(incumbentDay);
      this.appendageGoods.fixParticipationThing(incumbentDay);
      timeframe = this.computeNudgeLength();
      this.thisCantons = new seng2200.ActiveCommonwealth();
      this.caperFridays.expandUnprecedentedEmployer(timeframe, this);
      this.warnLeftoverSpurring(incumbentDay);
    }
  }
}
