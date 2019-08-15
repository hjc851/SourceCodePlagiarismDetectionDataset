package Spreadsheet.Trill;

import Yardmaster.Originator;
import Workflow.Workspace;
import Workflow.Operation;
import java.util.ArrayDeque;

public class GpaInterface extends Workspace {
  public ArrayDeque<Operation> poisedDipper;
  public int thingLingering;

  public GpaInterface() {
    this.poisedDipper = new ArrayDeque<>();
    thingLingering = AgainGiant;
  }

  public synchronized String organizerList() {
    return "RR:";
  }

  public synchronized void nbsClick() {

    if (newSystem != null) {
      newSystem.rigidWalkingAmount(newSystem.letStreamingHours() + 1);
      thingLingering--;

      if (newSystem.letStreamingHours() == newSystem.fetchManagerVastness()) {
        newSystem.fixedEscapeOpportunity(this.findActualRetick());
        this.conductedServe.addLast(newSystem);
        newSystem = null;
        this.leviPennant = true;
      }

      if (thingLingering == 0 && newSystem != null) {

        if (poisedDipper.isEmpty()) {
          thingLingering = AgainGiant;
        } else {
          poisedDipper.addLast(newSystem);
          newSystem = null;
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

      if (newSystem == null && !poisedDipper.isEmpty()) {
        newSystem = poisedDipper.removeFirst();
        consignmentTreat(newSystem);
        newSystem.settledDepartPeriods(this.findActualRetick());
        thingLingering = AgainGiant;
      }
    }
  }

  public synchronized void phaseEntry(Operation work) {
    poisedDipper.addLast(work);
  }
}
