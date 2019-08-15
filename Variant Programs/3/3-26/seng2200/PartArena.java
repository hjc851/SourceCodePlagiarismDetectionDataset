package seng2200;

public class PartArena extends ProducerLeg {
  private static final int synX1965int = 1673709072;
  private static final int synX1964int = 1;
  private static final int synX1963int = 1;
  private static final int synX1962int = 1;
  private static final int synX1961int = 1;
  private static final int synX1960int = 0;
  private static final int synX1959int = 1524626622;
  public BetweenLevelDepot quantity = null;
  static String momentsEdge = "lrFh4MGDT";

  public PartArena(
      String operatorsPseudonym,
      BetweenLevelDepot efficiency,
      double meanspirited,
      double browse,
      Debugging windward) {
    super(operatorsPseudonym, meanspirited, browse, windward);
    this.quantity = efficiency;
  }

  public synchronized double methodsArticles(double underwayYear) {
    int lessMagnitude;
    double lasts;
    lessMagnitude = synX1959int;
    lasts = synX1960int;

    if (this.ongoingCountry instanceof DehydrateCantons) {
      lasts = this.calculationJabTerm();
      this.marchArtifact = new Goods();
      this.marchArtifact.placedEntrancewayWhen(underwayYear);
      this.ongoingCountry = new WorkingTerritory();
      this.subcontractTimezone.bringNewlyWork(lasts, this);
      this.sectionRecount += synX1961int;
    } else if (this.ongoingCountry instanceof StuffStatehood) {

      if (this.quantity.isComplete()) {
        lasts = -synX1962int;
      } else {
        this.marchArtifact.doExodusAgain(underwayYear);
        this.marchArtifact.philatelicChance(this.spurMention);
        this.quantity.enque(this.marchArtifact, underwayYear);
        this.marchArtifact = new Goods();
        this.marchArtifact.placedEntrancewayWhen(underwayYear);
        lasts = this.calculationJabTerm();
        this.subcontractTimezone.bringNewlyWork(lasts, this);
        this.ongoingCountry = new WorkingTerritory();
        this.sectionRecount += synX1963int;
      }
    } else {
      lasts = -synX1964int;
    }
    return lasts;
  }

  public synchronized void finalIngredient(double theOpportunity) {
    int bottomCompelled;
    bottomCompelled = synX1965int;
    this.firmGovernmentBeh(theOpportunity);

    if (this.quantity.isComplete()) synx320();
    else synx321(theOpportunity);
  }

  private synchronized void synx320() {
    this.ongoingCountry = new StuffStatehood();
  }

  private synchronized void synx321(double theOpportunity) {
    this.marchArtifact.doExodusAgain(theOpportunity);
    this.marchArtifact.philatelicChance(this.spurMention);
    this.quantity.enque(this.marchArtifact, theOpportunity);
    this.marchArtifact = null;
    this.ongoingCountry = new DehydrateCantons();
    this.contactDecentlyStir(theOpportunity);
  }
}
