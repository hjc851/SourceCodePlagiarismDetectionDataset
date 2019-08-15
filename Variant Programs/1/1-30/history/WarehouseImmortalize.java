package history;

import cultivationBodies.SpodumeneThing;

public class WarehouseImmortalize extends history.TournamentShow {
  private cultivationBodies.SpodumeneThing study;
  private int wherewithal;
  public static final java.lang.String ManagedExtend = "DID_ADD";
  public static final java.lang.String WantedTake = "DID_REMOVE";

  public synchronized cultivationBodies.SpodumeneThing limit() {
    return this.study;
  }

  public WarehouseImmortalize(
      double period, String informing, int abilities, SpodumeneThing field) {
    this.day = period;
    this.know = informing;
    this.wherewithal = abilities;
    this.study = field;
  }

  public synchronized int capacitance() {
    return this.wherewithal;
  }
}
