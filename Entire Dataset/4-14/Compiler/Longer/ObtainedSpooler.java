package Compiler.Longer;

import Yardmaster.Originator;
import Workflow.Workspace;
import Workflow.Operation;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainedSpooler extends Workspace {
  public PriorityQueue<Operation> preparedWait;
  public Comparator<Operation> comparable;

  public ObtainedSpooler() {
    this.comparable = new LitigateComparability();
    this.preparedWait = new PriorityQueue<>(5, comparable);
  }

  public class LitigateComparability implements Comparator<Operation> {

    public synchronized int compare(Operation p5, Operation ribulose) {
      int cRetaining = p5.fetchManagerVastness() - p5.letStreamingHours();
      int p1Leftover = ribulose.fetchManagerVastness() - ribulose.letStreamingHours();

      if (cRetaining < p1Leftover) {
        return -1;
      }

      if (cRetaining > p1Leftover) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String organizerList() {
    return "SRT:";
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

    if (!preparedWait.isEmpty() && newSystem != null) {
      int actualUnexpended = newSystem.fetchManagerVastness() - newSystem.letStreamingHours();
      int sightUnresolved =
          preparedWait.peek().fetchManagerVastness() - preparedWait.peek().letStreamingHours();

      if (sightUnresolved < actualUnexpended) {
        preparedWait.add(newSystem);
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

      if (newSystem == null && !preparedWait.isEmpty()) {
        newSystem = preparedWait.poll();
        consignmentTreat(newSystem);
        newSystem.settledDepartPeriods(this.findActualRetick());
      }
    }
  }

  public synchronized void phaseEntry(Operation formalities) {
    preparedWait.add(formalities);
  }
}
