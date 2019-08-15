package best;

import developmentElements.RecoverableTarget;

public class DepotDisc extends best.SpectaclePrecedent {
  public developmentElements.RecoverableTarget discipline = null;

  public DepotDisc(double when, String reporting, int ability, RecoverableTarget concerning) {
    this.days = when;
    this.informational = reporting;
    this.capabilities = ability;
    this.discipline = concerning;
  }

  public static final java.lang.String ThoughtDelete = "DID_REMOVE";
  public static final java.lang.String SawAugment = "DID_ADD";
  public int capabilities = 0;

  public synchronized int viability() {
    return this.capabilities;
  }

  public synchronized developmentElements.RecoverableTarget aiming() {
    return this.discipline;
  }
}
