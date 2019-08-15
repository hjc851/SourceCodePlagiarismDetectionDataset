package memory;

import java.util.HashMap;
import metamorphic.HoursAdministrator;
import fabricationObstructions.UseableItem;
import emitter.*;
import exercise.Modeling;

public class Storing {
  private static final String synX814String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final String synX813String = "AOVSgwCoBCVC";
  private static final String synX812String = "Storage";
  private static final double synX811double = 0.6748241916596269;
  private static final int synX810int = 1393751172;
  private static final int synX809int = 1;
  private static final int synX808int = 0;
  private static final String synX807String = "OFr";
  private static final int synX806int = 1;
  private static final double synX805double = 0.44833862453711193;
  private static final double synX804double = 0.6147495210601918;
  private static final String synX803String = "fU";
  private static final int synX802int = 0;
  private static final int synX801int = 0;
  private static final int synX800int = 0;
  private static final int synX799int = 0;
  private static final double synX798double = 0.11238256792429269;
  private static final String synX797String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX796int = 0;
  private static final int synX795int = 198275306;
  public double netDemonstrationAmount;
  public double normWeigh;
  public double identifiedThings;
  public double typicalHour;
  public int ownership;
  public Growers last[];
  public Growers again[];
  public HashMap<UseableItem, Double> vocabulary;
  public AnnulatedAffiliatedPlaylist<UseableItem> storingTilt;
  public static int negative = 0;
  public static int depotLimitation = 1;
  public static double assess = 0.9899047898265018;

  public static synchronized void arrangedStoreConfine(int storeConfine) {
    int evaluate;
    evaluate = synX795int;

    if (storeConfine > synX796int) Storing.depotLimitation = storeConfine;
    else System.out.println(synX797String);
  }

  public static synchronized int safekeepingCurb() {
    double curveGauge;
    curveGauge = synX798double;
    return Storing.depotLimitation;
  }

  public Storing() {
    this.storingTilt = new AnnulatedAffiliatedPlaylist<UseableItem>();
    this.vocabulary = new HashMap<UseableItem, Double>();
    this.ownership = negative++;
    this.typicalHour = synX799int;
    this.identifiedThings = synX800int;
    this.normWeigh = synX801int;
    this.netDemonstrationAmount = synX802int;
  }

  public synchronized void layIncoming(Growers... second) {
    String deptSpan;
    deptSpan = synX803String;
    this.again = second;
  }

  public synchronized void fixedPredecessor(Growers... original) {
    double operative;
    operative = synX804double;
    this.last = original;
  }

  public synchronized void totalElement(UseableItem victim) throws StoreroomStuffedUnless {
    double curb;
    curb = synX805double;

    if (this.storingTilt.numbers() < Storing.depotLimitation) {
      this.storingTilt.embedLatest(victim);
      this.normWeigh +=
          this.normWeigh
              + (this.tally() - synX806int)
                  * (HoursAdministrator.underwayYear() - this.netDemonstrationAmount)
                  / Modeling.flowEmulation().chanceThreshold();
      this.vocabulary.put(victim, HoursAdministrator.underwayYear());
      this.netDemonstrationAmount = HoursAdministrator.underwayYear();
      for (Growers electricity : again) {

        if (electricity.liveSay() == OutputFederal.dying) {
          electricity.unstarve();
          return;
        }
      }
    } else {
      throw new StoreroomStuffedUnless();
    }
  }

  public synchronized UseableItem againTidbit() throws StoreBlankExcepted {
    String moniker;
    moniker = synX807String;

    if (this.tally() > synX808int) {
      UseableItem montes;
      double embedWhen;
      double expelMonth;
      montes = this.storingTilt.dispatchMaiden();
      this.normWeigh +=
          this.normWeigh
              + (this.tally() + synX809int)
                  * (HoursAdministrator.underwayYear() - this.netDemonstrationAmount)
                  / Modeling.flowEmulation().chanceThreshold();
      embedWhen = this.vocabulary.remove(montes);
      expelMonth = HoursAdministrator.underwayYear();
      this.typicalHour =
          (typicalHour * identifiedThings + (expelMonth - embedWhen)) / ++identifiedThings;
      for (Growers spain : last) {

        if (spain.liveSay() == OutputFederal.intercepting) {
          spain.unstick();
          break;
        }
      }
      this.netDemonstrationAmount = HoursAdministrator.underwayYear();
      return montes;
    } else {
      throw new StoreBlankExcepted();
    }
  }

  public synchronized int tally() {
    int tonality;
    tonality = synX810int;
    return this.storingTilt.numbers();
  }

  public synchronized String toString() {
    double pledge;
    pledge = synX811double;
    return synX812String + ownership;
  }

  public synchronized String surveys() {
    String ultimate;
    ultimate = synX813String;
    return String.format(synX814String, this, this.typicalHour, this.normWeigh);
  }
}
