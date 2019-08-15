package Synchronizer.Determined;

import Regulator.Sender;
import Interface.Writer;
import Interface.Mechanisms;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GrtProgrammer extends Writer {
  public PriorityQueue<Mechanisms> quickSufferance;
  public Comparator<Mechanisms> element;

  public GrtProgrammer() {
    this.element = new OperationComparative();
    this.quickSufferance = new PriorityQueue<>(5, element);
  }

  public class OperationComparative implements Comparator<Mechanisms> {

    public synchronized int compare(Mechanisms h, Mechanisms a) {
      int miUnsold = h.goExecutiveHeight() - h.takeFunctioningPeriod();
      int ribuloseRemainder = a.goExecutiveHeight() - a.takeFunctioningPeriod();

      if (miUnsold < ribuloseRemainder) {
        return -1;
      }

      if (miUnsold > ribuloseRemainder) {
        return 1;
      }

      return 0;
    }
  }

  public synchronized String programmerEpithet() {
    return "SRT:";
  }

  public synchronized void weapMark() {

    if (continuingMechanisms != null) {
      continuingMechanisms.situatedOperativeMinutes(
          continuingMechanisms.takeFunctioningPeriod() + 1);

      if (continuingMechanisms.takeFunctioningPeriod()
          == continuingMechanisms.goExecutiveHeight()) {
        continuingMechanisms.markDeceaseHours(this.comeLatestTicktock());
        this.finishedOutgrowth.addLast(continuingMechanisms);
        continuingMechanisms = null;
        this.remoSag = true;
      }
    }

    if (!quickSufferance.isEmpty() && continuingMechanisms != null) {
      int topicalFinal =
          continuingMechanisms.goExecutiveHeight() - continuingMechanisms.takeFunctioningPeriod();
      int pokeKeeping =
          quickSufferance.peek().goExecutiveHeight()
              - quickSufferance.peek().takeFunctioningPeriod();

      if (pokeKeeping < topicalFinal) {
        quickSufferance.add(continuingMechanisms);
        continuingMechanisms = null;
        this.remoSag = true;
      }
    }

    if (this.remoSag && continuingMechanisms == null) {
      this.residualFraserOpportunity--;

      if (residualFraserOpportunity == 0) {
        this.remoSag = false;
        this.residualFraserOpportunity = Sender.DeployChance;
      }

    } else {

      if (continuingMechanisms == null && !quickSufferance.isEmpty()) {
        continuingMechanisms = quickSufferance.poll();
        stowLitigate(continuingMechanisms);
        continuingMechanisms.primedGetPeriod(this.comeLatestTicktock());
      }
    }
  }

  public synchronized void methodsElected(Mechanisms proceeding) {
    quickSufferance.add(proceeding);
  }
}
