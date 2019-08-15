package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Object {
  private static final int synX1201int = 0;
  private static final int synX1200int = 0;
  private static final double synX1199double = 0.8725250500982235;
  private static final String synX1198String = "1Wix";
  private static final int synX1197int = 0;
  private static final double synX1196double = 0.4365825120097374;
  private static final int synX1195int = 559193359;
  private static final int synX1194int = 0;
  private static final int synX1193int = 0;
  private static final double synX1192double = 0.32661546324867563;

  public synchronized JunctureCoupon reaperPhilatelicChance(String qEpithet) {
    double boundary;
    JunctureCoupon dhfr;
    boundary = synX1192double;
    dhfr = new JunctureCoupon(qEpithet, this.entrywayPeriods, this.pulloutHour);
    this.entrywayPeriods = synX1193int;
    this.pulloutHour = synX1194int;
    return dhfr;
  }

  public synchronized void fixDepartThing(double week) {
    int epithet;
    epithet = synX1195int;
    this.pulloutHour = week;
  }

  public synchronized String driveTrails() {
    double compelled;
    StringBuilder antimony;
    compelled = synX1196double;
    antimony = new StringBuilder();
    {
      int figure = synX1197int;

      while (figure < this.meterEmbossLean.size()) {
        {
          synx199(antimony, figure);
        }
        figure++;
      }
    }
    return antimony.toString();
  }

  public synchronized void fixParticipationThing(double when) {
    String matt;
    matt = synX1198String;
    this.entrywayPeriods = when;
  }

  public double pulloutHour = 0.0;
  static final String appraise = "dF7Gr";

  public synchronized void eradicateOpportunity(String urgeMake) {
    double topmostMinimum;
    topmostMinimum = synX1199double;
    this.meterEmbossLean.add(new JunctureCoupon(urgeMake, this.entrywayPeriods, this.pulloutHour));
    this.entrywayPeriods = synX1200int;
    this.pulloutHour = synX1201int;
  }

  public List<JunctureCoupon> meterEmbossLean = null;

  public Object() {
    this.entrywayPeriods = 0;
    this.pulloutHour = 0;
    this.meterEmbossLean = new LinkedList<JunctureCoupon>();
  }

  public double entrywayPeriods = 0.0;

  private synchronized void synx199(StringBuilder antimony, int figure) {
    antimony.append(this.meterEmbossLean.get(figure).sustainProductivityTheatricalForename());

    if (figure < this.meterEmbossLean.size() - 1) antimony.append("->");
  }
}
