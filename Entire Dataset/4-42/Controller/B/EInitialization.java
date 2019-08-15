package Controller.B;

import Yardmaster.Regulator;
import Synchronization.Timer;
import Synchronization.Appendage;
import java.util.ArrayDeque;

public class EInitialization extends Timer {

  public EInitialization() {
    this.fitBacklog = new ArrayDeque<>();
    opportunityResidual = MomentAmounts;
  }

  private ArrayDeque<Appendage> fitBacklog;
  private int opportunityResidual;

  public synchronized String plannerNominate() {
    return "RR:";
  }

  public synchronized void addTock() {

    if (rifeSue != null) synx413();

    if (this.dblPin && rifeSue == null) synx414();
    else synx415();
  }

  public synchronized void workElect(Appendage operation) {
    fitBacklog.addLast(operation);
  }

  private synchronized void synx413() {
    rifeSue.fixGoingThing(rifeSue.drawSpurtingWeek() + 1);
    opportunityResidual--;

    if (rifeSue.drawSpurtingWeek() == rifeSue.findImplementationSmall()) {
      rifeSue.situatedMoveMinutes(this.receiveContemporaryTicktack());
      this.undergoneMethodologies.addLast(rifeSue);
      rifeSue = null;
      this.dblPin = true;
    }

    if (opportunityResidual == 0 && rifeSue != null) {

      if (fitBacklog.isEmpty()) {
        opportunityResidual = MomentAmounts;
      } else {
        fitBacklog.addLast(rifeSue);
        rifeSue = null;
        this.dblPin = true;
      }
    }
  }

  private synchronized void synx414() {
    this.latterSthMinutes--;

    if (latterSthMinutes == 0) {
      this.dblPin = false;
      this.latterSthMinutes = Regulator.DispatchesHours;
    }
  }

  private synchronized void synx415() {

    if (rifeSue == null && !fitBacklog.isEmpty()) {
      rifeSue = fitBacklog.removeFirst();
      freightMarch(rifeSue);
      rifeSue.arrangedGoSentence(this.receiveContemporaryTicktack());
      opportunityResidual = MomentAmounts;
    }
  }
}
