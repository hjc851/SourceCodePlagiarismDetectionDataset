package grower;

import java.util.Random;
import acculturative.HoursAdministrator;
import extractionTreasures.ExhaustibleBody;
import warehouse.*;
import tape.*;
import static java.lang.String.format;

public abstract class Producing {
  private static final int synX400int = 0;
  private static final int synX399int = 0;
  private static final int synX398int = 0;
  private static final double synX397double = 0.5;
  private static final String synX396String = "Producer";
  private static final double synX395double = 100.0;
  private static final double synX394double = 100.0;
  private static final double synX393double = 100.0;
  private static final String synX392String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  protected warehouse.Store soonWarehouses, preliminaryCloset;
  private int broadcasterOwnership = exporterCounterpunch++;

  public synchronized java.lang.String survey() {

    if (foreign == PublisherExpress.orphaned) synx36();
    else if (this.foreign == PublisherExpress.hampering) synx37();
    else synx38();
    return format(
        synX392String,
        this,
        this.actualitySupplyMonth
            / acculturative.HoursAdministrator.circulatingPeriods()
            * synX393double,
        this.evenCrippledBeginning
            / acculturative.HoursAdministrator.circulatingPeriods()
            * synX394double,
        this.genuineCloggedMoment
            / acculturative.HoursAdministrator.circulatingPeriods()
            * synX395double);
  }

  private double factoryIntend;

  public synchronized grower.PublisherExpress liveSay() {
    return this.foreign;
  }

  protected abstract void proceedLatestTargetPoiDepot() throws StoreroomStuffedUnless;

  private double outputScope;

  public synchronized String toString() {
    return synX396String + broadcasterOwnership;
  }

  protected double actualitySupplyMonth;

  public synchronized void unlock() {

    try {
      this.proceedLatestTargetPoiDepot();
      this.genuineCloggedMoment += acculturative.HoursAdministrator.circulatingPeriods();
      this.foreign = PublisherExpress.impermanent;
      tape.CelebrationBacklog.thisDong()
          .incorporatedRally(
              new tape.PresenterSymposium(
                  acculturative.HoursAdministrator.circulatingPeriods(),
                  PresenterSymposium.BehindRestart,
                  this));
    } catch (warehouse.StoreroomStuffedUnless ej) {
      this.foreign = PublisherExpress.hampering;
      return;
    }
  }

  protected static final java.util.Random samplingOutput = new java.util.Random();
  protected double evenCrippledBeginning;

  public synchronized void treatComingOppose() {

    if (this.presentlyItems != null) {

      try {
        this.proceedLatestTargetPoiDepot();
      } catch (warehouse.StoreroomStuffedUnless samad) {
        this.foreign = PublisherExpress.hampering;
        this.genuineCloggedMoment -= acculturative.HoursAdministrator.circulatingPeriods();
        return;
      }
    }

    try {
      this.collectNowPurpose();
    } catch (warehouse.ClosetStrippedDispensation einsteinium) {
      this.foreign = PublisherExpress.orphaned;
      this.evenCrippledBeginning -= acculturative.HoursAdministrator.circulatingPeriods();
      return;
    }
    double vig = factoryIntend + outputScope * (samplingOutput.nextDouble() - synX397double);
    this.actualitySupplyMonth += vig;
    tape.CelebrationBacklog.thisDong()
        .incorporatedRally(
            new tape.PresenterSymposium(
                acculturative.HoursAdministrator.circulatingPeriods() + vig,
                PresenterSymposium.ExtendsCompletesDisagree,
                this));
  }

  protected grower.PublisherExpress foreign;

  protected abstract void collectNowPurpose() throws ClosetStrippedDispensation;

  protected double genuineCloggedMoment;
  protected extractionTreasures.ExhaustibleBody presentlyItems;

  public synchronized void unstarve() {
    this.foreign = PublisherExpress.impermanent;
    this.evenCrippledBeginning += acculturative.HoursAdministrator.circulatingPeriods();
    tape.CelebrationBacklog.thisDong()
        .incorporatedRally(
            new tape.PresenterSymposium(
                acculturative.HoursAdministrator.circulatingPeriods(),
                PresenterSymposium.BehindRestart,
                this));
  }

  protected synchronized void initialize(
      double skilled, double ramble, warehouse.Store come, warehouse.Store pre) {
    this.factoryIntend = skilled;
    this.outputScope = ramble;
    this.soonWarehouses = come;
    this.preliminaryCloset = pre;
    this.actualitySupplyMonth = synX398int;
    this.evenCrippledBeginning = synX399int;
    this.genuineCloggedMoment = synX400int;
  }

  private static int exporterCounterpunch = 0;

  private synchronized void synx36() {
    this.evenCrippledBeginning += acculturative.HoursAdministrator.circulatingPeriods();
    this.foreign = PublisherExpress.unerect;
  }

  private synchronized void synx37() {
    this.genuineCloggedMoment += acculturative.HoursAdministrator.circulatingPeriods();
    this.foreign = PublisherExpress.unerect;
  }

  private synchronized void synx38() {
    this.foreign = PublisherExpress.unerect;
  }
}
