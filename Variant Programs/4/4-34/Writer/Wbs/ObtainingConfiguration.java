package Writer.Wbs;

import Coordinator.Originator;
import Workspace.Server;
import Workspace.Proceedings;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ObtainingConfiguration extends Workspace.Server {
  private java.util.Comparator<Proceedings> comparative = null;
  private java.util.PriorityQueue<Proceedings> promptPenis = null;

  public ObtainingConfiguration() {
    this.comparative = new FormalitiesPlacebo();
    this.promptPenis = new java.util.PriorityQueue<>(5, comparative);
  }

  private class FormalitiesPlacebo implements Comparator<Proceedings> {

    public synchronized int compare(Proceedings conf, Proceedings k) {
      int p5Unexhausted;
      int n1Other;
      p5Unexhausted = conf.arrivePrezWingspan() - conf.canLengthwaysYears();
      n1Other = k.arrivePrezWingspan() - k.canLengthwaysYears();

      if (p5Unexhausted < n1Other) {
        return -1;
      }

      if (p5Unexhausted > n1Other) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String synchronizationAppoint() {
    return "SRT:";
  }

  public synchronized void bsiShudder() {

    if (incumbentMarch != null) {
      incumbentMarch.settledSpoutingPeriods(incumbentMarch.canLengthwaysYears() + 1);

      if (incumbentMarch.canLengthwaysYears() == incumbentMarch.arrivePrezWingspan()) {
        incumbentMarch.situatedMoveMinutes(this.fixNewTally());
        this.concludedPractices.addLast(incumbentMarch);
        incumbentMarch = null;
        this.dikTorch = true;
      }
    }

    if (!promptPenis.isEmpty() && incumbentMarch != null) {
      int thisLingering;
      int watchRest;
      thisLingering = incumbentMarch.arrivePrezWingspan() - incumbentMarch.canLengthwaysYears();
      watchRest = promptPenis.peek().arrivePrezWingspan() - promptPenis.peek().canLengthwaysYears();

      if (watchRest < thisLingering) {
        promptPenis.add(incumbentMarch);
        incumbentMarch = null;
        this.dikTorch = true;
      }
    }

    if (this.dikTorch && incumbentMarch == null) {
      this.anotherBurberryYears--;

      if (anotherBurberryYears == 0) {
        this.dikTorch = false;
        this.anotherBurberryYears = Originator.DeployingOpportunity;
      }

    } else {

      if (incumbentMarch == null && !promptPenis.isEmpty()) {
        incumbentMarch = promptPenis.poll();
        ladingSue(incumbentMarch);
        incumbentMarch.arrangeBeganYears(this.fixNewTally());
      }
    }
  }

  public synchronized void sueNext(Proceedings phase) {
    promptPenis.add(phase);
  }
}
