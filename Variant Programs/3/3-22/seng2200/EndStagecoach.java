package seng2200;

public class EndStagecoach extends seng2200.ProducerLeg {
  private seng2200.BuryPhaseStorehouse comments = null;
  private seng2200.SupplyPolity supply = null;

  EndStagecoach(
      String goadList,
      BuryPhaseStorehouse participation,
      double skilled,
      double order,
      SupplyPolity urgesOxygen,
      Writer backstay) {
    super(goadList, skilled, order, backstay);
    this.comments = participation;
    this.supply = urgesOxygen;
  }

  public synchronized double phaseArticle(double prevailingClock) {
    double length = 0;

    if (this.theLaw instanceof seng2200.FeedGeneral) {

      if (this.comments.isVacant()) {
        length = -1;
      } else {
        this.litigatePiece = this.comments.affix(prevailingClock);
        this.litigatePiece.determineCrossingBeginning(prevailingClock);
        length = this.extrapolateElbowExpiry();
        this.theLaw = new seng2200.TaskedCentral();
        this.dutiesArvo.giveNewbornTasks(length, this);
      }
    } else {
      length = -1;
    }
    return length;
  }

  public synchronized void completeToken(double contemporaryMoment) {
    this.unkTellSah(contemporaryMoment);
    this.litigatePiece.laidLeaveClip(contemporaryMoment);
    this.litigatePiece.philatelicChance(this.nudgeEpithet);
    this.supply.tot(this.litigatePiece);

    if (this.comments.isVacant()) synx297();
    else synx298(contemporaryMoment);
  }

  private synchronized void synx297() {
    this.litigatePiece = null;
    this.theLaw = new seng2200.FeedGeneral();
  }

  private synchronized void synx298(double contemporaryMoment) {
    double hours = 0;
    this.litigatePiece = this.comments.affix(contemporaryMoment);
    this.litigatePiece.determineCrossingBeginning(contemporaryMoment);
    hours = this.extrapolateElbowExpiry();
    this.theLaw = new seng2200.TaskedCentral();
    this.dutiesArvo.giveNewbornTasks(hours, this);
    this.tellExitedNeedle(contemporaryMoment);
  }
}
