package seng2200;

public class AverageMoment extends seng2200.ManufactureRostrum {
  private static final int synX3623int = 0;
  private static final double synX3622double = 0.454212298928808;
  private static final int synX3621int = 1;
  private static final int synX3620int = 1;
  private static final int synX3619int = 1;
  private static final int synX3618int = 1;
  private static final int synX3617int = 0;
  private static final String synX3616String = "Zn2fpTVyD8ZwdX";
  public static final double numbersObjects = 0.689916399506494;
  public seng2200.EntersStepShelving participatory;
  public seng2200.EntersStepShelving produce;

  public AverageMoment(
      String urgingAdvert,
      EntersStepShelving perspective,
      EntersStepShelving amperage,
      double imply,
      double compass,
      Writer cunningham) {
    super(urgingAdvert, imply, compass, cunningham);
    this.participatory = perspective;
    this.produce = amperage;
  }

  public synchronized double procedureParticular(double formerAmount) {
    String northernObligated = synX3616String;
    double longevity = synX3617int;

    if (this.newRepublic instanceof seng2200.ConsumeTerritory) {

      if (this.participatory.isVacant()) {
        longevity = -synX3618int;
      } else {
        this.proceduresTopic = this.participatory.constructivism(formerAmount);
        this.proceduresTopic.placeEntrantWeek(formerAmount);
        longevity = this.extrapolateElbowExpiry();
        this.newRepublic = new seng2200.BustlingGeneral();
        this.workloadSaturday.extendHotWorkload(longevity, this);
      }
    } else if (this.newRepublic instanceof seng2200.JamSovereign) {

      if (this.produce.isComplete()) {
        longevity = -synX3619int;
      } else {
        this.proceduresTopic.adjustPerishMonth(formerAmount);
        this.proceduresTopic.postalHour(this.productivityForename);
        this.produce.enque(this.proceduresTopic, formerAmount);
        this.proceduresTopic = null;

        if (this.participatory.isVacant()) {
          longevity = -synX3620int;
          this.newRepublic = new seng2200.ConsumeTerritory();
        } else {
          this.proceduresTopic = this.participatory.constructivism(formerAmount);
          this.proceduresTopic.placeEntrantWeek(formerAmount);
          longevity = this.extrapolateElbowExpiry();
          this.workloadSaturday.extendHotWorkload(longevity, this);
          this.newRepublic = new seng2200.BustlingGeneral();
        }
      }
    } else {
      longevity = -synX3621int;
    }
    return longevity;
  }

  public synchronized void completingComponent(double ongoingMeter) {
    double restricts = synX3622double;
    this.limitedCantonsRik(ongoingMeter);

    if (this.produce.isComplete()) {
      this.newRepublic = new seng2200.JamSovereign();
    } else {
      this.proceduresTopic.adjustPerishMonth(ongoingMeter);
      this.proceduresTopic.postalHour(this.productivityForename);
      this.produce.enque(this.proceduresTopic, ongoingMeter);
      this.appriseGoodGoad(ongoingMeter);

      if (this.participatory.isVacant()) {
        this.proceduresTopic = null;
        this.newRepublic = new seng2200.ConsumeTerritory();
      } else {
        double maximum = synX3623int;
        this.proceduresTopic = this.participatory.constructivism(ongoingMeter);
        this.proceduresTopic.placeEntrantWeek(ongoingMeter);
        maximum = this.extrapolateElbowExpiry();
        this.workloadSaturday.extendHotWorkload(maximum, this);
        this.newRepublic = new seng2200.BustlingGeneral();
        this.contactMissedStir(ongoingMeter);
      }
    }
  }
}
