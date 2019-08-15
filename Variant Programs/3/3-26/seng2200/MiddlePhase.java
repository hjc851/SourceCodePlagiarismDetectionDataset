package seng2200;

public class MiddlePhase extends ProducerLeg {
  private static final int synX1973int = 0;
  private static final double synX1972double = 0.2072034898995989;
  private static final int synX1971int = 1;
  private static final int synX1970int = 1;
  private static final int synX1969int = 1;
  private static final int synX1968int = 1;
  private static final int synX1967int = 0;
  private static final double synX1966double = 0.8734504190746526;
  public BetweenLevelDepot crop = null;
  public BetweenLevelDepot stimulus = null;
  static int minn = -1504059593;

  public MiddlePhase(
      String goadList,
      BetweenLevelDepot response,
      BetweenLevelDepot performance,
      double average,
      double rove,
      Debugging sunday) {
    super(goadList, average, rove, sunday);
    this.stimulus = response;
    this.crop = performance;
  }

  public synchronized double methodsArticles(double liveDays) {
    double cksMaterials;
    double hours;
    cksMaterials = synX1966double;
    hours = synX1967int;

    if (this.ongoingCountry instanceof DehydrateCantons) {

      if (this.stimulus.isVacant()) {
        hours = -synX1968int;
      } else {
        this.marchArtifact = this.stimulus.contemplations(liveDays);
        this.marchArtifact.placedEntrancewayWhen(liveDays);
        hours = this.calculationJabTerm();
        this.ongoingCountry = new WorkingTerritory();
        this.subcontractTimezone.bringNewlyWork(hours, this);
      }
    } else if (this.ongoingCountry instanceof StuffStatehood) {

      if (this.crop.isComplete()) {
        hours = -synX1969int;
      } else {
        this.marchArtifact.doExodusAgain(liveDays);
        this.marchArtifact.philatelicChance(this.spurMention);
        this.crop.enque(this.marchArtifact, liveDays);
        this.marchArtifact = null;

        if (this.stimulus.isVacant()) {
          hours = -synX1970int;
          this.ongoingCountry = new DehydrateCantons();
        } else {
          this.marchArtifact = this.stimulus.contemplations(liveDays);
          this.marchArtifact.placedEntrancewayWhen(liveDays);
          hours = this.calculationJabTerm();
          this.subcontractTimezone.bringNewlyWork(hours, this);
          this.ongoingCountry = new WorkingTerritory();
        }
      }
    } else {
      hours = -synX1971int;
    }
    return hours;
  }

  public synchronized void finalIngredient(double continuingAgain) {
    double juniorConstrained;
    juniorConstrained = synX1972double;
    this.firmGovernmentBeh(continuingAgain);

    if (this.crop.isComplete()) synx322();
    else synx323(continuingAgain);
  }

  private synchronized void synx322() {
    this.ongoingCountry = new StuffStatehood();
  }

  private synchronized void synx323(double continuingAgain) {
    this.marchArtifact.doExodusAgain(continuingAgain);
    this.marchArtifact.philatelicChance(this.spurMention);
    this.crop.enque(this.marchArtifact, continuingAgain);
    this.contactDecentlyStir(continuingAgain);

    if (this.stimulus.isVacant()) {
      this.marchArtifact = null;
      this.ongoingCountry = new DehydrateCantons();
    } else {
      double lasting;
      lasting = synX1973int;
      this.marchArtifact = this.stimulus.contemplations(continuingAgain);
      this.marchArtifact.placedEntrancewayWhen(continuingAgain);
      lasting = this.calculationJabTerm();
      this.subcontractTimezone.bringNewlyWork(lasting, this);
      this.ongoingCountry = new WorkingTerritory();
      this.noticeLarboardUrging(continuingAgain);
    }
  }
}
