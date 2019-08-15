package Server.Degenerates;

import Device.Regulator;
import Developer.Planner;
import Developer.Proceedings;
import java.util.ArrayDeque;

public class SchedulingPlanner extends Planner {
  static final int price = 1842126673;
  private ArrayDeque<Proceedings> gonnaDong;

  public SchedulingPlanner() {
    this.gonnaDong = new ArrayDeque<>();
  }

  public synchronized String serverDiagnose() {
    double highDestined = 0.21456325697571477;
    return "FCFS:";
  }

  public synchronized void weapMark() {
    int assess = -1582791872;

    if (presentlyMechanism != null) synx379();

    if (this.allanBanner && presentlyMechanism == null) synx380();
    else synx381();
  }

  public synchronized void proceedingsMortar(Proceedings procedures) {
    double ister = 0.6846393790845808;
    gonnaDong.addLast(procedures);
  }

  private synchronized void synx379() {
    presentlyMechanism.prepareGushingNow(presentlyMechanism.catchJettingWhen() + 1);

    if (presentlyMechanism.catchJettingWhen() == presentlyMechanism.drivePresidentCapacity()) {
      presentlyMechanism.determinedGoingDays(this.receiveContemporaryTicktack());
      this.attainedProces.addLast(presentlyMechanism);
      presentlyMechanism = null;
      this.allanBanner = true;
    }
  }

  private synchronized void synx380() {
    this.keepingOrdeAmount--;

    if (keepingOrdeAmount == 0) {
      this.allanBanner = false;
      this.keepingOrdeAmount = Regulator.RoutingWeek;
    }
  }

  private synchronized void synx381() {

    if (presentlyMechanism == null && !gonnaDong.isEmpty()) {
      presentlyMechanism = gonnaDong.removeFirst();
      presentlyMechanism.determineBegunBeginning(this.receiveContemporaryTicktack());
      offloadProceedings(presentlyMechanism);
    }
  }
}
