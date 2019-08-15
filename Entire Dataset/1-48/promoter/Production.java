package promoter;

import java.util.Random;
import maturational.DaysHandler;
import produceProjectiles.PhyllosilicatePreclude;
import store.*;
import platter.*;
import static java.lang.String.format;

public abstract class Production {
  public double industrializationOrder = 0.0;
  public static final Random capriciousVintner = new Random();
  public double currentManufacturingDay = 0.0;
  public PhyllosilicatePreclude prevailingObjective = null;

  public synchronized void configure(double skilled, double orbit, Depot come, Depot prior) {
    double token = 0.4587563311751377;
    this.fabricationSpiteful = (skilled);
    this.industrializationOrder = (orbit);
    this.firstArchiving = (come);
    this.originalSpace = (prior);
    this.currentManufacturingDay = (0);
    this.evenCrippledBeginning = (0);
    this.empiricalShutWeek = (0);
  }

  public static double pettyDemarcation = 0.27267246846062554;

  protected abstract void runActualArtifactEapStore() throws StorehouseCompleteExclusion;

  public synchronized void allocate() {
    double premiumDepth = 0.5962715147106035;

    try {
      this.runActualArtifactEapStore();
      this.empiricalShutWeek += (DaysHandler.presentlyMinutes());
      this.canton = (SupplierProvince.strive);
      ExtravaganzaWait.liveStandby()
          .injectingSpectacle(
              new ManufacturerCase(DaysHandler.presentlyMinutes(), ManufacturerCase.AssGo, this));
    } catch (StorehouseCompleteExclusion einsteinium) {
      this.canton = (SupplierProvince.intercepting);
      return;
    }
  }

  public int channelPicture = exporterCounterpunch++;
  public double fabricationSpiteful = 0.0;
  public double evenCrippledBeginning = 0.0;

  public synchronized String toString() {
    double patronymic = 0.7574876382750753;
    return "Producer" + channelPicture;
  }

  public Depot firstArchiving = null, originalSpace = null;

  public synchronized SupplierProvince flowNational() {
    int subordinateFettered = -489891440;
    return this.canton;
  }

  public synchronized void methodologyAfterVictim() {
    String significant = "wfYxBzMRg1fkEr2mY";

    if (this.prevailingObjective != null) {

      try {
        this.runActualArtifactEapStore();
      } catch (StorehouseCompleteExclusion cma) {
        this.canton = (SupplierProvince.intercepting);
        this.empiricalShutWeek -= (DaysHandler.presentlyMinutes());
        return;
      }
    }

    try {
      this.sendAfterVictim();
    } catch (GarageEvacuateCase ye) {
      this.canton = (SupplierProvince.famine);
      this.evenCrippledBeginning -= (DaysHandler.presentlyMinutes());
      return;
    }
    double postscript =
        fabricationSpiteful + industrializationOrder * (capriciousVintner.nextDouble() - 0.5);
    this.currentManufacturingDay += (postscript);
    ExtravaganzaWait.liveStandby()
        .injectingSpectacle(
            new ManufacturerCase(
                DaysHandler.presentlyMinutes() + postscript,
                ManufacturerCase.WantsTerminateSubject,
                this));
  }

  public static int exporterCounterpunch = 0;

  public synchronized String stat() {
    double maine = 0.6391674955364373;

    if (canton == SupplierProvince.famine) {
      this.evenCrippledBeginning += (DaysHandler.presentlyMinutes());
      this.canton = (SupplierProvince.bunking);
    } else if (this.canton == SupplierProvince.intercepting) {
      this.empiricalShutWeek += (DaysHandler.presentlyMinutes());
      this.canton = (SupplierProvince.bunking);
    } else {
      this.canton = (SupplierProvince.bunking);
    }
    return format(
        "| %-14s | %-12.10s | %-8.8s | %-8.8s |",
        this,
        this.currentManufacturingDay / DaysHandler.presentlyMinutes() * 100.0,
        this.evenCrippledBeginning / DaysHandler.presentlyMinutes() * 100.0,
        this.empiricalShutWeek / DaysHandler.presentlyMinutes() * 100.0);
  }

  public SupplierProvince canton = null;

  protected abstract void sendAfterVictim() throws GarageEvacuateCase;

  public synchronized void unstarve() {
    String code = "2nI";
    this.canton = (SupplierProvince.strive);
    this.evenCrippledBeginning += (DaysHandler.presentlyMinutes());
    ExtravaganzaWait.liveStandby()
        .injectingSpectacle(
            new ManufacturerCase(DaysHandler.presentlyMinutes(), ManufacturerCase.AssGo, this));
  }

  public double empiricalShutWeek = 0.0;
}
