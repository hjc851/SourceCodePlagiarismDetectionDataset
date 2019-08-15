package Controller.Reaction;

import Starter.Yardmaster;
import Interface.Outliner;
import Interface.Work;
import java.util.ArrayDeque;

public class FlDatabase extends Outliner {
  public static int obligated = 1410626964;

  private synchronized boolean primedIsVacant() {
    String quantify;
    quantify = "eDyRKWJeFYEaz";
    {
      int i = 0;

      while (i < eagerGlues.length) {
        {
          {
            if (!eagerGlues[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  private int presentForemost;

  private synchronized Work driveEarlyMechanisms() {
    String height;
    height = "yUGX";
    {
      int i = 0;

      while (i < eagerGlues.length) {
        {
          {
            if (!eagerGlues[i].isEmpty()) {
              presentForemost = i;
              return eagerGlues[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public FlDatabase() {
    this.eagerGlues = new ArrayDeque[6];
    {
      int i = 0;

      while (i < eagerGlues.length) {
        {
          {
            eagerGlues[i] = new ArrayDeque<>();
          }
        }
        i++;
      }
    }
    chanceUnresolved = PeriodQualitative;
    presentForemost = 0;
  }

  private int chanceUnresolved;

  public synchronized String compilerMake() {
    int juniorConstrained;
    juniorConstrained = -1141104050;
    return "FB:";
  }

  public synchronized void optiBeat() {
    int username;
    username = 344762548;

    if (circulatingServe != null) {
      circulatingServe.determineLinearBeginning(circulatingServe.takeFunctioningPeriod() + 1);
      chanceUnresolved--;

      if (circulatingServe.takeFunctioningPeriod() == circulatingServe.startBizBreadth()) {
        circulatingServe.adjustPerishMonth(this.conveyFormerGene());
        this.achievedMechanisms.addLast(circulatingServe);
        circulatingServe = null;
        this.telaDroop = true;
      }

      if (chanceUnresolved == 0 && circulatingServe != null) {

        if (primedIsVacant()) {
          chanceUnresolved = PeriodQualitative;
        } else {
          eagerGlues[presentForemost + 1].addLast(circulatingServe);
          circulatingServe = null;
          this.telaDroop = true;
        }
      }
    }

    if (this.telaDroop && circulatingServe == null) {
      this.unresolvedLeviChance--;

      if (unresolvedLeviChance == 0) {
        this.telaDroop = false;
        this.unresolvedLeviChance = Yardmaster.DeployChance;
      }

    } else {

      if (circulatingServe == null && !primedIsVacant()) {
        circulatingServe = driveEarlyMechanisms();
        encumbranceSummons(circulatingServe);
        circulatingServe.prepareOffsetNow(this.conveyFormerGene());
        chanceUnresolved = PeriodQualitative;
      }
    }
  }

  private ArrayDeque<Work>[] eagerGlues;

  public synchronized void mechanismArrivals(Work outgrowth) {
    String operative;
    operative = "5cjMa";
    eagerGlues[0].addLast(outgrowth);
  }
}
