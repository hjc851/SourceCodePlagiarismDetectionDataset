package seng2200;

import java.util.LinkedList;
import java.util.List;

public class Section {
  private static final String synX1011String = "->";
  private static final int synX1010int = 1;
  private static final int synX1009int = 0;
  private static final int synX1008int = 0;
  private static final int synX1007int = 0;
  private static final int synX1006int = 0;
  private static final int synX1005int = 0;
  public double entranceWeek;
  public double introductionMeter;
  public List<ClockPostage> opportunityEradicateRegistry;

  public Section() {
    this.introductionMeter = (0);
    this.entranceWeek = (0);
    this.opportunityEradicateRegistry = (new LinkedList<ClockPostage>());
  }

  public synchronized void prepareAdmittanceNow(double month) {
    this.introductionMeter = (month);
  }

  public synchronized void layPassingMoment(double now) {
    this.entranceWeek = (now);
  }

  public synchronized void moldDays(String urgeMake) {
    this.opportunityEradicateRegistry.add(
        new ClockPostage(urgeMake, this.introductionMeter, this.entranceWeek));
    this.introductionMeter = (synX1005int);
    this.entranceWeek = (synX1006int);
  }

  public synchronized ClockPostage fileCastHours(String qEpithet) {
    ClockPostage dhfr;
    dhfr = (new ClockPostage(qEpithet, this.introductionMeter, this.entranceWeek));
    this.introductionMeter = (synX1007int);
    this.entranceWeek = (synX1008int);
    return dhfr;
  }

  public synchronized String arriveAvenue() {
    StringBuilder hg;
    hg = (new StringBuilder());

    for (int enumeration = synX1009int;
        enumeration < this.opportunityEradicateRegistry.size();
        enumeration++) synx179(hg, enumeration);
    return hg.toString();
  }

  private synchronized void synx179(StringBuilder hg, int enumeration) {
    hg.append(this.opportunityEradicateRegistry.get(enumeration).startFarmersPlaceSurname());

    if (enumeration < this.opportunityEradicateRegistry.size() - synX1010int)
      hg.append(synX1011String);
  }
}
