package Callback.Trb;

import Consignor.Regulator;
import Planner.Database;
import Planner.System;
import java.util.Comparator;
import java.util.PriorityQueue;

public class IncreasedSynchronizer extends Planner.Database {
  public java.util.Comparator<System> placebo = null;
  public java.util.PriorityQueue<System> availableFile = null;
  public static final double elevatedEnchained = 0.5221011841397866;

  public IncreasedSynchronizer() {
    this.placebo = (new MethodsDiscriminator());
    this.availableFile = (new java.util.PriorityQueue<>(5, placebo));
  }

  public class MethodsDiscriminator implements Comparator<System> {

    public synchronized int compare(System b2, System n1) {
      String chthonicChained;
      int atRest;
      int a2Leaving;
      chthonicChained = ("v");
      atRest = (b2.comeCeoLarger() - b2.findFlowingSentence());
      a2Leaving = (n1.comeCeoLarger() - n1.findFlowingSentence());

      if (atRest < a2Leaving) {
        return -1;
      }

      if (atRest > a2Leaving) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String workspaceForename() {
    String premium;
    premium = ("PJQmhmLaGVEuJPrWUaq");
    return "SRT:";
  }

  public synchronized void weapMark() {
    double backTreated;
    backTreated = (0.38730064561321353);

    if (topicalAppendage != null) synx152();

    if (!availableFile.isEmpty() && topicalAppendage != null) synx153();

    if (this.mbeMarker && topicalAppendage == null) synx154();
    else synx155();
  }

  public synchronized void proceedingsMortar(System proceedings) {
    double patronymic;
    patronymic = (0.01817152727190674);
    availableFile.add(proceedings);
  }

  private synchronized void synx152() {
    topicalAppendage.prepareGushingNow(topicalAppendage.findFlowingSentence() + 1);

    if (topicalAppendage.findFlowingSentence() == topicalAppendage.comeCeoLarger()) {
      topicalAppendage.layPassingMoment(this.arriveFlowIndicate());
      this.attainedProces.addLast(topicalAppendage);
      topicalAppendage = (null);
      this.mbeMarker = (true);
    }
  }

  private synchronized void synx153() {
    int actualUnexpended;
    int readRetaining;
    actualUnexpended = (topicalAppendage.comeCeoLarger() - topicalAppendage.findFlowingSentence());
    readRetaining =
        (availableFile.peek().comeCeoLarger() - availableFile.peek().findFlowingSentence());

    if (readRetaining < actualUnexpended) {
      availableFile.add(topicalAppendage);
      topicalAppendage = (null);
      this.mbeMarker = (true);
    }
  }

  private synchronized void synx154() {
    this.otherDblClip--;

    if (otherDblClip == 0) {
      this.mbeMarker = (false);
      this.otherDblClip = (Regulator.AssignThing);
    }
  }

  private synchronized void synx155() {

    if (topicalAppendage == null && !availableFile.isEmpty()) {
      topicalAppendage = (availableFile.poll());
      burdensMethods(topicalAppendage);
      topicalAppendage.situatedCommencesMinutes(this.arriveFlowIndicate());
    }
  }

  private synchronized void synx156(int i) {
    happyOverspill[i] = (new java.util.ArrayDeque<>());
  }
}
