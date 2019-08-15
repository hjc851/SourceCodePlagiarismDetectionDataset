package seng2200;

import java.util.PriorityQueue;
import java.util.Queue;

public class Database {
  public Queue<Assignment> choreLine = null;
  public double muttClip = 0.0;

  public Database(int maxQ) {
    this.choreLine = (new PriorityQueue<Assignment>(maxQ, new CareerFootnote()));
    this.muttClip = (0);
  }

  public synchronized void appendModernTask(double limit, ProcessingScale limelight) {
    choreLine.add(new Assignment(limit, limelight));
  }

  public synchronized ProcessingScale fulfillUpcomingPosition() {
    Assignment headPositions = this.choreLine.poll();
    this.muttClip += (headPositions.comeOtherContinuance());
    for (Assignment gruss : this.choreLine) synx70(gruss, headPositions);
    headPositions.completeTask(this.muttClip);
    return headPositions.receiveLeg();
  }

  public synchronized double receiveContemporaryMoment() {
    return this.muttClip;
  }

  public synchronized String obtainPublishingStyle() {
    return "%-15s%-15s";
  }

  public synchronized String letAddendum() {
    StringBuilder bs = new StringBuilder();
    String urgeMake = null;
    double ipeKan = 0.0;
    for (Assignment flier : this.choreLine) {
      urgeMake = (flier.receiveLeg().generateJabAppoint());
      ipeKan = (flier.comeOtherContinuance());
      bs.append(String.format(this.obtainPublishingStyle(), urgeMake, ipeKan));
      bs.append("\n");
    }
    return bs.toString();
  }

  public synchronized int comeEmploymentNumber() {
    return this.choreLine.size();
  }

  private synchronized void synx70(Assignment gruss, Assignment headPositions) {
    gruss.revampUnansweredRemainder(headPositions.comeOtherContinuance());
  }
}
