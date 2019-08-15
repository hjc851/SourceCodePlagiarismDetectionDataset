package Configuration.Grr;

import Yardmaster.Regulator;
import Synchronization.Timer;
import Synchronization.Appendage;
import java.util.ArrayDeque;

public class GrrProgrammer extends Timer {

  public synchronized void addTock() {

    if (grrProcedure != null) synx424();

    if (this.dblPin && rifeSue == null) synx425();
    else synx426();
  }

  public synchronized String plannerNominate() {
    return "NRR:";
  }

  private ArrayDeque<GrrProcedure> willingSpooler;
  private GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.willingSpooler = new ArrayDeque<>();
    junctureMaintaining = Synchronization.MomentAmounts;
  }

  private int junctureMaintaining;

  public synchronized void workElect(Appendage act) {
    willingSpooler.add(new GrrProcedure(act));
  }

  private synchronized void synx424() {
    grrProcedure.fixGoingThing(grrProcedure.drawSpurtingWeek() + 1);
    junctureMaintaining--;

    if (grrProcedure.drawSpurtingWeek() == grrProcedure.findImplementationSmall()) {
      grrProcedure.situatedMoveMinutes(this.receiveContemporaryTicktack());
      this.undergoneMethodologies.addLast(grrProcedure);
      grrProcedure = null;
      this.dblPin = true;
    }

    if (junctureMaintaining == 0 && grrProcedure != null) {

      if (willingSpooler.isEmpty()) {
        junctureMaintaining = grrProcedure.produceNowLevel();
      } else {

        if (grrProcedure.produceNowLevel() > 2) {
          grrProcedure.placedWhenValue(grrProcedure.produceNowLevel() - 1);
        }

        willingSpooler.addLast(grrProcedure);
        grrProcedure = null;
        this.dblPin = true;
      }
    }
  }

  private synchronized void synx425() {
    this.latterSthMinutes--;

    if (latterSthMinutes == 0) {
      this.dblPin = false;
      this.latterSthMinutes = Regulator.DispatchesHours;
    }
  }

  private synchronized void synx426() {

    if (grrProcedure == null && !willingSpooler.isEmpty()) {
      grrProcedure = willingSpooler.removeFirst();
      freightMarch(grrProcedure);
      grrProcedure.arrangedGoSentence(this.receiveContemporaryTicktack());
      junctureMaintaining = grrProcedure.produceNowLevel();
    }
  }
}
