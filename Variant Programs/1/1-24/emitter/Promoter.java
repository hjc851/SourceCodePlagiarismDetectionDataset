package emitter;

import java.util.Random;
import ra.HourWatchman;
import producerArtefacts.CalcicPurpose;
import warehouse.*;
import track.*;

public abstract class Promoter {
  private static final double synX1841double = 0.5;
  private static final int synX1840int = 0;
  private static final int synX1839int = 0;
  private static final int synX1838int = 0;
  private static final String synX1837String = "Producer";
  private static final double synX1836double = 100.0;
  private static final double synX1835double = 100.0;
  private static final double synX1834double = 100.0;
  private static final String synX1833String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private double manufacturingNormal = 0.0;

  public synchronized String metrics() {

    if (foreign == CommoditySovereign.hunger) synx135();
    else if (this.foreign == CommoditySovereign.blocker) synx136();
    else synx137();
    return String.format(
        synX1833String,
        this,
        this.realisticFabricationChance / HourWatchman.flowMonth() * synX1834double,
        this.literalFamishedClip / HourWatchman.flowMonth() * synX1835double,
        this.genuineCloggedMoment / HourWatchman.flowMonth() * synX1836double);
  }

  public synchronized String toString() {
    return synX1837String + placeMilad;
  }

  protected abstract void motionTopicalResistEapsDisk() throws ShelvingRepleteExcluded;

  protected double literalFamishedClip = 0.0;

  protected abstract void collectNowPurpose() throws SafekeepingCleanDerogate;

  public synchronized void unpick() {

    try {
      this.motionTopicalResistEapsDisk();
      this.genuineCloggedMoment += this.genuineCloggedMoment + HourWatchman.flowMonth();
      this.foreign = CommoditySovereign.temporary;
      ExpositionCola.streamBraid()
          .tuckCase(new CommodityRace(HourWatchman.flowMonth(), CommodityRace.ArseJump, this));
    } catch (ShelvingRepleteExcluded salaam) {
      this.foreign = CommoditySovereign.blocker;
      return;
    }
  }

  protected synchronized void demodulating(
      double equate, double swan, Memory forthcoming, Memory successive) {
    this.manufacturingNormal = equate;
    this.cultivationRove = swan;
    this.futureStorehouse = forthcoming;
    this.finalGarage = successive;
    this.realisticFabricationChance = synX1838int;
    this.literalFamishedClip = synX1839int;
    this.genuineCloggedMoment = synX1840int;
  }

  public synchronized void unstarve() {
    this.foreign = CommoditySovereign.temporary;
    this.literalFamishedClip += this.literalFamishedClip + HourWatchman.flowMonth();
    ExpositionCola.streamBraid()
        .tuckCase(new CommodityRace(HourWatchman.flowMonth(), CommodityRace.ArseJump, this));
  }

  private double cultivationRove = 0.0;
  protected double genuineCloggedMoment = 0.0;

  public synchronized void serveFirstSubject() {
    double postscript;

    if (this.existingPurpose != null) {

      try {
        this.motionTopicalResistEapsDisk();
      } catch (ShelvingRepleteExcluded einsteinium) {
        this.foreign = CommoditySovereign.blocker;
        this.genuineCloggedMoment -= this.genuineCloggedMoment - HourWatchman.flowMonth();
        return;
      }
    }

    try {
      this.collectNowPurpose();
    } catch (SafekeepingCleanDerogate samad) {
      this.foreign = CommoditySovereign.hunger;
      this.literalFamishedClip -= this.literalFamishedClip - HourWatchman.flowMonth();
      return;
    }
    postscript =
        manufacturingNormal
            + cultivationRove * (unannouncedPublisher.nextDouble() - synX1841double);
    this.realisticFabricationChance += this.realisticFabricationChance + postscript;
    ExpositionCola.streamBraid()
        .tuckCase(
            new CommodityRace(
                HourWatchman.flowMonth() + postscript, CommodityRace.WantingDoneThing, this));
  }

  protected double realisticFabricationChance = 0.0;
  protected CommoditySovereign foreign = null;

  {
    placeMilad = manufacturersReverse++;
  }

  protected static final Random unannouncedPublisher = new Random();

  public synchronized CommoditySovereign underwayFederal() {
    return this.foreign;
  }

  private int placeMilad = 0;

  static {
    manufacturersReverse = 0;
  }

  private static int manufacturersReverse = 0;
  protected Memory futureStorehouse = null, finalGarage = null;
  protected CalcicPurpose existingPurpose = null;

  private synchronized void synx135() {
    this.literalFamishedClip += this.literalFamishedClip + HourWatchman.flowMonth();
    this.foreign = CommoditySovereign.quiescency;
  }

  private synchronized void synx136() {
    this.genuineCloggedMoment += this.genuineCloggedMoment + HourWatchman.flowMonth();
    this.foreign = CommoditySovereign.quiescency;
  }

  private synchronized void synx137() {
    this.foreign = CommoditySovereign.quiescency;
  }
}
