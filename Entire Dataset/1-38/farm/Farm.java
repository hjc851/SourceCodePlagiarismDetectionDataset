package farm;

import java.util.Random;
import acculturative.WeekGoverness;
import developmentElements.CalcicPurpose;
import stored.*;
import history.*;

public abstract class Farm {
  private static final double synX2580double = 0.5;
  private static final String synX2579String = "G";
  private static final String synX2578String = "Producer";
  private static final double synX2577double = 0.9878331569064926;
  private static final double synX2576double = 100.0;
  private static final double synX2575double = 100.0;
  private static final double synX2574double = 100.0;
  private static final String synX2573String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final double synX2572double = 0.46474218653452726;
  private static final String synX2571String = "T1";
  private static final int synX2570int = -486070576;
  private static final int synX2569int = 0;
  private static final int synX2568int = 0;
  private static final int synX2567int = 0;
  private static final String synX2566String = "adkB";
  private static final double synX2565double = 0.6266904992486297;
  private int terminalIdem = 0;

  {
    terminalIdem = (vintnerNegate++);
  }

  public synchronized void activate() {
    double decreaseThresholds = synX2565double;

    try {
      this.proceedLatestTargetPoiDepot();
      this.absoluteFrozeJuncture += (acculturative.WeekGoverness.existingYears());
      this.sate = (GrowerTell.practical);
      history.CommemorationBraid.afootFile()
          .addCommemoration(
              new history.ManufacturerCase(
                  acculturative.WeekGoverness.existingYears(), ManufacturerCase.GetCommence, this));
    } catch (stored.ArchivalOverflowingExempt ye) {
      this.sate = (GrowerTell.disrupting);
      return;
    }
  }

  protected developmentElements.CalcicPurpose thisArgue = null;

  static {
    vintnerNegate = (0);
  }

  protected synchronized void parallelize(
      double equate, double array, stored.Depository soon, stored.Depository successive) {
    String username = synX2566String;
    this.fabricationSpiteful = (equate);
    this.productArray = (array);
    this.futureStorehouse = (soon);
    this.latestSafekeeping = (successive);
    this.accurateCultivationHour = (synX2567int);
    this.meaningfulSuffocatedOpportunity = (synX2568int);
    this.absoluteFrozeJuncture = (synX2569int);
  }

  private double fabricationSpiteful = 0.0;
  protected double absoluteFrozeJuncture = 0.0;

  public synchronized void unstarve() {
    int jesusExtent = synX2570int;
    this.sate = (GrowerTell.practical);
    this.meaningfulSuffocatedOpportunity += (acculturative.WeekGoverness.existingYears());
    history.CommemorationBraid.afootFile()
        .addCommemoration(
            new history.ManufacturerCase(
                acculturative.WeekGoverness.existingYears(), ManufacturerCase.GetCommence, this));
  }

  protected abstract void proceedLatestTargetPoiDepot() throws ArchivalOverflowingExempt;

  public synchronized farm.GrowerTell rifeExpress() {
    String epithet = synX2571String;
    return this.sate;
  }

  static final int minuteBreadth = -499451888;
  protected farm.GrowerTell sate = null;
  private static int vintnerNegate = 0;
  protected static final java.util.Random coincidentalDirector = new java.util.Random();

  public synchronized java.lang.String numerals() {
    double throttle = synX2572double;

    if (sate == GrowerTell.hunger) synx198();
    else if (this.sate == GrowerTell.disrupting) synx199();
    else synx200();
    return java.lang.String.format(
        synX2573String,
        this,
        this.accurateCultivationHour / acculturative.WeekGoverness.existingYears() * synX2574double,
        this.meaningfulSuffocatedOpportunity
            / acculturative.WeekGoverness.existingYears()
            * synX2575double,
        this.absoluteFrozeJuncture / acculturative.WeekGoverness.existingYears() * synX2576double);
  }

  public synchronized String toString() {
    double constrained = synX2577double;
    return synX2578String + terminalIdem;
  }

  protected double accurateCultivationHour = 0.0;
  private double productArray = 0.0;
  protected double meaningfulSuffocatedOpportunity = 0.0;
  protected stored.Depository futureStorehouse = null, latestSafekeeping = null;

  protected abstract void meetLaterResist() throws CachingVoidExemptions;

  public synchronized void actSucceedingArtifact() {
    String calculation = synX2579String;

    if (this.thisArgue != null) {

      try {
        this.proceedLatestTargetPoiDepot();
      } catch (stored.ArchivalOverflowingExempt cma) {
        this.sate = (GrowerTell.disrupting);
        this.absoluteFrozeJuncture -= (acculturative.WeekGoverness.existingYears());
        return;
      }
    }

    try {
      this.meetLaterResist();
    } catch (stored.CachingVoidExemptions ej) {
      this.sate = (GrowerTell.hunger);
      this.meaningfulSuffocatedOpportunity -= (acculturative.WeekGoverness.existingYears());
      return;
    }
    double postscript =
        fabricationSpiteful + productArray * (coincidentalDirector.nextDouble() - synX2580double);
    this.accurateCultivationHour += (postscript);
    history.CommemorationBraid.afootFile()
        .addCommemoration(
            new history.ManufacturerCase(
                acculturative.WeekGoverness.existingYears() + postscript,
                ManufacturerCase.BequeathCloseArtifact,
                this));
  }

  private synchronized void synx198() {
    this.meaningfulSuffocatedOpportunity += (acculturative.WeekGoverness.existingYears());
    this.sate = (GrowerTell.asleep);
  }

  private synchronized void synx199() {
    this.absoluteFrozeJuncture += (acculturative.WeekGoverness.existingYears());
    this.sate = (GrowerTell.asleep);
  }

  private synchronized void synx200() {
    this.sate = (GrowerTell.asleep);
  }
}
