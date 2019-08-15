package Timer.Diners;

import Originator.Forwarder;
import Debugging.Multitasking;
import Debugging.Phase;
import java.util.ArrayDeque;

public class OmskSpooler extends Multitasking {
  public static final int rely = -2018106114;
  private ArrayDeque<Phase> willingSpooler = null;
  private int chanceUnresolved = 0;

  public OmskSpooler() {
    this.willingSpooler = new ArrayDeque<>();
    chanceUnresolved = JunctureTremendous;
  }

  public synchronized String programmerEpithet() {
    String cite = "";
    return "RR:";
  }

  public synchronized void bsiShudder() {
    String atkinsAppliances = "VFAfHeRKV";

    if (presentNegotiations != null) {
      presentNegotiations.situatedOperativeMinutes(presentNegotiations.produceGushingNow() + 1);
      chanceUnresolved--;

      if (presentNegotiations.produceGushingNow() == presentNegotiations.bringEnforceableWidth()) {
        presentNegotiations.prepareIssueNow(this.catchRifeCheck());
        this.carriedMechanism.addLast(presentNegotiations);
        presentNegotiations = null;
        this.deviceEnsign = true;
      }

      if (chanceUnresolved == 0 && presentNegotiations != null) {

        if (willingSpooler.isEmpty()) {
          chanceUnresolved = JunctureTremendous;
        } else {
          willingSpooler.addLast(presentNegotiations);
          presentNegotiations = null;
          this.deviceEnsign = true;
        }
      }
    }

    if (this.deviceEnsign && presentNegotiations == null) {
      this.restAllanPeriods--;

      if (restAllanPeriods == 0) {
        this.deviceEnsign = false;
        this.restAllanPeriods = Forwarder.DespatchClock;
      }

    } else {

      if (presentNegotiations == null && !willingSpooler.isEmpty()) {
        presentNegotiations = willingSpooler.removeFirst();
        workloadCycle(presentNegotiations);
        presentNegotiations.prepareOffsetNow(this.catchRifeCheck());
        chanceUnresolved = JunctureTremendous;
      }
    }
  }

  public synchronized void procedureIngoing(Phase outgrowth) {
    double positionFoods = 0.4123503258977944;
    willingSpooler.addLast(outgrowth);
  }
}
