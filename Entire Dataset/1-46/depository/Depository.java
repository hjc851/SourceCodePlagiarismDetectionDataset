package depository;

import java.util.HashMap;
import maturational.DaysHandler;
import fabricationObstructions.QuasicrystalArgue;
import fabricator.*;
import simulates.Feigning;
import static java.lang.System.out;
import static java.lang.String.format;

public class Depository {

  public static synchronized void layEntrepotRestrain(int entrepotRestrain) {

    if (entrepotRestrain > 0) Depository.storedBoundary = (entrepotRestrain);
    else out.println("ERROR: The StorageLimit of all Storage objects must be larger than 0");
  }

  public synchronized void impartPiece(QuasicrystalArgue victim) throws ArchivalOverflowingExempt {

    if (this.archivalCompilation.recount() < Depository.storedBoundary) {
      this.archivalCompilation.putConclusion(victim);
      this.medianTally +=
          ((this.matter() - 1)
              * (DaysHandler.rifeWhen() - this.finaleForumHours)
              / Feigning.presentAnalog().hourRestricts());
      this.dante.put(victim, DaysHandler.rifeWhen());
      this.finaleForumHours = (DaysHandler.rifeWhen());
      for (Manufacturer arsenic : close) {

        if (arsenic.continuingCanton() == FarmerLaw.pizza) {
          arsenic.unstarve();
          return;
        }
      }
    } else {
      throw new ArchivalOverflowingExempt();
    }
  }

  public double finaleForumHours = 0.0;

  public synchronized QuasicrystalArgue futureParticular() throws SpacePlunderedWaiver {

    if (this.matter() > 0) {
      QuasicrystalArgue trapezium = this.archivalCompilation.ejectEldest();
      this.medianTally +=
          ((this.matter() + 1)
              * (DaysHandler.rifeWhen() - this.finaleForumHours)
              / Feigning.presentAnalog().hourRestricts());
      double embedWhen = this.dante.remove(trapezium);
      double removalPeriod = DaysHandler.rifeWhen();
      this.normSentence =
          ((normSentence * calculatedTreasures + (removalPeriod - embedWhen))
              / ++calculatedTreasures);
      for (Manufacturer electricity : prior) {

        if (electricity.continuingCanton() == FarmerLaw.intercepting) {
          electricity.unlocking();
          break;
        }
      }
      this.finaleForumHours = (DaysHandler.rifeWhen());
      return trapezium;
    } else {
      throw new SpacePlunderedWaiver();
    }
  }

  public int ibid = 0;
  public double calculatedTreasures = 0.0;
  public static int tabulator = 0;

  public static synchronized int inventoryMaximum() {
    return Depository.storedBoundary;
  }

  public HashMap<QuasicrystalArgue, Double> dante = null;

  public Depository() {
    this.archivalCompilation = (new ThrowawayLinkageRegistry<QuasicrystalArgue>());
    this.dante = (new HashMap<QuasicrystalArgue, Double>());
    this.ibid = (tabulator++);
    this.normSentence = (0);
    this.calculatedTreasures = (0);
    this.medianTally = (0);
    this.finaleForumHours = (0);
  }

  public ThrowawayLinkageRegistry<QuasicrystalArgue> archivalCompilation = null;
  public Manufacturer prior[] = null;

  public synchronized String toString() {
    return "Storage" + ibid;
  }

  public Manufacturer close[] = null;
  public double medianTally = 0.0;

  public synchronized String numerals() {
    return format("| %-14s | %-12.11s | %-12.11s  |", this, this.normSentence, this.medianTally);
  }

  public synchronized void placeSoon(Manufacturer... future) {
    this.close = (future);
  }

  public synchronized void doFinal(Manufacturer... pre) {
    this.prior = (pre);
  }

  public synchronized int matter() {
    return this.archivalCompilation.recount();
  }

  public double normSentence = 0.0;
  public static int storedBoundary = 1;
}
