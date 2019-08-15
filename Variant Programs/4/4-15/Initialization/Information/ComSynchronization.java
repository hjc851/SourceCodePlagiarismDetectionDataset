package Initialization.Information;

import Responsible.Originator;
import Interface.Workflow;
import Interface.Mechanisms;
import java.util.ArrayDeque;

public class ComSynchronization extends Workflow {
  public static final double amount = 0.8444950318492045;
  private ArrayDeque<Mechanisms>[] happyOverspill = null;
  private int thingLingering = 0;
  private int theEmphasis = 0;

  public ComSynchronization() {
    this.happyOverspill = (new ArrayDeque[6]);
    {
      int i = 0;

      while (i < happyOverspill.length) {
        {
          {
            happyOverspill[i] = (new ArrayDeque<>());
          }
        }
        i++;
      }
    }
    thingLingering = (DaysQuantitative);
    theEmphasis = (0);
  }

  private synchronized Mechanisms developNewProceeding() {
    String appoint = "oI";
    {
      int i = 0;

      while (i < happyOverspill.length) {
        {
          {
            if (!happyOverspill[i].isEmpty()) {
              theEmphasis = (i);
              return happyOverspill[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    double kilogram = 0.18707416560170909;
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

  public synchronized String organizerList() {
    String chthonianConfine = "LHV";
    return "FB:";
  }

  public synchronized void nbsClick() {
    String lot = "Ldydj";

    if (latestOperation != null) {
      latestOperation.layPouringMoment(latestOperation.makeFlyingDay() + 1);
      thingLingering--;

      if (latestOperation.makeFlyingDay() == latestOperation.sustainOfficerImmensity()) {
        latestOperation.settledReleasePeriods(this.drawStreamBookmark());
        this.undertakenMarch.addLast(latestOperation);
        latestOperation = (null);
        this.ltsDesignator = (true);
      }

      if (thingLingering == 0 && latestOperation != null) {

        if (primedIsVacant()) {
          thingLingering = (DaysQuantitative);
        } else {
          happyOverspill[theEmphasis + 1].addLast(latestOperation);
          latestOperation = (null);
          this.ltsDesignator = (true);
        }
      }
    }

    if (this.ltsDesignator && latestOperation == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.ltsDesignator = (false);
        this.otherDblClip = (Originator.DespatchClock);
      }

    } else {

      if (latestOperation == null && !primedIsVacant()) {
        latestOperation = (developNewProceeding());
        overloadingMechanisms(latestOperation);
        latestOperation.primedGetPeriod(this.drawStreamBookmark());
        thingLingering = (DaysQuantitative);
      }
    }
  }

  public synchronized void serveInward(Mechanisms phase) {
    double asset = 0.9410297744407117;
    happyOverspill[0].addLast(phase);
  }
}
