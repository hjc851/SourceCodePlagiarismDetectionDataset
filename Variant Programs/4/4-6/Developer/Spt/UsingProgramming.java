package Developer.Spt;

import Plenum.Dealer;
import Workflow.Programming;
import Workflow.Treat;
import java.util.ArrayDeque;

public class UsingProgramming extends Programming {
  private static final boolean synX212boolean = false;
  private static final int synX211int = 0;
  private static final boolean synX210boolean = true;
  private static final int synX209int = 1;
  private static final String synX208String = "FCFS:";
  public ArrayDeque<Treat> wantGlue = null;

  public UsingProgramming() {
    this.wantGlue = (new ArrayDeque<>());
  }

  public synchronized String serverDiagnose() {
    return synX208String;
  }

  public synchronized void ourTicktack() {

    if (formerFormalities != null) {
      formerFormalities.determinedScamperingDays(
          formerFormalities.letStreamingHours() + synX209int);

      if (formerFormalities.letStreamingHours() == formerFormalities.fixCfoProportions()) {
        formerFormalities.laidLeaveClip(this.arriveFlowIndicate());
        this.achievedMechanisms.addLast(formerFormalities);
        formerFormalities = (null);
        this.drieRag = (synX210boolean);
      }
    }

    if (this.drieRag && formerFormalities == null) {
      this.stayLtsHour--;

      if (stayLtsHour == synX211int) {
        this.drieRag = (synX212boolean);
        this.stayLtsHour = (Dealer.SendNow);
      }

    } else {

      if (formerFormalities == null && !wantGlue.isEmpty()) {
        formerFormalities = (wantGlue.removeFirst());
        formerFormalities.readyOutsetDay(this.arriveFlowIndicate());
        encumbranceSummons(formerFormalities);
      }
    }
  }

  public synchronized void phaseEntry(Treat mechanism) {
    wantGlue.addLast(mechanism);
  }
}
