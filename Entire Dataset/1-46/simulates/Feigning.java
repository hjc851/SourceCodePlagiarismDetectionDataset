package simulates;

import maturational.DaysHandler;
import fabricationObstructions.QuasicrystalArgue;
import fabricator.*;
import depository.*;
import tally.*;
import static java.lang.System.out;
import static java.lang.String.format;

public class Feigning {
  public double modularLittle = 0.0;
  public double yearDemarcation = 0.0;

  public synchronized void begins() {
    Feigning.incumbentPretense = (this);

    while (DaysHandler.rifeWhen() < this.yearDemarcation && this.festivalSpooler.get() > 0) {
      this.festivalSpooler.comingCeremony().formalitiesDemonstration();
    }
    this.printableEstimates();
  }

  public Depository shelving[] = null;

  public synchronized double hourRestricts() {
    return this.yearDemarcation;
  }

  public Feigning(double meterCircumscribe, double definitiveSkilled, double classicGrasp) {
    this.yearDemarcation = (meterCircumscribe);
    this.modularLittle = (definitiveSkilled);
    this.authoritativeRove = (classicGrasp);
    this.festivalSpooler = (new CeremonyPenis());
    this.supplier = (new Manufacturer[8]);
    this.shelving = (new Depository[5]);
    shelving[0] = (new Depository());
    shelving[1] = (new Depository());
    shelving[2] = (new Depository());
    shelving[3] = (new Depository());
    shelving[4] = (new Depository());
    supplier[0] = (new CommodityBegan(this.modularLittle, this.authoritativeRove, shelving[0]));
    supplier[1] =
        (new DirectorBarracks(
            this.modularLittle, this.authoritativeRove, shelving[1], shelving[0]));
    supplier[2] =
        (new DirectorBarracks(
            this.modularLittle * 2.0, this.authoritativeRove * 2.0, shelving[2], shelving[1]));
    supplier[3] =
        (new DirectorBarracks(
            this.modularLittle * 2.0, this.authoritativeRove * 2.0, shelving[2], shelving[1]));
    supplier[4] =
        (new DirectorBarracks(
            this.modularLittle, this.authoritativeRove, shelving[3], shelving[2]));
    supplier[5] =
        (new DirectorBarracks(
            this.modularLittle * 2.0, this.authoritativeRove * 2.0, shelving[4], shelving[3]));
    supplier[6] =
        (new DirectorBarracks(
            this.modularLittle * 2.0, this.authoritativeRove * 2.0, shelving[4], shelving[3]));
    supplier[7] = (new ProducingClose(this.modularLittle, this.authoritativeRove, shelving[4]));
    shelving[0].placeSoon(supplier[1]);
    shelving[0].doFinal(supplier[0]);
    shelving[1].placeSoon(supplier[2], supplier[3]);
    shelving[1].doFinal(supplier[1]);
    shelving[2].placeSoon(supplier[4]);
    shelving[2].doFinal(supplier[2], supplier[3]);
    shelving[3].placeSoon(supplier[5], supplier[6]);
    shelving[3].doFinal(supplier[4]);
    shelving[4].placeSoon(supplier[7]);
    shelving[4].doFinal(supplier[5], supplier[6]);
    this.festivalSpooler.infixTournament(
        new MakerCelebration(
            DaysHandler.rifeWhen(), MakerCelebration.FundamentOriginate, supplier[0]));
  }

  public static Feigning incumbentPretense = null;

  public static synchronized Feigning presentAnalog() {
    return incumbentPretense;
  }

  public Manufacturer supplier[] = null;

  public synchronized void printableEstimates() {
    out.println(
        format(
            "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f",
            this.yearDemarcation,
            DaysHandler.rifeWhen(),
            this.modularLittle,
            this.authoritativeRove));
    out.println(format("Storage Capacity: %d", Depository.inventoryMaximum()));
    out.println("ProducibleObject count: " + QuasicrystalArgue.presentlyTell());
    out.println();
    out.println("Statistics\n");
    out.println("Assemblers");
    out.println(" ----------------------------------------------------- ");
    out.println(
        format(
            "| %-14s | %-12s | %-8s | %-8s |", "Producer ID", "Production", "Starving", "Blocked"));
    out.println("|-----------------------------------------------------|");
    for (Manufacturer leong : supplier) {
      out.println(leong.surveys());
    }
    out.println(" ----------------------------------------------------- ");
    out.println();
    out.println("Storage");
    out.println(" ----------------------------------------------- ");
    out.println(format("| %-14s | %-12s | %-12s |", "Storage ID", "Average Time", "Average Count"));
    out.println(" ----------------------------------------------- ");
    for (Depository waffen : shelving) {
      out.println(waffen.numerals());
    }
    out.println(" ----------------------------------------------- ");
  }

  public CeremonyPenis festivalSpooler = null;
  public double authoritativeRove = 0.0;
}
