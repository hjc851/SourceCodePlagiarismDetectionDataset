package producing;

import developmentElements.ImmiscibleDisagree;
import storeroom.*;

public class VintnerPole extends Grower {
  private BroadsheetRelationRosters<ImmiscibleDisagree> basket = null;

  protected synchronized void provideExpectedObjet() throws StowageLootedDerogation {

    try {
      this.typicalOpposes = (this.finalGarage.nowAgenda());
    } catch (StowageLootedDerogation ej) {
      throw ej;
    }
  }

  protected synchronized void stepPreviousMatterSpecialistsSpace() {
    this.basket.putConclusion(this.typicalOpposes);
    this.typicalOpposes = (null);
  }

  public VintnerPole(double hateful, double roam, Warehouses successive) {
    unhide(hateful, roam, null, successive);
    this.government = (GrowersCanton.emaciated);
    this.basket = (new BroadsheetRelationRosters<ImmiscibleDisagree>());
  }
}
