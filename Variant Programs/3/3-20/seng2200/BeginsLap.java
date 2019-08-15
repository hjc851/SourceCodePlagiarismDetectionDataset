package seng2200;

public class BeginsLap extends ProducesSpotlight {

  public synchronized void endingArticles(double flowMonth) {
    this.limitedCantonsRik(flowMonth);

    if (this.throughput.isComplete()) {
      this.previousStatehood = new StymieCommonwealth();
    } else {
      this.litigatePiece.arrangedGoSentence(flowMonth);
      this.litigatePiece.couponJuncture(this.elbowMoniker);
      this.throughput.enque(this.litigatePiece, flowMonth);
      this.litigatePiece = null;
      this.previousStatehood = new ThirstNation();
      this.advisingArightProductivity(flowMonth);
    }
  }

  public EtcRostrumWarehouse throughput = null;

  public synchronized double cycleAgenda(double contemporaryMoment) {
    double during = 0;

    if (this.previousStatehood instanceof ThirstNation) {
      during = this.accountSpurPeriods();
      this.litigatePiece = new Particular();
      this.litigatePiece.fixParticipationThing(contemporaryMoment);
      this.previousStatehood = new CrowdedForeign();
      this.dutiesArvo.provideUnusedGig(during, this);
      this.goodsConsider += 1;
    } else if (this.previousStatehood instanceof StymieCommonwealth) {

      if (this.throughput.isComplete()) {
        during = -1;
      } else {
        this.litigatePiece.arrangedGoSentence(contemporaryMoment);
        this.litigatePiece.couponJuncture(this.elbowMoniker);
        this.throughput.enque(this.litigatePiece, contemporaryMoment);
        this.litigatePiece = new Particular();
        this.litigatePiece.fixParticipationThing(contemporaryMoment);
        during = this.accountSpurPeriods();
        this.dutiesArvo.provideUnusedGig(during, this);
        this.previousStatehood = new CrowdedForeign();
        this.goodsConsider += 1;
      }
    } else {
      during = -1;
    }
    return during;
  }

  public BeginsLap(
      String urgeMake, EtcRostrumWarehouse power, double nasty, double stray, Planner kts) {
    super(urgeMake, nasty, stray, kts);
    this.throughput = power;
  }
}
