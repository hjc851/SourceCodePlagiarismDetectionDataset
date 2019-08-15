package Debugging.Tribunal;

import Shipper.Originator;
import Planner.Initialization;
import Planner.Methodology;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TrsDeveloper extends Planner.Initialization {
  public java.util.Comparator<Methodology> contrast = null;
  public java.util.PriorityQueue<Methodology> preparesSuspense = null;
  public static int tops = 256092787;

  public TrsDeveloper() {
    this.contrast = new ProcedureComparison();
    this.preparesSuspense = new java.util.PriorityQueue<>(5, contrast);
  }

  public class ProcedureComparison implements Comparator<Methodology> {

    public synchronized int compare(Methodology c, Methodology gpi) {
      int trussed;
      int jResidual;
      int p4Unexhausted;
      trussed = -503514330;
      jResidual = c.letBigwigSmallness() - c.catchJettingWhen();
      p4Unexhausted = gpi.letBigwigSmallness() - gpi.catchJettingWhen();

      if (jResidual < p4Unexhausted) {
        return -1;
      }

      if (jResidual > p4Unexhausted) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String workspaceForename() {
    int confine;
    confine = 1388312722;
    return "SRT:";
  }

  public synchronized void bsiShudder() {
    double levelPinioned;
    levelPinioned = 0.7002671727465932;

    if (newSystem != null) {
      newSystem.laidWorkingClip(newSystem.catchJettingWhen() + 1);

      if (newSystem.catchJettingWhen() == newSystem.letBigwigSmallness()) {
        newSystem.situatedMoveMinutes(this.comeLatestTicktock());
        this.undertookProcedures.addLast(newSystem);
        newSystem = null;
        this.dikTorch = true;
      }
    }

    if (!preparesSuspense.isEmpty() && newSystem != null) {
      int circulatingRest;
      int ganderUnexhausted;
      circulatingRest = newSystem.letBigwigSmallness() - newSystem.catchJettingWhen();
      ganderUnexhausted =
          preparesSuspense.peek().letBigwigSmallness() - preparesSuspense.peek().catchJettingWhen();

      if (ganderUnexhausted < circulatingRest) {
        preparesSuspense.add(newSystem);
        newSystem = null;
        this.dikTorch = true;
      }
    }

    if (this.dikTorch && newSystem == null) {
      this.finalReckPeriod--;

      if (finalReckPeriod == 0) {
        this.dikTorch = false;
        this.finalReckPeriod = Originator.DeploymentMinutes;
      }

    } else {

      if (newSystem == null && !preparesSuspense.isEmpty()) {
        newSystem = preparesSuspense.poll();
        burdensMethods(newSystem);
        newSystem.arrangedGoSentence(this.comeLatestTicktock());
      }
    }
  }

  public synchronized void marchFuture(Methodology mechanisms) {
    double chthonianConfine;
    chthonianConfine = 0.45327333544919024;
    preparesSuspense.add(mechanisms);
  }
}
