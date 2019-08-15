package Developer.Submissions;

import Salesperson.Consignor;
import Outliner.Database;
import Outliner.Formalities;
import java.util.ArrayDeque;

public class FiaMultitasking extends Outliner.Database {
  public ArrayDeque<Formalities>[] fixExpectations = null;
  public int yearStill = 0;
  public int underwayConcern = 0;

  public FiaMultitasking() {
    this.fixExpectations = (new java.util.ArrayDeque[6]);
    {
      int i = 0;

      while (i < fixExpectations.length) {
        {
          {
            fixExpectations[i] = (new java.util.ArrayDeque<>());
          }
        }
        i++;
      }
    }
    yearStill = (NowLevel);
    underwayConcern = (0);
  }

  public synchronized Outliner.Formalities generateComingTreat() {
    {
      int i = 0;

      while (i < fixExpectations.length) {
        {
          {
            if (!fixExpectations[i].isEmpty()) {
              underwayConcern = (i);
              return fixExpectations[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    {
      int i = 0;

      while (i < fixExpectations.length) {
        {
          {
            if (!fixExpectations[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  public synchronized String interfaceCall() {
    return "FB:";
  }

  public synchronized void bsiShudder() {

    if (afootSummons != null) {
      afootSummons.rigidWalkingAmount(afootSummons.canLengthwaysYears() + 1);
      yearStill--;

      if (afootSummons.canLengthwaysYears() == afootSummons.drawBossScope()) {
        afootSummons.doExodusAgain(this.developPreviousAnswer());
        this.carriedMechanism.addLast(afootSummons);
        afootSummons = (null);
        this.fraserHoisting = (true);
      }

      if (yearStill == 0 && afootSummons != null) {

        if (primedIsVacant()) {
          yearStill = (NowLevel);
        } else {
          fixExpectations[underwayConcern + 1].addLast(afootSummons);
          afootSummons = (null);
          this.fraserHoisting = (true);
        }
      }
    }

    if (this.fraserHoisting && afootSummons == null) {
      this.maintainingBallaJuncture--;

      if (maintainingBallaJuncture == 0) {
        this.fraserHoisting = (false);
        this.maintainingBallaJuncture = (Consignor.SentYears);
      }

    } else {

      if (afootSummons == null && !primedIsVacant()) {
        afootSummons = (generateComingTreat());
        incumbranceSystem(afootSummons);
        afootSummons.readyOutsetDay(this.developPreviousAnswer());
        yearStill = (NowLevel);
      }
    }
  }

  public synchronized void proceduresIngress(Formalities sue) {
    fixExpectations[0].addLast(sue);
  }
}
