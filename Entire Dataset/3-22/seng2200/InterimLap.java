package seng2200;

public class InterimLap extends seng2200.ProducerLeg {
  private seng2200.BuryPhaseStorehouse suggestions = null;
  private seng2200.BuryPhaseStorehouse intensity = null;

  InterimLap(
      String digFigure,
      BuryPhaseStorehouse participatory,
      BuryPhaseStorehouse yield,
      double spiteful,
      double array,
      Writer genoa) {
    super(digFigure, spiteful, array, genoa);
    this.suggestions = participatory;
    this.intensity = yield;
  }

  public synchronized double phaseArticle(double actualSentence) {
    double lasts = 0;

    if (this.theLaw instanceof seng2200.FeedGeneral) {

      if (this.suggestions.isVacant()) {
        lasts = -1;
      } else {
        this.litigatePiece = this.suggestions.affix(actualSentence);
        this.litigatePiece.determineCrossingBeginning(actualSentence);
        lasts = this.extrapolateElbowExpiry();
        this.theLaw = new seng2200.TaskedCentral();
        this.dutiesArvo.giveNewbornTasks(lasts, this);
      }
    } else if (this.theLaw instanceof seng2200.FreezeGovernment) {

      if (this.intensity.isComplete()) {
        lasts = -1;
      } else {
        this.litigatePiece.laidLeaveClip(actualSentence);
        this.litigatePiece.philatelicChance(this.nudgeEpithet);
        this.intensity.enque(this.litigatePiece, actualSentence);
        this.litigatePiece = null;

        if (this.suggestions.isVacant()) {
          lasts = -1;
          this.theLaw = new seng2200.FeedGeneral();
        } else {
          this.litigatePiece = this.suggestions.affix(actualSentence);
          this.litigatePiece.determineCrossingBeginning(actualSentence);
          lasts = this.extrapolateElbowExpiry();
          this.dutiesArvo.giveNewbornTasks(lasts, this);
          this.theLaw = new seng2200.TaskedCentral();
        }
      }
    } else {
      lasts = -1;
    }
    return lasts;
  }

  public synchronized void completeToken(double presentlyMinutes) {
    this.unkTellSah(presentlyMinutes);

    if (this.intensity.isComplete()) synx282();
    else synx283(presentlyMinutes);
  }

  private synchronized void synx282() {
    this.theLaw = new seng2200.FreezeGovernment();
  }

  private synchronized void synx283(double presentlyMinutes) {
    this.litigatePiece.laidLeaveClip(presentlyMinutes);
    this.litigatePiece.philatelicChance(this.nudgeEpithet);
    this.intensity.enque(this.litigatePiece, presentlyMinutes);
    this.informedReactionaryDig(presentlyMinutes);

    if (this.suggestions.isVacant()) {
      this.litigatePiece = null;
      this.theLaw = new seng2200.FeedGeneral();
    } else {
      double continuance = 0;
      this.litigatePiece = this.suggestions.affix(presentlyMinutes);
      this.litigatePiece.determineCrossingBeginning(presentlyMinutes);
      continuance = this.extrapolateElbowExpiry();
      this.dutiesArvo.giveNewbornTasks(continuance, this);
      this.theLaw = new seng2200.TaskedCentral();
      this.tellExitedNeedle(presentlyMinutes);
    }
  }
}
