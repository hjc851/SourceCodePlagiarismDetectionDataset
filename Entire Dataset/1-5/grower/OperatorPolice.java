package grower;

import warehouse.*;

public class OperatorPolice extends grower.Producing {

  public OperatorPolice(double average, double straddle, Store then, Store past) {
    initialize(average, straddle, then, past);
    this.foreign = PublisherExpress.orphaned;
  }

  protected synchronized void proceedLatestTargetPoiDepot() throws StoreroomStuffedUnless {

    try {
      this.soonWarehouses.bringParticular(this.presentlyItems);
      this.presentlyItems = null;
    } catch (warehouse.StoreroomStuffedUnless e) {
      throw e;
    }
  }

  protected synchronized void collectNowPurpose() throws ClosetStrippedDispensation {

    try {
      this.presentlyItems = this.preliminaryCloset.futureParticular();
    } catch (warehouse.ClosetStrippedDispensation e) {
      throw e;
    }
  }
}
