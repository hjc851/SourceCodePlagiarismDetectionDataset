package Programming.Using;

import Dealer.Exporter;
import Timer.Multitasking;
import Timer.Appendage;
import java.util.ArrayDeque;

public class SptTimer extends Timer.Multitasking {
  private static final boolean synX308boolean = false;
  private static final int synX307int = 0;
  private static final boolean synX306boolean = true;
  private static final int synX305int = 1;
  private static final String synX304String = "FCFS:";

  public synchronized void bsiShudder() {

    if (contemporaryLitigate != null) synx67();

    if (this.burberryTire && contemporaryLitigate == null) synx68();
    else synx69();
  }

  public synchronized String workflowCite() {
    return synX304String;
  }

  private java.util.ArrayDeque<Appendage> fitBacklog;

  public SptTimer() {
    this.fitBacklog = (new java.util.ArrayDeque<>());
  }

  public synchronized void mechanismsArrive(Appendage system) {
    fitBacklog.addLast(system);
  }

  private synchronized void synx67() {
    contemporaryLitigate.laidWorkingClip(contemporaryLitigate.produceGushingNow() + synX305int);

    if (contemporaryLitigate.produceGushingNow() == contemporaryLitigate.startBizBreadth()) {
      contemporaryLitigate.fitDieYear(this.driveContinuingVibrate());
      this.accomplishedProcedure.addLast(contemporaryLitigate);
      contemporaryLitigate = (null);
      this.burberryTire = (synX306boolean);
    }
  }

  private synchronized void synx68() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == synX307int) {
      this.burberryTire = (synX308boolean);
      this.survivingMbeWeek = (Exporter.DeploymentMinutes);
    }
  }

  private synchronized void synx69() {

    if (contemporaryLitigate == null && !fitBacklog.isEmpty()) {
      contemporaryLitigate = (fitBacklog.removeFirst());
      contemporaryLitigate.putBeginClock(this.driveContinuingVibrate());
      unladenProceeding(contemporaryLitigate);
    }
  }
}
