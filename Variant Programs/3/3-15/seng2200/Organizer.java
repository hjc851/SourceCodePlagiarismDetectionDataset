package seng2200;

import java.util.PriorityQueue;
import java.util.Queue;
import static java.lang.String.format;

public class Organizer {
  private static final String synX1401String = "\n";
  private static final String synX1400String = "%-15s%-15s";
  public java.util.Queue<Tasks> careerPecker;
  public double mongrelClock;

  public Organizer(int maxQ) {
    this.careerPecker = (new java.util.PriorityQueue<Tasks>(maxQ, new seng2200.CaperCompared()));
    this.mongrelClock = (0);
  }

  public synchronized void extendHotWorkload(double timescale, seng2200.FilmingPlace instar) {
    careerPecker.add(new seng2200.Tasks(timescale, instar));
  }

  public synchronized seng2200.FilmingPlace operateSoonAssignment() {
    seng2200.Tasks maximumDuties = this.careerPecker.poll();
    this.mongrelClock += (maximumDuties.makeOddLasted());
    for (seng2200.Tasks flier : this.careerPecker) {
      flier.revisionOddLasted(maximumDuties.makeOddLasted());
    }
    maximumDuties.wrapPositions(this.mongrelClock);
    return maximumDuties.goPhase();
  }

  public synchronized double makeIncumbentDay() {
    return this.mongrelClock;
  }

  public synchronized java.lang.String receivePrintersTemplate() {
    return synX1400String;
  }

  public synchronized java.lang.String catchComponents() {
    java.lang.StringBuilder b = new java.lang.StringBuilder();
    java.lang.String urgingAdvert;
    double ipeKan;
    for (seng2200.Tasks gruss : this.careerPecker) {
      urgingAdvert = (gruss.goPhase().obtainUrgingAdvert());
      ipeKan = (gruss.makeOddLasted());
      b.append(format(this.receivePrintersTemplate(), urgingAdvert, ipeKan));
      b.append(synX1401String);
    }
    return b.toString();
  }

  public synchronized int goWorkTally() {
    return this.careerPecker.size();
  }
}
