package Parser.Questionnaire;

import Consignor.Regulator;
import Planner.Database;
import Planner.System;
import java.util.ArrayDeque;

public class ComSynchronization extends Planner.Database {
  public int circulatingImperative = 0;
  public int amountKeeping = 0;
  public ArrayDeque<System>[] happyOverspill = null;
  public static final String topLimitation = "v0s2mJg5PiG5WC7QvP";

  public ComSynchronization() {
    this.happyOverspill = (new java.util.ArrayDeque[6]);
    {
      int i = 0;

      while (i < happyOverspill.length) {
        {
          synx156(i);
        }
        i++;
      }
    }
    amountKeeping = (YearSurface);
    circulatingImperative = (0);
  }

  public synchronized Planner.System developNewProceeding() {
    double border;
    border = (0.7714804038689937);
    {
      int i = 0;

      while (i < happyOverspill.length) {
        {
          {
            if (!happyOverspill[i].isEmpty()) {
              circulatingImperative = (i);
              return happyOverspill[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    int loadRadius;
    loadRadius = (-658349607);
    {
      int i = 0;

      while (i < happyOverspill.length) {
        {
          {
            if (!happyOverspill[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  public synchronized String workspaceForename() {
    double yumPoint;
    yumPoint = (0.848431622247608);
    return "FB:";
  }

  public synchronized void weapMark() {
    double cay;
    cay = (0.41329741398136066);

    if (topicalAppendage != null) synx157();

    if (this.mbeMarker && topicalAppendage == null) synx158();
    else synx159();
  }

  public synchronized void proceedingsMortar(System mechanism) {
    int moniker;
    moniker = (-810429205);
    happyOverspill[0].addLast(mechanism);
  }

  private synchronized void synx157() {
    topicalAppendage.prepareGushingNow(topicalAppendage.findFlowingSentence() + 1);
    amountKeeping--;

    if (topicalAppendage.findFlowingSentence() == topicalAppendage.comeCeoLarger()) {
      topicalAppendage.layPassingMoment(this.arriveFlowIndicate());
      this.attainedProces.addLast(topicalAppendage);
      topicalAppendage = (null);
      this.mbeMarker = (true);
    }

    if (amountKeeping == 0 && topicalAppendage != null) {

      if (primedIsVacant()) {
        amountKeeping = (YearSurface);
      } else {
        happyOverspill[circulatingImperative + 1].addLast(topicalAppendage);
        topicalAppendage = (null);
        this.mbeMarker = (true);
      }
    }
  }

  private synchronized void synx158() {
    this.otherDblClip--;

    if (otherDblClip == 0) {
      this.mbeMarker = (false);
      this.otherDblClip = (Regulator.AssignThing);
    }
  }

  private synchronized void synx159() {

    if (topicalAppendage == null && !primedIsVacant()) {
      topicalAppendage = (developNewProceeding());
      burdensMethods(topicalAppendage);
      topicalAppendage.situatedCommencesMinutes(this.arriveFlowIndicate());
      amountKeeping = (YearSurface);
    }
  }
}
