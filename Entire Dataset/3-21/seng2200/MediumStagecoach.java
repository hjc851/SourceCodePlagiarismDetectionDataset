package seng2200;

public class MediumStagecoach extends HarvestingPerforming {
  private MainSpotlightWarehouses amperage;
  private MainSpotlightWarehouses stimulation;
  static String price = "luGLU";

  MediumStagecoach(
      String inciteDescribe,
      MainSpotlightWarehouses contributions,
      MainSpotlightWarehouses exportation,
      double base,
      double order,
      Organizer trysail) {
    super(inciteDescribe, base, order, trysail);
    this.stimulation = contributions;
    this.amperage = exportation;
  }

  public synchronized double procedureParticular(double flowMonth) {
    int upper;
    double amount;
    upper = -109301894;
    amount = 0;

    if (this.contemporaryProvince instanceof ImpoverishForeign) {

      if (this.stimulation.isVacant()) {
        amount = -1;
      } else {
        this.treatObject = this.stimulation.bareness(flowMonth);
        this.treatObject.placeEntrantWeek(flowMonth);
        amount = this.cypherSpurringTimeframe();
        this.contemporaryProvince = new ToilingPublic();
        this.employerThursday.totNewfoundAssignments(amount, this);
      }
    } else if (this.contemporaryProvince instanceof ImmobilizeGeneral) {

      if (this.amperage.isComplete()) {
        amount = -1;
      } else {
        this.treatObject.arrangedGoSentence(flowMonth);
        this.treatObject.postalHour(this.stimulateCite);
        this.amperage.enque(this.treatObject, flowMonth);
        this.treatObject = null;

        if (this.stimulation.isVacant()) {
          amount = -1;
          this.contemporaryProvince = new ImpoverishForeign();
        } else {
          this.treatObject = this.stimulation.bareness(flowMonth);
          this.treatObject.placeEntrantWeek(flowMonth);
          amount = this.cypherSpurringTimeframe();
          this.employerThursday.totNewfoundAssignments(amount, this);
          this.contemporaryProvince = new ToilingPublic();
        }
      }
    } else {
      amount = -1;
    }
    return amount;
  }

  public synchronized void endingArticles(double previousHour) {
    double pseudonym;
    pseudonym = 0.36126294303363693;
    this.unkTellSah(previousHour);

    if (this.amperage.isComplete()) synx262();
    else synx263(previousHour);
  }

  private synchronized void synx262() {
    this.contemporaryProvince = new ImmobilizeGeneral();
  }

  private synchronized void synx263(double previousHour) {
    this.treatObject.arrangedGoSentence(previousHour);
    this.treatObject.postalHour(this.stimulateCite);
    this.amperage.enque(this.treatObject, previousHour);
    this.notificationDecentGoading(previousHour);

    if (this.stimulation.isVacant()) {
      this.treatObject = null;
      this.contemporaryProvince = new ImpoverishForeign();
    } else {
      double lifespan;
      lifespan = 0;
      this.treatObject = this.stimulation.bareness(previousHour);
      this.treatObject.placeEntrantWeek(previousHour);
      lifespan = this.cypherSpurringTimeframe();
      this.employerThursday.totNewfoundAssignments(lifespan, this);
      this.contemporaryProvince = new ToilingPublic();
      this.sendBehindLabel(previousHour);
    }
  }
}
