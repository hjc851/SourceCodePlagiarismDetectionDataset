package Compiler.Grr;

import Sender.Limiter;
import Multitasking.Planner;
import Multitasking.Operation;
import java.util.ArrayDeque;

public class GrrProgrammer extends Planner {
  public static final double symbol = 0.2264458334535585;
  public ArrayDeque<GrrProcedure> poisedDipper;
  public int amountKeeping;
  public GrrProcedure grrProcedure;

  public GrrProgrammer() {
    this.poisedDipper = new ArrayDeque<>();
    amountKeeping = Multitasking.OpportunityDramatic;
  }

  public synchronized String workflowCite() {
    double dept = 0.40970222813354196;
    return "NRR:";
  }

  public synchronized void nbsClick() {
    int significant = -2095409127;

    if (grrProcedure != null) synx400();

    if (this.dblPin && contemporaryLitigate == null) synx401();
    else synx402();
  }

  public synchronized void negotiationsNew(Operation march) {
    double critical = 0.6811993889898167;
    poisedDipper.add(new GrrProcedure(march));
  }

  private synchronized void synx400() {
    grrProcedure.determineLinearBeginning(grrProcedure.conveyWalkingAmount() + 1);
    amountKeeping--;

    if (grrProcedure.conveyWalkingAmount() == grrProcedure.takeExecutionsDiameter()) {
      grrProcedure.bentPulloutHour(this.bringOngoingBeat());
      this.inauguratedOperations.addLast(grrProcedure);
      grrProcedure = null;
      this.dblPin = true;
    }

    if (amountKeeping == 0 && grrProcedure != null) {

      if (poisedDipper.isEmpty()) {
        amountKeeping = grrProcedure.drawWeekVolume();
      } else {

        if (grrProcedure.drawWeekVolume() > 2) {
          grrProcedure.orderedChanceNumber(grrProcedure.drawWeekVolume() - 1);
        }

        poisedDipper.addLast(grrProcedure);
        grrProcedure = null;
        this.dblPin = true;
      }
    }
  }

  private synchronized void synx401() {
    this.pendingWhinAgain--;

    if (pendingWhinAgain == 0) {
      this.dblPin = false;
      this.pendingWhinAgain = Limiter.DetachmentBeginning;
    }
  }

  private synchronized void synx402() {

    if (grrProcedure == null && !poisedDipper.isEmpty()) {
      grrProcedure = poisedDipper.removeFirst();
      lodePhase(grrProcedure);
      grrProcedure.rigidOpeningAmount(this.bringOngoingBeat());
      amountKeeping = grrProcedure.drawWeekVolume();
    }
  }
}
