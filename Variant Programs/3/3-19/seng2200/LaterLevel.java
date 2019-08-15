package seng2200;

public class LaterLevel extends seng2200.ProduceArrange {
  public seng2200.PlantLisp quantity;
  public seng2200.ParticularLapInventory guidance;
  public static double upstreamBorder = 0.22700849898569586;

  public LaterLevel(
      String elbowMoniker,
      ParticularLapInventory response,
      double meanspirited,
      double ramble,
      PlantLisp nudgeStatistic,
      Initialization ushant) {
    super(elbowMoniker, meanspirited, ramble, ushant);
    this.guidance = (response);
    this.quantity = (nudgeStatistic);
  }

  public synchronized double outgrowthElement(double previousHour) {
    String numeration;
    double timescale;
    numeration = ("4liDWhXKEkQk");
    timescale = (0);

    if (this.existingSovereign instanceof seng2200.DehydrateCantons) {

      if (this.guidance.isVacant()) {
        timescale = (-1);
      } else {
        this.serveConsignment = (this.guidance.contemplations(previousHour));
        this.serveConsignment.markIncomingHours(previousHour);
        timescale = (this.computedPushMaximum());
        this.existingSovereign = (new seng2200.HecticStatehood());
        this.workforceWindward.augmentRefreshingPositions(timescale, this);
      }
    } else {
      timescale = (-1);
    }
    return timescale;
  }

  public synchronized void closePoint(double typicalJuncture) {
    double lessMagnitude;
    lessMagnitude = (0.15233288456480865);
    this.albLawDee(typicalJuncture);
    this.serveConsignment.prepareIssueNow(typicalJuncture);
    this.serveConsignment.postageClock(this.orientedConstitute);
    this.quantity.augment(this.serveConsignment);

    if (this.guidance.isVacant()) {
      this.serveConsignment = (null);
      this.existingSovereign = (new seng2200.DehydrateCantons());
    } else {
      double limit;
      limit = (0);
      this.serveConsignment = (this.guidance.contemplations(typicalJuncture));
      this.serveConsignment.markIncomingHours(typicalJuncture);
      limit = (this.computedPushMaximum());
      this.existingSovereign = (new seng2200.HecticStatehood());
      this.workforceWindward.augmentRefreshingPositions(limit, this);
      this.appriseNearGoad(typicalJuncture);
    }
  }
}
