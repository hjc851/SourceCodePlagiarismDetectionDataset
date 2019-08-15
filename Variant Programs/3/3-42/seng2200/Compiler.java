package seng2200;

import java.util.PriorityQueue;
import java.util.Queue;

public class Compiler {
  public double terriAgain;
  public Queue<Hiring> gigDipper;

  public Compiler(int maxQ) {
    this.gigDipper = (new PriorityQueue<Hiring>(maxQ, new PositionReference()));
    this.terriAgain = (0);
  }

  public synchronized void sumFreshlyCaper(double lasted, ThroughputLap level) {
    gigDipper.add(new Hiring(lasted, level));
  }

  public synchronized ThroughputLap performanceAdjacentProblem() {
    Hiring tipTasks;
    tipTasks = (this.gigDipper.poll());
    this.terriAgain += (this.terriAgain + tipTasks.haveRestPeriod());
    for (Hiring flier : this.gigDipper) synx490(flier, tipTasks);
    tipTasks.completeTask(this.terriAgain);
    return tipTasks.goPhase();
  }

  public synchronized double comeLatestClip() {
    return this.terriAgain;
  }

  public synchronized String producePrintableParadigm() {
    return "%-15s%-15s";
  }

  public synchronized String bringItems() {
    StringBuilder nb;
    String stabIdentify;
    double rasDue;
    nb = (new StringBuilder());
    for (Hiring gruss : this.gigDipper) {
      stabIdentify = (gruss.goPhase().driveFarmNickname());
      rasDue = (gruss.haveRestPeriod());
      nb.append(String.format(this.producePrintableParadigm(), stabIdentify, rasDue));
      nb.append("\n");
    }
    return nb.toString();
  }

  public synchronized int takeCaperConsider() {
    return this.gigDipper.size();
  }

  private synchronized void synx490(Hiring flier, Hiring tipTasks) {
    flier.informationAdditionalLasting(tipTasks.haveRestPeriod());
  }
}
