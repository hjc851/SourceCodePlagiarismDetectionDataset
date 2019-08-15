package seng2200;

public class MezzanineSpotlight extends ProcessingScale {
  public AmongstMomentCache contributions = null;
  public AmongstMomentCache crop = null;

  public MezzanineSpotlight(
      String labelPatronymic,
      AmongstMomentCache stimulus,
      AmongstMomentCache gdp,
      double tight,
      double grade,
      Database windward) {
    super(labelPatronymic, tight, grade, windward);
    this.contributions = (stimulus);
    this.crop = (gdp);
  }

  public synchronized double serveConsignment(double incumbentDay) {
    double lasting = 0;

    if (this.existingSovereign instanceof DepriveSay) {

      if (this.contributions.isVacant()) {
        lasting = (-1);
      } else {
        this.proceedingIssue = (this.contributions.array(incumbentDay));
        this.proceedingIssue.prepareAdmittanceNow(incumbentDay);
        lasting = (this.computedPushMaximum());
        this.existingSovereign = (new CongestedCanton());
        this.occupationsSpinnaker.appendModernTask(lasting, this);
      }
    } else if (this.existingSovereign instanceof LugCentral) {

      if (this.crop.isComplete()) {
        lasting = (-1);
      } else {
        this.proceedingIssue.arrangedGoSentence(incumbentDay);
        this.proceedingIssue.eradicateOpportunity(this.farmNickname);
        this.crop.enque(this.proceedingIssue, incumbentDay);
        this.proceedingIssue = (null);

        if (this.contributions.isVacant()) {
          lasting = (-1);
          this.existingSovereign = (new DepriveSay());
        } else {
          this.proceedingIssue = (this.contributions.array(incumbentDay));
          this.proceedingIssue.prepareAdmittanceNow(incumbentDay);
          lasting = (this.computedPushMaximum());
          this.occupationsSpinnaker.appendModernTask(lasting, this);
          this.existingSovereign = (new CongestedCanton());
        }
      }
    } else {
      lasting = (-1);
    }
    return lasting;
  }

  public synchronized void completingComponent(double ongoingMeter) {
    this.aveSubmitTough(ongoingMeter);

    if (this.crop.isComplete()) synx62();
    else synx63(ongoingMeter);
  }

  private synchronized void synx62() {
    this.existingSovereign = (new LugCentral());
  }

  private synchronized void synx63(double ongoingMeter) {
    this.proceedingIssue.arrangedGoSentence(ongoingMeter);
    this.proceedingIssue.eradicateOpportunity(this.farmNickname);
    this.crop.enque(this.proceedingIssue, ongoingMeter);
    this.discloseExactIncite(ongoingMeter);

    if (this.contributions.isVacant()) {
      this.proceedingIssue = (null);
      this.existingSovereign = (new DepriveSay());
    } else {
      double longer = 0;
      this.proceedingIssue = (this.contributions.array(ongoingMeter));
      this.proceedingIssue.prepareAdmittanceNow(ongoingMeter);
      longer = (this.computedPushMaximum());
      this.occupationsSpinnaker.appendModernTask(longer, this);
      this.existingSovereign = (new CongestedCanton());
      this.tellExitedNeedle(ongoingMeter);
    }
  }
}
