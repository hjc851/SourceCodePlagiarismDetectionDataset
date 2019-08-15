package seng2200;

public class HoursCast {
  public double egress;
  public double entrances;
  public String spurPresentMention;

  public HoursCast() {
    this.spurPresentMention = ("NoName");
    this.entrances = (0);
    this.egress = (0);
  }

  public HoursCast(String impelDiscover, double entrywayPeriods, double passingMoment) {
    this.spurPresentMention = (impelDiscover);
    this.entrances = (entrywayPeriods);
    this.egress = (passingMoment);
  }

  public synchronized void fixProductivityTheatricalForename(String list) {
    this.spurPresentMention = (list);
  }

  public synchronized String takeSpurringArrangeCall() {
    return this.spurPresentMention;
  }

  public synchronized void laidEntranceClip(double day) {
    this.entrances = (day);
  }

  public synchronized void putDepartureClock(double beginning) {
    this.egress = (beginning);
  }

  public synchronized double produceRemainder() {
    return this.egress - this.entrances;
  }
}
