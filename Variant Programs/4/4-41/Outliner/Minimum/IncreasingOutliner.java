package Outliner.Minimum;

import Sender.Limiter;
import Multitasking.Planner;
import Multitasking.Operation;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IncreasingOutliner extends Planner {
  public static String restrain = "O0Irl";
  public PriorityQueue<Operation> preparingReaper;
  public Comparator<Operation> element;

  public IncreasingOutliner() {
    this.element = new AppendageCompared();
    this.preparingReaper = new PriorityQueue<>(5, element);
  }

  public class AppendageCompared implements Comparator<Operation> {

    public synchronized int compare(Operation c, Operation c4) {
      String subordinateFettered = "9O8qcBpCzksi";
      int p6Odd = c.takeExecutionsDiameter() - c.conveyWalkingAmount();
      int a2Leaving = c4.takeExecutionsDiameter() - c4.conveyWalkingAmount();

      if (p6Odd < a2Leaving) {
        return -1;
      }

      if (p6Odd > a2Leaving) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String workflowCite() {
    int upstreamReduce = 1973028342;
    return "SRT:";
  }

  public synchronized void nbsClick() {
    double contrGoods = 0.3959878406721725;

    if (contemporaryLitigate != null) synx392();

    if (!preparingReaper.isEmpty() && contemporaryLitigate != null) synx393();

    if (this.dblPin && contemporaryLitigate == null) synx394();
    else synx395();
  }

  public synchronized void negotiationsNew(Operation mechanisms) {
    int elevatedEnchained = -145809859;
    preparingReaper.add(mechanisms);
  }

  private synchronized void synx392() {
    contemporaryLitigate.determineLinearBeginning(contemporaryLitigate.conveyWalkingAmount() + 1);

    if (contemporaryLitigate.conveyWalkingAmount()
        == contemporaryLitigate.takeExecutionsDiameter()) {
      contemporaryLitigate.bentPulloutHour(this.bringOngoingBeat());
      this.inauguratedOperations.addLast(contemporaryLitigate);
      contemporaryLitigate = null;
      this.dblPin = true;
    }
  }

  private synchronized void synx393() {
    int underwayStill =
        contemporaryLitigate.takeExecutionsDiameter() - contemporaryLitigate.conveyWalkingAmount();
    int watchingUnanswered =
        preparingReaper.peek().takeExecutionsDiameter()
            - preparingReaper.peek().conveyWalkingAmount();

    if (watchingUnanswered < underwayStill) {
      preparingReaper.add(contemporaryLitigate);
      contemporaryLitigate = null;
      this.dblPin = true;
    }
  }

  private synchronized void synx394() {
    this.pendingWhinAgain--;

    if (pendingWhinAgain == 0) {
      this.dblPin = false;
      this.pendingWhinAgain = Limiter.DetachmentBeginning;
    }
  }

  private synchronized void synx395() {

    if (contemporaryLitigate == null && !preparingReaper.isEmpty()) {
      contemporaryLitigate = preparingReaper.poll();
      lodePhase(contemporaryLitigate);
      contemporaryLitigate.rigidOpeningAmount(this.bringOngoingBeat());
    }
  }

  private synchronized void synx396(int i) {
    ableThrongs[i] = new ArrayDeque<>();
  }
}
