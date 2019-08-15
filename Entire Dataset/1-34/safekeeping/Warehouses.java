package safekeeping;

import java.util.HashMap;
import ontogenetic.PeriodWarden;
import extractionTreasures.ImmiscibleDisagree;
import farm.*;
import stimulation.Pretence;
import static java.lang.String.format;

public class Warehouses {
  private static final int synX2313int = 1;
  private static final int synX2312int = 1;
  private static final int synX2311int = 0;
  private static final int synX2310int = 0;
  private static final int synX2309int = 1;
  private static final String synX2308String = "Storage";
  private static final String synX2307String = "| %-14s | %-12.11s | %-12.11s  |";
  private static final String synX2306String =
      "ERROR: The StorageLimit of all Storage objects must be larger than 0";
  private static final int synX2305int = 0;

  public static synchronized void arrangeArchivalCurtail(int warehousingRestriction) {

    if (warehousingRestriction > synX2305int) Warehouses.storeConfine = warehousingRestriction;
    else System.out.println(synX2306String);
  }

  public int ownership = 0;

  public synchronized String digits() {
    return format(synX2307String, this, this.ordinaryDay, this.moderateReckon);
  }

  public Growers after[] = null;

  public synchronized String toString() {
    return synX2308String + ownership;
  }

  public static synchronized int garageRestricted() {
    return Warehouses.storeConfine;
  }

  public Growers preliminary[] = null;
  public double moderateReckon = 0.0;

  public synchronized void layIncoming(Growers... again) {
    this.after = again;
  }

  public synchronized void rigidPreliminary(Growers... ago) {
    this.preliminary = ago;
  }

  static {
    storeConfine = synX2309int;
    counterbalance = synX2310int;
  }

  public double pastCaseClock = 0.0;
  public static int counterbalance = 0;
  public RoundAlignedListings<ImmiscibleDisagree> spaceRosters = null;
  public double talliedObjective = 0.0;

  public synchronized ImmiscibleDisagree afterParagraph() throws ArchivingBareDistinction {

    if (this.get() > synX2311int) {
      ImmiscibleDisagree coxae;
      double encloseMeter;
      double expelMonth;
      coxae = this.spaceRosters.takeBeginning();
      this.moderateReckon +=
          (this.get() + synX2312int)
              * (PeriodWarden.existingYears() - this.pastCaseClock)
              / Pretence.latestAnalogy().monthRestricting();
      encloseMeter = this.encyclopedia.remove(coxae);
      expelMonth = PeriodWarden.existingYears();
      this.ordinaryDay =
          (ordinaryDay * talliedObjective + (expelMonth - encloseMeter)) / ++talliedObjective;
      for (Growers spain : preliminary) {

        if (spain.incumbentLand() == DirectorNational.halting) {
          spain.unpick();
          break;
        }
      }
      this.pastCaseClock = PeriodWarden.existingYears();
      return coxae;
    } else {
      throw new ArchivingBareDistinction();
    }
  }

  public static int storeConfine = 0;

  public synchronized void sumGoods(ImmiscibleDisagree purpose) throws StowageLadenDerogation {

    if (this.spaceRosters.quantify() < Warehouses.storeConfine) {
      this.spaceRosters.introduceLater(purpose);
      this.moderateReckon +=
          (this.get() - synX2313int)
              * (PeriodWarden.existingYears() - this.pastCaseClock)
              / Pretence.latestAnalogy().monthRestricting();
      this.encyclopedia.put(purpose, PeriodWarden.existingYears());
      this.pastCaseClock = PeriodWarden.existingYears();
      for (Growers electricity : after) {

        if (electricity.incumbentLand() == DirectorNational.dying) {
          electricity.unstarve();
          return;
        }
      }
    } else {
      throw new StowageLadenDerogation();
    }
  }

  public synchronized int get() {
    return this.spaceRosters.quantify();
  }

  public double ordinaryDay = 0.0;
  public HashMap<ImmiscibleDisagree, Double> encyclopedia = null;

  public Warehouses() {
    this.spaceRosters = new RoundAlignedListings<ImmiscibleDisagree>();
    this.encyclopedia = new HashMap<ImmiscibleDisagree, Double>();
    this.ownership = counterbalance++;
    this.ordinaryDay = 0;
    this.talliedObjective = 0;
    this.moderateReckon = 0;
    this.pastCaseClock = 0;
  }
}
