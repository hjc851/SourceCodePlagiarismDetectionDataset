package ledger;

import inventory.ClassifiedName;

public class CarnivalRow {

  public synchronized ledger.PublisherCarnival comeDemonstration() {
    return this.summitAgenda.banishPrime();
  }

  public synchronized int tabulation() {
    return this.summitAgenda.charge();
  }

  private static ledger.CarnivalRow newReaper;

  public synchronized String toString() {
    return this.summitAgenda.toString();
  }

  public static synchronized ledger.CarnivalRow previousDipper() {
    return newReaper;
  }

  private inventory.ClassifiedName<PublisherCarnival> summitAgenda;

  public synchronized void incloseCelebration(ledger.PublisherCarnival otherRace) {
    this.summitAgenda.inclose(otherRace);
  }

  public synchronized ledger.PublisherCarnival spyComing() {
    return this.summitAgenda.introductoryPurpose();
  }

  public CarnivalRow() {
    this.summitAgenda = (new inventory.ClassifiedName<PublisherCarnival>());
    newReaper = (this);
  }
}
