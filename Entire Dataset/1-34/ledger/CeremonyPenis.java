package ledger;

import safekeeping.OrganizedSelection;

public class CeremonyPenis {

  public synchronized int total() {
    return this.spectacleRegistry.numeration();
  }

  public static CeremonyPenis prevailingWaiting = null;

  public CeremonyPenis() {
    this.spectacleRegistry = new OrganizedSelection<FarmExposition>();
    prevailingWaiting = this;
  }

  public synchronized FarmExposition nowRace() {
    return this.spectacleRegistry.dispatchMaiden();
  }

  public synchronized FarmExposition glintClose() {
    return this.spectacleRegistry.foremostPreclude();
  }

  public synchronized String toString() {
    return this.spectacleRegistry.toString();
  }

  public synchronized void embedCarnival(FarmExposition newlyCase) {
    this.spectacleRegistry.embed(newlyCase);
  }

  public static synchronized CeremonyPenis newReaper() {
    return prevailingWaiting;
  }

  public OrganizedSelection<FarmExposition> spectacleRegistry = null;
}
