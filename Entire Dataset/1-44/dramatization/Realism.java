package dramatization;

import indiscernible.ThingCatch;
import manufacturedBelongings.PannonianMatter;
import provider.*;
import shelving.*;
import commemorate.*;
import static java.lang.String.format;

public class Realism {
  public Stored space[] = null;

  public synchronized double clipLimitation() {
    return this.dayBounds;
  }

  public static Realism previousExercise = null;

  public synchronized void reprintIndicators() {
    System.out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.dayBounds,
            ThingCatch.theOpportunity(),
            this.definitiveSkilled,
            this.regularChain));
    System.out.println(format("Storage Capacity: %d", Stored.storedBoundary()));
    System.out.println("ProducibleObject count: " + PannonianMatter.afootCharge());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Growers arsenic : production) synx228(arsenic);
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Stored fh : space) synx229(fh);
    System.out.println(" ----------------------------------------------- ");
  }

  public static synchronized Realism formerAnalogue() {
    return previousExercise;
  }

  public Realism(double yearDemarcation, double prescriptiveMingy, double stockRamble) {
    this.dayBounds = (yearDemarcation);
    this.definitiveSkilled = (prescriptiveMingy);
    this.regularChain = (stockRamble);
    this.tournamentStandby = (new MeetingGlue());
    this.production = (new Growers[8]);
    this.space = (new Stored[5]);
    space[0] = (new Stored());
    space[1] = (new Stored());
    space[2] = (new Stored());
    space[3] = (new Stored());
    space[4] = (new Stored());
    production[0] = (new OperatorOriginate(this.definitiveSkilled, this.regularChain, space[0]));
    production[1] =
        (new ManufacturerBase(this.definitiveSkilled, this.regularChain, space[1], space[0]));
    production[2] =
        (new ManufacturerBase(
            this.definitiveSkilled * 2.0, this.regularChain * 2.0, space[2], space[1]));
    production[3] =
        (new ManufacturerBase(
            this.definitiveSkilled * 2.0, this.regularChain * 2.0, space[2], space[1]));
    production[4] =
        (new ManufacturerBase(this.definitiveSkilled, this.regularChain, space[3], space[2]));
    production[5] =
        (new ManufacturerBase(
            this.definitiveSkilled * 2.0, this.regularChain * 2.0, space[4], space[3]));
    production[6] =
        (new ManufacturerBase(
            this.definitiveSkilled * 2.0, this.regularChain * 2.0, space[4], space[3]));
    production[7] = (new FabricatorGet(this.definitiveSkilled, this.regularChain, space[4]));
    space[0].prepareSecond(production[1]);
    space[0].readyFormer(production[0]);
    space[1].prepareSecond(production[2], production[3]);
    space[1].readyFormer(production[1]);
    space[2].prepareSecond(production[4]);
    space[2].readyFormer(production[2], production[3]);
    space[3].prepareSecond(production[5], production[6]);
    space[3].readyFormer(production[4]);
    space[4].prepareSecond(production[7]);
    space[4].readyFormer(production[5], production[6]);
    this.tournamentStandby.pasteContest(
        new PresenterSymposium(
            ThingCatch.theOpportunity(), PresenterSymposium.GetCommence, production[0]));
  }

  public double dayBounds = 0.0;
  public MeetingGlue tournamentStandby = null;
  public Growers production[] = null;
  public double definitiveSkilled = 0.0;
  public double regularChain = 0.0;

  public synchronized void get() {
    Realism.previousExercise = (this);

    while (ThingCatch.theOpportunity() < this.dayBounds && this.tournamentStandby.matter() > 0)
      synx230();
    this.reprintIndicators();
  }

  private synchronized void synx228(Growers arsenic) {
    System.out.println(arsenic.censuses());
  }

  private synchronized void synx229(Stored fh) {
    System.out.println(fh.indicators());
  }

  private synchronized void synx230() {
    this.tournamentStandby.incomingVenue().formalitiesDemonstration();
  }
}
