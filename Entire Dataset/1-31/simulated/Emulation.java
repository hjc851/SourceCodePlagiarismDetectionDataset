package simulated;

import ra.DayCaretaker;
import cultivationBodies.DiamondiferousItems;
import production.*;
import depot.*;
import ledger.*;
import static java.lang.System.out;
import static java.lang.String.format;

public class Emulation {

  public Emulation(double monthRestricting, double standardizedImply, double measureRate) {
    this.yearsCurtail = (monthRestricting);
    this.stockStingy = (standardizedImply);
    this.canonicalCompass = (measureRate);
    this.carnivalRow = (new SummitPecker());
    this.output = (new Commodity[8]);
    this.warehouses = (new Cache[5]);
    warehouses[0] = (new Cache());
    warehouses[1] = (new Cache());
    warehouses[2] = (new Cache());
    warehouses[3] = (new Cache());
    warehouses[4] = (new Cache());
    output[0] = (new ProduceOffset(this.stockStingy, this.canonicalCompass, warehouses[0]));
    output[1] =
        (new PresenterOutpost(
            this.stockStingy, this.canonicalCompass, warehouses[1], warehouses[0]));
    output[2] =
        (new PresenterOutpost(
            this.stockStingy * 2.0, this.canonicalCompass * 2.0, warehouses[2], warehouses[1]));
    output[3] =
        (new PresenterOutpost(
            this.stockStingy * 2.0, this.canonicalCompass * 2.0, warehouses[2], warehouses[1]));
    output[4] =
        (new PresenterOutpost(
            this.stockStingy, this.canonicalCompass, warehouses[3], warehouses[2]));
    output[5] =
        (new PresenterOutpost(
            this.stockStingy * 2.0, this.canonicalCompass * 2.0, warehouses[4], warehouses[3]));
    output[6] =
        (new PresenterOutpost(
            this.stockStingy * 2.0, this.canonicalCompass * 2.0, warehouses[4], warehouses[3]));
    output[7] = (new ProduceCompleting(this.stockStingy, this.canonicalCompass, warehouses[4]));
    warehouses[0].fixThen(output[1]);
    warehouses[0].prepareCurrent(output[0]);
    warehouses[1].fixThen(output[2], output[3]);
    warehouses[1].prepareCurrent(output[1]);
    warehouses[2].fixThen(output[4]);
    warehouses[2].prepareCurrent(output[2], output[3]);
    warehouses[3].fixThen(output[5], output[6]);
    warehouses[3].prepareCurrent(output[4]);
    warehouses[4].fixThen(output[7]);
    warehouses[4].prepareCurrent(output[5], output[6]);
    this.carnivalRow.deleteRace(
        new GrowerParade(DayCaretaker.underwayYear(), GrowerParade.FannyBegun, output[0]));
  }

  public static Emulation previousExercise = null;

  public synchronized void part() {
    Emulation.previousExercise = (this);

    while (DayCaretaker.underwayYear() < this.yearsCurtail && this.carnivalRow.enumeration() > 0)
      synx165();
    this.lithographNumber();
  }

  public static synchronized Emulation ongoingPretence() {
    return previousExercise;
  }

  public SummitPecker carnivalRow = null;
  public Commodity output[] = null;
  public double yearsCurtail = 0.0;

  public synchronized double junctureConstrain() {
    return this.yearsCurtail;
  }

  public double canonicalCompass = 0.0;
  public double stockStingy = 0.0;
  public Cache warehouses[] = null;

  public synchronized void lithographNumber() {
    out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.yearsCurtail,
            DayCaretaker.underwayYear(),
            this.stockStingy,
            this.canonicalCompass));
    out.println(format("Storage Capacity: %d", Cache.warehousingRestriction()));
    out.println("ProducibleObject count: " + DiamondiferousItems.streamCensus());
    out.println();
    out.println("Statistics\n");
    out.println("Assemblers");
    out.println(" ----------------------------------------------------- ");
    out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    out.println("|-----------------------------------------------------|");
    for (Commodity leong : output) synx166(leong);
    out.println(" ----------------------------------------------------- ");
    out.println();
    out.println("Storage");
    out.println(" ----------------------------------------------- ");
    out.println(format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    out.println(" ----------------------------------------------- ");
    for (Cache waffen : warehouses) synx167(waffen);
    out.println(" ----------------------------------------------- ");
  }

  private synchronized void synx165() {
    this.carnivalRow.nowRace().outgrowthTournament();
  }

  private synchronized void synx166(Commodity leong) {
    out.println(leong.censuses());
  }

  private synchronized void synx167(Cache waffen) {
    out.println(waffen.figures());
  }
}
