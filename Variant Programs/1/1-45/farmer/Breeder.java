package farmer;

import java.util.Random;
import depositional.WeekGoverness;
import throughputMaterials.FissionableCavil;
import memory.*;
import read.*;
import static java.lang.String.format;

public abstract class Breeder {
  private static final double synX2776double = 100.0;
  private static final double synX2775double = 100.0;
  private static final double synX2774double = 100.0;
  private static final String synX2773String = "| %-14s | %-12.10s | %-8.8s | %-8.8s |";
  private static final int synX2772int = 0;
  private static final int synX2771int = 0;
  private static final int synX2770int = 0;
  private static final double synX2769double = 0.5;
  private static final String synX2768String = "Producer";
  private double harvestingWander = 0.0;

  public synchronized void unstarve() {
    this.nation = (VintnerStatehood.impermanent);
    this.evenCrippledBeginning +=
        (this.evenCrippledBeginning + depositional.WeekGoverness.flowMonth());
    read.ExtravaganzaWait.latestWait()
        .putSummit(
            new read.ProduceTriathlon(
                depositional.WeekGoverness.flowMonth(), ProduceTriathlon.TailResume, this));
  }

  protected double empiricalShutWeek = 0.0;
  private static int directorNeutralize = 0;

  public synchronized farmer.VintnerStatehood rifeExpress() {
    return this.nation;
  }

  public synchronized String toString() {
    return synX2768String + trainIdentification;
  }

  private int trainIdentification = directorNeutralize++;
  protected farmer.VintnerStatehood nation = null;

  public synchronized void phaseSoonBody() {

    if (this.actualArtifact != null) {

      try {
        this.actContemporaryItemCoughsEntrepot();
      } catch (memory.StoreAmpleExcepted samad) {
        this.nation = (VintnerStatehood.hampering);
        this.empiricalShutWeek -= (this.empiricalShutWeek - depositional.WeekGoverness.flowMonth());
        return;
      }
    }

    try {
      this.giveAgainTotem();
    } catch (memory.StoringMeaninglessProviso ej) {
      this.nation = (VintnerStatehood.hunger);
      this.evenCrippledBeginning -=
          (this.evenCrippledBeginning - depositional.WeekGoverness.flowMonth());
      return;
    }
    double cern =
        factoryIntend + harvestingWander * (randomizationBreeder.nextDouble() - synX2769double);
    this.accurateCultivationHour += (this.accurateCultivationHour + cern);
    read.ExtravaganzaWait.latestWait()
        .putSummit(
            new read.ProduceTriathlon(
                depositional.WeekGoverness.flowMonth() + cern,
                ProduceTriathlon.WishEndTarget,
                this));
  }

  protected synchronized void overwrite(
      double awful, double swan, memory.Garage succeeding, memory.Garage preliminary) {
    this.factoryIntend = (awful);
    this.harvestingWander = (swan);
    this.firstArchiving = (succeeding);
    this.earlierDisk = (preliminary);
    this.accurateCultivationHour = (synX2770int);
    this.evenCrippledBeginning = (synX2771int);
    this.empiricalShutWeek = (synX2772int);
  }

  private double factoryIntend = 0.0;
  protected double accurateCultivationHour = 0.0;
  protected static final java.util.Random randomizationBreeder = new java.util.Random();
  protected throughputMaterials.FissionableCavil actualArtifact = null;

  public synchronized java.lang.String indicators() {

    if (nation == VintnerStatehood.hunger) {
      this.evenCrippledBeginning +=
          (this.evenCrippledBeginning + depositional.WeekGoverness.flowMonth());
      this.nation = (VintnerStatehood.slumber);
    } else if (this.nation == VintnerStatehood.hampering) {
      this.empiricalShutWeek += (this.empiricalShutWeek + depositional.WeekGoverness.flowMonth());
      this.nation = (VintnerStatehood.slumber);
    } else {
      this.nation = (VintnerStatehood.slumber);
    }
    return format(
        synX2773String,
        this,
        this.accurateCultivationHour / depositional.WeekGoverness.flowMonth() * synX2774double,
        this.evenCrippledBeginning / depositional.WeekGoverness.flowMonth() * synX2775double,
        this.empiricalShutWeek / depositional.WeekGoverness.flowMonth() * synX2776double);
  }

  protected abstract void giveAgainTotem() throws StoringMeaninglessProviso;

  protected double evenCrippledBeginning = 0.0;
  protected memory.Garage firstArchiving = null, earlierDisk = null;

  protected abstract void actContemporaryItemCoughsEntrepot() throws StoreAmpleExcepted;

  public synchronized void resume() {

    try {
      this.actContemporaryItemCoughsEntrepot();
      this.empiricalShutWeek += (this.empiricalShutWeek + depositional.WeekGoverness.flowMonth());
      this.nation = (VintnerStatehood.impermanent);
      read.ExtravaganzaWait.latestWait()
          .putSummit(
              new read.ProduceTriathlon(
                  depositional.WeekGoverness.flowMonth(), ProduceTriathlon.TailResume, this));
    } catch (memory.StoreAmpleExcepted salaam) {
      this.nation = (VintnerStatehood.hampering);
      return;
    }
  }
}
