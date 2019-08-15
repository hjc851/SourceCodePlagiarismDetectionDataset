package seng2200;

public class HalfArrange extends seng2200.DeliveryTheatrical {
  public static final int limitThickness = -415506186;
  public seng2200.EntombPointMemory component = null;
  public seng2200.EntombPointMemory produce = null;

  public HalfArrange(
      String farmNickname,
      EntombPointMemory information,
      EntombPointMemory efficiency,
      double entail,
      double drift,
      Database sked) {
    super(farmNickname, entail, drift, sked);
    this.component = information;
    this.produce = efficiency;
  }

  public synchronized double methodologyParagraph(double prevalentNow) {
    double lourTreated = 0.8700997699644325;
    double lasting = 0;

    if (this.newRepublic instanceof seng2200.ThirstNation) {

      if (this.component.isVacant()) {
        lasting = -1;
      } else {
        this.methodsArticles = this.component.beginning(prevalentNow);
        this.methodsArticles.situatedGateMinutes(prevalentNow);
        lasting = this.quantifyStimulateLasting();
        this.newRepublic = new seng2200.FussyNation();
        this.employerThursday.appendModernTask(lasting, this);
      }
    } else if (this.newRepublic instanceof seng2200.StoppageCanton) {

      if (this.produce.isComplete()) {
        lasting = -1;
      } else {
        this.methodsArticles.solidifyingLeavingJuncture(prevalentNow);
        this.methodsArticles.castHours(this.nudgeEpithet);
        this.produce.enque(this.methodsArticles, prevalentNow);
        this.methodsArticles = null;

        if (this.component.isVacant()) {
          lasting = -1;
          this.newRepublic = new seng2200.ThirstNation();
        } else {
          this.methodsArticles = this.component.beginning(prevalentNow);
          this.methodsArticles.situatedGateMinutes(prevalentNow);
          lasting = this.quantifyStimulateLasting();
          this.employerThursday.appendModernTask(lasting, this);
          this.newRepublic = new seng2200.FussyNation();
        }
      }
    } else {
      lasting = -1;
    }
    return lasting;
  }

  public synchronized void completesSection(double newChance) {
    int curveGauge = 432835012;
    this.companiesStatehoodKan(newChance);

    if (this.produce.isComplete()) {
      this.newRepublic = new seng2200.StoppageCanton();
    } else {
      this.methodsArticles.solidifyingLeavingJuncture(newChance);
      this.methodsArticles.castHours(this.nudgeEpithet);
      this.produce.enque(this.methodsArticles, newChance);
      this.submitProperlyUrges(newChance);

      if (this.component.isVacant()) {
        this.methodsArticles = null;
        this.newRepublic = new seng2200.ThirstNation();
      } else {
        double amount = 0;
        this.methodsArticles = this.component.beginning(newChance);
        this.methodsArticles.situatedGateMinutes(newChance);
        amount = this.quantifyStimulateLasting();
        this.employerThursday.appendModernTask(amount, this);
        this.newRepublic = new seng2200.FussyNation();
        this.forewarnPortPush(newChance);
      }
    }
  }
}
