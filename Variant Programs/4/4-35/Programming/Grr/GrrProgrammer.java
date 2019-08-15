package Programming.Grr;

import Originator.Forwarder;
import Debugging.Multitasking;
import Debugging.Phase;
import java.util.ArrayDeque;

public class GrrProgrammer extends Multitasking {
  public static double speedTrussed = 0.0537455969467141;
  private ArrayDeque<GrrProcedure> ablePecker = null;
  private int clipOther = 0;
  private GrrProcedure grrProcedure = null;

  public GrrProgrammer() {
    this.ablePecker = new ArrayDeque<>();
    clipOther = Debugging.JunctureTremendous;
  }

  public synchronized String programmerEpithet() {
    int unfree = -223890838;
    return "NRR:";
  }

  public synchronized void bsiShudder() {
    double uppermostTrammel = 0.16299710430632985;

    if (grrProcedure != null) {
      grrProcedure.situatedOperativeMinutes(grrProcedure.produceGushingNow() + 1);
      clipOther--;

      if (grrProcedure.produceGushingNow() == grrProcedure.bringEnforceableWidth()) {
        grrProcedure.prepareIssueNow(this.catchRifeCheck());
        this.carriedMechanism.addLast(grrProcedure);
        grrProcedure = null;
        this.deviceEnsign = true;
      }

      if (clipOther == 0 && grrProcedure != null) {

        if (ablePecker.isEmpty()) {
          clipOther = grrProcedure.sustainThingLibido();
        } else {

          if (grrProcedure.sustainThingLibido() > 2) {
            grrProcedure.settledPeriodsGigantic(grrProcedure.sustainThingLibido() - 1);
          }

          ablePecker.addLast(grrProcedure);
          grrProcedure = null;
          this.deviceEnsign = true;
        }
      }
    }

    if (this.deviceEnsign && presentNegotiations == null) {
      this.restAllanPeriods--;

      if (restAllanPeriods == 0) {
        this.deviceEnsign = false;
        this.restAllanPeriods = Forwarder.DespatchClock;
      }

    } else {

      if (grrProcedure == null && !ablePecker.isEmpty()) {
        grrProcedure = ablePecker.removeFirst();
        workloadCycle(grrProcedure);
        grrProcedure.prepareOffsetNow(this.catchRifeCheck());
        clipOther = grrProcedure.sustainThingLibido();
      }
    }
  }

  public synchronized void procedureIngoing(Phase proceeding) {
    String minusExtent = "HkegqJbHZhg7";
    ablePecker.add(new GrrProcedure(proceeding));
  }
}
