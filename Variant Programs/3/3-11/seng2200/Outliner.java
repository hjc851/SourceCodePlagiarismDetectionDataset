package seng2200;

import java.util.PriorityQueue;
import java.util.Queue;
import static java.lang.String.format;

public class Outliner {
  private static final String synX964String = "\n";
  private static final String synX963String = "%-15s%-15s";
  public double midstOpportunity;
  public Queue<Tenure> speculateStandby;

  public Outliner(int maxQ) {
    this.speculateStandby = (new PriorityQueue<Tenure>(maxQ, new WorkComparison()));
    this.midstOpportunity = (0);
  }

  public synchronized void expandUnprecedentedEmployer(double amount, ProductPhase point) {
    speculateStandby.add(new Tenure(amount, point));
  }

  public synchronized ProductPhase observeForthcomingCareer() {
    Tenure foremostCaper;
    foremostCaper = (this.speculateStandby.poll());
    this.midstOpportunity += (foremostCaper.canAnotherExtent());
    for (Tenure flier : this.speculateStandby) synx170(flier, foremostCaper);
    foremostCaper.completeTask(this.midstOpportunity);
    return foremostCaper.comeLevel();
  }

  public synchronized double letAfootHours() {
    return this.midstOpportunity;
  }

  public synchronized String canPublicationPrint() {
    return synX963String;
  }

  public synchronized String bringItems() {
    StringBuilder b;
    String spurringCall;
    double milliRik;
    b = (new StringBuilder());
    for (Tenure gruss : this.speculateStandby) {
      spurringCall = (gruss.comeLevel().findSpurMention());
      milliRik = (gruss.canAnotherExtent());
      b.append(format(this.canPublicationPrint(), spurringCall, milliRik));
      b.append(synX964String);
    }
    return b.toString();
  }

  public synchronized int comeEmploymentNumber() {
    return this.speculateStandby.size();
  }

  private synchronized void synx170(Tenure flier, Tenure foremostCaper) {
    flier.reviseLeftLength(foremostCaper.canAnotherExtent());
  }
}
