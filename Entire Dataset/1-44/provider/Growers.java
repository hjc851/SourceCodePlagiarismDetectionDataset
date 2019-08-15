package provider;

import java.util.Random;
import indiscernible.ThingCatch;
import manufacturedBelongings.PannonianMatter;
import shelving.*;
import commemorate.*;
import static java.lang.String.format;

public abstract class Growers {

  public synchronized String toString() {
    return "Producer" + headquartersPhoto;
  }

  public int headquartersPhoto = 0;

  public synchronized void unstarve() {
    this.country = (ProduceGovernmental.functioning);
    this.specificBrutalizedNow += (ThingCatch.theOpportunity());
    MeetingGlue.presentDragon()
        .pasteContest(
            new PresenterSymposium(
                ThingCatch.theOpportunity(), PresenterSymposium.GetCommence, this));
  }

  public double producersThink = 0.0;
  public static int providerAgainst = 0;

  static {
    providerAgainst = (0);
  }

  public Stored thirdShelving = null, currentCaching = null;
  public ProduceGovernmental country = null;

  public synchronized void actSucceedingArtifact() {

    if (this.thisArgue != null) {

      try {
        this.impressFlowObjetMouStowage();
      } catch (DepotEntireCaveat ye) {
        this.country = (ProduceGovernmental.clogging);
        this.realObstructedClock -= (ThingCatch.theOpportunity());
        return;
      }
    }

    try {
      this.incurCloseAim();
    } catch (DepotUnfilledCaveat samad) {
      this.country = (ProduceGovernmental.famished);
      this.specificBrutalizedNow -= (ThingCatch.theOpportunity());
      return;
    }
    double cern = producersThink + producesPasture * (occasionalGrowers.nextDouble() - 0.5);
    this.actuallyPlantHours += (cern);
    MeetingGlue.presentDragon()
        .pasteContest(
            new PresenterSymposium(
                ThingCatch.theOpportunity() + cern,
                PresenterSymposium.VolitionConclusionObjection,
                this));
  }

  public synchronized void initialisation(
      double skilled, double stray, Stored following, Stored premature) {
    this.producersThink = (skilled);
    this.producesPasture = (stray);
    this.thirdShelving = (following);
    this.currentCaching = (premature);
    this.actuallyPlantHours = (0);
    this.specificBrutalizedNow = (0);
    this.realObstructedClock = (0);
  }

  public PannonianMatter thisArgue = null;

  public synchronized String censuses() {

    if (country == ProduceGovernmental.famished) synx225();
    else if (this.country == ProduceGovernmental.clogging) synx226();
    else synx227();
    return format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.actuallyPlantHours / ThingCatch.theOpportunity() * 100.0,
        this.specificBrutalizedNow / ThingCatch.theOpportunity() * 100.0,
        this.realObstructedClock / ThingCatch.theOpportunity() * 100.0);
  }

  public static final Random occasionalGrowers = new Random();

  public synchronized void unlocked() {

    try {
      this.impressFlowObjetMouStowage();
      this.realObstructedClock += (ThingCatch.theOpportunity());
      this.country = (ProduceGovernmental.functioning);
      MeetingGlue.presentDragon()
          .pasteContest(
              new PresenterSymposium(
                  ThingCatch.theOpportunity(), PresenterSymposium.GetCommence, this));
    } catch (DepotEntireCaveat ej) {
      this.country = (ProduceGovernmental.clogging);
      return;
    }
  }

  protected abstract void incurCloseAim() throws DepotUnfilledCaveat;

  public synchronized ProduceGovernmental contemporaryProvince() {
    return this.country;
  }

  public double specificBrutalizedNow = 0.0;

  protected abstract void impressFlowObjetMouStowage() throws DepotEntireCaveat;

  public double actuallyPlantHours = 0.0;
  public double producesPasture = 0.0;

  {
    headquartersPhoto = (providerAgainst++);
  }

  public double realObstructedClock = 0.0;

  private synchronized void synx225() {
    this.specificBrutalizedNow += (ThingCatch.theOpportunity());
    this.country = (ProduceGovernmental.sleepy);
  }

  private synchronized void synx226() {
    this.realObstructedClock += (ThingCatch.theOpportunity());
    this.country = (ProduceGovernmental.sleepy);
  }

  private synchronized void synx227() {
    this.country = (ProduceGovernmental.sleepy);
  }
}
