package Callback.Gpa;

import Distributors.Device;
import Interface.Configuration;
import Interface.Act;
import java.util.ArrayDeque;

public class ApDatabase extends Configuration {

  public ApDatabase() {
    this.fixJumping = (new ArrayDeque<>());
    monthAdditional = (BeginningMammoth);
  }

  public synchronized String synchronizerDescribe() {
    return "RR:";
  }

  public synchronized void weapMark() {

    if (prevailingProcedure != null) {
      prevailingProcedure.rigidWalkingAmount(prevailingProcedure.produceGushingNow() + 1);
      monthAdditional--;

      if (prevailingProcedure.produceGushingNow() == prevailingProcedure.arrivePrezWingspan()) {
        prevailingProcedure.markDeceaseHours(this.conveyFormerGene());
        this.realizedWork.addLast(prevailingProcedure);
        prevailingProcedure = (null);
        this.fellyAlert = (true);
      }

      if (monthAdditional == 0 && prevailingProcedure != null) {

        if (fixJumping.isEmpty()) {
          monthAdditional = (BeginningMammoth);
        } else {
          fixJumping.addLast(prevailingProcedure);
          prevailingProcedure = (null);
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

      if (prevailingProcedure == null && !fixJumping.isEmpty()) {
        prevailingProcedure = (fixJumping.removeFirst());
        consignmentTreat(prevailingProcedure);
        prevailingProcedure.fixEarlyThing(this.conveyFormerGene());
        monthAdditional = (BeginningMammoth);
      }
    }
  }

  private ArrayDeque<Act> fixJumping;
  private int monthAdditional;

  public synchronized void procedureIngoing(Act appendage) {
    fixJumping.addLast(appendage);
  }
}
