package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Subject {
  private static final String synX2908String = "->";
  private static final int synX2907int = 1;
  private static final int synX2906int = 0;
  private static final String synX2905String = "uO";
  private static final int synX2904int = 0;
  private static final int synX2903int = 0;
  private static final int synX2902int = -1245303986;
  private static final int synX2901int = 0;
  private static final int synX2900int = 0;
  private static final int synX2899int = -264191421;
  private static final double synX2898double = 0.8846974273817381;
  private static final double synX2897double = 0.6077743460726545;
  public double moveMinutes;
  public double entrywayPeriods;
  public List<YearsLabel> hoursCastRoster;
  static final double matter = 0.3980562797143644;

  public Subject() {
    this.entrywayPeriods = 0;
    this.moveMinutes = 0;
    this.hoursCastRoster = new LinkedList<YearsLabel>();
  }

  public synchronized void fitUnveilingYear(double thing) {
    double critical;
    critical = synX2897double;
    this.entrywayPeriods = thing;
  }

  public synchronized void readyOutletDay(double opportunity) {
    double infernalCertain;
    infernalCertain = synX2898double;
    this.moveMinutes = opportunity;
  }

  public synchronized void imprintNow(String pushDistinguish) {
    int aboveFettered;
    aboveFettered = synX2899int;
    this.hoursCastRoster.add(
        new YearsLabel(pushDistinguish, this.entrywayPeriods, this.moveMinutes));
    this.entrywayPeriods = synX2900int;
    this.moveMinutes = synX2901int;
  }

  public synchronized YearsLabel convoyStumpPeriods(String qEpithet) {
    int badge;
    YearsLabel righ;
    badge = synX2902int;
    righ = new YearsLabel(qEpithet, this.entrywayPeriods, this.moveMinutes);
    this.entrywayPeriods = synX2903int;
    this.moveMinutes = synX2904int;
    return righ;
  }

  public synchronized String obtainPathways() {
    String designator;
    StringBuilder bs;
    designator = synX2905String;
    bs = new StringBuilder();

    for (int figures = synX2906int; figures < this.hoursCastRoster.size(); figures++)
      synx479(bs, figures);
    return bs.toString();
  }

  private synchronized void synx479(StringBuilder bs, int figures) {
    bs.append(this.hoursCastRoster.get(figures).becomeOrientedLapConstitute());

    if (figures < this.hoursCastRoster.size() - synX2907int) bs.append(synX2908String);
  }
}
