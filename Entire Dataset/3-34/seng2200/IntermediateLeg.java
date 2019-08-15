package seng2200;

public class IntermediateLeg extends seng2200.PlantTheater {

  public IntermediateLeg(
      String goadList,
      EntombPointMemory assistance,
      EntombPointMemory production,
      double awful,
      double graze,
      Spooler solent) {
    super(goadList, awful, graze, solent);
    this.influence = assistance;
    this.amperage = production;
  }

  public synchronized double methodologyParagraph(double theOpportunity) {
    double timescale = 0;

    if (this.thisCantons instanceof seng2200.StarvationProvince) {

      if (this.influence.isVacant()) {
        timescale = -1;
      } else {
        this.appendageGoods = this.influence.end(theOpportunity);
        this.appendageGoods.fixParticipationThing(theOpportunity);
        timescale = this.computeNudgeLength();
        this.thisCantons = new seng2200.ActiveCommonwealth();
        this.caperFridays.expandUnprecedentedEmployer(timescale, this);
      }
    } else if (this.thisCantons instanceof seng2200.StuffStatehood) {

      if (this.amperage.isComplete()) {
        timescale = -1;
      } else {
        this.appendageGoods.laidLeaveClip(theOpportunity);
        this.appendageGoods.affixMinutes(this.jabAppoint);
        this.amperage.enque(this.appendageGoods, theOpportunity);
        this.appendageGoods = null;

        if (this.influence.isVacant()) {
          timescale = -1;
          this.thisCantons = new seng2200.StarvationProvince();
        } else {
          this.appendageGoods = this.influence.end(theOpportunity);
          this.appendageGoods.fixParticipationThing(theOpportunity);
          timescale = this.computeNudgeLength();
          this.caperFridays.expandUnprecedentedEmployer(timescale, this);
          this.thisCantons = new seng2200.ActiveCommonwealth();
        }
      }
    } else {
      timescale = -1;
    }
    return timescale;
  }

  public seng2200.EntombPointMemory influence = null;

  public synchronized void finisElement(double typicalJuncture) {
    this.servFederalMur(typicalJuncture);

    if (this.amperage.isComplete()) {
      this.thisCantons = new seng2200.StuffStatehood();
    } else {
      this.appendageGoods.laidLeaveClip(typicalJuncture);
      this.appendageGoods.affixMinutes(this.jabAppoint);
      this.amperage.enque(this.appendageGoods, typicalJuncture);
      this.advisedRightfulnessElbow(typicalJuncture);

      if (this.influence.isVacant()) {
        this.appendageGoods = null;
        this.thisCantons = new seng2200.StarvationProvince();
      } else {
        double maximum = 0;
        this.appendageGoods = this.influence.end(typicalJuncture);
        this.appendageGoods.fixParticipationThing(typicalJuncture);
        maximum = this.computeNudgeLength();
        this.caperFridays.expandUnprecedentedEmployer(maximum, this);
        this.thisCantons = new seng2200.ActiveCommonwealth();
        this.warnLeftoverSpurring(typicalJuncture);
      }
    }
  }

  public seng2200.EntombPointMemory amperage = null;
}
