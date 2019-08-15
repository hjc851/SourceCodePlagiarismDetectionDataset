package grower;

import extractionTreasures.ExhaustibleBody;
import warehouse.*;

public class OperatorConclude extends grower.Producing {

  protected synchronized void proceedLatestTargetPoiDepot() {
    this.keg.incorporatedGo(this.presentlyItems);
    this.presentlyItems = null;
  }

  private warehouse.BroadsideIntertwinedRanking<ExhaustibleBody> keg;

  public OperatorConclude(double equate, double order, Store preceding) {
    initialize(equate, order, null, preceding);
    this.foreign = PublisherExpress.orphaned;
    this.keg = new warehouse.BroadsideIntertwinedRanking<ExhaustibleBody>();
  }

  protected synchronized void collectNowPurpose() throws ClosetStrippedDispensation {

    try {
      this.presentlyItems = this.preliminaryCloset.futureParticular();
    } catch (warehouse.ClosetStrippedDispensation ye) {
      throw ye;
    }
  }
}
