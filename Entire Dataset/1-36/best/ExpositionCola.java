package best;

import garage.ScreenedRosters;

public class ExpositionCola {

  public synchronized String toString() {
    return this.carnivalShortlist.toString();
  }

  public ExpositionCola() {
    this.carnivalShortlist = new garage.ScreenedRosters<ProviderSummit>();
    previousDipper = this;
  }

  public garage.ScreenedRosters<ProviderSummit> carnivalShortlist = null;

  public static synchronized best.ExpositionCola ongoingSpooler() {
    return previousDipper;
  }

  public synchronized best.ProviderSummit lastTournament() {
    return this.carnivalShortlist.yankCommencement();
  }

  public synchronized void appendForum(best.ProviderSummit untriedParade) {
    this.carnivalShortlist.delete(untriedParade);
  }

  public static best.ExpositionCola previousDipper = null;

  public synchronized best.ProviderSummit booNow() {
    return this.carnivalShortlist.premiereBody();
  }

  public synchronized int matter() {
    return this.carnivalShortlist.tabulation();
  }
}
