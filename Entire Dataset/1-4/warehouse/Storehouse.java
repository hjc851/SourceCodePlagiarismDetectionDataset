package warehouse;

import java.util.HashMap;
import euphonious.AgainOfficer;
import developmentElements.PhyllosilicatePreclude;
import fabricator.*;
import scenario.Emulation;
import static java.lang.System.out;

public class Storehouse {
  public static int safekeepingCurb = 1;

  public static synchronized int stowageRestricting() {
    return Storehouse.safekeepingCurb;
  }

  public synchronized void placeSoon(fabricator.Output... the) {
    this.last = (the);
  }

  public synchronized int numeration() {
    return this.warehousesDirectory.enumeration();
  }

  public synchronized void bentOriginal(fabricator.Output... prior) {
    this.pre = (prior);
  }

  public double intermediateDays;

  public synchronized java.lang.String statistical() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.intermediateDays, this.halfRely);
  }

  public double accruedBodies;
  public fabricator.Output pre[];

  public synchronized developmentElements.PhyllosilicatePreclude followingDetail()
      throws WarehouseOpenDeviation {

    if (this.numeration() > 0) {
      developmentElements.PhyllosilicatePreclude hamatum =
          this.warehousesDirectory.transferInaugural();
      this.halfRely +=
          (this.halfRely
              + (this.numeration() + 1)
                  * (euphonious.AgainOfficer.continuingAgain() - this.concludingSeminarMonth)
                  / scenario.Emulation.actualPretending().againRestricted());
      double introduceClip = this.thesaurus.remove(hamatum);
      double absentMeter = euphonious.AgainOfficer.continuingAgain();
      this.intermediateDays =
          ((intermediateDays * accruedBodies + (absentMeter - introduceClip)) / ++accruedBodies);
      for (fabricator.Output equally : pre) {

        if (equally.prevalentGovernmental() == FarmCentral.halt) {
          equally.unlocking();
          break;
        }
      }
      this.concludingSeminarMonth = (euphonious.AgainOfficer.continuingAgain());
      return hamatum;
    } else {
      throw new warehouse.WarehouseOpenDeviation();
    }
  }

  public synchronized String toString() {
    return "Storage" + map;
  }

  public warehouse.ThrowawayLinkageRegistry<PhyllosilicatePreclude> warehousesDirectory;

  public Storehouse() {
    this.warehousesDirectory = (new warehouse.ThrowawayLinkageRegistry<PhyllosilicatePreclude>());
    this.thesaurus = (new java.util.HashMap<PhyllosilicatePreclude, Double>());
    this.map = (foresee++);
    this.intermediateDays = (0);
    this.accruedBodies = (0);
    this.halfRely = (0);
    this.concludingSeminarMonth = (0);
  }

  public double concludingSeminarMonth;
  public double halfRely;
  public java.util.HashMap<PhyllosilicatePreclude, Double> thesaurus;
  public fabricator.Output last[];
  public static int foresee = 0;

  public static synchronized void dictatedMemoryCircumscribe(int depotLimitation) {

    if (depotLimitation > 0) Storehouse.safekeepingCurb = (depotLimitation);
    else out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public int map;

  public synchronized void appendToken(developmentElements.PhyllosilicatePreclude body)
      throws ArchivingBrimfulDistinction {

    if (this.warehousesDirectory.enumeration() < Storehouse.safekeepingCurb) {
      this.warehousesDirectory.infixEnd(body);
      this.halfRely +=
          (this.halfRely
              + (this.numeration() - 1)
                  * (euphonious.AgainOfficer.continuingAgain() - this.concludingSeminarMonth)
                  / scenario.Emulation.actualPretending().againRestricted());
      this.thesaurus.put(body, euphonious.AgainOfficer.continuingAgain());
      this.concludingSeminarMonth = (euphonious.AgainOfficer.continuingAgain());
      for (fabricator.Output arsenic : last) {

        if (arsenic.prevalentGovernmental() == FarmCentral.overfed) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new warehouse.ArchivingBrimfulDistinction();
    }
  }
}
