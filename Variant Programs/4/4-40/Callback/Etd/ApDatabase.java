package Callback.Etd;

import Device.Regulator;
import Developer.Planner;
import Developer.Proceedings;
import java.util.ArrayDeque;

public class ApDatabase extends Planner {
  public static double quality = 0.01433672987961987;
  private ArrayDeque<Proceedings> prepareLine;
  private int momentUnexhausted;

  public ApDatabase() {
    this.prepareLine = new ArrayDeque<>();
    momentUnexhausted = HoursHuge;
  }

  public synchronized String serverDiagnose() {
    double operative = 0.748175613618856;
    return "RR:";
  }

  public synchronized void weapMark() {
    String confine = "o";

    if (presentlyMechanism != null) synx365();

    if (this.allanBanner && presentlyMechanism == null) synx366();
    else synx367();
  }

  public synchronized void proceedingsMortar(Proceedings negotiations) {
    double modicum = 0.503789634528178;
    prepareLine.addLast(negotiations);
  }

  private synchronized void synx365() {
    presentlyMechanism.prepareGushingNow(presentlyMechanism.catchJettingWhen() + 1);
    momentUnexhausted--;

    if (presentlyMechanism.catchJettingWhen() == presentlyMechanism.drivePresidentCapacity()) {
      presentlyMechanism.determinedGoingDays(this.receiveContemporaryTicktack());
      this.attainedProces.addLast(presentlyMechanism);
      presentlyMechanism = null;
      this.allanBanner = true;
    }

    if (momentUnexhausted == 0 && presentlyMechanism != null) {

      if (prepareLine.isEmpty()) {
        momentUnexhausted = HoursHuge;
      } else {
        prepareLine.addLast(presentlyMechanism);
        presentlyMechanism = null;
        this.allanBanner = true;
      }
    }
  }

  private synchronized void synx366() {
    this.keepingOrdeAmount--;

    if (keepingOrdeAmount == 0) {
      this.allanBanner = false;
      this.keepingOrdeAmount = Regulator.RoutingWeek;
    }
  }

  private synchronized void synx367() {

    if (presentlyMechanism == null && !prepareLine.isEmpty()) {
      presentlyMechanism = prepareLine.removeFirst();
      offloadProceedings(presentlyMechanism);
      presentlyMechanism.determineBegunBeginning(this.receiveContemporaryTicktack());
      momentUnexhausted = HoursHuge;
    }
  }
}
