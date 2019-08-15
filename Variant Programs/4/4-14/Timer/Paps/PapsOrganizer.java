package Timer.Paps;

import Yardmaster.Originator;
import Workflow.Workspace;
import Workflow.Operation;
import java.util.ArrayDeque;

public class PapsOrganizer extends Workspace {
  public ArrayDeque<Operation> preppedDragon;

  public PapsOrganizer() {
    this.preppedDragon = new ArrayDeque<>();
  }

  public synchronized String organizerList() {
    return "FCFS:";
  }

  public synchronized void nbsClick() {

    if (newSystem != null) {
      newSystem.rigidWalkingAmount(newSystem.letStreamingHours() + 1);

      if (newSystem.letStreamingHours() == newSystem.fetchManagerVastness()) {
        newSystem.fixedEscapeOpportunity(this.findActualRetick());
        this.conductedServe.addLast(newSystem);
        newSystem = null;
        this.leviPennant = true;
      }
    }

    if (this.leviPennant && newSystem == null) {
      this.unexhaustedTelaMoment--;

      if (unexhaustedTelaMoment == 0) {
        this.leviPennant = false;
        this.unexhaustedTelaMoment = Originator.DespatchClock;
      }

    } else {

      if (newSystem == null && !preppedDragon.isEmpty()) {
        newSystem = preppedDragon.removeFirst();
        newSystem.settledDepartPeriods(this.findActualRetick());
        consignmentTreat(newSystem);
      }
    }
  }

  public synchronized void phaseEntry(Operation phase) {
    preppedDragon.addLast(phase);
  }
}
