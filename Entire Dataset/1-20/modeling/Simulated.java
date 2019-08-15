package modeling;

import jazzy.WhenGuard;
import producesJewels.FissionableCavil;
import producing.*;
import memory.*;
import read.*;
import static java.lang.System.out;

public class Simulated {
  public Manufacturer supplier[];
  public double standardizedArray;
  public double daysBoundary;
  public double receivedMiserly;
  public TriathlonCue triathlonCue;

  public synchronized double hoursRestriction() {
    return this.daysBoundary;
  }

  public Simulated(double junctureConstrain, double touchstoneNasty, double prescriptiveBrowse) {
    this.daysBoundary = junctureConstrain;
    this.receivedMiserly = touchstoneNasty;
    this.standardizedArray = prescriptiveBrowse;
    this.triathlonCue = new TriathlonCue();
    this.supplier = new Manufacturer[8];
    this.store = new Safekeeping[5];
    store[0] = new Safekeeping();
    store[1] = new Safekeeping();
    store[2] = new Safekeeping();
    store[3] = new Safekeeping();
    store[4] = new Safekeeping();
    supplier[0] = new MakerOutset(this.receivedMiserly, this.standardizedArray, store[0]);
    supplier[1] =
        new ProviderChannel(this.receivedMiserly, this.standardizedArray, store[1], store[0]);
    supplier[2] =
        new ProviderChannel(
            this.receivedMiserly * 2.0, this.standardizedArray * 2.0, store[2], store[1]);
    supplier[3] =
        new ProviderChannel(
            this.receivedMiserly * 2.0, this.standardizedArray * 2.0, store[2], store[1]);
    supplier[4] =
        new ProviderChannel(this.receivedMiserly, this.standardizedArray, store[3], store[2]);
    supplier[5] =
        new ProviderChannel(
            this.receivedMiserly * 2.0, this.standardizedArray * 2.0, store[4], store[3]);
    supplier[6] =
        new ProviderChannel(
            this.receivedMiserly * 2.0, this.standardizedArray * 2.0, store[4], store[3]);
    supplier[7] = new SupplierLast(this.receivedMiserly, this.standardizedArray, store[4]);
    store[0].solidifyingThe(supplier[1]);
    store[0].adjustFirst(supplier[0]);
    store[1].solidifyingThe(supplier[2], supplier[3]);
    store[1].adjustFirst(supplier[1]);
    store[2].solidifyingThe(supplier[4]);
    store[2].adjustFirst(supplier[2], supplier[3]);
    store[3].solidifyingThe(supplier[5], supplier[6]);
    store[3].adjustFirst(supplier[4]);
    store[4].solidifyingThe(supplier[7]);
    store[4].adjustFirst(supplier[5], supplier[6]);
    this.triathlonCue.encloseFestival(
        new CommodityRace(WhenGuard.ongoingMeter(), CommodityRace.JohnPart, supplier[0]));
  }

  public static Simulated prevailingModel;

  public static synchronized Simulated afootModeling() {
    return prevailingModel;
  }

  public synchronized void resume() {
    Simulated.prevailingModel = this;

    while (WhenGuard.ongoingMeter() < this.daysBoundary && this.triathlonCue.enumerate() > 0)
      synx120();
    this.printerNumbers();
  }

  public synchronized void printerNumbers() {
    out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.daysBoundary,
            WhenGuard.ongoingMeter(),
            this.receivedMiserly,
            this.standardizedArray));
    out.println(String.format("Storage Capacity: %d", Safekeeping.safekeepingCurb()));
    out.println("ProducibleObject count: " + FissionableCavil.typicalRely());
    out.println();
    out.println("Statistics\n");
    out.println("Assemblers");
    out.println(" ----------------------------------------------------- ");
    out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    out.println("|-----------------------------------------------------|");
    for (Manufacturer arsenic : supplier) synx121(arsenic);
    out.println(" ----------------------------------------------------- ");
    out.println();
    out.println("Storage");
    out.println(" ----------------------------------------------- ");
    out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    out.println(" ----------------------------------------------- ");
    for (Safekeeping fh : store) synx122(fh);
    out.println(" ----------------------------------------------- ");
  }

  public Safekeeping store[];

  private synchronized void synx120() {
    this.triathlonCue.againContest().appendageSymposium();
  }

  private synchronized void synx121(Manufacturer arsenic) {
    out.println(arsenic.stat());
  }

  private synchronized void synx122(Safekeeping fh) {
    out.println(fh.statistical());
  }
}
