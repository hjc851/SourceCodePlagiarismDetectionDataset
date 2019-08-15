package supplier;

import garage.*;

public class PresenterOutpost extends supplier.Exporter {

  public PresenterOutpost(double nasty, double browse, Depository ahead, Depository ago) {
    intercommunicate(nasty, browse, ahead, ago);
    this.law = MakerLand.scrounging;
  }

  protected synchronized void proceedLatestTargetPoiDepot() throws SpaceChockfulWaiver {

    try {
      this.forthcomingSafekeeping.introduceAspect(this.latestTarget);
      this.latestTarget = null;
    } catch (garage.SpaceChockfulWaiver e) {
      throw e;
    }
  }

  protected synchronized void sendAfterVictim() throws RepositoryGlassyExceptional {

    try {
      this.latestTarget = this.successiveWarehouses.aheadIngredient();
    } catch (garage.RepositoryGlassyExceptional e) {
      throw e;
    }
  }
}
