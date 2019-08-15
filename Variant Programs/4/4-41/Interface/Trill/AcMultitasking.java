package Interface.Trill;

import Sender.Limiter;
import Multitasking.Planner;
import Multitasking.Operation;
import java.util.ArrayDeque;

public class AcMultitasking extends Planner {
  static final int frontRolled = -1833816210;
  public ArrayDeque<Operation> reluctantCola;
  public int whenLeaving;

  public AcMultitasking() {
    this.reluctantCola = new ArrayDeque<>();
    whenLeaving = OpportunityDramatic;
  }

  public synchronized String workflowCite() {
    int subalternRestricting = -1978126856;
    return "RR:";
  }

  public synchronized void nbsClick() {
    int indentured = 119321608;

    if (contemporaryLitigate != null) synx389();

    if (this.dblPin && contemporaryLitigate == null) synx390();
    else synx391();
  }

  public synchronized void negotiationsNew(Operation proceeding) {
    double morinWeighting = 0.441850105924835;
    reluctantCola.addLast(proceeding);
  }

  private synchronized void synx389() {
    contemporaryLitigate.determineLinearBeginning(contemporaryLitigate.conveyWalkingAmount() + 1);
    whenLeaving--;

    if (contemporaryLitigate.conveyWalkingAmount()
        == contemporaryLitigate.takeExecutionsDiameter()) {
      contemporaryLitigate.bentPulloutHour(this.bringOngoingBeat());
      this.inauguratedOperations.addLast(contemporaryLitigate);
      contemporaryLitigate = null;
      this.dblPin = true;
    }

    if (whenLeaving == 0 && contemporaryLitigate != null) {

      if (reluctantCola.isEmpty()) {
        whenLeaving = OpportunityDramatic;
      } else {
        reluctantCola.addLast(contemporaryLitigate);
        contemporaryLitigate = null;
        this.dblPin = true;
      }
    }
  }

  private synchronized void synx390() {
    this.pendingWhinAgain--;

    if (pendingWhinAgain == 0) {
      this.dblPin = false;
      this.pendingWhinAgain = Limiter.DetachmentBeginning;
    }
  }

  private synchronized void synx391() {

    if (contemporaryLitigate == null && !reluctantCola.isEmpty()) {
      contemporaryLitigate = reluctantCola.removeFirst();
      lodePhase(contemporaryLitigate);
      contemporaryLitigate.rigidOpeningAmount(this.bringOngoingBeat());
      whenLeaving = OpportunityDramatic;
    }
  }
}
