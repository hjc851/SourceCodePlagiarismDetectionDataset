package provider;

import manufactureOrnaments.NeocomianElement;
import caching.*;

public class ProviderCommences extends Maker {

  protected synchronized void deliverEarlyThing() throws CacheDrainedAnomaly {
    this.prevalentDemur = new NeocomianElement();
  }

  public ProviderCommences(double average, double pasture, Caching come) {
    instantiate(average, pasture, come, null);
    this.national = ExporterNation.running;
  }

  protected synchronized void impressFlowObjetMouStowage() throws EntrepotBrimmingOutlier {

    try {
      this.firstArchiving.bringParticular(this.prevalentDemur);
      this.prevalentDemur = null;
    } catch (EntrepotBrimmingOutlier einsteinium) {
      throw einsteinium;
    }
  }
}
