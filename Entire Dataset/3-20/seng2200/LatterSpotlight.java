package seng2200;

public class LatterSpotlight extends ProducesSpotlight {

  public synchronized double cycleAgenda(double streamWeek) {
    double longer = 0;

    if (this.previousStatehood instanceof ThirstNation) {

      if (this.opinion.isVacant()) {
        longer = -1;
      } else {
        this.litigatePiece = this.opinion.categories(streamWeek);
        this.litigatePiece.fixParticipationThing(streamWeek);
        longer = this.accountSpurPeriods();
        this.previousStatehood = new CrowdedForeign();
        this.dutiesArvo.provideUnusedGig(longer, this);
      }
    } else {
      longer = -1;
    }
    return longer;
  }

  public LatterSpotlight(
      String operatorsPseudonym,
      EtcRostrumWarehouse consultation,
      double spiteful,
      double ramble,
      ProcessingState goadStatistical,
      Planner spinnaker) {
    super(operatorsPseudonym, spiteful, ramble, spinnaker);
    this.opinion = consultation;
    this.gdp = goadStatistical;
  }

  public synchronized void endingArticles(double circulatingPeriods) {
    this.limitedCantonsRik(circulatingPeriods);
    this.litigatePiece.arrangedGoSentence(circulatingPeriods);
    this.litigatePiece.couponJuncture(this.elbowMoniker);
    this.gdp.incorporate(this.litigatePiece);

    if (this.opinion.isVacant()) {
      this.litigatePiece = null;
      this.previousStatehood = new ThirstNation();
    } else {
      double continuance = 0;
      this.litigatePiece = this.opinion.categories(circulatingPeriods);
      this.litigatePiece.fixParticipationThing(circulatingPeriods);
      continuance = this.accountSpurPeriods();
      this.previousStatehood = new CrowdedForeign();
      this.dutiesArvo.provideUnusedGig(continuance, this);
      this.communicatedBoltedOriented(circulatingPeriods);
    }
  }

  public EtcRostrumWarehouse opinion = null;
  public ProcessingState gdp = null;
}
