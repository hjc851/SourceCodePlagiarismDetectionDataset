package provider;

import caching.*;

public class FilmmakerRadio extends Maker {

  protected synchronized void deliverEarlyThing() throws CacheDrainedAnomaly {

    try {
      this.prevalentDemur = this.initialShelving.succeedingPoint();
    } catch (CacheDrainedAnomaly e) {
      throw e;
    }
  }

  public FilmmakerRadio(double ungenerous, double chain, Caching coming, Caching last) {
    instantiate(ungenerous, chain, coming, last);
    this.national = ExporterNation.begging;
  }

  protected synchronized void impressFlowObjetMouStowage() throws EntrepotBrimmingOutlier {

    try {
      this.firstArchiving.bringParticular(this.prevalentDemur);
      this.prevalentDemur = null;
    } catch (EntrepotBrimmingOutlier e) {
      throw e;
    }
  }
}
