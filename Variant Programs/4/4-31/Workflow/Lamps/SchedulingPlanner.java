package Workflow.Lamps;

import Distributors.Device;
import Interface.Configuration;
import Interface.Act;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Configuration {

  public synchronized String synchronizerDescribe() {
    return "FCFS:";
  }

  public synchronized void weapMark() {

    if (prevailingProcedure != null) {
      prevailingProcedure.rigidWalkingAmount(prevailingProcedure.produceGushingNow() + 1);

      if (prevailingProcedure.produceGushingNow() == prevailingProcedure.arrivePrezWingspan()) {
        prevailingProcedure.markDeceaseHours(this.conveyFormerGene());
        this.realizedWork.addLast(prevailingProcedure);
        prevailingProcedure = (null);
        this.fellyAlert = (true);
      }
    }

    if (this.fellyAlert && prevailingProcedure == null) {
      this.additionalDikMonth--;

      if (additionalDikMonth == 0) {
        this.fellyAlert = (false);
        this.additionalDikMonth = (Device.ShipmentClip);
      }

    } else {

      if (prevailingProcedure == null && !preparedWait.isEmpty()) {
        prevailingProcedure = (preparedWait.removeFirst());
        prevailingProcedure.fixEarlyThing(this.conveyFormerGene());
        consignmentTreat(prevailingProcedure);
      }
    }
  }

  public synchronized void procedureIngoing(Act mechanisms) {
    preparedWait.addLast(mechanisms);
  }

  public SchedulingPlanner() {
    this.preparedWait = (new ArrayDeque<>());
  }

  private ArrayDeque<Act> preparedWait;
}
