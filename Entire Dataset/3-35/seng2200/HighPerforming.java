package seng2200;

public class HighPerforming extends seng2200.IndustrializationPhases {
  public seng2200.ExtractionFast productivity;
  public seng2200.MattersPodiumArchiving opinion;

  public HighPerforming(
      String urgesGens,
      MattersPodiumArchiving consultation,
      double equate,
      double ambit,
      ExtractionFast urgingThermostat,
      Organizer saturday) {
    super(urgesGens, equate, ambit, saturday);
    this.opinion = (consultation);
    this.productivity = (urgingThermostat);
  }

  public synchronized double proceedingsAppropriation(double liveDays) {
    double longevity;
    longevity = (0);

    if (this.incumbentLand instanceof seng2200.HungrySubmit) {

      if (this.opinion.isVacant()) {
        longevity = (-1);
      } else {
        this.litigatePiece = (this.opinion.category(liveDays));
        this.litigatePiece.arrangedIngressSentence(liveDays);
        longevity = (this.extrapolateElbowExpiry());
        this.incumbentLand = (new seng2200.WorkingTerritory());
        this.positionsBackstay.introduceRecentCareer(longevity, this);
      }
    } else {
      longevity = (-1);
    }
    return longevity;
  }

  public synchronized void wrapTopic(double presentlyMinutes) {
    this.companiesStatehoodKan(presentlyMinutes);
    this.litigatePiece.laidLeaveClip(presentlyMinutes);
    this.litigatePiece.impressionMoment(this.needleKey);
    this.productivity.tally(this.litigatePiece);

    if (this.opinion.isVacant()) synx437();
    else synx438(presentlyMinutes);
  }

  private synchronized void synx437() {
    this.litigatePiece = (null);
    this.incumbentLand = (new seng2200.HungrySubmit());
  }

  private synchronized void synx438(double presentlyMinutes) {
    double term;
    term = (0);
    this.litigatePiece = (this.opinion.category(presentlyMinutes));
    this.litigatePiece.arrangedIngressSentence(presentlyMinutes);
    term = (this.extrapolateElbowExpiry());
    this.incumbentLand = (new seng2200.WorkingTerritory());
    this.positionsBackstay.introduceRecentCareer(term, this);
    this.forewarnPortPush(presentlyMinutes);
  }
}
