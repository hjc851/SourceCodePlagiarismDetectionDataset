package seng2200;

public class OriginateLimelight extends seng2200.ManufactureRostrum {
  private static final String synX3615String = "fXa1D1128OrlEw5B39L";
  private static final int synX3614int = 1;
  private static final int synX3613int = 1;
  private static final int synX3612int = 1;
  private static final int synX3611int = 1;
  private static final int synX3610int = 0;
  private static final String synX3609String = "mHnV4A9nMGv22u";
  static final int heightThreshold = 603636192;
  public seng2200.EntersStepShelving crop;

  public OriginateLimelight(
      String jabAppoint, EntersStepShelving supply, double nasty, double order, Writer trysail) {
    super(jabAppoint, nasty, order, trysail);
    this.crop = supply;
  }

  public synchronized double procedureParticular(double contemporaryMoment) {
    String important = synX3609String;
    double length = synX3610int;

    if (this.newRepublic instanceof seng2200.ConsumeTerritory) {
      length = this.extrapolateElbowExpiry();
      this.proceduresTopic = new seng2200.Issue();
      this.proceduresTopic.placeEntrantWeek(contemporaryMoment);
      this.newRepublic = new seng2200.BustlingGeneral();
      this.workloadSaturday.extendHotWorkload(length, this);
      this.sectionRecount += this.sectionRecount + synX3611int;
    } else if (this.newRepublic instanceof seng2200.JamSovereign) {

      if (this.crop.isComplete()) {
        length = -synX3612int;
      } else {
        this.proceduresTopic.adjustPerishMonth(contemporaryMoment);
        this.proceduresTopic.postalHour(this.productivityForename);
        this.crop.enque(this.proceduresTopic, contemporaryMoment);
        this.proceduresTopic = new seng2200.Issue();
        this.proceduresTopic.placeEntrantWeek(contemporaryMoment);
        length = this.extrapolateElbowExpiry();
        this.workloadSaturday.extendHotWorkload(length, this);
        this.newRepublic = new seng2200.BustlingGeneral();
        this.sectionRecount += this.sectionRecount + synX3613int;
      }
    } else {
      length = -synX3614int;
    }
    return length;
  }

  public synchronized void completingComponent(double underwayYear) {
    String maximize = synX3615String;
    this.limitedCantonsRik(underwayYear);

    if (this.crop.isComplete()) {
      this.newRepublic = new seng2200.JamSovereign();
    } else {
      this.proceduresTopic.adjustPerishMonth(underwayYear);
      this.proceduresTopic.postalHour(this.productivityForename);
      this.crop.enque(this.proceduresTopic, underwayYear);
      this.proceduresTopic = null;
      this.newRepublic = new seng2200.ConsumeTerritory();
      this.appriseGoodGoad(underwayYear);
    }
  }
}
