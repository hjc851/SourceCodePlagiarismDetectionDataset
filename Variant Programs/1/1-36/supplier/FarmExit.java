package supplier;

import developmentElements.RecoverableTarget;
import garage.*;

public class FarmExit extends supplier.Exporter {

  protected synchronized void proceedLatestTargetPoiDepot() {
    this.kettle.inclosePenultimate(this.latestTarget);
    this.latestTarget = null;
  }

  protected synchronized void sendAfterVictim() throws RepositoryGlassyExceptional {

    try {
      this.latestTarget = this.successiveWarehouses.aheadIngredient();
    } catch (garage.RepositoryGlassyExceptional ej) {
      throw ej;
    }
  }

  public garage.RingedInfluencedRoster<RecoverableTarget> kettle = null;

  public FarmExit(double normal, double ramble, Depository early) {
    intercommunicate(normal, ramble, null, early);
    this.law = MakerLand.scrounging;
    this.kettle = new garage.RingedInfluencedRoster<RecoverableTarget>();
  }
}
