package seng2200;

public class SettingPerforming extends ProducesSpotlight {

  public SettingPerforming(
      String jabAppoint,
      EtcRostrumWarehouse opinions,
      EtcRostrumWarehouse volume,
      double entail,
      double chain,
      Planner headsail) {
    super(jabAppoint, entail, chain, headsail);
    this.advice = opinions;
    this.produced = volume;
  }

  public EtcRostrumWarehouse advice = null;

  public synchronized void endingArticles(double ongoingMeter) {
    this.limitedCantonsRik(ongoingMeter);

    if (this.produced.isComplete()) {
      this.previousStatehood = new StymieCommonwealth();
    } else {
      this.litigatePiece.arrangedGoSentence(ongoingMeter);
      this.litigatePiece.couponJuncture(this.elbowMoniker);
      this.produced.enque(this.litigatePiece, ongoingMeter);
      this.advisingArightProductivity(ongoingMeter);

      if (this.advice.isVacant()) {
        this.litigatePiece = null;
        this.previousStatehood = new ThirstNation();
      } else {
        double span = 0;
        this.litigatePiece = this.advice.categories(ongoingMeter);
        this.litigatePiece.fixParticipationThing(ongoingMeter);
        span = this.accountSpurPeriods();
        this.dutiesArvo.provideUnusedGig(span, this);
        this.previousStatehood = new CrowdedForeign();
        this.communicatedBoltedOriented(ongoingMeter);
      }
    }
  }

  public synchronized double cycleAgenda(double rifeWhen) {
    double lifespan = 0;

    if (this.previousStatehood instanceof ThirstNation) {

      if (this.advice.isVacant()) {
        lifespan = -1;
      } else {
        this.litigatePiece = this.advice.categories(rifeWhen);
        this.litigatePiece.fixParticipationThing(rifeWhen);
        lifespan = this.accountSpurPeriods();
        this.previousStatehood = new CrowdedForeign();
        this.dutiesArvo.provideUnusedGig(lifespan, this);
      }
    } else if (this.previousStatehood instanceof StymieCommonwealth) {

      if (this.produced.isComplete()) {
        lifespan = -1;
      } else {
        this.litigatePiece.arrangedGoSentence(rifeWhen);
        this.litigatePiece.couponJuncture(this.elbowMoniker);
        this.produced.enque(this.litigatePiece, rifeWhen);
        this.litigatePiece = null;

        if (this.advice.isVacant()) {
          lifespan = -1;
          this.previousStatehood = new ThirstNation();
        } else {
          this.litigatePiece = this.advice.categories(rifeWhen);
          this.litigatePiece.fixParticipationThing(rifeWhen);
          lifespan = this.accountSpurPeriods();
          this.dutiesArvo.provideUnusedGig(lifespan, this);
          this.previousStatehood = new CrowdedForeign();
        }
      }
    } else {
      lifespan = -1;
    }
    return lifespan;
  }

  public EtcRostrumWarehouse produced = null;
}
