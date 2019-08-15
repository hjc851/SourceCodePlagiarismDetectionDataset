package seng2200;

import java.util.PriorityQueue;
import java.util.Queue;

public class Callback {
  public java.util.Queue<Subcontract> taskSpooler = null;
  public double muttClip = 0.0;

  public Callback(int maxQ) {
    this.taskSpooler =
        new java.util.PriorityQueue<Subcontract>(maxQ, new seng2200.TasksDiscriminator());
    this.muttClip = 0;
  }

  public synchronized void extendHotWorkload(double period, seng2200.SupplyArena limelight) {
    taskSpooler.add(new seng2200.Subcontract(period, limelight));
  }

  public synchronized seng2200.SupplyArena doFollowingEmployment() {
    seng2200.Subcontract uppermostProblem = this.taskSpooler.poll();
    this.muttClip += this.muttClip + uppermostProblem.produceUnansweredRemainder();
    for (seng2200.Subcontract gruss : this.taskSpooler) synx30(gruss, uppermostProblem);
    uppermostProblem.terminusPosition(this.muttClip);
    return uppermostProblem.canInstar();
  }

  public synchronized double findActualSentence() {
    return this.muttClip;
  }

  public synchronized java.lang.String producePrintableParadigm() {
    return "%-15s%-15s";
  }

  public synchronized java.lang.String conveyBibliography() {
    java.lang.StringBuilder b = new java.lang.StringBuilder();
    java.lang.String digFigure = null;
    double blockRough = 0.0;
    for (seng2200.Subcontract flier : this.taskSpooler) {
      digFigure = flier.canInstar().makeStabIdentify();
      blockRough = flier.produceUnansweredRemainder();
      b.append(java.lang.String.format(this.producePrintableParadigm(), digFigure, blockRough));
      b.append("\n");
    }
    return b.toString();
  }

  public synchronized int driveWorkloadFigures() {
    return this.taskSpooler.size();
  }

  private synchronized void synx30(Subcontract gruss, Subcontract uppermostProblem) {
    gruss.refresherRestPeriod(uppermostProblem.produceUnansweredRemainder());
  }
}
