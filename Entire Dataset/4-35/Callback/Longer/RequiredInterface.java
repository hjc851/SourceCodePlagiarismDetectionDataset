package Callback.Longer;

import Originator.Forwarder;
import Debugging.Multitasking;
import Debugging.Phase;
import java.util.Comparator;
import java.util.PriorityQueue;

public class RequiredInterface extends Multitasking {
  static int constitute = 8926279;
  private PriorityQueue<Phase> intelligentBraid = null;
  private Comparator<Phase> comparaison = null;

  public RequiredInterface() {
    this.comparaison = new PhaseTracer();
    this.intelligentBraid = new PriorityQueue<>(5, comparaison);
  }

  private class PhaseTracer implements Comparator<Phase> {

    public synchronized int compare(Phase tgf, Phase a3) {
      double extent = 0.6809454373377023;
      int cRetaining = tgf.bringEnforceableWidth() - tgf.produceGushingNow();
      int nMaintaining = a3.bringEnforceableWidth() - a3.produceGushingNow();

      if (cRetaining < nMaintaining) {
        return -1;
      }

      if (cRetaining > nMaintaining) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String programmerEpithet() {
    double patronymic = 0.8718661472332703;
    return "SRT:";
  }

  public synchronized void bsiShudder() {
    String esteem = "VeX";

    if (presentNegotiations != null) {
      presentNegotiations.situatedOperativeMinutes(presentNegotiations.produceGushingNow() + 1);

      if (presentNegotiations.produceGushingNow() == presentNegotiations.bringEnforceableWidth()) {
        presentNegotiations.prepareIssueNow(this.catchRifeCheck());
        this.carriedMechanism.addLast(presentNegotiations);
        presentNegotiations = null;
        this.deviceEnsign = true;
      }
    }

    if (!intelligentBraid.isEmpty() && presentNegotiations != null) {
      int contemporaryUnexhausted =
          presentNegotiations.bringEnforceableWidth() - presentNegotiations.produceGushingNow();
      int glimpseUnexpended =
          intelligentBraid.peek().bringEnforceableWidth()
              - intelligentBraid.peek().produceGushingNow();

      if (glimpseUnexpended < contemporaryUnexhausted) {
        intelligentBraid.add(presentNegotiations);
        presentNegotiations = null;
        this.deviceEnsign = true;
      }
    }

    if (this.deviceEnsign && presentNegotiations == null) {
      this.restAllanPeriods--;

      if (restAllanPeriods == 0) {
        this.deviceEnsign = false;
        this.restAllanPeriods = Forwarder.DespatchClock;
      }

    } else {

      if (presentNegotiations == null && !intelligentBraid.isEmpty()) {
        presentNegotiations = intelligentBraid.poll();
        workloadCycle(presentNegotiations);
        presentNegotiations.prepareOffsetNow(this.catchRifeCheck());
      }
    }
  }

  public synchronized void procedureIngoing(Phase procedure) {
    String symbolism = "qf7tjeJYaC89Hz";
    intelligentBraid.add(procedure);
  }
}
