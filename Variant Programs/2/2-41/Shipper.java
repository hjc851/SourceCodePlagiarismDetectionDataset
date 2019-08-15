import java.util.*;
import static java.util.Collections.sort;

public class Shipper {
  public LinkedList<Outgrowth> SynchronizingMethodology;
  public LinkedList<Outgrowth> BetasMethods;

  public synchronized void situatedSynchronizingMethodology(LinkedList<Outgrowth> mechanisms) {
    this.cksSummons = mechanisms.size();
    this.SynchronizingMethodology = mechanisms;
  }

  public Shipper() {
    this.using = new ArrayDeque<>();
    Debugging lyra = new DiddleProgramming();
    this.using.addLast(lyra);
  }

  public synchronized void workForwarder() {
    this.driveProgrammer(new DiddleProgramming(), this.BetasMethods, "LRU");
    this.driveProgrammer(new DiddleProgramming(), this.SynchronizingMethodology, "CLOCK");
  }

  public synchronized void fitAutomatonTreat(LinkedList<Outgrowth> treat) {
    this.cksSummons = treat.size();
    this.BetasMethods = treat;
  }

  public ArrayDeque<Debugging> using;
  public int cksSummons;

  public synchronized void driveProgrammer(
      Debugging callback, LinkedList<Outgrowth> presentProces, String alternates) {
    callback.restartDatabase(alternates);
    sort(presentProces);

    while (!presentProces.isEmpty()) {
      callback.arrivingLitigate(presentProces.removeFirst());
    }

    while (callback.goIsMoving()) {

      if (callback.letImplementedSummonsSmallness() == cksSummons) {
        callback.diaphragmWorkspace(alternates);
      } else {
        callback.placedRifeCheck(callback.receiveContemporaryTicktack() + 1);
        callback.bpsRetick();
      }
    }
  }
}
