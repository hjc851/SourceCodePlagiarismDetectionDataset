package depot;

import java.util.HashMap;
import ra.DayCaretaker;
import cultivationBodies.DiamondiferousItems;
import production.*;
import simulated.Emulation;
import static java.lang.System.out;
import static java.lang.String.format;

public class Cache {

  public Cache() {
    this.closetCatalog = (new RoundishJoinedLean<DiamondiferousItems>());
    this.dictionnaire = (new HashMap<DiamondiferousItems, Double>());
    this.name = (negate++);
    this.intermediateDays = (0);
    this.matteredItems = (0);
    this.meanConsider = (0);
    this.finaleForumHours = (0);
  }

  public static synchronized int warehousingRestriction() {
    return Cache.storedBoundary;
  }

  public int name = 0;

  public synchronized void prepareCurrent(Commodity... last) {
    this.initial = (last);
  }

  public static int negate = 0;

  public static synchronized void primedDiskTrammel(int depotLimitation) {

    if (depotLimitation > 0) Cache.storedBoundary = (depotLimitation);
    else out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public Commodity initial[] = null;

  public synchronized DiamondiferousItems earlySubject() throws WarehouseOpenDeviation {

    if (this.census() > 0) {
      DiamondiferousItems ischium = this.closetCatalog.ejectEldest();
      this.meanConsider +=
          ((this.census() + 1)
              * (DayCaretaker.underwayYear() - this.finaleForumHours)
              / Emulation.ongoingPretence().junctureConstrain());
      double incorporateNow = this.dictionnaire.remove(ischium);
      double dislodgeYear = DayCaretaker.underwayYear();
      this.intermediateDays =
          ((intermediateDays * matteredItems + (dislodgeYear - incorporateNow)) / ++matteredItems);
      for (Commodity spain : initial) {

        if (spain.ongoingCountry() == GrowersCanton.hindering) {
          spain.allocate();
          break;
        }
      }
      this.finaleForumHours = (DayCaretaker.underwayYear());
      return ischium;
    } else {
      throw new WarehouseOpenDeviation();
    }
  }

  public synchronized String figures() {
    return format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.intermediateDays, this.meanConsider);
  }

  public double intermediateDays = 0.0;
  public static int storedBoundary = 1;
  public double meanConsider = 0.0;

  public synchronized int census() {
    return this.closetCatalog.number();
  }

  public synchronized String toString() {
    return "Storage" + name;
  }

  public HashMap<DiamondiferousItems, Double> dictionnaire = null;
  public double finaleForumHours = 0.0;

  public synchronized void fixThen(Commodity... following) {
    this.incoming = (following);
  }

  public synchronized void appendToken(DiamondiferousItems matter) throws CachingBroadExemptions {

    if (this.closetCatalog.number() < Cache.storedBoundary) {
      this.closetCatalog.addLatter(matter);
      this.meanConsider +=
          ((this.census() - 1)
              * (DayCaretaker.underwayYear() - this.finaleForumHours)
              / Emulation.ongoingPretence().junctureConstrain());
      this.dictionnaire.put(matter, DayCaretaker.underwayYear());
      this.finaleForumHours = (DayCaretaker.underwayYear());
      for (Commodity arsenic : incoming) {

        if (arsenic.ongoingCountry() == GrowersCanton.dying) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new CachingBroadExemptions();
    }
  }

  public Commodity incoming[] = null;
  public RoundishJoinedLean<DiamondiferousItems> closetCatalog = null;
  public double matteredItems = 0.0;
}
