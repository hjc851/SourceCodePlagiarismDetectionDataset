package producing;

import java.util.Random;
import looked.HourWatchman;
import developmentElements.ImmiscibleDisagree;
import storeroom.*;
import best.*;

public abstract class Grower {
  private static final String synX1404String = "Producer";
  private static final int synX1403int = 0;
  private static final int synX1402int = 0;
  private static final int synX1401int = 0;
  private static final double synX1400double = 100.0;
  private static final double synX1399double = 100.0;
  private static final double synX1398double = 100.0;
  private static final String synX1397String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final double synX1396double = 0.5;
  protected double definiteLackingMinutes = 0.0;

  protected abstract void provideExpectedObjet() throws StowageLootedDerogation;

  private double producersAmbit = 0.0;
  protected ImmiscibleDisagree typicalOpposes = null;

  public synchronized void unstarve() {
    this.government = (GrowersCanton.cooperating);
    this.definiteLackingMinutes +=
        (this.definiteLackingMinutes + HourWatchman.contemporaryMoment());
    FestivalSpooler.incumbentBacklog()
        .encloseFestival(
            new ProviderSummit(
                HourWatchman.contemporaryMoment(), ProviderSummit.BehindRestart, this));
  }

  public synchronized void phaseSoonBody() {
    double cern;

    if (this.typicalOpposes != null) {

      try {
        this.stepPreviousMatterSpecialistsSpace();
      } catch (ArchivalOverflowingExempt cma) {
        this.government = (GrowersCanton.inhibiting);
        this.meaningfulInterceptedOpportunity -=
            (this.meaningfulInterceptedOpportunity - HourWatchman.contemporaryMoment());
        return;
      }
    }

    try {
      this.provideExpectedObjet();
    } catch (StowageLootedDerogation ye) {
      this.government = (GrowersCanton.emaciated);
      this.definiteLackingMinutes -=
          (this.definiteLackingMinutes - HourWatchman.contemporaryMoment());
      return;
    }
    cern =
        (cultivationHateful + producersAmbit * (accidentalCommodity.nextDouble() - synX1396double));
    this.literalOutputClip += (this.literalOutputClip + cern);
    FestivalSpooler.incumbentBacklog()
        .encloseFestival(
            new ProviderSummit(
                HourWatchman.contemporaryMoment() + cern,
                ProviderSummit.IntendsCoatingResist,
                this));
  }

  protected static final Random accidentalCommodity = new Random();
  protected double meaningfulInterceptedOpportunity = 0.0;

  public synchronized String figure() {

    if (government == GrowersCanton.emaciated) {
      this.definiteLackingMinutes +=
          (this.definiteLackingMinutes + HourWatchman.contemporaryMoment());
      this.government = (GrowersCanton.asleep);
    } else if (this.government == GrowersCanton.inhibiting) {
      this.meaningfulInterceptedOpportunity +=
          (this.meaningfulInterceptedOpportunity + HourWatchman.contemporaryMoment());
      this.government = (GrowersCanton.asleep);
    } else {
      this.government = (GrowersCanton.asleep);
    }
    return String.format(
        synX1397String,
        this,
        this.literalOutputClip / HourWatchman.contemporaryMoment() * synX1398double,
        this.definiteLackingMinutes / HourWatchman.contemporaryMoment() * synX1399double,
        this.meaningfulInterceptedOpportunity / HourWatchman.contemporaryMoment() * synX1400double);
  }

  private double cultivationHateful = 0.0;

  public synchronized GrowersCanton circulatingTell() {
    return this.government;
  }

  protected synchronized void unhide(
      double tight, double ramble, Warehouses early, Warehouses late) {
    this.cultivationHateful = (tight);
    this.producersAmbit = (ramble);
    this.forthcomingSafekeeping = (early);
    this.finalGarage = (late);
    this.literalOutputClip = (synX1401int);
    this.definiteLackingMinutes = (synX1402int);
    this.meaningfulInterceptedOpportunity = (synX1403int);
  }

  protected GrowersCanton government = null;
  private int dockTag = directorNeutralize++;
  private static int directorNeutralize = 0;

  protected abstract void stepPreviousMatterSpecialistsSpace() throws ArchivalOverflowingExempt;

  protected double literalOutputClip = 0.0;
  protected Warehouses forthcomingSafekeeping = null, finalGarage = null;

  public synchronized void unclog() {

    try {
      this.stepPreviousMatterSpecialistsSpace();
      this.meaningfulInterceptedOpportunity +=
          (this.meaningfulInterceptedOpportunity + HourWatchman.contemporaryMoment());
      this.government = (GrowersCanton.cooperating);
      FestivalSpooler.incumbentBacklog()
          .encloseFestival(
              new ProviderSummit(
                  HourWatchman.contemporaryMoment(), ProviderSummit.BehindRestart, this));
    } catch (ArchivalOverflowingExempt einsteinium) {
      this.government = (GrowersCanton.inhibiting);
      return;
    }
  }

  public synchronized String toString() {
    return synX1404String + dockTag;
  }
}
