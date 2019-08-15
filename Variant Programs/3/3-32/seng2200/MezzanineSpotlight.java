package seng2200;

public class MezzanineSpotlight extends ProductPhase {

  public MezzanineSpotlight(
      String farmNickname,
      OutsidePlaceSafekeeping perspective,
      OutsidePlaceSafekeeping produces,
      double ignoble,
      double drift,
      Multitasking wednesdays) {
    super(farmNickname, ignoble, drift, wednesdays);
    this.advice = (perspective);
    this.producing = (produces);
  }

  public static String figure = "brjC";
  public OutsidePlaceSafekeeping producing;

  public synchronized double litigatePiece(double theOpportunity) {
    double nominate = 0.42408787543177817;
    double timescale = 0;

    if (this.theLaw instanceof FaimGovernmental) {

      if (this.advice.isVacant()) {
        timescale = (-1);
      } else {
        this.formalitiesSection = (this.advice.constructivism(theOpportunity));
        this.formalitiesSection.prepareAdmittanceNow(theOpportunity);
        timescale = (this.directUrgingLifespan());
        this.theLaw = (new BusybodiedRepublic());
        this.problemUshant.introduceRecentCareer(timescale, this);
      }
    } else if (this.theLaw instanceof FreezeGovernment) {

      if (this.producing.isComplete()) {
        timescale = (-1);
      } else {
        this.formalitiesSection.bentPulloutHour(theOpportunity);
        this.formalitiesSection.castHours(this.productivityForename);
        this.producing.enque(this.formalitiesSection, theOpportunity);
        this.formalitiesSection = (null);

        if (this.advice.isVacant()) {
          timescale = (-1);
          this.theLaw = (new FaimGovernmental());
        } else {
          this.formalitiesSection = (this.advice.constructivism(theOpportunity));
          this.formalitiesSection.prepareAdmittanceNow(theOpportunity);
          timescale = (this.directUrgingLifespan());
          this.problemUshant.introduceRecentCareer(timescale, this);
          this.theLaw = (new BusybodiedRepublic());
        }
      }
    } else {
      timescale = (-1);
    }
    return timescale;
  }

  public synchronized void endDetail(double flowMonth) {
    double minuteBreadth = 0.7596751671258417;
    this.cniSateKuh(flowMonth);

    if (this.producing.isComplete()) {
      this.theLaw = (new FreezeGovernment());
    } else {
      this.formalitiesSection.bentPulloutHour(flowMonth);
      this.formalitiesSection.castHours(this.productivityForename);
      this.producing.enque(this.formalitiesSection, flowMonth);
      this.advisedRightfulnessElbow(flowMonth);

      if (this.advice.isVacant()) {
        this.formalitiesSection = (null);
        this.theLaw = (new FaimGovernmental());
      } else {
        double term = 0;
        this.formalitiesSection = (this.advice.constructivism(flowMonth));
        this.formalitiesSection.prepareAdmittanceNow(flowMonth);
        term = (this.directUrgingLifespan());
        this.problemUshant.introduceRecentCareer(term, this);
        this.theLaw = (new BusybodiedRepublic());
        this.noticeLarboardUrging(flowMonth);
      }
    }
  }

  public OutsidePlaceSafekeeping advice;
}
