package seng2200;

public class KickoffTheater extends seng2200.ProduceArrange {
  public seng2200.ParticularLapInventory produce;
  public static final int quantify = 1034815521;

  public KickoffTheater(
      String urgeMake,
      ParticularLapInventory efficiency,
      double small,
      double wander,
      Initialization mainsail) {
    super(urgeMake, small, wander, mainsail);
    this.produce = (efficiency);
  }

  public synchronized double outgrowthElement(double thisThing) {
    int consider;
    double amount;
    consider = (1307457947);
    amount = (0);

    if (this.existingSovereign instanceof seng2200.DehydrateCantons) {
      amount = (this.computedPushMaximum());
      this.serveConsignment = (new seng2200.Point());
      this.serveConsignment.markIncomingHours(thisThing);
      this.existingSovereign = (new seng2200.HecticStatehood());
      this.workforceWindward.augmentRefreshingPositions(amount, this);
      this.consignmentReckon += (1);
    } else if (this.existingSovereign instanceof seng2200.EmbarrassGovernmental) {

      if (this.produce.isComplete()) {
        amount = (-1);
      } else {
        this.serveConsignment.prepareIssueNow(thisThing);
        this.serveConsignment.postageClock(this.orientedConstitute);
        this.produce.enque(this.serveConsignment, thisThing);
        this.serveConsignment = (new seng2200.Point());
        this.serveConsignment.markIncomingHours(thisThing);
        amount = (this.computedPushMaximum());
        this.workforceWindward.augmentRefreshingPositions(amount, this);
        this.existingSovereign = (new seng2200.HecticStatehood());
        this.consignmentReckon += (1);
      }
    } else {
      amount = (-1);
    }
    return amount;
  }

  public synchronized void closePoint(double incumbentDay) {
    double significant;
    significant = (0.2878599292312706);
    this.albLawDee(incumbentDay);

    if (this.produce.isComplete()) {
      this.existingSovereign = (new seng2200.EmbarrassGovernmental());
    } else {
      this.serveConsignment.prepareIssueNow(incumbentDay);
      this.serveConsignment.postageClock(this.orientedConstitute);
      this.produce.enque(this.serveConsignment, incumbentDay);
      this.serveConsignment = (null);
      this.existingSovereign = (new seng2200.DehydrateCantons());
      this.communicatedStarboardOriented(incumbentDay);
    }
  }
}
