package presenter;

import java.util.Random;
import said.JunctureJailer;
import extractionTreasures.DepositionalObjet;
import garage.*;
import disc.*;
import static java.lang.String.format;

public abstract class Fabricator {
  private static int commodityDispel = 0;
  private int placeMilad = commodityDispel++;
  protected DepositionalObjet actualArtifact = null;

  public synchronized String toString() {
    return "Producer" + placeMilad;
  }

  protected GrowersCanton national = null;
  protected static final Random samplingOutput = new Random();

  public synchronized void outgrowthLastArtefact() {

    if (this.actualArtifact != null) {

      try {
        this.goPrevailingObjectiveMousStorehouse();
      } catch (DepositoryOverladenDeparture cma) {
        this.national = (GrowersCanton.blockade);
        this.definitiveBannedYears -= (JunctureJailer.prevalentNow());
        return;
      }
    }

    try {
      this.incurCloseAim();
    } catch (DepotUnfilledCaveat samad) {
      this.national = (GrowersCanton.scrounging);
      this.definitiveParchedYears -= (JunctureJailer.prevalentNow());
      return;
    }
    double writes = factoryIntend + produceStraddle * (samplingOutput.nextDouble() - 0.5);
    this.genuineProducerMoment += (writes);
    VenueList.typicalCola()
        .installCeremonies(
            new GrowersMeeting(
                JunctureJailer.prevalentNow() + writes, GrowersMeeting.IntendFinalElement, this));
  }

  public synchronized GrowersCanton newRepublic() {
    return this.national;
  }

  private double produceStraddle = 0.0;

  protected synchronized void randomise(double equate, double ambit, Memory after, Memory pre) {
    this.factoryIntend = (equate);
    this.produceStraddle = (ambit);
    this.firstArchiving = (after);
    this.predecessorInventory = (pre);
    this.genuineProducerMoment = (0);
    this.definitiveParchedYears = (0);
    this.definitiveBannedYears = (0);
  }

  protected double definitiveBannedYears = 0.0;
  protected double genuineProducerMoment = 0.0;

  public synchronized void unstarve() {
    this.national = (GrowersCanton.busy);
    this.definitiveParchedYears += (JunctureJailer.prevalentNow());
    VenueList.typicalCola()
        .installCeremonies(
            new GrowersMeeting(JunctureJailer.prevalentNow(), GrowersMeeting.TushOffset, this));
  }

  protected abstract void goPrevailingObjectiveMousStorehouse() throws DepositoryOverladenDeparture;

  public synchronized String metrics() {

    if (national == GrowersCanton.scrounging) synx126();
    else if (this.national == GrowersCanton.blockade) synx127();
    else synx128();
    return format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.genuineProducerMoment / JunctureJailer.prevalentNow() * 100.0,
        this.definitiveParchedYears / JunctureJailer.prevalentNow() * 100.0,
        this.definitiveBannedYears / JunctureJailer.prevalentNow() * 100.0);
  }

  protected Memory firstArchiving = null, predecessorInventory = null;

  protected abstract void incurCloseAim() throws DepotUnfilledCaveat;

  private double factoryIntend = 0.0;
  protected double definitiveParchedYears = 0.0;

  public synchronized void redirect() {

    try {
      this.goPrevailingObjectiveMousStorehouse();
      this.definitiveBannedYears += (JunctureJailer.prevalentNow());
      this.national = (GrowersCanton.busy);
      VenueList.typicalCola()
          .installCeremonies(
              new GrowersMeeting(JunctureJailer.prevalentNow(), GrowersMeeting.TushOffset, this));
    } catch (DepositoryOverladenDeparture ej) {
      this.national = (GrowersCanton.blockade);
      return;
    }
  }

  private synchronized void synx126() {
    this.definitiveParchedYears += (JunctureJailer.prevalentNow());
    this.national = (GrowersCanton.lying);
  }

  private synchronized void synx127() {
    this.definitiveBannedYears += (JunctureJailer.prevalentNow());
    this.national = (GrowersCanton.lying);
  }

  private synchronized void synx128() {
    this.national = (GrowersCanton.lying);
  }
}
