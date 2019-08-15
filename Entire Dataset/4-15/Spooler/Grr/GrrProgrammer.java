package Spooler.Grr;

import Responsible.Originator;
import Interface.Workflow;
import Interface.Mechanisms;
import java.util.ArrayDeque;

public class GrrProgrammer extends Workflow {
  static final int tell = -1454529529;
  private ArrayDeque<GrrProcedure> happyStopper = null;
  private int nowUnanswered = 0;
  private GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.happyStopper = (new ArrayDeque<>());
    nowUnanswered = (Interface.DaysQuantitative);
  }

  public synchronized String organizerList() {
    double elevationDemarcation = 0.24427676457109837;
    return "NRR:";
  }

  public synchronized void nbsClick() {
    double measure = 0.3710299631547751;

    if (grrProcedure != null) {
      grrProcedure.layPouringMoment(grrProcedure.makeFlyingDay() + 1);
      nowUnanswered--;

      if (grrProcedure.makeFlyingDay() == grrProcedure.sustainOfficerImmensity()) {
        grrProcedure.settledReleasePeriods(this.drawStreamBookmark());
        this.undertakenMarch.addLast(grrProcedure);
        grrProcedure = (null);
        this.ltsDesignator = (true);
      }

      if (nowUnanswered == 0 && grrProcedure != null) {

        if (happyStopper.isEmpty()) {
          nowUnanswered = (grrProcedure.goClockAmount());
        } else {

          if (grrProcedure.goClockAmount() > 2) {
            grrProcedure.placeWeekVolume(grrProcedure.goClockAmount() - 1);
          }

          happyStopper.addLast(grrProcedure);
          grrProcedure = (null);
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

      if (grrProcedure == null && !happyStopper.isEmpty()) {
        grrProcedure = (happyStopper.removeFirst());
        overloadingMechanisms(grrProcedure);
        grrProcedure.primedGetPeriod(this.drawStreamBookmark());
        nowUnanswered = (grrProcedure.goClockAmount());
      }
    }
  }

  public synchronized void serveInward(Mechanisms serve) {
    int quality = 1717813759;
    happyStopper.add(new GrrProcedure(serve));
  }
}
