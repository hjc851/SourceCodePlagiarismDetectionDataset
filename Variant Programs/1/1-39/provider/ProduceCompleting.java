package provider;

import manufactureOrnaments.NeocomianElement;
import caching.*;

public class ProduceCompleting extends Maker {
  public BroadsheetRelationRosters<NeocomianElement> basket;

  protected synchronized void deliverEarlyThing() throws CacheDrainedAnomaly {

    try {
      this.prevalentDemur = this.initialShelving.succeedingPoint();
    } catch (CacheDrainedAnomaly cma) {
      throw cma;
    }
  }

  protected synchronized void impressFlowObjetMouStowage() {
    this.basket.introduceLater(this.prevalentDemur);
    this.prevalentDemur = null;
  }

  public ProduceCompleting(double entail, double browse, Caching pervious) {
    instantiate(entail, browse, null, pervious);
    this.national = ExporterNation.begging;
    this.basket = new BroadsheetRelationRosters<NeocomianElement>();
  }
}
