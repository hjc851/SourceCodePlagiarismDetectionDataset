import java.util.*;

public class Device {

  public synchronized void markAverageSummons(LinkedList<Act> march) {
    this.atkinsMechanisms = (march.size());
    this.AssociatedWork = (march);
  }

  public int atkinsMechanisms = 0;
  public LinkedList<Act> SynchronizationMethods = null;

  public Device() {
    this.types = (new ArrayDeque<>());
    Synchronization erie = new EInitialization();
    this.types.addLast(erie);
  }

  public synchronized void bentAlarmTechnologies(LinkedList<Act> summons) {
    this.atkinsMechanisms = (summons.size());
    this.SynchronizationMethods = (summons);
  }

  public synchronized void playSalesperson() {
    this.extendSynchronization(new EInitialization(), this.AssociatedWork, "LRU");
    this.extendSynchronization(new EInitialization(), this.SynchronizationMethods, "CLOCK");
  }

  public LinkedList<Act> AssociatedWork = null;
  public ArrayDeque<Synchronization> types = null;

  public synchronized void extendSynchronization(
      Synchronization organizer, LinkedList<Act> flowProcedures, String understudy) {
    organizer.beginsCallback(understudy);
    Collections.sort(flowProcedures);

    while (!flowProcedures.isEmpty()) {
      organizer.arrivingLitigate(flowProcedures.removeFirst());
    }

    while (organizer.goIsMoving()) {

      if (organizer.startConstructedMethodologyBreadth() == atkinsMechanisms) {
        organizer.closureServer(understudy);
      } else {
        organizer.markAfootDials(organizer.canExistingDial() + 1);
        organizer.bsiShudder();
      }
    }
  }
}
