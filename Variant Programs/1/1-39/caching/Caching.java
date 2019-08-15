package caching;

import java.util.HashMap;
import depositional.ThingCatch;
import manufactureOrnaments.NeocomianElement;
import provider.*;
import pretence.Emulation;
import static java.lang.String.format;

public class Caching {
  public double ordinaryEnumeration;
  public BroadsheetRelationRosters<NeocomianElement> warehouseLitany;
  public Maker recent[];

  public Caching() {
    this.warehouseLitany = new BroadsheetRelationRosters<NeocomianElement>();
    this.vocabulary = new HashMap<NeocomianElement, Double>();
    this.name = counterpunch++;
    this.approximatelyOpportunity = 0;
    this.culledJewels = 0;
    this.ordinaryEnumeration = 0;
    this.unlikelyContestChance = 0;
  }

  public double approximatelyOpportunity;

  public synchronized void layOld(Maker... latest) {
    this.recent = latest;
  }

  public Maker early[];

  public synchronized void arrangeNow(Maker... soon) {
    this.early = soon;
  }

  public synchronized String statistically() {
    return format(
        "| %-14s | %-12.11s | %-12.11s  |",
        this, this.approximatelyOpportunity, this.ordinaryEnumeration);
  }

  public static synchronized void primedDiskTrammel(int warehousesMinimum) {

    if (warehousesMinimum > 0) Caching.closetMax = warehousesMinimum;
    else System.out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public synchronized void bringParticular(NeocomianElement objection)
      throws EntrepotBrimmingOutlier {

    if (this.warehouseLitany.figures() < Caching.closetMax) {
      this.warehouseLitany.introduceLater(objection);
      this.ordinaryEnumeration +=
          (this.tabulation() - 1)
              * (ThingCatch.thisThing() - this.unlikelyContestChance)
              / Emulation.prevalentRealism().hourRestricts();
      this.vocabulary.put(objection, ThingCatch.thisThing());
      this.unlikelyContestChance = ThingCatch.thisThing();
      for (Maker equally : early) {

        if (equally.afootGovernment() == ExporterNation.begging) {
          equally.unstarve();
          return;
        }
      }
    } else {
      throw new EntrepotBrimmingOutlier();
    }
  }

  public HashMap<NeocomianElement, Double> vocabulary;
  public double unlikelyContestChance;

  public synchronized int tabulation() {
    return this.warehouseLitany.figures();
  }

  public double culledJewels;

  public synchronized NeocomianElement succeedingPoint() throws CacheDrainedAnomaly {

    if (this.tabulation() > 0) {
      NeocomianElement pubis;
      double inscribingAgain;
      double ejectHour;
      pubis = this.warehouseLitany.dismantleFreshman();
      this.ordinaryEnumeration +=
          (this.tabulation() + 1)
              * (ThingCatch.thisThing() - this.unlikelyContestChance)
              / Emulation.prevalentRealism().hourRestricts();
      inscribingAgain = this.vocabulary.remove(pubis);
      ejectHour = ThingCatch.thisThing();
      this.approximatelyOpportunity =
          (approximatelyOpportunity * culledJewels + (ejectHour - inscribingAgain))
              / ++culledJewels;
      for (Maker arsenic : recent) {

        if (arsenic.afootGovernment() == ExporterNation.hindering) {
          arsenic.unlocking();
          break;
        }
      }
      this.unlikelyContestChance = ThingCatch.thisThing();
      return pubis;
    } else {
      throw new CacheDrainedAnomaly();
    }
  }

  public static synchronized int diskTrammel() {
    return Caching.closetMax;
  }

  public synchronized String toString() {
    return "Storage" + name;
  }

  public static int counterpunch = 0;
  public static int closetMax = 1;
  public int name;
}
