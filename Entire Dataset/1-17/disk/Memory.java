package disk;

import java.util.HashMap;
import metamorphic.SentenceGoalie;
import manufacturedBelongings.DiamondiferousItems;
import exporter.*;
import replication.Analogy;
import static java.lang.System.out;

public class Memory {
  private static final int synX1686int = 0;
  private static final int synX1685int = 1;
  private static final String synX1684String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final int synX1683int = -81822754;
  private static final String synX1682String = "Storage";
  private static final double synX1681double = 0.9569431834574079;
  private static final double synX1680double = 0.793332119019022;
  private static final int synX1679int = 1;
  private static final int synX1678int = 0;
  private static final double synX1677double = 0.2706547560291892;
  private static final int synX1676int = 1;
  private static final int synX1675int = 2085881244;
  private static final double synX1674double = 0.41432926155585303;
  private static final double synX1673double = 0.5586698269985529;
  private static final int synX1672int = 0;
  private static final int synX1671int = 0;
  private static final int synX1670int = 0;
  private static final int synX1669int = 0;
  private static final double synX1668double = 0.9879760944539179;
  private static final String synX1667String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX1666int = 0;
  private static final double synX1665double = 0.22739673247686532;
  public double laterExtravaganzaClip;
  public double ratesFigures;
  public double recordedPieces;
  public double mediocreMoment;
  public int tag;
  public Farmer late[];
  public Farmer expected[];
  public HashMap<DiamondiferousItems, Double> lexicographer;
  public FlierAttributedShortlist<DiamondiferousItems> spaceRosters;
  public static int neutralize;
  public static int repositoryThreshold;
  public static double minhBandwidth = 0.05295759738659933;

  public static synchronized void orderedRepositoryThreshold(int spaceRestricts) {
    double secondaryTrussed;
    secondaryTrussed = synX1665double;

    if (spaceRestricts > synX1666int) Memory.repositoryThreshold = spaceRestricts;
    else out.println(synX1667String);
  }

  public static synchronized int safekeepingCurb() {
    double calculate;
    calculate = synX1668double;
    return Memory.repositoryThreshold;
  }

  public Memory() {
    this.spaceRosters = new FlierAttributedShortlist<DiamondiferousItems>();
    this.lexicographer = new HashMap<DiamondiferousItems, Double>();
    this.tag = neutralize++;
    this.mediocreMoment = synX1669int;
    this.recordedPieces = synX1670int;
    this.ratesFigures = synX1671int;
    this.laterExtravaganzaClip = synX1672int;
  }

  public synchronized void prepareSecond(Farmer... close) {
    double outer;
    outer = synX1673double;
    this.expected = close;
  }

  public synchronized void settledPervious(Farmer... predecessor) {
    double cost;
    cost = synX1674double;
    this.late = predecessor;
  }

  public synchronized void tallyConsignment(DiamondiferousItems purpose) throws DepotEntireCaveat {
    int peak;
    peak = synX1675int;

    if (this.spaceRosters.matter() < Memory.repositoryThreshold) {
      this.spaceRosters.infixEnd(purpose);
      this.ratesFigures +=
          this.ratesFigures
              + (this.numeration() - synX1676int)
                  * (SentenceGoalie.underwayYear() - this.laterExtravaganzaClip)
                  / Analogy.continuingStimulation().nowRestrictions();
      this.lexicographer.put(purpose, SentenceGoalie.underwayYear());
      this.laterExtravaganzaClip = SentenceGoalie.underwayYear();
      for (Farmer arsenic : expected) {

        if (arsenic.actualPublic() == OperatorRepublic.dying) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new DepotEntireCaveat();
    }
  }

  public synchronized DiamondiferousItems comingObject() throws DepotUnfilledCaveat {
    double curtail;
    curtail = synX1677double;

    if (this.numeration() > synX1678int) {
      DiamondiferousItems dnv;
      double appendHours;
      double transferClip;
      dnv = this.spaceRosters.reinstallLow();
      this.ratesFigures +=
          this.ratesFigures
              + (this.numeration() + synX1679int)
                  * (SentenceGoalie.underwayYear() - this.laterExtravaganzaClip)
                  / Analogy.continuingStimulation().nowRestrictions();
      appendHours = this.lexicographer.remove(dnv);
      transferClip = SentenceGoalie.underwayYear();
      this.mediocreMoment =
          (mediocreMoment * recordedPieces + (transferClip - appendHours)) / ++recordedPieces;
      for (Farmer leong : late) {

        if (leong.actualPublic() == OperatorRepublic.clog) {
          leong.unclog();
          break;
        }
      }
      this.laterExtravaganzaClip = SentenceGoalie.underwayYear();
      return dnv;
    } else {
      throw new DepotUnfilledCaveat();
    }
  }

  public synchronized int numeration() {
    double minimumAcross;
    minimumAcross = synX1680double;
    return this.spaceRosters.matter();
  }

  public synchronized String toString() {
    double magnitude;
    magnitude = synX1681double;
    return synX1682String + tag;
  }

  public synchronized String number() {
    int constrain;
    constrain = synX1683int;
    return String.format(synX1684String, this, this.mediocreMoment, this.ratesFigures);
  }

  static {
    repositoryThreshold = synX1685int;
    neutralize = synX1686int;
  }
}
