package Interface.Grr;

import Yardmaster.Originator;
import Workflow.Workspace;
import Workflow.Operation;
import java.util.ArrayDeque;

public class GrrProgrammer extends Workspace {
  public ArrayDeque<GrrProcedure> gonnaDong;
  public int whenLeaving;
  public GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.gonnaDong = new ArrayDeque<>();
    whenLeaving = Workflow.AgainGiant;
  }

  public synchronized String organizerList() {
    return "NRR:";
  }

  public synchronized void nbsClick() {

    if (grrProcedure != null) {
      grrProcedure.rigidWalkingAmount(grrProcedure.letStreamingHours() + 1);
      whenLeaving--;

      if (grrProcedure.letStreamingHours() == grrProcedure.fetchManagerVastness()) {
        grrProcedure.fixedEscapeOpportunity(this.findActualRetick());
        this.conductedServe.addLast(grrProcedure);
        grrProcedure = null;
        this.leviPennant = true;
      }

      if (whenLeaving == 0 && grrProcedure != null) {

        if (gonnaDong.isEmpty()) {
          whenLeaving = grrProcedure.letHoursHuge();
        } else {

          if (grrProcedure.letHoursHuge() > 2) {
            grrProcedure.prepareNowLevel(grrProcedure.letHoursHuge() - 1);
          }

          gonnaDong.addLast(grrProcedure);
          grrProcedure = null;
          this.leviPennant = true;
        }
      }
    }

    if (this.leviPennant && newSystem == null) {
      this.unexhaustedTelaMoment--;

      if (unexhaustedTelaMoment == 0) {
        this.leviPennant = false;
        this.unexhaustedTelaMoment = Originator.DespatchClock;
      }

    } else {

      if (grrProcedure == null && !gonnaDong.isEmpty()) {
        grrProcedure = gonnaDong.removeFirst();
        consignmentTreat(grrProcedure);
        grrProcedure.settledDepartPeriods(this.findActualRetick());
        whenLeaving = grrProcedure.letHoursHuge();
      }
    }
  }

  public synchronized void phaseEntry(Operation proceedings) {
    gonnaDong.add(new GrrProcedure(proceedings));
  }
}
