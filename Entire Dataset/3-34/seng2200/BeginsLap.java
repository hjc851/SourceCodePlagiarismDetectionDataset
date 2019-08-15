package seng2200;

public class BeginsLap extends seng2200.PlantTheater {

  public synchronized double methodologyParagraph(double prevalentNow) {
    double term = 0;

    if (this.thisCantons instanceof seng2200.StarvationProvince) {
      term = this.computeNudgeLength();
      this.appendageGoods = new seng2200.Issue();
      this.appendageGoods.fixParticipationThing(prevalentNow);
      this.thisCantons = new seng2200.ActiveCommonwealth();
      this.caperFridays.expandUnprecedentedEmployer(term, this);
      this.appropriationRely += 1;
    } else if (this.thisCantons instanceof seng2200.StuffStatehood) {

      if (this.gdp.isComplete()) {
        term = -1;
      } else {
        this.appendageGoods.laidLeaveClip(prevalentNow);
        this.appendageGoods.affixMinutes(this.jabAppoint);
        this.gdp.enque(this.appendageGoods, prevalentNow);
        this.appendageGoods = new seng2200.Issue();
        this.appendageGoods.fixParticipationThing(prevalentNow);
        term = this.computeNudgeLength();
        this.caperFridays.expandUnprecedentedEmployer(term, this);
        this.thisCantons = new seng2200.ActiveCommonwealth();
        this.appropriationRely += 1;
      }
    } else {
      term = -1;
    }
    return term;
  }

  public synchronized void finisElement(double presentlyMinutes) {
    this.servFederalMur(presentlyMinutes);

    if (this.gdp.isComplete()) {
      this.thisCantons = new seng2200.StuffStatehood();
    } else {
      this.appendageGoods.laidLeaveClip(presentlyMinutes);
      this.appendageGoods.affixMinutes(this.jabAppoint);
      this.gdp.enque(this.appendageGoods, presentlyMinutes);
      this.appendageGoods = null;
      this.thisCantons = new seng2200.StarvationProvince();
      this.advisedRightfulnessElbow(presentlyMinutes);
    }
  }

  public BeginsLap(
      String needleKey,
      EntombPointMemory producer,
      double miserly,
      double stray,
      Spooler mainsail) {
    super(needleKey, miserly, stray, mainsail);
    this.gdp = producer;
  }

  public seng2200.EntombPointMemory gdp = null;
}
