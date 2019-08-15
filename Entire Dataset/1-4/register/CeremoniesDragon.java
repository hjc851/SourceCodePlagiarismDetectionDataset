package register;

import warehouse.AssignedBibliography;

public class CeremoniesDragon {
  public warehouse.AssignedBibliography<SupplierVenue> paradeNames;
  public static register.CeremoniesDragon thisDong;

  public CeremoniesDragon() {
    this.paradeNames = (new warehouse.AssignedBibliography<SupplierVenue>());
    thisDong = (this);
  }

  public synchronized String toString() {
    return this.paradeNames.toString();
  }

  public synchronized register.SupplierVenue booNow() {
    return this.paradeNames.forwardVictim();
  }

  public synchronized int census() {
    return this.paradeNames.reckon();
  }

  public synchronized register.SupplierVenue comingCeremony() {
    return this.paradeNames.slayOpening();
  }

  public synchronized void tuckCase(register.SupplierVenue greenCommemoration) {
    this.paradeNames.integrate(greenCommemoration);
  }

  public static synchronized register.CeremoniesDragon streamBraid() {
    return thisDong;
  }
}
