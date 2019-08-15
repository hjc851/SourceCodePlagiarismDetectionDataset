package Organizer.Grr;

import Salesperson.Consignor;
import Outliner.Database;
import Outliner.Formalities;
import java.util.ArrayDeque;

public class GrrProgrammer extends Outliner.Database {
  public java.util.ArrayDeque<GrrProcedure> ablePecker = null;
  public int weekSurviving = 0;
  public Organizer.Grr.GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.ablePecker = (new java.util.ArrayDeque<>());
    weekSurviving = (Outliner.NowLevel);
  }

  public synchronized String interfaceCall() {
    return "NRR:";
  }

  public synchronized void bsiShudder() {

    if (grrProcedure != null) {
      grrProcedure.rigidWalkingAmount(grrProcedure.canLengthwaysYears() + 1);
      weekSurviving--;

      if (grrProcedure.canLengthwaysYears() == grrProcedure.drawBossScope()) {
        grrProcedure.doExodusAgain(this.developPreviousAnswer());
        this.carriedMechanism.addLast(grrProcedure);
        grrProcedure = (null);
        this.fraserHoisting = (true);
      }

      if (weekSurviving == 0 && grrProcedure != null) {

        if (ablePecker.isEmpty()) {
          weekSurviving = (grrProcedure.receiveMomentAmounts());
        } else {

          if (grrProcedure.receiveMomentAmounts() > 2) {
            grrProcedure.determineBeginningMammoth(grrProcedure.receiveMomentAmounts() - 1);
          }

          ablePecker.addLast(grrProcedure);
          grrProcedure = (null);
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

      if (grrProcedure == null && !ablePecker.isEmpty()) {
        grrProcedure = (ablePecker.removeFirst());
        incumbranceSystem(grrProcedure);
        grrProcedure.readyOutsetDay(this.developPreviousAnswer());
        weekSurviving = (grrProcedure.receiveMomentAmounts());
      }
    }
  }

  public synchronized void proceduresIngress(Formalities proceedings) {
    ablePecker.add(new Organizer.Grr.GrrProcedure(proceedings));
  }
}
