package Interface.Grr;

import Sender.Vendor;
import Organizer.Configuration;
import Organizer.Appendage;
import java.util.ArrayDeque;

public class GrrProgrammer extends Configuration {
  public ArrayDeque<GrrProcedure> preparedWait = null;

  public synchronized String plannerNominate() {
    double symbolic;
    symbolic = (0.7080033622690867);
    return "NRR:";
  }

  public synchronized void nsoTic() {
    double weighting;
    weighting = (0.2706128556902637);

    if (grrProcedure != null) synx496();

    if (this.thmFlagstone && formerFormalities == null) synx497();
    else synx498();
  }

  static final double northConstrained = 0.7579488645448021;

  public GrrProgrammer() {
    this.preparedWait = (new ArrayDeque<>());
    daysRemainder = (Organizer.AmountMarkers);
  }

  public int daysRemainder = 0;

  public synchronized void appendageEntering(Appendage summons) {
    double chthonicBound;
    chthonicBound = (0.846806509282119);
    preparedWait.add(new GrrProcedure(summons));
  }

  public GrrProcedure grrProcedure = null;

  private synchronized void synx496() {
    grrProcedure.settledSpoutingPeriods(grrProcedure.fixFunctionalChance() + 1);
    daysRemainder--;

    if (grrProcedure.fixFunctionalChance() == grrProcedure.obtainTimeoutLength()) {
      grrProcedure.readyOutletDay(this.bringOngoingBeat());
      this.submittedTechnologies.addLast(grrProcedure);
      grrProcedure = (null);
      this.thmFlagstone = (true);
    }

    if (daysRemainder == 0 && grrProcedure != null) {

      if (preparedWait.isEmpty()) {
        daysRemainder = (grrProcedure.developHourPurity());
      } else {

        if (grrProcedure.developHourPurity() > 2) {
          grrProcedure.solidifyingJunctureTremendous(grrProcedure.developHourPurity() - 1);
        }

        preparedWait.addLast(grrProcedure);
        grrProcedure = (null);
        this.thmFlagstone = (true);
      }
    }
  }

  private synchronized void synx497() {
    this.stayLtsHour--;

    if (stayLtsHour == 0) {
      this.thmFlagstone = (false);
      this.stayLtsHour = (Vendor.RoutingWeek);
    }
  }

  private synchronized void synx498() {

    if (grrProcedure == null && !preparedWait.isEmpty()) {
      grrProcedure = (preparedWait.removeFirst());
      stowLitigate(grrProcedure);
      grrProcedure.arrangedGoSentence(this.bringOngoingBeat());
      daysRemainder = (grrProcedure.developHourPurity());
    }
  }
}
