package seng2200;

public class LaterLevel extends DevelopmentInstar {
  private static final int synX1191int = -1427064526;
  private static final int synX1190int = 1;
  private static final int synX1189int = 1;
  private static final int synX1188int = 0;
  private static final int synX1187int = 2104324387;

  public LaterLevel(
      String urgesGens,
      SpecialPhasesDepository response,
      double normal,
      double scope,
      CultivationChf urgingThermostat,
      Multitasking sked) {
    super(urgesGens, normal, scope, sked);
    this.involvement = response;
    this.efficiency = urgingThermostat;
  }

  public SpecialPhasesDepository involvement = null;

  public synchronized double operationDetail(double streamWeek) {
    int cost;
    double hours;
    cost = synX1187int;
    hours = synX1188int;

    if (this.streamSate instanceof StarvationProvince) {

      if (this.involvement.isVacant()) {
        hours = -synX1189int;
      } else {
        this.outgrowthElement = this.involvement.countable(streamWeek);
        this.outgrowthElement.fixParticipationThing(streamWeek);
        hours = this.assessNeedleExtent();
        this.streamSate = new CrowdedForeign();
        this.careerTonite.appendModernTask(hours, this);
      }
    } else {
      hours = -synX1190int;
    }
    return hours;
  }

  static final double greatestFatty = 0.9972529628454709;

  public synchronized void ceaseObject(double continuingAgain) {
    int samuelParts;
    samuelParts = synX1191int;
    this.lncPublicDurum(continuingAgain);
    this.outgrowthElement.fixDepartThing(continuingAgain);
    this.outgrowthElement.eradicateOpportunity(this.farmNickname);
    this.efficiency.provide(this.outgrowthElement);

    if (this.involvement.isVacant()) synx197();
    else synx198(continuingAgain);
  }

  public CultivationChf efficiency = null;

  private synchronized void synx197() {
    this.outgrowthElement = null;
    this.streamSate = new StarvationProvince();
  }

  private synchronized void synx198(double continuingAgain) {
    double continuance;
    continuance = 0;
    this.outgrowthElement = this.involvement.countable(continuingAgain);
    this.outgrowthElement.fixParticipationThing(continuingAgain);
    continuance = this.assessNeedleExtent();
    this.streamSate = new CrowdedForeign();
    this.careerTonite.appendModernTask(continuance, this);
    this.appriseNearGoad(continuingAgain);
  }
}
