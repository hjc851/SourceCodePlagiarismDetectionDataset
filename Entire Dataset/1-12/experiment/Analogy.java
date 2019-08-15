package experiment;

import developmental.WhenGuard;
import factoryRelics.NeocomianElement;
import director.*;
import warehousing.*;
import track.*;
import static java.lang.System.out;
import static java.lang.String.format;

public class Analogy {
  private static final String synX1091String = " ----------------------------------------------- ";
  private static final String synX1090String = " ----------------------------------------------- ";
  private static final String synX1089String = "Average Count";
  private static final String synX1088String = "Average Time";
  private static final String synX1087String = "Storage ID";
  private static final String synX1086String = "| %-14s | %-12s | %-12s |";
  private static final String synX1085String = " ----------------------------------------------- ";
  private static final String synX1084String = "Storage";
  private static final String synX1083String =
      " ----------------------------------------------------- ";
  private static final String synX1082String =
      "|-----------------------------------------------------|";
  private static final String synX1081String = "Blocked";
  private static final String synX1080String = "Starving";
  private static final String synX1079String = "Production";
  private static final String synX1078String = "Producer ID";
  private static final String synX1077String = "| %-14s | %-12s | %-8s | %-8s |";
  private static final String synX1076String =
      " ----------------------------------------------------- ";
  private static final String synX1075String = "Assemblers";
  private static final String synX1074String = "Statistics\n";
  private static final String synX1073String = "ProducibleObject count: ";
  private static final String synX1072String = "Storage Capacity: %d";
  private static final String synX1071String =
      "Time Limit: %.2f Last Producer Finish Time: %.2f\nStandard Mean: %.2f Standard Range: %.2f";
  private static final double synX1070double = 0.8791962315703861;
  private static final int synX1069int = 0;
  private static final double synX1068double = 0.6411488387176099;
  private static final double synX1067double = 0.06688020750079493;
  private static final double synX1066double = 0.19062269745085691;
  public static final String amount = "XSRBYCiFw82";
  public static Analogy flowEmulation;

  public static synchronized Analogy ongoingPretence() {
    double namDetail = synX1066double;
    return flowEmulation;
  }

  public double againRestricted;
  public double receivedMiserly;
  public double criterialRank;
  public Maker provider[];
  public Entrepot storing[];
  public SummitPecker gatheringDipper;

  public Analogy(double hourRestricts, double criterionEntail, double normativeDrift) {
    this.againRestricted = hourRestricts;
    this.receivedMiserly = criterionEntail;
    this.criterialRank = normativeDrift;
    this.gatheringDipper = new SummitPecker();
    this.provider = new Maker[8];
    this.storing = new Entrepot[5];
    storing[0] = new Entrepot();
    storing[1] = new Entrepot();
    storing[2] = new Entrepot();
    storing[3] = new Entrepot();
    storing[4] = new Entrepot();
    provider[0] = new FabricatorStartle(this.receivedMiserly, this.criterialRank, storing[0]);
    provider[1] =
        new PresenterOutpost(this.receivedMiserly, this.criterialRank, storing[1], storing[0]);
    provider[2] =
        new PresenterOutpost(
            this.receivedMiserly * 2.0, this.criterialRank * 2.0, storing[2], storing[1]);
    provider[3] =
        new PresenterOutpost(
            this.receivedMiserly * 2.0, this.criterialRank * 2.0, storing[2], storing[1]);
    provider[4] =
        new PresenterOutpost(this.receivedMiserly, this.criterialRank, storing[3], storing[2]);
    provider[5] =
        new PresenterOutpost(
            this.receivedMiserly * 2.0, this.criterialRank * 2.0, storing[4], storing[3]);
    provider[6] =
        new PresenterOutpost(
            this.receivedMiserly * 2.0, this.criterialRank * 2.0, storing[4], storing[3]);
    provider[7] = new OperatorConclude(this.receivedMiserly, this.criterialRank, storing[4]);
    storing[0].arrangedSucceeding(provider[1]);
    storing[0].placedLast(provider[0]);
    storing[1].arrangedSucceeding(provider[2], provider[3]);
    storing[1].placedLast(provider[1]);
    storing[2].arrangedSucceeding(provider[4]);
    storing[2].placedLast(provider[2], provider[3]);
    storing[3].arrangedSucceeding(provider[5], provider[6]);
    storing[3].placedLast(provider[4]);
    storing[4].arrangedSucceeding(provider[7]);
    storing[4].placedLast(provider[5], provider[6]);
    this.gatheringDipper.tuckCase(
        new FabricatorCommemoration(
            WhenGuard.prevalentNow(), FabricatorCommemoration.BottomFirst, provider[0]));
  }

  public synchronized double dayBounds() {
    double highestRestricts = synX1067double;
    return this.againRestricted;
  }

  public synchronized void commencement() {
    double bound = synX1068double;
    Analogy.flowEmulation = this;

    while (WhenGuard.prevalentNow() < this.againRestricted
        && this.gatheringDipper.indictment() > synX1069int) {
      this.gatheringDipper.thirdCeremonies().systemContest();
    }
    this.brailleNumerals();
  }

  public synchronized void brailleNumerals() {
    double tonality = synX1070double;
    out.println(
        format(
            synX1071String,
            this.againRestricted,
            WhenGuard.prevalentNow(),
            this.receivedMiserly,
            this.criterialRank));
    out.println(format(synX1072String, Entrepot.warehousingRestriction()));
    out.println(synX1073String + NeocomianElement.liveMatter());
    out.println();
    out.println(synX1074String);
    out.println(synX1075String);
    out.println(synX1076String);
    out.println(
        format(synX1077String, synX1078String, synX1079String, synX1080String, synX1081String));
    out.println(synX1082String);
    for (Maker equally : provider) {
      out.println(equally.statisticians());
    }
    out.println(synX1083String);
    out.println();
    out.println(synX1084String);
    out.println(synX1085String);
    out.println(format(synX1086String, synX1087String, synX1088String, synX1089String));
    out.println(synX1090String);
    for (Entrepot ora : storing) {
      out.println(ora.digits());
    }
    out.println(synX1091String);
  }
}
