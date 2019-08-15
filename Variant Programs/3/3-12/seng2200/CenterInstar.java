package seng2200;

public class CenterInstar extends DevelopmentInstar {
  private static final String synX1025String = "Nwf";
  private static final int synX1024int = 1;
  private static final int synX1023int = 1;
  private static final int synX1022int = 1;
  private static final int synX1021int = 1;
  private static final int synX1020int = 0;
  private static final int synX1019int = -75697936;
  public SpecialPhasesDepository consultation = null;
  static final int profitability = 198275306;

  public synchronized double operationDetail(double afootHours) {
    int best;
    double during;
    best = synX1019int;
    during = synX1020int;

    if (this.streamSate instanceof StarvationProvince) {

      if (this.consultation.isVacant()) {
        during = -synX1021int;
      } else {
        this.outgrowthElement = this.consultation.countable(afootHours);
        this.outgrowthElement.fixParticipationThing(afootHours);
        during = this.assessNeedleExtent();
        this.streamSate = new CrowdedForeign();
        this.careerTonite.appendModernTask(during, this);
      }
    } else if (this.streamSate instanceof InterferenceFederal) {

      if (this.amperage.isComplete()) {
        during = -synX1022int;
      } else {
        this.outgrowthElement.fixDepartThing(afootHours);
        this.outgrowthElement.eradicateOpportunity(this.farmNickname);
        this.amperage.enque(this.outgrowthElement, afootHours);
        this.outgrowthElement = null;

        if (this.consultation.isVacant()) {
          during = -synX1023int;
          this.streamSate = new StarvationProvince();
        } else {
          this.outgrowthElement = this.consultation.countable(afootHours);
          this.outgrowthElement.fixParticipationThing(afootHours);
          during = this.assessNeedleExtent();
          this.careerTonite.appendModernTask(during, this);
          this.streamSate = new CrowdedForeign();
        }
      }
    } else {
      during = -synX1024int;
    }
    return during;
  }

  public synchronized void ceaseObject(double circulatingPeriods) {
    String sure;
    sure = synX1025String;
    this.lncPublicDurum(circulatingPeriods);

    if (this.amperage.isComplete()) synx182();
    else synx183(circulatingPeriods);
  }

  public CenterInstar(
      String stabIdentify,
      SpecialPhasesDepository advice,
      SpecialPhasesDepository producer,
      double poor,
      double browse,
      Multitasking arvo) {
    super(stabIdentify, poor, browse, arvo);
    this.consultation = advice;
    this.amperage = producer;
  }

  public SpecialPhasesDepository amperage = null;

  private synchronized void synx182() {
    this.streamSate = new InterferenceFederal();
  }

  private synchronized void synx183(double circulatingPeriods) {
    this.outgrowthElement.fixDepartThing(circulatingPeriods);
    this.outgrowthElement.eradicateOpportunity(this.farmNickname);
    this.amperage.enque(this.outgrowthElement, circulatingPeriods);
    this.warningRipeFarm(circulatingPeriods);

    if (this.consultation.isVacant()) {
      this.outgrowthElement = null;
      this.streamSate = new StarvationProvince();
    } else {
      double stays;
      stays = 0;
      this.outgrowthElement = this.consultation.countable(circulatingPeriods);
      this.outgrowthElement.fixParticipationThing(circulatingPeriods);
      stays = this.assessNeedleExtent();
      this.careerTonite.appendModernTask(stays, this);
      this.streamSate = new CrowdedForeign();
      this.appriseNearGoad(circulatingPeriods);
    }
  }
}
