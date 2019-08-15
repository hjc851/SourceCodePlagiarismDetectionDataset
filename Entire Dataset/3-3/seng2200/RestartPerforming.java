package seng2200;

public class RestartPerforming extends ProcessingScale {
  public AmongstMomentCache outturn = null;

  public RestartPerforming(
      String productivityForename,
      AmongstMomentCache volume,
      double imply,
      double chain,
      Database wednesdays) {
    super(productivityForename, imply, chain, wednesdays);
    this.outturn = (volume);
  }

  public synchronized double serveConsignment(double underwayYear) {
    double extent = 0;

    if (this.existingSovereign instanceof DepriveSay) {
      extent = (this.computedPushMaximum());
      this.proceedingIssue = (new Aspect());
      this.proceedingIssue.prepareAdmittanceNow(underwayYear);
      this.existingSovereign = (new CongestedCanton());
      this.occupationsSpinnaker.appendModernTask(extent, this);
      this.somethingNumeration += (1);
    } else if (this.existingSovereign instanceof LugCentral) {

      if (this.outturn.isComplete()) {
        extent = (-1);
      } else {
        this.proceedingIssue.arrangedGoSentence(underwayYear);
        this.proceedingIssue.eradicateOpportunity(this.farmNickname);
        this.outturn.enque(this.proceedingIssue, underwayYear);
        this.proceedingIssue = (new Aspect());
        this.proceedingIssue.prepareAdmittanceNow(underwayYear);
        extent = (this.computedPushMaximum());
        this.occupationsSpinnaker.appendModernTask(extent, this);
        this.existingSovereign = (new CongestedCanton());
        this.somethingNumeration += (1);
      }
    } else {
      extent = (-1);
    }
    return extent;
  }

  public synchronized void completingComponent(double liveDays) {
    this.aveSubmitTough(liveDays);

    if (this.outturn.isComplete()) synx60();
    else synx61(liveDays);
  }

  private synchronized void synx60() {
    this.existingSovereign = (new LugCentral());
  }

  private synchronized void synx61(double liveDays) {
    this.proceedingIssue.arrangedGoSentence(liveDays);
    this.proceedingIssue.eradicateOpportunity(this.farmNickname);
    this.outturn.enque(this.proceedingIssue, liveDays);
    this.proceedingIssue = (null);
    this.existingSovereign = (new DepriveSay());
    this.discloseExactIncite(liveDays);
  }
}
