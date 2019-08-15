package Multitasking.Using;

import Yardmaster.Regulator;
import Synchronization.Timer;
import Synchronization.Appendage;
import java.util.ArrayDeque;

public class PapsOrganizer extends Timer {

  public PapsOrganizer() {
    this.makeRow = new ArrayDeque<>();
  }

  public synchronized String plannerNominate() {
    return "FCFS:";
  }

  private ArrayDeque<Appendage> makeRow;

  public synchronized void workElect(Appendage methodology) {
    makeRow.addLast(methodology);
  }

  public synchronized void addTock() {

    if (rifeSue != null) synx427();

    if (this.dblPin && rifeSue == null) synx428();
    else synx429();
  }

  private synchronized void synx427() {
    rifeSue.fixGoingThing(rifeSue.drawSpurtingWeek() + 1);

    if (rifeSue.drawSpurtingWeek() == rifeSue.findImplementationSmall()) {
      rifeSue.situatedMoveMinutes(this.receiveContemporaryTicktack());
      this.undergoneMethodologies.addLast(rifeSue);
      rifeSue = null;
      this.dblPin = true;
    }
  }

  private synchronized void synx428() {
    this.latterSthMinutes--;

    if (latterSthMinutes == 0) {
      this.dblPin = false;
      this.latterSthMinutes = Regulator.DispatchesHours;
    }
  }

  private synchronized void synx429() {

    if (rifeSue == null && !makeRow.isEmpty()) {
      rifeSue = makeRow.removeFirst();
      rifeSue.arrangedGoSentence(this.receiveContemporaryTicktack());
      freightMarch(rifeSue);
    }
  }
}
