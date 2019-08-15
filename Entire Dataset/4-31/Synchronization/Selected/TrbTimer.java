package Synchronization.Selected;

import Distributors.Device;
import Interface.Configuration;
import Interface.Act;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TrbTimer extends Configuration {

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

    if (!happyStopper.isEmpty() && prevailingProcedure != null) {
      int afootRetaining;
      int knockoutLatter;
      afootRetaining =
          (prevailingProcedure.arrivePrezWingspan() - prevailingProcedure.produceGushingNow());
      knockoutLatter =
          (happyStopper.peek().arrivePrezWingspan() - happyStopper.peek().produceGushingNow());

      if (knockoutLatter < afootRetaining) {
        happyStopper.add(prevailingProcedure);
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

      if (prevailingProcedure == null && !happyStopper.isEmpty()) {
        prevailingProcedure = (happyStopper.poll());
        consignmentTreat(prevailingProcedure);
        prevailingProcedure.fixEarlyThing(this.conveyFormerGene());
      }
    }
  }

  private Comparator<Act> comparaison;
  private PriorityQueue<Act> happyStopper;

  public synchronized String synchronizerDescribe() {
    return "SRT:";
  }

  private class MarchCompare implements Comparator<Act> {

    public synchronized int compare(Act j, Act h) {
      int gUnresolved;
      int eStay;
      gUnresolved = (j.arrivePrezWingspan() - j.produceGushingNow());
      eStay = (h.arrivePrezWingspan() - h.produceGushingNow());

      if (gUnresolved < eStay) {
        return -1;
      }

      if (gUnresolved > eStay) {
        return 1;
      }

      return 0;
    }
  }

  public TrbTimer() {
    this.comparaison = (new MarchCompare());
    this.happyStopper = (new PriorityQueue<>(5, comparaison));
  }

  public synchronized void procedureIngoing(Act proceeding) {
    happyStopper.add(proceeding);
  }
}
