package output;

import java.util.Random;
import indiscernible.HourWatchman;
import producingAim.DepositionalObjet;
import storeroom.*;
import accomplishment.*;

public abstract class Emitter {
  private static final String synX1771String = "Producer";
  private static final double synX1770double = 100.0;
  private static final double synX1769double = 100.0;
  private static final double synX1768double = 100.0;
  private static final String synX1767String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final int synX1766int = 0;
  private static final int synX1765int = 0;
  private static final int synX1764int = 0;
  private static final double synX1763double = 0.5;

  public synchronized void summonsAheadElement() {

    if (this.topicalResist != null) {

      try {
        this.strikeUnderwayOpposeEmapWarehouse();
      } catch (storeroom.MemoryFullyExcept salaam) {
        this.national = (ProducingPublic.hindering);
        this.effectiveStoppedPeriods -=
            (this.effectiveStoppedPeriods - indiscernible.HourWatchman.prevalentNow());
        return;
      }
    }

    try {
      this.awardedNewMatter();
    } catch (storeroom.DiskRansackedObjection samad) {
      this.national = (ProducingPublic.hungry);
      this.definitiveParchedYears -=
          (this.definitiveParchedYears - indiscernible.HourWatchman.prevalentNow());
      return;
    }
    double writes =
        producesPoor + cultivationRove * (probabilityFabricator.nextDouble() - synX1763double);
    this.definitiveDevelopmentYears += (this.definitiveDevelopmentYears + writes);
    accomplishment.SymposiumSufferance.incumbentBacklog()
        .enterGala(
            new accomplishment.DirectorSeminar(
                indiscernible.HourWatchman.prevalentNow() + writes,
                DirectorSeminar.WannaEndsPreclude,
                this));
  }

  private static int commodityDispel = 0;

  static {
    commodityDispel = (0);
  }

  protected synchronized void unhide(
      double stingy, double rate, storeroom.Storeroom expected, storeroom.Storeroom prior) {
    this.producesPoor = (stingy);
    this.cultivationRove = (rate);
    this.againRepository = (expected);
    this.preStoreroom = (prior);
    this.definitiveDevelopmentYears = (synX1764int);
    this.definitiveParchedYears = (synX1765int);
    this.effectiveStoppedPeriods = (synX1766int);
  }

  public synchronized void unstarve() {
    this.national = (ProducingPublic.doing);
    this.definitiveParchedYears +=
        (this.definitiveParchedYears + indiscernible.HourWatchman.prevalentNow());
    accomplishment.SymposiumSufferance.incumbentBacklog()
        .enterGala(
            new accomplishment.DirectorSeminar(
                indiscernible.HourWatchman.prevalentNow(), DirectorSeminar.AssGo, this));
  }

  public synchronized java.lang.String information() {

    if (national == ProducingPublic.hungry) {
      this.definitiveParchedYears +=
          (this.definitiveParchedYears + indiscernible.HourWatchman.prevalentNow());
      this.national = (ProducingPublic.diaper);
    } else if (this.national == ProducingPublic.hindering) {
      this.effectiveStoppedPeriods +=
          (this.effectiveStoppedPeriods + indiscernible.HourWatchman.prevalentNow());
      this.national = (ProducingPublic.diaper);
    } else {
      this.national = (ProducingPublic.diaper);
    }
    return java.lang.String.format(
        synX1767String,
        this,
        this.definitiveDevelopmentYears
            / indiscernible.HourWatchman.prevalentNow()
            * synX1768double,
        this.definitiveParchedYears / indiscernible.HourWatchman.prevalentNow() * synX1769double,
        this.effectiveStoppedPeriods / indiscernible.HourWatchman.prevalentNow() * synX1770double);
  }

  public synchronized String toString() {
    return synX1771String + terminusMap;
  }

  public synchronized output.ProducingPublic streamSate() {
    return this.national;
  }

  {
    terminusMap = (commodityDispel++);
  }

  protected double definitiveParchedYears = 0.0;

  protected abstract void awardedNewMatter() throws DiskRansackedObjection;

  protected double effectiveStoppedPeriods = 0.0;
  private double producesPoor = 0.0;
  private double cultivationRove = 0.0;
  protected producingAim.DepositionalObjet topicalResist = null;

  protected abstract void strikeUnderwayOpposeEmapWarehouse() throws MemoryFullyExcept;

  private int terminusMap = 0;
  protected double definitiveDevelopmentYears = 0.0;

  public synchronized void reroute() {

    try {
      this.strikeUnderwayOpposeEmapWarehouse();
      this.effectiveStoppedPeriods +=
          (this.effectiveStoppedPeriods + indiscernible.HourWatchman.prevalentNow());
      this.national = (ProducingPublic.doing);
      accomplishment.SymposiumSufferance.incumbentBacklog()
          .enterGala(
              new accomplishment.DirectorSeminar(
                  indiscernible.HourWatchman.prevalentNow(), DirectorSeminar.AssGo, this));
    } catch (storeroom.MemoryFullyExcept ej) {
      this.national = (ProducingPublic.hindering);
      return;
    }
  }

  protected storeroom.Storeroom againRepository = null, preStoreroom = null;
  protected output.ProducingPublic national = null;
  protected static final java.util.Random probabilityFabricator = new java.util.Random();
}
