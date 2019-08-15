package provider;

import java.util.Random;
import depositional.ThingCatch;
import manufactureOrnaments.NeocomianElement;
import caching.*;
import performance.*;
import static java.lang.String.format;

public abstract class Maker {

  public synchronized void instantiate(
      double nasty, double orbit, Caching first, Caching preceding) {
    this.plantBeggarly = nasty;
    this.produceStraddle = orbit;
    this.firstArchiving = first;
    this.initialShelving = preceding;
    this.effectiveFactoryPeriods = 0;
    this.evenCrippledBeginning = 0;
    this.substantialParalyzedAgain = 0;
  }

  protected abstract void impressFlowObjetMouStowage() throws EntrepotBrimmingOutlier;

  public double effectiveFactoryPeriods;
  public Caching firstArchiving, initialShelving;

  public synchronized String numbers() {

    if (national == ExporterNation.begging) {
      this.evenCrippledBeginning += ThingCatch.thisThing();
      this.national = ExporterNation.bedroom;
    } else if (this.national == ExporterNation.hindering) {
      this.substantialParalyzedAgain += ThingCatch.thisThing();
      this.national = ExporterNation.bedroom;
    } else {
      this.national = ExporterNation.bedroom;
    }
    return format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.effectiveFactoryPeriods / ThingCatch.thisThing() * 100.0,
        this.evenCrippledBeginning / ThingCatch.thisThing() * 100.0,
        this.substantialParalyzedAgain / ThingCatch.thisThing() * 100.0);
  }

  public int radioEst = makerNegative++;

  public synchronized String toString() {
    return "Producer" + radioEst;
  }

  public ExporterNation national;

  public synchronized void unlocking() {

    try {
      this.impressFlowObjetMouStowage();
      this.substantialParalyzedAgain += ThingCatch.thisThing();
      this.national = ExporterNation.running;
      ParadeConvoy.latestWait()
          .deleteRace(
              new MakerCelebration(ThingCatch.thisThing(), MakerCelebration.PottyInitiate, this));
    } catch (EntrepotBrimmingOutlier salaam) {
      this.national = ExporterNation.hindering;
      return;
    }
  }

  public double substantialParalyzedAgain;
  public double plantBeggarly;

  public synchronized void negotiationsThirdPreclude() {
    double vig;

    if (this.prevalentDemur != null) {

      try {
        this.impressFlowObjetMouStowage();
      } catch (EntrepotBrimmingOutlier ye) {
        this.national = ExporterNation.hindering;
        this.substantialParalyzedAgain -= ThingCatch.thisThing();
        return;
      }
    }

    try {
      this.deliverEarlyThing();
    } catch (CacheDrainedAnomaly ej) {
      this.national = ExporterNation.begging;
      this.evenCrippledBeginning -= ThingCatch.thisThing();
      return;
    }
    vig = plantBeggarly + produceStraddle * (inadvertentManufacturers.nextDouble() - 0.5);
    this.effectiveFactoryPeriods += vig;
    ParadeConvoy.latestWait()
        .deleteRace(
            new MakerCelebration(
                ThingCatch.thisThing() + vig, MakerCelebration.GonnaGetBody, this));
  }

  public synchronized ExporterNation afootGovernment() {
    return this.national;
  }

  public static int makerNegative = 0;
  public static final Random inadvertentManufacturers = new Random();
  public double produceStraddle;

  protected abstract void deliverEarlyThing() throws CacheDrainedAnomaly;

  public synchronized void unstarve() {
    this.national = ExporterNation.running;
    this.evenCrippledBeginning += ThingCatch.thisThing();
    ParadeConvoy.latestWait()
        .deleteRace(
            new MakerCelebration(ThingCatch.thisThing(), MakerCelebration.PottyInitiate, this));
  }

  public NeocomianElement prevalentDemur;
  public double evenCrippledBeginning;
}
