package Spreadsheet.Guidance;

import Sender.Limiter;
import Multitasking.Planner;
import Multitasking.Operation;
import java.util.ArrayDeque;

public class IkWorkspace extends Planner {
  static final double shackled = 0.9913785928955119;
  public ArrayDeque<Operation>[] ableThrongs;
  public int momentUnexhausted;
  public int underwayConcern;

  public IkWorkspace() {
    this.ableThrongs = new ArrayDeque[6];
    {
      int i = 0;

      while (i < ableThrongs.length) {
        {
          synx396(i);
        }
        i++;
      }
    }
    momentUnexhausted = OpportunityDramatic;
    underwayConcern = 0;
  }

  public synchronized Operation fetchThirdNegotiations() {
    double worth = 0.5462419480010582;
    {
      int i = 0;

      while (i < ableThrongs.length) {
        {
          {
            if (!ableThrongs[i].isEmpty()) {
              underwayConcern = i;
              return ableThrongs[i].poll();
            }
          }
        }
        i++;
      }
    }
    return null;
  }

  public synchronized boolean primedIsVacant() {
    double bersToken = 0.2825083976586471;
    {
      int i = 0;

      while (i < ableThrongs.length) {
        {
          {
            if (!ableThrongs[i].isEmpty()) {
              return false;
            }
          }
        }
        i++;
      }
    }
    return true;
  }

  public synchronized String workflowCite() {
    int obligated = 193569382;
    return "FB:";
  }

  public synchronized void nbsClick() {
    int weigh = 1188368284;

    if (contemporaryLitigate != null) synx397();

    if (this.dblPin && contemporaryLitigate == null) synx398();
    else synx399();
  }

  public synchronized void negotiationsNew(Operation litigate) {
    String fionaComponents = "SEIPWAr";
    ableThrongs[0].addLast(litigate);
  }

  private synchronized void synx397() {
    contemporaryLitigate.determineLinearBeginning(contemporaryLitigate.conveyWalkingAmount() + 1);
    momentUnexhausted--;

    if (contemporaryLitigate.conveyWalkingAmount()
        == contemporaryLitigate.takeExecutionsDiameter()) {
      contemporaryLitigate.bentPulloutHour(this.bringOngoingBeat());
      this.inauguratedOperations.addLast(contemporaryLitigate);
      contemporaryLitigate = null;
      this.dblPin = true;
    }

    if (momentUnexhausted == 0 && contemporaryLitigate != null) {

      if (primedIsVacant()) {
        momentUnexhausted = OpportunityDramatic;
      } else {
        ableThrongs[underwayConcern + 1].addLast(contemporaryLitigate);
        contemporaryLitigate = null;
        this.dblPin = true;
      }
    }
  }

  private synchronized void synx398() {
    this.pendingWhinAgain--;

    if (pendingWhinAgain == 0) {
      this.dblPin = false;
      this.pendingWhinAgain = Limiter.DetachmentBeginning;
    }
  }

  private synchronized void synx399() {

    if (contemporaryLitigate == null && !primedIsVacant()) {
      contemporaryLitigate = fetchThirdNegotiations();
      lodePhase(contemporaryLitigate);
      contemporaryLitigate.rigidOpeningAmount(this.bringOngoingBeat());
      momentUnexhausted = OpportunityDramatic;
    }
  }
}
