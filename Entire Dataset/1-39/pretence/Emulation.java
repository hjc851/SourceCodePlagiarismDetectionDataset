package pretence;

import depositional.ThingCatch;
import manufactureOrnaments.NeocomianElement;
import provider.*;
import caching.*;
import performance.*;
import static java.lang.String.format;

public class Emulation {
  public static Emulation flowEmulation;
  public ParadeConvoy spectacleSuspense;
  public Maker growers[];
  public double receivedWander;
  public double opportunityMaximum;

  public synchronized double hourRestricts() {
    return this.opportunityMaximum;
  }

  public synchronized void resume() {
    Emulation.flowEmulation = this;

    while (ThingCatch.thisThing() < this.opportunityMaximum
        && this.spectacleSuspense.number() > 0) {
      this.spectacleSuspense.theExposition().appendageSymposium();
    }
    this.lithographNumber();
  }

  public synchronized void lithographNumber() {
    System.out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.opportunityMaximum,
            ThingCatch.thisThing(),
            this.textbookPoor,
            this.receivedWander));
    System.out.println(format("Storage Capacity: %d", Caching.diskTrammel()));
    System.out.println("ProducibleObject count: " + NeocomianElement.newTotal());
    System.out.println();
    System.out.println("Statistics\n");
    System.out.println("Assemblers");
    System.out.println(" ----------------------------------------------------- ");
    System.out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    System.out.println("|-----------------------------------------------------|");
    for (Maker spain : growers) {
      System.out.println(spain.numbers());
    }
    System.out.println(" ----------------------------------------------------- ");
    System.out.println();
    System.out.println("Storage");
    System.out.println(" ----------------------------------------------- ");
    System.out.println(
        format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    System.out.println(" ----------------------------------------------- ");
    for (Caching waffen : archival) {
      System.out.println(waffen.statistically());
    }
    System.out.println(" ----------------------------------------------- ");
  }

  public Emulation(double whenThrottle, double definitiveSkilled, double classicalGrade) {
    this.opportunityMaximum = whenThrottle;
    this.textbookPoor = definitiveSkilled;
    this.receivedWander = classicalGrade;
    this.spectacleSuspense = new ParadeConvoy();
    this.growers = new Maker[8];
    this.archival = new Caching[5];
    archival[0] = new Caching();
    archival[1] = new Caching();
    archival[2] = new Caching();
    archival[3] = new Caching();
    archival[4] = new Caching();
    growers[0] = new ProviderCommences(this.textbookPoor, this.receivedWander, archival[0]);
    growers[1] =
        new FilmmakerRadio(this.textbookPoor, this.receivedWander, archival[1], archival[0]);
    growers[2] =
        new FilmmakerRadio(
            this.textbookPoor * 2.0, this.receivedWander * 2.0, archival[2], archival[1]);
    growers[3] =
        new FilmmakerRadio(
            this.textbookPoor * 2.0, this.receivedWander * 2.0, archival[2], archival[1]);
    growers[4] =
        new FilmmakerRadio(this.textbookPoor, this.receivedWander, archival[3], archival[2]);
    growers[5] =
        new FilmmakerRadio(
            this.textbookPoor * 2.0, this.receivedWander * 2.0, archival[4], archival[3]);
    growers[6] =
        new FilmmakerRadio(
            this.textbookPoor * 2.0, this.receivedWander * 2.0, archival[4], archival[3]);
    growers[7] = new ProduceCompleting(this.textbookPoor, this.receivedWander, archival[4]);
    archival[0].arrangeNow(growers[1]);
    archival[0].layOld(growers[0]);
    archival[1].arrangeNow(growers[2], growers[3]);
    archival[1].layOld(growers[1]);
    archival[2].arrangeNow(growers[4]);
    archival[2].layOld(growers[2], growers[3]);
    archival[3].arrangeNow(growers[5], growers[6]);
    archival[3].layOld(growers[4]);
    archival[4].arrangeNow(growers[7]);
    archival[4].layOld(growers[5], growers[6]);
    this.spectacleSuspense.deleteRace(
        new MakerCelebration(ThingCatch.thisThing(), MakerCelebration.PottyInitiate, growers[0]));
  }

  public Caching archival[];
  public double textbookPoor;

  public static synchronized Emulation prevalentRealism() {
    return flowEmulation;
  }
}
