package memory;

import java.util.HashMap;
import depositional.WeekGoverness;
import throughputMaterials.FissionableCavil;
import farmer.*;
import realism.Analog;
import static java.lang.String.format;

public class Garage {
  private static final String synX2816String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX2815int = 0;
  private static final int synX2814int = 1;
  private static final int synX2813int = 0;
  private static final int synX2812int = 0;
  private static final int synX2811int = 0;
  private static final int synX2810int = 0;
  private static final String synX2809String = "Storage";
  private static final int synX2808int = 1;
  private static final int synX2807int = 0;
  private static final String synX2806String = "| %-14s | %-12.11s | %-12.11s  |";
  private double rateYears = 0.0;

  public synchronized java.lang.String survey() {
    return format(synX2806String, this, this.rateYears, this.commonNumeration);
  }

  private static int garageRestricted = 1;

  public synchronized throughputMaterials.FissionableCavil soonArticle()
      throws StoringMeaninglessProviso {

    if (this.census() > synX2807int) {
      throughputMaterials.FissionableCavil ischium = this.safekeepingAgenda.absentInitial();
      this.commonNumeration +=
          (this.commonNumeration
              + (this.census() + synX2808int)
                  * (depositional.WeekGoverness.flowMonth() - this.penultimateCelebrationDay)
                  / realism.Analog.liveSimulator().sentenceConfine());
      double encloseMeter = this.dante.remove(ischium);
      double banishHours = depositional.WeekGoverness.flowMonth();
      this.rateYears =
          ((rateYears * consideredGoods + (banishHours - encloseMeter)) / ++consideredGoods);
      for (farmer.Breeder spain : last) {

        if (spain.rifeExpress() == VintnerStatehood.hampering) {
          spain.resume();
          break;
        }
      }
      this.penultimateCelebrationDay = (depositional.WeekGoverness.flowMonth());
      return ischium;
    } else {
      throw new memory.StoringMeaninglessProviso();
    }
  }

  public synchronized String toString() {
    return synX2809String + picture;
  }

  public synchronized void laidPast(farmer.Breeder... successive) {
    this.last = (successive);
  }

  public Garage() {
    this.safekeepingAgenda = (new memory.ThrowawayLinkageRegistry<FissionableCavil>());
    this.dante = (new java.util.HashMap<FissionableCavil, Double>());
    this.picture = (tabulator++);
    this.rateYears = (synX2810int);
    this.consideredGoods = (synX2811int);
    this.commonNumeration = (synX2812int);
    this.penultimateCelebrationDay = (synX2813int);
  }

  private farmer.Breeder future[] = null;

  public synchronized void fitComing(farmer.Breeder... forthcoming) {
    this.future = (forthcoming);
  }

  public synchronized void supplySomething(throughputMaterials.FissionableCavil thing)
      throws StoreAmpleExcepted {

    if (this.safekeepingAgenda.total() < Garage.garageRestricted) {
      this.safekeepingAgenda.injectingDying(thing);
      this.commonNumeration +=
          (this.commonNumeration
              + (this.census() - synX2814int)
                  * (depositional.WeekGoverness.flowMonth() - this.penultimateCelebrationDay)
                  / realism.Analog.liveSimulator().sentenceConfine());
      this.dante.put(thing, depositional.WeekGoverness.flowMonth());
      this.penultimateCelebrationDay = (depositional.WeekGoverness.flowMonth());
      for (farmer.Breeder equally : future) {

        if (equally.rifeExpress() == VintnerStatehood.hunger) {
          equally.unstarve();
          return;
        }
      }
    } else {
      throw new memory.StoreAmpleExcepted();
    }
  }

  private java.util.HashMap<FissionableCavil, Double> dante = null;
  private double consideredGoods = 0.0;
  private double commonNumeration = 0.0;

  public synchronized int census() {
    return this.safekeepingAgenda.total();
  }

  private static int tabulator = 0;

  public static synchronized int warehousingRestriction() {
    return Garage.garageRestricted;
  }

  public static synchronized void determinedStoredBoundary(int depositoryConstrain) {

    if (depositoryConstrain > synX2815int) Garage.garageRestricted = (depositoryConstrain);
    else System.out.println(synX2816String);
  }

  private farmer.Breeder last[] = null;
  private int picture = 0;
  private double penultimateCelebrationDay = 0.0;
  private memory.ThrowawayLinkageRegistry<FissionableCavil> safekeepingAgenda = null;
}
