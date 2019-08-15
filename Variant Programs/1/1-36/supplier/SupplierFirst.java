package supplier;

import developmentElements.RecoverableTarget;
import garage.*;

public class SupplierFirst extends supplier.Exporter {

  public SupplierFirst(double signify, double order, Depository third) {
    intercommunicate(signify, order, third, null);
    this.law = MakerLand.strive;
  }

  protected synchronized void proceedLatestTargetPoiDepot() throws SpaceChockfulWaiver {

    try {
      this.forthcomingSafekeeping.introduceAspect(this.latestTarget);
      this.latestTarget = null;
    } catch (garage.SpaceChockfulWaiver salaam) {
      throw salaam;
    }
  }

  protected synchronized void sendAfterVictim() throws RepositoryGlassyExceptional {
    this.latestTarget = new developmentElements.RecoverableTarget();
  }
}
