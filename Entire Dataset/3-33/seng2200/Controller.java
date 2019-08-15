package seng2200;

import java.util.PriorityQueue;
import java.util.Queue;
import static java.lang.String.format;

public class Controller {
  private static final String synX2679String = "\n";
  private static final double synX2678double = 0.0;
  private static final String synX2677String = "%-15s%-15s";
  private static final int synX2676int = 0;

  public Controller(int maxQ) {
    this.problemBacklog = (new PriorityQueue<Legwork>(maxQ, new ProblemCompare()));
    this.mongrelClock = (synX2676int);
  }

  public Queue<Legwork> problemBacklog = null;

  public synchronized double catchRifeWhen() {
    return this.mongrelClock;
  }

  public synchronized int arrivePositionsNumbers() {
    return this.problemBacklog.size();
  }

  public synchronized void totNewfoundAssignments(double longer, ProductivityStep limelight) {
    problemBacklog.add(new Legwork(longer, limelight));
  }

  public synchronized String letInkMode() {
    return synX2677String;
  }

  public double mongrelClock = 0.0;

  public synchronized ProductivityStep operateSoonAssignment() {
    Legwork greatestTask;
    greatestTask = (this.problemBacklog.poll());
    this.mongrelClock += (this.mongrelClock + greatestTask.haveRestPeriod());
    for (Legwork gruss : this.problemBacklog) synx410(gruss, greatestTask);
    greatestTask.exitOccupations(this.mongrelClock);
    return greatestTask.obtainStagecoach();
  }

  public synchronized String goContained() {
    StringBuilder ni;
    String farmersSurname;
    double genuineMur;
    ni = (new StringBuilder());
    farmersSurname = (null);
    genuineMur = (synX2678double);
    for (Legwork flier : this.problemBacklog) {
      farmersSurname = (flier.obtainStagecoach().becomeOrientedConstitute());
      genuineMur = (flier.haveRestPeriod());
      ni.append(format(this.letInkMode(), farmersSurname, genuineMur));
      ni.append(synX2679String);
    }
    return ni.toString();
  }

  private synchronized void synx410(Legwork gruss, Legwork greatestTask) {
    gruss.informPendingTime(greatestTask.haveRestPeriod());
  }
}
