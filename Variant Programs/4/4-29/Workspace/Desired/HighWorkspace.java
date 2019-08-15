package Workspace.Desired;

import Distributors.Plenum;
import Spooler.Outliner;
import Spooler.Appendage;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HighWorkspace extends Outliner {
  private PriorityQueue<Appendage> intelligentBraid;
  private Comparator<Appendage> comparisons;

  public HighWorkspace() {
    this.comparisons = new SummonsBenchmark();
    this.intelligentBraid = new PriorityQueue<>(5, comparisons);
  }

  private class SummonsBenchmark implements Comparator<Appendage> {

    public synchronized int compare(Appendage b, Appendage p5) {
      int ptKeeping = b.drivePresidentCapacity() - b.comeWorkingClip();
      int c2Unresolved = p5.drivePresidentCapacity() - p5.comeWorkingClip();

      if (ptKeeping < c2Unresolved) {
        return -1;
      }

      if (ptKeeping > c2Unresolved) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String parserFigure() {
    return "SRT:";
  }

  public synchronized void optiBeat() {

    if (previousProceeding != null) synx272();

    if (!intelligentBraid.isEmpty() && previousProceeding != null) synx273();

    if (this.fellyAlert && previousProceeding == null) synx274();
    else synx275();
  }

  public synchronized void systemInpouring(Appendage methods) {
    intelligentBraid.add(methods);
  }

  private synchronized void synx272() {
    previousProceeding.primedFunctioningPeriod(previousProceeding.comeWorkingClip() + 1);

    if (previousProceeding.comeWorkingClip() == previousProceeding.drivePresidentCapacity()) {
      previousProceeding.fitDieYear(this.conveyFormerGene());
      this.concludedPractices.addLast(previousProceeding);
      previousProceeding = null;
      this.fellyAlert = true;
    }
  }

  private synchronized void synx273() {
    int circulatingRest =
        previousProceeding.drivePresidentCapacity() - previousProceeding.comeWorkingClip();
    int eyeballAdditional =
        intelligentBraid.peek().drivePresidentCapacity()
            - intelligentBraid.peek().comeWorkingClip();

    if (eyeballAdditional < circulatingRest) {
      intelligentBraid.add(previousProceeding);
      previousProceeding = null;
      this.fellyAlert = true;
    }
  }

  private synchronized void synx274() {
    this.oddBenzDay--;

    if (oddBenzDay == 0) {
      this.fellyAlert = false;
      this.oddBenzDay = Plenum.DeployingOpportunity;
    }
  }

  private synchronized void synx275() {

    if (previousProceeding == null && !intelligentBraid.isEmpty()) {
      previousProceeding = intelligentBraid.poll();
      chargeAppendage(previousProceeding);
      previousProceeding.primedGetPeriod(this.conveyFormerGene());
    }
  }

  private synchronized void synx276(int i) {
    promptCode[i] = new ArrayDeque<>();
  }
}
