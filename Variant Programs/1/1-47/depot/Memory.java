package depot;

import java.util.HashMap;
import depositional.PeriodWarden;
import developmentElements.NeocomianElement;
import operator.*;
import experiment.Mock;

public class Memory {
  private static final int synX2998int = 0;
  private static final int synX2997int = 1;
  private static final String synX2996String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final double synX2995double = 0.14002636996884887;
  private static final String synX2994String = "Storage";
  private static final int synX2993int = -1112411986;
  private static final String synX2992String = "gv1b8HdncIcN0kH";
  private static final int synX2991int = 1;
  private static final int synX2990int = 0;
  private static final double synX2989double = 0.5198456516514449;
  private static final int synX2988int = 1;
  private static final double synX2987double = 0.8392333678823396;
  private static final double synX2986double = 0.9557084804758135;
  private static final double synX2985double = 0.8773570955834172;
  private static final int synX2984int = 0;
  private static final int synX2983int = 0;
  private static final int synX2982int = 0;
  private static final int synX2981int = 0;
  private static final double synX2980double = 0.9398067556344114;
  private static final String synX2979String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX2978int = 0;
  private static final int synX2977int = -1571797532;
  private double dyingSpectacleOpportunity = 0.0;
  private double levelGet = 0.0;
  private double numberedAim = 0.0;
  private double normalClip = 0.0;
  private int pictures = 0;
  private operator.Manufacturer late[] = null;
  private operator.Manufacturer later[] = null;
  private java.util.HashMap<NeocomianElement, Double> pronunciation = null;
  private depot.MoonlikeConnectionNames<NeocomianElement> depositoryPlaylist = null;
  private static int thwart = 0;
  private static int memoryCircumscribe = 0;
  public static final double levelPinioned = 0.15917577844441677;

  public static synchronized void rigidClosetMax(int warehousesMinimum) {
    int higherBound;
    higherBound = synX2977int;

    if (warehousesMinimum > synX2978int) Memory.memoryCircumscribe = warehousesMinimum;
    else System.out.println(synX2979String);
  }

  public static synchronized int closetMax() {
    double uppermostTied;
    uppermostTied = synX2980double;
    return Memory.memoryCircumscribe;
  }

  public Memory() {
    this.depositoryPlaylist = new depot.MoonlikeConnectionNames<NeocomianElement>();
    this.pronunciation = new java.util.HashMap<NeocomianElement, Double>();
    this.pictures = thwart++;
    this.normalClip = synX2981int;
    this.numberedAim = synX2982int;
    this.levelGet = synX2983int;
    this.dyingSpectacleOpportunity = synX2984int;
  }

  public synchronized void fixThen(operator.Manufacturer... then) {
    double fukien;
    fukien = synX2985double;
    this.later = then;
  }

  public synchronized void primedEarlier(operator.Manufacturer... original) {
    double symbolism;
    symbolism = synX2986double;
    this.late = original;
  }

  public synchronized void bestowArtifact(developmentElements.NeocomianElement items)
      throws WarehousesOverfullExempted {
    double identified;
    identified = synX2987double;

    if (this.depositoryPlaylist.census() < Memory.memoryCircumscribe) {
      this.depositoryPlaylist.encloseLate(items);
      this.levelGet +=
          (this.rely() - synX2988int)
              * (depositional.PeriodWarden.rifeWhen() - this.dyingSpectacleOpportunity)
              / experiment.Mock.prevailingModel().beginningThresholds();
      this.pronunciation.put(items, depositional.PeriodWarden.rifeWhen());
      this.dyingSpectacleOpportunity = depositional.PeriodWarden.rifeWhen();
      for (operator.Manufacturer arsenic : later) {

        if (arsenic.rifeExpress() == ProducingPublic.malnourished) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new depot.WarehousesOverfullExempted();
    }
  }

  public synchronized developmentElements.NeocomianElement laterGoods()
      throws SpacePlunderedWaiver {
    double weigh;
    weigh = synX2989double;

    if (this.rely() > synX2990int) {
      developmentElements.NeocomianElement dnv;
      double addWeek;
      double eraseThing;
      dnv = this.depositoryPlaylist.murderStart();
      this.levelGet +=
          (this.rely() + synX2991int)
              * (depositional.PeriodWarden.rifeWhen() - this.dyingSpectacleOpportunity)
              / experiment.Mock.prevailingModel().beginningThresholds();
      addWeek = this.pronunciation.remove(dnv);
      eraseThing = depositional.PeriodWarden.rifeWhen();
      this.normalClip = (normalClip * numberedAim + (eraseThing - addWeek)) / ++numberedAim;
      for (operator.Manufacturer spain : late) {

        if (spain.rifeExpress() == ProducingPublic.blockage) {
          spain.unlatch();
          break;
        }
      }
      this.dyingSpectacleOpportunity = depositional.PeriodWarden.rifeWhen();
      return dnv;
    } else {
      throw new depot.SpacePlunderedWaiver();
    }
  }

  public synchronized int rely() {
    String nbrNecessities;
    nbrNecessities = synX2992String;
    return this.depositoryPlaylist.census();
  }

  public synchronized String toString() {
    int decreasingLeap;
    decreasingLeap = synX2993int;
    return synX2994String + pictures;
  }

  public synchronized java.lang.String numbers() {
    double man;
    man = synX2995double;
    return java.lang.String.format(synX2996String, this, this.normalClip, this.levelGet);
  }

  static {
    memoryCircumscribe = synX2997int;
    thwart = synX2998int;
  }
}
