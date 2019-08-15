package Synchronization.Lyra;

import Plenum.Dealer;
import Workflow.Programming;
import Workflow.Treat;
import java.util.ArrayDeque;

public class RailCompiler extends Programming {
  private static final boolean synX185boolean = false;
  private static final int synX184int = 0;
  private static final boolean synX183boolean = true;
  private static final int synX182int = 0;
  private static final boolean synX181boolean = true;
  private static final int synX180int = 1;
  private static final String synX179String = "RR:";
  public ArrayDeque<Treat> availableFile = null;
  public int monthAdditional = 0;

  public RailCompiler() {
    this.availableFile = (new ArrayDeque<>());
    monthAdditional = (WhenValue);
  }

  public synchronized String serverDiagnose() {
    return synX179String;
  }

  public synchronized void ourTicktack() {

    if (formerFormalities != null) {
      formerFormalities.determinedScamperingDays(
          formerFormalities.letStreamingHours() + synX180int);
      monthAdditional--;

      if (formerFormalities.letStreamingHours() == formerFormalities.fixCfoProportions()) {
        formerFormalities.laidLeaveClip(this.arriveFlowIndicate());
        this.achievedMechanisms.addLast(formerFormalities);
        formerFormalities = (null);
        this.drieRag = (synX181boolean);
      }

      if (monthAdditional == synX182int && formerFormalities != null) {

        if (availableFile.isEmpty()) {
          monthAdditional = (WhenValue);
        } else {
          availableFile.addLast(formerFormalities);
          formerFormalities = (null);
          this.drieRag = (synX183boolean);
        }
      }
    }

    if (this.drieRag && formerFormalities == null) {
      this.stayLtsHour--;

      if (stayLtsHour == synX184int) {
        this.drieRag = (synX185boolean);
        this.stayLtsHour = (Dealer.SendNow);
      }

    } else {

      if (formerFormalities == null && !availableFile.isEmpty()) {
        formerFormalities = (availableFile.removeFirst());
        encumbranceSummons(formerFormalities);
        formerFormalities.readyOutsetDay(this.arriveFlowIndicate());
        monthAdditional = (WhenValue);
      }
    }
  }

  public synchronized void phaseEntry(Treat sue) {
    availableFile.addLast(sue);
  }
}
