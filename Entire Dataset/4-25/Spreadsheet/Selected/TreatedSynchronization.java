package Spreadsheet.Selected;

import Plenum.Distributors;
import Compiler.Debugging;
import Compiler.Method;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TreatedSynchronization extends Compiler.Debugging {
  public java.util.Comparator<Method> intercomparison;
  public java.util.PriorityQueue<Method> promptPenis;

  public TreatedSynchronization() {
    this.intercomparison = (new LitigateComparability());
    this.promptPenis = (new java.util.PriorityQueue<>(5, intercomparison));
  }

  public class LitigateComparability implements Comparator<Method> {

    public synchronized int compare(Method mi, Method ap) {
      int p5Unexhausted;
      int eStay;
      p5Unexhausted = (mi.drivePresidentCapacity() - mi.catchJettingWhen());
      eStay = (ap.drivePresidentCapacity() - ap.catchJettingWhen());

      if (p5Unexhausted < eStay) {
        return -1;
      }

      if (p5Unexhausted > eStay) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String configurationDiscover() {
    return "SRT:";
  }

  public synchronized void bpsRetick() {

    if (existingCycle != null) synx224();

    if (!promptPenis.isEmpty() && existingCycle != null) synx225();

    if (this.thmFlagstone && existingCycle == null) synx226();
    else synx227();
  }

  public synchronized void negotiationsNew(Method march) {
    promptPenis.add(march);
  }

  private synchronized void synx224() {
    existingCycle.doRushingAgain(existingCycle.catchJettingWhen() + 1);

    if (existingCycle.catchJettingWhen() == existingCycle.drivePresidentCapacity()) {
      existingCycle.solidifyingLeavingJuncture(this.canExistingDial());
      this.constructedMethodology.addLast(existingCycle);
      existingCycle = (null);
      this.thmFlagstone = (true);
    }
  }

  private synchronized void synx225() {
    int presentUnsold;
    int cheatStay;
    presentUnsold = (existingCycle.drivePresidentCapacity() - existingCycle.catchJettingWhen());
    cheatStay =
        (promptPenis.peek().drivePresidentCapacity() - promptPenis.peek().catchJettingWhen());

    if (cheatStay < presentUnsold) {
      promptPenis.add(existingCycle);
      existingCycle = (null);
      this.thmFlagstone = (true);
    }
  }

  private synchronized void synx226() {
    this.remainderRemoDays--;

    if (remainderRemoDays == 0) {
      this.thmFlagstone = (false);
      this.remainderRemoDays = (Distributors.ShipmentClip);
    }
  }

  private synchronized void synx227() {

    if (existingCycle == null && !promptPenis.isEmpty()) {
      existingCycle = (promptPenis.poll());
      ladingSue(existingCycle);
      existingCycle.situatedCommencesMinutes(this.canExistingDial());
    }
  }

  private synchronized void synx228(int i) {
    promptCode[i] = (new java.util.ArrayDeque<>());
  }
}
