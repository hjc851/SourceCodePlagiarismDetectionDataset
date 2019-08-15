package filmmaker;

import java.util.Random;
import maturational.YearsHolder;
import cultivationBodies.SpodumeneThing;
import archival.*;
import history.*;

public abstract class Exporter {
  private static final int synX2143int = 0;
  private static final int synX2142int = 0;
  private static final int synX2141int = 0;
  private static final double synX2140double = 100.0;
  private static final double synX2139double = 100.0;
  private static final double synX2138double = 100.0;
  private static final String synX2137String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final String synX2136String = "Producer";
  private static final int synX2135int = 0;
  private static final double synX2134double = 0.5;
  protected double substantialHarvestingAgain;
  protected double literalFamishedClip;

  public synchronized void proceedingNewMatter() {
    double cern;

    if (this.continuingThing != null) {

      try {
        this.proceedLatestTargetPoiDepot();
      } catch (archival.DepotEntireCaveat salaam) {
        this.land = PresenterSubmit.halt;
        this.accurateHamperedHour -= maturational.YearsHolder.theOpportunity();
        return;
      }
    }

    try {
      this.qualifyThenArgue();
    } catch (archival.StoreroomPillagedUnless einsteinium) {
      this.land = PresenterSubmit.orphaned;
      this.literalFamishedClip -= maturational.YearsHolder.theOpportunity();
      return;
    }
    cern = producesPoor + producingReach * (probabilityFabricator.nextDouble() - synX2134double);
    this.substantialHarvestingAgain += cern;
    history.CeremoniesDragon.existingJunk()
        .installCeremonies(
            new history.OperatorContest(
                maturational.YearsHolder.theOpportunity() + cern,
                OperatorContest.ExtendsCompletesDisagree,
                this));
  }

  static {
    vintnerNegate = synX2135int;
  }

  protected filmmaker.PresenterSubmit land;
  private double producingReach;
  protected archival.Archival lastStored, agoArchival;
  protected cultivationBodies.SpodumeneThing continuingThing;
  private double producesPoor;

  public synchronized filmmaker.PresenterSubmit prevalentGovernmental() {
    return this.land;
  }

  private static int vintnerNegate;

  public synchronized void unstarve() {
    this.land = PresenterSubmit.employed;
    this.literalFamishedClip += maturational.YearsHolder.theOpportunity();
    history.CeremoniesDragon.existingJunk()
        .installCeremonies(
            new history.OperatorContest(
                maturational.YearsHolder.theOpportunity(), OperatorContest.ButtDepart, this));
  }

  public synchronized String toString() {
    return synX2136String + depotsPictures;
  }

  protected abstract void qualifyThenArgue() throws StoreroomPillagedUnless;

  protected double accurateHamperedHour;

  {
    depotsPictures = vintnerNegate++;
  }

  public synchronized java.lang.String stats() {

    if (land == PresenterSubmit.orphaned) synx153();
    else if (this.land == PresenterSubmit.halt) synx154();
    else synx155();
    return java.lang.String.format(
        synX2137String,
        this,
        this.substantialHarvestingAgain
            / maturational.YearsHolder.theOpportunity()
            * synX2138double,
        this.literalFamishedClip / maturational.YearsHolder.theOpportunity() * synX2139double,
        this.accurateHamperedHour / maturational.YearsHolder.theOpportunity() * synX2140double);
  }

  protected abstract void proceedLatestTargetPoiDepot() throws DepotEntireCaveat;

  public synchronized void exit() {

    try {
      this.proceedLatestTargetPoiDepot();
      this.accurateHamperedHour += maturational.YearsHolder.theOpportunity();
      this.land = PresenterSubmit.employed;
      history.CeremoniesDragon.existingJunk()
          .installCeremonies(
              new history.OperatorContest(
                  maturational.YearsHolder.theOpportunity(), OperatorContest.ButtDepart, this));
    } catch (archival.DepotEntireCaveat samad) {
      this.land = PresenterSubmit.halt;
      return;
    }
  }

  protected synchronized void degauss(
      double awful, double ambit, archival.Archival close, archival.Archival earlier) {
    this.producesPoor = awful;
    this.producingReach = ambit;
    this.lastStored = close;
    this.agoArchival = earlier;
    this.substantialHarvestingAgain = synX2141int;
    this.literalFamishedClip = synX2142int;
    this.accurateHamperedHour = synX2143int;
  }

  private int depotsPictures;
  protected static final java.util.Random probabilityFabricator = new java.util.Random();

  private synchronized void synx153() {
    this.literalFamishedClip += maturational.YearsHolder.theOpportunity();
    this.land = PresenterSubmit.hibernating;
  }

  private synchronized void synx154() {
    this.accurateHamperedHour += maturational.YearsHolder.theOpportunity();
    this.land = PresenterSubmit.hibernating;
  }

  private synchronized void synx155() {
    this.land = PresenterSubmit.hibernating;
  }
}
