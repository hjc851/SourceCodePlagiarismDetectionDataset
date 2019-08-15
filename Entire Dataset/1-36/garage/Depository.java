package garage;

import java.util.HashMap;
import jazzy.OpportunityCarer;
import developmentElements.RecoverableTarget;
import supplier.*;
import simulated.Pretence;
import static java.lang.System.out;

public class Depository {
  private static final String synX2446String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final int synX2445int = 1;
  private static final String synX2444String = "Storage";
  private static final String synX2443String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX2442int = 0;
  private static final int synX2441int = 1;
  private static final int synX2440int = 0;
  private static final int synX2439int = 0;
  private static final int synX2438int = 1;
  public int map = 0;
  public garage.RingedInfluencedRoster<RecoverableTarget> storingTilt = null;

  public static synchronized int safekeepingCurb() {
    return Depository.entrepotRestrain;
  }

  public supplier.Exporter later[] = null;

  public Depository() {
    this.storingTilt = new garage.RingedInfluencedRoster<RecoverableTarget>();
    this.verb = new java.util.HashMap<RecoverableTarget, Double>();
    this.map = antagonistic++;
    this.intermediateDays = 0;
    this.compiledOrnaments = 0;
    this.ordinaryEnumeration = 0;
    this.highMeetingAgain = 0;
  }

  public supplier.Exporter preceding[] = null;

  public synchronized int weigh() {
    return this.storingTilt.figure();
  }

  static {
    entrepotRestrain = synX2438int;
    antagonistic = synX2439int;
  }

  public synchronized developmentElements.RecoverableTarget aheadIngredient()
      throws RepositoryGlassyExceptional {

    if (this.weigh() > synX2440int) {
      developmentElements.RecoverableTarget osmium;
      double insertionPeriod;
      double dismantleNow;
      osmium = this.storingTilt.eliminateBest();
      this.ordinaryEnumeration +=
          this.ordinaryEnumeration
              + (this.weigh() + synX2441int)
                  * (jazzy.OpportunityCarer.previousHour() - this.highMeetingAgain)
                  / simulated.Pretence.streamMock().junctureConstrain();
      insertionPeriod = this.verb.remove(osmium);
      dismantleNow = jazzy.OpportunityCarer.previousHour();
      this.intermediateDays =
          (intermediateDays * compiledOrnaments + (dismantleNow - insertionPeriod))
              / ++compiledOrnaments;
      for (supplier.Exporter leong : preceding) {

        if (leong.presentGeneral() == MakerLand.hindering) {
          leong.unlocking();
          break;
        }
      }
      this.highMeetingAgain = jazzy.OpportunityCarer.previousHour();
      return osmium;
    } else {
      throw new garage.RepositoryGlassyExceptional();
    }
  }

  public java.util.HashMap<RecoverableTarget, Double> verb = null;
  public double compiledOrnaments = 0.0;
  public double intermediateDays = 0.0;
  public static int antagonistic = 0;
  public static int entrepotRestrain = 0;

  public static synchronized void fixStoreroomReduce(int warehouseDemarcation) {

    if (warehouseDemarcation > synX2442int) Depository.entrepotRestrain = warehouseDemarcation;
    else out.println(synX2443String);
  }

  public synchronized String toString() {
    return synX2444String + map;
  }

  public double highMeetingAgain = 0.0;

  public synchronized void introduceAspect(developmentElements.RecoverableTarget artefact)
      throws SpaceChockfulWaiver {

    if (this.storingTilt.figure() < Depository.entrepotRestrain) {
      this.storingTilt.inclosePenultimate(artefact);
      this.ordinaryEnumeration +=
          this.ordinaryEnumeration
              + (this.weigh() - synX2445int)
                  * (jazzy.OpportunityCarer.previousHour() - this.highMeetingAgain)
                  / simulated.Pretence.streamMock().junctureConstrain();
      this.verb.put(artefact, jazzy.OpportunityCarer.previousHour());
      this.highMeetingAgain = jazzy.OpportunityCarer.previousHour();
      for (supplier.Exporter electricity : later) {

        if (electricity.presentGeneral() == MakerLand.scrounging) {
          electricity.unstarve();
          return;
        }
      }
    } else {
      throw new garage.SpaceChockfulWaiver();
    }
  }

  public synchronized void putFuture(supplier.Exporter... future) {
    this.later = future;
  }

  public synchronized void adjustFirst(supplier.Exporter... old) {
    this.preceding = old;
  }

  public double ordinaryEnumeration = 0.0;

  public synchronized java.lang.String indicators() {
    return java.lang.String.format(
        synX2446String, this, this.intermediateDays, this.ordinaryEnumeration);
  }
}
