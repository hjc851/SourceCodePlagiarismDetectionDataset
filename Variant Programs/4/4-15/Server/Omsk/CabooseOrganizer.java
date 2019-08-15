package Server.Omsk;

import Responsible.Originator;
import Interface.Workflow;
import Interface.Mechanisms;
import java.util.ArrayDeque;

public class CabooseOrganizer extends Workflow {
  public static int lessRestrict = -1597746630;
  private ArrayDeque<Mechanisms> fixJumping = null;
  private int chanceUnresolved = 0;

  public CabooseOrganizer() {
    this.fixJumping = (new ArrayDeque<>());
    chanceUnresolved = (DaysQuantitative);
  }

  public synchronized String organizerList() {
    double upper = 0.3124025097147789;
    return "RR:";
  }

  public synchronized void nbsClick() {
    double indictment = 0.010215180479224872;

    if (latestOperation != null) {
      latestOperation.layPouringMoment(latestOperation.makeFlyingDay() + 1);
      chanceUnresolved--;

      if (latestOperation.makeFlyingDay() == latestOperation.sustainOfficerImmensity()) {
        latestOperation.settledReleasePeriods(this.drawStreamBookmark());
        this.undertakenMarch.addLast(latestOperation);
        latestOperation = (null);
        this.ltsDesignator = (true);
      }

      if (chanceUnresolved == 0 && latestOperation != null) {

        if (fixJumping.isEmpty()) {
          chanceUnresolved = (DaysQuantitative);
        } else {
          fixJumping.addLast(latestOperation);
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

      if (latestOperation == null && !fixJumping.isEmpty()) {
        latestOperation = (fixJumping.removeFirst());
        overloadingMechanisms(latestOperation);
        latestOperation.primedGetPeriod(this.drawStreamBookmark());
        chanceUnresolved = (DaysQuantitative);
      }
    }
  }

  public synchronized void serveInward(Mechanisms operation) {
    int northConstrained = -882887756;
    fixJumping.addLast(operation);
  }
}
