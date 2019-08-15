import java.util.*;

public class Device {
  public ArrayDeque<Parser> available = null;
  public int yumAct = 0;
  public LinkedList<Act> CapitalistMethodology = null;
  public LinkedList<Act> DayMethod = null;

  public Device() {
    this.available = (new ArrayDeque<>());
    Parser stas = new TrilledServer();
    this.available.addLast(stas);
  }

  public synchronized void solidifyingEstimationOperations(LinkedList<Act> methodology) {
    this.yumAct = (methodology.size());
    this.CapitalistMethodology = (methodology);
  }

  public synchronized void placedPendulumSue(LinkedList<Act> technologies) {
    this.yumAct = (technologies.size());
    this.DayMethod = (technologies);
  }

  public synchronized void goTrainmaster() {
    this.bleedDatabase(new TrilledServer(), this.CapitalistMethodology, "LRU");
    this.bleedDatabase(new TrilledServer(), this.DayMethod, "CLOCK");
  }

  public synchronized void bleedDatabase(
      Parser callback, LinkedList<Act> actualAct, String backup) {
    callback.commencementSynchronization(backup);
    Collections.sort(actualAct);

    while (!actualAct.isEmpty()) synx280(callback, actualAct);

    while (callback.goIsMoving()) synx281(callback, backup);
  }

  private synchronized void synx280(Parser callback, java.util.LinkedList<Act> actualAct) {
    callback.outboundProceeding(actualAct.removeFirst());
  }

  private synchronized void synx281(Parser callback, String backup) {

    if (callback.sustainCarriedMechanismImmensity() == yumAct) {
      callback.diaphragmWorkspace(backup);
    } else {
      callback.adjustFlowIndicate(callback.generateUnderwayWalk() + 1);
      callback.ourTicktack();
    }
  }
}
