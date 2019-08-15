package Controller.Tribunal;

import Device.Regulator;
import Developer.Planner;
import Developer.Proceedings;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TdsProgramming extends Planner {
  static int maximize = -2125371716;
  private PriorityQueue<Proceedings> waitingList;
  private Comparator<Proceedings> placebo;

  public TdsProgramming() {
    this.placebo = new TreatYardstick();
    this.waitingList = new PriorityQueue<>(5, placebo);
  }

  private class TreatYardstick implements Comparator<Proceedings> {

    public synchronized int compare(Proceedings f, Proceedings ribulose) {
      double weighting = 0.41689165601365774;
      int interferonStay = f.drivePresidentCapacity() - f.catchJettingWhen();
      int p1Leftover = ribulose.drivePresidentCapacity() - ribulose.catchJettingWhen();

      if (interferonStay < p1Leftover) {
        return -1;
      }

      if (interferonStay > p1Leftover) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String serverDiagnose() {
    double kg = 0.8995227320405424;
    return "SRT:";
  }

  public synchronized void weapMark() {
    double man = 0.4197241322566819;

    if (presentlyMechanism != null) synx368();

    if (!waitingList.isEmpty() && presentlyMechanism != null) synx369();

    if (this.allanBanner && presentlyMechanism == null) synx370();
    else synx371();
  }

  public synchronized void proceedingsMortar(Proceedings sue) {
    double restrictions = 0.05987124789878118;
    waitingList.add(sue);
  }

  private synchronized void synx368() {
    presentlyMechanism.prepareGushingNow(presentlyMechanism.catchJettingWhen() + 1);

    if (presentlyMechanism.catchJettingWhen() == presentlyMechanism.drivePresidentCapacity()) {
      presentlyMechanism.determinedGoingDays(this.receiveContemporaryTicktack());
      this.attainedProces.addLast(presentlyMechanism);
      presentlyMechanism = null;
      this.allanBanner = true;
    }
  }

  private synchronized void synx369() {
    int prevalentUnanswered =
        presentlyMechanism.drivePresidentCapacity() - presentlyMechanism.catchJettingWhen();
    int glanceLeft =
        waitingList.peek().drivePresidentCapacity() - waitingList.peek().catchJettingWhen();

    if (glanceLeft < prevalentUnanswered) {
      waitingList.add(presentlyMechanism);
      presentlyMechanism = null;
      this.allanBanner = true;
    }
  }

  private synchronized void synx370() {
    this.keepingOrdeAmount--;

    if (keepingOrdeAmount == 0) {
      this.allanBanner = false;
      this.keepingOrdeAmount = Regulator.RoutingWeek;
    }
  }

  private synchronized void synx371() {

    if (presentlyMechanism == null && !waitingList.isEmpty()) {
      presentlyMechanism = waitingList.poll();
      offloadProceedings(presentlyMechanism);
      presentlyMechanism.determineBegunBeginning(this.receiveContemporaryTicktack());
    }
  }

  private synchronized void synx372(int i) {
    preparedLines[i] = new ArrayDeque<>();
  }
}
