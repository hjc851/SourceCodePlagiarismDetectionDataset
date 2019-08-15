package seng2200;

public class MidnightScale extends seng2200.ExtractionMoment {
  private static final int synX325int = 1;
  private static final int synX324int = 1;
  private static final int synX323int = 1;
  private static final int synX322int = 1;
  private static final int synX321int = 0;
  private static final int synX320int = 0;
  private seng2200.FraInstarArchival stimulation;

  MidnightScale(
      String pushDistinguish,
      FraInstarArchival assistance,
      FraInstarArchival production,
      double meanspirited,
      double wander,
      Callback wednesdays) {
    super(pushDistinguish, meanspirited, wander, wednesdays);
    this.stimulation = (assistance);
    this.export = (production);
  }

  public synchronized void finalIngredient(double continuingAgain) {
    this.cinCountryRum(continuingAgain);

    if (this.export.isComplete()) {
      this.previousStatehood = (new seng2200.ImpedePublic());
    } else {
      this.treatObject.situatedMoveMinutes(continuingAgain);
      this.treatObject.pigeonholeDay(this.goadList);
      this.export.enque(this.treatObject, continuingAgain);
      this.noticesMoralStimulate(continuingAgain);

      if (this.stimulation.isVacant()) {
        this.treatObject = (null);
        this.previousStatehood = (new seng2200.CraveCountry());
      } else {
        double expiry;
        expiry = (synX320int);
        this.treatObject = (this.stimulation.array(continuingAgain));
        this.treatObject.primedLaunchingPeriod(continuingAgain);
        expiry = (this.computedPushMaximum());
        this.careerTonite.combineOtherWorkforce(expiry, this);
        this.previousStatehood = (new seng2200.DoingLaw());
        this.submitDepartedUrges(continuingAgain);
      }
    }
  }

  private seng2200.FraInstarArchival export;

  public synchronized double summonsIngredient(double latestClip) {
    double amount;
    amount = (synX321int);

    if (this.previousStatehood instanceof seng2200.CraveCountry) {

      if (this.stimulation.isVacant()) {
        amount = (-synX322int);
      } else {
        this.treatObject = (this.stimulation.array(latestClip));
        this.treatObject.primedLaunchingPeriod(latestClip);
        amount = (this.computedPushMaximum());
        this.previousStatehood = (new seng2200.DoingLaw());
        this.careerTonite.combineOtherWorkforce(amount, this);
      }
    } else if (this.previousStatehood instanceof seng2200.ImpedePublic) {

      if (this.export.isComplete()) {
        amount = (-synX323int);
      } else {
        this.treatObject.situatedMoveMinutes(latestClip);
        this.treatObject.pigeonholeDay(this.goadList);
        this.export.enque(this.treatObject, latestClip);
        this.treatObject = (null);

        if (this.stimulation.isVacant()) {
          amount = (-synX324int);
          this.previousStatehood = (new seng2200.CraveCountry());
        } else {
          this.treatObject = (this.stimulation.array(latestClip));
          this.treatObject.primedLaunchingPeriod(latestClip);
          amount = (this.computedPushMaximum());
          this.careerTonite.combineOtherWorkforce(amount, this);
          this.previousStatehood = (new seng2200.DoingLaw());
        }
      }
    } else {
      amount = (-synX325int);
    }
    return amount;
  }
}
