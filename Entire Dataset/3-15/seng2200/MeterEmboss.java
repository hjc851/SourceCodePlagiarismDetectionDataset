package seng2200;

public class MeterEmboss {
  public java.lang.String farmersPlaceSurname;
  public double submission;
  public double withdraw;

  public MeterEmboss() {
    this.farmersPlaceSurname = ("NoName");
    this.submission = (0);
    this.withdraw = (0);
  }

  public MeterEmboss(String goadingNominate, double participationThing, double releasePeriods) {
    this.farmersPlaceSurname = (goadingNominate);
    this.submission = (participationThing);
    this.withdraw = (releasePeriods);
  }

  public synchronized void prepareUrgeScaleMake(java.lang.String list) {
    this.farmersPlaceSurname = (list);
  }

  public synchronized java.lang.String comeGoadLevelList() {
    return this.farmersPlaceSurname;
  }

  public synchronized void arrangeAdmissionYears(double sentence) {
    this.submission = (sentence);
  }

  public synchronized void fitDieYear(double years) {
    this.withdraw = (years);
  }

  public synchronized double obtainLifespan() {
    return this.withdraw - this.submission;
  }
}
