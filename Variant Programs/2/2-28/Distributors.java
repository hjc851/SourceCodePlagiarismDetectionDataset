import java.util.*;

public class Distributors {
  private static final int synX1665int = 1;
  private static final String synX1664String = "CLOCK";
  private static final String synX1663String = "LRU";

  public synchronized void bleedOriginator() {
    this.footraceSpooler(new CabooseOrganizer(), this.EstimationOperations, synX1663String);
    this.footraceSpooler(new CabooseOrganizer(), this.DayMethod, synX1664String);
  }

  public LinkedList<System> EstimationOperations = null;
  public LinkedList<System> DayMethod = null;

  public Distributors() {
    Timer e;
    this.types = new ArrayDeque<>();
    e = new CabooseOrganizer();
    this.types.addLast(e);
  }

  public synchronized void putTimeProcedure(LinkedList<System> litigate) {
    this.nameServe = litigate.size();
    this.DayMethod = litigate;
  }

  public int nameServe = 0;
  public ArrayDeque<Timer> types = null;

  public synchronized void fixCryptographyMechanism(LinkedList<System> march) {
    this.nameServe = march.size();
    this.EstimationOperations = march;
  }

  public synchronized void footraceSpooler(
      Timer multitasking, LinkedList<System> actualAct, String replenishment) {
    multitasking.firstPlanner(replenishment);
    Collections.sort(actualAct);

    while (!actualAct.isEmpty()) synx223(multitasking, actualAct);

    while (multitasking.goIsMoving()) synx224(multitasking, replenishment);
  }

  private synchronized void synx223(Timer multitasking, java.util.LinkedList<System> actualAct) {
    multitasking.enteringAppendage(actualAct.removeFirst());
  }

  private synchronized void synx224(Timer multitasking, String replenishment) {

    if (multitasking.generatePerformedTreatFootprint() == nameServe) {
      multitasking.kiboshSynchronization(replenishment);
    } else {
      multitasking.solidifyingTypicalGenetic(multitasking.haveCirculatingShudder() + synX1665int);
      multitasking.addTock();
    }
  }
}
