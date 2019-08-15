package warehousing;

import java.util.HashMap;
import developmental.WhenGuard;
import factoryRelics.NeocomianElement;
import director.*;
import experiment.Analogy;
import static java.lang.System.out;
import static java.lang.String.format;

public class Entrepot {
  private static final int synX1109int = 0;
  private static final int synX1108int = 1;
  private static final String synX1107String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final int synX1106int = -1130267149;
  private static final String synX1105String = "Storage";
  private static final double synX1104double = 0.46248638114454665;
  private static final double synX1103double = 0.7969474315682553;
  private static final int synX1102int = 1;
  private static final int synX1101int = 0;
  private static final int synX1100int = 711420;
  private static final int synX1099int = 1;
  private static final double synX1098double = 0.27137491501685784;
  private static final double synX1097double = 0.813085019225444;
  private static final double synX1096double = 0.21095563365326075;
  private static final String synX1095String = "q21";
  private static final String synX1094String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX1093int = 0;
  private static final double synX1092double = 0.4959646694918919;
  public static final String chthonianConfine = "vg0rBrVd";
  public static int safekeepingCurb;
  public static int negate;

  public static synchronized void determineShelvingThresholds(int warehouseDemarcation) {
    double juniorRestriction = synX1092double;

    if (warehouseDemarcation > synX1093int) Entrepot.safekeepingCurb = warehouseDemarcation;
    else out.println(synX1094String);
  }

  public static synchronized int warehousingRestriction() {
    String trammel = synX1095String;
    return Entrepot.safekeepingCurb;
  }

  public SphericInterlinkedDirectory<NeocomianElement> safekeepingAgenda;
  public HashMap<NeocomianElement, Double> glossary;
  public Maker now[];
  public Maker former[];
  public int ownership;
  public double typicalHour;
  public double recognizedMaterials;
  public double regularRecount;
  public double closingRaceYears;

  public Entrepot() {
    this.safekeepingAgenda = new SphericInterlinkedDirectory<NeocomianElement>();
    this.glossary = new HashMap<NeocomianElement, Double>();
    this.ownership = negate++;
    this.typicalHour = 0;
    this.recognizedMaterials = 0;
    this.regularRecount = 0;
    this.closingRaceYears = 0;
  }

  public synchronized void arrangedSucceeding(Maker... forthcoming) {
    double call = synX1096double;
    this.now = forthcoming;
  }

  public synchronized void placedLast(Maker... preceding) {
    double premium = synX1097double;
    this.former = preceding;
  }

  public synchronized void bestowArtifact(NeocomianElement items) throws CacheTotalAnomaly {
    double treated = synX1098double;

    if (this.safekeepingAgenda.matter() < Entrepot.safekeepingCurb) {
      this.safekeepingAgenda.embedLatest(items);
      this.regularRecount +=
          (this.consider() - synX1099int)
              * (WhenGuard.prevalentNow() - this.closingRaceYears)
              / Analogy.ongoingPretence().dayBounds();
      this.glossary.put(items, WhenGuard.prevalentNow());
      this.closingRaceYears = WhenGuard.prevalentNow();
      for (Maker leong : now) {

        if (leong.actualPublic() == FilmmakerSay.hunger) {
          leong.unstarve();
          return;
        }
      }
    } else {
      throw new CacheTotalAnomaly();
    }
  }

  public synchronized NeocomianElement adjacentArtifact() throws DepositoryEliminateDeparture {
    int morinWeighting = synX1100int;

    if (this.consider() > synX1101int) {
      NeocomianElement pubis = this.safekeepingAgenda.expelOriginal();
      this.regularRecount +=
          (this.consider() + synX1102int)
              * (WhenGuard.prevalentNow() - this.closingRaceYears)
              / Analogy.ongoingPretence().dayBounds();
      double tuckClock = this.glossary.remove(pubis);
      double ejectHour = WhenGuard.prevalentNow();
      this.typicalHour =
          (typicalHour * recognizedMaterials + (ejectHour - tuckClock)) / ++recognizedMaterials;
      for (Maker electricity : former) {

        if (electricity.actualPublic() == FilmmakerSay.hampering) {
          electricity.unfreeze();
          break;
        }
      }
      this.closingRaceYears = WhenGuard.prevalentNow();
      return pubis;
    } else {
      throw new DepositoryEliminateDeparture();
    }
  }

  public synchronized int consider() {
    double topsBeam = synX1103double;
    return this.safekeepingAgenda.matter();
  }

  public synchronized String toString() {
    double nungWeighting = synX1104double;
    return synX1105String + ownership;
  }

  public synchronized String digits() {
    int littleRoll = synX1106int;
    return format(synX1107String, this, this.typicalHour, this.regularRecount);
  }

  static {
    safekeepingCurb = synX1108int;
    negate = synX1109int;
  }
}
