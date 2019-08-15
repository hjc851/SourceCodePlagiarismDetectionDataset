package Programmer.Opinion;

import Distributors.Device;
import Interface.Configuration;
import Interface.Act;
import java.util.ArrayDeque;

public class AlterPlanner extends Configuration {

  public synchronized void procedureIngoing(Act serve) {
    wantCongestion[0].addLast(serve);
  }

  private int hoursRetaining;
  private ArrayDeque<Act>[] wantCongestion;

  private synchronized Act receiveIncomingLitigate() {
    {
      int i = 0;

      while (i < wantCongestion.length) {
        {
          {
            if (!wantCongestion[i].isEmpty()) {
              afootFocus = (i);
              return wantCongestion[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  private int afootFocus;

  private synchronized boolean primedIsVacant() {
    {
      int i = 0;

      while (i < wantCongestion.length) {
        {
          {
            if (!wantCongestion[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  public AlterPlanner() {
    this.wantCongestion = (new ArrayDeque[6]);
    {
      int i = 0;

      while (i < wantCongestion.length) {
        {
          {
            wantCongestion[i] = (new ArrayDeque<>());
          }
        }
        i++;
      }
    }
    hoursRetaining = (BeginningMammoth);
    afootFocus = (0);
  }

  public synchronized void weapMark() {

    if (prevailingProcedure != null) {
      prevailingProcedure.rigidWalkingAmount(prevailingProcedure.produceGushingNow() + 1);
      hoursRetaining--;

      if (prevailingProcedure.produceGushingNow() == prevailingProcedure.arrivePrezWingspan()) {
        prevailingProcedure.markDeceaseHours(this.conveyFormerGene());
        this.realizedWork.addLast(prevailingProcedure);
        prevailingProcedure = (null);
        this.fellyAlert = (true);
      }

      if (hoursRetaining == 0 && prevailingProcedure != null) {

        if (primedIsVacant()) {
          hoursRetaining = (BeginningMammoth);
        } else {
          wantCongestion[afootFocus + 1].addLast(prevailingProcedure);
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

      if (prevailingProcedure == null && !primedIsVacant()) {
        prevailingProcedure = (receiveIncomingLitigate());
        consignmentTreat(prevailingProcedure);
        prevailingProcedure.fixEarlyThing(this.conveyFormerGene());
        hoursRetaining = (BeginningMammoth);
      }
    }
  }

  public synchronized String synchronizerDescribe() {
    return "FB:";
  }
}
