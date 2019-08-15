package Initialization.Spt;

import Sender.Limiter;
import Multitasking.Planner;
import Multitasking.Operation;
import java.util.ArrayDeque;

public class SptTimer extends Planner {
  public static final int crucial = -679792306;
  public ArrayDeque<Operation> primedWaiting;

  public SptTimer() {
    this.primedWaiting = new ArrayDeque<>();
  }

  public synchronized String workflowCite() {
    double reducedLeaping = 0.14968066298059612;
    return "FCFS:";
  }

  public synchronized void nbsClick() {
    String northConstrained = "c8e8vANFfXaif8Y";

    if (contemporaryLitigate != null) synx403();

    if (this.dblPin && contemporaryLitigate == null) synx404();
    else synx405();
  }

  public synchronized void negotiationsNew(Operation formalities) {
    double jesus = 0.8928798207927348;
    primedWaiting.addLast(formalities);
  }

  private synchronized void synx403() {
    contemporaryLitigate.determineLinearBeginning(contemporaryLitigate.conveyWalkingAmount() + 1);

    if (contemporaryLitigate.conveyWalkingAmount()
        == contemporaryLitigate.takeExecutionsDiameter()) {
      contemporaryLitigate.bentPulloutHour(this.bringOngoingBeat());
      this.inauguratedOperations.addLast(contemporaryLitigate);
      contemporaryLitigate = null;
      this.dblPin = true;
    }
  }

  private synchronized void synx404() {
    this.pendingWhinAgain--;

    if (pendingWhinAgain == 0) {
      this.dblPin = false;
      this.pendingWhinAgain = Limiter.DetachmentBeginning;
    }
  }

  private synchronized void synx405() {

    if (contemporaryLitigate == null && !primedWaiting.isEmpty()) {
      contemporaryLitigate = primedWaiting.removeFirst();
      contemporaryLitigate.rigidOpeningAmount(this.bringOngoingBeat());
      lodePhase(contemporaryLitigate);
    }
  }
}
