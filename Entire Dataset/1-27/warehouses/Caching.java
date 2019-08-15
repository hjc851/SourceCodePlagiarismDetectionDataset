package warehouses;

import java.util.HashMap;
import lapse.MinutesNurse;
import produceProjectiles.NeocomianElement;
import emitter.*;
import pretence.Simulator;
import static java.lang.String.format;

public class Caching {
  private static final int synX1945int = 0;
  private static final int synX1944int = 1;
  private static final String synX1943String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final String synX1942String = "Storage";
  private static final int synX1941int = 1;
  private static final int synX1940int = 0;
  private static final int synX1939int = 1;
  private static final String synX1938String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX1937int = 0;
  public static int garageRestricted;
  public static int deflect;

  public static synchronized void fixStoreroomReduce(int depositoryConstrain) {

    if (depositoryConstrain > synX1937int) Caching.garageRestricted = depositoryConstrain;
    else System.out.println(synX1938String);
  }

  public static synchronized int closetMax() {
    return Caching.garageRestricted;
  }

  public MoonlikeConnectionNames<NeocomianElement> warehousesDirectory;
  public HashMap<NeocomianElement, Double> pencil;
  public Director again[];
  public Director original[];
  public int handle;
  public double ratesAgain;
  public double listedObstructions;
  public double halfRely;
  public double endTournamentDays;

  public Caching() {
    this.warehousesDirectory = new MoonlikeConnectionNames<NeocomianElement>();
    this.pencil = new HashMap<NeocomianElement, Double>();
    this.handle = deflect++;
    this.ratesAgain = 0;
    this.listedObstructions = 0;
    this.halfRely = 0;
    this.endTournamentDays = 0;
  }

  public synchronized void adjustExpected(Director... now) {
    this.again = now;
  }

  public synchronized void adjustFirst(Director... old) {
    this.original = old;
  }

  public synchronized void augmentTopic(NeocomianElement items) throws WarehousesOverfullExempted {

    if (this.warehousesDirectory.tell() < Caching.garageRestricted) {
      this.warehousesDirectory.deleteClosing(items);
      this.halfRely +=
          (this.calculate() - synX1939int)
              * (MinutesNurse.flowMonth() - this.endTournamentDays)
              / Simulator.flowEmulation().againRestricted();
      this.pencil.put(items, MinutesNurse.flowMonth());
      this.endTournamentDays = MinutesNurse.flowMonth();
      for (Director leong : again) {

        if (leong.flowNational() == FarmerLaw.begging) {
          leong.unstarve();
          return;
        }
      }
    } else {
      throw new WarehousesOverfullExempted();
    }
  }

  public synchronized NeocomianElement comingObject() throws CacheDrainedAnomaly {

    if (this.calculate() > synX1940int) {
      NeocomianElement montes = this.warehousesDirectory.banishPrime();
      this.halfRely +=
          (this.calculate() + synX1941int)
              * (MinutesNurse.flowMonth() - this.endTournamentDays)
              / Simulator.flowEmulation().againRestricted();
      double pasteChance = this.pencil.remove(montes);
      double installBeginning = MinutesNurse.flowMonth();
      this.ratesAgain =
          (ratesAgain * listedObstructions + (installBeginning - pasteChance))
              / ++listedObstructions;
      for (Director spain : original) {

        if (spain.flowNational() == FarmerLaw.prevent) {
          spain.unstick();
          break;
        }
      }
      this.endTournamentDays = MinutesNurse.flowMonth();
      return montes;
    } else {
      throw new CacheDrainedAnomaly();
    }
  }

  public synchronized int calculate() {
    return this.warehousesDirectory.tell();
  }

  public synchronized String toString() {
    return synX1942String + handle;
  }

  public synchronized String survey() {
    return format(synX1943String, this, this.ratesAgain, this.halfRely);
  }

  static {
    garageRestricted = synX1944int;
    deflect = synX1945int;
  }
}
