package farm;

import producerArtefacts.UseableItem;
import inventory.*;

public class BreederEnds extends farm.Producing {
  private static final double synX535double = 0.3591206925452999;
  private static final double synX534double = 0.8713602210047985;

  public BreederEnds(double base, double ramble, Caching old) {
    initialisation(base, ramble, null, old);
    this.central = (VintnerStatehood.malnourished);
    this.toilet = (new inventory.BillRelatingSelection<UseableItem>());
  }

  public static double topsBeam = 0.09708828720728335;

  protected synchronized void obtainFutureObjective() throws WarehousesGlazedExempted {
    double nominal = synX534double;

    try {
      this.ongoingAim = (this.priorWarehouse.forthcomingAspect());
    } catch (inventory.WarehousesGlazedExempted samad) {
      throw samad;
    }
  }

  private inventory.BillRelatingSelection<UseableItem> toilet = null;

  protected synchronized void impressFlowObjetMouStowage() {
    double netherTied = synX535double;
    this.toilet.incorporatedGo(this.ongoingAim);
    this.ongoingAim = (null);
  }
}
