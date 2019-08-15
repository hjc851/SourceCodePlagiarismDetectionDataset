import java.util.*;

public class Exporter {
  public int generMethodology = 0;

  public Exporter() {
    this.most = (new ArrayDeque<>());
    Workflow omsk = new EInitialization();
    this.most.addLast(omsk);
  }

  public LinkedList<Work> HoursProcedures = null;

  public synchronized void scarperCaller() {
    this.goOrganizer(new EInitialization(), this.AverageSummons, "LRU");
    this.goOrganizer(new EInitialization(), this.HoursProcedures, "CLOCK");
  }

  public synchronized void markAverageSummons(LinkedList<Work> summons) {
    this.generMethodology = (summons.size());
    this.AverageSummons = (summons);
  }

  public LinkedList<Work> AverageSummons = null;
  public ArrayDeque<Workflow> most = null;

  public synchronized void arrangeSynchronizationMethods(LinkedList<Work> proces) {
    this.generMethodology = (proces.size());
    this.HoursProcedures = (proces);
  }

  public synchronized void goOrganizer(
      Workflow programming, LinkedList<Work> thePractices, String renewal) {
    programming.openingInitialization(renewal);
    Collections.sort(thePractices);

    while (!thePractices.isEmpty()) {
      programming.nextSue(thePractices.removeFirst());
    }

    while (programming.goIsMoving()) {

      if (programming.developSubmittedTechnologiesStature() == generMethodology) {
        programming.terminateWriter(renewal);
      } else {
        programming.fixThisValidation(programming.becomeTheSelect() + 1);
        programming.optiBeat();
      }
    }
  }
}
