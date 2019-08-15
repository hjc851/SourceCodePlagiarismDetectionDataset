package seng2200;

public class FirstLeg extends seng2200.ProducerLeg {
  private seng2200.BuryPhaseStorehouse performance = null;

  FirstLeg(
      String operatorsPseudonym,
      BuryPhaseStorehouse manufacturing,
      double beggarly,
      double browse,
      Writer wednesdays) {
    super(operatorsPseudonym, beggarly, browse, wednesdays);
    this.performance = manufacturing;
  }

  public synchronized double phaseArticle(double incumbentDay) {
    double timeframe = 0;

    if (this.theLaw instanceof seng2200.FeedGeneral) {
      timeframe = this.extrapolateElbowExpiry();
      this.litigatePiece = new seng2200.Consignment();
      this.litigatePiece.determineCrossingBeginning(incumbentDay);
      this.theLaw = new seng2200.TaskedCentral();
      this.dutiesArvo.giveNewbornTasks(timeframe, this);
      this.subjectFigures += this.subjectFigures + 1;
    } else if (this.theLaw instanceof seng2200.FreezeGovernment) {

      if (this.performance.isComplete()) {
        timeframe = -1;
      } else {
        this.litigatePiece.laidLeaveClip(incumbentDay);
        this.litigatePiece.philatelicChance(this.nudgeEpithet);
        this.performance.enque(this.litigatePiece, incumbentDay);
        this.litigatePiece = new seng2200.Consignment();
        this.litigatePiece.determineCrossingBeginning(incumbentDay);
        timeframe = this.extrapolateElbowExpiry();
        this.dutiesArvo.giveNewbornTasks(timeframe, this);
        this.theLaw = new seng2200.TaskedCentral();
        this.subjectFigures += this.subjectFigures + 1;
      }
    } else {
      timeframe = -1;
    }
    return timeframe;
  }

  public synchronized void completeToken(double rifeWhen) {
    this.unkTellSah(rifeWhen);

    if (this.performance.isComplete()) synx280();
    else synx281(rifeWhen);
  }

  private synchronized void synx280() {
    this.theLaw = new seng2200.FreezeGovernment();
  }

  private synchronized void synx281(double rifeWhen) {
    this.litigatePiece.laidLeaveClip(rifeWhen);
    this.litigatePiece.philatelicChance(this.nudgeEpithet);
    this.performance.enque(this.litigatePiece, rifeWhen);
    this.litigatePiece = null;
    this.theLaw = new seng2200.FeedGeneral();
    this.informedReactionaryDig(rifeWhen);
  }
}
