package Parser.Grr;

import Distributors.Device;
import Interface.Configuration;
import Interface.Act;
import java.util.ArrayDeque;

public class GrrProgrammer extends Configuration {

  public synchronized String synchronizerDescribe() {
    return "NRR:";
  }

  private ArrayDeque<GrrProcedure> fitBacklog;
  private GrrProcedure grrProcedure;
  private int opportunityResidual;

  public synchronized void weapMark() {

    if (grrProcedure != null) {
      grrProcedure.rigidWalkingAmount(grrProcedure.produceGushingNow() + 1);
      opportunityResidual--;

      if (grrProcedure.produceGushingNow() == grrProcedure.arrivePrezWingspan()) {
        grrProcedure.markDeceaseHours(this.conveyFormerGene());
        this.realizedWork.addLast(grrProcedure);
        grrProcedure = (null);
        this.fellyAlert = (true);
      }

      if (opportunityResidual == 0 && grrProcedure != null) {

        if (fitBacklog.isEmpty()) {
          opportunityResidual = (grrProcedure.canYearsSize());
        } else {

          if (grrProcedure.canYearsSize() > 2) {
            grrProcedure.determinedDaysQuantitative(grrProcedure.canYearsSize() - 1);
          }

          fitBacklog.addLast(grrProcedure);
          grrProcedure = (null);
          this.fellyAlert = (true);
        }
      }
    }

    if (this.fellyAlert && prevailingProcedure == null) {
      this.additionalDikMonth--;

      if (additionalDikMonth == 0) {
        this.fellyAlert = (false);
        this.additionalDikMonth = (Device.ShipmentClip);
      }

    } else {

      if (grrProcedure == null && !fitBacklog.isEmpty()) {
        grrProcedure = (fitBacklog.removeFirst());
        consignmentTreat(grrProcedure);
        grrProcedure.fixEarlyThing(this.conveyFormerGene());
        opportunityResidual = (grrProcedure.canYearsSize());
      }
    }
  }

  public GrrProgrammer() {
    this.fitBacklog = (new ArrayDeque<>());
    opportunityResidual = (Interface.BeginningMammoth);
  }

  public synchronized void procedureIngoing(Act methods) {
    fitBacklog.add(new GrrProcedure(methods));
  }
}
