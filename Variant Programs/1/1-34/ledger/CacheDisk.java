package ledger;

import extractionTreasures.ImmiscibleDisagree;

public class CacheDisk extends CaseBest {
  public ImmiscibleDisagree content = null;

  public synchronized ImmiscibleDisagree goals() {
    return this.content;
  }

  public int wherewithal = 0;
  public static final String AskedTally = "DID_ADD";

  public CacheDisk(double minutes, String zip, int viability, ImmiscibleDisagree topics) {
    this.sentence = minutes;
    this.stuff = zip;
    this.wherewithal = viability;
    this.content = topics;
  }

  public static final String SeemedMurder = "DID_REMOVE";

  public synchronized int load() {
    return this.wherewithal;
  }
}
