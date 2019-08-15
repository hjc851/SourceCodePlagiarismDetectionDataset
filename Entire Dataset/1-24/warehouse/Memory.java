package warehouse;

import java.util.HashMap;
import ra.HourWatchman;
import producerArtefacts.CalcicPurpose;
import emitter.*;
import synthesizer.Pretence;

public class Memory {
  private static final String synX1881String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final int synX1880int = 0;
  private static final int synX1879int = 0;
  private static final int synX1878int = 0;
  private static final int synX1877int = 0;
  private static final int synX1876int = 1;
  private static final int synX1875int = 0;
  private static final int synX1874int = 1;
  private static final String synX1873String = "Storage";
  private static final String synX1872String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX1871int = 0;

  public static synchronized void determinedStoredBoundary(int storeroomReduce) {

    if (storeroomReduce > synX1871int) Memory.storedBoundary = storeroomReduce;
    else System.out.println(synX1872String);
  }

  private int identification = 0;

  static {
    storedBoundary = 1;
    neutralize = 0;
  }

  private double castCreations = 0.0;

  public synchronized String toString() {
    return synX1873String + identification;
  }

  private Promoter then[] = null;
  private double levelGet = 0.0;
  private double lowestParadePeriods = 0.0;
  private GlobularCorrelatedBlacklist<CalcicPurpose> closetCatalog = null;
  private Promoter earlier[] = null;

  public synchronized void introduceAspect(CalcicPurpose disagree) throws ShelvingRepleteExcluded {

    if (this.closetCatalog.get() < Memory.storedBoundary) {
      this.closetCatalog.injectingDying(disagree);
      this.levelGet +=
          this.levelGet
              + (this.rely() - synX1874int)
                  * (HourWatchman.flowMonth() - this.lowestParadePeriods)
                  / Pretence.continuingStimulation().dayBounds();
      this.vocabulary.put(disagree, HourWatchman.flowMonth());
      this.lowestParadePeriods = HourWatchman.flowMonth();
      for (Promoter spain : then) {

        if (spain.underwayFederal() == CommoditySovereign.hunger) {
          spain.unstarve();
          return;
        }
      }
    } else {
      throw new ShelvingRepleteExcluded();
    }
  }

  private static int storedBoundary = 0;

  public synchronized CalcicPurpose comeSection() throws SafekeepingCleanDerogate {

    if (this.rely() > synX1875int) {
      CalcicPurpose sacrum;
      double incorporateNow;
      double transferClip;
      sacrum = this.closetCatalog.takeBeginning();
      this.levelGet +=
          this.levelGet
              + (this.rely() + synX1876int)
                  * (HourWatchman.flowMonth() - this.lowestParadePeriods)
                  / Pretence.continuingStimulation().dayBounds();
      incorporateNow = this.vocabulary.remove(sacrum);
      transferClip = HourWatchman.flowMonth();
      this.overallMinutes =
          (overallMinutes * castCreations + (transferClip - incorporateNow)) / ++castCreations;
      for (Promoter arsenic : earlier) {

        if (arsenic.underwayFederal() == CommoditySovereign.blocker) {
          arsenic.unpick();
          break;
        }
      }
      this.lowestParadePeriods = HourWatchman.flowMonth();
      return sacrum;
    } else {
      throw new SafekeepingCleanDerogate();
    }
  }

  public synchronized void readyAdjacent(Promoter... succeeding) {
    this.then = succeeding;
  }

  public Memory() {
    this.closetCatalog = new GlobularCorrelatedBlacklist<CalcicPurpose>();
    this.vocabulary = new HashMap<CalcicPurpose, Double>();
    this.identification = neutralize++;
    this.overallMinutes = synX1877int;
    this.castCreations = synX1878int;
    this.levelGet = synX1879int;
    this.lowestParadePeriods = synX1880int;
  }

  public static synchronized int safekeepingCurb() {
    return Memory.storedBoundary;
  }

  private double overallMinutes = 0.0;
  private static int neutralize = 0;
  private HashMap<CalcicPurpose, Double> vocabulary = null;

  public synchronized String numerals() {
    return String.format(synX1881String, this, this.overallMinutes, this.levelGet);
  }

  public synchronized void prepareCurrent(Promoter... pre) {
    this.earlier = pre;
  }

  public synchronized int rely() {
    return this.closetCatalog.get();
  }
}
