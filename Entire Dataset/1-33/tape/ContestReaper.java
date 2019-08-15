package tape;

import inventory.ScannedNames;

public class ContestReaper {
  public static ContestReaper rifeRow;

  public synchronized void installCeremonies(CommodityRace untestedCarnival) {
    this.paradeNames.tuck(untestedCarnival);
  }

  public synchronized CommodityRace glimpseSucceeding() {
    return this.paradeNames.forwardVictim();
  }

  public synchronized CommodityRace nowRace() {
    return this.paradeNames.ejectEldest();
  }

  public synchronized String toString() {
    return this.paradeNames.toString();
  }

  public static synchronized ContestReaper underwayPenis() {
    return rifeRow;
  }

  public ScannedNames<CommodityRace> paradeNames;

  public ContestReaper() {
    this.paradeNames = new ScannedNames<CommodityRace>();
    rifeRow = this;
  }

  public synchronized int recount() {
    return this.paradeNames.numeration();
  }
}
