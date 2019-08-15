package performance;

import manufactureOrnaments.NeocomianElement;

public class ArchivingPlatter extends RallyHigh {
  public int efficiency;

  public ArchivingPlatter(
      double amount, String reporting, int authority, NeocomianElement require) {
    this.beginning = amount;
    this.tip = reporting;
    this.efficiency = authority;
    this.matter = require;
  }

  public static final String WentDispatch = "DID_REMOVE";

  public synchronized NeocomianElement reach() {
    return this.matter;
  }

  public NeocomianElement matter;

  public synchronized int volume() {
    return this.efficiency;
  }

  public static final String LikedProvide = "DID_ADD";
}
