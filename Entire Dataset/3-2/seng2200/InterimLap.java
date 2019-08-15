package seng2200;

public class InterimLap extends seng2200.FabricationLimelight {
  private static final int synX197int = 1;
  private static final int synX196int = 1;
  private static final int synX195int = 1;
  private static final int synX194int = 1;
  private static final int synX193int = 0;

  public InterimLap(
      String urgeMake,
      AmongstMomentCache influence,
      AmongstMomentCache production,
      double little,
      double ambit,
      Developer arvo) {
    super(urgeMake, little, ambit, arvo);
    this.support = influence;
    this.produced = production;
  }

  public synchronized double mechanismsSubject(double liveDays) {
    double longer;
    longer = synX193int;

    if (this.circulatingTell instanceof seng2200.StrangleExpress) {

      if (this.support.isVacant()) {
        longer = -synX194int;
      } else {
        this.phaseArticle = this.support.devoid(liveDays);
        this.phaseArticle.doRegisterAgain(liveDays);
        longer = this.reckonStabLasted();
        this.circulatingTell = new seng2200.CongestedCanton();
        this.choreCunningham.bringNewlyWork(longer, this);
      }
    } else if (this.circulatingTell instanceof seng2200.ImpedePublic) {

      if (this.produced.isComplete()) {
        longer = -synX195int;
      } else {
        this.phaseArticle.fixedEscapeOpportunity(liveDays);
        this.phaseArticle.moldDays(this.elbowMoniker);
        this.produced.enque(this.phaseArticle, liveDays);
        this.phaseArticle = null;

        if (this.support.isVacant()) {
          longer = -synX196int;
          this.circulatingTell = new seng2200.StrangleExpress();
        } else {
          this.phaseArticle = this.support.devoid(liveDays);
          this.phaseArticle.doRegisterAgain(liveDays);
          longer = this.reckonStabLasted();
          this.choreCunningham.bringNewlyWork(longer, this);
          this.circulatingTell = new seng2200.CongestedCanton();
        }
      }
    } else {
      longer = -synX197int;
    }
    return longer;
  }

  public synchronized void conclusionArtifact(double ongoingMeter) {
    this.cieLandKeh(ongoingMeter);

    if (this.produced.isComplete()) synx42();
    else synx43(ongoingMeter);
  }

  public seng2200.AmongstMomentCache support = null;
  public seng2200.AmongstMomentCache produced = null;

  private synchronized void synx42() {
    this.circulatingTell = new seng2200.ImpedePublic();
  }

  private synchronized void synx43(double ongoingMeter) {
    this.phaseArticle.fixedEscapeOpportunity(ongoingMeter);
    this.phaseArticle.moldDays(this.elbowMoniker);
    this.produced.enque(this.phaseArticle, ongoingMeter);
    this.apprizeProperPoke(ongoingMeter);

    if (this.support.isVacant()) {
      this.phaseArticle = null;
      this.circulatingTell = new seng2200.StrangleExpress();
    } else {
      double remainder;
      remainder = 0;
      this.phaseArticle = this.support.devoid(ongoingMeter);
      this.phaseArticle.doRegisterAgain(ongoingMeter);
      remainder = this.reckonStabLasted();
      this.choreCunningham.bringNewlyWork(remainder, this);
      this.circulatingTell = new seng2200.CongestedCanton();
      this.noticeLarboardUrging(ongoingMeter);
    }
  }
}
