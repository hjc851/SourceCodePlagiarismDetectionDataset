package seng2200;

public class SecondaryStep extends seng2200.ProduceArrange {
  public seng2200.ParticularLapInventory volume;
  public seng2200.ParticularLapInventory participation;
  static double vital = 0.702069065524849;

  public SecondaryStep(
      String stirDiagnose,
      ParticularLapInventory involvement,
      ParticularLapInventory gdp,
      double mingy,
      double straddle,
      Initialization sunday) {
    super(stirDiagnose, mingy, straddle, sunday);
    this.participation = (involvement);
    this.volume = (gdp);
  }

  public synchronized double outgrowthElement(double actualSentence) {
    double minn;
    double longevity;
    minn = (0.32069136232586737);
    longevity = (0);

    if (this.existingSovereign instanceof seng2200.DehydrateCantons) {

      if (this.participation.isVacant()) {
        longevity = (-1);
      } else {
        this.serveConsignment = (this.participation.contemplations(actualSentence));
        this.serveConsignment.markIncomingHours(actualSentence);
        longevity = (this.computedPushMaximum());
        this.existingSovereign = (new seng2200.HecticStatehood());
        this.workforceWindward.augmentRefreshingPositions(longevity, this);
      }
    } else if (this.existingSovereign instanceof seng2200.EmbarrassGovernmental) {

      if (this.volume.isComplete()) {
        longevity = (-1);
      } else {
        this.serveConsignment.prepareIssueNow(actualSentence);
        this.serveConsignment.postageClock(this.orientedConstitute);
        this.volume.enque(this.serveConsignment, actualSentence);
        this.serveConsignment = (null);

        if (this.participation.isVacant()) {
          longevity = (-1);
          this.existingSovereign = (new seng2200.DehydrateCantons());
        } else {
          this.serveConsignment = (this.participation.contemplations(actualSentence));
          this.serveConsignment.markIncomingHours(actualSentence);
          longevity = (this.computedPushMaximum());
          this.workforceWindward.augmentRefreshingPositions(longevity, this);
          this.existingSovereign = (new seng2200.HecticStatehood());
        }
      }
    } else {
      longevity = (-1);
    }
    return longevity;
  }

  public synchronized void closePoint(double liveDays) {
    double assess;
    assess = (0.8436695768407125);
    this.albLawDee(liveDays);

    if (this.volume.isComplete()) {
      this.existingSovereign = (new seng2200.EmbarrassGovernmental());
    } else {
      this.serveConsignment.prepareIssueNow(liveDays);
      this.serveConsignment.postageClock(this.orientedConstitute);
      this.volume.enque(this.serveConsignment, liveDays);
      this.communicatedStarboardOriented(liveDays);

      if (this.participation.isVacant()) {
        this.serveConsignment = (null);
        this.existingSovereign = (new seng2200.DehydrateCantons());
      } else {
        double extent;
        extent = (0);
        this.serveConsignment = (this.participation.contemplations(liveDays));
        this.serveConsignment.markIncomingHours(liveDays);
        extent = (this.computedPushMaximum());
        this.workforceWindward.augmentRefreshingPositions(extent, this);
        this.existingSovereign = (new seng2200.HecticStatehood());
        this.appriseNearGoad(liveDays);
      }
    }
  }
}
