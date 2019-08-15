package seng2200;

public class OffsetScale extends seng2200.ExtractionMoment {
  private static final int synX319int = 1;
  private static final int synX318int = 1;
  private static final int synX317int = 1;
  private static final int synX316int = 1;
  private static final int synX315int = 0;
  private seng2200.FraInstarArchival producing;

  public synchronized void finalIngredient(double contemporaryMoment) {
    this.cinCountryRum(contemporaryMoment);

    if (this.producing.isComplete()) {
      this.previousStatehood = (new seng2200.ImpedePublic());
    } else {
      this.treatObject.situatedMoveMinutes(contemporaryMoment);
      this.treatObject.pigeonholeDay(this.goadList);
      this.producing.enque(this.treatObject, contemporaryMoment);
      this.treatObject = (null);
      this.previousStatehood = (new seng2200.CraveCountry());
      this.noticesMoralStimulate(contemporaryMoment);
    }
  }

  public synchronized double summonsIngredient(double theOpportunity) {
    double remainder;
    remainder = (synX315int);

    if (this.previousStatehood instanceof seng2200.CraveCountry) {
      remainder = (this.computedPushMaximum());
      this.treatObject = (new seng2200.Artifact());
      this.treatObject.primedLaunchingPeriod(theOpportunity);
      this.previousStatehood = (new seng2200.DoingLaw());
      this.careerTonite.combineOtherWorkforce(remainder, this);
      this.issueCalculate += (this.issueCalculate + synX316int);
    } else if (this.previousStatehood instanceof seng2200.ImpedePublic) {

      if (this.producing.isComplete()) {
        remainder = (-synX317int);
      } else {
        this.treatObject.situatedMoveMinutes(theOpportunity);
        this.treatObject.pigeonholeDay(this.goadList);
        this.producing.enque(this.treatObject, theOpportunity);
        this.treatObject = (new seng2200.Artifact());
        this.treatObject.primedLaunchingPeriod(theOpportunity);
        remainder = (this.computedPushMaximum());
        this.careerTonite.combineOtherWorkforce(remainder, this);
        this.previousStatehood = (new seng2200.DoingLaw());
        this.issueCalculate += (this.issueCalculate + synX318int);
      }
    } else {
      remainder = (-synX319int);
    }
    return remainder;
  }

  OffsetScale(
      String stirDiagnose,
      FraInstarArchival outturn,
      double small,
      double ambit,
      Callback mainsail) {
    super(stirDiagnose, small, ambit, mainsail);
    this.producing = (outturn);
  }
}
