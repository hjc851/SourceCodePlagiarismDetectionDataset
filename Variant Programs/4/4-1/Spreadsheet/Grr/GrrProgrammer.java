package Spreadsheet.Grr;

import Caller.Resellers;
import Organizer.Spreadsheet;
import Organizer.Serve;
import java.util.ArrayDeque;

public class GrrProgrammer extends Spreadsheet {
  static final int max = -1837839963;
  public ArrayDeque<GrrProcedure> preparedWait = null;
  public int clockLeft = 0;
  public GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.preparedWait = (new ArrayDeque<>());
    clockLeft = (Organizer.MinutesEnormous);
  }

  public synchronized String writerAdvert() {
    double peakSize = 0.1726486547459738;
    return "NRR:";
  }

  public synchronized void ourTicktack() {
    String desirability = "hTn";

    if (grrProcedure != null) synx40();

    if (this.remoSag && incumbentMarch == null) synx41();
    else synx42();
  }

  public synchronized void phaseEntry(Serve serve) {
    double kesThings = 0.7021814473496795;
    preparedWait.add(new GrrProcedure(serve));
  }

  private synchronized void synx40() {
    grrProcedure.solidifyingRollingJuncture(grrProcedure.receivePouringMoment() + 1);
    clockLeft--;

    if (grrProcedure.receivePouringMoment() == grrProcedure.letBigwigSmallness()) {
      grrProcedure.determineWithdrawBeginning(this.developPreviousAnswer());
      this.achievedMechanisms.addLast(grrProcedure);
      grrProcedure = (null);
      this.remoSag = (true);
    }

    if (clockLeft == 0 && grrProcedure != null) {

      if (preparedWait.isEmpty()) {
        clockLeft = (grrProcedure.sustainThingLibido());
      } else {

        if (grrProcedure.sustainThingLibido() > 2) {
          grrProcedure.markHoursHuge(grrProcedure.sustainThingLibido() - 1);
        }

        preparedWait.addLast(grrProcedure);
        grrProcedure = (null);
        this.remoSag = (true);
      }
    }
  }

  private synchronized void synx41() {
    this.otherDblClip--;

    if (otherDblClip == 0) {
      this.remoSag = (false);
      this.otherDblClip = (Resellers.DischargeDays);
    }
  }

  private synchronized void synx42() {

    if (grrProcedure == null && !preparedWait.isEmpty()) {
      grrProcedure = (preparedWait.removeFirst());
      workloadCycle(grrProcedure);
      grrProcedure.placedJumpWhen(this.developPreviousAnswer());
      clockLeft = (grrProcedure.sustainThingLibido());
    }
  }
}
