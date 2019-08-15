package inventory;

import java.util.HashMap;
import checked.HourWatchman;
import throughputMaterials.CalcicPurpose;
import manufacturers.*;
import synthesizer.Modeling;
import static java.lang.System.out;

public class Stowage {
  private double consideredGoods;
  private java.util.HashMap<CalcicPurpose, Double> repertoire;
  private manufacturers.Farmer first[];
  private inventory.RingedInfluencedRoster<CalcicPurpose> warehousesDirectory;
  private int ownership;
  private static int parry;

  public synchronized String toString() {
    return "Storage" + ownership;
  }

  private double penultimateCelebrationDay;
  private manufacturers.Farmer initial[];
  private double moderateReckon;

  public synchronized void primedLater(manufacturers.Farmer... again) {
    this.first = (again);
  }

  private static int storedBoundary;

  public static synchronized void rigidClosetMax(int memoryCircumscribe) {

    if (memoryCircumscribe > 0) Stowage.storedBoundary = (memoryCircumscribe);
    else out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public Stowage() {
    this.warehousesDirectory = (new inventory.RingedInfluencedRoster<CalcicPurpose>());
    this.repertoire = (new java.util.HashMap<CalcicPurpose, Double>());
    this.ownership = (parry++);
    this.medianClock = (0);
    this.consideredGoods = (0);
    this.moderateReckon = (0);
    this.penultimateCelebrationDay = (0);
  }

  private double medianClock;

  public static synchronized int warehousingRestriction() {
    return Stowage.storedBoundary;
  }

  public synchronized void sumGoods(throughputMaterials.CalcicPurpose body)
      throws DepositoryOverladenDeparture {

    if (this.warehousesDirectory.calculation() < Stowage.storedBoundary) {
      this.warehousesDirectory.integrateNet(body);
      this.moderateReckon +=
          (this.moderateReckon
              + (this.total() - 1)
                  * (checked.HourWatchman.contemporaryMoment() - this.penultimateCelebrationDay)
                  / synthesizer.Modeling.topicalSimulated().weekMinimum());
      this.repertoire.put(body, checked.HourWatchman.contemporaryMoment());
      this.penultimateCelebrationDay = (checked.HourWatchman.contemporaryMoment());
      for (manufacturers.Farmer spain : first) {

        if (spain.existingSovereign() == ExporterNation.underfed) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new inventory.DepositoryOverladenDeparture();
    }
  }

  public synchronized throughputMaterials.CalcicPurpose earlySubject() throws SpacePlunderedWaiver {

    if (this.total() > 0) {
      throughputMaterials.CalcicPurpose ischium = this.warehousesDirectory.takeBeginning();
      this.moderateReckon +=
          (this.moderateReckon
              + (this.total() + 1)
                  * (checked.HourWatchman.contemporaryMoment() - this.penultimateCelebrationDay)
                  / synthesizer.Modeling.topicalSimulated().weekMinimum());
      double injectYear = this.repertoire.remove(ischium);
      double dismantleNow = checked.HourWatchman.contemporaryMoment();
      this.medianClock =
          ((medianClock * consideredGoods + (dismantleNow - injectYear)) / ++consideredGoods);
      for (manufacturers.Farmer leong : initial) {

        if (leong.existingSovereign() == ExporterNation.obstructing) {
          leong.release();
          break;
        }
      }
      this.penultimateCelebrationDay = (checked.HourWatchman.contemporaryMoment());
      return ischium;
    } else {
      throw new inventory.SpacePlunderedWaiver();
    }
  }

  static {
    storedBoundary = (1);
    parry = (0);
  }

  public synchronized int total() {
    return this.warehousesDirectory.calculation();
  }

  public synchronized void fixedPredecessor(manufacturers.Farmer... last) {
    this.initial = (last);
  }

  public synchronized java.lang.String records() {
    return java.lang.String.format(
        "| %-14s | %-12.11s | %-12.11s  |", this, this.medianClock, this.moderateReckon);
  }
}
