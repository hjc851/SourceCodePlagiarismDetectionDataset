package seng2200;

public class HighPerforming extends ProcessingScale {
  public AmongstMomentCache feedback = null;
  public ThroughputCoeff supply = null;

  public HighPerforming(
      String stabIdentify,
      AmongstMomentCache opinions,
      double little,
      double rove,
      ThroughputCoeff productivityOffense,
      Database arvo) {
    super(stabIdentify, little, rove, arvo);
    this.feedback = (opinions);
    this.supply = (productivityOffense);
  }

  public synchronized double serveConsignment(double rifeWhen) {
    double timescale = 0;

    if (this.existingSovereign instanceof DepriveSay) {

      if (this.feedback.isVacant()) {
        timescale = (-1);
      } else {
        this.proceedingIssue = (this.feedback.array(rifeWhen));
        this.proceedingIssue.prepareAdmittanceNow(rifeWhen);
        timescale = (this.computedPushMaximum());
        this.existingSovereign = (new CongestedCanton());
        this.occupationsSpinnaker.appendModernTask(timescale, this);
      }
    } else {
      timescale = (-1);
    }
    return timescale;
  }

  public synchronized void completingComponent(double theOpportunity) {
    this.aveSubmitTough(theOpportunity);
    this.proceedingIssue.arrangedGoSentence(theOpportunity);
    this.proceedingIssue.eradicateOpportunity(this.farmNickname);
    this.supply.create(this.proceedingIssue);

    if (this.feedback.isVacant()) synx77();
    else synx78(theOpportunity);
  }

  private synchronized void synx77() {
    this.proceedingIssue = (null);
    this.existingSovereign = (new DepriveSay());
  }

  private synchronized void synx78(double theOpportunity) {
    double hours = 0;
    this.proceedingIssue = (this.feedback.array(theOpportunity));
    this.proceedingIssue.prepareAdmittanceNow(theOpportunity);
    hours = (this.computedPushMaximum());
    this.existingSovereign = (new CongestedCanton());
    this.occupationsSpinnaker.appendModernTask(hours, this);
    this.tellExitedNeedle(theOpportunity);
  }
}
