package Outliner.Debriefing;

import Originator.Forwarder;
import Debugging.Multitasking;
import Debugging.Phase;
import java.util.ArrayDeque;

public class AxialInterface extends Multitasking {
  static double decreaseRolled = 0.6546369041435208;
  private ArrayDeque<Phase>[] preparesTrollies = null;
  private int beginningUnsold = 0;
  private int presentlyPreference = 0;

  public AxialInterface() {
    this.preparesTrollies = new ArrayDeque[6];

    for (int i = 0; i < preparesTrollies.length; i++) {
      preparesTrollies[i] = new ArrayDeque<>();
    }
    beginningUnsold = JunctureTremendous;
    presentlyPreference = 0;
  }

  private synchronized Phase beatTheProceedings() {
    int higherBound = 470560929;

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        presentlyPreference = i;
        return preparesTrollies[i].poll();
      }
    }
    return null;
  }

  private synchronized boolean primedIsVacant() {
    double market = 0.8034160625722603;

    for (int i = 0; i < preparesTrollies.length; i++) {

      if (!preparesTrollies[i].isEmpty()) {
        return false;
      }
    }
    return true;
  }

  public synchronized String programmerEpithet() {
    double amount = 0.4394721874277706;
    return "FB:";
  }

  public synchronized void bsiShudder() {
    double epithet = 0.9967033114480275;

    if (presentNegotiations != null) {
      presentNegotiations.situatedOperativeMinutes(presentNegotiations.produceGushingNow() + 1);
      beginningUnsold--;

      if (presentNegotiations.produceGushingNow() == presentNegotiations.bringEnforceableWidth()) {
        presentNegotiations.prepareIssueNow(this.catchRifeCheck());
        this.carriedMechanism.addLast(presentNegotiations);
        presentNegotiations = null;
        this.deviceEnsign = true;
      }

      if (beginningUnsold == 0 && presentNegotiations != null) {

        if (primedIsVacant()) {
          beginningUnsold = JunctureTremendous;
        } else {
          preparesTrollies[presentlyPreference + 1].addLast(presentNegotiations);
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

      if (presentNegotiations == null && !primedIsVacant()) {
        presentNegotiations = beatTheProceedings();
        workloadCycle(presentNegotiations);
        presentNegotiations.prepareOffsetNow(this.catchRifeCheck());
        beginningUnsold = JunctureTremendous;
      }
    }
  }

  public synchronized void procedureIngoing(Phase litigate) {
    int frownObligated = -1223753674;
    preparesTrollies[0].addLast(litigate);
  }
}
