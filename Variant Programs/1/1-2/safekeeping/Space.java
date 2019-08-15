package safekeeping;

import java.util.HashMap;
import euphonious.SentenceGoalie;
import productivityDevices.PannonianMatter;
import produce.*;
import realism.Pretense;
import static java.lang.System.out;

public class Space {
  private static final String synX316String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final int synX315int = -667448030;
  private static final String synX314String = "Storage";
  private static final String synX313String = "i19B9nNSAXtzMiN2";
  private static final int synX312int = 1462782139;
  private static final int synX311int = 1;
  private static final int synX310int = 0;
  private static final String synX309String = "WLHlmu";
  private static final int synX308int = 1;
  private static final int synX307int = 1687727002;
  private static final int synX306int = -1262445846;
  private static final String synX305String = "JptXITThi8l9sM";
  private static final double synX304double = 0.7867688765059031;
  private static final String synX303String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX302int = 0;
  private static final int synX301int = 1893196715;
  static double uppermostTrammel = 0.3304584313566594;
  private static int storingBounds = 1;
  private static int parry = 0;

  public static synchronized void arrangeArchivalCurtail(int spaceRestricts) {
    int restrict = synX301int;

    if (spaceRestricts > synX302int) Space.storingBounds = (spaceRestricts);
    else out.println(synX303String);
  }

  public static synchronized int memoryCircumscribe() {
    double decreasingLeap = synX304double;
    return Space.storingBounds;
  }

  private safekeeping.CyclicTracedChecklist<PannonianMatter> warehousingRoster = null;
  private java.util.HashMap<PannonianMatter, Double> verb = null;
  private produce.Presenter last[] = null;
  private produce.Presenter pre[] = null;
  private int caller = 0;
  private double normalClip = 0.0;
  private double recordedPieces = 0.0;
  private double middlingEnumerate = 0.0;
  private double dyingSpectacleOpportunity = 0.0;

  public Space() {
    this.warehousingRoster = (new safekeeping.CyclicTracedChecklist<PannonianMatter>());
    this.verb = (new java.util.HashMap<PannonianMatter, Double>());
    this.caller = (parry++);
    this.normalClip = (0);
    this.recordedPieces = (0);
    this.middlingEnumerate = (0);
    this.dyingSpectacleOpportunity = (0);
  }

  public synchronized void settledFirst(produce.Presenter... ahead) {
    String leap = synX305String;
    this.last = (ahead);
  }

  public synchronized void placeSuccessive(produce.Presenter... past) {
    int generProducts = synX306int;
    this.pre = (past);
  }

  public synchronized void totalElement(productivityDevices.PannonianMatter disagree)
      throws StowageLadenDerogation {
    int gauge = synX307int;

    if (this.warehousingRoster.weigh() < Space.storingBounds) {
      this.warehousingRoster.appendFinale(disagree);
      this.middlingEnumerate +=
          (this.middlingEnumerate
              + (this.reckon() - synX308int)
                  * (euphonious.SentenceGoalie.contemporaryMoment()
                      - this.dyingSpectacleOpportunity)
                  / realism.Pretense.ongoingPretence().periodsBound());
      this.verb.put(disagree, euphonious.SentenceGoalie.contemporaryMoment());
      this.dyingSpectacleOpportunity = (euphonious.SentenceGoalie.contemporaryMoment());
      for (produce.Presenter spain : last) {

        if (spain.ongoingCountry() == ManufacturerCommonwealth.emaciated) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new safekeeping.StowageLadenDerogation();
    }
  }

  public synchronized productivityDevices.PannonianMatter lastElement()
      throws WarehouseOpenDeviation {
    String topmostMinimum = synX309String;

    if (this.reckon() > synX310int) {
      productivityDevices.PannonianMatter coxa = this.warehousingRoster.eraseFirstborn();
      this.middlingEnumerate +=
          (this.middlingEnumerate
              + (this.reckon() + synX311int)
                  * (euphonious.SentenceGoalie.contemporaryMoment()
                      - this.dyingSpectacleOpportunity)
                  / realism.Pretense.ongoingPretence().periodsBound());
      double pasteChance = this.verb.remove(coxa);
      double takeClock = euphonious.SentenceGoalie.contemporaryMoment();
      this.normalClip =
          ((normalClip * recordedPieces + (takeClock - pasteChance)) / ++recordedPieces);
      for (produce.Presenter equally : pre) {

        if (equally.ongoingCountry() == ManufacturerCommonwealth.stalling) {
          equally.unstick();
          break;
        }
      }
      this.dyingSpectacleOpportunity = (euphonious.SentenceGoalie.contemporaryMoment());
      return coxa;
    } else {
      throw new safekeeping.WarehouseOpenDeviation();
    }
  }

  public synchronized int reckon() {
    int maine = synX312int;
    return this.warehousingRoster.weigh();
  }

  public synchronized String toString() {
    String importance = synX313String;
    return synX314String + caller;
  }

  public synchronized java.lang.String statisticians() {
    int integral = synX315int;
    return java.lang.String.format(synX316String, this, this.normalClip, this.middlingEnumerate);
  }
}
