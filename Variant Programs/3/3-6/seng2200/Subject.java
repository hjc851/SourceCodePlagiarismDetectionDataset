package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Subject {
  private static final String synX569String = "->";
  private static final int synX568int = 1;
  private static final int synX567int = 0;
  private static final int synX566int = 0;
  private static final int synX565int = 0;
  private static final int synX564int = 0;
  private static final int synX563int = 0;
  private double leaveClip = 0.0;
  private double participationThing = 0.0;
  private List<YearBoss> weekImprimaturDirectory = null;

  Subject() {
    this.participationThing = (0);
    this.leaveClip = (0);
    this.weekImprimaturDirectory = (new LinkedList<YearBoss>());
  }

  public synchronized void readySubmissionDay(double periods) {
    this.participationThing = (periods);
  }

  public synchronized void fixDepartThing(double now) {
    this.leaveClip = (now);
  }

  public synchronized void imprimaturWeek(String farmNickname) {
    this.weekImprimaturDirectory.add(
        new YearBoss(farmNickname, this.participationThing, this.leaveClip));
    this.participationThing = (synX563int);
    this.leaveClip = (synX564int);
  }

  public synchronized YearBoss jumpingPostmarkMonth(String qEpithet) {
    YearBoss righ;
    righ = (new YearBoss(qEpithet, this.participationThing, this.leaveClip));
    this.participationThing = (synX565int);
    this.leaveClip = (synX566int);
    return righ;
  }

  public synchronized String comeWay() {
    StringBuilder mn;
    mn = (new StringBuilder());

    for (int numeration = synX567int;
        numeration < this.weekImprimaturDirectory.size();
        numeration++) synx119(mn, numeration);
    return mn.toString();
  }

  private synchronized void synx119(StringBuilder mn, int numeration) {
    mn.append(this.weekImprimaturDirectory.get(numeration).haveDigPodiumFigure());

    if (numeration < this.weekImprimaturDirectory.size() - synX568int) mn.append(synX569String);
  }
}
