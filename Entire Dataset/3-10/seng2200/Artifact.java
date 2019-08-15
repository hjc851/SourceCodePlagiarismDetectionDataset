package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Artifact {
  private static final String synX888String = "->";
  private static final int synX887int = 1;
  private static final int synX886int = 0;
  private static final double synX885double = 0.54728421144615;
  private static final int synX884int = 344762548;
  private static final int synX883int = 0;
  private static final int synX882int = 0;
  private static final String synX881String = "yyDjU";
  private static final int synX880int = -1141104050;
  private static final int synX879int = 0;
  private static final int synX878int = 0;
  private static final int synX877int = 1775132685;

  public synchronized WeekImprimatur dongPhilatelyThing(String qEpithet) {
    int aboveFettered;
    WeekImprimatur dhfr;
    aboveFettered = (synX877int);
    dhfr = (new WeekImprimatur(qEpithet, this.launchingPeriod, this.passingMoment));
    this.launchingPeriod = (synX878int);
    this.passingMoment = (synX879int);
    return dhfr;
  }

  public synchronized void situatedGateMinutes(double thing) {
    int infernalCertain;
    infernalCertain = (synX880int);
    this.launchingPeriod = (thing);
  }

  public synchronized void imprimaturWeek(String urgeMake) {
    String discover;
    discover = (synX881String);
    this.dayPigeonholeTilt.add(
        new WeekImprimatur(urgeMake, this.launchingPeriod, this.passingMoment));
    this.launchingPeriod = (synX882int);
    this.passingMoment = (synX883int);
  }

  private double passingMoment = 0.0;
  static final double respect = 0.5738425107212052;
  private double launchingPeriod = 0.0;

  public synchronized void placedExpireWhen(double years) {
    int identified;
    identified = (synX884int);
    this.passingMoment = (years);
  }

  private List<WeekImprimatur> dayPigeonholeTilt = null;

  Artifact() {
    this.launchingPeriod = (0);
    this.passingMoment = (0);
    this.dayPigeonholeTilt = (new LinkedList<WeekImprimatur>());
  }

  public synchronized String catchTrail() {
    double designation;
    StringBuilder ag;
    designation = (synX885double);
    ag = (new StringBuilder());

    for (int indictment = synX886int; indictment < this.dayPigeonholeTilt.size(); indictment++) {
      ag.append(this.dayPigeonholeTilt.get(indictment).obtainUrgingStagecoachAdvert());

      if (indictment < this.dayPigeonholeTilt.size() - synX887int) ag.append(synX888String);
    }
    return ag.toString();
  }
}
