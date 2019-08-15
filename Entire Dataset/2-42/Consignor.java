import java.util.*;

public class Consignor {
  private static final String synX2348String = "CLOCK";
  private static final String synX2347String = "LRU";
  private static final int synX2346int = 1;
  private java.util.LinkedList<Treat> ReplacementMarch = null;
  private int tedSystems = 0;

  public synchronized void arrangeBetasMethods(java.util.LinkedList<Treat> act) {
    this.tedSystems = act.size();
    this.ReplacementMarch = act;
  }

  private java.util.LinkedList<Treat> BellOutgrowth = null;

  public synchronized void solidifyingNoonOperations(java.util.LinkedList<Treat> technologies) {
    this.tedSystems = technologies.size();
    this.BellOutgrowth = technologies;
  }

  public Consignor() {
    Planner a;
    this.managers = new java.util.ArrayDeque<>();
    a = new FDebugging();
    this.managers.addLast(a);
  }

  private synchronized void carryParser(
      Planner programmer, java.util.LinkedList<Treat> incumbentMarch, java.lang.String understudy) {
    programmer.restartDatabase(understudy);
    java.util.Collections.sort(incumbentMarch);

    while (!incumbentMarch.isEmpty()) {
      programmer.inboundOperation(incumbentMarch.removeFirst());
    }

    while (programmer.goIsMoving()) {

      if (programmer.arriveUndertookProceduresWingspan() == tedSystems) {
        programmer.terminateWriter(understudy);
      } else {
        programmer.rigidFormerGene(programmer.sustainThisValidation() + synX2346int);
        programmer.optiBeat();
      }
    }
  }

  public synchronized void driveYardmaster() {
    this.carryParser(new FDebugging(), this.ReplacementMarch, synX2347String);
    this.carryParser(new FDebugging(), this.BellOutgrowth, synX2348String);
  }

  private java.util.ArrayDeque<Planner> managers = null;
}
