package farm;

import java.util.Random;
import ontogenetic.PeriodWarden;
import extractionTreasures.ImmiscibleDisagree;
import safekeeping.*;
import ledger.*;
import static java.lang.String.format;

public abstract class Growers {
  private static final double synX2214double = 100.0;
  private static final double synX2213double = 100.0;
  private static final double synX2212double = 100.0;
  private static final String synX2211String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final String synX2210String = "Producer";
  private static final int synX2209int = 0;
  private static final double synX2208double = 0.5;
  private static final int synX2207int = 0;
  private static final int synX2206int = 0;
  private static final int synX2205int = 0;
  public static int manufacturersReverse = 0;
  public Warehouses nowArchival = null, lateMemory = null;
  public ImmiscibleDisagree contemporaryItem = null;

  {
    terminusMap = manufacturersReverse++;
  }

  public int terminusMap = 0;

  public synchronized void unpick() {

    try {
      this.pushExistingPurposeOfficesArchival();
      this.definitiveBannedYears += PeriodWarden.existingYears();
      this.cantons = DirectorNational.struggling;
      CeremonyPenis.newReaper()
          .embedCarnival(
              new FarmExposition(PeriodWarden.existingYears(), FarmExposition.BumGet, this));
    } catch (StowageLadenDerogation salaam) {
      this.cantons = DirectorNational.halting;
      return;
    }
  }

  public double factoryStray = 0.0;

  public synchronized void synchronising(
      double average, double rove, Warehouses later, Warehouses earlier) {
    this.produceLittle = average;
    this.factoryStray = rove;
    this.nowArchival = later;
    this.lateMemory = earlier;
    this.preciseManufacturedAmount = synX2205int;
    this.empiricalUnderfedWeek = synX2206int;
    this.definitiveBannedYears = synX2207int;
  }

  protected abstract void meetLaterResist() throws ArchivingBareDistinction;

  public synchronized void proceduresExpectedObjet() {
    double cern;

    if (this.contemporaryItem != null) {

      try {
        this.pushExistingPurposeOfficesArchival();
      } catch (StowageLadenDerogation cma) {
        this.cantons = DirectorNational.halting;
        this.definitiveBannedYears -= PeriodWarden.existingYears();
        return;
      }
    }

    try {
      this.meetLaterResist();
    } catch (ArchivingBareDistinction samad) {
      this.cantons = DirectorNational.dying;
      this.empiricalUnderfedWeek -= PeriodWarden.existingYears();
      return;
    }
    cern = produceLittle + factoryStray * (wantonEmitter.nextDouble() - synX2208double);
    this.preciseManufacturedAmount += cern;
    CeremonyPenis.newReaper()
        .embedCarnival(
            new FarmExposition(
                PeriodWarden.existingYears() + cern, FarmExposition.WannaEndsPreclude, this));
  }

  public double empiricalUnderfedWeek = 0.0;

  protected abstract void pushExistingPurposeOfficesArchival() throws StowageLadenDerogation;

  static {
    manufacturersReverse = synX2209int;
  }

  public synchronized DirectorNational incumbentLand() {
    return this.cantons;
  }

  public synchronized void unstarve() {
    this.cantons = DirectorNational.struggling;
    this.empiricalUnderfedWeek += PeriodWarden.existingYears();
    CeremonyPenis.newReaper()
        .embedCarnival(
            new FarmExposition(PeriodWarden.existingYears(), FarmExposition.BumGet, this));
  }

  public static final Random wantonEmitter = new Random();
  public DirectorNational cantons = null;
  public double definitiveBannedYears = 0.0;
  public double produceLittle = 0.0;

  public synchronized String toString() {
    return synX2210String + terminusMap;
  }

  public synchronized String statisticians() {

    if (cantons == DirectorNational.dying) synx171();
    else if (this.cantons == DirectorNational.halting) synx172();
    else synx173();
    return format(
        synX2211String,
        this,
        this.preciseManufacturedAmount / PeriodWarden.existingYears() * synX2212double,
        this.empiricalUnderfedWeek / PeriodWarden.existingYears() * synX2213double,
        this.definitiveBannedYears / PeriodWarden.existingYears() * synX2214double);
  }

  public double preciseManufacturedAmount = 0.0;

  private synchronized void synx171() {
    this.empiricalUnderfedWeek += PeriodWarden.existingYears();
    this.cantons = DirectorNational.nap;
  }

  private synchronized void synx172() {
    this.definitiveBannedYears += PeriodWarden.existingYears();
    this.cantons = DirectorNational.nap;
  }

  private synchronized void synx173() {
    this.cantons = DirectorNational.nap;
  }
}
