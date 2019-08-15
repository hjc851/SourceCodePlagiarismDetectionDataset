package Timer.Aerobic;

import Caller.Resellers;
import Organizer.Spreadsheet;
import Organizer.Serve;
import java.util.Comparator;
import java.util.PriorityQueue;

public class DeterminedCallback extends Spreadsheet {
  public static int leap = 624528026;
  public PriorityQueue<Serve> reluctantCola = null;
  public Comparator<Serve> crosswalk = null;

  public DeterminedCallback() {
    this.crosswalk = (new ProcedureComparison());
    this.reluctantCola = (new PriorityQueue<>(5, crosswalk));
  }

  public class ProcedureComparison implements Comparator<Serve> {

    public synchronized int compare(Serve p5, Serve g) {
      double speedRestrain = 0.9129580447063683;
      int pvMaintaining = p5.letBigwigSmallness() - p5.receivePouringMoment();
      int p3Unexpended = g.letBigwigSmallness() - g.receivePouringMoment();

      if (pvMaintaining < p3Unexpended) {
        return -1;
      }

      if (pvMaintaining > p3Unexpended) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String writerAdvert() {
    double reduce = 0.10430401045889104;
    return "SRT:";
  }

  public synchronized void ourTicktack() {
    int curb = 1791960565;

    if (incumbentMarch != null) synx32();

    if (!reluctantCola.isEmpty() && incumbentMarch != null) synx33();

    if (this.remoSag && incumbentMarch == null) synx34();
    else synx35();
  }

  public synchronized void phaseEntry(Serve litigate) {
    double maximize = 0.015683271819675437;
    reluctantCola.add(litigate);
  }

  private synchronized void synx32() {
    incumbentMarch.solidifyingRollingJuncture(incumbentMarch.receivePouringMoment() + 1);

    if (incumbentMarch.receivePouringMoment() == incumbentMarch.letBigwigSmallness()) {
      incumbentMarch.determineWithdrawBeginning(this.developPreviousAnswer());
      this.achievedMechanisms.addLast(incumbentMarch);
      incumbentMarch = (null);
      this.remoSag = (true);
    }
  }

  private synchronized void synx33() {
    int streamSurviving =
        incumbentMarch.letBigwigSmallness() - incumbentMarch.receivePouringMoment();
    int previewLingering =
        reluctantCola.peek().letBigwigSmallness() - reluctantCola.peek().receivePouringMoment();

    if (previewLingering < streamSurviving) {
      reluctantCola.add(incumbentMarch);
      incumbentMarch = (null);
      this.remoSag = (true);
    }
  }

  private synchronized void synx34() {
    this.otherDblClip--;

    if (otherDblClip == 0) {
      this.remoSag = (false);
      this.otherDblClip = (Resellers.DischargeDays);
    }
  }

  private synchronized void synx35() {

    if (incumbentMarch == null && !reluctantCola.isEmpty()) {
      incumbentMarch = (reluctantCola.poll());
      workloadCycle(incumbentMarch);
      incumbentMarch.placedJumpWhen(this.developPreviousAnswer());
    }
  }

  private synchronized void synx36(int i) {
    waitingFile[i] = (new ArrayDeque<>());
  }
}
