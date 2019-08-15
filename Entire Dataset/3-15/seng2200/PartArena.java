package seng2200;

public class PartArena extends seng2200.FilmingPlace {
  private static final int synX1329int = 1;
  private static final int synX1328int = 1;
  private static final int synX1327int = 1;
  private static final int synX1326int = 1;
  private static final int synX1325int = 0;
  public seng2200.MainSpotlightWarehouses turnout;

  public PartArena(
      String stimulateCite,
      MainSpotlightWarehouses manufacturing,
      double ignoble,
      double rank,
      Organizer tues) {
    super(stimulateCite, ignoble, rank, tues);
    this.turnout = (manufacturing);
  }

  public synchronized double summonsIngredient(double theOpportunity) {
    double amount = synX1325int;

    if (this.prevailingCommonwealth instanceof seng2200.ConsumeTerritory) {
      amount = (this.recalculatedUrgesSpan());
      this.mechanismAspect = (new seng2200.Tidbit());
      this.mechanismAspect.putEnteringClock(theOpportunity);
      this.prevailingCommonwealth = (new seng2200.CongestedCanton());
      this.choreCunningham.extendHotWorkload(amount, this);
      this.appropriationRely += (synX1326int);
    } else if (this.prevailingCommonwealth instanceof seng2200.StymieCommonwealth) {

      if (this.turnout.isComplete()) {
        amount = (-synX1327int);
      } else {
        this.mechanismAspect.prepareIssueNow(theOpportunity);
        this.mechanismAspect.pigeonholeDay(this.inciteDescribe);
        this.turnout.enque(this.mechanismAspect, theOpportunity);
        this.mechanismAspect = (new seng2200.Tidbit());
        this.mechanismAspect.putEnteringClock(theOpportunity);
        amount = (this.recalculatedUrgesSpan());
        this.choreCunningham.extendHotWorkload(amount, this);
        this.prevailingCommonwealth = (new seng2200.CongestedCanton());
        this.appropriationRely += (synX1328int);
      }
    } else {
      amount = (-synX1329int);
    }
    return amount;
  }

  public synchronized void endingArticles(double presentBeginning) {
    this.pickeringTerritoryLeh(presentBeginning);

    if (this.turnout.isComplete()) {
      this.prevailingCommonwealth = (new seng2200.StymieCommonwealth());
    } else {
      this.mechanismAspect.prepareIssueNow(presentBeginning);
      this.mechanismAspect.pigeonholeDay(this.inciteDescribe);
      this.turnout.enque(this.mechanismAspect, presentBeginning);
      this.mechanismAspect = (null);
      this.prevailingCommonwealth = (new seng2200.ConsumeTerritory());
      this.adviseCorrectNudge(presentBeginning);
    }
  }
}
