package seng2200;

public class EndStagecoach extends ProducerLeg {
  private static final int synX2136int = 0;
  private static final double synX2135double = 0.7961906989400791;
  private static final int synX2134int = 1;
  private static final int synX2133int = 1;
  private static final int synX2132int = 0;
  private static final String synX2131String = "zey06t8my0d";
  public FilmingCountry intensity = null;
  public BetweenLevelDepot opinion = null;
  public static double tonality = 0.9533416070823194;

  public EndStagecoach(
      String needleKey,
      BetweenLevelDepot suggestions,
      double base,
      double drift,
      FilmingCountry needleStatehood,
      Debugging spinnaker) {
    super(needleKey, base, drift, spinnaker);
    this.opinion = suggestions;
    this.intensity = needleStatehood;
  }

  public synchronized double methodsArticles(double previousHour) {
    String fundamental;
    double span;
    fundamental = synX2131String;
    span = synX2132int;

    if (this.ongoingCountry instanceof DehydrateCantons) {

      if (this.opinion.isVacant()) {
        span = -synX2133int;
      } else {
        this.marchArtifact = this.opinion.contemplations(previousHour);
        this.marchArtifact.placedEntrancewayWhen(previousHour);
        span = this.calculationJabTerm();
        this.ongoingCountry = new WorkingTerritory();
        this.subcontractTimezone.bringNewlyWork(span, this);
      }
    } else {
      span = -synX2134int;
    }
    return span;
  }

  public synchronized void finalIngredient(double circulatingPeriods) {
    double radius;
    radius = synX2135double;
    this.firmGovernmentBeh(circulatingPeriods);
    this.marchArtifact.doExodusAgain(circulatingPeriods);
    this.marchArtifact.philatelicChance(this.spurMention);
    this.intensity.augment(this.marchArtifact);

    if (this.opinion.isVacant()) synx337();
    else synx338(circulatingPeriods);
  }

  private synchronized void synx337() {
    this.marchArtifact = null;
    this.ongoingCountry = new DehydrateCantons();
  }

  private synchronized void synx338(double circulatingPeriods) {
    double term;
    term = synX2136int;
    this.marchArtifact = this.opinion.contemplations(circulatingPeriods);
    this.marchArtifact.placedEntrancewayWhen(circulatingPeriods);
    term = this.calculationJabTerm();
    this.ongoingCountry = new WorkingTerritory();
    this.subcontractTimezone.bringNewlyWork(term, this);
    this.noticeLarboardUrging(circulatingPeriods);
  }
}
