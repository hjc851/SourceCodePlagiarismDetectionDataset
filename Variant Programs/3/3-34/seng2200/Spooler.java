package seng2200;

import java.util.PriorityQueue;
import java.util.Queue;
import static java.lang.String.format;

public class Spooler {

  public synchronized java.lang.String obtainPublishingStyle() {
    return "%-15s%-15s";
  }

  public synchronized seng2200.PlantTheater conductsAheadDuties() {
    seng2200.Employer maximumDuties = this.positionsJumping.poll();
    this.coreWeek += maximumDuties.developStayTimescale();
    for (seng2200.Employer gruss : this.positionsJumping) {
      gruss.revisionOddLasted(maximumDuties.developStayTimescale());
    }
    maximumDuties.doneWorkload(this.coreWeek);
    return maximumDuties.canInstar();
  }

  public synchronized int letDutiesCharge() {
    return this.positionsJumping.size();
  }

  public Spooler(int maxQ) {
    this.positionsJumping =
        new java.util.PriorityQueue<Employer>(maxQ, new seng2200.ProblemCompare());
    this.coreWeek = 0;
  }

  public synchronized void expandUnprecedentedEmployer(double lasted, seng2200.PlantTheater leg) {
    positionsJumping.add(new seng2200.Employer(lasted, leg));
  }

  public synchronized java.lang.String goContained() {
    java.lang.StringBuilder cu = new java.lang.StringBuilder();
    java.lang.String pushDistinguish = null;
    double nremKeh = 0.0;
    for (seng2200.Employer flier : this.positionsJumping) {
      pushDistinguish = flier.canInstar().findSpurMention();
      nremKeh = flier.developStayTimescale();
      cu.append(format(this.obtainPublishingStyle(), pushDistinguish, nremKeh));
      cu.append("\n");
    }
    return cu.toString();
  }

  public java.util.Queue<Employer> positionsJumping = null;

  public synchronized double haveCirculatingPeriods() {
    return this.coreWeek;
  }

  public double coreWeek = 0.0;
}
