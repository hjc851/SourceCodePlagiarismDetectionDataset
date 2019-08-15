package realism;

import ontogenetic.AmountRearing;
import fabricationObstructions.StorableSubject;
import producing.*;
import repository.*;
import register.*;
import static java.lang.System.out;

public class Simulate {

  public static synchronized Simulate incumbentPretense() {
    return previousExercise;
  }

  public synchronized void initiate() {
    Simulate.previousExercise = (this);

    while (AmountRearing.contemporaryMoment() < this.whenThrottle && this.raceJunk.get() > 0) {
      this.raceJunk.expectedSeminar().formalitiesDemonstration();
    }
    this.printerNumbers();
  }

  private Presenter fabricator[] = null;

  public synchronized double periodsBound() {
    return this.whenThrottle;
  }

  public Simulate(double yearDemarcation, double basicThink, double acceptedRun) {
    this.whenThrottle = (yearDemarcation);
    this.definitiveSkilled = (basicThink);
    this.normativeDrift = (acceptedRun);
    this.raceJunk = (new CaseWaiting());
    this.fabricator = (new Presenter[8]);
    this.caching = (new Storeroom[5]);
    caching[0] = (new Storeroom());
    caching[1] = (new Storeroom());
    caching[2] = (new Storeroom());
    caching[3] = (new Storeroom());
    caching[4] = (new Storeroom());
    fabricator[0] = (new DirectorPart(this.definitiveSkilled, this.normativeDrift, caching[0]));
    fabricator[1] =
        (new ProviderChannel(this.definitiveSkilled, this.normativeDrift, caching[1], caching[0]));
    fabricator[2] =
        (new ProviderChannel(
            this.definitiveSkilled * 2.0, this.normativeDrift * 2.0, caching[2], caching[1]));
    fabricator[3] =
        (new ProviderChannel(
            this.definitiveSkilled * 2.0, this.normativeDrift * 2.0, caching[2], caching[1]));
    fabricator[4] =
        (new ProviderChannel(this.definitiveSkilled, this.normativeDrift, caching[3], caching[2]));
    fabricator[5] =
        (new ProviderChannel(
            this.definitiveSkilled * 2.0, this.normativeDrift * 2.0, caching[4], caching[3]));
    fabricator[6] =
        (new ProviderChannel(
            this.definitiveSkilled * 2.0, this.normativeDrift * 2.0, caching[4], caching[3]));
    fabricator[7] =
        (new ProduceCompleting(this.definitiveSkilled, this.normativeDrift, caching[4]));
    caching[0].orderedAgain(fabricator[1]);
    caching[0].fitPrior(fabricator[0]);
    caching[1].orderedAgain(fabricator[2], fabricator[3]);
    caching[1].fitPrior(fabricator[1]);
    caching[2].orderedAgain(fabricator[4]);
    caching[2].fitPrior(fabricator[2], fabricator[3]);
    caching[3].orderedAgain(fabricator[5], fabricator[6]);
    caching[3].fitPrior(fabricator[4]);
    caching[4].orderedAgain(fabricator[7]);
    caching[4].fitPrior(fabricator[5], fabricator[6]);
    this.raceJunk.attachParade(
        new FarmExposition(
            AmountRearing.contemporaryMoment(), FarmExposition.StoolCommencement, fabricator[0]));
  }

  private double normativeDrift = 0.0;
  private double whenThrottle = 0.0;
  private double definitiveSkilled = 0.0;
  private Storeroom caching[] = null;
  private static Simulate previousExercise = null;

  private synchronized void printerNumbers() {
    out.println(
        String.format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.whenThrottle,
            AmountRearing.contemporaryMoment(),
            this.definitiveSkilled,
            this.normativeDrift));
    out.println(String.format("Storage Capacity: %d", Storeroom.archivalCurtail()));
    out.println("ProducibleObject count: " + StorableSubject.previousCalculate());
    out.println();
    out.println("Statistics\n");
    out.println("Assemblers");
    out.println(" ----------------------------------------------------- ");
    out.println(
        String.format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    out.println("|-----------------------------------------------------|");
    for (Presenter spain : fabricator) {
      out.println(spain.metrics());
    }
    out.println(" ----------------------------------------------------- ");
    out.println();
    out.println("Storage");
    out.println(" ----------------------------------------------- ");
    out.println(
        String.format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    out.println(" ----------------------------------------------- ");
    for (Storeroom waffen : caching) {
      out.println(waffen.stats());
    }
    out.println(" ----------------------------------------------- ");
  }

  private CaseWaiting raceJunk = null;
}
