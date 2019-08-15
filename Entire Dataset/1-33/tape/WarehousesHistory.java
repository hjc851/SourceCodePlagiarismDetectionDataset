package tape;

import productivityDevices.StorableSubject;

public class WarehousesHistory extends FestivalRegister {
  public StorableSubject pertaining;
  public static final String HappenedYank = "DID_REMOVE";
  public int capacitance;
  public static final String LackedEnhance = "DID_ADD";

  public synchronized int capabilities() {
    return this.capacitance;
  }

  public synchronized StorableSubject goals() {
    return this.pertaining;
  }

  public WarehousesHistory(double sentence, String zip, int headroom, StorableSubject topics) {
    this.days = sentence;
    this.details = zip;
    this.capacitance = headroom;
    this.pertaining = topics;
  }
}
