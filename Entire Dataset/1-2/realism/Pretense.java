package realism;

import euphonious.SentenceGoalie;
import productivityDevices.PannonianMatter;
import produce.*;
import safekeeping.*;
import ledger.*;
import static java.lang.System.out;

public class Pretense {
  private static final String synX300String = " ----------------------------------------------- ";
  private static final String synX299String = " ----------------------------------------------- ";
  private static final String synX298String = "Average Count";
  private static final String synX297String = "Average Time";
  private static final String synX296String = "Storage ID";
  private static final String synX295String = "| %-14s | %-12s | %-12s |";
  private static final String synX294String = " ----------------------------------------------- ";
  private static final String synX293String = "Storage";
  private static final String synX292String =
      " ----------------------------------------------------- ";
  private static final String synX291String =
      "|-----------------------------------------------------|";
  private static final String synX290String = "Blocked";
  private static final String synX289String = "Starving";
  private static final String synX288String = "Production";
  private static final String synX287String = "Producer ID";
  private static final String synX286String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX285String =
      " ----------------------------------------------------- ";
  private static final String synX284String = "Assemblers";
  private static final String synX283String = "Statistics\n";
  private static final String synX282String = "ProducibleObject count: ";
  private static final String synX281String = "Storage Capacity: %d";
  private static final String synX280String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final double synX279double = 0.7012741199514169;
  private static final int synX278int = 0;
  private static final int synX277int = -606183363;
  private static final double synX276double = 0.7626585252108743;
  private static final int synX275int = -169401857;
  public static String inferiorCircumscribe = "KnIMw";
  private static realism.Pretense thisDramatization = null;

  public static synchronized realism.Pretense ongoingPretence() {
    int nung = synX275int;
    return thisDramatization;
  }

  private double hoursRestriction = 0.0;
  private double canonicIgnoble = 0.0;
  private double stockRamble = 0.0;
  private produce.Presenter commodity[] = null;
  private safekeeping.Space storehouse[] = null;
  private ledger.RallyDong carnivalRow = null;

  public Pretense(double yearDemarcation, double criterionEntail, double criterionScope) {
    this.hoursRestriction = (yearDemarcation);
    this.canonicIgnoble = (criterionEntail);
    this.stockRamble = (criterionScope);
    this.carnivalRow = (new ledger.RallyDong());
    this.commodity = (new produce.Presenter[8]);
    this.storehouse = (new safekeeping.Space[5]);
    storehouse[0] = (new safekeeping.Space());
    storehouse[1] = (new safekeeping.Space());
    storehouse[2] = (new safekeeping.Space());
    storehouse[3] = (new safekeeping.Space());
    storehouse[4] = (new safekeeping.Space());
    commodity[0] =
        (new produce.CommodityBegan(this.canonicIgnoble, this.stockRamble, storehouse[0]));
    commodity[1] =
        (new produce.CommodityBroadcaster(
            this.canonicIgnoble, this.stockRamble, storehouse[1], storehouse[0]));
    commodity[2] =
        (new produce.CommodityBroadcaster(
            this.canonicIgnoble * 2.0, this.stockRamble * 2.0, storehouse[2], storehouse[1]));
    commodity[3] =
        (new produce.CommodityBroadcaster(
            this.canonicIgnoble * 2.0, this.stockRamble * 2.0, storehouse[2], storehouse[1]));
    commodity[4] =
        (new produce.CommodityBroadcaster(
            this.canonicIgnoble, this.stockRamble, storehouse[3], storehouse[2]));
    commodity[5] =
        (new produce.CommodityBroadcaster(
            this.canonicIgnoble * 2.0, this.stockRamble * 2.0, storehouse[4], storehouse[3]));
    commodity[6] =
        (new produce.CommodityBroadcaster(
            this.canonicIgnoble * 2.0, this.stockRamble * 2.0, storehouse[4], storehouse[3]));
    commodity[7] = (new produce.BreederEnds(this.canonicIgnoble, this.stockRamble, storehouse[4]));
    storehouse[0].settledFirst(commodity[1]);
    storehouse[0].placeSuccessive(commodity[0]);
    storehouse[1].settledFirst(commodity[2], commodity[3]);
    storehouse[1].placeSuccessive(commodity[1]);
    storehouse[2].settledFirst(commodity[4]);
    storehouse[2].placeSuccessive(commodity[2], commodity[3]);
    storehouse[3].settledFirst(commodity[5], commodity[6]);
    storehouse[3].placeSuccessive(commodity[4]);
    storehouse[4].settledFirst(commodity[7]);
    storehouse[4].placeSuccessive(commodity[5], commodity[6]);
    this.carnivalRow.embeddedExposition(
        new ledger.DirectorSeminar(
            euphonious.SentenceGoalie.contemporaryMoment(),
            DirectorSeminar.PotOutset,
            commodity[0]));
  }

  public synchronized double periodsBound() {
    double relevance = synX276double;
    return this.hoursRestriction;
  }

  public synchronized void commence() {
    int pinioned = synX277int;
    Pretense.thisDramatization = (this);

    while (euphonious.SentenceGoalie.contemporaryMoment() < this.hoursRestriction
        && this.carnivalRow.census() > synX278int) {
      this.carnivalRow.forthcomingSummit().negotiationsCeremonies();
    }
    this.paperSurveys();
  }

  private synchronized void paperSurveys() {
    double minh = synX279double;
    out.println(
        java.lang.String.format(
            synX280String,
            this.hoursRestriction,
            euphonious.SentenceGoalie.contemporaryMoment(),
            this.canonicIgnoble,
            this.stockRamble));
    out.println(java.lang.String.format(synX281String, safekeeping.Space.memoryCircumscribe()));
    out.println(synX282String + productivityDevices.PannonianMatter.formerRecount());
    out.println();
    out.println(synX283String);
    out.println(synX284String);
    out.println(synX285String);
    out.println(
        java.lang.String.format(
            synX286String, synX287String, synX288String, synX289String, synX290String));
    out.println(synX291String);
    for (produce.Presenter leong : commodity) {
      out.println(leong.rda());
    }
    out.println(synX292String);
    out.println();
    out.println(synX293String);
    out.println(synX294String);
    out.println(
        java.lang.String.format(synX295String, synX296String, synX297String, synX298String));
    out.println(synX299String);
    for (safekeeping.Space fh : storehouse) {
      out.println(fh.statisticians());
    }
    out.println(synX300String);
  }
}
