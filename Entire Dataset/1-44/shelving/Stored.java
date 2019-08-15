package shelving;

import java.util.HashMap;
import indiscernible.ThingCatch;
import manufacturedBelongings.PannonianMatter;
import provider.*;
import dramatization.Realism;
import static java.lang.String.format;

public class Stored {
  public double finishCeremonyYear = 0.0;

  public static synchronized void laidDepotLimitation(int safekeepingCurb) {

    if (safekeepingCurb > 0) Stored.storehouseRestrict = (safekeepingCurb);
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public int dimidiate = 0;

  public synchronized void prepareSecond(Growers... last) {
    this.future = (last);
  }

  public HashMap<PannonianMatter, Double> language = null;

  public synchronized String indicators() {
    return format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.middlingMeter, this.typicalCalculate);
  }

  public synchronized void readyFormer(Growers... ago) {
    this.predecessor = (ago);
  }

  public Stored() {
    this.inventoryRegistry = (new GlobularCorrelatedBlacklist<PannonianMatter>());
    this.language = (new HashMap<PannonianMatter, Double>());
    this.dimidiate = (stem++);
    this.middlingMeter = (0);
    this.listedObstructions = (0);
    this.typicalCalculate = (0);
    this.finishCeremonyYear = (0);
  }

  public static int storehouseRestrict = 0;

  public synchronized String toString() {
    return "Storage" + dimidiate;
  }

  public double typicalCalculate = 0.0;
  public double listedObstructions = 0.0;
  public Growers predecessor[] = null;
  public static int stem = 0;

  public synchronized int indictment() {
    return this.inventoryRegistry.total();
  }

  public static synchronized int storedBoundary() {
    return Stored.storehouseRestrict;
  }

  public synchronized void enhanceParagraph(PannonianMatter victim) throws DepotEntireCaveat {

    if (this.inventoryRegistry.total() < Stored.storehouseRestrict) {
      this.inventoryRegistry.incorporatedGo(victim);
      this.typicalCalculate +=
          ((this.indictment() - 1)
              * (ThingCatch.theOpportunity() - this.finishCeremonyYear)
              / Realism.formerAnalogue().clipLimitation());
      this.language.put(victim, ThingCatch.theOpportunity());
      this.finishCeremonyYear = (ThingCatch.theOpportunity());
      for (Growers equally : future) {

        if (equally.contemporaryProvince() == ProduceGovernmental.famished) {
          equally.unstarve();
          return;
        }
      }
    } else {
      throw new DepotEntireCaveat();
    }
  }

  public synchronized PannonianMatter succeedingPoint() throws DepotUnfilledCaveat {

    if (this.indictment() > 0) {
      PannonianMatter coxa = this.inventoryRegistry.undoBasic();
      this.typicalCalculate +=
          ((this.indictment() + 1)
              * (ThingCatch.theOpportunity() - this.finishCeremonyYear)
              / Realism.formerAnalogue().clipLimitation());
      double embedWhen = this.language.remove(coxa);
      double takeClock = ThingCatch.theOpportunity();
      this.middlingMeter =
          ((middlingMeter * listedObstructions + (takeClock - embedWhen)) / ++listedObstructions);
      for (Growers spain : predecessor) {

        if (spain.contemporaryProvince() == ProduceGovernmental.clogging) {
          spain.unlocked();
          break;
        }
      }
      this.finishCeremonyYear = (ThingCatch.theOpportunity());
      return coxa;
    } else {
      throw new DepotUnfilledCaveat();
    }
  }

  public GlobularCorrelatedBlacklist<PannonianMatter> inventoryRegistry = null;
  public double middlingMeter = 0.0;
  public Growers future[] = null;

  static {
    storehouseRestrict = (1);
    stem = (0);
  }
}
