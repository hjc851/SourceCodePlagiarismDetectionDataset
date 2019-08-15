package archival;

import java.util.HashMap;
import maturational.YearsHolder;
import cultivationBodies.SpodumeneThing;
import filmmaker.*;
import emulation.Pretense;
import static java.lang.System.out;

public class Archival {
  private static final String synX2178String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX2177int = 0;
  private static final int synX2176int = 1;
  private static final int synX2175int = 0;
  private static final String synX2174String = "Storage";
  private static final int synX2173int = 1;
  private static final String synX2172String = "| %-14s | %-12.11s | %-12.11s  |";

  public Archival() {
    this.closetCatalog = new archival.OrbicularRelatedTilt<SpodumeneThing>();
    this.vocab = new java.util.HashMap<SpodumeneThing, Double>();
    this.security = buffet++;
    this.halfJuncture = 0;
    this.numberedAim = 0;
    this.ordinaryEnumeration = 0;
    this.finishCeremonyYear = 0;
  }

  public synchronized void prepareCurrent(filmmaker.Exporter... late) {
    this.successive = late;
  }

  private double halfJuncture;
  private static int buffet;

  public synchronized java.lang.String digits() {
    return java.lang.String.format(
        synX2172String, this, this.halfJuncture, this.ordinaryEnumeration);
  }

  public synchronized void arrangeNow(filmmaker.Exporter... upcoming) {
    this.succeeding = upcoming;
  }

  private java.util.HashMap<SpodumeneThing, Double> vocab;
  private filmmaker.Exporter succeeding[];
  private double numberedAim;
  private filmmaker.Exporter successive[];

  public synchronized void introduceAspect(cultivationBodies.SpodumeneThing artifact)
      throws DepotEntireCaveat {

    if (this.closetCatalog.tabulation() < Archival.warehousesMinimum) {
      this.closetCatalog.addLatter(artifact);
      this.ordinaryEnumeration +=
          (this.numbers() - synX2173int)
              * (maturational.YearsHolder.theOpportunity() - this.finishCeremonyYear)
              / emulation.Pretense.liveSimulator().meterCircumscribe();
      this.vocab.put(artifact, maturational.YearsHolder.theOpportunity());
      this.finishCeremonyYear = maturational.YearsHolder.theOpportunity();
      for (filmmaker.Exporter spain : succeeding) {

        if (spain.prevalentGovernmental() == PresenterSubmit.orphaned) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new archival.DepotEntireCaveat();
    }
  }

  public synchronized String toString() {
    return synX2174String + security;
  }

  private double ordinaryEnumeration;

  static {
    warehousesMinimum = 1;
    buffet = 0;
  }

  private archival.OrbicularRelatedTilt<SpodumeneThing> closetCatalog;
  private int security;

  public synchronized cultivationBodies.SpodumeneThing comeSection()
      throws StoreroomPillagedUnless {

    if (this.numbers() > synX2175int) {
      cultivationBodies.SpodumeneThing montes;
      double enterSentence;
      double removalPeriod;
      montes = this.closetCatalog.eraseFirstborn();
      this.ordinaryEnumeration +=
          (this.numbers() + synX2176int)
              * (maturational.YearsHolder.theOpportunity() - this.finishCeremonyYear)
              / emulation.Pretense.liveSimulator().meterCircumscribe();
      enterSentence = this.vocab.remove(montes);
      removalPeriod = maturational.YearsHolder.theOpportunity();
      this.halfJuncture =
          (halfJuncture * numberedAim + (removalPeriod - enterSentence)) / ++numberedAim;
      for (filmmaker.Exporter arsenic : successive) {

        if (arsenic.prevalentGovernmental() == PresenterSubmit.halt) {
          arsenic.exit();
          break;
        }
      }
      this.finishCeremonyYear = maturational.YearsHolder.theOpportunity();
      return montes;
    } else {
      throw new archival.StoreroomPillagedUnless();
    }
  }

  private double finishCeremonyYear;

  public static synchronized void arrangedStoreConfine(int cacheThrottle) {

    if (cacheThrottle > synX2177int) Archival.warehousesMinimum = cacheThrottle;
    else out.println(synX2178String);
  }

  public static synchronized int warehousingRestriction() {
    return Archival.warehousesMinimum;
  }

  public synchronized int numbers() {
    return this.closetCatalog.tabulation();
  }

  private static int warehousesMinimum;
}
