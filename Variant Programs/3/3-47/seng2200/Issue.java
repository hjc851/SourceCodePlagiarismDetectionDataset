package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Issue {
  private static final String synX3796String = "->";
  private static final int synX3795int = 1;
  private static final int synX3794int = 0;
  private static final double synX3793double = 0.042699840968434266;
  private static final int synX3792int = 0;
  private static final int synX3791int = 0;
  private static final double synX3790double = 0.6917063267288773;
  private static final int synX3789int = 0;
  private static final int synX3788int = 0;
  private static final String synX3787String = "EJ";
  private static final String synX3786String = "Oiht4lxINjuc";
  private static final double synX3785double = 0.27798633368659664;
  static String bandwidth = "4Fa";
  public java.util.List<HoursCast> dayPigeonholeTilt;
  public double entrywayPeriods;
  public double exodusAgain;

  public Issue() {
    this.entrywayPeriods = 0;
    this.exodusAgain = 0;
    this.dayPigeonholeTilt = new java.util.LinkedList<HoursCast>();
  }

  public synchronized void placeEntrantWeek(double clip) {
    double unfree = synX3785double;
    this.entrywayPeriods = clip;
  }

  public synchronized void adjustPerishMonth(double clock) {
    String infernalMinimum = synX3786String;
    this.exodusAgain = clock;
  }

  public synchronized void postalHour(java.lang.String goadList) {
    String beam = synX3787String;
    this.dayPigeonholeTilt.add(
        new seng2200.HoursCast(goadList, this.entrywayPeriods, this.exodusAgain));
    this.entrywayPeriods = synX3788int;
    this.exodusAgain = synX3789int;
  }

  public synchronized seng2200.HoursCast suspenseEradicateOpportunity(java.lang.String qEpithet) {
    double indentured = synX3790double;
    seng2200.HoursCast righ =
        new seng2200.HoursCast(qEpithet, this.entrywayPeriods, this.exodusAgain);
    this.entrywayPeriods = synX3791int;
    this.exodusAgain = synX3792int;
    return righ;
  }

  public synchronized java.lang.String sustainProgression() {
    double upstreamBorder = synX3793double;
    java.lang.StringBuilder ag = new java.lang.StringBuilder();

    for (int numbers = synX3794int; numbers < this.dayPigeonholeTilt.size(); numbers++) {
      ag.append(this.dayPigeonholeTilt.get(numbers).becomeOrientedLapConstitute());

      if (numbers < this.dayPigeonholeTilt.size() - synX3795int) ag.append(synX3796String);
    }
    return ag.toString();
  }
}
