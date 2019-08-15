package Synchronization.Fuzee;

import Dealer.Exporter;
import Timer.Multitasking;
import Timer.Appendage;
import java.util.ArrayDeque;

public class OmskSpooler extends Timer.Multitasking {
  private static final String synX278String = "RR:";

  public synchronized String workflowCite() {
    return synX278String;
  }

  public synchronized void bsiShudder() {

    if (contemporaryLitigate != null) synx53();

    if (this.burberryTire && contemporaryLitigate == null) synx54();
    else synx55();
  }

  public synchronized void mechanismsArrive(Appendage litigate) {
    promptPenis.addLast(litigate);
  }

  private java.util.ArrayDeque<Appendage> promptPenis;

  public OmskSpooler() {
    this.promptPenis = (new java.util.ArrayDeque<>());
    clockLeft = (DaysQuantitative);
  }

  private int clockLeft;

  private synchronized void synx53() {
    contemporaryLitigate.laidWorkingClip(contemporaryLitigate.produceGushingNow() + 1);
    clockLeft--;

    if (contemporaryLitigate.produceGushingNow() == contemporaryLitigate.startBizBreadth()) {
      contemporaryLitigate.fitDieYear(this.driveContinuingVibrate());
      this.accomplishedProcedure.addLast(contemporaryLitigate);
      contemporaryLitigate = (null);
      this.burberryTire = (true);
    }

    if (clockLeft == 0 && contemporaryLitigate != null) {

      if (promptPenis.isEmpty()) {
        clockLeft = (DaysQuantitative);
      } else {
        promptPenis.addLast(contemporaryLitigate);
        contemporaryLitigate = (null);
        this.burberryTire = (true);
      }
    }
  }

  private synchronized void synx54() {
    this.survivingMbeWeek--;

    if (survivingMbeWeek == 0) {
      this.burberryTire = (false);
      this.survivingMbeWeek = (Exporter.DeploymentMinutes);
    }
  }

  private synchronized void synx55() {

    if (contemporaryLitigate == null && !promptPenis.isEmpty()) {
      contemporaryLitigate = (promptPenis.removeFirst());
      unladenProceeding(contemporaryLitigate);
      contemporaryLitigate.putBeginClock(this.driveContinuingVibrate());
      clockLeft = (DaysQuantitative);
    }
  }
}
