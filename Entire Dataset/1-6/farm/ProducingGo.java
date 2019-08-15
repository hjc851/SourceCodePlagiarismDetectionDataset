package farm;

import producerArtefacts.UseableItem;
import inventory.*;

public class ProducingGo extends farm.Producing {
  private static final double synX533double = 0.13049990759196683;
  private static final int synX532int = 1453133400;

  protected synchronized void impressFlowObjetMouStowage() throws StoredFilledExemption {
    int heightThreshold = synX532int;

    try {
      this.secondCaching.bringParticular(this.ongoingAim);
      this.ongoingAim = (null);
    } catch (inventory.StoredFilledExemption ye) {
      throw ye;
    }
  }

  protected synchronized void obtainFutureObjective() throws WarehousesGlazedExempted {
    double northRestriction = synX533double;
    this.ongoingAim = (new producerArtefacts.UseableItem());
  }

  public static final double span = 0.5542846884829762;

  public ProducingGo(double awful, double rate, Caching the) {
    initialisation(awful, rate, the, null);
    this.central = (VintnerStatehood.laboring);
  }
}
