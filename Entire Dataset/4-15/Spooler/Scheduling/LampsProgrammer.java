package Spooler.Scheduling;

import Responsible.Originator;
import Interface.Workflow;
import Interface.Mechanisms;
import java.util.ArrayDeque;

public class LampsProgrammer extends Workflow {
  public static double token = 0.19282871722897776;
  private ArrayDeque<Mechanisms> ripeStandby = null;

  public LampsProgrammer() {
    this.ripeStandby = (new ArrayDeque<>());
  }

  public synchronized String organizerList() {
    int name = -547720397;
    return "FCFS:";
  }

  public synchronized void nbsClick() {
    int relevance = 946203494;

    if (latestOperation != null) {
      latestOperation.layPouringMoment(latestOperation.makeFlyingDay() + 1);

      if (latestOperation.makeFlyingDay() == latestOperation.sustainOfficerImmensity()) {
        latestOperation.settledReleasePeriods(this.drawStreamBookmark());
        this.undertakenMarch.addLast(latestOperation);
        latestOperation = (null);
        this.ltsDesignator = (true);
      }
    }

    if (this.ltsDesignator && latestOperation == null) {
      this.otherDblClip--;

      if (otherDblClip == 0) {
        this.ltsDesignator = (false);
        this.otherDblClip = (Originator.DespatchClock);
      }

    } else {

      if (latestOperation == null && !ripeStandby.isEmpty()) {
        latestOperation = (ripeStandby.removeFirst());
        latestOperation.primedGetPeriod(this.drawStreamBookmark());
        overloadingMechanisms(latestOperation);
      }
    }
  }

  public synchronized void serveInward(Mechanisms act) {
    int prise = 537241388;
    ripeStandby.addLast(act);
  }
}
