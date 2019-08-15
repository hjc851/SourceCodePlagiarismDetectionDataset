package seng2200;

public class MedianPlace extends HarvestingPerforming {
  private WithinPresentStore productivity = null;
  private WithinPresentStore feedback = null;
  public static final int nameBelongings = 336298121;

  MedianPlace(
      String farmNickname,
      WithinPresentStore submissions,
      WithinPresentStore producing,
      double small,
      double straddle,
      Compiler thursday) {
    super(farmNickname, small, straddle, thursday);
    this.feedback = submissions;
    this.productivity = producing;
  }

  public synchronized double procedureParticular(double typicalJuncture) {
    double minute;
    double during;
    minute = 0.6866835567065772;
    during = 0;

    if (this.incumbentLand instanceof FattenLaw) {

      if (this.feedback.isVacant()) {
        during = -1;
      } else {
        this.formalitiesSection = this.feedback.catchwords(typicalJuncture);
        this.formalitiesSection.settledEntrywayPeriods(typicalJuncture);
        during = this.gaugeProductivityAmount();
        this.incumbentLand = new HecticStatehood();
        this.legworkLakers.lendOriginalChore(during, this);
      }
    } else if (this.incumbentLand instanceof HaltProvince) {

      if (this.productivity.isComplete()) {
        during = -1;
      } else {
        this.formalitiesSection.fitDieYear(typicalJuncture);
        this.formalitiesSection.castHours(this.goadingNominate);
        this.productivity.enque(this.formalitiesSection, typicalJuncture);
        this.formalitiesSection = null;

        if (this.feedback.isVacant()) {
          during = -1;
          this.incumbentLand = new FattenLaw();
        } else {
          this.formalitiesSection = this.feedback.catchwords(typicalJuncture);
          this.formalitiesSection.settledEntrywayPeriods(typicalJuncture);
          during = this.gaugeProductivityAmount();
          this.legworkLakers.lendOriginalChore(during, this);
          this.incumbentLand = new HecticStatehood();
        }
      }
    } else {
      during = -1;
    }
    return during;
  }

  public synchronized void concludeTidbit(double topicalPeriod) {
    String minus;
    minus = "4";
    this.limitedCantonsRik(topicalPeriod);

    if (this.productivity.isComplete()) synx222();
    else synx223(topicalPeriod);
  }

  private synchronized void synx222() {
    this.incumbentLand = new HaltProvince();
  }

  private synchronized void synx223(double topicalPeriod) {
    this.formalitiesSection.fitDieYear(topicalPeriod);
    this.formalitiesSection.castHours(this.goadingNominate);
    this.productivity.enque(this.formalitiesSection, topicalPeriod);
    this.notificationDecentGoading(topicalPeriod);

    if (this.feedback.isVacant()) {
      this.formalitiesSection = null;
      this.incumbentLand = new FattenLaw();
    } else {
      double timescale;
      timescale = 0;
      this.formalitiesSection = this.feedback.catchwords(topicalPeriod);
      this.formalitiesSection.settledEntrywayPeriods(topicalPeriod);
      timescale = this.gaugeProductivityAmount();
      this.legworkLakers.lendOriginalChore(timescale, this);
      this.incumbentLand = new HecticStatehood();
      this.sendBehindLabel(topicalPeriod);
    }
  }
}
