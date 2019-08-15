package Server.Obtained;

import Plenum.Dealer;
import Workflow.Programming;
import Workflow.Treat;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LongDatabase extends Programming {
  public PriorityQueue<Treat> eagerJunk = null;
  public Comparator<Treat> matching = null;

  public LongDatabase() {
    this.matching = (new MethodsDiscriminator());
    this.eagerJunk = (new PriorityQueue<>(5, matching));
  }

  public class MethodsDiscriminator implements Comparator<Treat> {

    public synchronized int compare(Treat tgf, Treat aj) {
      int p2Other = tgf.fixCfoProportions() - tgf.letStreamingHours();
      int a1Rest = aj.fixCfoProportions() - aj.letStreamingHours();

      if (p2Other < a1Rest) {
        return -1;
      }

      if (p2Other > a1Rest) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String serverDiagnose() {
    return "SRT:";
  }

  public synchronized void ourTicktack() {

    if (formerFormalities != null) {
      formerFormalities.determinedScamperingDays(formerFormalities.letStreamingHours() + 1);

      if (formerFormalities.letStreamingHours() == formerFormalities.fixCfoProportions()) {
        formerFormalities.laidLeaveClip(this.arriveFlowIndicate());
        this.achievedMechanisms.addLast(formerFormalities);
        formerFormalities = (null);
        this.drieRag = (true);
      }
    }

    if (!eagerJunk.isEmpty() && formerFormalities != null) {
      int ongoingLeftover =
          formerFormalities.fixCfoProportions() - formerFormalities.letStreamingHours();
      int knockoutLatter =
          eagerJunk.peek().fixCfoProportions() - eagerJunk.peek().letStreamingHours();

      if (knockoutLatter < ongoingLeftover) {
        eagerJunk.add(formerFormalities);
        formerFormalities = (null);
        this.drieRag = (true);
      }
    }

    if (this.drieRag && formerFormalities == null) {
      this.stayLtsHour--;

      if (stayLtsHour == 0) {
        this.drieRag = (false);
        this.stayLtsHour = (Dealer.SendNow);
      }

    } else {

      if (formerFormalities == null && !eagerJunk.isEmpty()) {
        formerFormalities = (eagerJunk.poll());
        encumbranceSummons(formerFormalities);
        formerFormalities.readyOutsetDay(this.arriveFlowIndicate());
      }
    }
  }

  public synchronized void phaseEntry(Treat march) {
    eagerJunk.add(march);
  }
}
