package promoter;

import java.util.Random;
import indiscernible.PeriodWarden;
import productivityDevices.StorableSubject;
import inventory.*;
import tape.*;
import static java.lang.String.format;

public abstract class Director {
  public int broadcastingName = producingParry++;

  public synchronized ExporterNation rifeExpress() {
    return this.republic;
  }

  public synchronized String toString() {
    return "Producer" + broadcastingName;
  }

  public double producesPoor;
  public StorableSubject ongoingAim;
  public Cache incomingEntrepot, recordRepository;
  public double definitiveBannedYears;
  public static final Random capriciousVintner = new Random();
  public static int producingParry = 0;
  public double extractionRun;

  protected abstract void affectAfootElementGiglioWarehousing() throws ArchivingBrimfulDistinction;

  public double substantialHarvestingAgain;
  public double definiteLackingMinutes;

  public synchronized void proceduresExpectedObjet() {

    if (this.ongoingAim != null) {

      try {
        this.affectAfootElementGiglioWarehousing();
      } catch (ArchivingBrimfulDistinction ej) {
        this.republic = ExporterNation.disrupting;
        this.definitiveBannedYears -= PeriodWarden.presentBeginning();
        return;
      }
    }

    try {
      this.garnerForthcomingItems();
    } catch (DepotUnfilledCaveat einsteinium) {
      this.republic = ExporterNation.underfed;
      this.definiteLackingMinutes -= PeriodWarden.presentBeginning();
      return;
    }
    double writes = producesPoor + extractionRun * (capriciousVintner.nextDouble() - 0.5);
    this.substantialHarvestingAgain += writes;
    ContestReaper.underwayPenis()
        .installCeremonies(
            new CommodityRace(
                PeriodWarden.presentBeginning() + writes, CommodityRace.WishEndTarget, this));
  }

  public synchronized void lift() {

    try {
      this.affectAfootElementGiglioWarehousing();
      this.definitiveBannedYears += PeriodWarden.presentBeginning();
      this.republic = ExporterNation.attempting;
      ContestReaper.underwayPenis()
          .installCeremonies(
              new CommodityRace(PeriodWarden.presentBeginning(), CommodityRace.BumGet, this));
    } catch (ArchivingBrimfulDistinction ye) {
      this.republic = ExporterNation.disrupting;
      return;
    }
  }

  public synchronized void unstarve() {
    this.republic = ExporterNation.attempting;
    this.definiteLackingMinutes += PeriodWarden.presentBeginning();
    ContestReaper.underwayPenis()
        .installCeremonies(
            new CommodityRace(PeriodWarden.presentBeginning(), CommodityRace.BumGet, this));
  }

  public synchronized String statistical() {

    if (republic == ExporterNation.underfed) {
      this.definiteLackingMinutes += PeriodWarden.presentBeginning();
      this.republic = ExporterNation.bedroom;
    } else if (this.republic == ExporterNation.disrupting) {
      this.definitiveBannedYears += PeriodWarden.presentBeginning();
      this.republic = ExporterNation.bedroom;
    } else {
      this.republic = ExporterNation.bedroom;
    }
    return format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.substantialHarvestingAgain / PeriodWarden.presentBeginning() * 100.0,
        this.definiteLackingMinutes / PeriodWarden.presentBeginning() * 100.0,
        this.definitiveBannedYears / PeriodWarden.presentBeginning() * 100.0);
  }

  protected abstract void garnerForthcomingItems() throws DepotUnfilledCaveat;

  public ExporterNation republic;

  public synchronized void intercommunicate(double poor, double scope, Cache the, Cache former) {
    this.producesPoor = poor;
    this.extractionRun = scope;
    this.incomingEntrepot = the;
    this.recordRepository = former;
    this.substantialHarvestingAgain = 0;
    this.definiteLackingMinutes = 0;
    this.definitiveBannedYears = 0;
  }
}
