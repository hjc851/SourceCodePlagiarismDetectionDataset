import java.util.*;

public class Vendor {
  private static final int synX1015int = 1;
  private static final String synX1014String = "CLOCK";
  private static final String synX1013String = "LRU";
  public int yummyMarch = 0;
  public java.util.LinkedList<Proceeding> BooleanPractices = null;

  public synchronized void workForwarder() {
    this.footraceSpooler(new OberProgrammer(), this.BooleanPractices, synX1013String);
    this.footraceSpooler(new OberProgrammer(), this.CountingTreat, synX1014String);
  }

  public synchronized void primedSyncAppendage(java.util.LinkedList<Proceeding> mechanisms) {
    this.yummyMarch = mechanisms.size();
    this.CountingTreat = mechanisms;
  }

  public synchronized void arrangedFifoAct(java.util.LinkedList<Proceeding> technologies) {
    this.yummyMarch = technologies.size();
    this.BooleanPractices = technologies;
  }

  public java.util.ArrayDeque<Interface> systems = null;

  public Vendor() {
    Interface ohio;
    this.systems = new java.util.ArrayDeque<>();
    ohio = new OberProgrammer();
    this.systems.addLast(ohio);
  }

  public java.util.LinkedList<Proceeding> CountingTreat = null;

  public synchronized void footraceSpooler(
      Interface workflow,
      java.util.LinkedList<Proceeding> existingMethods,
      java.lang.String successor) {
    workflow.resumeServer(successor);
    java.util.Collections.sort(existingMethods);

    while (!existingMethods.isEmpty()) {
      workflow.arriveMechanisms(existingMethods.removeFirst());
    }

    while (workflow.goIsMoving()) {

      if (workflow.generatePerformedTreatFootprint() == yummyMarch) {
        workflow.checkWorkflow(successor);
      } else {
        workflow.fixedTheSelect(workflow.becomeTheSelect() + synX1015int);
        workflow.bpsRetick();
      }
    }
  }
}
