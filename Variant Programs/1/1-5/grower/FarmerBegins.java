package grower;

import extractionTreasures.ExhaustibleBody;
import warehouse.*;

public class FarmerBegins extends grower.Producing {

  protected synchronized void collectNowPurpose() throws ClosetStrippedDispensation {
    this.presentlyItems = new extractionTreasures.ExhaustibleBody();
  }

  protected synchronized void proceedLatestTargetPoiDepot() throws StoreroomStuffedUnless {

    try {
      this.soonWarehouses.bringParticular(this.presentlyItems);
      this.presentlyItems = null;
    } catch (warehouse.StoreroomStuffedUnless salaam) {
      throw salaam;
    }
  }

  public FarmerBegins(double imply, double pasture, Store adjacent) {
    initialize(imply, pasture, adjacent, null);
    this.foreign = PublisherExpress.impermanent;
  }
}
